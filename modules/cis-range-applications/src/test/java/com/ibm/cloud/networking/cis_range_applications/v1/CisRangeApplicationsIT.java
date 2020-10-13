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

package com.ibm.cloud.networking.cis_range_applications.v1;

import com.ibm.cloud.networking.cis_range_applications.v1.model.CreateRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.DeleteRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.GetRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.ListRangeAppsOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqEdgeIps;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqOriginDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationObject;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationObjectDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationObjectEdgeIps;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationResp;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplications;
import com.ibm.cloud.networking.cis_range_applications.v1.model.UpdateRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.utils.TestUtilities;
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
 * Integration test class for the CisRangeApplications service.
 */
public class CisRangeApplicationsIT extends SdkIntegrationTestBase {
  public CisRangeApplications service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;
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
    zoneIdentifier = config.get("ZONE_ID");

    // set mock values for global params
    try {
      service = CisRangeApplications.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateRangeApp")
  public void testListRangeApps() throws Exception {
    try {
      ListRangeAppsOptions listRangeAppsOptions = new ListRangeAppsOptions.Builder()
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("1"))
      .order("protocol")
      .direction("asc")
      .build();

      // Invoke operation
      Response<RangeApplications> response = service.listRangeApps(listRangeAppsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RangeApplications rangeApplicationsResult = response.getResult();

      assertNotNull(rangeApplicationsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateRangeApp() throws Exception {
    try {
      RangeAppReqDns rangeAppReqDnsModel = new RangeAppReqDns.Builder()
      .type("CNAME")
      .name("ssh.example.com")
      .build();

      RangeAppReqEdgeIps rangeAppReqEdgeIpsModel = new RangeAppReqEdgeIps.Builder()
      .type("dynamic")
      .connectivity("all")
      .build();

      CreateRangeAppOptions createRangeAppOptions = new CreateRangeAppOptions.Builder()
      .protocol("tcp/22")
      .dns(rangeAppReqDnsModel)
      .originDirect(new java.util.ArrayList<String>(java.util.Arrays.asList("tcp://12.1.1.1:22")))
      .originPort(Long.valueOf("22"))
      .ipFirewall(true)
      .proxyProtocol("off")
      .edgeIps(rangeAppReqEdgeIpsModel)
      .trafficType("direct")
      .tls("off")
      .build();

      // Invoke operation
      Response<RangeApplicationResp> response = service.createRangeApp(createRangeAppOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RangeApplicationResp rangeApplicationRespResult = response.getResult();

      assertNotNull(rangeApplicationRespResult);
      identifier = rangeApplicationRespResult.getResult().getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateRangeApp")
  public void testGetRangeApp() throws Exception {
    try {
      GetRangeAppOptions getRangeAppOptions = new GetRangeAppOptions.Builder()
      .appIdentifier(identifier)
      .build();

      // Invoke operation
      Response<RangeApplicationResp> response = service.getRangeApp(getRangeAppOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RangeApplicationResp rangeApplicationRespResult = response.getResult();

      assertNotNull(rangeApplicationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListRangeApps")
  public void testUpdateRangeApp() throws Exception {
    try {
      RangeAppReqDns rangeAppReqDnsModel = new RangeAppReqDns.Builder()
      .type("CNAME")
      .name("ssh.example.com")
      .build();

      RangeAppReqEdgeIps rangeAppReqEdgeIpsModel = new RangeAppReqEdgeIps.Builder()
      .type("dynamic")
      .connectivity("all")
      .build();

      UpdateRangeAppOptions updateRangeAppOptions = new UpdateRangeAppOptions.Builder()
      .appIdentifier(identifier)
      .protocol("tcp/22")
      .dns(rangeAppReqDnsModel)
      .originDirect(new java.util.ArrayList<String>(java.util.Arrays.asList("tcp://12.1.1.1:22")))
      .originPort(Long.valueOf("22"))
      .ipFirewall(true)
      .proxyProtocol("off")
      .edgeIps(rangeAppReqEdgeIpsModel)
      .trafficType("direct")
      .tls("off")
      .build();

      // Invoke operation
      Response<RangeApplicationResp> response = service.updateRangeApp(updateRangeAppOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RangeApplicationResp rangeApplicationRespResult = response.getResult();

      assertNotNull(rangeApplicationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetRangeApp")
  public void testDeleteRangeApp() throws Exception {
    try {
      DeleteRangeAppOptions deleteRangeAppOptions = new DeleteRangeAppOptions.Builder()
      .appIdentifier(identifier)
      .build();

      // Invoke operation
      Response<RangeApplicationResp> response = service.deleteRangeApp(deleteRangeAppOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RangeApplicationResp rangeApplicationRespResult = response.getResult();

      assertNotNull(rangeApplicationRespResult);
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
