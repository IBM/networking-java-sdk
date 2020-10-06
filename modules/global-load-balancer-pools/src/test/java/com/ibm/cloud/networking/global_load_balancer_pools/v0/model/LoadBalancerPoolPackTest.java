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

package com.ibm.cloud.networking.global_load_balancer_pools.v0.model;

import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolPack;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolPackOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolPack model.
 */
public class LoadBalancerPoolPackTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolPack() throws Throwable {
    LoadBalancerPoolPack loadBalancerPoolPackModel = new LoadBalancerPoolPack();
    assertNull(loadBalancerPoolPackModel.getId());
    assertNull(loadBalancerPoolPackModel.getCreatedOn());
    assertNull(loadBalancerPoolPackModel.getModifiedOn());
    assertNull(loadBalancerPoolPackModel.getDescription());
    assertNull(loadBalancerPoolPackModel.getName());
    assertNull(loadBalancerPoolPackModel.isEnabled());
    assertNull(loadBalancerPoolPackModel.isHealthy());
    assertNull(loadBalancerPoolPackModel.getMonitor());
    assertNull(loadBalancerPoolPackModel.getOrigins());
    assertNull(loadBalancerPoolPackModel.getNotificationEmail());
  }
}