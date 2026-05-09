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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobCosReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLogpushJobV2RequestLogpushJobCosReq model.
 */
public class CreateLogpushJobV2RequestLogpushJobCosReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLogpushJobV2RequestLogpushJobCosReq() throws Throwable {
    CreateLogpushJobV2RequestLogpushJobCosReq createLogpushJobV2RequestLogpushJobCosReqModel = new CreateLogpushJobV2RequestLogpushJobCosReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .cos(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ownershipChallenge("00000000000000000000000000000000")
      .dataset("http_requests")
      .frequency("high")
      .build();
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.cos(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.ownershipChallenge(), "00000000000000000000000000000000");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModel.frequency(), "high");

    String json = TestUtilities.serialize(createLogpushJobV2RequestLogpushJobCosReqModel);

    CreateLogpushJobV2RequestLogpushJobCosReq createLogpushJobV2RequestLogpushJobCosReqModelNew = TestUtilities.deserialize(json, CreateLogpushJobV2RequestLogpushJobCosReq.class);
    assertTrue(createLogpushJobV2RequestLogpushJobCosReqModelNew instanceof CreateLogpushJobV2RequestLogpushJobCosReq);
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.cos().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.ownershipChallenge(), "00000000000000000000000000000000");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobCosReqModelNew.frequency(), "high");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLogpushJobV2RequestLogpushJobCosReqError() throws Throwable {
    new CreateLogpushJobV2RequestLogpushJobCosReq.Builder().build();
  }

}