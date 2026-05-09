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
import com.ibm.cloud.networking.logpush_jobs_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LogpushJobsUpdateIbmclReqIbmcl model.
 */
public class LogpushJobsUpdateIbmclReqIbmclTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLogpushJobsUpdateIbmclReqIbmcl() throws Throwable {
    LogpushJobsUpdateIbmclReqIbmcl logpushJobsUpdateIbmclReqIbmclModel = new LogpushJobsUpdateIbmclReqIbmcl.Builder()
      .instanceId("90d208cc-e1dd-4fb2-a938-358e5996f056")
      .region("eu-es")
      .apiKey("XXXXXXXXXXXXXX")
      .build();
    assertEquals(logpushJobsUpdateIbmclReqIbmclModel.instanceId(), "90d208cc-e1dd-4fb2-a938-358e5996f056");
    assertEquals(logpushJobsUpdateIbmclReqIbmclModel.region(), "eu-es");
    assertEquals(logpushJobsUpdateIbmclReqIbmclModel.apiKey(), "XXXXXXXXXXXXXX");

    String json = TestUtilities.serialize(logpushJobsUpdateIbmclReqIbmclModel);

    LogpushJobsUpdateIbmclReqIbmcl logpushJobsUpdateIbmclReqIbmclModelNew = TestUtilities.deserialize(json, LogpushJobsUpdateIbmclReqIbmcl.class);
    assertTrue(logpushJobsUpdateIbmclReqIbmclModelNew instanceof LogpushJobsUpdateIbmclReqIbmcl);
    assertEquals(logpushJobsUpdateIbmclReqIbmclModelNew.instanceId(), "90d208cc-e1dd-4fb2-a938-358e5996f056");
    assertEquals(logpushJobsUpdateIbmclReqIbmclModelNew.region(), "eu-es");
    assertEquals(logpushJobsUpdateIbmclReqIbmclModelNew.apiKey(), "XXXXXXXXXXXXXX");
  }
}