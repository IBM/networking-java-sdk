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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobCosReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLogpushJobV2Options model.
 */
public class CreateLogpushJobV2OptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLogpushJobV2Options() throws Throwable {
    CreateLogpushJobV2RequestLogpushJobCosReq createLogpushJobV2RequestModel = new CreateLogpushJobV2RequestLogpushJobCosReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000000000000000")
      .dataset("http_requests")
      .frequency("high")
      .build();
    assertEquals(createLogpushJobV2RequestModel.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestModel.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestModel.cos(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createLogpushJobV2RequestModel.ownershipChallenge(), "00000000000000000000000000000000");
    assertEquals(createLogpushJobV2RequestModel.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestModel.frequency(), "high");

    CreateLogpushJobV2Options createLogpushJobV2OptionsModel = new CreateLogpushJobV2Options.Builder()
      .createLogpushJobV2Request(createLogpushJobV2RequestModel)
      .build();
    assertEquals(createLogpushJobV2OptionsModel.createLogpushJobV2Request(), createLogpushJobV2RequestModel);
  }
}