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

package com.ibm.cloud.networking.global_load_balancer_monitor.v1.model;

import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.EditLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EditLoadBalancerMonitorOptions model.
 */
public class EditLoadBalancerMonitorOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEditLoadBalancerMonitorOptions() throws Throwable {
    EditLoadBalancerMonitorOptions editLoadBalancerMonitorOptionsModel = new EditLoadBalancerMonitorOptions.Builder()
      .monitorIdentifier("testString")
      .type("http")
      .description("Login page monitor")
      .method("GET")
      .port(Long.valueOf("8080"))
      .path("/")
      .timeout(Long.valueOf("5"))
      .retries(Long.valueOf("2"))
      .interval(Long.valueOf("60"))
      .expectedCodes("2xx")
      .followRedirects(true)
      .expectedBody("alive")
      .allowInsecure(true)
      .build();
    assertEquals(editLoadBalancerMonitorOptionsModel.monitorIdentifier(), "testString");
    assertEquals(editLoadBalancerMonitorOptionsModel.type(), "http");
    assertEquals(editLoadBalancerMonitorOptionsModel.description(), "Login page monitor");
    assertEquals(editLoadBalancerMonitorOptionsModel.method(), "GET");
    assertEquals(editLoadBalancerMonitorOptionsModel.port(), Long.valueOf("8080"));
    assertEquals(editLoadBalancerMonitorOptionsModel.path(), "/");
    assertEquals(editLoadBalancerMonitorOptionsModel.timeout(), Long.valueOf("5"));
    assertEquals(editLoadBalancerMonitorOptionsModel.retries(), Long.valueOf("2"));
    assertEquals(editLoadBalancerMonitorOptionsModel.interval(), Long.valueOf("60"));
    assertEquals(editLoadBalancerMonitorOptionsModel.expectedCodes(), "2xx");
    assertEquals(editLoadBalancerMonitorOptionsModel.followRedirects(), Boolean.valueOf(true));
    assertEquals(editLoadBalancerMonitorOptionsModel.expectedBody(), "alive");
    assertEquals(editLoadBalancerMonitorOptionsModel.allowInsecure(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditLoadBalancerMonitorOptionsError() throws Throwable {
    new EditLoadBalancerMonitorOptions.Builder().build();
  }

}