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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobLogdnaReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLogpushJobV2RequestLogpushJobLogdnaReq model.
 */
public class CreateLogpushJobV2RequestLogpushJobLogdnaReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLogpushJobV2RequestLogpushJobLogdnaReq() throws Throwable {
    CreateLogpushJobV2RequestLogpushJobLogdnaReq createLogpushJobV2RequestLogpushJobLogdnaReqModel = new CreateLogpushJobV2RequestLogpushJobLogdnaReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .logdna(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .dataset("http_requests")
      .frequency("high")
      .build();
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModel.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModel.logdna(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModel.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModel.frequency(), "high");

    String json = TestUtilities.serialize(createLogpushJobV2RequestLogpushJobLogdnaReqModel);

    CreateLogpushJobV2RequestLogpushJobLogdnaReq createLogpushJobV2RequestLogpushJobLogdnaReqModelNew = TestUtilities.deserialize(json, CreateLogpushJobV2RequestLogpushJobLogdnaReq.class);
    assertTrue(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew instanceof CreateLogpushJobV2RequestLogpushJobLogdnaReq);
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew.logdna().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobLogdnaReqModelNew.frequency(), "high");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLogpushJobV2RequestLogpushJobLogdnaReqError() throws Throwable {
    new CreateLogpushJobV2RequestLogpushJobLogdnaReq.Builder().build();
  }

}