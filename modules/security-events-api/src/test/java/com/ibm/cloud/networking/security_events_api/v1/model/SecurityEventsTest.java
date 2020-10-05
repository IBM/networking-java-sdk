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

import com.ibm.cloud.networking.security_events_api.v1.model.ResultInfo;
import com.ibm.cloud.networking.security_events_api.v1.model.ResultInfoCursors;
import com.ibm.cloud.networking.security_events_api.v1.model.ResultInfoScannedRange;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventObject;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventObjectMatchesItem;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEvents;
import com.ibm.cloud.networking.security_events_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityEvents model.
 */
public class SecurityEventsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityEvents() throws Throwable {
    SecurityEvents securityEventsModel = new SecurityEvents();
    assertNull(securityEventsModel.getResult());
    assertNull(securityEventsModel.getResultInfo());
    assertNull(securityEventsModel.isSuccess());
    assertNull(securityEventsModel.getErrors());
    assertNull(securityEventsModel.getMessages());
  }
}