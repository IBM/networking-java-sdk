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
import com.ibm.cloud.networking.webhooks.v1.model.CreateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateAlertWebhookOptions model.
 */
public class CreateAlertWebhookOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateAlertWebhookOptions() throws Throwable {
    CreateAlertWebhookOptions createAlertWebhookOptionsModel = new CreateAlertWebhookOptions.Builder()
      .name("My Slack Alert Webhook")
      .url("https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd")
      .secret("ff1d9b80-b51d-4a06-bf67-6752fae1eb74")
      .build();
    assertEquals(createAlertWebhookOptionsModel.name(), "My Slack Alert Webhook");
    assertEquals(createAlertWebhookOptionsModel.url(), "https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd");
    assertEquals(createAlertWebhookOptionsModel.secret(), "ff1d9b80-b51d-4a06-bf67-6752fae1eb74");
  }
}