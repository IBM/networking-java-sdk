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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq model.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq() throws Throwable {
    UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModel = new UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.Builder()
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .logdna(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .frequency("high")
      .build();
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModel.logdna(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModel.frequency(), "high");

    String json = TestUtilities.serialize(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModel);

    UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModelNew = TestUtilities.deserialize(json, UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.class);
    assertTrue(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModelNew instanceof UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq);
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModelNew.logdna().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReqModelNew.frequency(), "high");
  }
}