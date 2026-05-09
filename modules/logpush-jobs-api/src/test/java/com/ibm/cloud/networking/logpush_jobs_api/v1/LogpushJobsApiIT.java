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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.*;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Integration test class for the LogpushJobsApi service.
 */
public class LogpushJobsApiIT extends SdkIntegrationTestBase {
  public LogpushJobsApi service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneId = null;
  String dataset = "http_requests";
  String ingressKey = null;
  String logdnaRegion = null;
  String logdnaDomain = null;
  String cosBucket = null;
  String cosRegion = null;
  String cosInstance = null;
  String ownershipToken = null;

  /**
   * This method provides our config filename to the base class.
   */
  @Override
  public String getConfigFilename() {
    return "../../cis.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    final String serviceName = "logpush_jobs_api";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    
    // Load Config
    crn = config.get("CRN");
    zoneId = config.get("ZONE_ID");
    ingressKey = config.get("INGRESS_KEY");
    logdnaRegion = config.get("LOGDNA_REGION");
    logdnaDomain = config.get("DOMAIN_NAME");
    cosBucket = config.get("COS_BUCKET");
    cosRegion = config.get("COS_REGION");
    cosInstance = config.get("COS_INSTANCE");
    ownershipToken = config.get("OWNERSHIP_TOKEN");

    // set mock values for global params
    try {
      service = LogpushJobsApi.newInstance(crn, dataset, zoneId, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
    
    // Clean up all existing logpush jobs before tests (like Go SDK BeforeEach)
    cleanupAllJobs();
  }
  
  private void cleanupAllJobs() {
    try {
      GetLogpushJobsV2Options listOptions = new GetLogpushJobsV2Options();
      Response<ListLogpushJobsResp> listResponse = service.getLogpushJobsV2(listOptions).execute();
      
      if (listResponse != null && listResponse.getResult() != null && listResponse.getResult().getResult() != null) {
        for (LogpushJobPack job : listResponse.getResult().getResult()) {
          try {
            DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
              .jobId(String.valueOf(job.getId()))
              .build();
            service.deleteLogpushJobV2(deleteOptions).execute();
          } catch (Exception e) {
            System.err.println("Failed to delete job " + job.getId() + ": " + e.getMessage());
          }
        }
      }
    } catch (Exception e) {
      System.err.println("Cleanup failed: " + e.getMessage());
    }
  }

  @AfterClass
  public void cleanup() {
    // Clean up all logpush jobs after tests
    if (skipTests()) {
      return;
    }
    
    try {
      GetLogpushJobsV2Options listOptions = new GetLogpushJobsV2Options();
      Response<ListLogpushJobsResp> listResponse = service.getLogpushJobsV2(listOptions).execute();
      
      if (listResponse != null && listResponse.getResult() != null && listResponse.getResult().getResult() != null) {
        for (LogpushJobPack job : listResponse.getResult().getResult()) {
          try {
            DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
              .jobId(String.valueOf(job.getId()))
              .build();
            service.deleteLogpushJobV2(deleteOptions).execute();
          } catch (Exception e) {
            System.err.println("Failed to delete job " + job.getId() + ": " + e.getMessage());
          }
        }
      }
    } catch (Exception e) {
      System.err.println("Cleanup failed: " + e.getMessage());
    }
  }

  @Test
  public void testListLogpushJobs() throws Exception {
    try {
      GetLogpushJobsV2Options getLogpushJobsV2Options = new GetLogpushJobsV2Options();

      // Invoke operation
      Response<ListLogpushJobsResp> response = service.getLogpushJobsV2(getLogpushJobsV2Options).execute();
      
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListLogpushJobsResp listLogpushJobsRespResult = response.getResult();
      assertNotNull(listLogpushJobsRespResult);
      assertTrue(listLogpushJobsRespResult.isSuccess());
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateUpdateDeleteLogpushJobCOS() throws Exception {
    try {
      // Create logpush job for COS
      Map<String, Object> cosConfig = new HashMap<>();
      cosConfig.put("bucket", cosBucket);
      cosConfig.put("region", cosRegion);
      cosConfig.put("instance_id", cosInstance);

      CreateLogpushJobV2RequestLogpushJobCosReq createRequest = 
        new CreateLogpushJobV2RequestLogpushJobCosReq.Builder()
          .name("Test COS Job")
          .enabled(false)
          .logpullOptions("timestamps=rfc3339")
          .cos(cosConfig)
          .dataset(dataset)
          .frequency("high")
          .build();

      CreateLogpushJobV2Options createOptions = new CreateLogpushJobV2Options.Builder()
        .createLogpushJobV2Request(createRequest)
        .build();

      Response<LogpushJobsResp> createResponse = service.createLogpushJobV2(createOptions).execute();
      
      assertNotNull(createResponse);
      assertEquals(createResponse.getStatusCode(), 201);
      
      LogpushJobsResp createResult = createResponse.getResult();
      assertNotNull(createResult);
      assertTrue(createResult.isSuccess());
      assertNotNull(createResult.getResult());
      
      Long jobId = createResult.getResult().getId();
      assertNotNull(jobId);

      // Get the created job
      GetLogpushJobV2Options getOptions = new GetLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<LogpushJobsResp> getResponse = service.getLogpushJobV2(getOptions).execute();
      assertNotNull(getResponse);
      assertEquals(getResponse.getStatusCode(), 200);
      
      LogpushJobsResp getResult = getResponse.getResult();
      assertNotNull(getResult);
      assertTrue(getResult.isSuccess());

      // Update the job
      Map<String, Object> updatedCosConfig = new HashMap<>();
      updatedCosConfig.put("bucket", cosBucket);
      updatedCosConfig.put("region", cosRegion);
      updatedCosConfig.put("instance_id", cosInstance);

      UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq updateRequest = 
        new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.Builder()
          .enabled(true)
          .logpullOptions("timestamps=rfc3339")
          .cos(updatedCosConfig)
          .frequency("high")
          .build();

      UpdateLogpushJobV2Options updateOptions = new UpdateLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .updateLogpushJobV2Request(updateRequest)
        .build();

      Response<LogpushJobsResp> updateResponse = service.updateLogpushJobV2(updateOptions).execute();
      assertNotNull(updateResponse);
      assertEquals(updateResponse.getStatusCode(), 200);
      
      LogpushJobsResp updateResult = updateResponse.getResult();
      assertNotNull(updateResult);
      assertTrue(updateResult.isSuccess());

      // Delete the job
      DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<DeleteLogpushJobResp> deleteResponse = service.deleteLogpushJobV2(deleteOptions).execute();
      assertNotNull(deleteResponse);
      assertEquals(deleteResponse.getStatusCode(), 200);
      
      DeleteLogpushJobResp deleteResult = deleteResponse.getResult();
      assertNotNull(deleteResult);
      assertTrue(deleteResult.isSuccess());

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateUpdateDeleteLogpushJobLogDNA() throws Exception {
    try {
      // Create logpush job for LogDNA
      Map<String, Object> logdnaConfig = new HashMap<>();
      logdnaConfig.put("ingress_key", ingressKey);
      logdnaConfig.put("region", logdnaRegion);
      logdnaConfig.put("hostname", logdnaDomain);

      CreateLogpushJobV2RequestLogpushJobLogdnaReq createRequest = 
        new CreateLogpushJobV2RequestLogpushJobLogdnaReq.Builder()
          .name("Test LogDNA Job")
          .enabled(false)
          .logpullOptions("timestamps=rfc3339")
          .logdna(logdnaConfig)
          .dataset(dataset)
          .frequency("high")
          .build();

      CreateLogpushJobV2Options createOptions = new CreateLogpushJobV2Options.Builder()
        .createLogpushJobV2Request(createRequest)
        .build();

      Response<LogpushJobsResp> createResponse = service.createLogpushJobV2(createOptions).execute();
      
      assertNotNull(createResponse);
      assertEquals(createResponse.getStatusCode(), 201);
      
      LogpushJobsResp createResult = createResponse.getResult();
      assertNotNull(createResult);
      assertTrue(createResult.isSuccess());
      assertNotNull(createResult.getResult());
      
      Long jobId = createResult.getResult().getId();
      assertNotNull(jobId);

      // Update the job
      Map<String, Object> updatedLogdnaConfig = new HashMap<>();
      updatedLogdnaConfig.put("ingress_key", ingressKey);
      updatedLogdnaConfig.put("region", logdnaRegion);
      updatedLogdnaConfig.put("hostname", logdnaDomain);

      UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq updateRequest = 
        new UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.Builder()
          .enabled(true)
          .logpullOptions("timestamps=rfc3339")
          .logdna(updatedLogdnaConfig)
          .frequency("high")
          .build();

      UpdateLogpushJobV2Options updateOptions = new UpdateLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .updateLogpushJobV2Request(updateRequest)
        .build();

      Response<LogpushJobsResp> updateResponse = service.updateLogpushJobV2(updateOptions).execute();
      assertNotNull(updateResponse);
      assertEquals(updateResponse.getStatusCode(), 200);
      
      LogpushJobsResp updateResult = updateResponse.getResult();
      assertNotNull(updateResult);
      assertTrue(updateResult.isSuccess());

      // Delete the job
      DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<DeleteLogpushJobResp> deleteResponse = service.deleteLogpushJobV2(deleteOptions).execute();
      assertNotNull(deleteResponse);
      assertEquals(deleteResponse.getStatusCode(), 200);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListFieldsForDataset() throws Exception {
    try {
      ListFieldsForDatasetV2Options listFieldsOptions = new ListFieldsForDatasetV2Options();

      Response<ListFieldsResp> response = service.listFieldsForDatasetV2(listFieldsOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListFieldsResp listFieldsRespResult = response.getResult();
      assertNotNull(listFieldsRespResult);
      assertTrue(listFieldsRespResult.isSuccess());
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetLogsRetention() throws Exception {
    try {
      GetLogsRetentionOptions getLogsRetentionOptions = new GetLogsRetentionOptions();

      Response<LogRetentionResp> response = service.getLogsRetention(getLogsRetentionOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LogRetentionResp logRetentionRespResult = response.getResult();
      assertNotNull(logRetentionRespResult);
      assertTrue(logRetentionRespResult.isSuccess());
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateUpdateDeleteLogpushJobGeneric() throws Exception {
    try {
      // Create logpush job with generic destination (S3)
      CreateLogpushJobV2RequestLogpushJobGenericReq createRequest =
        new CreateLogpushJobV2RequestLogpushJobGenericReq.Builder()
          .name("Test Generic Job")
          .enabled(false)
          .logpullOptions("timestamps=rfc3339")
          .destinationConf("s3://mybucket/logs?region=us-west-2")
          .dataset(dataset)
          .frequency("high")
          .build();

      CreateLogpushJobV2Options createOptions = new CreateLogpushJobV2Options.Builder()
        .createLogpushJobV2Request(createRequest)
        .build();

      Response<LogpushJobsResp> createResponse = service.createLogpushJobV2(createOptions).execute();
      
      assertNotNull(createResponse);
      assertEquals(createResponse.getStatusCode(), 201);
      
      LogpushJobsResp createResult = createResponse.getResult();
      assertNotNull(createResult);
      assertTrue(createResult.isSuccess());
      assertNotNull(createResult.getResult());
      
      Long jobId = createResult.getResult().getId();
      assertNotNull(jobId);

      // Get the created job
      GetLogpushJobV2Options getOptions = new GetLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<LogpushJobsResp> getResponse = service.getLogpushJobV2(getOptions).execute();
      assertNotNull(getResponse);
      assertEquals(getResponse.getStatusCode(), 200);

      // Update the job
      UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq updateRequest =
        new UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq.Builder()
          .enabled(false)
          .logpullOptions("timestamps=rfc3339")
          .destinationConf("s3://mybucket/logs?region=us-west-1")
          .frequency("high")
          .build();

      UpdateLogpushJobV2Options updateOptions = new UpdateLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .updateLogpushJobV2Request(updateRequest)
        .build();

      Response<LogpushJobsResp> updateResponse = service.updateLogpushJobV2(updateOptions).execute();
      assertNotNull(updateResponse);
      assertEquals(updateResponse.getStatusCode(), 200);
      
      LogpushJobsResp updateResult = updateResponse.getResult();
      assertNotNull(updateResult);
      assertTrue(updateResult.isSuccess());

      // Delete the job
      DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<DeleteLogpushJobResp> deleteResponse = service.deleteLogpushJobV2(deleteOptions).execute();
      assertNotNull(deleteResponse);
      assertEquals(deleteResponse.getStatusCode(), 200);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateUpdateDeleteLogpushJobCustomHTTP() throws Exception {
    try {
      // Create logpush job with custom HTTP destination
      CreateLogpushJobV2RequestLogpushJobGenericReq createRequest =
        new CreateLogpushJobV2RequestLogpushJobGenericReq.Builder()
          .name("Test HTTP Job")
          .enabled(false)
          .logpullOptions("fields=ClientIP,ClientRequestHost,ClientRequestMethod")
          .destinationConf("https://httpbin.org/post")
          .dataset(dataset)
          .frequency("high")
          .build();

      CreateLogpushJobV2Options createOptions = new CreateLogpushJobV2Options.Builder()
        .createLogpushJobV2Request(createRequest)
        .build();

      Response<LogpushJobsResp> createResponse = service.createLogpushJobV2(createOptions).execute();
      
      assertNotNull(createResponse);
      assertEquals(createResponse.getStatusCode(), 201);
      
      LogpushJobsResp createResult = createResponse.getResult();
      assertNotNull(createResult);
      assertTrue(createResult.isSuccess());
      assertNotNull(createResult.getResult());
      
      Long jobId = createResult.getResult().getId();
      assertNotNull(jobId);

      // List all jobs
      GetLogpushJobsV2Options listOptions = new GetLogpushJobsV2Options();
      Response<ListLogpushJobsResp> listResponse = service.getLogpushJobsV2(listOptions).execute();
      assertNotNull(listResponse);
      assertNotNull(listResponse.getResult());

      // Get the created job
      GetLogpushJobV2Options getOptions = new GetLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<LogpushJobsResp> getResponse = service.getLogpushJobV2(getOptions).execute();
      assertNotNull(getResponse);
      assertEquals(getResponse.getStatusCode(), 200);

      // Update the job
      UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq updateRequest =
        new UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq.Builder()
          .enabled(false)
          .logpullOptions("fields=ClientIP,ClientRequestHost")
          .destinationConf("https://httpbin.org/post")
          .frequency("high")
          .build();

      UpdateLogpushJobV2Options updateOptions = new UpdateLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .updateLogpushJobV2Request(updateRequest)
        .build();

      Response<LogpushJobsResp> updateResponse = service.updateLogpushJobV2(updateOptions).execute();
      assertNotNull(updateResponse);
      assertEquals(updateResponse.getStatusCode(), 200);

      // Delete the job
      DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<DeleteLogpushJobResp> deleteResponse = service.deleteLogpushJobV2(deleteOptions).execute();
      assertNotNull(deleteResponse);
      assertEquals(deleteResponse.getStatusCode(), 200);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateUpdateDeleteLogpushJobIBMCL() throws Exception {
    try {
      // Create logpush job for IBM Cloud Logs
      String ibmclInstanceId = config.get("CIS_IBMCL_INSTANCE_ID");
      String apiKey = config.get("CIS_SERVICES_APIKEY");
      
      if (ibmclInstanceId == null || apiKey == null) {
        System.out.println("Skipping IBMCL test - missing CIS_IBMCL_INSTANCE_ID or CIS_SERVICES_APIKEY");
        return;
      }

      LogpushJobIbmclReqIbmcl ibmclConfig = new LogpushJobIbmclReqIbmcl.Builder()
        .instanceId(ibmclInstanceId)
        .region("us-south")
        .apiKey(apiKey)
        .build();

      CreateLogpushJobV2RequestLogpushJobIbmclReq createRequest =
        new CreateLogpushJobV2RequestLogpushJobIbmclReq.Builder()
          .name("Test IBMCL Job")
          .enabled(false)
          .logpullOptions("timestamps=rfc3339")
          .ibmcl(ibmclConfig)
          .dataset(dataset)
          .frequency("high")
          .build();

      CreateLogpushJobV2Options createOptions = new CreateLogpushJobV2Options.Builder()
        .createLogpushJobV2Request(createRequest)
        .build();

      Response<LogpushJobsResp> createResponse = service.createLogpushJobV2(createOptions).execute();
      
      assertNotNull(createResponse);
      assertEquals(createResponse.getStatusCode(), 201);
      
      LogpushJobsResp createResult = createResponse.getResult();
      assertNotNull(createResult);
      assertTrue(createResult.isSuccess());
      assertNotNull(createResult.getResult());
      
      Long jobId = createResult.getResult().getId();
      assertNotNull(jobId);

      // Get the created job
      GetLogpushJobV2Options getOptions = new GetLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<LogpushJobsResp> getResponse = service.getLogpushJobV2(getOptions).execute();
      assertNotNull(getResponse);
      assertEquals(getResponse.getStatusCode(), 200);

      // Update the job (using COS update model as in Go SDK)
      UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq updateRequest =
        new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.Builder()
          .enabled(false)
          .logpullOptions("timestamps=rfc3339")
          .frequency("low")
          .build();

      UpdateLogpushJobV2Options updateOptions = new UpdateLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .updateLogpushJobV2Request(updateRequest)
        .build();

      Response<LogpushJobsResp> updateResponse = service.updateLogpushJobV2(updateOptions).execute();
      assertNotNull(updateResponse);
      assertEquals(updateResponse.getStatusCode(), 200);

      // Delete the job
      DeleteLogpushJobV2Options deleteOptions = new DeleteLogpushJobV2Options.Builder()
        .jobId(String.valueOf(jobId))
        .build();

      Response<DeleteLogpushJobResp> deleteResponse = service.deleteLogpushJobV2(deleteOptions).execute();
      assertNotNull(deleteResponse);
      assertEquals(deleteResponse.getStatusCode(), 200);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testOwnershipValidation() throws Exception {
    try {
      // Send ownership challenge to destination
      Map<String, Object> cosConfig = new HashMap<>();
      cosConfig.put("bucket_name", cosBucket);
      cosConfig.put("region", cosRegion);
      cosConfig.put("id", cosInstance);

      GetLogpushOwnershipV2Options ownershipOptions = new GetLogpushOwnershipV2Options.Builder()
        .cos(cosConfig)
        .build();

      Response<OwnershipChallengeResp> ownershipResponse = service.getLogpushOwnershipV2(ownershipOptions).execute();
      
      assertNotNull(ownershipResponse);
      assertEquals(ownershipResponse.getStatusCode(), 200);
      
      OwnershipChallengeResp ownershipResult = ownershipResponse.getResult();
      assertNotNull(ownershipResult);
      assertTrue(ownershipResult.isSuccess());

      // Validate ownership challenge
      ValidateLogpushOwnershipChallengeV2Options validationOptions =
        new ValidateLogpushOwnershipChallengeV2Options.Builder()
          .cos(cosConfig)
          .ownershipChallenge(ownershipToken)
          .build();

      Response<OwnershipChallengeValidateResult> validationResponse =
        service.validateLogpushOwnershipChallengeV2(validationOptions).execute();
      
      assertNotNull(validationResponse);
      assertEquals(validationResponse.getStatusCode(), 200);
      
      OwnershipChallengeValidateResult validationResult = validationResponse.getResult();
      assertNotNull(validationResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListLogpushJobsForDataset() throws Exception {
    try {
      ListLogpushJobsForDatasetV2Options listJobsOptions = new ListLogpushJobsForDatasetV2Options();

      Response<LogpushJobsResp> response = service.listLogpushJobsForDatasetV2(listJobsOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LogpushJobsResp listJobsRespResult = response.getResult();
      assertNotNull(listJobsRespResult);
      // Note: success field may not be present in this response, so we just check it's not null
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s\nError details: %s",
        e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
}

// Made with Bob
