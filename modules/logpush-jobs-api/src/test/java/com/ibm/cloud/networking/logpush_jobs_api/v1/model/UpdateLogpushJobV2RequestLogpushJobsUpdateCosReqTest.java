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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq model.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateCosReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLogpushJobV2RequestLogpushJobsUpdateCosReq() throws Throwable {
    UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel = new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.Builder()
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000000000000000")
      .frequency("high")
      .build();
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel.cos(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel.ownershipChallenge(), "00000000000000000000000000000000");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel.frequency(), "high");

    String json = TestUtilities.serialize(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModel);

    UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew = TestUtilities.deserialize(json, UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.class);
    assertTrue(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew instanceof UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq);
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew.cos().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew.ownershipChallenge(), "00000000000000000000000000000000");
    assertEquals(updateLogpushJobV2RequestLogpushJobsUpdateCosReqModelNew.frequency(), "high");
  }
}