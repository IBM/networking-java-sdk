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

package com.ibm.cloud.networking.zone_lockdown.v1.model;

import com.ibm.cloud.networking.zone_lockdown.v1.model.CreateZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownInputConfigurationsItem;
import com.ibm.cloud.networking.zone_lockdown.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateZoneLockdownRuleOptions model.
 */
public class CreateZoneLockdownRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateZoneLockdownRuleOptions() throws Throwable {
    LockdownInputConfigurationsItem lockdownInputConfigurationsItemModel = new LockdownInputConfigurationsItem.Builder()
      .target("ip")
      .value("198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range")
      .build();
    assertEquals(lockdownInputConfigurationsItemModel.target(), "ip");
    assertEquals(lockdownInputConfigurationsItemModel.value(), "198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range");

    CreateZoneLockdownRuleOptions createZoneLockdownRuleOptionsModel = new CreateZoneLockdownRuleOptions.Builder()
      .id("372e67954025e0ba6aaa6d586b9e0b59")
      .paused(false)
      .description("Restrict access to these endpoints to requests from a known IP address")
      .urls(new java.util.ArrayList<String>(java.util.Arrays.asList("api.mysite.com/some/endpoint*")))
      .configurations(new java.util.ArrayList<LockdownInputConfigurationsItem>(java.util.Arrays.asList(lockdownInputConfigurationsItemModel)))
      .build();
    assertEquals(createZoneLockdownRuleOptionsModel.id(), "372e67954025e0ba6aaa6d586b9e0b59");
    assertEquals(createZoneLockdownRuleOptionsModel.paused(), Boolean.valueOf(false));
    assertEquals(createZoneLockdownRuleOptionsModel.description(), "Restrict access to these endpoints to requests from a known IP address");
    assertEquals(createZoneLockdownRuleOptionsModel.urls(), new java.util.ArrayList<String>(java.util.Arrays.asList("api.mysite.com/some/endpoint*")));
    assertEquals(createZoneLockdownRuleOptionsModel.configurations(), new java.util.ArrayList<LockdownInputConfigurationsItem>(java.util.Arrays.asList(lockdownInputConfigurationsItemModel)));
  }
}