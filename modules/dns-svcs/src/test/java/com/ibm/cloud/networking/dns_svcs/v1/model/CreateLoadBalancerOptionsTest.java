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
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancerAzPoolsItem;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLoadBalancerOptions model.
 */
public class CreateLoadBalancerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLoadBalancerOptions() throws Throwable {
    LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModel = new LoadBalancerAzPoolsItem.Builder()
      .availabilityZone("us-south-1")
      .pools(new java.util.ArrayList<String>(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d")))
      .build();
    assertEquals(loadBalancerAzPoolsItemModel.availabilityZone(), "us-south-1");
    assertEquals(loadBalancerAzPoolsItemModel.pools(), new java.util.ArrayList<String>(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d")));

    CreateLoadBalancerOptions createLoadBalancerOptionsModel = new CreateLoadBalancerOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .name("glb.example.com")
      .description("Load balancer for glb.example.com.")
      .enabled(true)
      .ttl(Long.valueOf("120"))
      .fallbackPool("24ccf79a-4ae0-4769-b4c8-17f8f230072e")
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("24ccf79a-4ae0-4769-b4c8-17f8f230072e", "13fa7d9e-aeff-4e14-8300-58021db9ee74")))
      .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
      .xCorrelationId("testString")
      .build();
    assertEquals(createLoadBalancerOptionsModel.instanceId(), "testString");
    assertEquals(createLoadBalancerOptionsModel.dnszoneId(), "testString");
    assertEquals(createLoadBalancerOptionsModel.name(), "glb.example.com");
    assertEquals(createLoadBalancerOptionsModel.description(), "Load balancer for glb.example.com.");
    assertEquals(createLoadBalancerOptionsModel.enabled(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerOptionsModel.ttl(), Long.valueOf("120"));
    assertEquals(createLoadBalancerOptionsModel.fallbackPool(), "24ccf79a-4ae0-4769-b4c8-17f8f230072e");
    assertEquals(createLoadBalancerOptionsModel.defaultPools(), new java.util.ArrayList<String>(java.util.Arrays.asList("24ccf79a-4ae0-4769-b4c8-17f8f230072e", "13fa7d9e-aeff-4e14-8300-58021db9ee74")));
    assertEquals(createLoadBalancerOptionsModel.azPools(), new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)));
    assertEquals(createLoadBalancerOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerOptionsError() throws Throwable {
    new CreateLoadBalancerOptions.Builder().build();
  }

}