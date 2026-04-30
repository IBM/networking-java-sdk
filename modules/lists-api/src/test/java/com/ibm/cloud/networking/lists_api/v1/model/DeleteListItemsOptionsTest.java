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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.ibm.cloud.networking.lists_api.v1.model.DeleteListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteListItemsReqItemsItem;
import com.ibm.cloud.networking.lists_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteListItemsOptions model.
 */
public class DeleteListItemsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteListItemsOptions() throws Throwable {
    DeleteListItemsReqItemsItem deleteListItemsReqItemsItemModel = new DeleteListItemsReqItemsItem.Builder()
      .id("70c2009751b24ffc9ed1ab462ba957b4")
      .build();
    assertEquals(deleteListItemsReqItemsItemModel.id(), "70c2009751b24ffc9ed1ab462ba957b4");

    DeleteListItemsOptions deleteListItemsOptionsModel = new DeleteListItemsOptions.Builder()
      .items(java.util.Arrays.asList(deleteListItemsReqItemsItemModel))
      .build();
    assertEquals(deleteListItemsOptionsModel.items(), java.util.Arrays.asList(deleteListItemsReqItemsItemModel));
  }
}