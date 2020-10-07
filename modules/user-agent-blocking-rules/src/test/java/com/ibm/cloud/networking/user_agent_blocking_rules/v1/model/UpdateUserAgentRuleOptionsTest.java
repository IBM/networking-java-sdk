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

package com.ibm.cloud.networking.user_agent_blocking_rules.v1.model;

import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UpdateUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleInputConfiguration;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateUserAgentRuleOptions model.
 */
public class UpdateUserAgentRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateUserAgentRuleOptions() throws Throwable {
    UseragentRuleInputConfiguration useragentRuleInputConfigurationModel = new UseragentRuleInputConfiguration.Builder()
      .target("ua")
      .value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4")
      .build();
    assertEquals(useragentRuleInputConfigurationModel.target(), "ua");
    assertEquals(useragentRuleInputConfigurationModel.value(), "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4");

    UpdateUserAgentRuleOptions updateUserAgentRuleOptionsModel = new UpdateUserAgentRuleOptions.Builder()
      .useragentRuleIdentifier("testString")
      .paused(true)
      .description("Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack")
      .mode("block")
      .configuration(useragentRuleInputConfigurationModel)
      .build();
    assertEquals(updateUserAgentRuleOptionsModel.useragentRuleIdentifier(), "testString");
    assertEquals(updateUserAgentRuleOptionsModel.paused(), Boolean.valueOf(true));
    assertEquals(updateUserAgentRuleOptionsModel.description(), "Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack");
    assertEquals(updateUserAgentRuleOptionsModel.mode(), "block");
    assertEquals(updateUserAgentRuleOptionsModel.configuration(), useragentRuleInputConfigurationModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateUserAgentRuleOptionsError() throws Throwable {
    new UpdateUserAgentRuleOptions.Builder().build();
  }

}