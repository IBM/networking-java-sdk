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

package com.ibm.cloud.networking.logpush_jobs_api.v1.model;

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobIbmclReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobIbmclReqIbmcl;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLogpushJobV2RequestLogpushJobIbmclReq model.
 */
public class CreateLogpushJobV2RequestLogpushJobIbmclReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLogpushJobV2RequestLogpushJobIbmclReq() throws Throwable {
    LogpushJobIbmclReqIbmcl logpushJobIbmclReqIbmclModel = new LogpushJobIbmclReqIbmcl.Builder()
      .instanceId("90d208cc-e1dd-4fb2-a938-358e5996f056")
      .region("eu-es")
      .apiKey("XXXXXXXXXXXXXX")
      .build();
    assertEquals(logpushJobIbmclReqIbmclModel.instanceId(), "90d208cc-e1dd-4fb2-a938-358e5996f056");
    assertEquals(logpushJobIbmclReqIbmclModel.region(), "eu-es");
    assertEquals(logpushJobIbmclReqIbmclModel.apiKey(), "XXXXXXXXXXXXXX");

    CreateLogpushJobV2RequestLogpushJobIbmclReq createLogpushJobV2RequestLogpushJobIbmclReqModel = new CreateLogpushJobV2RequestLogpushJobIbmclReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .ibmcl(logpushJobIbmclReqIbmclModel)
      .dataset("http_requests")
      .frequency("high")
      .build();
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModel.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModel.ibmcl(), logpushJobIbmclReqIbmclModel);
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModel.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModel.frequency(), "high");

    String json = TestUtilities.serialize(createLogpushJobV2RequestLogpushJobIbmclReqModel);

    CreateLogpushJobV2RequestLogpushJobIbmclReq createLogpushJobV2RequestLogpushJobIbmclReqModelNew = TestUtilities.deserialize(json, CreateLogpushJobV2RequestLogpushJobIbmclReq.class);
    assertTrue(createLogpushJobV2RequestLogpushJobIbmclReqModelNew instanceof CreateLogpushJobV2RequestLogpushJobIbmclReq);
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModelNew.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModelNew.ibmcl().toString(), logpushJobIbmclReqIbmclModel.toString());
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModelNew.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobIbmclReqModelNew.frequency(), "high");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLogpushJobV2RequestLogpushJobIbmclReqError() throws Throwable {
    new CreateLogpushJobV2RequestLogpushJobIbmclReq.Builder().build();
  }

}