/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.networking.alerts.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.alerts.v1.Alerts;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessResp;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessRespErrorsItem;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessRespMessagesItem;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessRespResult;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.DeleteAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPoliciesOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyResp;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespErrorsItem;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespMessagesItem;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespResult;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespResultMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespResultMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespResultMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesResp;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespErrorsItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespMessagesItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItemMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItemMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItemMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.utils.TestUtilities;
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
 * Unit test class for the Alerts service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class AlertsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Alerts alertsService;

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

    alertsService = Alerts.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    alertsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new Alerts(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(alertsService.getCrn(), "testString");
  }

  @Test
  public void testGetAlertPoliciesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"id\": \"id\"}], \"messages\": [{\"id\": \"id\"}], \"result\": [{\"id\": \"f0413b106d2c4aa9b1553d5d0209c522\", \"name\": \"My Alert Policy\", \"description\": \"Description for my alert policy\", \"enabled\": true, \"alert_type\": \"dos_attack_l7\", \"mechanisms\": {\"email\": [{\"id\": \"id\"}], \"webhooks\": [{\"id\": \"id\"}]}, \"created\": \"2021-09-15T16:33:31.834209Z\", \"modified\": \"2021-09-15T16:33:31.834209Z\", \"conditions\": {\"mapKey\": \"anyValue\"}, \"filters\": {\"mapKey\": \"anyValue\"}}]}";
    String getAlertPoliciesPath = "/v1/testString/alerting/policies";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAlertPoliciesOptions model
    GetAlertPoliciesOptions getAlertPoliciesOptionsModel = new GetAlertPoliciesOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListAlertPoliciesResp> response = alertsService.getAlertPolicies(getAlertPoliciesOptionsModel).execute();
    assertNotNull(response);
    ListAlertPoliciesResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getAlertPoliciesPath);
  }
  
  public void testGetAlertPoliciesWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetAlertPoliciesWOptions.
    alertsService.enableRetries(4, 30);
    testGetAlertPoliciesWOptions();

    // Disable retries and run testGetAlertPoliciesWOptions.
    alertsService.disableRetries();
    testGetAlertPoliciesWOptions();
  }  

  @Test
  public void testCreateAlertPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"id\": \"id\"}], \"messages\": [{\"id\": \"id\"}], \"result\": {\"id\": \"f0413b106d2c4aa9b1553d5d0209c522\"}}";
    String createAlertPolicyPath = "/v1/testString/alerting/policies";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateAlertPolicyInputMechanismsEmailItem model
    CreateAlertPolicyInputMechanismsEmailItem createAlertPolicyInputMechanismsEmailItemModel = new CreateAlertPolicyInputMechanismsEmailItem.Builder()
    .id("mynotifications@email.com")
    .build();

    // Construct an instance of the CreateAlertPolicyInputMechanismsWebhooksItem model
    CreateAlertPolicyInputMechanismsWebhooksItem createAlertPolicyInputMechanismsWebhooksItemModel = new CreateAlertPolicyInputMechanismsWebhooksItem.Builder()
    .id("f0413b106d2c4aa9b1553d5d0209c522")
    .build();

    // Construct an instance of the CreateAlertPolicyInputMechanisms model
    CreateAlertPolicyInputMechanisms createAlertPolicyInputMechanismsModel = new CreateAlertPolicyInputMechanisms.Builder()
    .email(new java.util.ArrayList<CreateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsEmailItemModel)))
    .webhooks(new java.util.ArrayList<CreateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsWebhooksItemModel)))
    .build();

    // Construct an instance of the CreateAlertPolicyOptions model
    CreateAlertPolicyOptions createAlertPolicyOptionsModel = new CreateAlertPolicyOptions.Builder()
    .name("My Alert Policy")
    .description("A description for my alert policy")
    .enabled(true)
    .alertType("dos_attack_l7")
    .mechanisms(createAlertPolicyInputMechanismsModel)
    .filters(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .conditions(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AlertSuccessResp> response = alertsService.createAlertPolicy(createAlertPolicyOptionsModel).execute();
    assertNotNull(response);
    AlertSuccessResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createAlertPolicyPath);
  }
  
  public void testCreateAlertPolicyWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateAlertPolicyWOptions.
    alertsService.enableRetries(4, 30);
    testCreateAlertPolicyWOptions();

    // Disable retries and run testCreateAlertPolicyWOptions.
    alertsService.disableRetries();
    testCreateAlertPolicyWOptions();
  }  

  @Test
  public void testGetAlertPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"id\": \"id\"}], \"messages\": [{\"id\": \"id\"}], \"result\": {\"id\": \"f0413b106d2c4aa9b1553d5d0209c522\", \"name\": \"My Alert Policy\", \"description\": \"Description for my alert policy\", \"enabled\": true, \"alert_type\": \"dos_attack_l7\", \"mechanisms\": {\"email\": [{\"id\": \"id\"}], \"webhooks\": [{\"id\": \"id\"}]}, \"created\": \"2021-09-15T16:33:31.834209Z\", \"modified\": \"2021-09-15T16:33:31.834209Z\", \"conditions\": {\"mapKey\": \"anyValue\"}, \"filters\": {\"mapKey\": \"anyValue\"}}}";
    String getAlertPolicyPath = "/v1/testString/alerting/policies/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAlertPolicyOptions model
    GetAlertPolicyOptions getAlertPolicyOptionsModel = new GetAlertPolicyOptions.Builder()
    .policyId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetAlertPolicyResp> response = alertsService.getAlertPolicy(getAlertPolicyOptionsModel).execute();
    assertNotNull(response);
    GetAlertPolicyResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getAlertPolicyPath);
  }
  
  public void testGetAlertPolicyWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetAlertPolicyWOptions.
    alertsService.enableRetries(4, 30);
    testGetAlertPolicyWOptions();

    // Disable retries and run testGetAlertPolicyWOptions.
    alertsService.disableRetries();
    testGetAlertPolicyWOptions();
  }  

  // Test the getAlertPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAlertPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    alertsService.getAlertPolicy(null).execute();
  }

  @Test
  public void testUpdateAlertPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"id\": \"id\"}], \"messages\": [{\"id\": \"id\"}], \"result\": {\"id\": \"f0413b106d2c4aa9b1553d5d0209c522\"}}";
    String updateAlertPolicyPath = "/v1/testString/alerting/policies/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateAlertPolicyInputMechanismsEmailItem model
    UpdateAlertPolicyInputMechanismsEmailItem updateAlertPolicyInputMechanismsEmailItemModel = new UpdateAlertPolicyInputMechanismsEmailItem.Builder()
    .id("mynotifications@email.com")
    .build();

    // Construct an instance of the UpdateAlertPolicyInputMechanismsWebhooksItem model
    UpdateAlertPolicyInputMechanismsWebhooksItem updateAlertPolicyInputMechanismsWebhooksItemModel = new UpdateAlertPolicyInputMechanismsWebhooksItem.Builder()
    .id("f0413b106d2c4aa9b1553d5d0209c522")
    .build();

    // Construct an instance of the UpdateAlertPolicyInputMechanisms model
    UpdateAlertPolicyInputMechanisms updateAlertPolicyInputMechanismsModel = new UpdateAlertPolicyInputMechanisms.Builder()
    .email(new java.util.ArrayList<UpdateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsEmailItemModel)))
    .webhooks(new java.util.ArrayList<UpdateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsWebhooksItemModel)))
    .build();

    // Construct an instance of the UpdateAlertPolicyOptions model
    UpdateAlertPolicyOptions updateAlertPolicyOptionsModel = new UpdateAlertPolicyOptions.Builder()
    .policyId("testString")
    .name("My Alert Policy")
    .description("A description for my alert policy")
    .enabled(true)
    .alertType("dos_attack_l7")
    .mechanisms(updateAlertPolicyInputMechanismsModel)
    .conditions(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .filters(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AlertSuccessResp> response = alertsService.updateAlertPolicy(updateAlertPolicyOptionsModel).execute();
    assertNotNull(response);
    AlertSuccessResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAlertPolicyPath);
  }
  
  public void testUpdateAlertPolicyWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateAlertPolicyWOptions.
    alertsService.enableRetries(4, 30);
    testUpdateAlertPolicyWOptions();

    // Disable retries and run testUpdateAlertPolicyWOptions.
    alertsService.disableRetries();
    testUpdateAlertPolicyWOptions();
  }  

  // Test the updateAlertPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAlertPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    alertsService.updateAlertPolicy(null).execute();
  }

  @Test
  public void testDeleteAlertPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"id\": \"id\"}], \"messages\": [{\"id\": \"id\"}], \"result\": {\"id\": \"f0413b106d2c4aa9b1553d5d0209c522\"}}";
    String deleteAlertPolicyPath = "/v1/testString/alerting/policies/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteAlertPolicyOptions model
    DeleteAlertPolicyOptions deleteAlertPolicyOptionsModel = new DeleteAlertPolicyOptions.Builder()
    .policyId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AlertSuccessResp> response = alertsService.deleteAlertPolicy(deleteAlertPolicyOptionsModel).execute();
    assertNotNull(response);
    AlertSuccessResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAlertPolicyPath);
  }
  
  public void testDeleteAlertPolicyWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteAlertPolicyWOptions.
    alertsService.enableRetries(4, 30);
    testDeleteAlertPolicyWOptions();

    // Disable retries and run testDeleteAlertPolicyWOptions.
    alertsService.disableRetries();
    testDeleteAlertPolicyWOptions();
  }  

  // Test the deleteAlertPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAlertPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    alertsService.deleteAlertPolicy(null).execute();
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
    alertsService = null;
  }
}