package com.ibm.cloud.networking.alerts.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import com.ibm.cloud.networking.webhooks.v1.Webhooks;
import com.ibm.cloud.networking.webhooks.v1.model.CreateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessResp;
import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessRespResult;


import com.ibm.cloud.networking.alerts.v1.Alerts;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessResp;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessRespResult;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyInputMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.DeleteAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPoliciesOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyResp;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyRespResult;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesResp;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesRespResultItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanisms;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanismsEmailItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyInputMechanismsWebhooksItem;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class AlertsIT extends SdkIntegrationTestBase {
    public Webhooks webhookService = null;
    public Alerts   alertService = null;
    public static Map<String, String> config = null;
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  
    String crn = null;
    String zoneIdentifier = null;
    String identifier = null;
    String policyId = null;
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
      xAuthUserToken = config.get("ZaHkAf0iNXNWn8ySUJjTJHkzlanchfnR4TISjOPC_I1U");
      System.out.println(xAuthUserToken);
      // set mock values for global params
      try {
        webhookService = Webhooks.newInstance(crn,serviceName);
        alertService = Alerts.newInstance(crn,serviceName);
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
      identifier = createdResp.getId();

      assertNotNull(webhooksRespResult);
      assertNotNull(createdResp);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  
  @Test 
  public void testCreateAlertPolicyWOptions() throws Exception {
    try {
        CreateAlertPolicyInputMechanismsEmailItem createAlertPolicyInputMechanismsEmailItemModel = new CreateAlertPolicyInputMechanismsEmailItem.Builder()
        .id("mynotifications@email.com")
        .build();
    
        // Construct an instance of the CreateAlertPolicyInputMechanismsWebhooksItem model
        CreateAlertPolicyInputMechanismsWebhooksItem createAlertPolicyInputMechanismsWebhooksItemModel = new CreateAlertPolicyInputMechanismsWebhooksItem.Builder()
        .id(identifier)
        .build();
    
        // Construct an instance of the CreateAlertPolicyInputMechanisms model
        CreateAlertPolicyInputMechanisms createAlertPolicyInputMechanismsModel = new CreateAlertPolicyInputMechanisms.Builder()
        .email(new java.util.ArrayList<CreateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsEmailItemModel)))
        .webhooks(new java.util.ArrayList<CreateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(createAlertPolicyInputMechanismsWebhooksItemModel)))
        .build();
    
        // Construct an instance of the CreateAlertPolicyOptions model
        CreateAlertPolicyOptions createAlertPolicyOptionsModel = new CreateAlertPolicyOptions.Builder()
        .name("My Alert Policy")
        .description("A description for my alert policy")
        .enabled(true)
        .alertType("dos_attack_l7")
        .mechanisms(createAlertPolicyInputMechanismsModel)
        .build();
      // Invoke operation
      Response<AlertSuccessResp> response = alertService.createAlertPolicy(createAlertPolicyOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AlertSuccessResp alertsRespResult = response.getResult();
      AlertSuccessRespResult createdResp = alertsRespResult.getResult();
      policyId = createdResp.getId();

      assertNotNull(alertsRespResult);
      assertNotNull(createdResp);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  @Test 
  public void testGetAlertPoliciesWOptions() throws Exception {
    try {
      GetAlertPoliciesOptions getAlertPoliciesOptionsModel = new GetAlertPoliciesOptions();
      // Invoke operation
      Response<ListAlertPoliciesResp> response = alertService.getAlertPolicies(getAlertPoliciesOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListAlertPoliciesResp ListRespResult = response.getResult();
      List<ListAlertPoliciesRespResultItem> ListRespResultItem = ListRespResult.getResult();

      assertNotNull(ListRespResult);
      assertNotNull(ListRespResultItem);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testUpdateAlertPolicyWOptions() throws Exception {
    try {
      // Construct an instance of the UpdateAlertPolicyInputMechanismsEmailItem model
      UpdateAlertPolicyInputMechanismsEmailItem updateAlertPolicyInputMechanismsEmailItemModel = new UpdateAlertPolicyInputMechanismsEmailItem.Builder()
      .id("mynewnotifications@email.com")
      .build();
  
      // Construct an instance of the UpdateAlertPolicyInputMechanismsWebhooksItem model
      UpdateAlertPolicyInputMechanismsWebhooksItem updateAlertPolicyInputMechanismsWebhooksItemModel = new UpdateAlertPolicyInputMechanismsWebhooksItem.Builder()
      .id(identifier)
      .build();
  
      // Construct an instance of the UpdateAlertPolicyInputMechanisms model
      UpdateAlertPolicyInputMechanisms updateAlertPolicyInputMechanismsModel = new UpdateAlertPolicyInputMechanisms.Builder()
      .email(new java.util.ArrayList<UpdateAlertPolicyInputMechanismsEmailItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsEmailItemModel)))
      .webhooks(new java.util.ArrayList<UpdateAlertPolicyInputMechanismsWebhooksItem>(java.util.Arrays.asList(updateAlertPolicyInputMechanismsWebhooksItemModel)))
      .build();
  
      // Construct an instance of the UpdateAlertPolicyOptions model
      UpdateAlertPolicyOptions updateAlertPolicyOptionsModel = new UpdateAlertPolicyOptions.Builder()
      .policyId(policyId)
      .name("My Alert Policy")
      .description("A description for my alert policy")
      .enabled(true)
      .alertType("dos_attack_l7")
      .mechanisms(updateAlertPolicyInputMechanismsModel)
      .build();

      // Invoke operation
      Response<AlertSuccessResp> response = alertService.updateAlertPolicy(updateAlertPolicyOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AlertSuccessResp alertsRespResult = response.getResult();
      AlertSuccessRespResult webhooksId = alertsRespResult.getResult();
      identifier = webhooksId.getId();

      assertNotNull(alertsRespResult);
      assertNotNull(policyId);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testGetAlertPolicyWOptions() throws Exception {
    try {
       GetAlertPolicyOptions getAlertPolicyOptionsModel = new GetAlertPolicyOptions.Builder()
       .policyId(policyId)
       .build();

      // Invoke operation
      Response<GetAlertPolicyResp> response = alertService.getAlertPolicy(getAlertPolicyOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetAlertPolicyResp getAlertRespResult = response.getResult();
      GetAlertPolicyRespResult getResult = getAlertRespResult .getResult();
      
      assertNotNull(getAlertRespResult);
      assertNotNull(getResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testDeleteAlertPolicyWOptions() throws Exception {
    try {
        DeleteAlertPolicyOptions deleteAlertPolicyOptionsModel = new DeleteAlertPolicyOptions.Builder()
        .policyId(policyId)
        .build();

      // Invoke operation
      Response<AlertSuccessResp> response = alertService.deleteAlertPolicy(deleteAlertPolicyOptionsModel).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AlertSuccessResp deletealertsRespResult = response.getResult();
      
      assertNotNull(deletealertsRespResult);
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