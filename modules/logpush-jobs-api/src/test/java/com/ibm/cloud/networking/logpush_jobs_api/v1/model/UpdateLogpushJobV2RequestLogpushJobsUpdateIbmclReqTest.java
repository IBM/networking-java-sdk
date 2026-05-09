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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobsUpdateIbmclReqIbmcl;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq model.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq() throws Throwable {
    LogpushJobsUpdateIbmclReqIbmcl logpushJobsUpdateIbmclReqIbmclModel = new LogpushJobsUpdateIbmclReqIbmcl.Builder()
      .instanceId("90d208cc-e1dd-4fb2-a938-358e5996f056")
      .region("eu-es")
      .apiKey("XXXXXXXXXXXXXX")
      .build();
    assertEquals(logpushJobsUpdateIbmclReqIbmclModel.instanceId(), "90d208cc-e1dd-4fb2-a938-358e5996f056");
    assertEquals(logpushJobsUpdateIbmclReqIbmclModel.region(), "eu-es");
    assertEquals(logpushJobsUpdateIbmclReqIbmclModel.apiKey(), "XXXXXXXXXXXXXX");

    UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModel = new UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.Builder()
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .ibmcl(logpushJobsUpdateIbmclReqIbmclModel)
      .frequency("high")
      .build();
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModel.ibmcl(), logpushJobsUpdateIbmclReqIbmclModel);
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModel.frequency(), "high");

    String json = TestUtilities.serialize(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModel);

    UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModelNew = TestUtilities.deserialize(json, UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.class);
    assertTrue(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModelNew instanceof UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq);
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModelNew.ibmcl().toString(), logpushJobsUpdateIbmclReqIbmclModel.toString());
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateIbmclReqModelNew.frequency(), "high");
  }
}