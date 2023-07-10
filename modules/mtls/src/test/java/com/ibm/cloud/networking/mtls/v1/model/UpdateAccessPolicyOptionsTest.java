/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.networking.mtls.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.mtls.v1.model.PolicyRulePolicyCertRule;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAccessPolicyOptions model.
 */
public class UpdateAccessPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAccessPolicyOptions() throws Throwable {
    PolicyRulePolicyCertRule policyRuleModel = new PolicyRulePolicyCertRule.Builder()
      .certificate(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(policyRuleModel.certificate(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    UpdateAccessPolicyOptions updateAccessPolicyOptionsModel = new UpdateAccessPolicyOptions.Builder()
      .zoneId("testString")
      .appId("testString")
      .policyId("testString")
      .name("mtls-test-policy")
      .decision("non_identity")
      .include(java.util.Arrays.asList(policyRuleModel))
      .build();
    assertEquals(updateAccessPolicyOptionsModel.zoneId(), "testString");
    assertEquals(updateAccessPolicyOptionsModel.appId(), "testString");
    assertEquals(updateAccessPolicyOptionsModel.policyId(), "testString");
    assertEquals(updateAccessPolicyOptionsModel.name(), "mtls-test-policy");
    assertEquals(updateAccessPolicyOptionsModel.decision(), "non_identity");
    assertEquals(updateAccessPolicyOptionsModel.include(), java.util.Arrays.asList(policyRuleModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessPolicyOptionsError() throws Throwable {
    new UpdateAccessPolicyOptions.Builder().build();
  }

}