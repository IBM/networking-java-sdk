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

package com.ibm.cloud.networking.zone_firewall_access_rules.v1.model;

import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListAllZoneAccessRulesOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListAllZoneAccessRulesOptions model.
 */
public class ListAllZoneAccessRulesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListAllZoneAccessRulesOptions() throws Throwable {
    ListAllZoneAccessRulesOptions listAllZoneAccessRulesOptionsModel = new ListAllZoneAccessRulesOptions.Builder()
      .notes("testString")
      .mode("block")
      .configurationTarget("ip")
      .configurationValue("1.2.3.4")
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .order("configuration.target")
      .direction("asc")
      .match("any")
      .build();
    assertEquals(listAllZoneAccessRulesOptionsModel.notes(), "testString");
    assertEquals(listAllZoneAccessRulesOptionsModel.mode(), "block");
    assertEquals(listAllZoneAccessRulesOptionsModel.configurationTarget(), "ip");
    assertEquals(listAllZoneAccessRulesOptionsModel.configurationValue(), "1.2.3.4");
    assertEquals(listAllZoneAccessRulesOptionsModel.page(), Long.valueOf("26"));
    assertEquals(listAllZoneAccessRulesOptionsModel.perPage(), Long.valueOf("5"));
    assertEquals(listAllZoneAccessRulesOptionsModel.order(), "configuration.target");
    assertEquals(listAllZoneAccessRulesOptionsModel.direction(), "asc");
    assertEquals(listAllZoneAccessRulesOptionsModel.match(), "any");
  }
}