/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.cloud.networking.page_rule_api.v1.model;

import com.ibm.cloud.networking.page_rule_api.v1.model.PageRuleResult;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItem;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItemConstraint;
import com.ibm.cloud.networking.page_rule_api.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PageRuleResult model.
 */
public class PageRuleResultTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPageRuleResult() throws Throwable {
    PageRuleResult pageRuleResultModel = new PageRuleResult();
    assertNull(pageRuleResultModel.getId());
    assertNull(pageRuleResultModel.getTargets());
    assertNull(pageRuleResultModel.getActions());
    assertNull(pageRuleResultModel.getPriority());
    assertNull(pageRuleResultModel.getStatus());
    assertNull(pageRuleResultModel.getModifiedOn());
    assertNull(pageRuleResultModel.getCreatedOn());
  }
}