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

import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItemConstraint;
import com.ibm.cloud.networking.page_rule_api.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TargetsItemConstraint model.
 */
public class TargetsItemConstraintTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTargetsItemConstraint() throws Throwable {
    TargetsItemConstraint targetsItemConstraintModel = new TargetsItemConstraint.Builder()
      .operator("matches")
      .value("*example.com/images/*")
      .build();
    assertEquals(targetsItemConstraintModel.operator(), "matches");
    assertEquals(targetsItemConstraintModel.value(), "*example.com/images/*");

    String json = TestUtilities.serialize(targetsItemConstraintModel);

    TargetsItemConstraint targetsItemConstraintModelNew = TestUtilities.deserialize(json, TargetsItemConstraint.class);
    assertTrue(targetsItemConstraintModelNew instanceof TargetsItemConstraint);
    assertEquals(targetsItemConstraintModelNew.operator(), "matches");
    assertEquals(targetsItemConstraintModelNew.value(), "*example.com/images/*");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTargetsItemConstraintError() throws Throwable {
    new TargetsItemConstraint.Builder().build();
  }

}