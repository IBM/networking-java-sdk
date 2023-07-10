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

package com.ibm.cloud.networking.mtls.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.networking.mtls.v1.model.AccessAppResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessCertResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessCertSettingsInputArray;
import com.ibm.cloud.networking.mtls.v1.model.AccessCertSettingsResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessOrgResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessOrgRespResult;
import com.ibm.cloud.networking.mtls.v1.model.AccessPolicyResp;
import com.ibm.cloud.networking.mtls.v1.model.AppResult;
import com.ibm.cloud.networking.mtls.v1.model.CertResult;
import com.ibm.cloud.networking.mtls.v1.model.CertSettingsResult;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessAppResp;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessAppRespResult;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessOrganizationOptions;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessAppResp;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessAppRespResult;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessCertResp;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessCertRespResult;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessPolicyResp;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessPolicyRespResult;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessCertSettingsOptions;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessApplicationsOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessAppsResp;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessCertificatesOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessCertsResp;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessPoliciesOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessPoliciesResp;
import com.ibm.cloud.networking.mtls.v1.model.PolicyCnRuleCommonName;
import com.ibm.cloud.networking.mtls.v1.model.PolicyResult;
import com.ibm.cloud.networking.mtls.v1.model.PolicyRule;
import com.ibm.cloud.networking.mtls.v1.model.PolicyRulePolicyCertRule;
import com.ibm.cloud.networking.mtls.v1.model.PolicyRulePolicyCnRule;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessCertSettingsOptions;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Mtls service.
 */
public class MtlsIT extends SdkIntegrationTestBase {
  public Mtls service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = "testString";
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../mtls_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Mtls.newInstance(crn);
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Mtls.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testListAccessCertificates() throws Exception {
    try {
      ListAccessCertificatesOptions listAccessCertificatesOptions = new ListAccessCertificatesOptions.Builder()
        .zoneId("testString")
        .build();

      // Invoke operation
      Response<ListAccessCertsResp> response = service.listAccessCertificates(listAccessCertificatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListAccessCertsResp listAccessCertsRespResult = response.getResult();

      assertNotNull(listAccessCertsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAccessCertificates" })
  public void testCreateAccessCertificate() throws Exception {
    try {
      CreateAccessCertificateOptions createAccessCertificateOptions = new CreateAccessCertificateOptions.Builder()
        .zoneId("testString")
        .name("test-cert")
        .certificate("-----BEGIN CERTIFICATE-----\nMIIGAjCCA+qgAwIBAgIJAI7kymlF7CWT...N4RI7KKB7nikiuUf8vhULKy5IX10\nDrUtmu/B\n-----END CERTIFICATE-----")
        .associatedHostnames(java.util.Arrays.asList("test.example.com"))
        .build();

      // Invoke operation
      Response<AccessCertResp> response = service.createAccessCertificate(createAccessCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessCertResp accessCertRespResult = response.getResult();

      assertNotNull(accessCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateAccessCertificate" })
  public void testGetAccessCertificate() throws Exception {
    try {
      GetAccessCertificateOptions getAccessCertificateOptions = new GetAccessCertificateOptions.Builder()
        .zoneId("testString")
        .certId("testString")
        .build();

      // Invoke operation
      Response<AccessCertResp> response = service.getAccessCertificate(getAccessCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessCertResp accessCertRespResult = response.getResult();

      assertNotNull(accessCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAccessCertificate" })
  public void testUpdateAccessCertificate() throws Exception {
    try {
      UpdateAccessCertificateOptions updateAccessCertificateOptions = new UpdateAccessCertificateOptions.Builder()
        .zoneId("testString")
        .certId("testString")
        .name("test-cert")
        .associatedHostnames(java.util.Arrays.asList("test.example.com"))
        .build();

      // Invoke operation
      Response<AccessCertResp> response = service.updateAccessCertificate(updateAccessCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessCertResp accessCertRespResult = response.getResult();

      assertNotNull(accessCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateAccessCertificate" })
  public void testListAccessApplications() throws Exception {
    try {
      ListAccessApplicationsOptions listAccessApplicationsOptions = new ListAccessApplicationsOptions.Builder()
        .zoneId("testString")
        .build();

      // Invoke operation
      Response<ListAccessAppsResp> response = service.listAccessApplications(listAccessApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListAccessAppsResp listAccessAppsRespResult = response.getResult();

      assertNotNull(listAccessAppsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAccessApplications" })
  public void testCreateAccessApplication() throws Exception {
    try {
      CreateAccessApplicationOptions createAccessApplicationOptions = new CreateAccessApplicationOptions.Builder()
        .zoneId("testString")
        .name("mtls-test-app")
        .domain("test.example.com")
        .sessionDuration("24h")
        .build();

      // Invoke operation
      Response<CreateAccessAppResp> response = service.createAccessApplication(createAccessApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreateAccessAppResp createAccessAppRespResult = response.getResult();

      assertNotNull(createAccessAppRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateAccessApplication" })
  public void testGetAccessApplication() throws Exception {
    try {
      GetAccessApplicationOptions getAccessApplicationOptions = new GetAccessApplicationOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .build();

      // Invoke operation
      Response<AccessAppResp> response = service.getAccessApplication(getAccessApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessAppResp accessAppRespResult = response.getResult();

      assertNotNull(accessAppRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAccessApplication" })
  public void testUpdateAccessApplication() throws Exception {
    try {
      UpdateAccessApplicationOptions updateAccessApplicationOptions = new UpdateAccessApplicationOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .name("mtls-test-app")
        .domain("test.example.com")
        .sessionDuration("24h")
        .build();

      // Invoke operation
      Response<AccessAppResp> response = service.updateAccessApplication(updateAccessApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessAppResp accessAppRespResult = response.getResult();

      assertNotNull(accessAppRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateAccessApplication" })
  public void testListAccessPolicies() throws Exception {
    try {
      ListAccessPoliciesOptions listAccessPoliciesOptions = new ListAccessPoliciesOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .build();

      // Invoke operation
      Response<ListAccessPoliciesResp> response = service.listAccessPolicies(listAccessPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListAccessPoliciesResp listAccessPoliciesRespResult = response.getResult();

      assertNotNull(listAccessPoliciesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAccessPolicies" })
  public void testCreateAccessPolicy() throws Exception {
    try {
      PolicyRulePolicyCertRule policyRuleModel = new PolicyRulePolicyCertRule.Builder()
        .certificate(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CreateAccessPolicyOptions createAccessPolicyOptions = new CreateAccessPolicyOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .name("mtls-test-policy")
        .decision("non_identity")
        .include(java.util.Arrays.asList(policyRuleModel))
        .build();

      // Invoke operation
      Response<AccessPolicyResp> response = service.createAccessPolicy(createAccessPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessPolicyResp accessPolicyRespResult = response.getResult();

      assertNotNull(accessPolicyRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateAccessPolicy" })
  public void testGetAccessPolicy() throws Exception {
    try {
      GetAccessPolicyOptions getAccessPolicyOptions = new GetAccessPolicyOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .policyId("testString")
        .build();

      // Invoke operation
      Response<AccessPolicyResp> response = service.getAccessPolicy(getAccessPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessPolicyResp accessPolicyRespResult = response.getResult();

      assertNotNull(accessPolicyRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAccessPolicy" })
  public void testUpdateAccessPolicy() throws Exception {
    try {
      PolicyRulePolicyCertRule policyRuleModel = new PolicyRulePolicyCertRule.Builder()
        .certificate(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      UpdateAccessPolicyOptions updateAccessPolicyOptions = new UpdateAccessPolicyOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .policyId("testString")
        .name("mtls-test-policy")
        .decision("non_identity")
        .include(java.util.Arrays.asList(policyRuleModel))
        .build();

      // Invoke operation
      Response<AccessPolicyResp> response = service.updateAccessPolicy(updateAccessPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessPolicyResp accessPolicyRespResult = response.getResult();

      assertNotNull(accessPolicyRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateAccessPolicy" })
  public void testGetAccessCertSettings() throws Exception {
    try {
      GetAccessCertSettingsOptions getAccessCertSettingsOptions = new GetAccessCertSettingsOptions.Builder()
        .zoneId("testString")
        .build();

      // Invoke operation
      Response<AccessCertSettingsResp> response = service.getAccessCertSettings(getAccessCertSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessCertSettingsResp accessCertSettingsRespResult = response.getResult();

      assertNotNull(accessCertSettingsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAccessCertSettings" })
  public void testUpdateAccessCertSettings() throws Exception {
    try {
      AccessCertSettingsInputArray accessCertSettingsInputArrayModel = new AccessCertSettingsInputArray.Builder()
        .hostname("test.example.com")
        .clientCertificateForwarding(true)
        .build();

      UpdateAccessCertSettingsOptions updateAccessCertSettingsOptions = new UpdateAccessCertSettingsOptions.Builder()
        .zoneId("testString")
        .settings(java.util.Arrays.asList(accessCertSettingsInputArrayModel))
        .build();

      // Invoke operation
      Response<AccessCertSettingsResp> response = service.updateAccessCertSettings(updateAccessCertSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessCertSettingsResp accessCertSettingsRespResult = response.getResult();

      assertNotNull(accessCertSettingsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateAccessCertSettings" })
  public void testCreateAccessOrganization() throws Exception {
    try {
      CreateAccessOrganizationOptions createAccessOrganizationOptions = new CreateAccessOrganizationOptions.Builder()
        .name("MTLS enabled")
        .authDomain("01652b251c3ae2787110a995d8db0135.cloudflareaccess.com")
        .build();

      // Invoke operation
      Response<AccessOrgResp> response = service.createAccessOrganization(createAccessOrganizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessOrgResp accessOrgRespResult = response.getResult();

      assertNotNull(accessOrgRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateAccessOrganization" })
  public void testDeleteAccessCertificate() throws Exception {
    try {
      DeleteAccessCertificateOptions deleteAccessCertificateOptions = new DeleteAccessCertificateOptions.Builder()
        .zoneId("testString")
        .certId("testString")
        .build();

      // Invoke operation
      Response<DeleteAccessCertResp> response = service.deleteAccessCertificate(deleteAccessCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteAccessCertResp deleteAccessCertRespResult = response.getResult();

      assertNotNull(deleteAccessCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteAccessCertificate" })
  public void testDeleteAccessApplication() throws Exception {
    try {
      DeleteAccessApplicationOptions deleteAccessApplicationOptions = new DeleteAccessApplicationOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .build();

      // Invoke operation
      Response<DeleteAccessAppResp> response = service.deleteAccessApplication(deleteAccessApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteAccessAppResp deleteAccessAppRespResult = response.getResult();

      assertNotNull(deleteAccessAppRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteAccessApplication" })
  public void testDeleteAccessPolicy() throws Exception {
    try {
      DeleteAccessPolicyOptions deleteAccessPolicyOptions = new DeleteAccessPolicyOptions.Builder()
        .zoneId("testString")
        .appId("testString")
        .policyId("testString")
        .build();

      // Invoke operation
      Response<DeleteAccessPolicyResp> response = service.deleteAccessPolicy(deleteAccessPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteAccessPolicyResp deleteAccessPolicyRespResult = response.getResult();

      assertNotNull(deleteAccessPolicyRespResult);
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
