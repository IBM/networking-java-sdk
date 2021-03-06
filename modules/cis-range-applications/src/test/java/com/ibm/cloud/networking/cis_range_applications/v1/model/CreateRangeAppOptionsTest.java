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

package com.ibm.cloud.networking.cis_range_applications.v1.model;

import com.ibm.cloud.networking.cis_range_applications.v1.model.CreateRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqEdgeIps;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqOriginDns;
import com.ibm.cloud.networking.cis_range_applications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateRangeAppOptions model.
 */
public class CreateRangeAppOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateRangeAppOptions() throws Throwable {
    RangeAppReqDns rangeAppReqDnsModel = new RangeAppReqDns.Builder()
      .type("CNAME")
      .name("ssh.example.com")
      .build();
    assertEquals(rangeAppReqDnsModel.type(), "CNAME");
    assertEquals(rangeAppReqDnsModel.name(), "ssh.example.com");

    RangeAppReqOriginDns rangeAppReqOriginDnsModel = new RangeAppReqOriginDns.Builder()
      .name("origin.net")
      .build();
    assertEquals(rangeAppReqOriginDnsModel.name(), "origin.net");

    RangeAppReqEdgeIps rangeAppReqEdgeIpsModel = new RangeAppReqEdgeIps.Builder()
      .type("dynamic")
      .connectivity("all")
      .build();
    assertEquals(rangeAppReqEdgeIpsModel.type(), "dynamic");
    assertEquals(rangeAppReqEdgeIpsModel.connectivity(), "all");

    CreateRangeAppOptions createRangeAppOptionsModel = new CreateRangeAppOptions.Builder()
      .protocol("tcp/22")
      .dns(rangeAppReqDnsModel)
      .originDirect(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .originDns(rangeAppReqOriginDnsModel)
      .originPort(Long.valueOf("22"))
      .ipFirewall(true)
      .proxyProtocol("off")
      .edgeIps(rangeAppReqEdgeIpsModel)
      .trafficType("direct")
      .tls("off")
      .build();
    assertEquals(createRangeAppOptionsModel.protocol(), "tcp/22");
    assertEquals(createRangeAppOptionsModel.dns(), rangeAppReqDnsModel);
    assertEquals(createRangeAppOptionsModel.originDirect(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createRangeAppOptionsModel.originDns(), rangeAppReqOriginDnsModel);
    assertEquals(createRangeAppOptionsModel.originPort(), Long.valueOf("22"));
    assertEquals(createRangeAppOptionsModel.ipFirewall(), Boolean.valueOf(true));
    assertEquals(createRangeAppOptionsModel.proxyProtocol(), "off");
    assertEquals(createRangeAppOptionsModel.edgeIps(), rangeAppReqEdgeIpsModel);
    assertEquals(createRangeAppOptionsModel.trafficType(), "direct");
    assertEquals(createRangeAppOptionsModel.tls(), "off");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateRangeAppOptionsError() throws Throwable {
    new CreateRangeAppOptions.Builder().build();
  }

}