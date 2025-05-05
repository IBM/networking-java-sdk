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
import com.ibm.cloud.networking.direct_link.v1.model.HpcsKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyTimerModePrototype;
import com.ibm.cloud.networking.direct_link.v1.model.SetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SetGatewayMacsecOptions model.
 */
public class SetGatewayMacsecOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSetGatewayMacsecOptions() throws Throwable {
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

    SetGatewayMacsecOptions setGatewayMacsecOptionsModel = new SetGatewayMacsecOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .active(true)
      .caks(java.util.Arrays.asList(gatewayMacsecCakPrototypeModel))
      .sakRekey(sakRekeyPrototypeModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .build();
    assertEquals(setGatewayMacsecOptionsModel.id(), "0a06fb9b-820f-4c44-8a31-77f1f0806d28");
    assertEquals(setGatewayMacsecOptionsModel.active(), Boolean.valueOf(true));
    assertEquals(setGatewayMacsecOptionsModel.caks(), java.util.Arrays.asList(gatewayMacsecCakPrototypeModel));
    assertEquals(setGatewayMacsecOptionsModel.sakRekey(), sakRekeyPrototypeModel);
    assertEquals(setGatewayMacsecOptionsModel.securityPolicy(), "must_secure");
    assertEquals(setGatewayMacsecOptionsModel.windowSize(), Long.valueOf("64"));
    assertEquals(setGatewayMacsecOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSetGatewayMacsecOptionsError() throws Throwable {
    new SetGatewayMacsecOptions.Builder().build();
  }

}