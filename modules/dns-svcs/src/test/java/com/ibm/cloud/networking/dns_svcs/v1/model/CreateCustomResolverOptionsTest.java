/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LocationInput;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateCustomResolverOptions model.
 */
public class CreateCustomResolverOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateCustomResolverOptions() throws Throwable {
    LocationInput locationInputModel = new LocationInput.Builder()
      .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
      .enabled(false)
      .build();
    assertEquals(locationInputModel.subnetCrn(), "crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04");
    assertEquals(locationInputModel.enabled(), Boolean.valueOf(false));

    CreateCustomResolverOptions createCustomResolverOptionsModel = new CreateCustomResolverOptions.Builder()
      .instanceId("testString")
      .name("my-resolver")
      .description("custom resolver")
      .locations(new java.util.ArrayList<LocationInput>(java.util.Arrays.asList(locationInputModel)))
      .xCorrelationId("testString")
      .build();
    assertEquals(createCustomResolverOptionsModel.instanceId(), "testString");
    assertEquals(createCustomResolverOptionsModel.name(), "my-resolver");
    assertEquals(createCustomResolverOptionsModel.description(), "custom resolver");
    assertEquals(createCustomResolverOptionsModel.locations(), new java.util.ArrayList<LocationInput>(java.util.Arrays.asList(locationInputModel)));
    assertEquals(createCustomResolverOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCustomResolverOptionsError() throws Throwable {
    new CreateCustomResolverOptions.Builder().build();
  }

}