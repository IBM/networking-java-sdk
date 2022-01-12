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
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAlertPolicyOptions model.
 */
public class UpdateAlertPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAlertPolicyOptions() throws Throwable {
    UpdateAlertPolicyInputMechanismsEmailItem updateAlertPolicyInputMechanismsEmailItemModel = new UpdateAlertPolicyInputMechanismsEmailItem.Builder()
      .id("mynotifications@email.com")
      .build();
    assertEquals(updateAlertPolicyInputMechanismsEmailItemModel.id(), "mynotifications@email.com");

    UpdateAlertPolicyInputMechanismsWebhooksItem updateAlertPolicyInputMechanismsWebhooksItemModel = new UpdateAlertPolicyInputMechanismsWebhooksItem.Builder()
      .id("f0413b106d2c4aa9b1553d5d0209c522")
      .build();
    assertEquals(updateAlertPolicyInputMechanismsWebhooksItemModel.id(), "f0413b106d2c4aa9b1553d5d0209c522");

    UpdateAlertPolicyInputMechanisms updateAlertPolicyInputMechanismsModel = new UpdateAlertPolicyInputMechanisms.Builder()
      .email(new java.util.ArrayList<UpdateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsEmailItemModel)))
      .webhooks(new java.util.ArrayList<UpdateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsWebhooksItemModel)))
      .build();
    assertEquals(updateAlertPolicyInputMechanismsModel.email(), new java.util.ArrayList<UpdateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsEmailItemModel)));
    assertEquals(updateAlertPolicyInputMechanismsModel.webhooks(), new java.util.ArrayList<UpdateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsWebhooksItemModel)));

    UpdateAlertPolicyOptions updateAlertPolicyOptionsModel = new UpdateAlertPolicyOptions.Builder()
      .policyId("testString")
      .name("My Alert Policy")
      .description("A description for my alert policy")
      .enabled(true)
      .alertType("dos_attack_l7")
      .mechanisms(updateAlertPolicyInputMechanismsModel)
      .conditions(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .filters(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(updateAlertPolicyOptionsModel.policyId(), "testString");
    assertEquals(updateAlertPolicyOptionsModel.name(), "My Alert Policy");
    assertEquals(updateAlertPolicyOptionsModel.description(), "A description for my alert policy");
    assertEquals(updateAlertPolicyOptionsModel.enabled(), Boolean.valueOf(true));
    assertEquals(updateAlertPolicyOptionsModel.alertType(), "dos_attack_l7");
    assertEquals(updateAlertPolicyOptionsModel.mechanisms(), updateAlertPolicyInputMechanismsModel);
    assertEquals(updateAlertPolicyOptionsModel.conditions(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(updateAlertPolicyOptionsModel.filters(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAlertPolicyOptionsError() throws Throwable {
    new UpdateAlertPolicyOptions.Builder().build();
  }

}