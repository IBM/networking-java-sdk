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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLogpushJobV2Options model.
 */
public class UpdateLogpushJobV2OptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLogpushJobV2Options() throws Throwable {
    UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq updateLogpushJobV2RequestModel = new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.Builder()
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000000000000000")
      .frequency("high")
      .build();
    assertEquals(updateLogpushJobV2RequestModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateLogpushJobV2RequestModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(updateLogpushJobV2RequestModel.cos(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateLogpushJobV2RequestModel.ownershipChallenge(), "00000000000000000000000000000000");
    assertEquals(updateLogpushJobV2RequestModel.frequency(), "high");

    UpdateLogpushJobV2Options updateLogpushJobV2OptionsModel = new UpdateLogpushJobV2Options.Builder()
      .jobId("testString")
      .updateLogpushJobV2Request(updateLogpushJobV2RequestModel)
      .build();
    assertEquals(updateLogpushJobV2OptionsModel.jobId(), "testString");
    assertEquals(updateLogpushJobV2OptionsModel.updateLogpushJobV2Request(), updateLogpushJobV2RequestModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLogpushJobV2OptionsError() throws Throwable {
    new UpdateLogpushJobV2Options.Builder().build();
  }

}