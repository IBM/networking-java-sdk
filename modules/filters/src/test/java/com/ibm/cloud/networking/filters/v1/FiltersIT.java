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

package com.ibm.cloud.networking.filters.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.filters.v1.Filters;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.filters.v1.model.CreateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterResp;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterRespResult;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersResp;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersRespResultItem;
import com.ibm.cloud.networking.filters.v1.model.FilterInput;
import com.ibm.cloud.networking.filters.v1.model.FilterObject;
import com.ibm.cloud.networking.filters.v1.model.FilterResp;
import com.ibm.cloud.networking.filters.v1.model.FilterUpdateInput;
import com.ibm.cloud.networking.filters.v1.model.FiltersResp;
import com.ibm.cloud.networking.filters.v1.model.GetFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.ListAllFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.ListFiltersResp;
import com.ibm.cloud.networking.filters.v1.model.ListFiltersRespResultInfo;
import com.ibm.cloud.networking.filters.v1.model.UpdateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.UpdateFiltersOptions;
import com.ibm.cloud.networking.filters.v1.utils.TestUtilities;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.intellij.lang.annotations.Identifier;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Integration test class for the Filters.
 */
public class FiltersIT extends SdkIntegrationTestBase {
    public Filters service = null;
    public static Map<String, String> config = null;
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  
    String crn = null;
    String zoneIdentifier = null;
    String[] filterId = null;
    List<FilterObject> filtersResult = null;

    String[] expressions = {
      "(ip.src eq 13.60.125.234)",
      "(http.request.uri eq \"/test?number=1\")",
      "not http.request.uri.path matches \"^/api/[\\W].*$\"",
      "(http.request.uri.path ~ \"^.*/wpt[\\d]-login.php$\" or http.request.uri.path ~ \"^.*/xmlrpc.php$\")"      
    };
  
    String[] expressions_update = {
      "(ip.src eq 13.60.125.235)",
      "(http.request.uri eq \"/test-update?number=1\")",
      "not http.request.uri.path matches \"^/api-update/.*$\"",
      "(http.host eq \"testexample-update.com\")"
    };

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
      zoneIdentifier = config.get("ZONE_ID");

      // set mock values for global params
      try {
        service = Filters.newInstance(serviceName);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Setup complete.");
    }
  
    @Test
    public void testCreateFilter() throws Exception {
      try {
        for(int i=0; i<4; i++ ) {
          FilterInput filterInputModel = new FilterInput.Builder()
          .expression(expressions[i])
          .paused(false)
          .description("Login-Office-SDK")
          .build();
    
          CreateFilterOptions createFilterOptions = new CreateFilterOptions.Builder()
          .xAuthUserToken("testString")
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .filterInput(new java.util.ArrayList<FilterInput>(java.util.Arrays.asList(filterInputModel)))
          .build();
  
          // Invoke operation
          Response<FiltersResp> response = service.createFilter(createFilterOptions).execute();
  
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);
    
          FiltersResp filtersRespResult = response.getResult();

          assertNotNull(filtersRespResult);
        }
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }
  
    @Test
    public void testListAllFilters() throws Exception {
      try {
        for (int i=0; i<4; i++) {
          ListAllFiltersOptions listAllFiltersOptions = new ListAllFiltersOptions.Builder()
          .xAuthUserToken("testString")
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .build();
      
          // Invoke operation
          Response<ListFiltersResp> response = service.listAllFilters(listAllFiltersOptions).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);
      
          ListFiltersResp listFiltersRespResult = response.getResult();
          List<FilterObject> filtersResult = listFiltersRespResult.getResult();
          filterId[i] = filtersResult.get(i).getId();
  
          // filterId = listFiltersRespResult.getResult();
  
          assertNotNull(listFiltersRespResult);
        }
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }

    @Test
    public void testUpdateFilters() throws Exception {
      try {
        for(int i=0; i<4; i++) {
          FilterUpdateInput filterUpdateInputModel = new FilterUpdateInput.Builder()
          .id(filterId[i])
          .expression(expressions_update[i])
          .description("Login-SDK-Update")
          .paused(false)
          .build();
          
          UpdateFiltersOptions updateFiltersOptions = new UpdateFiltersOptions.Builder()
          .xAuthUserToken("testString")
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .filterUpdateInput(new java.util.ArrayList<FilterUpdateInput>(java.util.Arrays.asList(filterUpdateInputModel)))
          .build();
  
          // Invoke operation
          Response<FiltersResp> response = service.updateFilters(updateFiltersOptions).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 200);
    
          FiltersResp filtersRespResult = response.getResult();
    
          assertNotNull(filtersRespResult);
        }

      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }
  

    @Test
    public void testGetFilter() throws Exception {
      try {
        GetFilterOptions getFilterOptions = new GetFilterOptions.Builder()
        .xAuthUserToken("testString")
        .crn(crn)
        .zoneIdentifier(zoneIdentifier)
        .filterIdentifier(filterId[0])
        .build();
  
        // Invoke operation
        Response<FilterResp> response = service.getFilter(getFilterOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
  
        FilterResp filterRespResult = response.getResult();
  
        assertNotNull(filterRespResult);
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }

    @Test
    public void testUpdateFilter() throws Exception {
      try {
        UpdateFilterOptions updateFilterOptions = new UpdateFilterOptions.Builder()
        .xAuthUserToken("testString")
        .crn(crn)
        .zoneIdentifier(zoneIdentifier)
        .filterIdentifier(filterId[0])
        .expression("\"not http.request.uri.path matches \"^/api/.*$\"\"")
        .description("not /api")
        .paused(false)
        .build();
    
        // Invoke operation
        Response<FilterResp> response = service.updateFilter(updateFilterOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
    
        FilterResp filterRespResult = response.getResult();
    
        assertNotNull(filterRespResult);
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }

    @Test
    public void testDeleteFilter() throws Exception {
      try {
        DeleteFilterOptions deleteFilterOptions = new DeleteFilterOptions.Builder()
        .xAuthUserToken("testString")
        .crn(crn)
        .zoneIdentifier(zoneIdentifier)
        .filterIdentifier(filterId[0])
        .build();
    
        // Invoke operation
        Response<DeleteFilterResp> response = service.deleteFilter(deleteFilterOptions).execute();
        // Validate response
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 204);
      } catch (ServiceResponseException e) {
          fail(String.format("Service returned status code %d: %s\nError details: %s",
            e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
      }
    }
    
    @Test 
    public void testDeleteFilters() throws Exception {
      try {
        for(int i=1; i<4; i++) {
          DeleteFiltersOptions deleteFiltersOptions = new DeleteFiltersOptions.Builder()
          .xAuthUserToken("testString")
          .crn(crn)
          .zoneIdentifier(zoneIdentifier)
          .id(filterId[i])
          .build();

          // Invoke operation
          Response<DeleteFiltersResp> response = service.deleteFilters(deleteFiltersOptions).execute();
          // Validate response
          assertNotNull(response);
          assertEquals(response.getStatusCode(), 204);
        }
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
  