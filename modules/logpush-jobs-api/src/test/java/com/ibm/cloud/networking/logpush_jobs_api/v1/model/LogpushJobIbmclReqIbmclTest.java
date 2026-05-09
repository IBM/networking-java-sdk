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

import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobIbmclReqIbmcl;
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LogpushJobIbmclReqIbmcl model.
 */
public class LogpushJobIbmclReqIbmclTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLogpushJobIbmclReqIbmcl() throws Throwable {
    LogpushJobIbmclReqIbmcl logpushJobIbmclReqIbmclModel = new LogpushJobIbmclReqIbmcl.Builder()
      .instanceId("90d208cc-e1dd-4fb2-a938-358e5996f056")
      .region("eu-es")
      .apiKey("XXXXXXXXXXXXXX")
      .build();
    assertEquals(logpushJobIbmclReqIbmclModel.instanceId(), "90d208cc-e1dd-4fb2-a938-358e5996f056");
    assertEquals(logpushJobIbmclReqIbmclModel.region(), "eu-es");
    assertEquals(logpushJobIbmclReqIbmclModel.apiKey(), "XXXXXXXXXXXXXX");

    String json = TestUtilities.serialize(logpushJobIbmclReqIbmclModel);

    LogpushJobIbmclReqIbmcl logpushJobIbmclReqIbmclModelNew = TestUtilities.deserialize(json, LogpushJobIbmclReqIbmcl.class);
    assertTrue(logpushJobIbmclReqIbmclModelNew instanceof LogpushJobIbmclReqIbmcl);
    assertEquals(logpushJobIbmclReqIbmclModelNew.instanceId(), "90d208cc-e1dd-4fb2-a938-358e5996f056");
    assertEquals(logpushJobIbmclReqIbmclModelNew.region(), "eu-es");
    assertEquals(logpushJobIbmclReqIbmclModelNew.apiKey(), "XXXXXXXXXXXXXX");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLogpushJobIbmclReqIbmclError() throws Throwable {
    new LogpushJobIbmclReqIbmcl.Builder().build();
  }

}