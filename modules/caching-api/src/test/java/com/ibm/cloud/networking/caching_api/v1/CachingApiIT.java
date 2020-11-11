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

package com.ibm.cloud.networking.caching_api.v1;

import com.ibm.cloud.networking.caching_api.v1.model.BrowserTTLResponse;
import com.ibm.cloud.networking.caching_api.v1.model.BrowserTTLResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.CacheLevelResponse;
import com.ibm.cloud.networking.caching_api.v1.model.CacheLevelResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.DeveopmentModeResponse;
import com.ibm.cloud.networking.caching_api.v1.model.DeveopmentModeResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.EnableQueryStringSortResponse;
import com.ibm.cloud.networking.caching_api.v1.model.EnableQueryStringSortResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.GetBrowserCacheTtlOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetCacheLevelOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetDevelopmentModeOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetQueryStringSortOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllResponse;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByCacheTagsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByHostsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByUrlsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateBrowserCacheTtlOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateCacheLevelOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateDevelopmentModeOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateQueryStringSortOptions;
import com.ibm.cloud.networking.caching_api.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the CachingApi service.
 */
public class CachingApiIT extends SdkIntegrationTestBase {
  public CachingApi service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneId = null;
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../cloud_internet_services.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);

    // Load Config
    crn = config.get("CRN");
    zoneId = config.get("ZONE_ID");

    // set mock values for global params
    try {
      service = CachingApi.newInstance(crn, zoneId, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    System.out.println("Setup complete.");
  }

  @Test
  public void testPurgeAll() throws Exception {
    try {
      PurgeAllOptions purgeAllOptions = new PurgeAllOptions();

      // Invoke operation
      Response<PurgeAllResponse> response = service.purgeAll(purgeAllOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PurgeAllResponse purgeAllResponseResult = response.getResult();

      assertNotNull(purgeAllResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPurgeByUrls() throws Exception {
    try {
      PurgeByUrlsOptions purgeByUrlsOptions = new PurgeByUrlsOptions.Builder()
      .files(new java.util.ArrayList<String>(java.util.Arrays.asList("http://www.example.com/cat_picture.jpg")))
      .build();

      // Invoke operation
      Response<PurgeAllResponse> response = service.purgeByUrls(purgeByUrlsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PurgeAllResponse purgeAllResponseResult = response.getResult();

      assertNotNull(purgeAllResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPurgeByCacheTags() throws Exception {
    try {
      PurgeByCacheTagsOptions purgeByCacheTagsOptions = new PurgeByCacheTagsOptions.Builder()
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("some-tag")))
      .build();

      // Invoke operation
      Response<PurgeAllResponse> response = service.purgeByCacheTags(purgeByCacheTagsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PurgeAllResponse purgeAllResponseResult = response.getResult();

      assertNotNull(purgeAllResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPurgeByHosts() throws Exception {
    try {
      PurgeByHostsOptions purgeByHostsOptions = new PurgeByHostsOptions.Builder()
      .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("www.example.com")))
      .build();

      // Invoke operation
      Response<PurgeAllResponse> response = service.purgeByHosts(purgeByHostsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PurgeAllResponse purgeAllResponseResult = response.getResult();

      assertNotNull(purgeAllResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetBrowserCacheTtl() throws Exception {
    try {
      GetBrowserCacheTtlOptions getBrowserCacheTtlOptions = new GetBrowserCacheTtlOptions();

      // Invoke operation
      Response<BrowserTTLResponse> response = service.getBrowserCacheTtl(getBrowserCacheTtlOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BrowserTTLResponse browserTtlResponseResult = response.getResult();

      assertNotNull(browserTtlResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateBrowserCacheTtl() throws Exception {
    try {
      UpdateBrowserCacheTtlOptions updateBrowserCacheTtlOptions = new UpdateBrowserCacheTtlOptions.Builder()
      .value(Long.valueOf("14400"))
      .build();

      // Invoke operation
      Response<BrowserTTLResponse> response = service.updateBrowserCacheTtl(updateBrowserCacheTtlOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BrowserTTLResponse browserTtlResponseResult = response.getResult();

      assertNotNull(browserTtlResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDevelopmentMode() throws Exception {
    try {
      GetDevelopmentModeOptions getDevelopmentModeOptions = new GetDevelopmentModeOptions();

      // Invoke operation
      Response<DeveopmentModeResponse> response = service.getDevelopmentMode(getDevelopmentModeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeveopmentModeResponse deveopmentModeResponseResult = response.getResult();

      assertNotNull(deveopmentModeResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateDevelopmentMode() throws Exception {
    try {
      UpdateDevelopmentModeOptions updateDevelopmentModeOptions = new UpdateDevelopmentModeOptions.Builder()
      .value("off")
      .build();

      // Invoke operation
      Response<DeveopmentModeResponse> response = service.updateDevelopmentMode(updateDevelopmentModeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeveopmentModeResponse deveopmentModeResponseResult = response.getResult();

      assertNotNull(deveopmentModeResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetQueryStringSort() throws Exception {
    try {
      GetQueryStringSortOptions getQueryStringSortOptions = new GetQueryStringSortOptions();

      // Invoke operation
      Response<EnableQueryStringSortResponse> response = service.getQueryStringSort(getQueryStringSortOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EnableQueryStringSortResponse enableQueryStringSortResponseResult = response.getResult();

      assertNotNull(enableQueryStringSortResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateQueryStringSort() throws Exception {
    try {
      UpdateQueryStringSortOptions updateQueryStringSortOptions = new UpdateQueryStringSortOptions.Builder()
      .value("off")
      .build();

      // Invoke operation
      Response<EnableQueryStringSortResponse> response = service.updateQueryStringSort(updateQueryStringSortOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EnableQueryStringSortResponse enableQueryStringSortResponseResult = response.getResult();

      assertNotNull(enableQueryStringSortResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCacheLevel() throws Exception {
    try {
      GetCacheLevelOptions getCacheLevelOptions = new GetCacheLevelOptions();

      // Invoke operation
      Response<CacheLevelResponse> response = service.getCacheLevel(getCacheLevelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CacheLevelResponse cacheLevelResponseResult = response.getResult();

      assertNotNull(cacheLevelResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateCacheLevel() throws Exception {
    try {
      UpdateCacheLevelOptions updateCacheLevelOptions = new UpdateCacheLevelOptions.Builder()
      .value("aggressive")
      .build();

      // Invoke operation
      Response<CacheLevelResponse> response = service.updateCacheLevel(updateCacheLevelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CacheLevelResponse cacheLevelResponseResult = response.getResult();

      assertNotNull(cacheLevelResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
