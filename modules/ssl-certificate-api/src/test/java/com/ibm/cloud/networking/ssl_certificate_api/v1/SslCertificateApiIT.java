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

package com.ibm.cloud.networking.ssl_certificate_api.v1;

import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CertPriorityReqCertificatesItem;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Certificate;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeCertificatePriorityOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeSslSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeTls12SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeTls13SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeUniversalCertificateSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertPack;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertReqGeoRestrictions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DedicatedCertificatePack;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DeleteCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DeleteCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetSslSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetTls12SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetTls13SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetUniversalCertificateSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCertificateResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCertificatesOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCustomCertificatesOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCustomCertsResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.OrderCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ResultInfo;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSetting;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingRespMessagesItem;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingRespResult;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls13SettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls13SettingRespResult;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UniversalSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UniversalSettingRespResult;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UpdateCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UploadCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.utils.TestUtilities;
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
 * Integration test class for the SslCertificateApi service.
 */
public class SslCertificateApiIT extends SdkIntegrationTestBase {
  public SslCertificateApi service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;
  String certs = null;
  String privates = null;

  String identifier = null;
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
    certs = config.get("CERT_1");
    privates = config.get("PRIVATE_KEY_1");

    // set mock values for global params
    try {
      service = SslCertificateApi.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testOrderCertificate")
  public void testListCertificates() throws Exception {
    try {
      ListCertificatesOptions listCertificatesOptions = new ListCertificatesOptions.Builder()
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<ListCertificateResp> response = service.listCertificates(listCertificatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListCertificateResp listCertificateRespResult = response.getResult();

      assertNotNull(listCertificateRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testOrderCertificate() throws Exception {
    try {
      OrderCertificateOptions orderCertificateOptions = new OrderCertificateOptions.Builder()
      .type("dedicated")
      .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("java.sdk.cistest-load.com")))
      .xCorrelationId("1234")
      .build();

      // Invoke operation
      Response<DedicatedCertificatePack> response = service.orderCertificate(orderCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedCertificatePack dedicatedCertificatePackResult = response.getResult();

      assertNotNull(dedicatedCertificatePackResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testChangeSslSetting")
  public void testGetSslSetting() throws Exception {
    try {
      GetSslSettingOptions getSslSettingOptions = new GetSslSettingOptions();

      // Invoke operation
      Response<SslSettingResp> response = service.getSslSetting(getSslSettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SslSettingResp sslSettingRespResult = response.getResult();

      assertNotNull(sslSettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListCertificates")
  public void testChangeSslSetting() throws Exception {
    try {
      ChangeSslSettingOptions changeSslSettingOptions = new ChangeSslSettingOptions.Builder()
      .value("flexible")
      .build();

      // Invoke operation
      Response<SslSettingResp> response = service.changeSslSetting(changeSslSettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SslSettingResp sslSettingRespResult = response.getResult();

      assertNotNull(sslSettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUploadCustomCertificate")
  public void testListCustomCertificates() throws Exception {
    try {
      ListCustomCertificatesOptions listCustomCertificatesOptions = new ListCustomCertificatesOptions();

      // Invoke operation
      Response<ListCustomCertsResp> response = service.listCustomCertificates(listCustomCertificatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListCustomCertsResp listCustomCertsRespResult = response.getResult();

      assertNotNull(listCustomCertsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetSslSetting")
  public void testUploadCustomCertificate() throws Exception {
    try {
      CustomCertReqGeoRestrictions customCertReqGeoRestrictionsModel = new CustomCertReqGeoRestrictions.Builder()
      .label("us")
      .build();

      System.out.println(certs);
      System.out.println(privates);
      UploadCustomCertificateOptions uploadCustomCertificateOptions = new UploadCustomCertificateOptions.Builder()
      .certificate(certs)
      .privateKey(privates)
      .bundleMethod("ubiquitous")
      .geoRestrictions(customCertReqGeoRestrictionsModel)
      .build();

      // Invoke operation
      Response<CustomCertResp> response = service.uploadCustomCertificate(uploadCustomCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomCertResp customCertRespResult = response.getResult();

      assertNotNull(customCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateCustomCertificate")
  public void testGetCustomCertificate() throws Exception {
    try {
      GetCustomCertificateOptions getCustomCertificateOptions = new GetCustomCertificateOptions.Builder()
      .customCertId("testString")
      .build();

      // Invoke operation
      Response<CustomCertResp> response = service.getCustomCertificate(getCustomCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomCertResp customCertRespResult = response.getResult();

      assertNotNull(customCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListCustomCertificates")
  public void testUpdateCustomCertificate() throws Exception {
    try {
      CustomCertReqGeoRestrictions customCertReqGeoRestrictionsModel = new CustomCertReqGeoRestrictions.Builder()
      .label("us")
      .build();

      UpdateCustomCertificateOptions updateCustomCertificateOptions = new UpdateCustomCertificateOptions.Builder()
      .customCertId("testString")
      .certificate("testString")
      .privateKey("testString")
      .bundleMethod("ubiquitous")
      .geoRestrictions(customCertReqGeoRestrictionsModel)
      .build();

      // Invoke operation
      Response<CustomCertResp> response = service.updateCustomCertificate(updateCustomCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CustomCertResp customCertRespResult = response.getResult();

      assertNotNull(customCertRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetCustomCertificate")
  public void testChangeCertificatePriority() throws Exception {
    try {
      CertPriorityReqCertificatesItem certPriorityReqCertificatesItemModel = new CertPriorityReqCertificatesItem.Builder()
      .id("5a7805061c76ada191ed06f989cc3dac")
      .priority(Long.valueOf("1"))
      .build();

      ChangeCertificatePriorityOptions changeCertificatePriorityOptions = new ChangeCertificatePriorityOptions.Builder()
      .certificates(new java.util.ArrayList<CertPriorityReqCertificatesItem>(java.util.Arrays.asList(certPriorityReqCertificatesItemModel)))
      .build();

      // Invoke operation
      Response<Void> response = service.changeCertificatePriority(changeCertificatePriorityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testChangeCertificatePriority")
  public void testGetUniversalCertificateSetting() throws Exception {
    try {
      GetUniversalCertificateSettingOptions getUniversalCertificateSettingOptions = new GetUniversalCertificateSettingOptions();

      // Invoke operation
      Response<UniversalSettingResp> response = service.getUniversalCertificateSetting(getUniversalCertificateSettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UniversalSettingResp universalSettingRespResult = response.getResult();

      assertNotNull(universalSettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetUniversalCertificateSetting")
  public void testChangeUniversalCertificateSetting() throws Exception {
    try {
      ChangeUniversalCertificateSettingOptions changeUniversalCertificateSettingOptions = new ChangeUniversalCertificateSettingOptions.Builder()
      .enabled(true)
      .build();

      // Invoke operation
      Response<Void> response = service.changeUniversalCertificateSetting(changeUniversalCertificateSettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testChangeUniversalCertificateSetting")
  public void testGetTls12Setting() throws Exception {
    try {
      GetTls12SettingOptions getTls12SettingOptions = new GetTls12SettingOptions();

      // Invoke operation
      Response<Tls12SettingResp> response = service.getTls12Setting(getTls12SettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Tls12SettingResp tls12SettingRespResult = response.getResult();

      assertNotNull(tls12SettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetTls12Setting")
  public void testChangeTls12Setting() throws Exception {
    try {
      ChangeTls12SettingOptions changeTls12SettingOptions = new ChangeTls12SettingOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<Tls12SettingResp> response = service.changeTls12Setting(changeTls12SettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Tls12SettingResp tls12SettingRespResult = response.getResult();

      assertNotNull(tls12SettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testChangeTls12Setting")
  public void testGetTls13Setting() throws Exception {
    try {
      GetTls13SettingOptions getTls13SettingOptions = new GetTls13SettingOptions();

      // Invoke operation
      Response<Tls13SettingResp> response = service.getTls13Setting(getTls13SettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Tls13SettingResp tls13SettingRespResult = response.getResult();

      assertNotNull(tls13SettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetTls13Setting")
  public void testChangeTls13Setting() throws Exception {
    try {
      ChangeTls13SettingOptions changeTls13SettingOptions = new ChangeTls13SettingOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<Tls13SettingResp> response = service.changeTls13Setting(changeTls13SettingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Tls13SettingResp tls13SettingRespResult = response.getResult();

      assertNotNull(tls13SettingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testChangeTls13Setting")
  public void testDeleteCustomCertificate() throws Exception {
    try {
      DeleteCustomCertificateOptions deleteCustomCertificateOptions = new DeleteCustomCertificateOptions.Builder()
      .customCertId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteCustomCertificate(deleteCustomCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testDeleteCustomCertificate")
  public void testDeleteCertificate() throws Exception {
    try {
      DeleteCertificateOptions deleteCertificateOptions = new DeleteCertificateOptions.Builder()
      .certIdentifier("testString")
      .xCorrelationId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteCertificate(deleteCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
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
