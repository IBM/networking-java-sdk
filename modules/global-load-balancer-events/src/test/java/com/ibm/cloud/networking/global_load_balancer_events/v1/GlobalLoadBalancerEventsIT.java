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

package com.ibm.cloud.networking.global_load_balancer_events.v1;

import com.ibm.cloud.networking.global_load_balancer_events.v1.model.GetLoadBalancerEventsOptions;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsResp;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultInfo;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultItem;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultItemOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultItemPoolItem;
import com.ibm.cloud.networking.global_load_balancer_events.v1.utils.TestUtilities;
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
 * Integration test class for the GlobalLoadBalancerEvents service.
 */
public class GlobalLoadBalancerEventsIT extends SdkIntegrationTestBase {
  public GlobalLoadBalancerEvents service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
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
      service = GlobalLoadBalancerEvents.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test
  public void testGetLoadBalancerEvents() throws Exception {
    try {
      GetLoadBalancerEventsOptions getLoadBalancerEventsOptions = new GetLoadBalancerEventsOptions();

      // Invoke operation
      Response<ListEventsResp> response = service.getLoadBalancerEvents(getLoadBalancerEventsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListEventsResp listEventsRespResult = response.getResult();

      assertNotNull(listEventsRespResult);
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
