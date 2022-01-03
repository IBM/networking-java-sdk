package com.ibm.cloud.networking.webhooks.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.networking.webhooks.v1.model.CreateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.DeleteWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.GetAlertWebhookResp;
import com.ibm.cloud.networking.webhooks.v1.model.GetWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.ListAlertWebhooksResp;
import com.ibm.cloud.networking.webhooks.v1.model.ListWebhooksOptions;
import com.ibm.cloud.networking.webhooks.v1.model.UpdateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessResp;
import com.ibm.cloud.networking.webhooks.v1.model.GetAlertWebhookRespResult;
import com.ibm.cloud.networking.webhooks.v1.model.ListAlertWebhooksRespResultItem;

import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessRespResult;
import com.ibm.cloud.networking.webhooks.v1.utils.TestUtilities;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebhooksIT extends SdkIntegrationTestBase {
    public Webhooks webhookService = null;
    public static Map<String, String> config = null;
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  
    String crn = null;
    String zoneIdentifier = null;
    String identifier = null;
    String xAuthUserToken = null;


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
      xAuthUserToken = config.get("CIS_SERVICES_APIKEY");

      // set mock values for global params
      try {
        webhookService = Webhooks.newInstance(crn,serviceName);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Setup complete.");
    }

  @Test 
  public void testCreateAlertWebhookWOptions() throws Exception {
    try {
      CreateAlertWebhookOptions createAlertWebhookOptionsModel = new CreateAlertWebhookOptions.Builder()
      .name("My Slack Alert Webhook")
      .url("https://hooks.slack.com/services/Ds3fdBFbV/456464Gdd")
      .secret(xAuthUserToken)
      .build();
      // Invoke operation
      Response<WebhookSuccessResp> response = webhookService.createAlertWebhook(createAlertWebhookOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WebhookSuccessResp webhooksRespResult = response.getResult();
      WebhookSuccessRespResult createdResp = webhooksRespResult.getResult();

      assertNotNull(webhooksRespResult);
      assertNotNull(createdResp);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testListWebhooksWOptions() throws Exception {
    try {
      ListWebhooksOptions listWebhooksOptionsModel = new ListWebhooksOptions();
      // Invoke operation
      Response<ListAlertWebhooksResp> response = webhookService.listWebhooks(listWebhooksOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListAlertWebhooksResp ListRespResult = response.getResult();
      List<ListAlertWebhooksRespResultItem> ListRespResultItem = ListRespResult.getResult();

      assertNotNull(ListRespResult);
      assertNotNull(ListRespResultItem);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testUpdateAlertWebhookWOptions() throws Exception {
    try {
      UpdateAlertWebhookOptions updateAlertWebhookOptionsModel = new UpdateAlertWebhookOptions.Builder()
      .name("My Slack New Alert Webhook")
      .url("https://app.slack.com/client/T02J3DPUE/D02EHU8UPPH")
      .secret(xAuthUserToken)
      .build();
      // Invoke operation
      Response<WebhookSuccessResp> response = webhookService.updateAlertWebhook(updateAlertWebhookOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WebhookSuccessResp webhooksRespResult = response.getResult();
      WebhookSuccessRespResult webhooksId = webhooksRespResult.getResult();
      identifier = webhooksId.getId();

      assertNotNull(webhooksRespResult);
      assertNotNull(webhooksId);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testGetWebhookWOptions() throws Exception {
    try {
      GetWebhookOptions getWebhookOptionsModel = new GetWebhookOptions.Builder()
      .webhookId(identifier)
      .build();

      // Invoke operation
      Response<GetAlertWebhookResp> response = webhookService.getWebhook(getWebhookOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetAlertWebhookResp getWebhooksRespResult = response.getResult();
      GetAlertWebhookRespResult getResult = getWebhooksRespResult.getResult();
      
      assertNotNull(getWebhooksRespResult);
      assertNotNull(getResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testDeleteWebhookWOptions() throws Exception {
    try {
      DeleteWebhookOptions deleteWebhookOptionsModel = new DeleteWebhookOptions.Builder()
      .webhookId(identifier)
      .build();

      // Invoke operation
      Response<WebhookSuccessResp> response = webhookService.deleteWebhook(deleteWebhookOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WebhookSuccessResp deleteWebhooksRespResult = response.getResult();
      
      assertNotNull(deleteWebhooksRespResult);
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