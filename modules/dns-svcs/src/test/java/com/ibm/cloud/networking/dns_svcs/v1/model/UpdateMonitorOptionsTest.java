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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateMonitorOptions model.
 */
public class UpdateMonitorOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateMonitorOptions() throws Throwable {
    HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
      .name("Host")
      .value(java.util.Arrays.asList("origin.example.com"))
      .build();
    assertEquals(healthcheckHeaderModel.name(), "Host");
    assertEquals(healthcheckHeaderModel.value(), java.util.Arrays.asList("origin.example.com"));

    UpdateMonitorOptions updateMonitorOptionsModel = new UpdateMonitorOptions.Builder()
      .instanceId("testString")
      .monitorId("testString")
      .name("healthcheck-monitor")
      .description("Load balancer monitor for glb.example.com.")
      .type("HTTPS")
      .port(Long.valueOf("8080"))
      .interval(Long.valueOf("60"))
      .retries(Long.valueOf("2"))
      .timeout(Long.valueOf("5"))
      .method("GET")
      .path("/health")
      .headers(java.util.Arrays.asList(healthcheckHeaderModel))
      .allowInsecure(false)
      .expectedCodes("200")
      .expectedBody("alive")
      .xCorrelationId("testString")
      .build();
    assertEquals(updateMonitorOptionsModel.instanceId(), "testString");
    assertEquals(updateMonitorOptionsModel.monitorId(), "testString");
    assertEquals(updateMonitorOptionsModel.name(), "healthcheck-monitor");
    assertEquals(updateMonitorOptionsModel.description(), "Load balancer monitor for glb.example.com.");
    assertEquals(updateMonitorOptionsModel.type(), "HTTPS");
    assertEquals(updateMonitorOptionsModel.port(), Long.valueOf("8080"));
    assertEquals(updateMonitorOptionsModel.interval(), Long.valueOf("60"));
    assertEquals(updateMonitorOptionsModel.retries(), Long.valueOf("2"));
    assertEquals(updateMonitorOptionsModel.timeout(), Long.valueOf("5"));
    assertEquals(updateMonitorOptionsModel.method(), "GET");
    assertEquals(updateMonitorOptionsModel.path(), "/health");
    assertEquals(updateMonitorOptionsModel.headers(), java.util.Arrays.asList(healthcheckHeaderModel));
    assertEquals(updateMonitorOptionsModel.allowInsecure(), Boolean.valueOf(false));
    assertEquals(updateMonitorOptionsModel.expectedCodes(), "200");
    assertEquals(updateMonitorOptionsModel.expectedBody(), "alive");
    assertEquals(updateMonitorOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMonitorOptionsError() throws Throwable {
    new UpdateMonitorOptions.Builder().build();
  }

}