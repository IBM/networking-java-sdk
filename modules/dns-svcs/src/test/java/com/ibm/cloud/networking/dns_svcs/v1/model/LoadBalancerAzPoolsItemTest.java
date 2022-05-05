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
 * Unit test class for the LoadBalancerAzPoolsItem model.
 */
public class LoadBalancerAzPoolsItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerAzPoolsItem() throws Throwable {
    LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModel = new LoadBalancerAzPoolsItem.Builder()
      .availabilityZone("us-south-1")
      .pools(new java.util.ArrayList<String>(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d")))
      .build();
    assertEquals(loadBalancerAzPoolsItemModel.availabilityZone(), "us-south-1");
    assertEquals(loadBalancerAzPoolsItemModel.pools(), new java.util.ArrayList<String>(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d")));

    String json = TestUtilities.serialize(loadBalancerAzPoolsItemModel);

    LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModelNew = TestUtilities.deserialize(json, LoadBalancerAzPoolsItem.class);
    assertTrue(loadBalancerAzPoolsItemModelNew instanceof LoadBalancerAzPoolsItem);
    assertEquals(loadBalancerAzPoolsItemModelNew.availabilityZone(), "us-south-1");
  }
}