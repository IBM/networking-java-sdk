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

package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import com.ibm.cloud.networking.zone_rate_limits.v1.model.CreateZoneRateLimitsOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputAction;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputActionResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputBypassItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputCorrelate;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatch;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchRequest;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponseHeadersItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateZoneRateLimitsOptions model.
 */
public class CreateZoneRateLimitsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateZoneRateLimitsOptions() throws Throwable {
    RatelimitInputBypassItem ratelimitInputBypassItemModel = new RatelimitInputBypassItem.Builder()
      .name("url")
      .value("api.example.com/*")
      .build();
    assertEquals(ratelimitInputBypassItemModel.name(), "url");
    assertEquals(ratelimitInputBypassItemModel.value(), "api.example.com/*");

    RatelimitInputActionResponse ratelimitInputActionResponseModel = new RatelimitInputActionResponse.Builder()
      .contentType("text/plain")
      .body("This request has been rate-limited.")
      .build();
    assertEquals(ratelimitInputActionResponseModel.contentType(), "text/plain");
    assertEquals(ratelimitInputActionResponseModel.body(), "This request has been rate-limited.");

    RatelimitInputAction ratelimitInputActionModel = new RatelimitInputAction.Builder()
      .mode("simulate")
      .timeout(Long.valueOf("60"))
      .response(ratelimitInputActionResponseModel)
      .build();
    assertEquals(ratelimitInputActionModel.mode(), "simulate");
    assertEquals(ratelimitInputActionModel.timeout(), Long.valueOf("60"));
    assertEquals(ratelimitInputActionModel.response(), ratelimitInputActionResponseModel);

    RatelimitInputCorrelate ratelimitInputCorrelateModel = new RatelimitInputCorrelate.Builder()
      .by("nat")
      .build();
    assertEquals(ratelimitInputCorrelateModel.by(), "nat");

    RatelimitInputMatchRequest ratelimitInputMatchRequestModel = new RatelimitInputMatchRequest.Builder()
      .methods(new java.util.ArrayList<String>(java.util.Arrays.asList("GET")))
      .schemes(new java.util.ArrayList<String>(java.util.Arrays.asList("HTTP")))
      .url("*.example.org/path*")
      .build();
    assertEquals(ratelimitInputMatchRequestModel.methods(), new java.util.ArrayList<String>(java.util.Arrays.asList("GET")));
    assertEquals(ratelimitInputMatchRequestModel.schemes(), new java.util.ArrayList<String>(java.util.Arrays.asList("HTTP")));
    assertEquals(ratelimitInputMatchRequestModel.url(), "*.example.org/path*");

    RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
      .name("Cf-Cache-Status")
      .op("ne")
      .value("HIT")
      .build();
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.name(), "Cf-Cache-Status");
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.op(), "ne");
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.value(), "HIT");

    RatelimitInputMatchResponse ratelimitInputMatchResponseModel = new RatelimitInputMatchResponse.Builder()
      .status(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))))
      .headers(new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)))
      .originTraffic(false)
      .build();
    assertEquals(ratelimitInputMatchResponseModel.status(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))));
    assertEquals(ratelimitInputMatchResponseModel.headers(), new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)));
    assertEquals(ratelimitInputMatchResponseModel.originTraffic(), Boolean.valueOf(false));

    RatelimitInputMatch ratelimitInputMatchModel = new RatelimitInputMatch.Builder()
      .request(ratelimitInputMatchRequestModel)
      .response(ratelimitInputMatchResponseModel)
      .build();
    assertEquals(ratelimitInputMatchModel.request(), ratelimitInputMatchRequestModel);
    assertEquals(ratelimitInputMatchModel.response(), ratelimitInputMatchResponseModel);

    CreateZoneRateLimitsOptions createZoneRateLimitsOptionsModel = new CreateZoneRateLimitsOptions.Builder()
      .disabled(false)
      .description("Prevent multiple login failures to mitigate brute force attacks")
      .bypass(new java.util.ArrayList<RatelimitInputBypassItem>(java.util.Arrays.asList(ratelimitInputBypassItemModel)))
      .threshold(Long.valueOf("1000"))
      .period(Long.valueOf("60"))
      .action(ratelimitInputActionModel)
      .correlate(ratelimitInputCorrelateModel)
      .match(ratelimitInputMatchModel)
      .build();
    assertEquals(createZoneRateLimitsOptionsModel.disabled(), Boolean.valueOf(false));
    assertEquals(createZoneRateLimitsOptionsModel.description(), "Prevent multiple login failures to mitigate brute force attacks");
    assertEquals(createZoneRateLimitsOptionsModel.bypass(), new java.util.ArrayList<RatelimitInputBypassItem>(java.util.Arrays.asList(ratelimitInputBypassItemModel)));
    assertEquals(createZoneRateLimitsOptionsModel.threshold(), Long.valueOf("1000"));
    assertEquals(createZoneRateLimitsOptionsModel.period(), Long.valueOf("60"));
    assertEquals(createZoneRateLimitsOptionsModel.action(), ratelimitInputActionModel);
    assertEquals(createZoneRateLimitsOptionsModel.correlate(), ratelimitInputCorrelateModel);
    assertEquals(createZoneRateLimitsOptionsModel.match(), ratelimitInputMatchModel);
  }
}