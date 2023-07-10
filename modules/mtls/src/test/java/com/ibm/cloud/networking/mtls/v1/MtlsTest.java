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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.mtls.v1.Mtls;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Mtls service.
 */
public class MtlsTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Mtls mtlsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    new Mtls(crn, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(mtlsService.getCrn(), "testString");
  }

  // Test the listAccessCertificates operation with a valid options model parameter
  @Test
  public void testListAccessCertificatesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"21a41336-9001-42c4-8440-c79e0cb86e1f\", \"name\": \"test-cert\", \"fingerprint\": \"MD5 Fingerprint=38:38:B4:FB:3C:33:CE:2C:8E:8E:D1:1B:94:70:C1:5F\", \"associated_hostnames\": [\"test.example.com\"], \"created_at\": \"2021-04-19T11:09:11Z\", \"updated_at\": \"2021-04-19T11:09:11Z\", \"expires_on\": \"2026-04-18T06:26:00Z\"}]}";
    String listAccessCertificatesPath = "/v1/testString/zones/testString/access/certificates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAccessCertificatesOptions model
    ListAccessCertificatesOptions listAccessCertificatesOptionsModel = new ListAccessCertificatesOptions.Builder()
      .zoneId("testString")
      .build();

    // Invoke listAccessCertificates() with a valid options model and verify the result
    Response<ListAccessCertsResp> response = mtlsService.listAccessCertificates(listAccessCertificatesOptionsModel).execute();
    assertNotNull(response);
    ListAccessCertsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAccessCertificatesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listAccessCertificates operation with and without retries enabled
  @Test
  public void testListAccessCertificatesWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testListAccessCertificatesWOptions();

    mtlsService.disableRetries();
    testListAccessCertificatesWOptions();
  }

  // Test the listAccessCertificates operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAccessCertificatesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.listAccessCertificates(null).execute();
  }

  // Test the createAccessCertificate operation with a valid options model parameter
  @Test
  public void testCreateAccessCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"21a41336-9001-42c4-8440-c79e0cb86e1f\", \"name\": \"test-cert\", \"fingerprint\": \"MD5 Fingerprint=38:38:B4:FB:3C:33:CE:2C:8E:8E:D1:1B:94:70:C1:5F\", \"associated_hostnames\": [\"test.example.com\"], \"created_at\": \"2021-04-19T11:09:11Z\", \"updated_at\": \"2021-04-19T11:09:11Z\", \"expires_on\": \"2026-04-18T06:26:00Z\"}}";
    String createAccessCertificatePath = "/v1/testString/zones/testString/access/certificates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateAccessCertificateOptions model
    CreateAccessCertificateOptions createAccessCertificateOptionsModel = new CreateAccessCertificateOptions.Builder()
      .zoneId("testString")
      .name("test-cert")
      .certificate("-----BEGIN CERTIFICATE-----\nMIIGAjCCA+qgAwIBAgIJAI7kymlF7CWT...N4RI7KKB7nikiuUf8vhULKy5IX10\nDrUtmu/B\n-----END CERTIFICATE-----")
      .associatedHostnames(java.util.Arrays.asList("test.example.com"))
      .build();

    // Invoke createAccessCertificate() with a valid options model and verify the result
    Response<AccessCertResp> response = mtlsService.createAccessCertificate(createAccessCertificateOptionsModel).execute();
    assertNotNull(response);
    AccessCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAccessCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createAccessCertificate operation with and without retries enabled
  @Test
  public void testCreateAccessCertificateWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testCreateAccessCertificateWOptions();

    mtlsService.disableRetries();
    testCreateAccessCertificateWOptions();
  }

  // Test the createAccessCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAccessCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.createAccessCertificate(null).execute();
  }

  // Test the getAccessCertificate operation with a valid options model parameter
  @Test
  public void testGetAccessCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"21a41336-9001-42c4-8440-c79e0cb86e1f\", \"name\": \"test-cert\", \"fingerprint\": \"MD5 Fingerprint=38:38:B4:FB:3C:33:CE:2C:8E:8E:D1:1B:94:70:C1:5F\", \"associated_hostnames\": [\"test.example.com\"], \"created_at\": \"2021-04-19T11:09:11Z\", \"updated_at\": \"2021-04-19T11:09:11Z\", \"expires_on\": \"2026-04-18T06:26:00Z\"}}";
    String getAccessCertificatePath = "/v1/testString/zones/testString/access/certificates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAccessCertificateOptions model
    GetAccessCertificateOptions getAccessCertificateOptionsModel = new GetAccessCertificateOptions.Builder()
      .zoneId("testString")
      .certId("testString")
      .build();

    // Invoke getAccessCertificate() with a valid options model and verify the result
    Response<AccessCertResp> response = mtlsService.getAccessCertificate(getAccessCertificateOptionsModel).execute();
    assertNotNull(response);
    AccessCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAccessCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAccessCertificate operation with and without retries enabled
  @Test
  public void testGetAccessCertificateWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testGetAccessCertificateWOptions();

    mtlsService.disableRetries();
    testGetAccessCertificateWOptions();
  }

  // Test the getAccessCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAccessCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.getAccessCertificate(null).execute();
  }

  // Test the updateAccessCertificate operation with a valid options model parameter
  @Test
  public void testUpdateAccessCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"21a41336-9001-42c4-8440-c79e0cb86e1f\", \"name\": \"test-cert\", \"fingerprint\": \"MD5 Fingerprint=38:38:B4:FB:3C:33:CE:2C:8E:8E:D1:1B:94:70:C1:5F\", \"associated_hostnames\": [\"test.example.com\"], \"created_at\": \"2021-04-19T11:09:11Z\", \"updated_at\": \"2021-04-19T11:09:11Z\", \"expires_on\": \"2026-04-18T06:26:00Z\"}}";
    String updateAccessCertificatePath = "/v1/testString/zones/testString/access/certificates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateAccessCertificateOptions model
    UpdateAccessCertificateOptions updateAccessCertificateOptionsModel = new UpdateAccessCertificateOptions.Builder()
      .zoneId("testString")
      .certId("testString")
      .name("test-cert")
      .associatedHostnames(java.util.Arrays.asList("test.example.com"))
      .build();

    // Invoke updateAccessCertificate() with a valid options model and verify the result
    Response<AccessCertResp> response = mtlsService.updateAccessCertificate(updateAccessCertificateOptionsModel).execute();
    assertNotNull(response);
    AccessCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAccessCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAccessCertificate operation with and without retries enabled
  @Test
  public void testUpdateAccessCertificateWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testUpdateAccessCertificateWOptions();

    mtlsService.disableRetries();
    testUpdateAccessCertificateWOptions();
  }

  // Test the updateAccessCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.updateAccessCertificate(null).execute();
  }

  // Test the deleteAccessCertificate operation with a valid options model parameter
  @Test
  public void testDeleteAccessCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"21a41336-9001-42c4-8440-c79e0cb86e1f\"}}";
    String deleteAccessCertificatePath = "/v1/testString/zones/testString/access/certificates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAccessCertificateOptions model
    DeleteAccessCertificateOptions deleteAccessCertificateOptionsModel = new DeleteAccessCertificateOptions.Builder()
      .zoneId("testString")
      .certId("testString")
      .build();

    // Invoke deleteAccessCertificate() with a valid options model and verify the result
    Response<DeleteAccessCertResp> response = mtlsService.deleteAccessCertificate(deleteAccessCertificateOptionsModel).execute();
    assertNotNull(response);
    DeleteAccessCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAccessCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAccessCertificate operation with and without retries enabled
  @Test
  public void testDeleteAccessCertificateWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testDeleteAccessCertificateWOptions();

    mtlsService.disableRetries();
    testDeleteAccessCertificateWOptions();
  }

  // Test the deleteAccessCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAccessCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.deleteAccessCertificate(null).execute();
  }

  // Test the listAccessApplications operation with a valid options model parameter
  @Test
  public void testListAccessApplicationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"name\": \"mtls-test-app\", \"domain\": \"test.example.com\", \"aud\": \"f8e1744453ea3679d919fdc6db58cff648f2b14b33a729f780fc02e75a42a008\", \"policies\": [{\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}], \"allowed_idps\": [\"699d98642c564d2e855e9661899b7252\"], \"auto_redirect_to_identity\": false, \"session_duration\": \"24h\", \"type\": \"self_hosted\", \"uid\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"created_at\": \"2021-04-19T07:59:49Z\", \"updated_at\": \"2021-04-19T07:59:49Z\"}]}";
    String listAccessApplicationsPath = "/v1/testString/zones/testString/access/apps";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAccessApplicationsOptions model
    ListAccessApplicationsOptions listAccessApplicationsOptionsModel = new ListAccessApplicationsOptions.Builder()
      .zoneId("testString")
      .build();

    // Invoke listAccessApplications() with a valid options model and verify the result
    Response<ListAccessAppsResp> response = mtlsService.listAccessApplications(listAccessApplicationsOptionsModel).execute();
    assertNotNull(response);
    ListAccessAppsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAccessApplicationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listAccessApplications operation with and without retries enabled
  @Test
  public void testListAccessApplicationsWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testListAccessApplicationsWOptions();

    mtlsService.disableRetries();
    testListAccessApplicationsWOptions();
  }

  // Test the listAccessApplications operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAccessApplicationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.listAccessApplications(null).execute();
  }

  // Test the createAccessApplication operation with a valid options model parameter
  @Test
  public void testCreateAccessApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"name\": \"mtls-test-app\", \"domain\": \"test.example.com\", \"aud\": \"f8e1744453ea3679d919fdc6db58cff648f2b14b33a729f780fc02e75a42a008\", \"policies\": [{\"anyKey\": \"anyValue\"}], \"allowed_idps\": [\"allowedIdps\"], \"auto_redirect_to_identity\": false, \"session_duration\": \"24h\", \"type\": \"self_hosted\", \"uid\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"created_at\": \"2021-04-19T07:59:49Z\", \"updated_at\": \"2021-04-19T07:59:49Z\"}}";
    String createAccessApplicationPath = "/v1/testString/zones/testString/access/apps";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateAccessApplicationOptions model
    CreateAccessApplicationOptions createAccessApplicationOptionsModel = new CreateAccessApplicationOptions.Builder()
      .zoneId("testString")
      .name("mtls-test-app")
      .domain("test.example.com")
      .sessionDuration("24h")
      .build();

    // Invoke createAccessApplication() with a valid options model and verify the result
    Response<CreateAccessAppResp> response = mtlsService.createAccessApplication(createAccessApplicationOptionsModel).execute();
    assertNotNull(response);
    CreateAccessAppResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAccessApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createAccessApplication operation with and without retries enabled
  @Test
  public void testCreateAccessApplicationWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testCreateAccessApplicationWOptions();

    mtlsService.disableRetries();
    testCreateAccessApplicationWOptions();
  }

  // Test the createAccessApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAccessApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.createAccessApplication(null).execute();
  }

  // Test the getAccessApplication operation with a valid options model parameter
  @Test
  public void testGetAccessApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"name\": \"mtls-test-app\", \"domain\": \"test.example.com\", \"aud\": \"f8e1744453ea3679d919fdc6db58cff648f2b14b33a729f780fc02e75a42a008\", \"policies\": [{\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}], \"allowed_idps\": [\"699d98642c564d2e855e9661899b7252\"], \"auto_redirect_to_identity\": false, \"session_duration\": \"24h\", \"type\": \"self_hosted\", \"uid\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"created_at\": \"2021-04-19T07:59:49Z\", \"updated_at\": \"2021-04-19T07:59:49Z\"}}";
    String getAccessApplicationPath = "/v1/testString/zones/testString/access/apps/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAccessApplicationOptions model
    GetAccessApplicationOptions getAccessApplicationOptionsModel = new GetAccessApplicationOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .build();

    // Invoke getAccessApplication() with a valid options model and verify the result
    Response<AccessAppResp> response = mtlsService.getAccessApplication(getAccessApplicationOptionsModel).execute();
    assertNotNull(response);
    AccessAppResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAccessApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAccessApplication operation with and without retries enabled
  @Test
  public void testGetAccessApplicationWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testGetAccessApplicationWOptions();

    mtlsService.disableRetries();
    testGetAccessApplicationWOptions();
  }

  // Test the getAccessApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAccessApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.getAccessApplication(null).execute();
  }

  // Test the updateAccessApplication operation with a valid options model parameter
  @Test
  public void testUpdateAccessApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"name\": \"mtls-test-app\", \"domain\": \"test.example.com\", \"aud\": \"f8e1744453ea3679d919fdc6db58cff648f2b14b33a729f780fc02e75a42a008\", \"policies\": [{\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}], \"allowed_idps\": [\"699d98642c564d2e855e9661899b7252\"], \"auto_redirect_to_identity\": false, \"session_duration\": \"24h\", \"type\": \"self_hosted\", \"uid\": \"de4526d6-d125-4f95-906f-1757510a9cd8\", \"created_at\": \"2021-04-19T07:59:49Z\", \"updated_at\": \"2021-04-19T07:59:49Z\"}}";
    String updateAccessApplicationPath = "/v1/testString/zones/testString/access/apps/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateAccessApplicationOptions model
    UpdateAccessApplicationOptions updateAccessApplicationOptionsModel = new UpdateAccessApplicationOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .name("mtls-test-app")
      .domain("test.example.com")
      .sessionDuration("24h")
      .build();

    // Invoke updateAccessApplication() with a valid options model and verify the result
    Response<AccessAppResp> response = mtlsService.updateAccessApplication(updateAccessApplicationOptionsModel).execute();
    assertNotNull(response);
    AccessAppResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAccessApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAccessApplication operation with and without retries enabled
  @Test
  public void testUpdateAccessApplicationWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testUpdateAccessApplicationWOptions();

    mtlsService.disableRetries();
    testUpdateAccessApplicationWOptions();
  }

  // Test the updateAccessApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.updateAccessApplication(null).execute();
  }

  // Test the deleteAccessApplication operation with a valid options model parameter
  @Test
  public void testDeleteAccessApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"de4526d6-d125-4f95-906f-1757510a9cd8\"}}";
    String deleteAccessApplicationPath = "/v1/testString/zones/testString/access/apps/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAccessApplicationOptions model
    DeleteAccessApplicationOptions deleteAccessApplicationOptionsModel = new DeleteAccessApplicationOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .build();

    // Invoke deleteAccessApplication() with a valid options model and verify the result
    Response<DeleteAccessAppResp> response = mtlsService.deleteAccessApplication(deleteAccessApplicationOptionsModel).execute();
    assertNotNull(response);
    DeleteAccessAppResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAccessApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAccessApplication operation with and without retries enabled
  @Test
  public void testDeleteAccessApplicationWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testDeleteAccessApplicationWOptions();

    mtlsService.disableRetries();
    testDeleteAccessApplicationWOptions();
  }

  // Test the deleteAccessApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAccessApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.deleteAccessApplication(null).execute();
  }

  // Test the listAccessPolicies operation with a valid options model parameter
  @Test
  public void testListAccessPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}]}";
    String listAccessPoliciesPath = "/v1/testString/zones/testString/access/apps/testString/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAccessPoliciesOptions model
    ListAccessPoliciesOptions listAccessPoliciesOptionsModel = new ListAccessPoliciesOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .build();

    // Invoke listAccessPolicies() with a valid options model and verify the result
    Response<ListAccessPoliciesResp> response = mtlsService.listAccessPolicies(listAccessPoliciesOptionsModel).execute();
    assertNotNull(response);
    ListAccessPoliciesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAccessPoliciesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listAccessPolicies operation with and without retries enabled
  @Test
  public void testListAccessPoliciesWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testListAccessPoliciesWOptions();

    mtlsService.disableRetries();
    testListAccessPoliciesWOptions();
  }

  // Test the listAccessPolicies operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAccessPoliciesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.listAccessPolicies(null).execute();
  }

  // Test the createAccessPolicy operation with a valid options model parameter
  @Test
  public void testCreateAccessPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}}";
    String createAccessPolicyPath = "/v1/testString/zones/testString/access/apps/testString/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PolicyRulePolicyCertRule model
    PolicyRulePolicyCertRule policyRuleModel = new PolicyRulePolicyCertRule.Builder()
      .certificate(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the CreateAccessPolicyOptions model
    CreateAccessPolicyOptions createAccessPolicyOptionsModel = new CreateAccessPolicyOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .name("mtls-test-policy")
      .decision("non_identity")
      .include(java.util.Arrays.asList(policyRuleModel))
      .build();

    // Invoke createAccessPolicy() with a valid options model and verify the result
    Response<AccessPolicyResp> response = mtlsService.createAccessPolicy(createAccessPolicyOptionsModel).execute();
    assertNotNull(response);
    AccessPolicyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAccessPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createAccessPolicy operation with and without retries enabled
  @Test
  public void testCreateAccessPolicyWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testCreateAccessPolicyWOptions();

    mtlsService.disableRetries();
    testCreateAccessPolicyWOptions();
  }

  // Test the createAccessPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAccessPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.createAccessPolicy(null).execute();
  }

  // Test the getAccessPolicy operation with a valid options model parameter
  @Test
  public void testGetAccessPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}}";
    String getAccessPolicyPath = "/v1/testString/zones/testString/access/apps/testString/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAccessPolicyOptions model
    GetAccessPolicyOptions getAccessPolicyOptionsModel = new GetAccessPolicyOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .policyId("testString")
      .build();

    // Invoke getAccessPolicy() with a valid options model and verify the result
    Response<AccessPolicyResp> response = mtlsService.getAccessPolicy(getAccessPolicyOptionsModel).execute();
    assertNotNull(response);
    AccessPolicyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAccessPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAccessPolicy operation with and without retries enabled
  @Test
  public void testGetAccessPolicyWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testGetAccessPolicyWOptions();

    mtlsService.disableRetries();
    testGetAccessPolicyWOptions();
  }

  // Test the getAccessPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAccessPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.getAccessPolicy(null).execute();
  }

  // Test the updateAccessPolicy operation with a valid options model parameter
  @Test
  public void testUpdateAccessPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"name\": \"mtls-test-policy\", \"decision\": \"non_identity\", \"include\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"exclude\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"precedence\": 1, \"require\": [{\"certificate\": {\"anyKey\": \"anyValue\"}}], \"uid\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\", \"created_at\": \"2021-04-19T08:01:21Z\", \"updated_at\": \"2021-04-19T08:01:21Z\"}}";
    String updateAccessPolicyPath = "/v1/testString/zones/testString/access/apps/testString/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PolicyRulePolicyCertRule model
    PolicyRulePolicyCertRule policyRuleModel = new PolicyRulePolicyCertRule.Builder()
      .certificate(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the UpdateAccessPolicyOptions model
    UpdateAccessPolicyOptions updateAccessPolicyOptionsModel = new UpdateAccessPolicyOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .policyId("testString")
      .name("mtls-test-policy")
      .decision("non_identity")
      .include(java.util.Arrays.asList(policyRuleModel))
      .build();

    // Invoke updateAccessPolicy() with a valid options model and verify the result
    Response<AccessPolicyResp> response = mtlsService.updateAccessPolicy(updateAccessPolicyOptionsModel).execute();
    assertNotNull(response);
    AccessPolicyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAccessPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAccessPolicy operation with and without retries enabled
  @Test
  public void testUpdateAccessPolicyWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testUpdateAccessPolicyWOptions();

    mtlsService.disableRetries();
    testUpdateAccessPolicyWOptions();
  }

  // Test the updateAccessPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.updateAccessPolicy(null).execute();
  }

  // Test the deleteAccessPolicy operation with a valid options model parameter
  @Test
  public void testDeleteAccessPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"acabcdb1-afb3-4f61-9dae-d1a353a93661\"}}";
    String deleteAccessPolicyPath = "/v1/testString/zones/testString/access/apps/testString/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAccessPolicyOptions model
    DeleteAccessPolicyOptions deleteAccessPolicyOptionsModel = new DeleteAccessPolicyOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .policyId("testString")
      .build();

    // Invoke deleteAccessPolicy() with a valid options model and verify the result
    Response<DeleteAccessPolicyResp> response = mtlsService.deleteAccessPolicy(deleteAccessPolicyOptionsModel).execute();
    assertNotNull(response);
    DeleteAccessPolicyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAccessPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAccessPolicy operation with and without retries enabled
  @Test
  public void testDeleteAccessPolicyWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testDeleteAccessPolicyWOptions();

    mtlsService.disableRetries();
    testDeleteAccessPolicyWOptions();
  }

  // Test the deleteAccessPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAccessPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.deleteAccessPolicy(null).execute();
  }

  // Test the getAccessCertSettings operation with a valid options model parameter
  @Test
  public void testGetAccessCertSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"hostname\": \"test.example.com\", \"china_network\": false, \"client_certificate_forwarding\": true}]}";
    String getAccessCertSettingsPath = "/v1/testString/zones/testString/access/certificates/settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAccessCertSettingsOptions model
    GetAccessCertSettingsOptions getAccessCertSettingsOptionsModel = new GetAccessCertSettingsOptions.Builder()
      .zoneId("testString")
      .build();

    // Invoke getAccessCertSettings() with a valid options model and verify the result
    Response<AccessCertSettingsResp> response = mtlsService.getAccessCertSettings(getAccessCertSettingsOptionsModel).execute();
    assertNotNull(response);
    AccessCertSettingsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAccessCertSettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAccessCertSettings operation with and without retries enabled
  @Test
  public void testGetAccessCertSettingsWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testGetAccessCertSettingsWOptions();

    mtlsService.disableRetries();
    testGetAccessCertSettingsWOptions();
  }

  // Test the getAccessCertSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAccessCertSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.getAccessCertSettings(null).execute();
  }

  // Test the updateAccessCertSettings operation with a valid options model parameter
  @Test
  public void testUpdateAccessCertSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"hostname\": \"test.example.com\", \"china_network\": false, \"client_certificate_forwarding\": true}]}";
    String updateAccessCertSettingsPath = "/v1/testString/zones/testString/access/certificates/settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AccessCertSettingsInputArray model
    AccessCertSettingsInputArray accessCertSettingsInputArrayModel = new AccessCertSettingsInputArray.Builder()
      .hostname("test.example.com")
      .clientCertificateForwarding(true)
      .build();

    // Construct an instance of the UpdateAccessCertSettingsOptions model
    UpdateAccessCertSettingsOptions updateAccessCertSettingsOptionsModel = new UpdateAccessCertSettingsOptions.Builder()
      .zoneId("testString")
      .settings(java.util.Arrays.asList(accessCertSettingsInputArrayModel))
      .build();

    // Invoke updateAccessCertSettings() with a valid options model and verify the result
    Response<AccessCertSettingsResp> response = mtlsService.updateAccessCertSettings(updateAccessCertSettingsOptionsModel).execute();
    assertNotNull(response);
    AccessCertSettingsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAccessCertSettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAccessCertSettings operation with and without retries enabled
  @Test
  public void testUpdateAccessCertSettingsWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testUpdateAccessCertSettingsWOptions();

    mtlsService.disableRetries();
    testUpdateAccessCertSettingsWOptions();
  }

  // Test the updateAccessCertSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessCertSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mtlsService.updateAccessCertSettings(null).execute();
  }

  // Test the createAccessOrganization operation with a valid options model parameter
  @Test
  public void testCreateAccessOrganizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"auth_domain\": \"01652b251c3ae2787110a995d8db0135.cloudflareaccess.com\", \"name\": \"MTLS enabled\", \"login_design\": {\"anyKey\": \"anyValue\"}, \"created_at\": \"2019-08-13T16:31:42Z\", \"updated_at\": \"2019-08-13T16:31:42Z\"}}";
    String createAccessOrganizationPath = "/v1/testString/access/organizations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateAccessOrganizationOptions model
    CreateAccessOrganizationOptions createAccessOrganizationOptionsModel = new CreateAccessOrganizationOptions.Builder()
      .name("MTLS enabled")
      .authDomain("01652b251c3ae2787110a995d8db0135.cloudflareaccess.com")
      .build();

    // Invoke createAccessOrganization() with a valid options model and verify the result
    Response<AccessOrgResp> response = mtlsService.createAccessOrganization(createAccessOrganizationOptionsModel).execute();
    assertNotNull(response);
    AccessOrgResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAccessOrganizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createAccessOrganization operation with and without retries enabled
  @Test
  public void testCreateAccessOrganizationWRetries() throws Throwable {
    mtlsService.enableRetries(4, 30);
    testCreateAccessOrganizationWOptions();

    mtlsService.disableRetries();
    testCreateAccessOrganizationWOptions();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    mtlsService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    mtlsService = Mtls.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    mtlsService.setServiceUrl(url);
  }
}