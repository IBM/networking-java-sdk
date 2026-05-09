/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.logpush_jobs_api.v1;

import com.ibm.cloud.networking.logpush_jobs_api.v1.LogpushJobsApi;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogRetentionOptions;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2Request;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobCosReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobGenericReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobIbmclReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobLogdnaReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.DeleteLogpushJobResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.DeleteLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogpushJobsV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogpushOwnershipV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogsRetentionOptions;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListFieldsForDatasetV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListFieldsResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListLogpushJobsForDatasetV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListLogpushJobsResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogRetentionResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogRetentionRespResult;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobIbmclReqIbmcl;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobPack;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobsResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobsUpdateIbmclReqIbmcl;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.OwnershipChallengeResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.OwnershipChallengeResult;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.OwnershipChallengeValidateResult;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2Request;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ValidateLogpushOwnershipChallengeV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
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
 * Unit test class for the LogpushJobsApi service.
 */
public class LogpushJobsApiTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected LogpushJobsApi logpushJobsApiService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    String dataset = "testString";
    String zoneId = "testString";
    new LogpushJobsApi(crn, dataset, zoneId, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(logpushJobsApiService.getCrn(), "testString");
  }


  // Test the getter for the dataset global parameter
  @Test
  public void testGetDataset() throws Throwable {
    assertEquals(logpushJobsApiService.getDataset(), "testString");
  }


  // Test the getter for the zoneId global parameter
  @Test
  public void testGetZoneId() throws Throwable {
    assertEquals(logpushJobsApiService.getZoneId(), "testString");
  }

  // Test the getLogpushJobsV2 operation with a valid options model parameter
  @Test
  public void testGetLogpushJobsV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": 5850, \"name\": \"My log push job\", \"enabled\": false, \"dataset\": \"firewall_events\", \"frequency\": \"high\", \"logpull_options\": \"timestamps=rfc3339&timestamps=rfc3339\", \"destination_conf\": \"cos://cos-bucket001?region=us-south&instance-id=231f5467-3072-4cb9-9e39-a906fa3032ea\", \"last_complete\": \"2022-01-15T16:33:31.834209Z\", \"last_error\": \"2022-01-15T16:33:31.834209Z\", \"error_message\": \"errorMessage\"}]}";
    String getLogpushJobsV2Path = "/v2/testString/zones/testString/logpush/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLogpushJobsV2Options model
    GetLogpushJobsV2Options getLogpushJobsV2OptionsModel = new GetLogpushJobsV2Options();

    // Invoke getLogpushJobsV2() with a valid options model and verify the result
    Response<ListLogpushJobsResp> response = logpushJobsApiService.getLogpushJobsV2(getLogpushJobsV2OptionsModel).execute();
    assertNotNull(response);
    ListLogpushJobsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLogpushJobsV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLogpushJobsV2 operation with and without retries enabled
  @Test
  public void testGetLogpushJobsV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testGetLogpushJobsV2WOptions();

    logpushJobsApiService.disableRetries();
    testGetLogpushJobsV2WOptions();
  }

  // Test the createLogpushJobV2 operation with a valid options model parameter
  @Test
  public void testCreateLogpushJobV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": 5850, \"name\": \"My log push job\", \"enabled\": false, \"dataset\": \"firewall_events\", \"frequency\": \"high\", \"logpull_options\": \"timestamps=rfc3339&timestamps=rfc3339\", \"destination_conf\": \"cos://cos-bucket001?region=us-south&instance-id=231f5467-3072-4cb9-9e39-a906fa3032ea\", \"last_complete\": \"2022-01-15T16:33:31.834209Z\", \"last_error\": \"2022-01-15T16:33:31.834209Z\", \"error_message\": \"errorMessage\"}}";
    String createLogpushJobV2Path = "/v2/testString/zones/testString/logpush/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateLogpushJobV2RequestLogpushJobCosReq model
    CreateLogpushJobV2RequestLogpushJobCosReq createLogpushJobV2RequestModel = new CreateLogpushJobV2RequestLogpushJobCosReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000000000000000")
      .dataset("http_requests")
      .frequency("high")
      .build();

    // Construct an instance of the CreateLogpushJobV2Options model
    CreateLogpushJobV2Options createLogpushJobV2OptionsModel = new CreateLogpushJobV2Options.Builder()
      .createLogpushJobV2Request(createLogpushJobV2RequestModel)
      .build();

    // Invoke createLogpushJobV2() with a valid options model and verify the result
    Response<LogpushJobsResp> response = logpushJobsApiService.createLogpushJobV2(createLogpushJobV2OptionsModel).execute();
    assertNotNull(response);
    LogpushJobsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLogpushJobV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createLogpushJobV2 operation with and without retries enabled
  @Test
  public void testCreateLogpushJobV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testCreateLogpushJobV2WOptions();

    logpushJobsApiService.disableRetries();
    testCreateLogpushJobV2WOptions();
  }

  // Test the getLogpushJobV2 operation with a valid options model parameter
  @Test
  public void testGetLogpushJobV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": 5850, \"name\": \"My log push job\", \"enabled\": false, \"dataset\": \"firewall_events\", \"frequency\": \"high\", \"logpull_options\": \"timestamps=rfc3339&timestamps=rfc3339\", \"destination_conf\": \"cos://cos-bucket001?region=us-south&instance-id=231f5467-3072-4cb9-9e39-a906fa3032ea\", \"last_complete\": \"2022-01-15T16:33:31.834209Z\", \"last_error\": \"2022-01-15T16:33:31.834209Z\", \"error_message\": \"errorMessage\"}}";
    String getLogpushJobV2Path = "/v2/testString/zones/testString/logpush/jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLogpushJobV2Options model
    GetLogpushJobV2Options getLogpushJobV2OptionsModel = new GetLogpushJobV2Options.Builder()
      .jobId("testString")
      .build();

    // Invoke getLogpushJobV2() with a valid options model and verify the result
    Response<LogpushJobsResp> response = logpushJobsApiService.getLogpushJobV2(getLogpushJobV2OptionsModel).execute();
    assertNotNull(response);
    LogpushJobsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLogpushJobV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLogpushJobV2 operation with and without retries enabled
  @Test
  public void testGetLogpushJobV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testGetLogpushJobV2WOptions();

    logpushJobsApiService.disableRetries();
    testGetLogpushJobV2WOptions();
  }

  // Test the getLogpushJobV2 operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLogpushJobV2NoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    logpushJobsApiService.getLogpushJobV2(null).execute();
  }

  // Test the updateLogpushJobV2 operation with a valid options model parameter
  @Test
  public void testUpdateLogpushJobV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": 5850, \"name\": \"My log push job\", \"enabled\": false, \"dataset\": \"firewall_events\", \"frequency\": \"high\", \"logpull_options\": \"timestamps=rfc3339&timestamps=rfc3339\", \"destination_conf\": \"cos://cos-bucket001?region=us-south&instance-id=231f5467-3072-4cb9-9e39-a906fa3032ea\", \"last_complete\": \"2022-01-15T16:33:31.834209Z\", \"last_error\": \"2022-01-15T16:33:31.834209Z\", \"error_message\": \"errorMessage\"}}";
    String updateLogpushJobV2Path = "/v2/testString/zones/testString/logpush/jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq model
    UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq updateLogpushJobV2RequestModel = new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.Builder()
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000000000000000")
      .frequency("high")
      .build();

    // Construct an instance of the UpdateLogpushJobV2Options model
    UpdateLogpushJobV2Options updateLogpushJobV2OptionsModel = new UpdateLogpushJobV2Options.Builder()
      .jobId("testString")
      .updateLogpushJobV2Request(updateLogpushJobV2RequestModel)
      .build();

    // Invoke updateLogpushJobV2() with a valid options model and verify the result
    Response<LogpushJobsResp> response = logpushJobsApiService.updateLogpushJobV2(updateLogpushJobV2OptionsModel).execute();
    assertNotNull(response);
    LogpushJobsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLogpushJobV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateLogpushJobV2 operation with and without retries enabled
  @Test
  public void testUpdateLogpushJobV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testUpdateLogpushJobV2WOptions();

    logpushJobsApiService.disableRetries();
    testUpdateLogpushJobV2WOptions();
  }

  // Test the updateLogpushJobV2 operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLogpushJobV2NoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    logpushJobsApiService.updateLogpushJobV2(null).execute();
  }

  // Test the deleteLogpushJobV2 operation with a valid options model parameter
  @Test
  public void testDeleteLogpushJobV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"anyKey\": \"anyValue\"}}";
    String deleteLogpushJobV2Path = "/v2/testString/zones/testString/logpush/jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteLogpushJobV2Options model
    DeleteLogpushJobV2Options deleteLogpushJobV2OptionsModel = new DeleteLogpushJobV2Options.Builder()
      .jobId("testString")
      .build();

    // Invoke deleteLogpushJobV2() with a valid options model and verify the result
    Response<DeleteLogpushJobResp> response = logpushJobsApiService.deleteLogpushJobV2(deleteLogpushJobV2OptionsModel).execute();
    assertNotNull(response);
    DeleteLogpushJobResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLogpushJobV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteLogpushJobV2 operation with and without retries enabled
  @Test
  public void testDeleteLogpushJobV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testDeleteLogpushJobV2WOptions();

    logpushJobsApiService.disableRetries();
    testDeleteLogpushJobV2WOptions();
  }

  // Test the deleteLogpushJobV2 operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLogpushJobV2NoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    logpushJobsApiService.deleteLogpushJobV2(null).execute();
  }

  // Test the getLogpushOwnershipV2 operation with a valid options model parameter
  @Test
  public void testGetLogpushOwnershipV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"filename\": \"logs/challenge-filename.txt\", \"valid\": true, \"messages\": \"messages\"}}";
    String getLogpushOwnershipV2Path = "/v2/testString/zones/testString/logpush/ownership";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLogpushOwnershipV2Options model
    GetLogpushOwnershipV2Options getLogpushOwnershipV2OptionsModel = new GetLogpushOwnershipV2Options.Builder()
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Invoke getLogpushOwnershipV2() with a valid options model and verify the result
    Response<OwnershipChallengeResp> response = logpushJobsApiService.getLogpushOwnershipV2(getLogpushOwnershipV2OptionsModel).execute();
    assertNotNull(response);
    OwnershipChallengeResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLogpushOwnershipV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLogpushOwnershipV2 operation with and without retries enabled
  @Test
  public void testGetLogpushOwnershipV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testGetLogpushOwnershipV2WOptions();

    logpushJobsApiService.disableRetries();
    testGetLogpushOwnershipV2WOptions();
  }

  // Test the validateLogpushOwnershipChallengeV2 operation with a valid options model parameter
  @Test
  public void testValidateLogpushOwnershipChallengeV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"valid\": true}";
    String validateLogpushOwnershipChallengeV2Path = "/v2/testString/zones/testString/logpush/ownership/validate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ValidateLogpushOwnershipChallengeV2Options model
    ValidateLogpushOwnershipChallengeV2Options validateLogpushOwnershipChallengeV2OptionsModel = new ValidateLogpushOwnershipChallengeV2Options.Builder()
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000")
      .build();

    // Invoke validateLogpushOwnershipChallengeV2() with a valid options model and verify the result
    Response<OwnershipChallengeValidateResult> response = logpushJobsApiService.validateLogpushOwnershipChallengeV2(validateLogpushOwnershipChallengeV2OptionsModel).execute();
    assertNotNull(response);
    OwnershipChallengeValidateResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, validateLogpushOwnershipChallengeV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the validateLogpushOwnershipChallengeV2 operation with and without retries enabled
  @Test
  public void testValidateLogpushOwnershipChallengeV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testValidateLogpushOwnershipChallengeV2WOptions();

    logpushJobsApiService.disableRetries();
    testValidateLogpushOwnershipChallengeV2WOptions();
  }

  // Test the listFieldsForDatasetV2 operation with a valid options model parameter
  @Test
  public void testListFieldsForDatasetV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"anyKey\": \"anyValue\"}}";
    String listFieldsForDatasetV2Path = "/v2/testString/zones/testString/logpush/datasets/testString/fields";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListFieldsForDatasetV2Options model
    ListFieldsForDatasetV2Options listFieldsForDatasetV2OptionsModel = new ListFieldsForDatasetV2Options();

    // Invoke listFieldsForDatasetV2() with a valid options model and verify the result
    Response<ListFieldsResp> response = logpushJobsApiService.listFieldsForDatasetV2(listFieldsForDatasetV2OptionsModel).execute();
    assertNotNull(response);
    ListFieldsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listFieldsForDatasetV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listFieldsForDatasetV2 operation with and without retries enabled
  @Test
  public void testListFieldsForDatasetV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testListFieldsForDatasetV2WOptions();

    logpushJobsApiService.disableRetries();
    testListFieldsForDatasetV2WOptions();
  }

  // Test the listLogpushJobsForDatasetV2 operation with a valid options model parameter
  @Test
  public void testListLogpushJobsForDatasetV2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": 5850, \"name\": \"My log push job\", \"enabled\": false, \"dataset\": \"firewall_events\", \"frequency\": \"high\", \"logpull_options\": \"timestamps=rfc3339&timestamps=rfc3339\", \"destination_conf\": \"cos://cos-bucket001?region=us-south&instance-id=231f5467-3072-4cb9-9e39-a906fa3032ea\", \"last_complete\": \"2022-01-15T16:33:31.834209Z\", \"last_error\": \"2022-01-15T16:33:31.834209Z\", \"error_message\": \"errorMessage\"}}";
    String listLogpushJobsForDatasetV2Path = "/v2/testString/zones/testString/logpush/datasets/testString/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListLogpushJobsForDatasetV2Options model
    ListLogpushJobsForDatasetV2Options listLogpushJobsForDatasetV2OptionsModel = new ListLogpushJobsForDatasetV2Options();

    // Invoke listLogpushJobsForDatasetV2() with a valid options model and verify the result
    Response<LogpushJobsResp> response = logpushJobsApiService.listLogpushJobsForDatasetV2(listLogpushJobsForDatasetV2OptionsModel).execute();
    assertNotNull(response);
    LogpushJobsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLogpushJobsForDatasetV2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listLogpushJobsForDatasetV2 operation with and without retries enabled
  @Test
  public void testListLogpushJobsForDatasetV2WRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testListLogpushJobsForDatasetV2WOptions();

    logpushJobsApiService.disableRetries();
    testListLogpushJobsForDatasetV2WOptions();
  }

  // Test the getLogsRetention operation with a valid options model parameter
  @Test
  public void testGetLogsRetentionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"flag\": true}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getLogsRetentionPath = "/v1/testString/zones/testString/logs/retention";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLogsRetentionOptions model
    GetLogsRetentionOptions getLogsRetentionOptionsModel = new GetLogsRetentionOptions();

    // Invoke getLogsRetention() with a valid options model and verify the result
    Response<LogRetentionResp> response = logpushJobsApiService.getLogsRetention(getLogsRetentionOptionsModel).execute();
    assertNotNull(response);
    LogRetentionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLogsRetentionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLogsRetention operation with and without retries enabled
  @Test
  public void testGetLogsRetentionWRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testGetLogsRetentionWOptions();

    logpushJobsApiService.disableRetries();
    testGetLogsRetentionWOptions();
  }

  // Test the createLogRetention operation with a valid options model parameter
  @Test
  public void testCreateLogRetentionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"flag\": true}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String createLogRetentionPath = "/v1/testString/zones/testString/logs/retention";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateLogRetentionOptions model
    CreateLogRetentionOptions createLogRetentionOptionsModel = new CreateLogRetentionOptions.Builder()
      .flag(false)
      .build();

    // Invoke createLogRetention() with a valid options model and verify the result
    Response<LogRetentionResp> response = logpushJobsApiService.createLogRetention(createLogRetentionOptionsModel).execute();
    assertNotNull(response);
    LogRetentionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLogRetentionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createLogRetention operation with and without retries enabled
  @Test
  public void testCreateLogRetentionWRetries() throws Throwable {
    logpushJobsApiService.enableRetries(4, 30);
    testCreateLogRetentionWOptions();

    logpushJobsApiService.disableRetries();
    testCreateLogRetentionWOptions();
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
    logpushJobsApiService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String dataset = "testString";
    String zoneId = "testString";

    logpushJobsApiService = LogpushJobsApi.newInstance(crn, dataset, zoneId, serviceName);
    String url = server.url("/").toString();
    logpushJobsApiService.setServiceUrl(url);
  }
}