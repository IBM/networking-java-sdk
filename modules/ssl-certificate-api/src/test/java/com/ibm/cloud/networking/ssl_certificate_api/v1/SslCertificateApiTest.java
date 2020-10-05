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
package com.ibm.cloud.networking.ssl_certificate_api.v1;

import com.ibm.cloud.networking.ssl_certificate_api.v1.SslCertificateApi;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CertPriorityReqCertificatesItem;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Certificate;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeCertificatePriorityOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeSslSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeTls12SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeTls13SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeUniversalCertificateSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertPack;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertReqGeoRestrictions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DedicatedCertificatePack;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DeleteCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DeleteCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetSslSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetTls12SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetTls13SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetUniversalCertificateSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCertificateResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCertificatesOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCustomCertificatesOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCustomCertsResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.OrderCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ResultInfo;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSetting;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingRespMessagesItem;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingRespResult;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls13SettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls13SettingRespResult;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UniversalSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UniversalSettingRespResult;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UpdateCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UploadCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SslCertificateApi service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class SslCertificateApiTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected SslCertificateApi sslCertificateApiService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    sslCertificateApiService = SslCertificateApi.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    sslCertificateApiService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    new SslCertificateApi(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(sslCertificateApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(sslCertificateApiService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListCertificatesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": [{\"id\": \"0f405ba2-8c18-49eb-a30b-28b85427780f\", \"type\": \"dedicated\", \"hosts\": [\"example.com\"], \"certificates\": [{\"id\": \"436627\", \"hosts\": [\"example.com\"], \"status\": \"active\"}], \"primary_certificate\": 0, \"status\": \"active\"}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String listCertificatesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/ssl/certificate_packs", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCertificatesOptions model
    ListCertificatesOptions listCertificatesOptionsModel = new ListCertificatesOptions.Builder()
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListCertificateResp> response = sslCertificateApiService.listCertificates(listCertificatesOptionsModel).execute();
    assertNotNull(response);
    ListCertificateResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCertificatesPath);
  }

  @Test
  public void testOrderCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"0f405ba2-8c18-49eb-a30b-28b85427780f\", \"type\": \"dedicated\", \"hosts\": [\"example.com\"], \"certificates\": [{\"id\": \"436627\", \"hosts\": [\"example.com\"], \"status\": \"active\"}], \"primary_certificate\": 0, \"status\": \"active\"}";
    String orderCertificatePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/ssl/certificate_packs", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the OrderCertificateOptions model
    OrderCertificateOptions orderCertificateOptionsModel = new OrderCertificateOptions.Builder()
    .type("dedicated")
    .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("example.com")))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DedicatedCertificatePack> response = sslCertificateApiService.orderCertificate(orderCertificateOptionsModel).execute();
    assertNotNull(response);
    DedicatedCertificatePack responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, orderCertificatePath);
  }

  @Test
  public void testDeleteCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCertificatePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/ssl/certificate_packs/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCertificateOptions model
    DeleteCertificateOptions deleteCertificateOptionsModel = new DeleteCertificateOptions.Builder()
    .certIdentifier("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = sslCertificateApiService.deleteCertificate(deleteCertificateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCertificatePath);
  }

  // Test the deleteCertificate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCertificateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    sslCertificateApiService.deleteCertificate(null).execute();
  }

  @Test
  public void testGetSslSettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"result\": {\"id\": \"ssl\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.12345Z\"}, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String getSslSettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ssl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSslSettingOptions model
    GetSslSettingOptions getSslSettingOptionsModel = new GetSslSettingOptions();

    // Invoke operation with valid options model (positive test)
    Response<SslSettingResp> response = sslCertificateApiService.getSslSetting(getSslSettingOptionsModel).execute();
    assertNotNull(response);
    SslSettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSslSettingPath);
  }

  @Test
  public void testChangeSslSettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"result\": {\"id\": \"ssl\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.12345Z\"}, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String changeSslSettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ssl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ChangeSslSettingOptions model
    ChangeSslSettingOptions changeSslSettingOptionsModel = new ChangeSslSettingOptions.Builder()
    .value("off")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SslSettingResp> response = sslCertificateApiService.changeSslSetting(changeSslSettingOptionsModel).execute();
    assertNotNull(response);
    SslSettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, changeSslSettingPath);
  }

  @Test
  public void testListCustomCertificatesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": [{\"id\": \"0f405ba2-8c18-49eb-a30b-28b85427780f\", \"hosts\": [\"example.com\"], \"issuer\": \"/Country=US/Organization=Lets Encrypt/CommonName=Lets Encrypt Authority X3\", \"signature\": \"SHA256WithRSA\", \"status\": \"active\", \"bundle_method\": \"bundleMethod\", \"zone_id\": \"zoneId\", \"uploaded_on\": \"uploadedOn\", \"modified_on\": \"modifiedOn\", \"expires_on\": \"expiresOn\", \"priority\": 8}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String listCustomCertificatesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_certificates", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCustomCertificatesOptions model
    ListCustomCertificatesOptions listCustomCertificatesOptionsModel = new ListCustomCertificatesOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListCustomCertsResp> response = sslCertificateApiService.listCustomCertificates(listCustomCertificatesOptionsModel).execute();
    assertNotNull(response);
    ListCustomCertsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCustomCertificatesPath);
  }

  @Test
  public void testUploadCustomCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"0f405ba2-8c18-49eb-a30b-28b85427780f\", \"hosts\": [\"example.com\"], \"issuer\": \"/Country=US/Organization=Lets Encrypt/CommonName=Lets Encrypt Authority X3\", \"signature\": \"SHA256WithRSA\", \"status\": \"active\", \"bundle_method\": \"bundleMethod\", \"zone_id\": \"zoneId\", \"uploaded_on\": \"uploadedOn\", \"modified_on\": \"modifiedOn\", \"expires_on\": \"expiresOn\", \"priority\": 8}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String uploadCustomCertificatePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_certificates", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CustomCertReqGeoRestrictions model
    CustomCertReqGeoRestrictions customCertReqGeoRestrictionsModel = new CustomCertReqGeoRestrictions.Builder()
    .label("us")
    .build();

    // Construct an instance of the UploadCustomCertificateOptions model
    UploadCustomCertificateOptions uploadCustomCertificateOptionsModel = new UploadCustomCertificateOptions.Builder()
    .certificate("testString")
    .privateKey("testString")
    .bundleMethod("ubiquitous")
    .geoRestrictions(customCertReqGeoRestrictionsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomCertResp> response = sslCertificateApiService.uploadCustomCertificate(uploadCustomCertificateOptionsModel).execute();
    assertNotNull(response);
    CustomCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, uploadCustomCertificatePath);
  }

  @Test
  public void testGetCustomCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"0f405ba2-8c18-49eb-a30b-28b85427780f\", \"hosts\": [\"example.com\"], \"issuer\": \"/Country=US/Organization=Lets Encrypt/CommonName=Lets Encrypt Authority X3\", \"signature\": \"SHA256WithRSA\", \"status\": \"active\", \"bundle_method\": \"bundleMethod\", \"zone_id\": \"zoneId\", \"uploaded_on\": \"uploadedOn\", \"modified_on\": \"modifiedOn\", \"expires_on\": \"expiresOn\", \"priority\": 8}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String getCustomCertificatePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_certificates/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCustomCertificateOptions model
    GetCustomCertificateOptions getCustomCertificateOptionsModel = new GetCustomCertificateOptions.Builder()
    .customCertId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomCertResp> response = sslCertificateApiService.getCustomCertificate(getCustomCertificateOptionsModel).execute();
    assertNotNull(response);
    CustomCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCustomCertificatePath);
  }

  // Test the getCustomCertificate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCustomCertificateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    sslCertificateApiService.getCustomCertificate(null).execute();
  }

  @Test
  public void testUpdateCustomCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"0f405ba2-8c18-49eb-a30b-28b85427780f\", \"hosts\": [\"example.com\"], \"issuer\": \"/Country=US/Organization=Lets Encrypt/CommonName=Lets Encrypt Authority X3\", \"signature\": \"SHA256WithRSA\", \"status\": \"active\", \"bundle_method\": \"bundleMethod\", \"zone_id\": \"zoneId\", \"uploaded_on\": \"uploadedOn\", \"modified_on\": \"modifiedOn\", \"expires_on\": \"expiresOn\", \"priority\": 8}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String updateCustomCertificatePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_certificates/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CustomCertReqGeoRestrictions model
    CustomCertReqGeoRestrictions customCertReqGeoRestrictionsModel = new CustomCertReqGeoRestrictions.Builder()
    .label("us")
    .build();

    // Construct an instance of the UpdateCustomCertificateOptions model
    UpdateCustomCertificateOptions updateCustomCertificateOptionsModel = new UpdateCustomCertificateOptions.Builder()
    .customCertId("testString")
    .certificate("testString")
    .privateKey("testString")
    .bundleMethod("ubiquitous")
    .geoRestrictions(customCertReqGeoRestrictionsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomCertResp> response = sslCertificateApiService.updateCustomCertificate(updateCustomCertificateOptionsModel).execute();
    assertNotNull(response);
    CustomCertResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCustomCertificatePath);
  }

  // Test the updateCustomCertificate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomCertificateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    sslCertificateApiService.updateCustomCertificate(null).execute();
  }

  @Test
  public void testDeleteCustomCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCustomCertificatePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_certificates/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCustomCertificateOptions model
    DeleteCustomCertificateOptions deleteCustomCertificateOptionsModel = new DeleteCustomCertificateOptions.Builder()
    .customCertId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = sslCertificateApiService.deleteCustomCertificate(deleteCustomCertificateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCustomCertificatePath);
  }

  // Test the deleteCustomCertificate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCustomCertificateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    sslCertificateApiService.deleteCustomCertificate(null).execute();
  }

  @Test
  public void testChangeCertificatePriorityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String changeCertificatePriorityPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_certificates/prioritize", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CertPriorityReqCertificatesItem model
    CertPriorityReqCertificatesItem certPriorityReqCertificatesItemModel = new CertPriorityReqCertificatesItem.Builder()
    .id("5a7805061c76ada191ed06f989cc3dac")
    .priority(Long.valueOf("1"))
    .build();

    // Construct an instance of the ChangeCertificatePriorityOptions model
    ChangeCertificatePriorityOptions changeCertificatePriorityOptionsModel = new ChangeCertificatePriorityOptions.Builder()
    .certificates(new java.util.ArrayList<CertPriorityReqCertificatesItem>(java.util.Arrays.asList(certPriorityReqCertificatesItemModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = sslCertificateApiService.changeCertificatePriority(changeCertificatePriorityOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, changeCertificatePriorityPath);
  }

  @Test
  public void testGetUniversalCertificateSettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"enabled\": true}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String getUniversalCertificateSettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/ssl/universal/settings", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetUniversalCertificateSettingOptions model
    GetUniversalCertificateSettingOptions getUniversalCertificateSettingOptionsModel = new GetUniversalCertificateSettingOptions();

    // Invoke operation with valid options model (positive test)
    Response<UniversalSettingResp> response = sslCertificateApiService.getUniversalCertificateSetting(getUniversalCertificateSettingOptionsModel).execute();
    assertNotNull(response);
    UniversalSettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getUniversalCertificateSettingPath);
  }

  @Test
  public void testChangeUniversalCertificateSettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String changeUniversalCertificateSettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/ssl/universal/settings", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ChangeUniversalCertificateSettingOptions model
    ChangeUniversalCertificateSettingOptions changeUniversalCertificateSettingOptionsModel = new ChangeUniversalCertificateSettingOptions.Builder()
    .enabled(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = sslCertificateApiService.changeUniversalCertificateSetting(changeUniversalCertificateSettingOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, changeUniversalCertificateSettingPath);
  }

  @Test
  public void testGetTls12SettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"tls_1_2_only\", \"value\": \"on\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String getTls12SettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/tls_1_2_only", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTls12SettingOptions model
    GetTls12SettingOptions getTls12SettingOptionsModel = new GetTls12SettingOptions();

    // Invoke operation with valid options model (positive test)
    Response<Tls12SettingResp> response = sslCertificateApiService.getTls12Setting(getTls12SettingOptionsModel).execute();
    assertNotNull(response);
    Tls12SettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTls12SettingPath);
  }

  @Test
  public void testChangeTls12SettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"tls_1_2_only\", \"value\": \"on\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String changeTls12SettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/tls_1_2_only", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ChangeTls12SettingOptions model
    ChangeTls12SettingOptions changeTls12SettingOptionsModel = new ChangeTls12SettingOptions.Builder()
    .value("on")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Tls12SettingResp> response = sslCertificateApiService.changeTls12Setting(changeTls12SettingOptionsModel).execute();
    assertNotNull(response);
    Tls12SettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, changeTls12SettingPath);
  }

  @Test
  public void testGetTls13SettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"tls_1_3\", \"value\": \"on\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String getTls13SettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/tls_1_3", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTls13SettingOptions model
    GetTls13SettingOptions getTls13SettingOptionsModel = new GetTls13SettingOptions();

    // Invoke operation with valid options model (positive test)
    Response<Tls13SettingResp> response = sslCertificateApiService.getTls13Setting(getTls13SettingOptionsModel).execute();
    assertNotNull(response);
    Tls13SettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTls13SettingPath);
  }

  @Test
  public void testChangeTls13SettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"tls_1_3\", \"value\": \"on\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String changeTls13SettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/tls_1_3", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ChangeTls13SettingOptions model
    ChangeTls13SettingOptions changeTls13SettingOptionsModel = new ChangeTls13SettingOptions.Builder()
    .value("on")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Tls13SettingResp> response = sslCertificateApiService.changeTls13Setting(changeTls13SettingOptionsModel).execute();
    assertNotNull(response);
    Tls13SettingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, changeTls13SettingPath);
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    sslCertificateApiService = null;
  }
}