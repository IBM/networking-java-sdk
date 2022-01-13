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
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItemMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItemMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItemMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListAlertPoliciesRespResultItem model.
 */
public class ListAlertPoliciesRespResultItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListAlertPoliciesRespResultItem() throws Throwable {
    ListAlertPoliciesRespResultItem listAlertPoliciesRespResultItemModel = new ListAlertPoliciesRespResultItem();
    assertNull(listAlertPoliciesRespResultItemModel.getId());
    assertNull(listAlertPoliciesRespResultItemModel.getName());
    assertNull(listAlertPoliciesRespResultItemModel.getDescription());
    assertNull(listAlertPoliciesRespResultItemModel.isEnabled());
    assertNull(listAlertPoliciesRespResultItemModel.getAlertType());
    assertNull(listAlertPoliciesRespResultItemModel.getMechanisms());
    assertNull(listAlertPoliciesRespResultItemModel.getCreated());
    assertNull(listAlertPoliciesRespResultItemModel.getModified());
    assertNull(listAlertPoliciesRespResultItemModel.getConditions());
    assertNull(listAlertPoliciesRespResultItemModel.getFilters());
  }
}