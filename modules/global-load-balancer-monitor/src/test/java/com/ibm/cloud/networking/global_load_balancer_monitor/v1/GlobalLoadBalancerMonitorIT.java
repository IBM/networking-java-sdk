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

package com.ibm.cloud.networking.global_load_balancer_monitor.v1;

import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.CreateLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorRespResult;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.EditLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.GetLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ListAllLoadBalancerMonitorsOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ListMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorPack;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ResultInfo;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the GlobalLoadBalancerMonitor service.
 */
public class GlobalLoadBalancerMonitorIT extends SdkIntegrationTestBase {
  public GlobalLoadBalancerMonitor service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;

  String identifier = null;
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
      service = GlobalLoadBalancerMonitor.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateLoadBalancerMonitor")
  public void testListAllLoadBalancerMonitors() throws Exception {
    try {
      ListAllLoadBalancerMonitorsOptions listAllLoadBalancerMonitorsOptions = new ListAllLoadBalancerMonitorsOptions();

      // Invoke operation
      Response<ListMonitorResp> response = service.listAllLoadBalancerMonitors(listAllLoadBalancerMonitorsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListMonitorResp listMonitorRespResult = response.getResult();

      assertNotNull(listMonitorRespResult);
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
      Response<MonitorResp> response = service.createLoadBalancerMonitor(createLoadBalancerMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MonitorResp monitorRespResult = response.getResult();
      identifier = monitorRespResult.getResult().getId();

      assertNotNull(monitorRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllLoadBalancerMonitors")
  public void testEditLoadBalancerMonitor() throws Exception {
    try {
      EditLoadBalancerMonitorOptions editLoadBalancerMonitorOptions = new EditLoadBalancerMonitorOptions.Builder()
      .monitorIdentifier(identifier)
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
      Response<MonitorResp> response = service.editLoadBalancerMonitor(editLoadBalancerMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MonitorResp monitorRespResult = response.getResult();

      assertNotNull(monitorRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testEditLoadBalancerMonitor")
  public void testGetLoadBalancerMonitor() throws Exception {
    try {
      GetLoadBalancerMonitorOptions getLoadBalancerMonitorOptions = new GetLoadBalancerMonitorOptions.Builder()
      .monitorIdentifier(identifier)
      .build();

      // Invoke operation
      Response<MonitorResp> response = service.getLoadBalancerMonitor(getLoadBalancerMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MonitorResp monitorRespResult = response.getResult();

      assertNotNull(monitorRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetLoadBalancerMonitor")
  public void testDeleteLoadBalancerMonitor() throws Exception {
    try {
      DeleteLoadBalancerMonitorOptions deleteLoadBalancerMonitorOptions = new DeleteLoadBalancerMonitorOptions.Builder()
      .monitorIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteMonitorResp> response = service.deleteLoadBalancerMonitor(deleteLoadBalancerMonitorOptions).execute();
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
