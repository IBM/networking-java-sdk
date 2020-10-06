/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.networking.global_load_balancer_pools.v0;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.GlobalLoadBalancerMonitor;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.CreateLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorRespResult;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.CreateLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.EditLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.GetLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ListAllLoadBalancerPoolsOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ListLoadBalancerPoolsResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolReqOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
/**
 * Integration test class for the GlobalLoadBalancerPools service.
 */
public class GlobalLoadBalancerPoolsIT extends SdkIntegrationTestBase {
  public GlobalLoadBalancerPools service = null;
  public GlobalLoadBalancerMonitor gbMonitorService = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  String crn = null;
  String identifier = null;
  String mIdentifier = null;
  /**
   * This method provides our config filename to the base class.
   */
  public String getConfigFilename() {
    return "../../cloud_internet_services.env";
  }
  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }
    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    // set mock values for global params
    try {
      gbMonitorService = GlobalLoadBalancerMonitor.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      service = GlobalLoadBalancerPools.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }
  @Test (dependsOnMethods = "testCreateLoadBalancerPool")
  public void testListAllLoadBalancerPools() throws Exception {
    try {
      ListAllLoadBalancerPoolsOptions listAllLoadBalancerPoolsOptions = new ListAllLoadBalancerPoolsOptions();
      // Invoke operation
      Response<ListLoadBalancerPoolsResp> response = service.listAllLoadBalancerPools(listAllLoadBalancerPoolsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      ListLoadBalancerPoolsResp listLoadBalancerPoolsRespResult = response.getResult();
      assertNotNull(listLoadBalancerPoolsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test
  public void testCreateLoadBalancerMonitor() throws Exception {
    try {
      CreateLoadBalancerMonitorOptions createLoadBalancerMonitorOptions = new CreateLoadBalancerMonitorOptions.Builder()
      .type("http")
      .description("Login page monitor")
      .method("GET")
      .port(Long.valueOf("8080"))
      .path("/")
      .timeout(Long.valueOf("5"))
      .retries(Long.valueOf("2"))
      .interval(Long.valueOf("60"))
      .expectedCodes("2xx")
      .followRedirects(true)
      .expectedBody("alive")
      .allowInsecure(true)
      .build();
      // Invoke operation
      Response<MonitorResp> response = gbMonitorService.createLoadBalancerMonitor(createLoadBalancerMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      MonitorResp monitorRespResult = response.getResult();
      mIdentifier = monitorRespResult.getResult().getId();
      assertNotNull(monitorRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test (dependsOnMethods = "testCreateLoadBalancerMonitor")
  public void testCreateLoadBalancerPool() throws Exception {
    try {
      LoadBalancerPoolReqOriginsItem loadBalancerPoolReqOriginsItemModel = new LoadBalancerPoolReqOriginsItem.Builder()
      .name("app-server-1")
      .address("www.test.com")
      .enabled(true)
      .build();
      CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions = new CreateLoadBalancerPoolOptions.Builder()
      .name("primary-dc-1")
      .checkRegions(new java.util.ArrayList<String>(java.util.Arrays.asList("WEU")))
      .origins(new java.util.ArrayList<LoadBalancerPoolReqOriginsItem>(java.util.Arrays.asList(loadBalancerPoolReqOriginsItemModel)))
      .description("Primary data center - Provider XYZ")
      .minimumOrigins(Long.valueOf("1"))
      .enabled(true)
      .monitor(mIdentifier)
      .notificationEmail("someone@example.com")
      .build();
      // Invoke operation
      Response<LoadBalancerPoolResp> response = service.createLoadBalancerPool(createLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      LoadBalancerPoolResp loadBalancerPoolRespResult = response.getResult();
      identifier = loadBalancerPoolRespResult.getResult().getId();
      assertNotNull(loadBalancerPoolRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test (dependsOnMethods = "testListAllLoadBalancerPools")
  public void testGetLoadBalancerPool() throws Exception {
    try {
      GetLoadBalancerPoolOptions getLoadBalancerPoolOptions = new GetLoadBalancerPoolOptions.Builder()
      .poolIdentifier(identifier)
      .build();
      // Invoke operation
      Response<LoadBalancerPoolResp> response = service.getLoadBalancerPool(getLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      LoadBalancerPoolResp loadBalancerPoolRespResult = response.getResult();
      assertNotNull(loadBalancerPoolRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test (dependsOnMethods = "testGetLoadBalancerPool")
  public void testEditLoadBalancerPool() throws Exception {
    try {
      LoadBalancerPoolReqOriginsItem loadBalancerPoolReqOriginsItemModel = new LoadBalancerPoolReqOriginsItem.Builder()
      .name("app-server-1")
      .address("www.test.com")
      .enabled(true)
      .build();
      EditLoadBalancerPoolOptions editLoadBalancerPoolOptions = new EditLoadBalancerPoolOptions.Builder()
      .poolIdentifier(identifier)
      .name("primary-dc-1")
      .checkRegions(new java.util.ArrayList<String>(java.util.Arrays.asList("WEU")))
      .origins(new java.util.ArrayList<LoadBalancerPoolReqOriginsItem>(java.util.Arrays.asList(loadBalancerPoolReqOriginsItemModel)))
      .description("Primary data center - Provider XYZ")
      .minimumOrigins(Long.valueOf("1"))
      .enabled(true)
      .monitor(mIdentifier)
      .notificationEmail("someone@example.com")
      .build();
      // Invoke operation
      Response<LoadBalancerPoolResp> response = service.editLoadBalancerPool(editLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      LoadBalancerPoolResp loadBalancerPoolRespResult = response.getResult();
      assertNotNull(loadBalancerPoolRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testEditLoadBalancerPool")
  public void testDeleteLoadBalancerPool() throws Exception {
    try {
      DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions = new DeleteLoadBalancerPoolOptions.Builder()
      .poolIdentifier(identifier)
      .build();
      // Invoke operation
      Response<DeleteLoadBalancerPoolResp> response = service.deleteLoadBalancerPool(deleteLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      DeleteLoadBalancerPoolResp deleteLoadBalancerPoolRespResult = response.getResult();
      assertNotNull(deleteLoadBalancerPoolRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeleteLoadBalancerPool")
  public void testDeleteLoadBalancerMonitor() throws Exception {
    try {
      DeleteLoadBalancerMonitorOptions deleteLoadBalancerMonitorOptions = new DeleteLoadBalancerMonitorOptions.Builder()
      .monitorIdentifier(mIdentifier)
      .build();

      // Invoke operation
      Response<DeleteMonitorResp> response = gbMonitorService.deleteLoadBalancerMonitor(deleteLoadBalancerMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteMonitorResp deleteMonitorRespResult = response.getResult();

      assertNotNull(deleteMonitorRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
