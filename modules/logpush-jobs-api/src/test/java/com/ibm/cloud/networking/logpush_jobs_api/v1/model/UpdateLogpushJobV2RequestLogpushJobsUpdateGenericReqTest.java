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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq model.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq() throws Throwable {
    UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel = new UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .destinationConf("s3://mybucket/logs?region=us-west-2")
      .dataset("http_requests")
      .frequency("high")
      .build();
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel.name(), "My log push job");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel.destinationConf(), "s3://mybucket/logs?region=us-west-2");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel.dataset(), "http_requests");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel.frequency(), "high");

    String json = TestUtilities.serialize(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModel);

    UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew = TestUtilities.deserialize(json, UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq.class);
    assertTrue(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew instanceof UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq);
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew.name(), "My log push job");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew.destinationConf(), "s3://mybucket/logs?region=us-west-2");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew.dataset(), "http_requests");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateGenericReqModelNew.frequency(), "high");
  }
}