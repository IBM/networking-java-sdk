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

import com.ibm.cloud.networking.page_rule_api.v1.model.CreatePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItem;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItemConstraint;
import com.ibm.cloud.networking.page_rule_api.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePageRuleOptions model.
 */
public class CreatePageRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePageRuleOptions() throws Throwable {
    TargetsItemConstraint targetsItemConstraintModel = new TargetsItemConstraint.Builder()
      .operator("matches")
      .value("*example.com/images/*")
      .build();
    assertEquals(targetsItemConstraintModel.operator(), "matches");
    assertEquals(targetsItemConstraintModel.value(), "*example.com/images/*");

    TargetsItem targetsItemModel = new TargetsItem.Builder()
      .target("url")
      .constraint(targetsItemConstraintModel)
      .build();
    assertEquals(targetsItemModel.target(), "url");
    assertEquals(targetsItemModel.constraint(), targetsItemConstraintModel);

    CreatePageRuleOptions createPageRuleOptionsModel = new CreatePageRuleOptions.Builder()
      .targets(new java.util.ArrayList<TargetsItem>(java.util.Arrays.asList(targetsItemModel)))
      .actions(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .priority(Long.valueOf("1"))
      .status("active")
      .build();
    assertEquals(createPageRuleOptionsModel.targets(), new java.util.ArrayList<TargetsItem>(java.util.Arrays.asList(targetsItemModel)));
    assertEquals(createPageRuleOptionsModel.actions(), new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")));
    assertEquals(createPageRuleOptionsModel.priority(), Long.valueOf("1"));
    assertEquals(createPageRuleOptionsModel.status(), "active");
  }
}