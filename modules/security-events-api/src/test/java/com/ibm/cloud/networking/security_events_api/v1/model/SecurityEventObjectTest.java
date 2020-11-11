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

import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventObject;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventObjectMatchesItem;
import com.ibm.cloud.networking.security_events_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityEventObject model.
 */
public class SecurityEventObjectTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityEventObject() throws Throwable {
    SecurityEventObject securityEventObjectModel = new SecurityEventObject();
    assertNull(securityEventObjectModel.getRayId());
    assertNull(securityEventObjectModel.getKind());
    assertNull(securityEventObjectModel.getSource());
    assertNull(securityEventObjectModel.getAction());
    assertNull(securityEventObjectModel.getRuleId());
    assertNull(securityEventObjectModel.getIp());
    assertNull(securityEventObjectModel.getIpClass());
    assertNull(securityEventObjectModel.getCountry());
    assertNull(securityEventObjectModel.getColo());
    assertNull(securityEventObjectModel.getHost());
    assertNull(securityEventObjectModel.getMethod());
    assertNull(securityEventObjectModel.getProto());
    assertNull(securityEventObjectModel.getScheme());
    assertNull(securityEventObjectModel.getUa());
    assertNull(securityEventObjectModel.getUri());
    assertNull(securityEventObjectModel.getOccurredAt());
    assertNull(securityEventObjectModel.getMatches());
  }
}