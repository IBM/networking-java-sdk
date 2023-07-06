/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.networking.dns_svcs.v1;

import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequest;
import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequestRequestor;
import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequestsList;
import com.ibm.cloud.networking.dns_svcs.v1.model.AddCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.AzPoolsItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLzPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateSecondaryZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CustomResolver;
import com.ibm.cloud.networking.dns_svcs.v1.model.CustomResolverList;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLzPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteSecondaryZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.Dnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.DnszoneAccessRequestsPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.DnszonesPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.ExportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRule;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRuleList;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRulesPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneAccessRequestOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLinkedPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetSecondaryZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsResp;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedDnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedDnszoneLinkedTo;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedDnszonesList;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedZonesPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListCustomResolversOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszoneAccessRequestsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszones;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszonesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListForwardingRulesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLinkedPermittedNetworksOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLinkedZonesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLoadBalancers;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLoadBalancersOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListMonitors;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListMonitorsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPermittedNetworks;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPermittedNetworksOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPools;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPoolsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListResourceRecords;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListSecondaryZonesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancer;
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancersPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.Location;
import com.ibm.cloud.networking.dns_svcs.v1.model.LocationInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.model.MonitorsPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.Origin;
import com.ibm.cloud.networking.dns_svcs.v1.model.OriginInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.PaginationRef;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetwork;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetworkVpc;
import com.ibm.cloud.networking.dns_svcs.v1.model.Pool;
import com.ibm.cloud.networking.dns_svcs.v1.model.PoolHealthcheckVsisItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.PoolsPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordStatsByType;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordsImportErrorModel;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordsImportErrorModelError;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordsImportMessageModel;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdata;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataARecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataAaaaRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataCnameRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataMxRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataPtrRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataSrvRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataTxtRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdata;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataARecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataAaaaRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataCnameRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataMxRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataPtrRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataSrvRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataTxtRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordsPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.SecondaryZone;
import com.ibm.cloud.networking.dns_svcs.v1.model.SecondaryZoneList;
import com.ibm.cloud.networking.dns_svcs.v1.model.SecondaryZonesPager;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCrLocationsOrderOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneAccessRequestOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateSecondaryZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the DnsSvcs service.
 */
public class DnsSvcsIT extends SdkIntegrationTestBase {
  public DnsSvcs service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../dns_svcs_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = DnsSvcs.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(DnsSvcs.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testListDnszones() throws Exception {
    try {
      ListDnszonesOptions listDnszonesOptions = new ListDnszonesOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .vpcId("testString")
        .build();

      // Invoke operation
      Response<ListDnszones> response = service.listDnszones(listDnszonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListDnszones listDnszonesResult = response.getResult();

      assertNotNull(listDnszonesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDnszones" })
  public void testListDnszonesWithPager() throws Exception {
    try {
      ListDnszonesOptions options = new ListDnszonesOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .vpcId("testString")
        .build();

      // Test getNext().
      List<Dnszone> allResults = new ArrayList<>();
      DnszonesPager pager = new DnszonesPager(service, options);
      while (pager.hasNext()) {
        List<Dnszone> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DnszonesPager(service, options);
      List<Dnszone> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDnszones" })
  public void testCreateDnszone() throws Exception {
    try {
      CreateDnszoneOptions createDnszoneOptions = new CreateDnszoneOptions.Builder()
        .instanceId("testString")
        .name("example.com")
        .description("The DNS zone is used for VPCs in us-east region")
        .label("us-east")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Dnszone> response = service.createDnszone(createDnszoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Dnszone dnszoneResult = response.getResult();

      assertNotNull(dnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDnszone" })
  public void testGetDnszone() throws Exception {
    try {
      GetDnszoneOptions getDnszoneOptions = new GetDnszoneOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Dnszone> response = service.getDnszone(getDnszoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Dnszone dnszoneResult = response.getResult();

      assertNotNull(dnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDnszone" })
  public void testUpdateDnszone() throws Exception {
    try {
      UpdateDnszoneOptions updateDnszoneOptions = new UpdateDnszoneOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .description("The DNS zone is used for VPCs in us-east region")
        .label("us-east")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Dnszone> response = service.updateDnszone(updateDnszoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Dnszone dnszoneResult = response.getResult();

      assertNotNull(dnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDnszone" })
  public void testListResourceRecords() throws Exception {
    try {
      ListResourceRecordsOptions listResourceRecordsOptions = new ListResourceRecordsOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .type("A")
        .name("www.example.com")
        .build();

      // Invoke operation
      Response<ListResourceRecords> response = service.listResourceRecords(listResourceRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListResourceRecords listResourceRecordsResult = response.getResult();

      assertNotNull(listResourceRecordsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListResourceRecords" })
  public void testListResourceRecordsWithPager() throws Exception {
    try {
      ListResourceRecordsOptions options = new ListResourceRecordsOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .type("A")
        .name("www.example.com")
        .build();

      // Test getNext().
      List<ResourceRecord> allResults = new ArrayList<>();
      ResourceRecordsPager pager = new ResourceRecordsPager(service, options);
      while (pager.hasNext()) {
        List<ResourceRecord> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ResourceRecordsPager(service, options);
      List<ResourceRecord> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListResourceRecords" })
  public void testCreateResourceRecord() throws Exception {
    try {
      ResourceRecordInputRdataRdataARecord resourceRecordInputRdataModel = new ResourceRecordInputRdataRdataARecord.Builder()
        .ip("10.110.201.214")
        .build();

      CreateResourceRecordOptions createResourceRecordOptions = new CreateResourceRecordOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .name("test.example.com")
        .type("SRV")
        .rdata(resourceRecordInputRdataModel)
        .ttl(Long.valueOf("120"))
        .service("_sip")
        .protocol("udp")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ResourceRecord> response = service.createResourceRecord(createResourceRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResourceRecord resourceRecordResult = response.getResult();

      assertNotNull(resourceRecordResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateResourceRecord" })
  public void testGetResourceRecord() throws Exception {
    try {
      GetResourceRecordOptions getResourceRecordOptions = new GetResourceRecordOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .recordId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ResourceRecord> response = service.getResourceRecord(getResourceRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResourceRecord resourceRecordResult = response.getResult();

      assertNotNull(resourceRecordResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetResourceRecord" })
  public void testUpdateResourceRecord() throws Exception {
    try {
      ResourceRecordUpdateInputRdataRdataARecord resourceRecordUpdateInputRdataModel = new ResourceRecordUpdateInputRdataRdataARecord.Builder()
        .ip("10.110.201.214")
        .build();

      UpdateResourceRecordOptions updateResourceRecordOptions = new UpdateResourceRecordOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .recordId("testString")
        .name("test.example.com")
        .rdata(resourceRecordUpdateInputRdataModel)
        .ttl(Long.valueOf("120"))
        .service("_sip")
        .protocol("udp")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ResourceRecord> response = service.updateResourceRecord(updateResourceRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResourceRecord resourceRecordResult = response.getResult();

      assertNotNull(resourceRecordResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateResourceRecord" })
  public void testExportResourceRecords() throws Exception {
    try {
      ExportResourceRecordsOptions exportResourceRecordsOptions = new ExportResourceRecordsOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.exportResourceRecords(exportResourceRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testExportResourceRecords" })
  public void testImportResourceRecords() throws Exception {
    try {
      ImportResourceRecordsOptions importResourceRecordsOptions = new ImportResourceRecordsOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .file(TestUtilities.createMockStream("This is a mock file."))
        .fileContentType("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ImportResourceRecordsResp> response = service.importResourceRecords(importResourceRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImportResourceRecordsResp importResourceRecordsRespResult = response.getResult();

      assertNotNull(importResourceRecordsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testImportResourceRecords" })
  public void testListPermittedNetworks() throws Exception {
    try {
      ListPermittedNetworksOptions listPermittedNetworksOptions = new ListPermittedNetworksOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .accounts("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ListPermittedNetworks> response = service.listPermittedNetworks(listPermittedNetworksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPermittedNetworks listPermittedNetworksResult = response.getResult();

      assertNotNull(listPermittedNetworksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPermittedNetworks" })
  public void testCreatePermittedNetwork() throws Exception {
    try {
      PermittedNetworkVpc permittedNetworkVpcModel = new PermittedNetworkVpc.Builder()
        .vpcCrn("crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6")
        .build();

      CreatePermittedNetworkOptions createPermittedNetworkOptions = new CreatePermittedNetworkOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .type("vpc")
        .permittedNetwork(permittedNetworkVpcModel)
        .accounts("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<PermittedNetwork> response = service.createPermittedNetwork(createPermittedNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PermittedNetwork permittedNetworkResult = response.getResult();

      assertNotNull(permittedNetworkResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePermittedNetwork" })
  public void testGetPermittedNetwork() throws Exception {
    try {
      GetPermittedNetworkOptions getPermittedNetworkOptions = new GetPermittedNetworkOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .permittedNetworkId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<PermittedNetwork> response = service.getPermittedNetwork(getPermittedNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PermittedNetwork permittedNetworkResult = response.getResult();

      assertNotNull(permittedNetworkResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPermittedNetwork" })
  public void testListLoadBalancers() throws Exception {
    try {
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<ListLoadBalancers> response = service.listLoadBalancers(listLoadBalancersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListLoadBalancers listLoadBalancersResult = response.getResult();

      assertNotNull(listLoadBalancersResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancers" })
  public void testListLoadBalancersWithPager() throws Exception {
    try {
      ListLoadBalancersOptions options = new ListLoadBalancersOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<LoadBalancer> allResults = new ArrayList<>();
      LoadBalancersPager pager = new LoadBalancersPager(service, options);
      while (pager.hasNext()) {
        List<LoadBalancer> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new LoadBalancersPager(service, options);
      List<LoadBalancer> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancers" })
  public void testCreateLoadBalancer() throws Exception {
    try {
      AzPoolsItem azPoolsItemModel = new AzPoolsItem.Builder()
        .availabilityZone("us-south-1")
        .pools(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d"))
        .build();

      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .name("glb.example.com")
        .description("Load balancer for glb.example.com.")
        .enabled(true)
        .ttl(Long.valueOf("120"))
        .fallbackPool("24ccf79a-4ae0-4769-b4c8-17f8f230072e")
        .defaultPools(java.util.Arrays.asList("24ccf79a-4ae0-4769-b4c8-17f8f230072e", "13fa7d9e-aeff-4e14-8300-58021db9ee74"))
        .azPools(java.util.Arrays.asList(azPoolsItemModel))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancer> response = service.createLoadBalancer(createLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancer" })
  public void testGetLoadBalancer() throws Exception {
    try {
      GetLoadBalancerOptions getLoadBalancerOptions = new GetLoadBalancerOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .lbId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancer> response = service.getLoadBalancer(getLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancer" })
  public void testUpdateLoadBalancer() throws Exception {
    try {
      AzPoolsItem azPoolsItemModel = new AzPoolsItem.Builder()
        .availabilityZone("us-south-1")
        .pools(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d"))
        .build();

      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .lbId("testString")
        .name("glb.example.com")
        .description("Load balancer for glb.example.com.")
        .enabled(true)
        .ttl(Long.valueOf("120"))
        .fallbackPool("24ccf79a-4ae0-4769-b4c8-17f8f230072e")
        .defaultPools(java.util.Arrays.asList("24ccf79a-4ae0-4769-b4c8-17f8f230072e", "13fa7d9e-aeff-4e14-8300-58021db9ee74"))
        .azPools(java.util.Arrays.asList(azPoolsItemModel))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancer> response = service.updateLoadBalancer(updateLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancer" })
  public void testListPools() throws Exception {
    try {
      ListPoolsOptions listPoolsOptions = new ListPoolsOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<ListPools> response = service.listPools(listPoolsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPools listPoolsResult = response.getResult();

      assertNotNull(listPoolsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPools" })
  public void testListPoolsWithPager() throws Exception {
    try {
      ListPoolsOptions options = new ListPoolsOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<Pool> allResults = new ArrayList<>();
      PoolsPager pager = new PoolsPager(service, options);
      while (pager.hasNext()) {
        List<Pool> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PoolsPager(service, options);
      List<Pool> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPools" })
  public void testCreatePool() throws Exception {
    try {
      OriginInput originInputModel = new OriginInput.Builder()
        .name("app-server-1")
        .description("description of the origin server")
        .address("10.10.16.8")
        .enabled(true)
        .build();

      CreatePoolOptions createPoolOptions = new CreatePoolOptions.Builder()
        .instanceId("testString")
        .name("dal10-az-pool")
        .description("Load balancer pool for dal10 availability zone.")
        .enabled(true)
        .healthyOriginsThreshold(Long.valueOf("1"))
        .origins(java.util.Arrays.asList(originInputModel))
        .monitor("7dd6841c-264e-11ea-88df-062967242a6a")
        .notificationChannel("https://mywebsite.com/dns/webhook")
        .healthcheckRegion("us-south")
        .healthcheckSubnets(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Pool> response = service.createPool(createPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Pool poolResult = response.getResult();

      assertNotNull(poolResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePool" })
  public void testGetPool() throws Exception {
    try {
      GetPoolOptions getPoolOptions = new GetPoolOptions.Builder()
        .instanceId("testString")
        .poolId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Pool> response = service.getPool(getPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Pool poolResult = response.getResult();

      assertNotNull(poolResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPool" })
  public void testUpdatePool() throws Exception {
    try {
      OriginInput originInputModel = new OriginInput.Builder()
        .name("app-server-1")
        .description("description of the origin server")
        .address("10.10.16.8")
        .enabled(true)
        .build();

      UpdatePoolOptions updatePoolOptions = new UpdatePoolOptions.Builder()
        .instanceId("testString")
        .poolId("testString")
        .name("dal10-az-pool")
        .description("Load balancer pool for dal10 availability zone.")
        .enabled(true)
        .healthyOriginsThreshold(Long.valueOf("1"))
        .origins(java.util.Arrays.asList(originInputModel))
        .monitor("7dd6841c-264e-11ea-88df-062967242a6a")
        .notificationChannel("https://mywebsite.com/dns/webhook")
        .healthcheckRegion("us-south")
        .healthcheckSubnets(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Pool> response = service.updatePool(updatePoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Pool poolResult = response.getResult();

      assertNotNull(poolResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePool" })
  public void testListMonitors() throws Exception {
    try {
      ListMonitorsOptions listMonitorsOptions = new ListMonitorsOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<ListMonitors> response = service.listMonitors(listMonitorsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListMonitors listMonitorsResult = response.getResult();

      assertNotNull(listMonitorsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMonitors" })
  public void testListMonitorsWithPager() throws Exception {
    try {
      ListMonitorsOptions options = new ListMonitorsOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<Monitor> allResults = new ArrayList<>();
      MonitorsPager pager = new MonitorsPager(service, options);
      while (pager.hasNext()) {
        List<Monitor> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new MonitorsPager(service, options);
      List<Monitor> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMonitors" })
  public void testCreateMonitor() throws Exception {
    try {
      HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
        .name("Host")
        .value(java.util.Arrays.asList("origin.example.com"))
        .build();

      CreateMonitorOptions createMonitorOptions = new CreateMonitorOptions.Builder()
        .instanceId("testString")
        .name("healthcheck-monitor")
        .description("Load balancer monitor for glb.example.com.")
        .type("HTTPS")
        .port(Long.valueOf("8080"))
        .interval(Long.valueOf("60"))
        .retries(Long.valueOf("2"))
        .timeout(Long.valueOf("5"))
        .method("GET")
        .path("/health")
        .headers(java.util.Arrays.asList(healthcheckHeaderModel))
        .allowInsecure(false)
        .expectedCodes("200")
        .expectedBody("alive")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Monitor> response = service.createMonitor(createMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Monitor monitorResult = response.getResult();

      assertNotNull(monitorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMonitor" })
  public void testGetMonitor() throws Exception {
    try {
      GetMonitorOptions getMonitorOptions = new GetMonitorOptions.Builder()
        .instanceId("testString")
        .monitorId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Monitor> response = service.getMonitor(getMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Monitor monitorResult = response.getResult();

      assertNotNull(monitorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMonitor" })
  public void testUpdateMonitor() throws Exception {
    try {
      HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
        .name("Host")
        .value(java.util.Arrays.asList("origin.example.com"))
        .build();

      UpdateMonitorOptions updateMonitorOptions = new UpdateMonitorOptions.Builder()
        .instanceId("testString")
        .monitorId("testString")
        .name("healthcheck-monitor")
        .description("Load balancer monitor for glb.example.com.")
        .type("HTTPS")
        .port(Long.valueOf("8080"))
        .interval(Long.valueOf("60"))
        .retries(Long.valueOf("2"))
        .timeout(Long.valueOf("5"))
        .method("GET")
        .path("/health")
        .headers(java.util.Arrays.asList(healthcheckHeaderModel))
        .allowInsecure(false)
        .expectedCodes("200")
        .expectedBody("alive")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Monitor> response = service.updateMonitor(updateMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Monitor monitorResult = response.getResult();

      assertNotNull(monitorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateMonitor" })
  public void testListCustomResolvers() throws Exception {
    try {
      ListCustomResolversOptions listCustomResolversOptions = new ListCustomResolversOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<CustomResolverList> response = service.listCustomResolvers(listCustomResolversOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomResolverList customResolverListResult = response.getResult();

      assertNotNull(customResolverListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListCustomResolvers" })
  public void testCreateCustomResolver() throws Exception {
    try {
      LocationInput locationInputModel = new LocationInput.Builder()
        .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
        .enabled(false)
        .build();

      CreateCustomResolverOptions createCustomResolverOptions = new CreateCustomResolverOptions.Builder()
        .instanceId("testString")
        .name("my-resolver")
        .description("custom resolver")
        .locations(java.util.Arrays.asList(locationInputModel))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<CustomResolver> response = service.createCustomResolver(createCustomResolverOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomResolver customResolverResult = response.getResult();

      assertNotNull(customResolverResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateCustomResolver" })
  public void testGetCustomResolver() throws Exception {
    try {
      GetCustomResolverOptions getCustomResolverOptions = new GetCustomResolverOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<CustomResolver> response = service.getCustomResolver(getCustomResolverOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomResolver customResolverResult = response.getResult();

      assertNotNull(customResolverResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetCustomResolver" })
  public void testUpdateCustomResolver() throws Exception {
    try {
      UpdateCustomResolverOptions updateCustomResolverOptions = new UpdateCustomResolverOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .name("my-resolver")
        .description("custom resolver")
        .enabled(false)
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<CustomResolver> response = service.updateCustomResolver(updateCustomResolverOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomResolver customResolverResult = response.getResult();

      assertNotNull(customResolverResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateCustomResolver" })
  public void testUpdateCrLocationsOrder() throws Exception {
    try {
      UpdateCrLocationsOrderOptions updateCrLocationsOrderOptions = new UpdateCrLocationsOrderOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .locations(java.util.Arrays.asList("9a234ede-c2b6-4c39-bc27-d39ec139ecdb"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<CustomResolver> response = service.updateCrLocationsOrder(updateCrLocationsOrderOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomResolver customResolverResult = response.getResult();

      assertNotNull(customResolverResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateCrLocationsOrder" })
  public void testAddCustomResolverLocation() throws Exception {
    try {
      AddCustomResolverLocationOptions addCustomResolverLocationOptions = new AddCustomResolverLocationOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
        .enabled(false)
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Location> response = service.addCustomResolverLocation(addCustomResolverLocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Location locationResult = response.getResult();

      assertNotNull(locationResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddCustomResolverLocation" })
  public void testUpdateCustomResolverLocation() throws Exception {
    try {
      UpdateCustomResolverLocationOptions updateCustomResolverLocationOptions = new UpdateCustomResolverLocationOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .locationId("testString")
        .enabled(false)
        .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Location> response = service.updateCustomResolverLocation(updateCustomResolverLocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Location locationResult = response.getResult();

      assertNotNull(locationResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateCustomResolverLocation" })
  public void testListForwardingRules() throws Exception {
    try {
      ListForwardingRulesOptions listForwardingRulesOptions = new ListForwardingRulesOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<ForwardingRuleList> response = service.listForwardingRules(listForwardingRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ForwardingRuleList forwardingRuleListResult = response.getResult();

      assertNotNull(forwardingRuleListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListForwardingRules" })
  public void testListForwardingRulesWithPager() throws Exception {
    try {
      ListForwardingRulesOptions options = new ListForwardingRulesOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<ForwardingRule> allResults = new ArrayList<>();
      ForwardingRulesPager pager = new ForwardingRulesPager(service, options);
      while (pager.hasNext()) {
        List<ForwardingRule> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ForwardingRulesPager(service, options);
      List<ForwardingRule> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListForwardingRules" })
  public void testCreateForwardingRule() throws Exception {
    try {
      CreateForwardingRuleOptions createForwardingRuleOptions = new CreateForwardingRuleOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .description("forwarding rule")
        .type("zone")
        .match("example.com")
        .forwardTo(java.util.Arrays.asList("161.26.0.7"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ForwardingRule> response = service.createForwardingRule(createForwardingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ForwardingRule forwardingRuleResult = response.getResult();

      assertNotNull(forwardingRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateForwardingRule" })
  public void testGetForwardingRule() throws Exception {
    try {
      GetForwardingRuleOptions getForwardingRuleOptions = new GetForwardingRuleOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .ruleId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ForwardingRule> response = service.getForwardingRule(getForwardingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ForwardingRule forwardingRuleResult = response.getResult();

      assertNotNull(forwardingRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetForwardingRule" })
  public void testUpdateForwardingRule() throws Exception {
    try {
      UpdateForwardingRuleOptions updateForwardingRuleOptions = new UpdateForwardingRuleOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .ruleId("testString")
        .description("forwarding rule")
        .match("example.com")
        .forwardTo(java.util.Arrays.asList("161.26.0.7"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ForwardingRule> response = service.updateForwardingRule(updateForwardingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ForwardingRule forwardingRuleResult = response.getResult();

      assertNotNull(forwardingRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateForwardingRule" })
  public void testCreateSecondaryZone() throws Exception {
    try {
      CreateSecondaryZoneOptions createSecondaryZoneOptions = new CreateSecondaryZoneOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .description("secondary zone")
        .zone("example.com")
        .enabled(false)
        .transferFrom(java.util.Arrays.asList("10.0.0.7"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<SecondaryZone> response = service.createSecondaryZone(createSecondaryZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecondaryZone secondaryZoneResult = response.getResult();

      assertNotNull(secondaryZoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecondaryZone" })
  public void testListSecondaryZones() throws Exception {
    try {
      ListSecondaryZonesOptions listSecondaryZonesOptions = new ListSecondaryZonesOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<SecondaryZoneList> response = service.listSecondaryZones(listSecondaryZonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecondaryZoneList secondaryZoneListResult = response.getResult();

      assertNotNull(secondaryZoneListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecondaryZones" })
  public void testListSecondaryZonesWithPager() throws Exception {
    try {
      ListSecondaryZonesOptions options = new ListSecondaryZonesOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<SecondaryZone> allResults = new ArrayList<>();
      SecondaryZonesPager pager = new SecondaryZonesPager(service, options);
      while (pager.hasNext()) {
        List<SecondaryZone> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecondaryZonesPager(service, options);
      List<SecondaryZone> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecondaryZones" })
  public void testGetSecondaryZone() throws Exception {
    try {
      GetSecondaryZoneOptions getSecondaryZoneOptions = new GetSecondaryZoneOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .secondaryZoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<SecondaryZone> response = service.getSecondaryZone(getSecondaryZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecondaryZone secondaryZoneResult = response.getResult();

      assertNotNull(secondaryZoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecondaryZone" })
  public void testUpdateSecondaryZone() throws Exception {
    try {
      UpdateSecondaryZoneOptions updateSecondaryZoneOptions = new UpdateSecondaryZoneOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .secondaryZoneId("testString")
        .description("secondary zone")
        .enabled(false)
        .transferFrom(java.util.Arrays.asList("10.0.0.7"))
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<SecondaryZone> response = service.updateSecondaryZone(updateSecondaryZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecondaryZone secondaryZoneResult = response.getResult();

      assertNotNull(secondaryZoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecondaryZone" })
  public void testListLinkedZones() throws Exception {
    try {
      ListLinkedZonesOptions listLinkedZonesOptions = new ListLinkedZonesOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<LinkedDnszonesList> response = service.listLinkedZones(listLinkedZonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LinkedDnszonesList linkedDnszonesListResult = response.getResult();

      assertNotNull(linkedDnszonesListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLinkedZones" })
  public void testListLinkedZonesWithPager() throws Exception {
    try {
      ListLinkedZonesOptions options = new ListLinkedZonesOptions.Builder()
        .instanceId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<LinkedDnszone> allResults = new ArrayList<>();
      LinkedZonesPager pager = new LinkedZonesPager(service, options);
      while (pager.hasNext()) {
        List<LinkedDnszone> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new LinkedZonesPager(service, options);
      List<LinkedDnszone> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLinkedZones" })
  public void testCreateLinkedZone() throws Exception {
    try {
      CreateLinkedZoneOptions createLinkedZoneOptions = new CreateLinkedZoneOptions.Builder()
        .instanceId("testString")
        .ownerInstanceId("abe30019-1c08-42dc-9ad9-a0682af70054")
        .ownerZoneId("05855abe-3908-4cdc-bf0d-063e0b1c296d")
        .description("linked zone example")
        .label("dev")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<LinkedDnszone> response = service.createLinkedZone(createLinkedZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LinkedDnszone linkedDnszoneResult = response.getResult();

      assertNotNull(linkedDnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLinkedZone" })
  public void testGetLinkedZone() throws Exception {
    try {
      GetLinkedZoneOptions getLinkedZoneOptions = new GetLinkedZoneOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<LinkedDnszone> response = service.getLinkedZone(getLinkedZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LinkedDnszone linkedDnszoneResult = response.getResult();

      assertNotNull(linkedDnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLinkedZone" })
  public void testUpdateLinkedZone() throws Exception {
    try {
      UpdateLinkedZoneOptions updateLinkedZoneOptions = new UpdateLinkedZoneOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .description("linked zone example")
        .label("dev")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<LinkedDnszone> response = service.updateLinkedZone(updateLinkedZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LinkedDnszone linkedDnszoneResult = response.getResult();

      assertNotNull(linkedDnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLinkedZone" })
  public void testListDnszoneAccessRequests() throws Exception {
    try {
      ListDnszoneAccessRequestsOptions listDnszoneAccessRequestsOptions = new ListDnszoneAccessRequestsOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("200"))
        .build();

      // Invoke operation
      Response<AccessRequestsList> response = service.listDnszoneAccessRequests(listDnszoneAccessRequestsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessRequestsList accessRequestsListResult = response.getResult();

      assertNotNull(accessRequestsListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDnszoneAccessRequests" })
  public void testListDnszoneAccessRequestsWithPager() throws Exception {
    try {
      ListDnszoneAccessRequestsOptions options = new ListDnszoneAccessRequestsOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .limit(Long.valueOf("200"))
        .build();

      // Test getNext().
      List<AccessRequest> allResults = new ArrayList<>();
      DnszoneAccessRequestsPager pager = new DnszoneAccessRequestsPager(service, options);
      while (pager.hasNext()) {
        List<AccessRequest> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DnszoneAccessRequestsPager(service, options);
      List<AccessRequest> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDnszoneAccessRequests" })
  public void testGetDnszoneAccessRequest() throws Exception {
    try {
      GetDnszoneAccessRequestOptions getDnszoneAccessRequestOptions = new GetDnszoneAccessRequestOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .requestId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<AccessRequest> response = service.getDnszoneAccessRequest(getDnszoneAccessRequestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessRequest accessRequestResult = response.getResult();

      assertNotNull(accessRequestResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDnszoneAccessRequest" })
  public void testUpdateDnszoneAccessRequest() throws Exception {
    try {
      UpdateDnszoneAccessRequestOptions updateDnszoneAccessRequestOptions = new UpdateDnszoneAccessRequestOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .requestId("testString")
        .action("APPROVE")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<AccessRequest> response = service.updateDnszoneAccessRequest(updateDnszoneAccessRequestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessRequest accessRequestResult = response.getResult();

      assertNotNull(accessRequestResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDnszoneAccessRequest" })
  public void testListLinkedPermittedNetworks() throws Exception {
    try {
      ListLinkedPermittedNetworksOptions listLinkedPermittedNetworksOptions = new ListLinkedPermittedNetworksOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<ListPermittedNetworks> response = service.listLinkedPermittedNetworks(listLinkedPermittedNetworksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPermittedNetworks listPermittedNetworksResult = response.getResult();

      assertNotNull(listPermittedNetworksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLinkedPermittedNetworks" })
  public void testCreateLzPermittedNetwork() throws Exception {
    try {
      PermittedNetworkVpc permittedNetworkVpcModel = new PermittedNetworkVpc.Builder()
        .vpcCrn("crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6")
        .build();

      CreateLzPermittedNetworkOptions createLzPermittedNetworkOptions = new CreateLzPermittedNetworkOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .type("vpc")
        .permittedNetwork(permittedNetworkVpcModel)
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<PermittedNetwork> response = service.createLzPermittedNetwork(createLzPermittedNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PermittedNetwork permittedNetworkResult = response.getResult();

      assertNotNull(permittedNetworkResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLzPermittedNetwork" })
  public void testGetLinkedPermittedNetwork() throws Exception {
    try {
      GetLinkedPermittedNetworkOptions getLinkedPermittedNetworkOptions = new GetLinkedPermittedNetworkOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .permittedNetworkId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<PermittedNetwork> response = service.getLinkedPermittedNetwork(getLinkedPermittedNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PermittedNetwork permittedNetworkResult = response.getResult();

      assertNotNull(permittedNetworkResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLinkedPermittedNetwork" })
  public void testDeleteDnszone() throws Exception {
    try {
      DeleteDnszoneOptions deleteDnszoneOptions = new DeleteDnszoneOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDnszone(deleteDnszoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDnszone" })
  public void testDeleteResourceRecord() throws Exception {
    try {
      DeleteResourceRecordOptions deleteResourceRecordOptions = new DeleteResourceRecordOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .recordId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteResourceRecord(deleteResourceRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteResourceRecord" })
  public void testDeletePermittedNetwork() throws Exception {
    try {
      DeletePermittedNetworkOptions deletePermittedNetworkOptions = new DeletePermittedNetworkOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .permittedNetworkId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<PermittedNetwork> response = service.deletePermittedNetwork(deletePermittedNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PermittedNetwork permittedNetworkResult = response.getResult();

      assertNotNull(permittedNetworkResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePermittedNetwork" })
  public void testDeleteLoadBalancer() throws Exception {
    try {
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
        .instanceId("testString")
        .dnszoneId("testString")
        .lbId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancer" })
  public void testDeletePool() throws Exception {
    try {
      DeletePoolOptions deletePoolOptions = new DeletePoolOptions.Builder()
        .instanceId("testString")
        .poolId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePool(deletePoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePool" })
  public void testDeleteMonitor() throws Exception {
    try {
      DeleteMonitorOptions deleteMonitorOptions = new DeleteMonitorOptions.Builder()
        .instanceId("testString")
        .monitorId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteMonitor(deleteMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteMonitor" })
  public void testDeleteCustomResolver() throws Exception {
    try {
      DeleteCustomResolverOptions deleteCustomResolverOptions = new DeleteCustomResolverOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteCustomResolver(deleteCustomResolverOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteCustomResolver" })
  public void testDeleteCustomResolverLocation() throws Exception {
    try {
      DeleteCustomResolverLocationOptions deleteCustomResolverLocationOptions = new DeleteCustomResolverLocationOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .locationId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteCustomResolverLocation(deleteCustomResolverLocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteCustomResolverLocation" })
  public void testDeleteForwardingRule() throws Exception {
    try {
      DeleteForwardingRuleOptions deleteForwardingRuleOptions = new DeleteForwardingRuleOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .ruleId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteForwardingRule(deleteForwardingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteForwardingRule" })
  public void testDeleteSecondaryZone() throws Exception {
    try {
      DeleteSecondaryZoneOptions deleteSecondaryZoneOptions = new DeleteSecondaryZoneOptions.Builder()
        .instanceId("testString")
        .resolverId("testString")
        .secondaryZoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecondaryZone(deleteSecondaryZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecondaryZone" })
  public void testDeleteLinkedZone() throws Exception {
    try {
      DeleteLinkedZoneOptions deleteLinkedZoneOptions = new DeleteLinkedZoneOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLinkedZone(deleteLinkedZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLinkedZone" })
  public void testDeleteLzPermittedNetwork() throws Exception {
    try {
      DeleteLzPermittedNetworkOptions deleteLzPermittedNetworkOptions = new DeleteLzPermittedNetworkOptions.Builder()
        .instanceId("testString")
        .linkedDnszoneId("testString")
        .permittedNetworkId("testString")
        .xCorrelationId("testString")
        .build();

      // Invoke operation
      Response<PermittedNetwork> response = service.deleteLzPermittedNetwork(deleteLzPermittedNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PermittedNetwork permittedNetworkResult = response.getResult();

      assertNotNull(permittedNetworkResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
