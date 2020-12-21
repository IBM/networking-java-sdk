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

package com.ibm.cloud.networking.dns_svcs.v1;

import com.ibm.cloud.networking.dns_svcs.v1.model.CreateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.Dnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.FirstHref;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszones;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszonesOptions;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancer;
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancerAzPoolsItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.model.NextHref;
import com.ibm.cloud.networking.dns_svcs.v1.model.Origin;
import com.ibm.cloud.networking.dns_svcs.v1.model.OriginInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetwork;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetworkVpc;
import com.ibm.cloud.networking.dns_svcs.v1.model.Pool;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
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
 * Integration test class for the DnsSvcs service.
 */
public class DnsSvcsIT extends SdkIntegrationTestBase {
  public DnsSvcs service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  String instance_id = null;
  String zone_id = null;
  String vpc_crn = null;
  String vpc_id = null;
  String monitor_id = null;
  String pool_id = null;
  String lb_id = null;
  String record_id = null;
  String subnet_id = null;
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../private_dns_services.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    final String serviceName = "private_dns_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    instance_id = config.get("INSTANCE_ID");
    vpc_crn = config.get("VPC_CRN");
    vpc_id = config.get("VPC_ID");
    subnet_id = config.get("SUBNET_ID");

    // set mock values for global params
    try {
      service = DnsSvcs.newInstance(serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateDnszone")
  public void testListDnszones() throws Exception {
    try {
      ListDnszonesOptions listDnszonesOptions = new ListDnszonesOptions.Builder()
      .instanceId("d633130b-fed5-469c-b67f-aefe4045fde6")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

      // Invoke operation
      Response<ListDnszones> response = service.listDnszones(listDnszonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListDnszones listDnszonesResult = response.getResult();

      assertNotNull(listDnszonesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateDnszone() throws Exception {
    try {
      CreateDnszoneOptions createDnszoneOptions = new CreateDnszoneOptions.Builder()
      .instanceId(instance_id)
      .name("test-java-dns.com")
      .description("Java SDK testing")
      .label("us-east")
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Dnszone> response = service.createDnszone(createDnszoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Dnszone dnszoneResult = response.getResult();
      zone_id = dnszoneResult.getId();
      System.out.println(zone_id);
      assertNotNull(dnszoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateDnszone")
  public void testGetDnszone() throws Exception {
    try {
      GetDnszoneOptions getDnszoneOptions = new GetDnszoneOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListDnszones")
  public void testUpdateDnszone() throws Exception {
    try {
      UpdateDnszoneOptions updateDnszoneOptions = new UpdateDnszoneOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .description("us-east update check")
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreateResourceRecord")
  public void testListResourceRecords() throws Exception {
    try {
      ListResourceRecordsOptions listResourceRecordsOptions = new ListResourceRecordsOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

      // Invoke operation
      Response<ListResourceRecords> response = service.listResourceRecords(listResourceRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListResourceRecords listResourceRecordsResult = response.getResult();

      assertNotNull(listResourceRecordsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetLoadBalancer")
  public void testCreateResourceRecord() throws Exception {
    try {
      ResourceRecordInputRdataRdataARecord resourceRecordInputRdataModel = new ResourceRecordInputRdataRdataARecord.Builder()
      .ip("10.110.201.214")
      .build();

      CreateResourceRecordOptions createResourceRecordOptions = new CreateResourceRecordOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .name("test.test.com")
      .type("A")
      .rdata(resourceRecordInputRdataModel)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<ResourceRecord> response = service.createResourceRecord(createResourceRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResourceRecord resourceRecordResult = response.getResult();

      assertNotNull(resourceRecordResult);
      record_id = resourceRecordResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateResourceRecord")
  public void testGetResourceRecord() throws Exception {
    try {
      GetResourceRecordOptions getResourceRecordOptions = new GetResourceRecordOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .recordId(record_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListResourceRecords")
  public void testUpdateResourceRecord() throws Exception {
    try {
      ResourceRecordUpdateInputRdataRdataARecord resourceRecordUpdateInputRdataModel = new ResourceRecordUpdateInputRdataRdataARecord.Builder()
      .ip("10.110.201.214")
      .build();

      UpdateResourceRecordOptions updateResourceRecordOptions = new UpdateResourceRecordOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .recordId(record_id)
      .name("test1.test.com")
      .rdata(resourceRecordUpdateInputRdataModel)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreatePermittedNetwork")
  public void testListPermittedNetworks() throws Exception {
    try {
      ListPermittedNetworksOptions listPermittedNetworksOptions = new ListPermittedNetworksOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

      // Invoke operation
      Response<ListPermittedNetworks> response = service.listPermittedNetworks(listPermittedNetworksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPermittedNetworks listPermittedNetworksResult = response.getResult();

      assertNotNull(listPermittedNetworksResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetDnszone")
  public void testCreatePermittedNetwork() throws Exception {
    try {
      PermittedNetworkVpc permittedNetworkVpcModel = new PermittedNetworkVpc.Builder()
      .vpcCrn(vpc_crn)
      .build();

      CreatePermittedNetworkOptions createPermittedNetworkOptions = new CreatePermittedNetworkOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .type("vpc")
      .permittedNetwork(permittedNetworkVpcModel)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods="testListPermittedNetworks")
  public void testGetPermittedNetwork() throws Exception {
    try {
      GetPermittedNetworkOptions getPermittedNetworkOptions = new GetPermittedNetworkOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .permittedNetworkId(vpc_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreateLoadBalancer")
  public void testListLoadBalancers() throws Exception {
    try {
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<ListLoadBalancers> response = service.listLoadBalancers(listLoadBalancersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListLoadBalancers listLoadBalancersResult = response.getResult();

      assertNotNull(listLoadBalancersResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetPool")
  public void testCreateLoadBalancer() throws Exception {
    try {
      LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModel = new LoadBalancerAzPoolsItem.Builder()
      .availabilityZone("us-east-1")
      .pools(new java.util.ArrayList<String>(java.util.Arrays.asList(pool_id)))
      .build();

      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .name("glb.example.com")
      .description("Load balancer for glb.example.com.")
      .enabled(true)
      .ttl(Long.valueOf("120"))
      .fallbackPool(pool_id)
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList(pool_id)))
      .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<LoadBalancer> response = service.createLoadBalancer(createLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);
      lb_id = loadBalancerResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateLoadBalancer")
  public void testGetLoadBalancer() throws Exception {
    try {
      GetLoadBalancerOptions getLoadBalancerOptions = new GetLoadBalancerOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .lbId(lb_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListLoadBalancers")
  public void testUpdateLoadBalancer() throws Exception {
    try {
      LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModel = new LoadBalancerAzPoolsItem.Builder()
      .availabilityZone("us-east-1")
      .pools(new java.util.ArrayList<String>(java.util.Arrays.asList(pool_id)))
      .build();

      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .lbId(lb_id)
      .name("glb.example.com")
      .description("Load balancer for glb.example.com.")
      .enabled(true)
      .ttl(Long.valueOf("120"))
      .fallbackPool(pool_id)
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList(pool_id)))
      .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreatePool")
  public void testListPools() throws Exception {
    try {
      ListPoolsOptions listPoolsOptions = new ListPoolsOptions.Builder()
      .instanceId(instance_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<ListPools> response = service.listPools(listPoolsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPools listPoolsResult = response.getResult();

      assertNotNull(listPoolsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetMonitor")
  public void testCreatePool() throws Exception {
    try {
      OriginInput originInputModel = new OriginInput.Builder()
      .name("app-server-1")
      .description("description of the origin server")
      .address("10.10.16.8")
      .enabled(true)
      .build();

      CreatePoolOptions createPoolOptions = new CreatePoolOptions.Builder()
      .instanceId(instance_id)
      .name("dal10-az-pool")
      .description("Load balancer pool for dal10 availability zone.")
      .enabled(true)
      .healthyOriginsThreshold(Long.valueOf("1"))
      .origins(new java.util.ArrayList<OriginInput>(java.util.Arrays.asList(originInputModel)))
      .monitor(monitor_id)
      .notificationChannel("https://mywebsite.com/dns/webhook")
      .healthcheckRegion("us-east")
      .healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList(subnet_id)))
      .xCorrelationId("testString")
      .build();

// .healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")))

      // Invoke operation
      Response<Pool> response = service.createPool(createPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Pool poolResult = response.getResult();

      assertNotNull(poolResult);
      pool_id = poolResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdatePool")
  public void testGetPool() throws Exception {
    try {
      GetPoolOptions getPoolOptions = new GetPoolOptions.Builder()
      .instanceId(instance_id)
      .poolId(pool_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListPools")
  public void testUpdatePool() throws Exception {
    try {
      OriginInput originInputModel = new OriginInput.Builder()
      .name("app-server-1")
      .description("description of the origin server")
      .address("10.10.16.8")
      .enabled(true)
      .build();

      UpdatePoolOptions updatePoolOptions = new UpdatePoolOptions.Builder()
      .instanceId(instance_id)
      .poolId(pool_id)
      .name("dal10-az-pool")
      .description("Load balancer pool for dal10 availability zone.")
      .enabled(true)
      .healthyOriginsThreshold(Long.valueOf("1"))
      .origins(new java.util.ArrayList<OriginInput>(java.util.Arrays.asList(originInputModel)))
      .monitor(monitor_id)
      .notificationChannel("https://mywebsite.com/dns/webhook")
      .healthcheckRegion("us-east")
      .healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList(subnet_id)))
      //.healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")))
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreateMonitor")
  public void testListMonitors() throws Exception {
    try {
      ListMonitorsOptions listMonitorsOptions = new ListMonitorsOptions.Builder()
      .instanceId(instance_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<ListMonitors> response = service.listMonitors(listMonitorsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListMonitors listMonitorsResult = response.getResult();

      assertNotNull(listMonitorsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetPermittedNetwork")
  public void testCreateMonitor() throws Exception {
    try {
      HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
      .name("Host")
      .value(new java.util.ArrayList<String>(java.util.Arrays.asList("origin.example.com")))
      .build();

      CreateMonitorOptions createMonitorOptions = new CreateMonitorOptions.Builder()
      .instanceId(instance_id)
      .name("test-healthcheck-monitor")
      .description("Load balancer monitor for glb.example.com.")
      .type("HTTPS")
      .port(Long.valueOf("8080"))
      .interval(Long.valueOf("60"))
      .retries(Long.valueOf("2"))
      .timeout(Long.valueOf("5"))
      .method("GET")
      .path("/health")
      .headers(new java.util.ArrayList<HealthcheckHeader>(java.util.Arrays.asList(healthcheckHeaderModel)))
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
      monitor_id = monitorResult.getId();

      assertNotNull(monitorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateMonitor")
  public void testGetMonitor() throws Exception {
    try {
      GetMonitorOptions getMonitorOptions = new GetMonitorOptions.Builder()
      .instanceId(instance_id)
      .monitorId(monitor_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListMonitors")
  public void testUpdateMonitor() throws Exception {
    try {
      HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
      .name("Host")
      .value(new java.util.ArrayList<String>(java.util.Arrays.asList("origin.example.com")))
      .build();

      UpdateMonitorOptions updateMonitorOptions = new UpdateMonitorOptions.Builder()
      .instanceId(instance_id)
      .monitorId(monitor_id)
      .name("healthcheck-monitor")
      .description("Load balancer monitor for glb.example.com.")
      .type("HTTPS")
      .port(Long.valueOf("8080"))
      .interval(Long.valueOf("60"))
      .retries(Long.valueOf("2"))
      .timeout(Long.valueOf("5"))
      .method("GET")
      .path("/health")
      .headers(new java.util.ArrayList<HealthcheckHeader>(java.util.Arrays.asList(healthcheckHeaderModel)))
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetResourceRecord")
  public void testDeleteResourceRecord() throws Exception {
    try {
      DeleteResourceRecordOptions deleteResourceRecordOptions = new DeleteResourceRecordOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .recordId(record_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteResourceRecord(deleteResourceRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeleteLoadBalancer")
  public void testDeletePool() throws Exception {
    try {
      DeletePoolOptions deletePoolOptions = new DeletePoolOptions.Builder()
      .instanceId(instance_id)
      .poolId(pool_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deletePool(deletePoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeleteMonitor")
  public void testDeletePermittedNetwork() throws Exception {
    try {
      DeletePermittedNetworkOptions deletePermittedNetworkOptions = new DeletePermittedNetworkOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .permittedNetworkId(vpc_id)
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
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeletePool")
  public void testDeleteMonitor() throws Exception {
    try {
      DeleteMonitorOptions deleteMonitorOptions = new DeleteMonitorOptions.Builder()
      .instanceId(instance_id)
      .monitorId(monitor_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteMonitor(deleteMonitorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeleteResourceRecord")
  public void testDeleteLoadBalancer() throws Exception {
    try {
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .lbId(lb_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeletePermittedNetwork")
  public void testDeleteDnszone() throws Exception {
    try {
      DeleteDnszoneOptions deleteDnszoneOptions = new DeleteDnszoneOptions.Builder()
      .instanceId(instance_id)
      .dnszoneId(zone_id)
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteDnszone(deleteDnszoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
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
