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

package com.ibm.cloud.networking.dns_records.v1;

import com.ibm.cloud.networking.dns_records.v1.model.CreateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordRespResult;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordDetails;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.GetDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.ListAllDnsRecordsOptions;
import com.ibm.cloud.networking.dns_records.v1.model.ListDnsrecordsResp;
import com.ibm.cloud.networking.dns_records.v1.model.ResultInfo;
import com.ibm.cloud.networking.dns_records.v1.model.UpdateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
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
 * Integration test class for the DnsRecords service.
 */
public class DnsRecordsIT extends SdkIntegrationTestBase {
  public DnsRecords service = null;
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
      service = DnsRecords.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test
  public void testCreateDnsRecord() throws Exception {
    try {
      CreateDnsRecordOptions createDnsRecordOptions = new CreateDnsRecordOptions.Builder()
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .build();

      // Invoke operation
      Response<DnsrecordResp> response = service.createDnsRecord(createDnsRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DnsrecordResp dnsrecordRespResult = response.getResult();
      identifier = dnsrecordRespResult.getResult().getId();

      assertNotNull(dnsrecordRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreateDnsRecord")
  public void testGetDnsRecord() throws Exception {
    try {
      GetDnsRecordOptions getDnsRecordOptions = new GetDnsRecordOptions.Builder()
      .dnsrecordIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DnsrecordResp> response = service.getDnsRecord(getDnsRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DnsrecordResp dnsrecordRespResult = response.getResult();

      assertNotNull(dnsrecordRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetDnsRecord")
  public void testUpdateDnsRecord() throws Exception {
    try {
      UpdateDnsRecordOptions updateDnsRecordOptions = new UpdateDnsRecordOptions.Builder()
      .dnsrecordIdentifier(identifier)
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .proxied(false)
      .build();

      // Invoke operation
      Response<DnsrecordResp> response = service.updateDnsRecord(updateDnsRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DnsrecordResp dnsrecordRespResult = response.getResult();

      assertNotNull(dnsrecordRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateDnsRecord")
  public void testListAllDnsRecords() throws Exception {
    try {
      ListAllDnsRecordsOptions listAllDnsRecordsOptions = new ListAllDnsRecordsOptions.Builder()
      .type("testString")
      .name("host1.test-example.com")
      .content("1.2.3.4")
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .order("type")
      .direction("asc")
      .match("any")
      .build();
      
      // Invoke operation
      Response<ListDnsrecordsResp> response = service.listAllDnsRecords(listAllDnsRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      
      ListDnsrecordsResp listDnsrecordsRespResult = response.getResult();
      
      assertNotNull(listDnsrecordsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllDnsRecords")
  public void testDeleteDnsRecord() throws Exception {
    try {
      DeleteDnsRecordOptions deleteDnsRecordOptions = new DeleteDnsRecordOptions.Builder()
      .dnsrecordIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteDnsrecordResp> response = service.deleteDnsRecord(deleteDnsRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteDnsrecordResp deleteDnsrecordRespResult = response.getResult();

      assertNotNull(deleteDnsrecordRespResult);
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
