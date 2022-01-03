/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.networking.webhooks.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.webhooks.v1.model.UpdateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAlertWebhookOptions model.
 */
public class UpdateAlertWebhookOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAlertWebhookOptions() throws Throwable {
    UpdateAlertWebhookOptions updateAlertWebhookOptionsModel = new UpdateAlertWebhookOptions.Builder()
      .webhookId("testString")
      .name("My Slack Alert Webhook")
      .url("https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd")
      .secret("ff1d9b80-b51d-4a06-bf67-6752fae1eb74")
      .build();
    assertEquals(updateAlertWebhookOptionsModel.webhookId(), "testString");
    assertEquals(updateAlertWebhookOptionsModel.name(), "My Slack Alert Webhook");
    assertEquals(updateAlertWebhookOptionsModel.url(), "https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd");
    assertEquals(updateAlertWebhookOptionsModel.secret(), "ff1d9b80-b51d-4a06-bf67-6752fae1eb74");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAlertWebhookOptionsError() throws Throwable {
    new UpdateAlertWebhookOptions.Builder().build();
  }

}