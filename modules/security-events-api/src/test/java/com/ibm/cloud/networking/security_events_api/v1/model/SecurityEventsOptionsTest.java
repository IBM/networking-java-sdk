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

package com.ibm.cloud.networking.security_events_api.v1.model;

import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventsOptions;
import com.ibm.cloud.networking.security_events_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityEventsOptions model.
 */
public class SecurityEventsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityEventsOptions() throws Throwable {
    SecurityEventsOptions securityEventsOptionsModel = new SecurityEventsOptions.Builder()
      .ipClass("unknown")
      .method("GET")
      .scheme("unknown")
      .ip("testString")
      .host("testString")
      .proto("UNK")
      .uri("testString")
      .ua("testString")
      .colo("testString")
      .rayId("testString")
      .kind("firewall")
      .action("unknown")
      .cursor("testString")
      .country("testString")
      .since(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .source("unknown")
      .limit(Long.valueOf("10"))
      .ruleId("testString")
      .until(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(securityEventsOptionsModel.ipClass(), "unknown");
    assertEquals(securityEventsOptionsModel.method(), "GET");
    assertEquals(securityEventsOptionsModel.scheme(), "unknown");
    assertEquals(securityEventsOptionsModel.ip(), "testString");
    assertEquals(securityEventsOptionsModel.host(), "testString");
    assertEquals(securityEventsOptionsModel.proto(), "UNK");
    assertEquals(securityEventsOptionsModel.uri(), "testString");
    assertEquals(securityEventsOptionsModel.ua(), "testString");
    assertEquals(securityEventsOptionsModel.colo(), "testString");
    assertEquals(securityEventsOptionsModel.rayId(), "testString");
    assertEquals(securityEventsOptionsModel.kind(), "firewall");
    assertEquals(securityEventsOptionsModel.action(), "unknown");
    assertEquals(securityEventsOptionsModel.cursor(), "testString");
    assertEquals(securityEventsOptionsModel.country(), "testString");
    assertEquals(securityEventsOptionsModel.since(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(securityEventsOptionsModel.source(), "unknown");
    assertEquals(securityEventsOptionsModel.limit(), Long.valueOf("10"));
    assertEquals(securityEventsOptionsModel.ruleId(), "testString");
    assertEquals(securityEventsOptionsModel.until(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
  }
}