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

package com.ibm.cloud.networking.global_load_balancer.v1.model;

import com.ibm.cloud.networking.global_load_balancer.v1.model.EditLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EditLoadBalancerOptions model.
 */
public class EditLoadBalancerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEditLoadBalancerOptions() throws Throwable {
    EditLoadBalancerOptions editLoadBalancerOptionsModel = new EditLoadBalancerOptions.Builder()
      .loadBalancerIdentifier("testString")
      .name("www.example.com")
      .fallbackPool("17b5962d775c646f3f9725cbc7a53df4")
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("Load Balancer for www.example.com")
      .ttl(Long.valueOf("30"))
      .regionPools(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .popPools(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .proxied(true)
      .enabled(true)
      .sessionAffinity("ip_cookie")
      .steeringPolicy("dynamic_latency")
      .build();
    assertEquals(editLoadBalancerOptionsModel.loadBalancerIdentifier(), "testString");
    assertEquals(editLoadBalancerOptionsModel.name(), "www.example.com");
    assertEquals(editLoadBalancerOptionsModel.fallbackPool(), "17b5962d775c646f3f9725cbc7a53df4");
    assertEquals(editLoadBalancerOptionsModel.defaultPools(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(editLoadBalancerOptionsModel.description(), "Load Balancer for www.example.com");
    assertEquals(editLoadBalancerOptionsModel.ttl(), Long.valueOf("30"));
    assertEquals(editLoadBalancerOptionsModel.regionPools(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(editLoadBalancerOptionsModel.popPools(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(editLoadBalancerOptionsModel.proxied(), Boolean.valueOf(true));
    assertEquals(editLoadBalancerOptionsModel.enabled(), Boolean.valueOf(true));
    assertEquals(editLoadBalancerOptionsModel.sessionAffinity(), "ip_cookie");
    assertEquals(editLoadBalancerOptionsModel.steeringPolicy(), "dynamic_latency");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditLoadBalancerOptionsError() throws Throwable {
    new EditLoadBalancerOptions.Builder().build();
  }

}