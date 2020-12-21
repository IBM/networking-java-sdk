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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Monitor model.
 */
public class MonitorTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMonitor() throws Throwable {
    Monitor monitorModel = new Monitor();
    assertNull(monitorModel.getId());
    assertNull(monitorModel.getName());
    assertNull(monitorModel.getDescription());
    assertNull(monitorModel.getType());
    assertNull(monitorModel.getPort());
    assertNull(monitorModel.getInterval());
    assertNull(monitorModel.getRetries());
    assertNull(monitorModel.getTimeout());
    assertNull(monitorModel.getMethod());
    assertNull(monitorModel.getPath());
    assertNull(monitorModel.getHeaders());
    assertNull(monitorModel.isAllowInsecure());
    assertNull(monitorModel.getExpectedCodes());
    assertNull(monitorModel.getExpectedBody());
    assertNull(monitorModel.getCreatedOn());
    assertNull(monitorModel.getModifiedOn());
  }
}