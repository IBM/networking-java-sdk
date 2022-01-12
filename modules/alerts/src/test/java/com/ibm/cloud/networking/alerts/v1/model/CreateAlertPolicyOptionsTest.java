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

package com.ibm.cloud.networking.alerts.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateAlertPolicyOptions model.
 */
public class CreateAlertPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateAlertPolicyOptions() throws Throwable {
    CreateAlertPolicyInputMechanismsEmailItem createAlertPolicyInputMechanismsEmailItemModel = new CreateAlertPolicyInputMechanismsEmailItem.Builder()
      .id("mynotifications@email.com")
      .build();
    assertEquals(createAlertPolicyInputMechanismsEmailItemModel.id(), "mynotifications@email.com");

    CreateAlertPolicyInputMechanismsWebhooksItem createAlertPolicyInputMechanismsWebhooksItemModel = new CreateAlertPolicyInputMechanismsWebhooksItem.Builder()
      .id("f0413b106d2c4aa9b1553d5d0209c522")
      .build();
    assertEquals(createAlertPolicyInputMechanismsWebhooksItemModel.id(), "f0413b106d2c4aa9b1553d5d0209c522");

    CreateAlertPolicyInputMechanisms createAlertPolicyInputMechanismsModel = new CreateAlertPolicyInputMechanisms.Builder()
      .email(new java.util.ArrayList<CreateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsEmailItemModel)))
      .webhooks(new java.util.ArrayList<CreateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsWebhooksItemModel)))
      .build();
    assertEquals(createAlertPolicyInputMechanismsModel.email(), new java.util.ArrayList<CreateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsEmailItemModel)));
    assertEquals(createAlertPolicyInputMechanismsModel.webhooks(), new java.util.ArrayList<CreateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsWebhooksItemModel)));

    CreateAlertPolicyOptions createAlertPolicyOptionsModel = new CreateAlertPolicyOptions.Builder()
      .name("My Alert Policy")
      .description("A description for my alert policy")
      .enabled(true)
      .alertType("dos_attack_l7")
      .mechanisms(createAlertPolicyInputMechanismsModel)
      .filters(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .conditions(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(createAlertPolicyOptionsModel.name(), "My Alert Policy");
    assertEquals(createAlertPolicyOptionsModel.description(), "A description for my alert policy");
    assertEquals(createAlertPolicyOptionsModel.enabled(), Boolean.valueOf(true));
    assertEquals(createAlertPolicyOptionsModel.alertType(), "dos_attack_l7");
    assertEquals(createAlertPolicyOptionsModel.mechanisms(), createAlertPolicyInputMechanismsModel);
    assertEquals(createAlertPolicyOptionsModel.filters(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(createAlertPolicyOptionsModel.conditions(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
  }
}