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

package com.ibm.cloud.networking.page_rule_api.v1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.networking.page_rule_api.v1.model.CreatePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.DeletePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.GetPageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.ListPageRulesOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesDeleteResponse;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesResponseListAll;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesResponseWithoutResultInfo;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItem;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItemConstraint;
import com.ibm.cloud.networking.page_rule_api.v1.model.UpdatePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

/**
 * Integration test class for the page rule service.
 */
public class PageRuleApiIT extends SdkIntegrationTestBase {
  public PageRuleApi service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;
  String identifier = null;
  public String url = null;

  public String getConfigFilename() {
    return "../../cloud_internet_services.env";
  }

  @BeforeClass
  public void constructService() {
    System.out.println("construct service -----------------------------------------------");
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
      service = PageRuleApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test
  public void testCreatePageRule() throws Exception {
    url = "beta.travis-kuganes1.sdk.cistest-load.com/*";
    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");
    // set mock values for global params
    try {
      service = PageRuleApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      TargetsItemConstraint constraintOptions = new TargetsItemConstraint.Builder().operator("matches").value(url)
          .build();
      TargetsItem targetsOptions = new TargetsItem.Builder().target("url").constraint(constraintOptions).build();

      Map<String, Object> actionDisableSecurity = new HashMap<>();
      Map<String, Object> actionBrowserCacheTTL = new HashMap<>();
      actionDisableSecurity.put("id", "disable_security");
      actionBrowserCacheTTL.put("id", "browser_cache_ttl");
      actionBrowserCacheTTL.put("value", 1800);
      CreatePageRuleOptions createPageRuleOptions = new CreatePageRuleOptions.Builder().priority(5).status("active")
          .addTargets(targetsOptions).addActions(actionDisableSecurity).addActions(actionBrowserCacheTTL).build();

      // Invoke operation
      Response<PageRulesResponseWithoutResultInfo> response = service.createPageRule(createPageRuleOptions).execute();
      System.out.println(response);
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PageRulesResponseWithoutResultInfo pageRuleRespResult = response.getResult();
      assertNotNull(pageRuleRespResult);
      identifier = pageRuleRespResult.getResult().getId();
      System.out.println("page rule id :" + identifier);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(),
          e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = "testCreatePageRule")
  public void testUpdatePageRule() throws Exception {
    url = "beta.travis-kuganes1.sdk.cistest-load.com/*";
    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");
    // set mock values for global params
    try {
      service = PageRuleApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      TargetsItemConstraint constraintOptions = new TargetsItemConstraint.Builder().operator("matches").value(url)
          .build();
      TargetsItem targetsOptions = new TargetsItem.Builder().target("url").constraint(constraintOptions).build();

      Map<String, Object> actionDisableSecurity = new HashMap<>();
      Map<String, Object> actionBrowserCacheTTL = new HashMap<>();
      actionDisableSecurity.put("id", "disable_security");
      actionBrowserCacheTTL.put("id", "browser_cache_ttl");
      actionBrowserCacheTTL.put("value", 3600);
      UpdatePageRuleOptions updatePageRuleOptions = new UpdatePageRuleOptions.Builder().ruleId(identifier).priority(2)
          .status("active").addTargets(targetsOptions).addActions(actionDisableSecurity)
          .addActions(actionBrowserCacheTTL).build();

      // Invoke operation
      Response<PageRulesResponseWithoutResultInfo> response = service.updatePageRule(updatePageRuleOptions).execute();
      System.out.println(response);
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PageRulesResponseWithoutResultInfo pageRuleRespResult = response.getResult();
      assertNotNull(pageRuleRespResult);
      identifier = pageRuleRespResult.getResult().getId();
      System.out.println("page rule id :" + identifier);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(),
          e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = "testUpdatePageRule")
  public void testGetPageRule() throws Exception {
    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");
    // set mock values for global params
    try {
      service = PageRuleApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      GetPageRuleOptions getPageRuleOptions = new GetPageRuleOptions.Builder().ruleId(identifier).build();

      // Invoke operation
      Response<PageRulesResponseWithoutResultInfo> response = service.getPageRule(getPageRuleOptions).execute();
      System.out.println(response);
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PageRulesResponseWithoutResultInfo pageRuleRespResult = response.getResult();
      assertNotNull(pageRuleRespResult);
      identifier = pageRuleRespResult.getResult().getId();
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(),
          e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = "testGetPageRule")
  public void testListPageRule() throws Exception {
    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");
    // set mock values for global params
    try {
      service = PageRuleApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      ListPageRulesOptions listPageRuleOptions = new ListPageRulesOptions.Builder().build();

      // Invoke operation
      Response<PageRulesResponseListAll> response = service.listPageRules(listPageRuleOptions).execute();
      System.out.println(response);
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PageRulesResponseListAll pageRuleRespResult = response.getResult();
      assertNotNull(pageRuleRespResult);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(),
          e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = "testListPageRule")
  public void testDeletePageRule() throws Exception {
    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");
    // set mock values for global params
    try {
      service = PageRuleApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      DeletePageRuleOptions deletePageRuleOptions = new DeletePageRuleOptions.Builder().ruleId(identifier).build();

      // Invoke operation
      Response<PageRulesDeleteResponse> response = service.deletePageRule(deletePageRuleOptions).execute();
      System.out.println(response);
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PageRulesDeleteResponse pageRuleRespResult = response.getResult();
      assertNotNull(pageRuleRespResult);
      identifier = pageRuleRespResult.getResult().getId();
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(),
          e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
}