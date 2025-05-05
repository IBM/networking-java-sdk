/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.HpcsKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyTimerModePrototype;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayMacsecPrototype model.
 */
public class GatewayMacsecPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayMacsecPrototype() throws Throwable {
    HpcsKeyIdentity hpcsKeyIdentityModel = new HpcsKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(hpcsKeyIdentityModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecCakPrototype gatewayMacsecCakPrototypeModel = new GatewayMacsecCakPrototype.Builder()
      .key(hpcsKeyIdentityModel)
      .name("1000")
      .session("primary")
      .build();
    assertEquals(gatewayMacsecCakPrototypeModel.key(), hpcsKeyIdentityModel);
    assertEquals(gatewayMacsecCakPrototypeModel.name(), "1000");
    assertEquals(gatewayMacsecCakPrototypeModel.session(), "primary");

    SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeModel = new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();
    assertEquals(sakRekeyPrototypeModel.interval(), Long.valueOf("3600"));
    assertEquals(sakRekeyPrototypeModel.mode(), "timer");

    GatewayMacsecPrototype gatewayMacsecPrototypeModel = new GatewayMacsecPrototype.Builder()
      .active(true)
      .caks(java.util.Arrays.asList(gatewayMacsecCakPrototypeModel))
      .sakRekey(sakRekeyPrototypeModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .build();
    assertEquals(gatewayMacsecPrototypeModel.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecPrototypeModel.caks(), java.util.Arrays.asList(gatewayMacsecCakPrototypeModel));
    assertEquals(gatewayMacsecPrototypeModel.sakRekey(), sakRekeyPrototypeModel);
    assertEquals(gatewayMacsecPrototypeModel.securityPolicy(), "must_secure");
    assertEquals(gatewayMacsecPrototypeModel.windowSize(), Long.valueOf("64"));

    String json = TestUtilities.serialize(gatewayMacsecPrototypeModel);

    GatewayMacsecPrototype gatewayMacsecPrototypeModelNew = TestUtilities.deserialize(json, GatewayMacsecPrototype.class);
    assertTrue(gatewayMacsecPrototypeModelNew instanceof GatewayMacsecPrototype);
    assertEquals(gatewayMacsecPrototypeModelNew.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecPrototypeModelNew.sakRekey().toString(), sakRekeyPrototypeModel.toString());
    assertEquals(gatewayMacsecPrototypeModelNew.securityPolicy(), "must_secure");
    assertEquals(gatewayMacsecPrototypeModelNew.windowSize(), Long.valueOf("64"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayMacsecPrototypeError() throws Throwable {
    new GatewayMacsecPrototype.Builder().build();
  }

}