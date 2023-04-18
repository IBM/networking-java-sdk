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
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMonitorOptions model.
 */
public class CreateMonitorOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMonitorOptions() throws Throwable {
    HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
      .name("Host")
      .value(new java.util.ArrayList<String>(java.util.Arrays.asList("origin.example.com")))
      .build();
    assertEquals(healthcheckHeaderModel.name(), "Host");
    assertEquals(healthcheckHeaderModel.value(), new java.util.ArrayList<String>(java.util.Arrays.asList("origin.example.com")));

    CreateMonitorOptions createMonitorOptionsModel = new CreateMonitorOptions.Builder()
      .instanceId("testString")
      .name("healthcheck-monitor")
      .description("Load balancer monitor for glb.example.com.")
      .type("HTTPS")
      .port(Long.valueOf("8080"))
      .interval(Long.valueOf("60"))
      .retries(Long.valueOf("2"))
      .timeout(Long.valueOf("5"))
      .method("GET")
      .path("/health")
      .headers(new java.util.ArrayList<HealthcheckHeader>(java.util.Arrays.asList(healthcheckHeaderModel)))
      .allowInsecure(false)
      .expectedCodes("200")
      .expectedBody("alive")
      .xCorrelationId("testString")
      .build();
    assertEquals(createMonitorOptionsModel.instanceId(), "testString");
    assertEquals(createMonitorOptionsModel.name(), "healthcheck-monitor");
    assertEquals(createMonitorOptionsModel.description(), "Load balancer monitor for glb.example.com.");
    assertEquals(createMonitorOptionsModel.type(), "HTTPS");
    assertEquals(createMonitorOptionsModel.port(), Long.valueOf("8080"));
    assertEquals(createMonitorOptionsModel.interval(), Long.valueOf("60"));
    assertEquals(createMonitorOptionsModel.retries(), Long.valueOf("2"));
    assertEquals(createMonitorOptionsModel.timeout(), Long.valueOf("5"));
    assertEquals(createMonitorOptionsModel.method(), "GET");
    assertEquals(createMonitorOptionsModel.path(), "/health");
    assertEquals(createMonitorOptionsModel.headers(), new java.util.ArrayList<HealthcheckHeader>(java.util.Arrays.asList(healthcheckHeaderModel)));
    assertEquals(createMonitorOptionsModel.allowInsecure(), Boolean.valueOf(false));
    assertEquals(createMonitorOptionsModel.expectedCodes(), "200");
    assertEquals(createMonitorOptionsModel.expectedBody(), "alive");
    assertEquals(createMonitorOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMonitorOptionsError() throws Throwable {
    new CreateMonitorOptions.Builder().build();
  }

}