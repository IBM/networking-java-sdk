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
package com.ibm.cloud.networking.webhooks.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.webhooks.v1.Webhooks;
import com.ibm.cloud.networking.webhooks.v1.model.CreateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.DeleteWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.GetAlertWebhookResp;
import com.ibm.cloud.networking.webhooks.v1.model.GetAlertWebhookRespResult;
import com.ibm.cloud.networking.webhooks.v1.model.GetWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.ListAlertWebhooksResp;
import com.ibm.cloud.networking.webhooks.v1.model.ListAlertWebhooksRespResultItem;
import com.ibm.cloud.networking.webhooks.v1.model.ListWebhooksOptions;
import com.ibm.cloud.networking.webhooks.v1.model.UpdateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessResp;
import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessRespResult;
import com.ibm.cloud.networking.webhooks.v1.utils.TestUtilities;
import java.io.IOException;
import java.io.InputStream;
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
 * Unit test class for the Webhooks service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class WebhooksTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Webhooks webhooksService;

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

    webhooksService = Webhooks.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    webhooksService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new Webhooks(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(webhooksService.getCrn(), "testString");
  }

  @Test
  public void testListWebhooksWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"6d16fcab-3e80-44b3-b59b-a3716237832e\", \"name\": \"My Slack Alert Webhook\", \"url\": \"https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd\", \"type\": \"generic\", \"created_at\": \"2021-09-15T16:33:31.834209Z\", \"last_success\": \"2021-09-15T16:33:31.834209Z\", \"last_failure\": \"2021-09-15T16:33:31.834209Z\"}]}";
    String listWebhooksPath = "/v1/testString/alerting/destinations/webhooks";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWebhooksOptions model
    ListWebhooksOptions listWebhooksOptionsModel = new ListWebhooksOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListAlertWebhooksResp> response = webhooksService.listWebhooks(listWebhooksOptionsModel).execute();
    assertNotNull(response);
    ListAlertWebhooksResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listWebhooksPath);
  }
  
  public void testListWebhooksWOptionsWRetries() throws Throwable {
    // Enable retries and run testListWebhooksWOptions.
    webhooksService.enableRetries(4, 30);
    testListWebhooksWOptions();

    // Disable retries and run testListWebhooksWOptions.
    webhooksService.disableRetries();
    testListWebhooksWOptions();
  }  

  @Test
  public void testCreateAlertWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"6d16fcab-3e80-44b3-b59b-a3716237832e\"}}";
    String createAlertWebhookPath = "/v1/testString/alerting/destinations/webhooks";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateAlertWebhookOptions model
    CreateAlertWebhookOptions createAlertWebhookOptionsModel = new CreateAlertWebhookOptions.Builder()
    .name("My Slack Alert Webhook")
    .url("https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd")
    .secret("ff1d9b80-b51d-4a06-bf67-6752fae1eb74")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebhookSuccessResp> response = webhooksService.createAlertWebhook(createAlertWebhookOptionsModel).execute();
    assertNotNull(response);
    WebhookSuccessResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createAlertWebhookPath);
  }
  
  public void testCreateAlertWebhookWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateAlertWebhookWOptions.
    webhooksService.enableRetries(4, 30);
    testCreateAlertWebhookWOptions();

    // Disable retries and run testCreateAlertWebhookWOptions.
    webhooksService.disableRetries();
    testCreateAlertWebhookWOptions();
  }  

  @Test
  public void testGetWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"6d16fcab-3e80-44b3-b59b-a3716237832e\", \"name\": \"My Slack Alert Webhook\", \"url\": \"https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd\", \"type\": \"generic\", \"created_at\": \"2021-09-15T16:33:31.834209Z\", \"last_success\": \"2021-09-15T16:33:31.834209Z\", \"last_failure\": \"2021-09-15T16:33:31.834209Z\"}}";
    String getWebhookPath = "/v1/testString/alerting/destinations/webhooks/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWebhookOptions model
    GetWebhookOptions getWebhookOptionsModel = new GetWebhookOptions.Builder()
    .webhookId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetAlertWebhookResp> response = webhooksService.getWebhook(getWebhookOptionsModel).execute();
    assertNotNull(response);
    GetAlertWebhookResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getWebhookPath);
  }
  
  public void testGetWebhookWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetWebhookWOptions.
    webhooksService.enableRetries(4, 30);
    testGetWebhookWOptions();

    // Disable retries and run testGetWebhookWOptions.
    webhooksService.disableRetries();
    testGetWebhookWOptions();
  }  

  // Test the getWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    webhooksService.getWebhook(null).execute();
  }

  @Test
  public void testUpdateAlertWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"6d16fcab-3e80-44b3-b59b-a3716237832e\"}}";
    String updateAlertWebhookPath = "/v1/testString/alerting/destinations/webhooks/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateAlertWebhookOptions model
    UpdateAlertWebhookOptions updateAlertWebhookOptionsModel = new UpdateAlertWebhookOptions.Builder()
    .webhookId("testString")
    .name("My Slack Alert Webhook")
    .url("https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd")
    .secret("ff1d9b80-b51d-4a06-bf67-6752fae1eb74")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebhookSuccessResp> response = webhooksService.updateAlertWebhook(updateAlertWebhookOptionsModel).execute();
    assertNotNull(response);
    WebhookSuccessResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateAlertWebhookPath);
  }
  
  public void testUpdateAlertWebhookWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateAlertWebhookWOptions.
    webhooksService.enableRetries(4, 30);
    testUpdateAlertWebhookWOptions();

    // Disable retries and run testUpdateAlertWebhookWOptions.
    webhooksService.disableRetries();
    testUpdateAlertWebhookWOptions();
  }  

  // Test the updateAlertWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAlertWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    webhooksService.updateAlertWebhook(null).execute();
  }

  @Test
  public void testDeleteWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"6d16fcab-3e80-44b3-b59b-a3716237832e\"}}";
    String deleteWebhookPath = "/v1/testString/alerting/destinations/webhooks/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteWebhookOptions model
    DeleteWebhookOptions deleteWebhookOptionsModel = new DeleteWebhookOptions.Builder()
    .webhookId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebhookSuccessResp> response = webhooksService.deleteWebhook(deleteWebhookOptionsModel).execute();
    assertNotNull(response);
    WebhookSuccessResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteWebhookPath);
  }
  
  public void testDeleteWebhookWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteWebhookWOptions.
    webhooksService.enableRetries(4, 30);
    testDeleteWebhookWOptions();

    // Disable retries and run testDeleteWebhookWOptions.
    webhooksService.disableRetries();
    testDeleteWebhookWOptions();
  }  

  // Test the deleteWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    webhooksService.deleteWebhook(null).execute();
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
    webhooksService = null;
  }
}