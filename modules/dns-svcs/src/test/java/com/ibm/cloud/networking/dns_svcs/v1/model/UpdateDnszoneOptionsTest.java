/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateDnszoneOptions model.
 */
public class UpdateDnszoneOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateDnszoneOptions() throws Throwable {
    UpdateDnszoneOptions updateDnszoneOptionsModel = new UpdateDnszoneOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .description("The DNS zone is used for VPCs in us-east region")
      .label("us-east")
      .xCorrelationId("testString")
      .build();
    assertEquals(updateDnszoneOptionsModel.instanceId(), "testString");
    assertEquals(updateDnszoneOptionsModel.dnszoneId(), "testString");
    assertEquals(updateDnszoneOptionsModel.description(), "The DNS zone is used for VPCs in us-east region");
    assertEquals(updateDnszoneOptionsModel.label(), "us-east");
    assertEquals(updateDnszoneOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDnszoneOptionsError() throws Throwable {
    new UpdateDnszoneOptions.Builder().build();
  }

}