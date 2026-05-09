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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2RequestLogpushJobGenericReq;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLogpushJobV2RequestLogpushJobGenericReq model.
 */
public class CreateLogpushJobV2RequestLogpushJobGenericReqTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLogpushJobV2RequestLogpushJobGenericReq() throws Throwable {
    CreateLogpushJobV2RequestLogpushJobGenericReq createLogpushJobV2RequestLogpushJobGenericReqModel = new CreateLogpushJobV2RequestLogpushJobGenericReq.Builder()
      .name("My log push job")
      .enabled(false)
      .logpullOptions("timestamps=rfc3339&timestamps=rfc3339")
      .destinationConf("s3://mybucket/logs?region=us-west-2")
      .dataset("http_requests")
      .frequency("high")
      .build();
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModel.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModel.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModel.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModel.destinationConf(), "s3://mybucket/logs?region=us-west-2");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModel.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModel.frequency(), "high");

    String json = TestUtilities.serialize(createLogpushJobV2RequestLogpushJobGenericReqModel);

    CreateLogpushJobV2RequestLogpushJobGenericReq createLogpushJobV2RequestLogpushJobGenericReqModelNew = TestUtilities.deserialize(json, CreateLogpushJobV2RequestLogpushJobGenericReq.class);
    assertTrue(createLogpushJobV2RequestLogpushJobGenericReqModelNew instanceof CreateLogpushJobV2RequestLogpushJobGenericReq);
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModelNew.name(), "My log push job");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModelNew.enabled(), Boolean.valueOf(false));
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModelNew.logpullOptions(), "timestamps=rfc3339&timestamps=rfc3339");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModelNew.destinationConf(), "s3://mybucket/logs?region=us-west-2");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModelNew.dataset(), "http_requests");
    assertEquals(createLogpushJobV2RequestLogpushJobGenericReqModelNew.frequency(), "high");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLogpushJobV2RequestLogpushJobGenericReqError() throws Throwable {
    new CreateLogpushJobV2RequestLogpushJobGenericReq.Builder().build();
  }

}