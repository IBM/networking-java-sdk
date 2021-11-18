package com.ibm.cloud.networking.firewall_rules.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.networking.filters.v1.model.FilterInput;
import com.ibm.cloud.networking.filters.v1.model.CreateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.FiltersResp;
import com.ibm.cloud.networking.filters.v1.Filters;
import com.ibm.cloud.networking.filters.v1.model.FilterObject;
import com.ibm.cloud.networking.filters.v1.model.ListAllFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.ListFiltersResp;


import com.ibm.cloud.networking.firewall_rules.v1.FirewallRules;
import com.ibm.cloud.networking.firewall_rules.v1.model.CreateFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleRespResult;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesRespResultItem;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleInputWithFilterId;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleInputWithFilterIdFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleObject;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleObjectFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleUpdateInputFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesUpdateInputItem;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesUpdateInputItemFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.GetFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListAllFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListFirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListFirewallRulesRespResultInfo;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewllRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;

import java.io.InputStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class FirewallRulesIT extends SdkIntegrationTestBase {
    public FirewallRules serviceRule = null;
    public Filters service = null;
    public static Map<String, String> config = null;
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  
    String crn = null;
    String zoneIdentifier = null;
    String xAuthUserToken = null;
   
    String [] filter = null;
    String [] firewallId = null;
    //List<FilterObject> filtersResult = null;

    String[] expressions = {
      "(ip.src eq 13.60.125.234)",
      "(http.request.uri eq \"/test?number=1\")",
      "not http.request.uri.path matches \"^/api/[\\W].*$\"",
      "(http.request.uri.path ~ \"^.*/wpt[\\d]-login.php$\" or http.request.uri.path ~ \"^.*/xmlrpc.php$\")"      
    };
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
      xAuthUserToken = config.get("CIS_SERVICES_APIKEY");
      // set mock values for global params
      try {
        serviceRule = FirewallRules.newInstance(serviceName);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Setup complete.");
    }
    
    @Test
    public void testCreateFilter() throws Exception {
      try {
        for(int i=0; i<4; i++ ) {

          FilterInput filterInputModel = new FilterInput.Builder()
          .expression(expressions[i])
          .paused(false)
          .description("Login-Office-SDK")
          .build();
    
          CreateFilterOptions createFilterOptions = new CreateFilterOptions.Builder()
          .xAuthUserToken("testString")
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .filterInput(new java.util.ArrayList<FilterInput>(java.util.Arrays.asList(filterInputModel)))
          .build();
  
          // Invoke operation
          Response<FiltersResp> response = service.createFilter(createFilterOptions).execute();
  
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);
    
          FiltersResp filtersRespResult = response.getResult();

          assertNotNull(filtersRespResult);
        }
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }
  
    @Test
    public void testListAllFilters() throws Exception {
      try {
        for (int i=0; i<4; i++) {
          ListAllFiltersOptions listAllFiltersOptions = new ListAllFiltersOptions.Builder()
          .xAuthUserToken(xAuthUserToken)
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .build();
      
          // Invoke operation
          Response<ListFiltersResp> response = service.listAllFilters(listAllFiltersOptions).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);
      
          ListFiltersResp listFiltersRespResult = response.getResult();
          List<FilterObject> filtersResult = listFiltersRespResult.getResult();
          filter[i] = filtersResult.get(i).getId();
          
          assertNotNull(listFiltersRespResult);
        }
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }


    @Test
    public void testCreateFirewallRules() throws Exception {
      try {
        for(int i=0; i<4; i++) {
          FirewallRuleInputWithFilterIdFilter firewallRuleInputWithFilterIdFilterModel = new FirewallRuleInputWithFilterIdFilter.Builder()
          .id(filter[i])
          .build();
        
          // Construct an instance of the FirewallRuleInputWithFilterId model
          FirewallRuleInputWithFilterId firewallRuleInputWithFilterIdModel = new FirewallRuleInputWithFilterId.Builder()
          .filter(firewallRuleInputWithFilterIdFilterModel)
          .action("js_challenge")
          .description("JS challenge site")
          .build();

          // Construct an instance of the CreateFirewallRulesOptions model
          CreateFirewallRulesOptions createFirewallRulesOptions = new CreateFirewallRulesOptions.Builder()
          .xAuthUserToken(xAuthUserToken)
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .firewallRuleInputWithFilterId(new java.util.ArrayList<FirewallRuleInputWithFilterId>(java.util.Arrays.asList(firewallRuleInputWithFilterIdModel)))
          .build();

          // Invoke operation
          Response<FirewallRulesResp> response = serviceRule.createFirewallRules(createFirewallRulesOptions).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);

          FirewallRulesResp RespResult = response.getResult();
          List<FirewallRuleObject> firewallResult = RespResult.getResult();
          firewallId[i] = firewallResult.get(i).getId();

          assertNotNull(RespResult);
        }
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }

    @Test
    public void testListAllAccountAccessRules() throws Exception {
      try {
        for(int i=0; i<4; i++) {
          ListAllFirewallRulesOptions listAllFirewallRulesOptionsModel = new ListAllFirewallRulesOptions.Builder()
          .xAuthUserToken(xAuthUserToken)
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .build();
          // Invoke operation
          Response<ListFirewallRulesResp> response = serviceRule.listAllFirewallRules(listAllFirewallRulesOptionsModel).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);

          ListFirewallRulesResp listFirewallRulesRespResult = response.getResult();

          assertNotNull(listFirewallRulesRespResult);
        }
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }

  
    @Test
    public void testUpdateFirewallRule() throws Exception {
      try {
        FirewallRuleUpdateInputFilter firewallRuleUpdateInputFilterModel = new FirewallRuleUpdateInputFilter.Builder()
        .id(filter[1])
        .build();

        // Construct an instance of the UpdateFirewallRuleOptions model
        UpdateFirewallRuleOptions updateFirewallRuleOptionsModel = new UpdateFirewallRuleOptions.Builder()
        .xAuthUserToken(xAuthUserToken)
        .crn(crn)
        .zoneIdentifier(zoneIdentifier)
        .firewallRuleIdentifier(firewallId[0])
        .action("allow")
        .paused(false)
        .description("allow rules")
        .filter(firewallRuleUpdateInputFilterModel)
        .build();

        // Invoke operation
        Response<FirewallRuleResp> response = serviceRule.updateFirewallRule(updateFirewallRuleOptionsModel).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        FirewallRuleResp firewallRespResult = response.getResult();

        assertNotNull(firewallRespResult);
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }
 
    @Test
    public void testGetFirewallRule() throws Exception {
      try {
        GetFirewallRuleOptions getFirewallRuleOptionsModel = new GetFirewallRuleOptions.Builder()
        .xAuthUserToken(xAuthUserToken)
        .crn(crn)
        .zoneIdentifier(zoneIdentifier)
        .firewallRuleIdentifier(firewallId[3])
        .build();

  
        // Invoke operation
        Response<FirewallRuleResp> response = serviceRule.getFirewallRule(getFirewallRuleOptionsModel).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
  
        FirewallRuleResp firewallRespResult = response.getResult();
  
        assertNotNull(firewallRespResult);
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }
  

    @Test
    public void testUpdateFirewallRules()  throws Exception {
      try {
        for(int i=0; i<4; i++) {
          FirewallRulesUpdateInputItemFilter firewallRulesUpdateInputItemFilterModel = new FirewallRulesUpdateInputItemFilter.Builder()
          .id(filter[i])
          .build();
        
          FirewallRulesUpdateInputItem firewallRulesUpdateInputItemModel = new FirewallRulesUpdateInputItem.Builder()
          .id(firewallId[i])
          .action("block")
          .paused(false)
          .description("block")
          .filter(firewallRulesUpdateInputItemFilterModel)
          .build();
    
          UpdateFirewllRulesOptions updateFirewllRulesOptionsModel = new UpdateFirewllRulesOptions.Builder()
          .xAuthUserToken(xAuthUserToken)
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .firewallRulesUpdateInputItem(new java.util.ArrayList<FirewallRulesUpdateInputItem>(java.util.Arrays.asList(firewallRulesUpdateInputItemModel)))
          .build();
          // Invoke operation
          Response<FirewallRulesResp> response = serviceRule.updateFirewllRules(updateFirewllRulesOptionsModel).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);

          FirewallRulesResp firewallRespResult = response.getResult();

          assertNotNull(firewallRespResult);
        }
      } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }



    @Test 
      public void testDeleteFiltersRule() throws Exception {
        try {
          DeleteFirewallRuleOptions deleteFirewallRuleOptionsModel = new DeleteFirewallRuleOptions.Builder()
          .xAuthUserToken(xAuthUserToken)
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .firewallRuleIdentifier(firewallId[3])
          .build();
      
          // Invoke operation with valid options model (positive test)
          Response<DeleteFirewallRuleResp> response = serviceRule.deleteFirewallRule(deleteFirewallRuleOptionsModel).execute();
            // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 204);
          
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
      }


    @Test 
    public void testDeleteFirewallRules() throws Exception {
      try {
        for(int i=1; i<3; i++) {
          DeleteFirewallRulesOptions deleteFirewallRulesOptionsModel = new DeleteFirewallRulesOptions.Builder()
          .xAuthUserToken(xAuthUserToken)
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .id(firewallId[i])
          .build();
          // Invoke operation
          Response<DeleteFirewallRulesResp> response = serviceRule.deleteFirewallRules(deleteFirewallRulesOptionsModel).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 204);
        }
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
