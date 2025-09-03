/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.networking.rulesets.v1.model.ActionParameters;
import com.ibm.cloud.networking.rulesets.v1.model.CreateInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.CreateZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntryPointRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntryPointRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionByTagOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntryPointRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntryPointRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.ListRulesetsResp;
import com.ibm.cloud.networking.rulesets.v1.model.ListedRuleset;
import com.ibm.cloud.networking.rulesets.v1.model.RuleCreate;
import com.ibm.cloud.networking.rulesets.v1.model.RuleResp;
import com.ibm.cloud.networking.rulesets.v1.model.RulesetDetails;
import com.ibm.cloud.networking.rulesets.v1.model.RulesetResp;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneEntrypointRulesetOptions.RulesetPhase;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

/**
 * Integration test class for the Rulesets service.
 */
public class RulesetsIT extends SdkIntegrationTestBase {
  public Rulesets service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  // service config variables
  String crn;
  String zoneIdentifier;

  // placeholder variables
  // will be used to store the data fetched in one test, so that it can be used in
  // other test
  List<ListedRuleset> rulesets;
  RulesetDetails ruleset;
  RulesetDetails updatedRuleset;
  List<ListedRuleset> rulesetVersions;
  RulesetDetails specificRuleset;
  Map<String, RulesetDetails> entrypointRuleset;
  Map<String, RulesetDetails> updatedEntrypointRuleset;
  Map<String, List<ListedRuleset>> entrypointRulesetVersions;
  Map<String, RulesetDetails> specificEntrypointRulesetVersion;
  int firstCustomRulesetIndex = -1;

  /**
   * This method provides our config filename to the base class.
   */
  public String getConfigFilename() {
    return "../../rulesets_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Rulesets.DEFAULT_SERVICE_NAME);
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");

    service = Rulesets.newInstance(crn, zoneIdentifier);
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  /* INSTANCE RULESETS TESTS */

  /*
   * 1. list rulesets ✅
   * 2. get a ruleset ✅
   * 3. update a ruleset ✅
   * 4. list versions of a ruleset ✅
   * 5. get a specific version of a ruleset✅
   * 6. get a entrypoint ruleset ✅
   * 7. get versions of entrypoint ruleset ✅
   * 8. get specific entrypoint ruleset version ✅
   * 9. get specific ruleset version by tag ✅
   * 10. update/create entrypoint ruleset ✅
   * 11. create a rule in ruleset ✅
   * 12. update a rule in ruleset ✅
   * 13. delete a rule in ruleset ✅
   * 14. delete a specifig version of ruleset ✅
   * 
   */

  // 1. List/Get rulesets
  @Test
  public void testGetInstanceRulesets() throws Exception {
    try {
      GetInstanceRulesetsOptions getInstanceRulesetsOptions = new GetInstanceRulesetsOptions();

      // invoke service
      Response<ListRulesetsResp> response = service.getInstanceRulesets(getInstanceRulesetsOptions).execute();

      // validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListRulesetsResp listRulesetsRespResult = response.getResult();
      assertNotNull(listRulesetsRespResult);

      rulesets = listRulesetsRespResult.getResult();
      // System.out.println("rulesets list ===> " + rulesets);
      System.out.println("1. list/get rulesets ✅");

      // find a first custom ruleset
      // required to update the particular ruleset, because we only can update
      // custom ruleset and not managed

      firstCustomRulesetIndex = IntStream.range(0, rulesets.size())
          .filter(i -> ("http_request_firewall_custom".equalsIgnoreCase(rulesets.get(i).getPhase())
              && "custom".equalsIgnoreCase(rulesets.get(i).getKind())))
          .findFirst()
          .orElse(-1);

      System.out.println("first CustomRuleset Index => " + firstCustomRulesetIndex);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 2. get a rulset
  @Test(dependsOnMethods = { "testGetInstanceRulesets" })
  public void testGetInstanceRuleset() throws Exception {
    try {
      GetInstanceRulesetOptions getInstanceRulesetOptions = new GetInstanceRulesetOptions.Builder()
          .rulesetId(rulesets.get(firstCustomRulesetIndex).getId())
          .build();

      // Invoke operation
      Response<RulesetResp> response = service.getInstanceRuleset(getInstanceRulesetOptions).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesetResp rulesetRespResult = response.getResult();
      assertNotNull(rulesetRespResult);

      ruleset = rulesetRespResult.getResult();
      // System.out.println("ruleset ===> " + ruleset);
      System.out.println("2. get a ruleset ✅");
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 3. update a ruleset
  @Test(dependsOnMethods = { "testGetInstanceRulesets" })
  public void testUpdateInstanceRuleset() throws Exception {
    try {

      UpdateInstanceRulesetOptions options = new UpdateInstanceRulesetOptions.Builder()
          .rulesetId(rulesets.get(firstCustomRulesetIndex).getId())
          .description("updated description!")
          .build();

      // Invoke operation
      Response<RulesetResp> response = service.updateInstanceRuleset(options).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesetResp rulesetRespResult = response.getResult();
      assertNotNull(rulesetRespResult);

      updatedRuleset = rulesetRespResult.getResult();
      // System.out.println("test testEntrypointRuleset ===> " + updatedRuleset);

      System.out.println("3. update a ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 4. list versions of a ruleset
  @Test(dependsOnMethods = { "testGetInstanceRulesets" })
  public void testGetInstanceRulesetVersions() throws Exception {
    try {

      GetInstanceRulesetVersionsOptions options = new GetInstanceRulesetVersionsOptions.Builder()
          .rulesetId(rulesets.get(firstCustomRulesetIndex).getId())
          .build();

      // Invoke operation
      Response<ListRulesetsResp> response = service.getInstanceRulesetVersions(options)
          .execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListRulesetsResp listRulesetsRespResult = response.getResult();
      assertNotNull(listRulesetsRespResult);

      rulesetVersions = listRulesetsRespResult.getResult();
      // System.out
      // .println("list ruleset versions for ruleset_id " + rulesets.get(0).getId() +
      // " ====> " + rulesetVersions);

      System.out.println("4. list ruleset versions ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 5. get a specifig version of a ruleset
  @Test(dependsOnMethods = { "testGetInstanceRulesetVersions" })
  public void testGetInstanceRulesetVersion() throws Exception {
    try {

      String rulesetId = rulesets.get(firstCustomRulesetIndex).getId();
      String rulesetVersion = rulesetVersions.get(0).getVersion();
      GetInstanceRulesetVersionOptions options = new GetInstanceRulesetVersionOptions.Builder()
          .rulesetId(rulesetId)
          .rulesetVersion(rulesetVersion)
          .build();

      // Invoke operation
      Response<RulesetResp> response = service.getInstanceRulesetVersion(options)
          .execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesetResp rulesetResp = response.getResult();
      assertNotNull(rulesetResp);

      specificRuleset = rulesetResp.getResult();
      // System.out.println("get a " + rulesetVersion + " version of ruleset " +
      // rulesetId + " ====> " + specificRuleset);

      System.out.println("5. get a specific ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 6. get entrypoint rulesets
  @Test
  public void testGetInstanceEntryPointRulesets() throws Exception {

    try {
      GetInstanceEntrypointRulesetOptions options = new GetInstanceEntrypointRulesetOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .build();

      Response<RulesetResp> response = service.getInstanceEntrypointRuleset(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      entrypointRuleset = new HashMap<>();
      entrypointRuleset.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      // System.out.println("entrypoint ruleset ===> " + entrypointRuleset);
      System.out.println("6. get entrypoint rulesets ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 7. get versions of entrypoint ruleset
  @Test
  public void testGetInstanceEntryPointRulesetVersions() throws Exception {
    try {
      GetInstanceEntryPointRulesetVersionsOptions options = new GetInstanceEntryPointRulesetVersionsOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .build();

      Response<ListRulesetsResp> response = service.getInstanceEntryPointRulesetVersions(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      entrypointRulesetVersions = new HashMap<>();
      entrypointRulesetVersions.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      // System.out.println("entrypoint ruleset ===> " + entrypointRulesetVersions);
      System.out.println("7. get entrypoint ruleset versions ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 8. get specific entrypoint ruleset version
  @Test(dependsOnMethods = { "testGetInstanceEntryPointRulesetVersions" })
  public void testGetInstanceEntryPointRulesetVersion() throws Exception {
    try {
      GetInstanceEntryPointRulesetVersionOptions options = new GetInstanceEntryPointRulesetVersionOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .rulesetVersion(entrypointRulesetVersions.get(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM).get(0).getVersion())
          .build();

      Response<RulesetResp> response = service.getInstanceEntryPointRulesetVersion(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      specificEntrypointRulesetVersion = new HashMap<>();
      specificEntrypointRulesetVersion.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      // System.out.println("entrypoint ruleset version ===> " +
      // specificEntrypointRulesetVersion);
      System.out.println("8. get a specific entrypoint ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 9. get specific ruleset version by tag
  @Test(dependsOnMethods = { "testGetInstanceRulesets" })
  public void testGetInstanceEntryPointRulesetVersionByTag() throws Exception {
    try {

      ListedRuleset selectedRuleset = rulesets.get(0);

      GetInstanceRulesetVersionByTagOptions options = new GetInstanceRulesetVersionByTagOptions.Builder()
          .rulesetId(selectedRuleset.getId())
          .rulesetVersion(selectedRuleset.getVersion())
          .ruleTag("wordpress")
          .build();

      Response<RulesetResp> response = service.getInstanceRulesetVersionByTag(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("entrypoint ruleset version by tag ===> " +
      // response.getResult());
      System.out.println("9. get a specific entrypoint ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 10. update/create entrypoint ruleset
  @Test(dependsOnMethods = { "testGetInstanceRulesets",
      "testGetInstanceEntryPointRulesetVersion",
      "testGetInstanceRuleset" })
  public void testUpdateInstanceEntrypointRuleset() throws Exception {
    try {

      ActionParameters actionParametersModel = new ActionParameters.Builder()
          .id(ruleset.getId())
          .build();

      RuleCreate ruleCreateModel = new RuleCreate.Builder()
          .action("execute")
          .actionParameters(actionParametersModel)
          .expression("cf.zone.plan eq \"ENT\"")
          .build();

      UpdateInstanceEntrypointRulesetOptions opitons = new UpdateInstanceEntrypointRulesetOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .rules(Arrays.asList(ruleCreateModel))
          .build();

      Response<RulesetResp> response = service.updateInstanceEntrypointRuleset(opitons).execute();

      // System.out.println("updated entrypoint ruleset ===> " +
      // response.getResult());
      updatedEntrypointRuleset = new HashMap<>();
      updatedEntrypointRuleset.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      System.out.println("10. update a entrypoint ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 11. create a rule in ruleset
  @Test(dependsOnMethods = {
      "testGetInstanceRulesets", "testGetInstanceRuleset" })
  public void testCreateInstanceRulesetRule() throws Exception {

    try {

      CreateInstanceRulesetRuleOptions options = new CreateInstanceRulesetRuleOptions.Builder()
          .rulesetId(ruleset.getId())
          .expression("not http.request.uri.path matches \"^/api/.*$\"")
          .action("log")
          .description("log not /api")
          .build();

      Response<RulesetResp> response = service.createInstanceRulesetRule(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("new rule in ruleset ===> " + response.getResult());
      ruleset = response.getResult().getResult();
      System.out.println("11. create a rule in ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

  }

  // 12. update a rule in ruleset
  @Test(dependsOnMethods = {
      "testGetInstanceRulesets", "testGetInstanceRuleset", "testCreateInstanceRulesetRule"
  })
  public void testUpdateInstanceRulesetRule() throws Exception {

    try {

      UpdateInstanceRulesetRuleOptions options = new UpdateInstanceRulesetRuleOptions.Builder()
          .rulesetId(ruleset.getId())
          .ruleId(ruleset.getRules().get(0).getId())
          .expression("not http.request.uri.path matches \"^/newapi/.*$\"")
          .action("log")
          .description("log not /newapi")
          .build();

      Response<RulesetResp> response = service.updateInstanceRulesetRule(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("updated rule in ruleset ===> " + response.getResult());
      ruleset = response.getResult().getResult();
      System.out.println("12. update a rule in ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

  }

  // 13. delete a rule in ruleset
  @Test(dependsOnMethods = {
      "testGetInstanceRulesets", "testGetInstanceRuleset", "testCreateInstanceRulesetRule",
      "testUpdateInstanceRulesetRule"
  })
  public void testDeleteInstanceRulesetRule() throws Exception {

    try {

      DeleteInstanceRulesetRuleOptions options = new DeleteInstanceRulesetRuleOptions.Builder()
          .rulesetId(ruleset.getId())
          .ruleId(ruleset.getRules().get(0).getId())
          .build();

      Response<RuleResp> response = service.deleteInstanceRulesetRule(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("updated rule in ruleset ===> " + response.getResult());
      System.out.println("13. delete a rule in ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

  }

  // 14. delete a specifig version of a ruleset
  @Test(dependsOnMethods = { "testDeleteInstanceRulesetRule" })
  public void testDeleteInstanceRulesetVersion() throws Exception {
    try {

      String rulesetId = ruleset.getId();
      String rulesetVersion = String.valueOf(Integer.parseInt(ruleset.getVersion()) - 1);

      DeleteInstanceRulesetVersionOptions options = new DeleteInstanceRulesetVersionOptions.Builder()
          .rulesetId(rulesetId)
          .rulesetVersion(rulesetVersion)
          .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceRulesetVersion(options)
          .execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      System.out.println("14. delete a specific ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // /* ZONE RULESET TESTS */

  /*
   * 1. list rulesets
   * 2. get a ruleset
   * 3. update a ruleset
   * 4. list versions of a ruleset
   * 5. get a specific version of a ruleset
   * 6. get a entrypoint ruleset
   * 7. get versions of entrypoint ruleset
   * 8. get specific entrypoint ruleset version
   * 9. update/create entrypoint ruleset
   * 10. create a rule in ruleset
   * 11. update a rule in ruleset
   * 12. delete a rule in ruleset
   * 13. delete a specifig version of ruleset
   * 
   */

  // 1. list rulesets
  @Test(dependsOnMethods = { "testDeleteInstanceRulesetVersion" })
  public void testGetZoneRulesets() throws Exception {
    try {

      GetZoneRulesetsOptions options = new GetZoneRulesetsOptions();

      // invoke service
      Response<ListRulesetsResp> response = service.getZoneRulesets(options).execute();

      // validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListRulesetsResp listRulesetsRespResult = response.getResult();
      assertNotNull(listRulesetsRespResult);

      rulesets = listRulesetsRespResult.getResult();
      // System.out.println("rulesets list ===> " + rulesets);
      System.out.println("1. list/get rulesets ✅");

      // find a first custom ruleset
      // required to update the particular ruleset, because we only can update
      // custom ruleset and not managed

      firstCustomRulesetIndex = IntStream.range(0, rulesets.size())
          .filter(i -> ("http_request_firewall_custom".equalsIgnoreCase(rulesets.get(i).getPhase())
              && "zone".equalsIgnoreCase(rulesets.get(i).getKind())))
          .findFirst()
          .orElse(-1);

      System.out.println("first CustomRuleset Index => " + firstCustomRulesetIndex);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 2. get a rulset
  @Test(dependsOnMethods = { "testGetZoneRulesets" })
  public void testGetZoneRuleset() throws Exception {
    try {

      GetZoneRulesetOptions options = new GetZoneRulesetOptions.Builder()
          .rulesetId(rulesets.get(firstCustomRulesetIndex).getId())
          .build();

      // Invoke operation
      Response<RulesetResp> response = service.getZoneRuleset(options).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesetResp rulesetRespResult = response.getResult();
      assertNotNull(rulesetRespResult);

      ruleset = rulesetRespResult.getResult();
      // System.out.println("ruleset ===> " + ruleset);
      System.out.println("2. get a ruleset ✅");
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 3. update a ruleset
  @Test(dependsOnMethods = { "testGetZoneRulesets" })
  public void testUpdateZoneRuleset() throws Exception {
    try {

      UpdateZoneRulesetOptions options = new UpdateZoneRulesetOptions.Builder()
          .rulesetId(rulesets.get(firstCustomRulesetIndex).getId())
          .description("updated description!")
          .build();

      // Invoke operation
      Response<RulesetResp> response = service.updateZoneRuleset(options).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesetResp rulesetRespResult = response.getResult();
      assertNotNull(rulesetRespResult);

      updatedRuleset = rulesetRespResult.getResult();
      // System.out.println("test testEntrypointRuleset ===> " + updatedRuleset);

      System.out.println("3. update a ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 4. list versions of a ruleset
  @Test(dependsOnMethods = { "testGetZoneRulesets" })
  public void testGetZoneRulesetVersions() throws Exception {
    try {

      GetZoneRulesetVersionsOptions options = new GetZoneRulesetVersionsOptions.Builder()
          .rulesetId(rulesets.get(firstCustomRulesetIndex).getId())
          .build();

      // Invoke operation
      Response<ListRulesetsResp> response = service.getZoneRulesetVersions(options)
          .execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListRulesetsResp listRulesetsRespResult = response.getResult();
      assertNotNull(listRulesetsRespResult);

      rulesetVersions = listRulesetsRespResult.getResult();
      // System.out
      // .println("list ruleset versions for ruleset_id " + rulesets.get(0).getId() +
      // " ====> " + rulesetVersions);

      System.out.println("4. list ruleset versions ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 5. get a specifig version of a ruleset
  @Test(dependsOnMethods = { "testGetZoneRulesetVersions" })
  public void testGetZoneRulesetVersion() throws Exception {
    try {

      String rulesetId = rulesets.get(firstCustomRulesetIndex).getId();
      String rulesetVersion = rulesetVersions.get(0).getVersion();
      GetZoneRulesetVersionOptions options = new GetZoneRulesetVersionOptions.Builder()
          .rulesetId(rulesetId)
          .rulesetVersion(rulesetVersion)
          .build();

      // Invoke operation
      Response<RulesetResp> response = service.getZoneRulesetVersion(options)
          .execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesetResp rulesetResp = response.getResult();
      assertNotNull(rulesetResp);

      specificRuleset = rulesetResp.getResult();
      // System.out.println("get a " + rulesetVersion + " version of ruleset " +
      // rulesetId + " ====> " + specificRuleset);

      System.out.println("5. get a specific ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 6. get entrypoint rulesets
  @Test(dependsOnMethods = { "testGetInstanceEntryPointRulesets" })
  public void testGetZoneEntryPointRulesets() throws Exception {

    try {

      GetZoneEntrypointRulesetOptions options = new GetZoneEntrypointRulesetOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .build();

      Response<RulesetResp> response = service.getZoneEntrypointRuleset(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      entrypointRuleset = new HashMap<>();
      entrypointRuleset.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      // System.out.println("entrypoint ruleset ===> " + entrypointRuleset);
      System.out.println("6. get entrypoint rulesets ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 7. get versions of entrypoint ruleset
  @Test(dependsOnMethods = { "testGetInstanceEntryPointRulesetVersions" })
  public void testGetZoneEntryPointRulesetVersions() throws Exception {
    try {
      GetZoneEntryPointRulesetVersionsOptions options = new GetZoneEntryPointRulesetVersionsOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .build();

      Response<ListRulesetsResp> response = service.getZoneEntryPointRulesetVersions(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      entrypointRulesetVersions = new HashMap<>();
      entrypointRulesetVersions.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      // System.out.println("entrypoint ruleset ===> " + entrypointRulesetVersions);
      System.out.println("7. get entrypoint ruleset versions ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 8. get specific entrypoint ruleset version
  @Test(dependsOnMethods = { "testGetZoneEntryPointRulesetVersions" })
  public void testGetZoneEntryPointRulesetVersion() throws Exception {
    try {
      GetZoneEntryPointRulesetVersionOptions options = new GetZoneEntryPointRulesetVersionOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .rulesetVersion(entrypointRulesetVersions.get(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM).get(0).getVersion())
          .build();

      Response<RulesetResp> response = service.getZoneEntryPointRulesetVersion(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      specificEntrypointRulesetVersion = new HashMap<>();
      specificEntrypointRulesetVersion.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      // System.out.println("entrypoint ruleset version ===> " +
      // specificEntrypointRulesetVersion);
      System.out.println("8. get a specific entrypoint ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 9. update/create entrypoint ruleset
  @Test(dependsOnMethods = { "testGetZoneRulesets",
      "testGetZoneEntryPointRulesetVersion",
      "testGetZoneRuleset", "testDeleteZoneRulesetRule" })
  public void testUpdateZoneEntrypointRuleset() throws Exception {
    try {

      UpdateZoneEntrypointRulesetOptions opitons = new UpdateZoneEntrypointRulesetOptions.Builder()
          .rulesetPhase(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM)
          .description("updated entrypoint ruleset description!")
          .build();

      Response<RulesetResp> response = service.updateZoneEntrypointRuleset(opitons).execute();

      // System.out.println("updated entrypoint ruleset ===> " +
      // response.getResult());
      updatedEntrypointRuleset = new HashMap<>();
      updatedEntrypointRuleset.put(RulesetPhase.HTTP_REQUEST_FIREWALL_CUSTOM, response.getResult().getResult());

      System.out.println("9. update a entrypoint ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  // 10. create a rule in ruleset
  @Test(dependsOnMethods = {
      "testGetZoneRulesets", "testGetZoneRuleset" })
  public void testCreateZoneRulesetRule() throws Exception {

    try {

      CreateZoneRulesetRuleOptions options = new CreateZoneRulesetRuleOptions.Builder()
          .rulesetId(ruleset.getId())
          .expression("not http.request.uri.path matches \"^/api/.*$\"")
          .action("log")
          .description("log not /api")
          .build();

      Response<RulesetResp> response = service.createZoneRulesetRule(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("new rule in ruleset ===> " + response.getResult());
      ruleset = response.getResult().getResult();
      System.out.println("10. create a rule in ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

  }

  // 11. update a rule in ruleset
  @Test(dependsOnMethods = {
      "testGetZoneRulesets", "testGetZoneRuleset", "testCreateZoneRulesetRule"
  })
  public void testUpdateZoneRulesetRule() throws Exception {

    try {

      UpdateZoneRulesetRuleOptions options = new UpdateZoneRulesetRuleOptions.Builder()
          .rulesetId(ruleset.getId())
          .ruleId(ruleset.getRules().get(0).getId())
          .expression("not http.request.uri.path matches \"^/newapi/.*$\"")
          .action("log")
          .description("log not /newapi")
          .build();

      Response<RulesetResp> response = service.updateZoneRulesetRule(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("updated rule in ruleset ===> " + response.getResult());
      ruleset = response.getResult().getResult();
      System.out.println("11. update a rule in ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

  }

  // 12. delete a rule in ruleset
  @Test(dependsOnMethods = {
      "testGetZoneRulesets", "testGetZoneRuleset", "testCreateZoneRulesetRule", "testUpdateZoneRulesetRule"
  })
  public void testDeleteZoneRulesetRule() throws Exception {

    try {

      DeleteZoneRulesetRuleOptions options = new DeleteZoneRulesetRuleOptions.Builder()
          .rulesetId(ruleset.getId())
          .ruleId(ruleset.getRules().get(0).getId())
          .build();

      Response<RuleResp> response = service.deleteZoneRulesetRule(options).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      // System.out.println("updated rule in ruleset ===> " + response.getResult());
      System.out.println("12. delete a rule in ruleset ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

  }

  // 13. delete a specifig version of a ruleset
  @Test(dependsOnMethods = { "testDeleteZoneRulesetRule" })
  public void testDeleteZoneRulesetVersion() throws Exception {
    try {

      String rulesetId = ruleset.getId();
      String rulesetVersion = String.valueOf(Integer.parseInt(ruleset.getVersion()) - 1);

      DeleteZoneRulesetVersionOptions options = new DeleteZoneRulesetVersionOptions.Builder()
          .rulesetId(rulesetId)
          .rulesetVersion(rulesetVersion)
          .build();

      // Invoke operation
      Response<Void> response = service.deleteZoneRulesetVersion(options)
          .execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      System.out.println("13. delete a specific ruleset version ✅");

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {

    // cleanup those 2 dummy rulesets
    System.out.println("Clean up complete.");
  }
}
