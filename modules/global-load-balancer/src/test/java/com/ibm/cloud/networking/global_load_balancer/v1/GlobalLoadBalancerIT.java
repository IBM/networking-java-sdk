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

package com.ibm.cloud.networking.global_load_balancer.v1;

import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolReqOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.GlobalLoadBalancerPools;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.CreateLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.GlobalLoadBalancerMonitor;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.CreateLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorRespResult;
import com.ibm.cloud.networking.global_load_balancer.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancersRespResult;
import com.ibm.cloud.networking.global_load_balancer.v1.model.EditLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.GetLoadBalancerSettingsOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ListAllLoadBalancersOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ListLoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.LoadBalancerPack;
import com.ibm.cloud.networking.global_load_balancer.v1.model.LoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ResultInfo;
import com.ibm.cloud.networking.global_load_balancer.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the GlobalLoadBalancer service.
 */
public class GlobalLoadBalancerIT extends SdkIntegrationTestBase {
  public GlobalLoadBalancer service = null;
  public GlobalLoadBalancerMonitor gbMonitorService = null;
  public GlobalLoadBalancerPools gbPoolService = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;
  
  String identifier = null;
  String mIdentifier = null;
  String pIdentifier = null;
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
    zoneIdentifier = config.get("ZONE_ID");

    // set mock values for global params
    try {
      gbMonitorService = GlobalLoadBalancerMonitor.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      gbPoolService = GlobalLoadBalancerPools.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      service = GlobalLoadBalancer.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateLoadBalancer")
  public void testListAllLoadBalancers() throws Exception {
    try {
      ListAllLoadBalancersOptions listAllLoadBalancersOptions = new ListAllLoadBalancersOptions();

      // Invoke operation
      Response<ListLoadBalancersResp> response = service.listAllLoadBalancers(listAllLoadBalancersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListLoadBalancersResp listLoadBalancersRespResult = response.getResult();

      assertNotNull(listLoadBalancersRespResult);
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
      Response<LoadBalancerPoolResp> response = gbPoolService.createLoadBalancerPool(createLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      LoadBalancerPoolResp loadBalancerPoolRespResult = response.getResult();
      pIdentifier = loadBalancerPoolRespResult.getResult().getId();
      assertNotNull(loadBalancerPoolRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreateLoadBalancerPool")
  public void testCreateLoadBalancer() throws Exception {
    try {
      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
      .name("example.java.sdk.cistest-load.com")
      .fallbackPool(pIdentifier)
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList(pIdentifier)))
      .description("Load Balancer for cistest-load.com")
      .ttl(Long.valueOf("1"))
      .proxied(false)
      .enabled(false)
      .sessionAffinity("ip_cookie")
      .steeringPolicy("dynamic_latency")
      .build();

      // Invoke operation
      Response<LoadBalancersResp> response = service.createLoadBalancer(createLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancersResp loadBalancersRespResult = response.getResult();

      identifier = loadBalancersRespResult.getResult().getId();

      assertNotNull(loadBalancersRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllLoadBalancers")
  public void testEditLoadBalancer() throws Exception {
    try {
      EditLoadBalancerOptions editLoadBalancerOptions = new EditLoadBalancerOptions.Builder()
      .loadBalancerIdentifier(identifier)
      .name("example.java.sdk.cistest-load.com")
      .fallbackPool(pIdentifier)
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList(pIdentifier)))
      .description("Load Balancer for www.example.com")
      .ttl(Long.valueOf("30"))
      .proxied(true)
      .enabled(true)
      .sessionAffinity("ip_cookie")
      .steeringPolicy("dynamic_latency")
      .build();

      // Invoke operation
      Response<LoadBalancersResp> response = service.editLoadBalancer(editLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancersResp loadBalancersRespResult = response.getResult();

      assertNotNull(loadBalancersRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testEditLoadBalancer")
  public void testGetLoadBalancerSettings() throws Exception {
    try {
      GetLoadBalancerSettingsOptions getLoadBalancerSettingsOptions = new GetLoadBalancerSettingsOptions.Builder()
      .loadBalancerIdentifier(identifier)
      .build();

      // Invoke operation
      Response<LoadBalancersResp> response = service.getLoadBalancerSettings(getLoadBalancerSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancersResp loadBalancersRespResult = response.getResult();

      assertNotNull(loadBalancersRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetLoadBalancerSettings")
  public void testDeleteLoadBalancer() throws Exception {
    try {
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
      .loadBalancerIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteLoadBalancersResp> response = service.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteLoadBalancersResp deleteLoadBalancersRespResult = response.getResult();

      assertNotNull(deleteLoadBalancersRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeleteLoadBalancer")
  public void testDeleteLoadBalancerPool() throws Exception {
    try {
      DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions = new DeleteLoadBalancerPoolOptions.Builder()
      .poolIdentifier(pIdentifier)
      .build(); 
      // Invoke operation
      Response<DeleteLoadBalancerPoolResp> response = gbPoolService.deleteLoadBalancerPool(deleteLoadBalancerPoolOptions).execute();
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
