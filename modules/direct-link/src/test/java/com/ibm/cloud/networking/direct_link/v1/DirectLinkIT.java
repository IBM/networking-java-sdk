/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.direct_link.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import java.sql.Timestamp;

import java.text.SimpleDateFormat;

import com.ibm.cloud.networking.direct_link.v1.model.AsPrepend;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependCollection;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependEntry;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependPrefixArrayTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.Gateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollectionGatewaysItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsec;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPatch;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPatch;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;

import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ExportRouteFilterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeConnectTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnectionCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponse;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetPortOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakKeyReferenceHpcsCakKeyReference;
import com.ibm.cloud.networking.direct_link.v1.model.ImportRouteFilterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayAsPrependsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayExportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayImportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayLetterOfAuthorizationOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayMacsecCaksOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayVirtualConnectionsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewaysOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListOfferingTypeLocationCrossConnectRoutersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListOfferingTypeLocationsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListOfferingTypeSpeedsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListPortsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.LocationCollection;
import com.ibm.cloud.networking.direct_link.v1.model.LocationCrossConnectRouterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.OfferingSpeedCollection;
import com.ibm.cloud.networking.direct_link.v1.model.OfferingSpeed;
import com.ibm.cloud.networking.direct_link.v1.model.Port;
import com.ibm.cloud.networking.direct_link.v1.model.PortCollection;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayAsPrependsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayExportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayImportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReport;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportCollection;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPatchSakRekeyTimerModePatch;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyTimerModePrototype;
import com.ibm.cloud.networking.direct_link.v1.model.SetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UnsetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateRouteFilterTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatusOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayRouteReportsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.RouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentityHpcsAuthenticationKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentitySecretsManagerAuthenticationKeyIdentity;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortIdentity;
import com.ibm.cloud.sdk.core.service.exception.NotFoundException;

/**
 * Integration test class for the DirectLink service.
 * 
 * How to run the tests:
 *    mvn -Dtest=DirectLinkIT -DfailIfNoTests=false test
 */
@Ignore("Ignoring it due to provisioning time and travis time-out")
public class DirectLinkIT extends SdkIntegrationTestBase {
	// Directlink service v1 integration
	public DirectLink testService = null;
	String gatewayId = null;
	String firstPortId = null;
	String classicVcId = null;
	String vpcVcId = null;
	String dedicatedGatewayId = null;
	String connectGatewayId = null;
	String exportRFId = null;
	String importRFId = null;
	String eTag = null;
	String cakId = null;

	Map<String, String> config = null;

	/**
	 * This method provides our config filename to the base class.
	 */
	public String getConfigFilename() {
		return "../../directlink.env";
	}

	/**
	 * This method is invoked before any of the @Test-annotated methods, and is
	 * responsible for creating the instance of the service that will be used by the
	 * rest of the test methods, as well as any other required initialization.
	 */
	@BeforeClass
	public void constructService() {
		// Ask super if we should skip the tests.
		if (skipTests()) {
			return;
		}

		/**
		 * Construct our service client instance via external config (see the
		 * example-service.env file for details). The newInstance() method will load up
		 * our config file and look for properties that start with "EXAMPLE_SERVICE_"
		 * (the default service name associated with the Example Service, as specified
		 * by the ExampleService.DEFAULT_SERVICE_NAME constant). Specifically,
		 * newInstance() will construct an authenticator based on the value of the
		 * EXAMPLE_SERVICE_AUTH_TYPE property. After constructing the appropriate
		 * authenticator, it will construct an instance of the service and then set the
		 * URL to the value specified by the EXAMPLE_SERVICE_URL property.
		 */

		final String serviceName = "network_service";

		// Load up the config properties for this service.
		config = CredentialUtils.getServiceProperties(serviceName);

		String version;
		// Date date = new Date();  
    	// SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			version = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			testService = DirectLink.newInstance(version, serviceName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void cleanup() {
		// First Clean Up the Virtual Connections
		deleteVirtualConnection(connectGatewayId, classicVcId); 
		deleteVirtualConnection(connectGatewayId, vpcVcId); 
		classicVcId = null;
		vpcVcId = null;

		// After the VCs are cleaned up now clean up the GWs
		// cleanUpSDKGateways();

		
	}
	
	private void cleanUpSDKGateways() {
		
		// ************** Delete the Dedicated Gateway created in our tests ************* 
		// Construct an instance of the DeleteGatewayOptions model
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(dedicatedGatewayId).build();

		// Invoke operation with valid options model (positive test)
		Response<Void> Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse);
		Void delResponseObj = Delresponse.getResult();
		// Response does not have a return type. Check that the result is null.
		assertNull(delResponseObj);
		assertEquals(204, Delresponse.getStatusCode());
		dedicatedGatewayId = null;

		// ************** Delete the Connect Gateway created in our tests ************* 
		// Construct an instance of the DeleteGatewayOptions model
		deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(connectGatewayId).build();

		// Invoke operation with valid options model (positive test)
		Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse);
		delResponseObj = Delresponse.getResult();
		// Response does not have a return type. Check that the result is null.
		assertNull(delResponseObj);
		assertEquals(204, Delresponse.getStatusCode());
		connectGatewayId = null;

		// ********** List all gateways ************* 
		ListGatewaysOptions listGatewaysOptionsModel = new ListGatewaysOptions();

		// Invoke operation with valid options model (positive test)
		Response<GatewayCollection> lisResp = testService.listGateways(listGatewaysOptionsModel).execute();
		assertNotNull(lisResp); assertEquals(200, lisResp.getStatusCode());
		
		GatewayCollection lisresponseObj = lisResp.getResult();
		assertNotNull(lisresponseObj); 
		assertNotEquals(0,lisresponseObj.getGateways().size());

		List<GatewayCollectionGatewaysItem> gateways = lisresponseObj.getGateways();
		for(GatewayCollectionGatewaysItem gateway: gateways){
			boolean isBreak = false;
			boolean isProviderApiManaged = false;
			if(null != gateway.isProviderApiManaged()){
				isProviderApiManaged=gateway.isProviderApiManaged();
			}
			if(!gateway.getOperationalStatus().equalsIgnoreCase("delete_pending") && gateway.getName().toLowerCase().contains("java-int-sdk") && !isProviderApiManaged)
			{
				// Check if it has any VC connected
				ListGatewayVirtualConnectionsOptions listGatewayVirtualConnectionsOptionsModel = new ListGatewayVirtualConnectionsOptions.Builder()
				.gatewayId(gateway.getId()).build();

				// Invoke operation with valid options model (positive test)
				Response<GatewayVirtualConnectionCollection> resp = testService
						.listGatewayVirtualConnections(listGatewayVirtualConnectionsOptionsModel).execute();
				assertNotNull(resp);
				assertEquals(200, resp.getStatusCode());
				GatewayVirtualConnectionCollection respObj = resp.getResult();
				
				if (respObj.getVirtualConnections().size() > 0) {
					List<GatewayVirtualConnection> vcs = respObj.getVirtualConnections();

					for(GatewayVirtualConnection vc: vcs) {
						if (vc.getType().toLowerCase().equals("spoke")){
							isBreak = true;
							break;
						}
						deleteVirtualConnection(gateway.getId(), vc.getId());
					} 
				}

				if (isBreak) {
					break;
				}

				// Delete the DL GW 
				deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gateway.getId()).build();
				Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
				assertNotNull(Delresponse); 
				assertEquals(204, Delresponse.getStatusCode());
				delResponseObj = Delresponse.getResult();
				assertNull(delResponseObj);
			}
		
		}
	}
	

	// Issue virtual connection delete API and poll for VC to be deleted
	private void deleteVirtualConnection(String gwId, String vcId) {
		if (gwId == null || vcId == null) {
			return;
		}
		
		// Construct an instance of the DeleteGatewayVirtualConnectionOptions model
		DeleteGatewayVirtualConnectionOptions deleteGatewayVirtualConnectionOptionsModel = new DeleteGatewayVirtualConnectionOptions.Builder()
		.gatewayId(gwId).id(vcId).build();

		// Delete the virtual connection and make sure the API responds with a 204 status code
		Response<Void> delVCResponse = testService
			.deleteGatewayVirtualConnection(deleteGatewayVirtualConnectionOptionsModel).execute();
		assertNotNull(delVCResponse);
		assertEquals(204, delVCResponse.getStatusCode());

		// Construct an instance of the GetGatewayVirtualConnectionOptions model
		GetGatewayVirtualConnectionOptions getGatewayVirtualConnectionOptionsModel = new GetGatewayVirtualConnectionOptions.Builder()
			.gatewayId(gwId).id(vcId).build();

		// Poll the gateway's virtual connection waiting for it to actually be removed.
		boolean done = false;
		int timerCount = 1;

		while (!done) {
			try {
				// Query the virtual connection to see if it still exists.
				Response<GatewayVirtualConnection> VCResponse = testService.getGatewayVirtualConnection(getGatewayVirtualConnectionOptionsModel).execute();

				// Did not hit the exception. Either VC still exists or different error occurred this pass.  Continue polling
				if (timerCount > 40) {
						// Timed out.  Throw an error
						assertNotEquals(404, VCResponse.getStatusCode());
						done = true;
				} else {
					++timerCount;
					try {
						Thread.sleep(3000);	// 2 minute wait 3sec x 40 attempts
					} catch (InterruptedException e) {
					// 
					}
				}
			} catch (NotFoundException nfe) {
				// When the virtual connection no longer exists, this exception is thrown.
				done = true;
			}
		}
	
	}

	private String getPortForConnect(List<Port> ports){
		String providerToBeUsed = "DL2-TEST";
		String portId = "";

		for (Port port: ports){
			if (port.getProviderName().equals(providerToBeUsed)){
				portId = port.getId();
			}
		}

		return portId;
	}

	private void isRouteReportAvailable(String gatewayId, String routeReportId) {
		// Poll the gateway's route report to be completed
		boolean done = false;
		int timerCount = 1;

		while (!done) {
			try {
				// Query the virtual connection to see if it still exists.
				GetGatewayRouteReportOptions getGatewayRouteReportOptions = new GetGatewayRouteReportOptions.Builder().gatewayId(gatewayId).id(routeReportId).build();
				Response<RouteReport> response = testService.getGatewayRouteReport(getGatewayRouteReportOptions).execute();
				assertEquals(200, response.getStatusCode());
				RouteReport report = response.getResult();

				// Check if the route report is completed within the specified time 
				if (timerCount > 40) {
						// Timed out.  Throw an error
						assertEquals("complete", report.getStatus());
						done = true;
				} else {
					++timerCount;
					try {
						Thread.sleep(3000);	// 2 minute wait 3sec x 40 attempts
					} catch (InterruptedException e) {
					// 
					}
				}
			} catch (com.ibm.cloud.sdk.core.service.exception.NotFoundException nfe) {
				// When the virtual connection no longer exists, this exception is thrown.
				done = true;
			}
		}
	}

	private void checkRouteReportDeletion(GetGatewayRouteReportOptions routeReportOptions) throws InterruptedException {
		int timer = 0;
		while(true) {
			// Invoke operation with valid options model (positive test)
			try {
				if (routeReportOptions != null) {
					Response<RouteReport> rrGetResp = testService.getGatewayRouteReport(routeReportOptions).execute();
					assertNotNull(rrGetResp); 
				}
			} catch (NotFoundException e) {
				break;
			}

			Thread.sleep(10000);
			timer = timer + 1;

			// 4 min timer (24x10sec)
			if(timer > 24) { 
				break;
			}
	  	}
	}
	
	@org.junit.Ignore
	//@Test 
	public void testDedicatedGatewayOptions() { 
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");// "dal09";//read this from env file 
		String gatewayName = "JAVA-INT-SDK-DEDICATED-"+timestamp; 
		String updatedGatewayName = "JAVA-INT-SDK-DEDICATED-PATCH-"+timestamp; 
		Long bgpAsn = 64999L; 
		String bgpBaseCidr = "169.254.0.0/16"; 
		String crossConnectRouter = "LAB-xcr01.dal09"; 
		boolean global = true; 
		Long speedMbps = 1000L; 
		boolean metered = false; 
		String carrierName = "carrier1"; 
		String customerName = "customer1"; 
		String gatewayType = "dedicated";
	  
		// Construct an instance of the GatewayTemplateRouteFilter model
		GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
			.action("permit")
			.ge(Long.valueOf("25"))
			.le(Long.valueOf("30"))
			.prefix("192.168.100.0/24")
			.build();	

	  GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
	  	.bgpAsn(bgpAsn).bgpBaseCidr(bgpBaseCidr).bgpCerCidr("10.254.30.78/30").bgpIbmCidr("10.254.30.77/30")
	  	.global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
	  	.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName) 
	  	.locationName(locationName)
		.defaultExportRouteFilter("permit")
		.defaultImportRouteFilter("permit")
		.exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
		.importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
		.vlan(Long.valueOf("10"))
		.build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
		assertNotNull(response); 
		assertEquals(201, 
		response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		
		// save gw id for clean up routine if we terminate
	  	dedicatedGatewayId = responseObj.getId();

	  
	 	//********** Get the dedicate gateway just created *************
	  	GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(dedicatedGatewayId).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
		assertNotNull(getGatewayResponse); 
		assertEquals(200, getGatewayResponse.getStatusCode());
	  
		GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult(); 
		assertNotNull(getGatewayResponseObj);
	  
		// ********** List all gateways ************* 
		ListGatewaysOptions listGatewaysOptionsModel = new ListGatewaysOptions();
	  
		// Invoke operation with valid options model (positive test)
		Response<GatewayCollection> lisResp = testService.listGateways(listGatewaysOptionsModel).execute();
		assertNotNull(lisResp); assertEquals(200, lisResp.getStatusCode());
		
		GatewayCollection lisresponseObj = lisResp.getResult();
		assertNotNull(lisresponseObj); 
		assertNotEquals(0,lisresponseObj.getGateways().size());

		GatewayCollectionGatewaysItem gw = lisresponseObj.getGateways().get(0);
		
		assertEquals(gw.getDefaultExportRouteFilter(), "permit");
		assertEquals(gw.getDefaultImportRouteFilter(), "permit");

		// check for vlan on created dedicated gw
		assertEquals(Long.valueOf(10), gw.getVlan());

		// ********** Patch the gateway using attributes that can be changed with the current gw status ************* 
		// Construct an instance of the GatewayPatchTemplate model
		GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.global(false).metered(true).name(updatedGatewayName).speedMbps(Long.valueOf("1000"))
			.vlan(Long.valueOf("99")).build();
		// convert to map asPatch
		Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		// Construct an instance of the UpdateGatewayOptions model 
		UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
			.id(dedicatedGatewayId).gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build(); 
			
		// Invoke operation with valid options model (positive test) 
		Response<Gateway> updateResponse =	testService.updateGateway(updateGatewayOptionsModel).execute();
		assertNotNull(updateResponse); 
		assertEquals(200, updateResponse.getStatusCode());
		assertEquals(updateResponse.getResult().getDefaultExportRouteFilter(), "permit");
		assertEquals(updateResponse.getResult().getDefaultImportRouteFilter(), "permit");

		// check for vlan on updated dedicated gw
		assertEquals(Long.valueOf(99), updateResponse.getResult().getVlan());

		// Construct an instance of the GatewayPatchTemplate model with null vlan
		GatewayPatchTemplate gatewayPatchTemplateWNullVLANModel = new GatewayPatchTemplate.Builder()
			.global(false).metered(true).name(updatedGatewayName).speedMbps(Long.valueOf("1000")).vlan(Long.valueOf(null)).build();
		// convert to map asPatch
		Map<String, Object> gatewayPatchTemplateWNUllVLANModelAsPatch = gatewayPatchTemplateWNullVLANModel.asPatch();
		// Construct an instance of the UpdateGatewayOptions model
		UpdateGatewayOptions updateGatewayOptionsWNullVLANModel = new UpdateGatewayOptions.Builder().id(dedicatedGatewayId)
			.gatewayPatchTemplatePatch(gatewayPatchTemplateWNUllVLANModelAsPatch).build(); 
			
		// Invoke operation with null vlan options model
		Response<Gateway> updateWNVLANResponse = testService.updateGateway(updateGatewayOptionsWNullVLANModel).execute();
		assertNotNull(updateWNVLANResponse); 
		assertEquals(200, updateWNVLANResponse.getStatusCode());
		assertNull(updateWNVLANResponse.getResult().getVlan());
	  
	  	Gateway updateResponseObj = updateResponse.getResult();
	  	assertNotNull(updateResponseObj);
	  
		// ********** Patch the gateway using valid attributes, but cannot be changed with the current gw status ************* 
		// Update instance of the GatewayPatchTemplate model
		gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.loaRejectReason("Some reason for the failure").build();
		// convert to map asPatch
		gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		// Construct an instance of the UpdateGatewayOptions model 
		updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
			.id(dedicatedGatewayId).gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build(); 
			
		// Invoke operation with valid options model 
		try { 
			// should not end up here 
			Response<Gateway>	updateResponseLoa = testService.updateGateway(updateGatewayOptionsModel).execute();
			assertNotNull(updateResponseLoa); 
			assertEquals(400, updateResponseLoa.getStatusCode()); 
		} catch (com.ibm.cloud.sdk.core.service.exception.BadRequestException errResponse) {
			// expect this error for loa status update response 
		}

		// Update instance of the GatewayPatchTemplate model
		gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.operationalStatus("loa_rejected").loaRejectReason("Some reason for the failure").build();
		// convert to map asPatch
		gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
	  	// Construct an instance of the UpdateGatewayOptions model
	  	updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(dedicatedGatewayId)
			.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build(); 
				
		// Invoke operation with valid options model (positive test) 
		try { 
			// should not end up here
	  	Response<Gateway> updateResponseStatus = testService.updateGateway(updateGatewayOptionsModel).execute();
			assertNotNull(updateResponseStatus); 
			assertEquals(400, updateResponseStatus.getStatusCode()); 
		} catch	(com.ibm.cloud.sdk.core.service.exception.BadRequestException errResponse) {
			// expect this error for loa status update response 
		}
	  
		// *********** Do not delete the GW to be re-used later **************************
	}
	
	@org.junit.Ignore
	//@Test (dependsOnMethods = "testDedicatedGatewayOptions")
	public void testLOA() {
		assertNotNull(testService);

		// Construct an instance of the ListGatewayLetterOfAuthorizationOptions model
		ListGatewayLetterOfAuthorizationOptions listGatewayLetterOfAuthorizationOptionsModel = new ListGatewayLetterOfAuthorizationOptions.Builder()
			.id(dedicatedGatewayId).build();

		try {
			// Invoke operation with valid options model (positive test)
			Response<InputStream> loaResponse = testService
				.listGatewayLetterOfAuthorization(listGatewayLetterOfAuthorizationOptionsModel).execute();

			// We should never get here as the call should throw an exception
			assertNotNull(loaResponse);
			assertNotEquals(404, loaResponse.getStatusCode());
		} catch (com.ibm.cloud.sdk.core.service.exception.NotFoundException nfe) {
			// Expect a not found response since LOA does not exist
		}
	}

	@org.junit.Ignore
	//@Test (dependsOnMethods = "testLOA")
  	public void testCompletionNotice() throws IOException {
		assertNotNull(testService);

		// ***************** Attempt to upload a completion notice; it will fail due to github issue state *********************
		try { 
			// open the sample completion notice pdf
			File initialFile = new File("src/main/resources/completion_notice.pdf");

			// Construct an instance of the CreateGatewayCompletionNoticeOptions model
			CreateGatewayCompletionNoticeOptions createGatewayCompletionNoticeOptionsModel = new CreateGatewayCompletionNoticeOptions.Builder()
				.id(dedicatedGatewayId).uploadContentType("application/pdf").upload(initialFile).build();

			// Invoke operation with valid options model (positive test)
				testService.createGatewayCompletionNotice(createGatewayCompletionNoticeOptionsModel).execute();
		} catch (com.ibm.cloud.sdk.core.service.exception.ServiceResponseException e) {
			// Expect upload to fail with a 412 since the GH state for the gateway is not correct for upload at this point.
			assertEquals(412, e.getStatusCode());
		}
		 
		// ***************** Attempt to get details for a completion notice; it will fail due to not being found *********************
   
		// Construct an instance of the ListGatewayCompletionNoticeOptions model
		ListGatewayCompletionNoticeOptions listGatewayCompletionNoticeOptionsModel = new ListGatewayCompletionNoticeOptions.Builder()
			.id(dedicatedGatewayId).build();

		try {	
			// Invoke operation with valid options model (positive test)
			Response<InputStream> listActResponse = testService
				.listGatewayCompletionNotice(listGatewayCompletionNoticeOptionsModel).execute();
			assertNull(listActResponse);
			InputStream lisResponseObj = listActResponse.getResult();
			assertNull(lisResponseObj);
		} catch (com.ibm.cloud.sdk.core.service.exception.NotFoundException nfe) {
			// Expect a not found response since CN does not exist
		}
 	}

	@Test ()
	public void testPorts() {
		assertNotNull(testService);

		// ***************** List all ports but limit list to 2 entries (pagination test) *********************
		// Construct an instance of the ListPortsOptions model
		ListPortsOptions listPortsOptionsModel = new ListPortsOptions.Builder().limit(Long.valueOf("2")).build();
		// Invoke operation with valid options model (positive test)
		Response<PortCollection> res = testService.listPorts(listPortsOptionsModel).execute();
		assertNotNull(res);
		assertEquals(200, res.getStatusCode());
		PortCollection resObj = res.getResult();
		assertNotNull(resObj);

		// Save the first port found for get port and connect gw tests
		firstPortId = getPortForConnect(resObj.getPorts());

		// ***************** Get details of the 1st port *********************
		// Construct an instance of the GetPortOptions model
		GetPortOptions getPortOptionsModel = new GetPortOptions.Builder().id(firstPortId).build();
		// Invoke operation with valid options model (positive test)
		Response<Port> resp = testService.getPort(getPortOptionsModel).execute();
		assertNotNull(resp);
		assertEquals(200, res.getStatusCode());
		Port respObj = resp.getResult();
		assertNotNull(respObj);
	}

	@Test(dependsOnMethods = "testPorts")
	public void testConnectGatewayOptions() {
		assertNotNull(testService);
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime();

		String gatewayName = "JAVA-INT-SDK-CONNECT-" + timestamp;
		Long bgpAsn = 64999L;
		Long speedMbps = 1000L;
		boolean metered = false;
		boolean global = false;
		String gatewayType = "connect";
		String bgpBaseCidr = "169.254.0.0/16";

		// Construct an instance of the AsPrependTemplate model
		AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
		.length(Long.valueOf("4"))
		.policy("import")
		.specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
		.build();

		// Construct an instance of the GatewayTemplateRouteFilter model
		GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
		.action("permit")
		.ge(Long.valueOf("25"))
		.le(Long.valueOf("30"))
		.prefix("192.168.100.0/24")
		.build();	

		GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder().id(firstPortId).build();
		GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
		.asPrepends(java.util.Arrays.asList(asPrependTemplateModel))
				.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
				.port(gatewayPortIdentityModel).bgpBaseCidr(bgpBaseCidr)
				.defaultExportRouteFilter("permit")
				.defaultImportRouteFilter("permit")
				.exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
				.importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
				.build();

		// ***************** Create connect Gateway *********************
		// Construct an instance of the CreateGatewayOptions model
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder()
				.gatewayTemplate(gatewayTemplateModel).build();

		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
		assertNotNull(response);
		assertEquals(201, response.getStatusCode());

		Gateway responseObj = response.getResult();
		assertNotNull(responseObj);

		connectGatewayId = responseObj.getId();

		// ********** Wait for the GW to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				assertEquals(getGatewayResponseObj.getDefaultExportRouteFilter(), "permit");
				assertEquals(getGatewayResponseObj.getDefaultImportRouteFilter(), "permit");
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}
	}

	@Test(dependsOnMethods = "testConnectGatewayOptions")
	public void testConnectGatewayListASPrependsOptions() {
		assertNotNull(testService);

		// Construct an instance of the AsPrependTemplate model
		AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
		.length(Long.valueOf("4"))
		.policy("import")
		.specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
		.build();

		// Construct an instance of the ListGatewayAsPrependsOptions model
		ListGatewayAsPrependsOptions listGatewayAsPrependsOptionsModel = new ListGatewayAsPrependsOptions.Builder()
		.gatewayId(connectGatewayId)
		.build();
  
	  // Invoke listGatewayAsPrepends() with a valid options model and verify the result
	  Response<AsPrependCollection> response = testService.listGatewayAsPrepends(listGatewayAsPrependsOptionsModel).execute();
	  assertNotNull(response);
	  // System.out.println("List of headers " + response.getHeaders().values("etag"));
	  AsPrependCollection responseObj = response.getResult();
	  assertNotNull(responseObj);
	  eTag = response.getHeaders().values("etag").get(0);
  
	  // Verify the contents of the request sent to the mock server
	  
	  // Verify request path
	  AsPrependEntry as = responseObj.getAsPrepends().get(0);
	  assertEquals(asPrependTemplateModel.length(), as.getLength());
	  assertEquals(asPrependTemplateModel.policy(), as.getPolicy());
	  assertEquals(asPrependTemplateModel.specificPrefixes(), as.getSpecificPrefixes());
	}

	@Test(dependsOnMethods = "testConnectGatewayOptions")
  	public void testConnectGatewayReplaceAsPrependsWOptions() {
		assertNotNull(testService);
		// Construct an instance of the AsPrependPrefixArrayTemplate model
		AsPrependPrefixArrayTemplate asPrependPrefixArrayTemplateModel = new AsPrependPrefixArrayTemplate.Builder()
		.length(Long.valueOf("5"))
		.policy("export")
		.specificPrefixes(java.util.Arrays.asList("10.10.10.0/24"))
		.build();

		// Construct an instance of the ReplaceGatewayAsPrependsOptions model
		ReplaceGatewayAsPrependsOptions replaceGatewayAsPrependsOptionsModel = new ReplaceGatewayAsPrependsOptions.Builder()
		.gatewayId(connectGatewayId)
		.ifMatch(eTag)
		.asPrepends(java.util.Arrays.asList(asPrependPrefixArrayTemplateModel))
		.build();

		// Invoke replaceGatewayAsPrepends() with a valid options model and verify the result
		Response<AsPrependCollection> response = testService.replaceGatewayAsPrepends(replaceGatewayAsPrependsOptionsModel).execute();
		assertNotNull(response);
		AsPrependCollection responseObj = response.getResult();
		assertNotNull(responseObj);

		// Verify the contents of the request sent to the mock server
		AsPrependEntry as = responseObj.getAsPrepends().get(0);
	  	assertEquals(asPrependPrefixArrayTemplateModel.length(), as.getLength());
	  	assertEquals(asPrependPrefixArrayTemplateModel.policy(), as.getPolicy());
	  	assertEquals(asPrependPrefixArrayTemplateModel.specificPrefixes(), as.getSpecificPrefixes());
    
  	}
	
	@Test (dependsOnMethods = "testConnectGatewayOptions")
  	public void testCreateGatewayAction()  {

		// Construct an instance of the CreateGatewayActionOptions model
		CreateGatewayActionOptions createGatewayActionOptionsModel = new CreateGatewayActionOptions.Builder()
		.id(connectGatewayId)
		.action("create_gateway_approve")
		.build();

		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGatewayAction(createGatewayActionOptionsModel).execute();
		assertNotNull(response);
		Gateway responseObj = response.getResult();
		assertNotNull(responseObj);
		assertEquals(responseObj.getDefaultExportRouteFilter(), "permit");
		assertEquals(responseObj.getDefaultImportRouteFilter(), "permit");
	}

	@Test (dependsOnMethods = "testConnectGatewayOptions")
	public void testVirtualConnection() {
		assertNotNull(testService);

		String crn = config.get("GEN2_VPC_CRN");

		// ********** Create a VPC virtual connection *************
		// Construct an instance of the CreateGatewayVirtualConnectionOptions model
		CreateGatewayVirtualConnectionOptions createGatewayVirtualConnectionOptionsModel = new CreateGatewayVirtualConnectionOptions.Builder()
			.gatewayId(connectGatewayId).name("JAVA-INT-SDK-VPC-VC").type("vpc").networkId(crn).build();

		// Invoke operation with valid options model (positive test)
		Response<GatewayVirtualConnection> createResp = testService
			.createGatewayVirtualConnection(createGatewayVirtualConnectionOptionsModel).execute();

		assertNotNull(createResp);
		assertEquals(201, createResp.getStatusCode());
		
		GatewayVirtualConnection createRespObj = createResp.getResult();
		assertNotNull(createRespObj);
		
		vpcVcId = createRespObj.getId();

		// ********** Create a Classic virtual connection *************
		// Construct an instance of the CreateGatewayVirtualConnectionOptions model
		createGatewayVirtualConnectionOptionsModel = new CreateGatewayVirtualConnectionOptions.Builder()
			.gatewayId(connectGatewayId).name("JAVA-INT-SDK-CLASSIC-VC").type("classic").build();

		// Invoke operation with valid options model (positive test)
		createResp = testService.createGatewayVirtualConnection(createGatewayVirtualConnectionOptionsModel).execute();

		assertNotNull(createResp);
		assertEquals(201, createResp.getStatusCode());
		
		createRespObj = createResp.getResult();
		assertNotNull(createRespObj);
		
		classicVcId = createRespObj.getId();

		// ********** List all the VCs (should be 2) *************
		// Construct an instance of the ListGatewayVirtualConnectionsOptions model
		ListGatewayVirtualConnectionsOptions listGatewayVirtualConnectionsOptionsModel = new ListGatewayVirtualConnectionsOptions.Builder()
				.gatewayId(connectGatewayId).build();

		// Invoke operation with valid options model (positive test)
		Response<GatewayVirtualConnectionCollection> resp = testService
				.listGatewayVirtualConnections(listGatewayVirtualConnectionsOptionsModel).execute();
		assertNotNull(resp);
		assertEquals(200, resp.getStatusCode());
		GatewayVirtualConnectionCollection respObj = resp.getResult();
		assertNotNull(respObj);

		assertEquals(2, respObj.getVirtualConnections().size());

		// ********** GET both of the virtual connections attached to the gateway
		// Construct an instance of the GetGatewayVirtualConnectionOptions model
		GetGatewayVirtualConnectionOptions getGatewayVirtualConnectionOptionsModel = new GetGatewayVirtualConnectionOptions.Builder()
				.gatewayId(connectGatewayId).id(vpcVcId).build();

		// Invoke operation with valid options model (positive test)
		Response<GatewayVirtualConnection> VCResponse = testService
			.getGatewayVirtualConnection(getGatewayVirtualConnectionOptionsModel).execute();
		assertNotNull(VCResponse);
		assertEquals(200, VCResponse.getStatusCode());
		GatewayVirtualConnection VCresponseObj = VCResponse.getResult();
		assertNotNull(VCresponseObj);

		// ********** GET each of the virtual connections attached to the gateway
		// Construct an instance of the GetGatewayVirtualConnectionOptions model
		getGatewayVirtualConnectionOptionsModel = new GetGatewayVirtualConnectionOptions.Builder()
			.gatewayId(connectGatewayId).id(classicVcId).build();

		// Invoke operation with valid options model (positive test)
		VCResponse = testService.getGatewayVirtualConnection(getGatewayVirtualConnectionOptionsModel).execute();
		assertNotNull(VCResponse);
		assertEquals(200, VCResponse.getStatusCode());
		VCresponseObj = VCResponse.getResult();
		assertNotNull(VCresponseObj);

		// ********* Update VPC virtual connection using an attribute that can be changed ************
		// Construct an instance of the UpdateGatewayVirtualConnectionOptions model
		UpdateGatewayVirtualConnectionOptions updateGatewayVirtualConnectionOptionsModel = new UpdateGatewayVirtualConnectionOptions.Builder()
			.gatewayId(connectGatewayId).id(vpcVcId).build();

		// Invoke operation with valid options model (positive test)
		Response<GatewayVirtualConnection> updateResponse = testService
			.updateGatewayVirtualConnection(updateGatewayVirtualConnectionOptionsModel).execute();
		assertNotNull(updateResponse);
		assertEquals(200, updateResponse.getStatusCode());
		GatewayVirtualConnection updateResponseObj = updateResponse.getResult();
		assertNotNull(updateResponseObj);

		// ********* Update VPC virtual connection using a valid attribute that can not be changed because the VC does not span accounts requiring a status approval ************
		// Construct an instance of the UpdateGatewayVirtualConnectionOptions model
		updateGatewayVirtualConnectionOptionsModel = new UpdateGatewayVirtualConnectionOptions.Builder()
				.gatewayId(connectGatewayId).id(vpcVcId).build();

		// Invoke operation with valid options model (positive test) 
		try { 
			// should not end up here because the VC does not span accounts requiring a status approval
			updateResponse = testService.updateGatewayVirtualConnection(updateGatewayVirtualConnectionOptionsModel).execute();
			assertNotNull(updateResponse);
			assertEquals(400, updateResponse.getStatusCode()); 
		} catch	(com.ibm.cloud.sdk.core.service.exception.BadRequestException errResponse) {
			// expect this error for vc status update response 
		}

		// ************************** Do not delete virtual connections  to be reused later *********************
	}

	@Test (dependsOnMethods = "testVirtualConnection")
  	public void testCreateGatewayExportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the CreateGatewayExportRouteFilterOptions model
		CreateGatewayExportRouteFilterOptions createGatewayExportRouteFilterOptionsModel = new CreateGatewayExportRouteFilterOptions.Builder()
		.gatewayId(connectGatewayId)
		.action("permit")
		.prefix("192.168.100.0/24")
		.ge(Long.valueOf("25"))
		.le(Long.valueOf("30"))
		.build();
  
	  // Invoke createGatewayExportRouteFilter() with a valid options model and verify the result
	  Response<RouteFilter> response = testService.createGatewayExportRouteFilter(createGatewayExportRouteFilterOptionsModel).execute();
	  assertNotNull(response);
	  RouteFilter responseObj = response.getResult();
	  assertNotNull(responseObj);
	  assertEquals(responseObj.getAction(), "permit");
	  assertEquals(responseObj.getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getLe(), Long.valueOf("30"));
	  exportRFId = responseObj.getId();
	}

	@Test (dependsOnMethods = "testCreateGatewayExportRouteFilter")
  	public void testGetGatewayExportRouteFilter()  {

		// Construct an instance of the GetGatewayExportRouteFilterOptions model
		GetGatewayExportRouteFilterOptions getGatewayExportRouteFilterOptionsModel = new GetGatewayExportRouteFilterOptions.Builder()
		.gatewayId(connectGatewayId)
		.id(exportRFId)
		.build();
  
	  // Invoke getGatewayExportRouteFilter() with a valid options model and verify the result
	  Response<RouteFilter> responseObj = testService.getGatewayExportRouteFilter(getGatewayExportRouteFilterOptionsModel).execute();
	  assertNotNull(responseObj);	
	  assertEquals(responseObj.getResult().getAction(), "permit");
	  assertEquals(responseObj.getResult().getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getResult().getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getResult().getLe(), Long.valueOf("30"));
	}

	@Test (dependsOnMethods = "testGetGatewayExportRouteFilter")
  	public void testUpdateGatewayExportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the UpdateRouteFilterTemplate model
		UpdateRouteFilterTemplate updateRouteFilterTemplateModel = new UpdateRouteFilterTemplate.Builder()
		.action("deny")
		.ge(25)
		.le(30)
		.prefix("192.168.100.0/24")
		.build();
		/* 
		HashMap<String, Object> map = new HashMap<String, Object>();//Creating HashMap    
		map.put(updateRouteFilterTemplateModel.toString(),Map<String, Object>.class);//Put elements in Map  
		*/
	  	Map<String, Object> updateRouteFilterTemplateModelAsPatch = updateRouteFilterTemplateModel.asPatch();
  
	  // Construct an instance of the UpdateGatewayExportRouteFilterOptions model
	  UpdateGatewayExportRouteFilterOptions updateGatewayExportRouteFilterOptionsModel = new UpdateGatewayExportRouteFilterOptions.Builder()
	  .gatewayId(connectGatewayId)
	  .id(exportRFId)
	  .updateRouteFilterTemplatePatch(updateRouteFilterTemplateModelAsPatch)
	  .build();
  
	  // Invoke updateGatewayExportRouteFilter() with a valid options model and verify the result
	  Response<RouteFilter> responseObj = testService.updateGatewayExportRouteFilter(updateGatewayExportRouteFilterOptionsModel).execute();
	  assertNotNull(responseObj);	
	  assertEquals(responseObj.getResult().getAction(), "deny");
	  assertEquals(responseObj.getResult().getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getResult().getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getResult().getLe(), Long.valueOf("30"));
	}

	@Test (dependsOnMethods = "testGetGatewayExportRouteFilter")
  	public void testListGatewayExportRouteFilter()  {

		// Construct an instance of the ListGatewayExportRouteFiltersOptions model
		ListGatewayExportRouteFiltersOptions listGatewayExportRouteFiltersOptionsModel = new ListGatewayExportRouteFiltersOptions.Builder()
		.gatewayId(connectGatewayId)
		.build();
  
	  // Invoke listGatewayExportRouteFilters() with a valid options model and verify the result
	  Response<ExportRouteFilterCollection> response = testService.listGatewayExportRouteFilters(listGatewayExportRouteFiltersOptionsModel).execute();
	  assertNotNull(response);
	  ExportRouteFilterCollection responseObj = response.getResult();
	  assertNotNull(responseObj);
	  int size = responseObj.getExportRouteFilters().size();
	  assert(size > 0); 
	  eTag = response.getHeaders().values("etag").get(0);
	}

	//@Test (dependsOnMethods = "testListGatewayExportRouteFilter")
  	public void testReplaceGatewayExportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the GatewayTemplateRouteFilter model
		GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
		.action("permit")
		.ge(Long.valueOf("25"))
		.le(Long.valueOf("30"))
		.prefix("192.168.100.0/24")
		.build();
  
	  // Construct an instance of the ReplaceGatewayExportRouteFiltersOptions model
	  ReplaceGatewayExportRouteFiltersOptions replaceGatewayExportRouteFiltersOptionsModel = new ReplaceGatewayExportRouteFiltersOptions.Builder()
		.gatewayId(connectGatewayId)
		.ifMatch(eTag)
		.exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
		.build();
  
	  // Invoke replaceGatewayExportRouteFilters() with a valid options model and verify the result
	  Response<ExportRouteFilterCollection> response = testService.replaceGatewayExportRouteFilters(replaceGatewayExportRouteFiltersOptionsModel).execute();
	  assertNotNull(response);
	  ExportRouteFilterCollection responseObj = response.getResult();
	  assertNotNull(responseObj);
	  int size = responseObj.getExportRouteFilters().size();
	  assert(size > 0); 
	  assertEquals(responseObj.getExportRouteFilters().get(0).getAction(), "permit");
	  assertEquals(responseObj.getExportRouteFilters().get(0).getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getExportRouteFilters().get(0).getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getExportRouteFilters().get(0).getLe(), Long.valueOf("30"));
	  exportRFId = responseObj.getExportRouteFilters().get(0).getId();
	}

	@Test (dependsOnMethods = "testListGatewayExportRouteFilter")
  	public void testDeleteGatewayExportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the DeleteGatewayExportRouteFilterOptions model
		DeleteGatewayExportRouteFilterOptions deleteGatewayExportRouteFilterOptionsModel = new DeleteGatewayExportRouteFilterOptions.Builder()
		.gatewayId(connectGatewayId)
		.id(exportRFId)
		.build();
  
	  // Invoke deleteGatewayExportRouteFilter() with a valid options model and verify the result
	  Response<Void> response = testService.deleteGatewayExportRouteFilter(deleteGatewayExportRouteFilterOptionsModel).execute();
	  assertNotNull(response);
	  Void responseObj = response.getResult();
	  assertNull(responseObj);
	}

	@Test (dependsOnMethods = "testDeleteGatewayExportRouteFilter")
  	public void testCreateGatewayImportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the CreateGatewayImportRouteFilterOptions model
		CreateGatewayImportRouteFilterOptions createGatewayImportRouteFilterOptionsModel = new CreateGatewayImportRouteFilterOptions.Builder()
		.gatewayId(connectGatewayId)
		.action("permit")
		.prefix("192.168.100.0/24")
		.ge(Long.valueOf("25"))
		.le(Long.valueOf("30"))
		.build();
  
	  // Invoke createGatewayImportRouteFilter() with a valid options model and verify the result
	  Response<RouteFilter> response = testService.createGatewayImportRouteFilter(createGatewayImportRouteFilterOptionsModel).execute();
	  assertNotNull(response);
	  RouteFilter responseObj = response.getResult();
	  assertNotNull(responseObj);
	  assertEquals(responseObj.getAction(), "permit");
	  assertEquals(responseObj.getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getLe(), Long.valueOf("30"));
	  importRFId = responseObj.getId();
	}

	@Test (dependsOnMethods = "testCreateGatewayImportRouteFilter")
  	public void testGetGatewayImportRouteFilter()  {

		// Construct an instance of the GetGatewayImportRouteFilterOptions model
		GetGatewayImportRouteFilterOptions getGatewayImportRouteFilterOptionsModel = new GetGatewayImportRouteFilterOptions.Builder()
		.gatewayId(connectGatewayId)
		.id(importRFId)
		.build();
  
	  // Invoke getGatewayImportRouteFilter() with a valid options model and verify the result
	  Response<RouteFilter> responseObj = testService.getGatewayImportRouteFilter(getGatewayImportRouteFilterOptionsModel).execute();
	  assertNotNull(responseObj);	
	  assertEquals(responseObj.getResult().getAction(), "permit");
	  assertEquals(responseObj.getResult().getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getResult().getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getResult().getLe(), Long.valueOf("30"));
	}

	@Test (dependsOnMethods = "testGetGatewayImportRouteFilter")
  	public void testUpdateGatewayImportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the UpdateRouteFilterTemplate model
		UpdateRouteFilterTemplate updateRouteFilterTemplateModel = new UpdateRouteFilterTemplate.Builder()
		.action("deny")
		.ge(25)
		.le(30)
		.prefix("192.168.100.0/24")
		.build();
		/* 
		HashMap<String, Object> map = new HashMap<String, Object>();//Creating HashMap    
		map.put(updateRouteFilterTemplateModel.toString(), Map.class);//Put elements in Map  
		*/
	  	Map<String, Object> updateRouteFilterTemplateModelAsPatch = updateRouteFilterTemplateModel.asPatch();

	  // Construct an instance of the UpdateGatewayImportRouteFilterOptions model
	  UpdateGatewayImportRouteFilterOptions updateGatewayImportRouteFilterOptionsModel = new UpdateGatewayImportRouteFilterOptions.Builder()
	  .gatewayId(connectGatewayId)
	  .id(importRFId)
	  .updateRouteFilterTemplatePatch(updateRouteFilterTemplateModelAsPatch)
	  .build();
  
	  // Invoke updateGatewayImportRouteFilter() with a valid options model and verify the result
	  Response<RouteFilter> responseObj = testService.updateGatewayImportRouteFilter(updateGatewayImportRouteFilterOptionsModel).execute();
	  assertNotNull(responseObj);	
	  assertEquals(responseObj.getResult().getAction(), "deny");
	  assertEquals(responseObj.getResult().getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getResult().getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getResult().getLe(), Long.valueOf("30"));
	}

	@Test (dependsOnMethods = "testUpdateGatewayImportRouteFilter")
  	public void testListGatewayImportRouteFilter()  {

		// Construct an instance of the ListGatewayImportRouteFiltersOptions model
		ListGatewayImportRouteFiltersOptions listGatewayImportRouteFiltersOptionsModel = new ListGatewayImportRouteFiltersOptions.Builder()
		.gatewayId(connectGatewayId)
		.build();
  
	  // Invoke listGatewayImportRouteFilters() with a valid options model and verify the result
	  Response<ImportRouteFilterCollection> response = testService.listGatewayImportRouteFilters(listGatewayImportRouteFiltersOptionsModel).execute();
	  assertNotNull(response);
	  ImportRouteFilterCollection responseObj = response.getResult();
	  assertNotNull(responseObj);
	  int size = responseObj.getImportRouteFilters().size();
	  assert(size > 1); 
	  eTag = response.getHeaders().values("etag").get(0);
	}

	//@Test (dependsOnMethods = "testListGatewayImportRouteFilter")
  	public void testReplaceGatewayImportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the GatewayTemplateRouteFilter model
		GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
		.action("permit")
		.ge(Long.valueOf("25"))
		.le(Long.valueOf("30"))
		.prefix("192.168.100.0/24")
		.build();
  
	  // Construct an instance of the ReplaceGatewayImportRouteFiltersOptions model
	  ReplaceGatewayImportRouteFiltersOptions replaceGatewayImportRouteFiltersOptionsModel = new ReplaceGatewayImportRouteFiltersOptions.Builder()
		.gatewayId(connectGatewayId)
		.ifMatch(eTag)
		.importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
		.build();
  
	  // Invoke replaceGatewayImportRouteFilters() with a valid options model and verify the result
	  Response<ImportRouteFilterCollection> response = testService.replaceGatewayImportRouteFilters(replaceGatewayImportRouteFiltersOptionsModel).execute();
	  assertNotNull(response);
	  ImportRouteFilterCollection responseObj = response.getResult();
	  assertNotNull(responseObj);
	  int size = responseObj.getImportRouteFilters().size();
	  assert(size > 0); 
	  assertEquals(responseObj.getImportRouteFilters().get(0).getAction(), "permit");
	  assertEquals(responseObj.getImportRouteFilters().get(0).getPrefix(), "192.168.100.0/24");
	  assertEquals(responseObj.getImportRouteFilters().get(0).getGe(), Long.valueOf("25"));
	  assertEquals(responseObj.getImportRouteFilters().get(0).getLe(), Long.valueOf("30"));
	  importRFId = responseObj.getImportRouteFilters().get(0).getId();
	}

	@Test (dependsOnMethods = "testListGatewayImportRouteFilter")
  	public void testDeleteGatewayImportRouteFilter()  {

		// ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(connectGatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse responseObj = getGatewayResponse.getResult(); 
			assertNotNull(responseObj);

			if (responseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", responseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Construct an instance of the DeleteGatewayImportRouteFilterOptions model
		DeleteGatewayImportRouteFilterOptions deleteGatewayImportRouteFilterOptionsModel = new DeleteGatewayImportRouteFilterOptions.Builder()
		.gatewayId(connectGatewayId)
		.id(importRFId)
		.build();
  
	  // Invoke deleteGatewayImportRouteFilter() with a valid options model and verify the result
	  Response<Void> response = testService.deleteGatewayImportRouteFilter(deleteGatewayImportRouteFilterOptionsModel).execute();
	  assertNotNull(response);
	  Void responseObj = response.getResult();
	  assertNull(responseObj);
	}

	@Test (dependsOnMethods = "testDeleteGatewayImportRouteFilter")
	public void testRouteReports() throws InterruptedException  {
		assertNotNull(testService);

		String rrID = null;
		// **************** Create Route Report Instance
		CreateGatewayRouteReportOptions createGatewayRouteReportOptions = new CreateGatewayRouteReportOptions.Builder().gatewayId(connectGatewayId).build();
		Response<RouteReport> routeReportsResponse = testService.createGatewayRouteReport(createGatewayRouteReportOptions).execute();
		
		assertNotNull(routeReportsResponse);
		assertEquals(202, routeReportsResponse.getStatusCode());
		
		RouteReport rrCreateRespObj = routeReportsResponse.getResult();
		assertNotNull(rrCreateRespObj);
		assertNotNull(rrCreateRespObj.getId());
		assertNotNull(rrCreateRespObj.getGatewayRoutes());
		assertNotNull(rrCreateRespObj.getVirtualConnectionRoutes());
		assertNotEquals(rrCreateRespObj.getStatus(), "");
		assertNotEquals(rrCreateRespObj.getCreatedAt(), "");
		assertNotEquals(rrCreateRespObj.getUpdatedAt(), "");

		rrID = rrCreateRespObj.getId();

		// Wait for the Route report to be completed
		isRouteReportAvailable(connectGatewayId, rrID);

		// *********** Get Gateway Route Report
		GetGatewayRouteReportOptions getGatewayRouteReportOptions = new GetGatewayRouteReportOptions.Builder().gatewayId(connectGatewayId).id(rrID).build();
		Response<RouteReport> getRouteResponse = testService.getGatewayRouteReport(getGatewayRouteReportOptions).execute();
		assertNotNull(getRouteResponse);
		assertEquals(200, getRouteResponse.getStatusCode());

		RouteReport rrGetRespObj = getRouteResponse.getResult();
		assertNotNull(rrGetRespObj);
		assertEquals(rrGetRespObj.getId(), rrID);
		assertNotNull(rrGetRespObj.getGatewayRoutes());
		assertNotNull(rrGetRespObj.getVirtualConnectionRoutes());
		assertNotEquals(rrGetRespObj.getStatus(), "completed");
		assertNotEquals(rrGetRespObj.getCreatedAt(), "");
		assertNotEquals(rrGetRespObj.getUpdatedAt(), "");

		// ************ List Gateway Route Reports
		ListGatewayRouteReportsOptions listGatewayRouteReportsOptions = new ListGatewayRouteReportsOptions.Builder().gatewayId(connectGatewayId).build();
		Response<RouteReportCollection> listResponse = testService.listGatewayRouteReports(listGatewayRouteReportsOptions).execute();
		assertNotNull(listResponse);
		assertEquals(200, listResponse.getStatusCode());
		List<RouteReport> routeReports = listResponse.getResult().getRouteReports();
		assertNotEquals(0,routeReports.size());

		// Delete Gateway Route Reports
		DeleteGatewayRouteReportOptions deleteGatewayRouteReportOptions = new DeleteGatewayRouteReportOptions.Builder().gatewayId(connectGatewayId).id(rrID).build();
		Response<Void> delResponse = testService.deleteGatewayRouteReport(deleteGatewayRouteReportOptions).execute();
		assertNotNull(delResponse);
		assertEquals(204, delResponse.getStatusCode());

		checkRouteReportDeletion(getGatewayRouteReportOptions);
	}
   
	/**
	 * MACSec Gateway
	 */
	// Test setGatewayMacsec
	@Test(dependsOnMethods = "testConnectGatewayOptions")
	public void testSetGatewayMacsec() {
		// Construct an instance of the GatewayMacsecCakKeyReferenceHpcsCakKeyReference model
		GatewayMacsecCakKeyReferenceHpcsCakKeyReference hpcsCakKeyReferenceModel = new GatewayMacsecCakKeyReferenceHpcsCakKeyReference.Builder()
		.crn("crn:v1:staging:public:hs-crypto:us-south:a/3f455c4c574447adbc14bda52f80e62f:b2044455-b89e-4c57-96ae-3f17c092dd31:key:ebc0fbe6-fd7c-4971-b127-71a385c8f602")
		.build();
	
		// Construct an instance of the GatewayMacsecCakPrototype model
		GatewayMacsecCakPrototype gatewayMacsecCakPrototypeModel = new GatewayMacsecCakPrototype.Builder()
		.key(hpcsCakKeyReferenceModel)
		.name("AA01")
		.session("primary")
		.build();

		// Construct an instance of the SakRekeyPrototypeSakRekeyTimerModePrototype model
		SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeModel = new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder()
		.interval(Long.valueOf("76"))
		.mode("timer")
		.build();

		// Construct an instance of the SetGatewayMacsecOptions model
		SetGatewayMacsecOptions setGatewayMacsecOptionsModel = new SetGatewayMacsecOptions.Builder()
		.id(connectGatewayId)
		.active(true)
		.caks(java.util.Arrays.asList(gatewayMacsecCakPrototypeModel))
		.sakRekey(sakRekeyPrototypeModel)
		.securityPolicy("must_secure")
		.windowSize(Long.valueOf("522"))
		.build();

		// Invoke setGatewayMacsec() with a valid options model and verify the result
		Response<GatewayMacsec> gatewayMacsecResponse = testService.setGatewayMacsec(setGatewayMacsecOptionsModel).execute();
		assertNotNull(gatewayMacsecResponse);
		GatewayMacsec gatewayMacsecResponseObj = gatewayMacsecResponse.getResult();
		assertNotNull(gatewayMacsecResponseObj);
		assertEquals(true, gatewayMacsecResponseObj.isActive());
		assertEquals("must_secure", gatewayMacsecResponseObj.getSecurityPolicy());
		assertEquals("522", gatewayMacsecResponseObj.getWindowSize());
	}

	// Test getGatewayMacsec
	@Test(dependsOnMethods = "testSetGatewayMacsec")
	public void testGetGatewayMacsec() {
		// Construct an instance of the GetGatewayMacsecOptions model
		GetGatewayMacsecOptions getGatewayMacsecOptionsModel = new GetGatewayMacsecOptions.Builder()
			.id(connectGatewayId)
			.build();

		// Invoke getGatewayMacsec() with a valid options model and verify the result
		Response<GatewayMacsec> gatewayMacsecResponse = testService.getGatewayMacsec(getGatewayMacsecOptionsModel).execute();
		assertNotNull(gatewayMacsecResponse);
		GatewayMacsec gatewayMacsecResponseObj = gatewayMacsecResponse.getResult();
		assertNotNull(gatewayMacsecResponseObj);
		assertEquals(true, gatewayMacsecResponseObj.isActive());
		assertEquals("must_secure", gatewayMacsecResponseObj.getSecurityPolicy());
		assertEquals("522", gatewayMacsecResponseObj.getWindowSize());
	}

	// Test listGatewayMacsecCaks
	@Test(dependsOnMethods = "testSetGatewayMacsec")
	public void testListGatewayMacsecCaks() {
		// Construct an instance of the ListGatewayMacsecCaksOptions model
		ListGatewayMacsecCaksOptions listGatewayMacsecCaksOptionsModel = new ListGatewayMacsecCaksOptions.Builder()
		.id(connectGatewayId)
		.build();

		// Invoke listGatewayMacsecCaks() with a valid options model and verify the result
		Response<GatewayMacsecCakCollection> gatewayMacsecCollectionResponse = testService.listGatewayMacsecCaks(listGatewayMacsecCaksOptionsModel).execute();
		assertNotNull(gatewayMacsecCollectionResponse);
		GatewayMacsecCakCollection gatewayMacsecCollectionResponseObj = gatewayMacsecCollectionResponse.getResult();
		assertNotNull(gatewayMacsecCollectionResponseObj);
		assertEquals(1, gatewayMacsecCollectionResponseObj.getCaks().size());
	}

	// Test createGatewayMacsecCak
	@Test(dependsOnMethods = "testCreateGatewayMacsecCak")
	public void testCreateGatewayMacsecCak() {
		// Construct an instance of the GatewayMacsecCakKeyReferenceHpcsCakKeyReference model
		GatewayMacsecCakKeyReferenceHpcsCakKeyReference hpcsCakKeyReferenceModel = new GatewayMacsecCakKeyReferenceHpcsCakKeyReference.Builder()
		.crn("crn:v1:staging:public:hs-crypto:us-south:a/3f455c4c574447adbc14bda52f80e62f:b2044455-b89e-4c57-96ae-3f17c092dd31:key:6f79b964-229c-45ab-b1d9-47e111cd03f6")
		.build();

		// Construct an instance of the CreateGatewayMacsecCakOptions model
		CreateGatewayMacsecCakOptions createGatewayMacsecCakOptionsModel = new CreateGatewayMacsecCakOptions.Builder()
		.id(connectGatewayId)
		.key(hpcsCakKeyReferenceModel)
		.name("BB02")
		.session("fallback")
		.build();

		// Invoke createGatewayMacsecCak() with a valid options model and verify the result
		Response<GatewayMacsecCak> gatewayMacsecCakResponse = testService.createGatewayMacsecCak(createGatewayMacsecCakOptionsModel).execute();
		assertNotNull(gatewayMacsecCakResponse);
		GatewayMacsecCak gatewayMacsecCakResponseObj = gatewayMacsecCakResponse.getResult();
		assertNotNull(gatewayMacsecCakResponseObj);
		cakId = gatewayMacsecCakResponseObj.getId();
		assertNotNull(cakId);
		assertEquals("BB02", gatewayMacsecCakResponseObj.getName());
		assertEquals("fallback", gatewayMacsecCakResponseObj.getSession());
	}

	// Test getGatewayMacsecCak
	@Test(dependsOnMethods = "testCreateGatewayMacsecCak")
	public void testGetGatewayMacsecCak() {
		// Construct an instance of the GetGatewayMacsecCakOptions model
		GetGatewayMacsecCakOptions getGatewayMacsecCakOptionsModel = new GetGatewayMacsecCakOptions.Builder()
			.id(connectGatewayId)
			.cakId(cakId)
			.build();

		// Invoke getGatewayMacsecCak() with a valid options model and verify the result
		Response<GatewayMacsecCak> gatewayMacsecCakResponse = testService.getGatewayMacsecCak(getGatewayMacsecCakOptionsModel).execute();
		assertNotNull(gatewayMacsecCakResponse);
		GatewayMacsecCak gatewayMacsecCakResponseObj = gatewayMacsecCakResponse.getResult();
		assertNotNull(gatewayMacsecCakResponseObj);
		assertEquals(cakId, gatewayMacsecCakResponseObj.getId());
	}

	// Test updateGatewayMacsecCak
	@Test(dependsOnMethods = "testCreateGatewayMacsecCak")
	public void testUpdateGatewayMacsecCak() {
		// Construct an instance of the GatewayMacsecCakKeyReferenceHpcsCakKeyReference model
		GatewayMacsecCakKeyReferenceHpcsCakKeyReference hpcsCakKeyReferenceModel = new GatewayMacsecCakKeyReferenceHpcsCakKeyReference.Builder()
		.crn("crn:v1:staging:public:hs-crypto:us-south:a/3f455c4c574447adbc14bda52f80e62f:b2044455-b89e-4c57-96ae-3f17c092dd31:key:6f79b964-229c-45ab-b1d9-47e111cd03f6")
		.build();
	
		// Construct an instance of the GatewayMacsecCakPatch model
		GatewayMacsecCakPatch gatewayMacsecCakPatchModel = new GatewayMacsecCakPatch.Builder()
		.key(hpcsCakKeyReferenceModel)
		.name("AA02")
		.build();
		Map<String, Object> gatewayMacsecCakPatchModelAsPatch = gatewayMacsecCakPatchModel.asPatch();

		// Construct an instance of the UpdateGatewayMacsecCakOptions model
		UpdateGatewayMacsecCakOptions updateGatewayMacsecCakOptionsModel = new UpdateGatewayMacsecCakOptions.Builder()
		.id(connectGatewayId)
		.cakId(cakId)
		.gatewayMacsecCakPatch(gatewayMacsecCakPatchModelAsPatch)
		.build();

		// Invoke updateGatewayMacsecCak() with a valid options model and verify the result
		Response<GatewayMacsecCak> gatewayMacsecCakResponse = testService.updateGatewayMacsecCak(updateGatewayMacsecCakOptionsModel).execute();
		assertNotNull(gatewayMacsecCakResponse);
		GatewayMacsecCak gatewayMacsecCakResponseObj = gatewayMacsecCakResponse.getResult();
		assertNotNull(gatewayMacsecCakResponseObj);
		assertEquals("AA02", gatewayMacsecCakResponseObj.getName());
	}

	// Test deleteGatewayMacsecCak
	@Test(dependsOnMethods = "testUpdateGatewayMacsecCak")
	public void testDeleteGatewayMacsecCak() {
		// Construct an instance of the DeleteGatewayMacsecCakOptions model
		DeleteGatewayMacsecCakOptions deleteGatewayMacsecCakOptionsModel = new DeleteGatewayMacsecCakOptions.Builder()
		.id(connectGatewayId)
		.cakId(cakId)
		.build();

		// Invoke deleteGatewayMacsecCak() with a valid options model and verify the result
		Response<Void> response = testService.deleteGatewayMacsecCak(deleteGatewayMacsecCakOptionsModel).execute();
		assertNotNull(response);
		assertNull(response.getResult());
		assertEquals(204, response.getStatusCode());
	}

	// Test updateGatewayMacsec
	@Test(dependsOnMethods = "testGetGatewayMacsec")
	public void testUpdateGatewayMacsec() {
		// Construct an instance of the SakRekeyPatchSakRekeyTimerModePatch model
		SakRekeyPatchSakRekeyTimerModePatch sakRekeyPatchModel = new SakRekeyPatchSakRekeyTimerModePatch.Builder()
		.interval(Long.valueOf("3601"))
		.mode("timer")
		.build();

		// Construct an instance of the GatewayMacsecPatch model
		GatewayMacsecPatch gatewayMacsecPatchModel = new GatewayMacsecPatch.Builder()
		.active(true)
		.sakRekey(sakRekeyPatchModel)
		.securityPolicy("must_secure")
		.windowSize(Long.valueOf("74"))
		.build();
		Map<String, Object> gatewayMacsecPatchModelAsPatch = gatewayMacsecPatchModel.asPatch();

		// Construct an instance of the UpdateGatewayMacsecOptions model
		UpdateGatewayMacsecOptions updateGatewayMacsecOptionsModel = new UpdateGatewayMacsecOptions.Builder()
		.id(connectGatewayId)
		.gatewayMacsecPatch(gatewayMacsecPatchModelAsPatch)
		.build();

		// Invoke updateGatewayMacsec() with a valid options model and verify the result
		Response<GatewayMacsec> gatewayMacsecResponse = testService.updateGatewayMacsec(updateGatewayMacsecOptionsModel).execute();
		assertNotNull(gatewayMacsecResponse);
		GatewayMacsec gatewayMacsecResponseObj = gatewayMacsecResponse.getResult();
		assertNotNull(gatewayMacsecResponseObj);
		assertEquals("must_secure", gatewayMacsecResponseObj.getSecurityPolicy());
		assertEquals("74", gatewayMacsecResponseObj.getWindowSize());
	}

	// Test unsetGatewayMacsec
	@Test(dependsOnMethods = "testUpdateGatewayMacsec")
	public void testUnsetGatewayMacsec() {
		// Construct an instance of the UnsetGatewayMacsecOptions model
		UnsetGatewayMacsecOptions unsetGatewayMacsecOptionsModel = new UnsetGatewayMacsecOptions.Builder()
		.id(connectGatewayId)
		.build();

		// Invoke unsetGatewayMacsec() with a valid options model and verify the result
		Response<Void> response = testService.unsetGatewayMacsec(unsetGatewayMacsecOptionsModel).execute();
		assertNotNull(response);
		assertNull(response.getResult());
		assertEquals(204, response.getStatusCode());
	}

	// @Test (dependsOnMethods = "testCompletionNotice")
	public void testOfferings() {
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");// "dal09";//read this from env file

		// ***************** Attempt to list dedicated offering types  **********************
		// Construct an instance of the ListOfferingTypeLocationsOptions model for dedicated GWs
		ListOfferingTypeLocationsOptions listOfferingTypeLocationsOptionsModel = new ListOfferingTypeLocationsOptions.Builder()
				.offeringType("dedicated").build();

		// Invoke operation with valid options model (positive test)
		Response<LocationCollection> response = testService
				.listOfferingTypeLocations(listOfferingTypeLocationsOptionsModel).execute();
		assertNotNull(response);
		assertEquals(200, response.getStatusCode());

		LocationCollection responseObj = response.getResult();
		assertNotNull(responseObj);
		assertNotEquals(0,responseObj.getLocations().size());

		// ***************** Attempt to list connect offering types  **********************
		// Construct an instance of the ListOfferingTypeLocationsOptions model for connect GWs
		listOfferingTypeLocationsOptionsModel = new ListOfferingTypeLocationsOptions.Builder()
			.offeringType("connect").build();

		// Invoke operation with valid options model (positive test)
	 	response = testService
			.listOfferingTypeLocations(listOfferingTypeLocationsOptionsModel).execute();
		assertNotNull(response);
		assertEquals(200, response.getStatusCode());

		responseObj = response.getResult();
		assertNotNull(responseObj);
		assertNotEquals(0,responseObj.getLocations().size());

		// ***************** Attempt to list cross connect routers  **********************
		// Construct an instance of the
		// ListOfferingTypeLocationCrossConnectRoutersOptions model
		ListOfferingTypeLocationCrossConnectRoutersOptions listOfferingTypeLocationCrossConnectRoutersOptionsModel = new ListOfferingTypeLocationCrossConnectRoutersOptions.Builder()
				.offeringType("dedicated").locationName(locationName).build();

		// Invoke operation with valid options model (positive test)
		Response<LocationCrossConnectRouterCollection> routerResponse = testService
				.listOfferingTypeLocationCrossConnectRouters(listOfferingTypeLocationCrossConnectRoutersOptionsModel)
				.execute();
		assertNotNull(routerResponse);
		assertEquals(200, routerResponse.getStatusCode());
		LocationCrossConnectRouterCollection routerResponseObj = routerResponse.getResult();
		assertNotNull(routerResponseObj);
		assertNotEquals(0,routerResponseObj.getCrossConnectRouters().size());

		// ***************** Attempt to list dedicated offering speeds  **********************
		// Construct an instance of the ListOfferingTypeSpeedsOptions model
		ListOfferingTypeSpeedsOptions listOfferingTypeSpeedsOptionsModel = new ListOfferingTypeSpeedsOptions.Builder()
				.offeringType("dedicated").build();

		// Invoke operation with valid options model (positive test)
		Response<OfferingSpeedCollection> res = testService.listOfferingTypeSpeeds(listOfferingTypeSpeedsOptionsModel)
				.execute();
		assertNotNull(res);
		assertEquals(200, response.getStatusCode());
		OfferingSpeedCollection resObj = res.getResult();
		assertNotNull(resObj);
		assertNotEquals(0,resObj.getSpeeds().size());
		List<OfferingSpeed> speeds = resObj.getSpeeds();
		assertNotNull(speeds.get(0).getCapabilities());

		// ***************** Attempt to list connect offering speeds  **********************
		// Construct an instance of the ListOfferingTypeSpeedsOptions model
		listOfferingTypeSpeedsOptionsModel = new ListOfferingTypeSpeedsOptions.Builder()
			.offeringType("connect").build();

		// Invoke operation with valid options model (positive test)
		res = testService.listOfferingTypeSpeeds(listOfferingTypeSpeedsOptionsModel).execute();
		assertNotNull(res);
		assertEquals(200, response.getStatusCode());
		resObj = res.getResult();
		assertNotNull(resObj);
		assertNotEquals(0,resObj.getSpeeds().size());
	}

	@Test()
	public void testDirectLinkGatewayWithMD5(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime();
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");
		Long bgpAsn = 64999L;
		String bgpBaseCidr = "169.254.0.0/16";
		String crossConnectRouter = "LAB-xcr01.dal09";
		boolean global = true;
		Long speedMbps = 1000L;
		boolean metered = false;
		String carrierName = "carrier1";
		String customerName = "customer1";
		String gatewayType = "dedicated";

		// The AUTHENTICATION_KEY config value holds the CRN for the key (HPCS, Key Protect, or Secrets Manager).
		// The same config key is reused for all key types; the CRN format identifies the service.
		String authenticationCRN = config.get("AUTHENTICATION_KEY");

		// ***************** Test 1: HPCS / Key Protect authentication key ********************* //
		String gatewayName = "JAVA-INT-SDK-DEDICATED-MD5-"+timestamp;

		// Build the authentication key identity using the HPCS subclass
		AuthenticationKeyIdentityHpcsAuthenticationKeyIdentity authKey =
			new AuthenticationKeyIdentityHpcsAuthenticationKeyIdentity.Builder(authenticationCRN).build();

		GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
			.bgpAsn(bgpAsn).bgpBaseCidr(bgpBaseCidr).bgpCerCidr("10.254.30.86/30").bgpIbmCidr("10.254.30.85/30")
			.global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
			.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName)
			.locationName(locationName).authenticationKey(authKey).build();

		// Construct an instance of the CreateGatewayOptions model
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();

		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
		assertNotNull(response);
		assertEquals(201, response.getStatusCode());

		Gateway responseObj = response.getResult();
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		assertEquals(responseObj.getAuthenticationKey().getCrn(), authenticationCRN);

		// save gw id for clean up routine if we terminate
		gatewayId = responseObj.getId();

		// ********** Clear the HPCS authentication key using Patch gateway *************
		// Construct an instance of the GatewayPatchTemplate model with null authenticationKey to clear it
		GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder().build();
		Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		// Explicitly set authentication_key to null in the patch map to clear it
		gatewayPatchTemplateModelAsPatch.put("authentication_key", null);

		UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
			.id(responseObj.getId())
			.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();

		// Invoke operation with valid options model (positive test)
		Response<Gateway> updateResponse = testService.updateGateway(updateGatewayOptionsModel).execute();
		assertNotNull(updateResponse);
		assertEquals(200, updateResponse.getStatusCode());

		Gateway updateResponseObj = updateResponse.getResult();
		assertNotNull(updateResponseObj);
		assertEquals(updateResponseObj.getId(), gatewayId);
		assertNull(updateResponseObj.getAuthenticationKey());
		assertEquals(updateResponseObj.getName(), gatewayName);

		// Delete the dedicated GW
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId).build();

		// Invoke operation with valid options model (positive test)
		Response<Void> Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse);
		assertEquals(204, Delresponse.getStatusCode());

		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null.
		assertNull(delResponseObj);

		gatewayId = null; // already cleaned up

		// ***************** Test 2: Secrets Manager authentication key ********************* //
		// Reuses the same AUTHENTICATION_KEY config value - the CRN format identifies the key service type.
		String gatewayNameSM = "JAVA-INT-SDK-DEDICATED-MD5-SM-"+timestamp;

		// Build the authentication key identity using the Secrets Manager subclass
		AuthenticationKeyIdentitySecretsManagerAuthenticationKeyIdentity smAuthKey =
			new AuthenticationKeyIdentitySecretsManagerAuthenticationKeyIdentity.Builder(authenticationCRN).build();

		GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateSMModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
			.bgpAsn(bgpAsn).bgpBaseCidr(bgpBaseCidr).bgpCerCidr("10.254.30.90/30").bgpIbmCidr("10.254.30.89/30")
			.global(global).metered(metered).name(gatewayNameSM).speedMbps(speedMbps).type(gatewayType)
			.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName)
			.locationName(locationName).authenticationKey(smAuthKey).build();

		// Construct an instance of the CreateGatewayOptions model
		CreateGatewayOptions createGatewayOptionsSMModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateSMModel).build();

		// Invoke operation with valid options model (positive test)
		Response<Gateway> smResponse = testService.createGateway(createGatewayOptionsSMModel).execute();
		assertNotNull(smResponse);
		assertEquals(201, smResponse.getStatusCode());

		Gateway smResponseObj = smResponse.getResult();
		assertNotNull(smResponseObj);
		assertEquals(smResponseObj.getName(), gatewayNameSM);
		assertEquals(smResponseObj.getAuthenticationKey().getCrn(), authenticationCRN);

		// save gw id for clean up routine if we terminate
		gatewayId = smResponseObj.getId();

		// ********** Clear the Secrets Manager authentication key using Patch gateway *************
		// Construct an instance of the GatewayPatchTemplate model with null authenticationKey to clear it
		GatewayPatchTemplate smGatewayPatchTemplateModel = new GatewayPatchTemplate.Builder().build();
		Map<String, Object> smGatewayPatchTemplateModelAsPatch = smGatewayPatchTemplateModel.asPatch();
		// Explicitly set authentication_key to null in the patch map to clear it
		smGatewayPatchTemplateModelAsPatch.put("authentication_key", null);

		UpdateGatewayOptions smUpdateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
			.id(smResponseObj.getId())
			.gatewayPatchTemplatePatch(smGatewayPatchTemplateModelAsPatch).build();

		// Invoke operation with valid options model (positive test)
		Response<Gateway> smUpdateResponse = testService.updateGateway(smUpdateGatewayOptionsModel).execute();
		assertNotNull(smUpdateResponse);
		assertEquals(200, smUpdateResponse.getStatusCode());

		Gateway smUpdateResponseObj = smUpdateResponse.getResult();
		assertNotNull(smUpdateResponseObj);
		assertEquals(smUpdateResponseObj.getId(), gatewayId);
		assertNull(smUpdateResponseObj.getAuthenticationKey());
		assertEquals(smUpdateResponseObj.getName(), gatewayNameSM);

		// Delete the dedicated GW
		DeleteGatewayOptions smDeleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId).build();

		// Invoke operation with valid options model (positive test)
		Response<Void> smDelresponse = testService.deleteGateway(smDeleteGatewayOptionsModel).execute();
		assertNotNull(smDelresponse);
		assertEquals(204, smDelresponse.getStatusCode());

		Void smDelResponseObj = smDelresponse.getResult(); // Response does not have a return type. Check that the result is null.
		assertNull(smDelResponseObj);

		gatewayId = null; // already cleaned up
	}
	
	@Test()
	public void testDirectLinkDedicatedGatewayWithConnectionMode(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");
		String gatewayName = "JAVA-INT-SDK-DEDICATED-DLAAS-"+timestamp; 
		Long bgpAsn = 64999L; 
		String crossConnectRouter = "LAB-xcr01.dal09";
		boolean global = true; 
		Long speedMbps = 1000L; 
		boolean metered = false; 
		String carrierName = "carrier1"; 
		String customerName = "customer1"; 
		String gatewayType = "dedicated";
		String connectionMode = "direct";

	  
		GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
			.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
			.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName) 
			.locationName(locationName).connectionMode(connectionMode).build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		assertEquals(responseObj.getConnectionMode(), connectionMode);
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();
	  
		// ********** Update the connection mode using Patch gateway ************* 
		// Construct an instance of the GatewayPatchTemplate model
		GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.connectionMode("transit").build();
		// convert to map asPatch
		Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		// Construct an instance of the UpdateGatewayOptions model 
		UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
			.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
			
		// Invoke operation with valid options model (positive test) 
		Response<Gateway> updateResponse =	testService.updateGateway(updateGatewayOptionsModel).execute();
		assertNotNull(updateResponse); 
		assertEquals(200, updateResponse.getStatusCode());
	  
		Gateway updateResponseObj = updateResponse.getResult();
		assertNotNull(updateResponseObj);
		assertEquals(updateResponseObj.getId(), gatewayId);
		assertEquals(updateResponseObj.getName(), gatewayName);
		assertEquals(updateResponseObj.getConnectionMode(), "transit");

		// Delete the dedicated GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);
	  
	  	gatewayId = null; // already cleaned up System.out.

	}
	
	@Test(dependsOnMethods = "testPorts")
	public void testDirectLinkConnectGatewayWithConnectionMode(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String gatewayName = "JAVA-INT-SDK-CONNECT-DLAAS-"+timestamp; 
		Long bgpAsn = 64999L;
		Long speedMbps = 1000L;
		boolean metered = false;
		boolean global = false;
		String gatewayType = "connect";
		String bgpBaseCidr = "169.254.0.0/16";

		GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder().id(firstPortId).build();
		GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
				.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
				.port(gatewayPortIdentityModel).bgpBaseCidr(bgpBaseCidr).connectionMode("direct").build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		assertEquals(responseObj.getConnectionMode(), "direct");
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();

		  // ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(gatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}
	  
		// ********** Update the connection mode using Patch gateway ************* 
		// Construct an instance of the GatewayPatchTemplate model
		GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.connectionMode("transit").build();
		// convert to map asPatch
		Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		// Construct an instance of the UpdateGatewayOptions model 
		UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
			.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
			
		// Invoke operation with valid options model (positive test) 
		Response<Gateway> updateResponse =	testService.updateGateway(updateGatewayOptionsModel).execute();
		assertNotNull(updateResponse); 
		assertEquals(200, updateResponse.getStatusCode());
	  
		Gateway updateResponseObj = updateResponse.getResult();
		assertNotNull(updateResponseObj);
		assertEquals(updateResponseObj.getId(), gatewayId);
		assertEquals(updateResponseObj.getName(), gatewayName);
		assertEquals(updateResponseObj.getConnectionMode(), "transit");


		// ********** Get the connect just created and wait for it to move to provisioned state *************
		getGatewayOptionsModel = new GetGatewayOptions.Builder().id(gatewayId).build();

		done = false;
		timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Delete the dedicated GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);
	  
	  	gatewayId = null; // already cleaned up System.out.
	}

	@Test()
	public void testDirectLinkDedicatedGatewayWithBgpIp(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");
		String gatewayName = "JAVA-INT-SDK-DEDICATED-BGP-IP-"+timestamp; 
		Long bgpAsn = 64999L; 
		String crossConnectRouter = "LAB-xcr01.dal09";
		boolean global = true; 
		Long speedMbps = 1000L; 
		boolean metered = false; 
		String carrierName = "carrier1"; 
		String customerName = "customer1"; 
		String gatewayType = "dedicated";

	  
		GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
			.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
			.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName) 
			.locationName(locationName).build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();
	  
		// ********** Update the BGP ASN mode using Patch gateway *************
		long updatedBgpAsn = 63999L;
		GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.bgpAsn(updatedBgpAsn).build();
		Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
			.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
			
		Response<Gateway> updateResponse =	testService.updateGateway(updateGatewayOptionsModel).execute();
		assertNotNull(updateResponse); 
		assertEquals(200, updateResponse.getStatusCode());
	  
		Gateway updateResponseObj = updateResponse.getResult();
		assertNotNull(updateResponseObj);
		assertEquals(updateResponseObj.getId(), gatewayId);
		assertEquals(updateResponseObj.getName(), gatewayName);
		assertEquals(updateResponseObj.getBgpAsn().longValue(), updatedBgpAsn);
		
		// ********** Update the BGP IBM and CER CIDR mode using Patch gateway ************* 
		try { 
			gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
				.bgpCerCidr("172.17.252.2/29").bgpIbmCidr("172.17.252.1/29").build();
			gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
			updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
				.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
		
			updateResponse = testService.updateGateway(updateGatewayOptionsModel).execute();
			assertNotNull(updateResponse); 
			assertEquals(200, updateResponse.getStatusCode());
		
			updateResponseObj = updateResponse.getResult();
			assertNotNull(updateResponseObj);
			assertEquals(updateResponseObj.getId(), gatewayId);
			assertEquals(updateResponseObj.getName(), gatewayName);
			assertEquals(updateResponseObj.getBgpCerCidr(), "172.17.252.2/29");
			assertEquals(updateResponseObj.getBgpIbmCidr(), "172.17.252.1/29");
		} catch (com.ibm.cloud.sdk.core.service.exception.BadRequestException errResponse) {
			assertEquals(errResponse.getStatusCode(), 400);
			assertEquals(errResponse.getMessage(), "Please make sure localIP and remoteIP are not in use");
		}

		// Delete the dedicated GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);
	  
	  	gatewayId = null; // already cleaned up System.out.
	}

	public void testDirectLinkConnectGatewayWithBgpIp(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String gatewayName = "JAVA-INT-SDK-CONNECT-BGP-IP-"+timestamp; 
		Long bgpAsn = 64999L;
		Long speedMbps = 1000L;
		boolean metered = false;
		boolean global = false;
		String gatewayType = "connect";

		GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder().id(firstPortId).build();
		GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
				.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
				.port(gatewayPortIdentityModel).build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();

		  // ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(gatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}
	  
		// ********** Update the BGP IBM and CER CIDR mode using Patch gateway ************* 
		// Construct an instance of the UpdateGatewayOptions model 
		try { 
			long updatedBgpAsn = 63999L;
			GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
				.bgpAsn(updatedBgpAsn).bgpCerCidr("172.17.252.2/29").bgpIbmCidr("172.17.252.1/29").build();
			Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
			UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
				.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
		
			Response<Gateway> updateResponse = testService.updateGateway(updateGatewayOptionsModel).execute();
			assertNotNull(updateResponse); 
			assertEquals(200, updateResponse.getStatusCode());
		
			Gateway updateResponseObj = updateResponse.getResult();
			assertNotNull(updateResponseObj);
			assertEquals(updateResponseObj.getId(), gatewayId);
			assertEquals(updateResponseObj.getName(), gatewayName);
			assertEquals(updateResponseObj.getBgpAsn().longValue(), updatedBgpAsn);
			assertEquals(updateResponseObj.getBgpCerCidr(), "172.17.252.2/29");
			assertEquals(updateResponseObj.getBgpIbmCidr(), "172.17.252.1/29");
		} catch (com.ibm.cloud.sdk.core.service.exception.BadRequestException errResponse) {
			assertEquals(errResponse.getStatusCode(), 400);
			assertEquals(errResponse.getMessage(), "Please make sure localIP and remoteIP are not in use");
		}


		// ********** Get the connect just created and wait for it to move to provisioned state *************
		getGatewayOptionsModel = new GetGatewayOptions.Builder().id(gatewayId).build();

		done = false;
		timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Delete the dedicated GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);

	  	gatewayId = null; // already cleaned up System.out.
	}

	public void testDirectLinkDedicatedGatewayWithBfd(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");
		String gatewayName = "JAVA-INT-SDK-DEDICATED-BFD-"+timestamp; 
		Long bgpAsn = 64999L; 
		String crossConnectRouter =	"LAB-xcr01.dal09"; 
		boolean global = true; 
		Long speedMbps = 1000L; 
		boolean metered = false; 
		String carrierName = "carrier1"; 
		String customerName = "customer1";
		String gatewayType = Gateway.Type.DEDICATED;

		Long bfdInterval = 300L;
		Long bfdMultiplier = 1L;
 
		GatewayBfdConfigTemplate bfdConfig = new GatewayBfdConfigTemplate.Builder().interval(bfdInterval).multiplier(bfdMultiplier).build();

		GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
			.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
			.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName) 
			.locationName(locationName).bfdConfig(bfdConfig).build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		assertEquals(responseObj.getBfdConfig().getInterval(), bfdInterval);
		assertEquals(responseObj.getBfdConfig().getMultiplier(), bfdMultiplier);
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();
	  
		// ********** Update the BFD parameters using Patch gateway *************
		Long updatedBfdInterval = 1000L;
		Long updatedBfdMultiplier = 200L;

		GatewayBfdPatchTemplate upadtedBfdConfig = new GatewayBfdPatchTemplate.Builder().interval(updatedBfdInterval).multiplier(updatedBfdMultiplier).build();		
		GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
			.bfdConfig(upadtedBfdConfig).build();
		Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
		UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
			.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
			
		Response<Gateway> updateResponse =	testService.updateGateway(updateGatewayOptionsModel).execute();
		assertNotNull(updateResponse); 
		assertEquals(200, updateResponse.getStatusCode());
	  
		Gateway updateResponseObj = updateResponse.getResult();
		assertNotNull(updateResponseObj);
		assertEquals(updateResponseObj.getId(), gatewayId);
		assertEquals(updateResponseObj.getName(), gatewayName);
		assertEquals(updateResponseObj.getBfdConfig().getInterval(), updatedBfdInterval);
		assertEquals(updateResponseObj.getBfdConfig().getMultiplier(), updatedBfdMultiplier);

		// Delete the dedicated GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);
	  
	  	gatewayId = null; // already cleaned up System.out.
	}

	public void testDirectLinkConnectGatewayWithBfd(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String gatewayName = "JAVA-INT-SDK-CONNECT-BFD-"+timestamp; 
		Long bgpAsn = 64999L;
		Long speedMbps = 1000L;
		boolean metered = false;
		boolean global = false;
		String gatewayType = Gateway.Type.CONNECT;

		Long bfdInterval = 300L;
		Long bfdMultiplier = 1L;
 
		GatewayBfdConfigTemplate bfdConfig = new GatewayBfdConfigTemplate.Builder().interval(bfdInterval).multiplier(bfdMultiplier).build();

		GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder().id(firstPortId).build();
		GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
				.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
				.port(gatewayPortIdentityModel).bfdConfig(bfdConfig).build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();

		  // ********** Get the connect just created and wait for it to move to provisioned state *************
		GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder().id(gatewayId).build();

		boolean done = false;
		int timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}
	  
		// ********** Update the BFD paramters using Patch gateway ************* 
		// Construct an instance of the UpdateGatewayOptions model 
		try { 
			Long updatedBfdInterval = 300L;
			Long updatedBfdMultiplier = 1L;
 
			GatewayBfdPatchTemplate updatedBfdConfig = new GatewayBfdPatchTemplate.Builder().interval(updatedBfdInterval).multiplier(updatedBfdMultiplier).build();
			GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
				.bfdConfig(updatedBfdConfig).build();
			Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();
			UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder().id(responseObj.getId())
				.gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch).build();
		
			Response<Gateway> updateResponse = testService.updateGateway(updateGatewayOptionsModel).execute();
			assertNotNull(updateResponse); 
			assertEquals(200, updateResponse.getStatusCode());
		
			Gateway updateResponseObj = updateResponse.getResult();
			assertNotNull(updateResponseObj);
			assertEquals(updateResponseObj.getId(), gatewayId);
			assertEquals(updateResponseObj.getName(), gatewayName);
			assertEquals(updateResponseObj.getBfdConfig().getInterval(), updatedBfdInterval);
			assertEquals(updateResponseObj.getBfdConfig().getMultiplier(), updatedBfdMultiplier);
		} catch (com.ibm.cloud.sdk.core.service.exception.BadRequestException errResponse) {
			assertEquals(errResponse.getStatusCode(), 400);
			assertEquals(errResponse.getMessage(), "Please make sure localIP and remoteIP are not in use");
		}


		// ********** Get the connect just created and wait for it to move to provisioned state *************
		getGatewayOptionsModel = new GetGatewayOptions.Builder().id(gatewayId).build();

		done = false;
		timerCount = 1;

		while (!done) {
			// Invoke operation with valid options model (positive test)
			Response<GetGatewayResponse> getGatewayResponse = testService.getGateway(getGatewayOptionsModel).execute();
			assertNotNull(getGatewayResponse);
			assertEquals(200, getGatewayResponse.getStatusCode());

			GetGatewayResponse getGatewayResponseObj = getGatewayResponse.getResult();
			assertNotNull(getGatewayResponseObj);

			if (getGatewayResponseObj.getOperationalStatus().equals("provisioned")) {
				done = true;
				break;
			} else if (timerCount > 40) {
				assertEquals("provisioned", getGatewayResponseObj.getOperationalStatus());
				done = true;
			} else {
				++timerCount;
				try {
					Thread.sleep(10000);	// 2 minute wait 3sec x 40 attempts
				} catch (InterruptedException e) {
					// 
				}
			}
		}

		// Delete the connect GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);

	  	gatewayId = null; // already cleaned up System.out.
	}

	public void testDirectLinkDedicatedGatewayGatewayStatus(){
		Long timestamp = new Timestamp(System.currentTimeMillis()).getTime(); 
		assertNotNull(testService);
		String locationName = config.get("LOCATION_NAME");
		String gatewayName = "JAVA-INT-SDK-DEDICATED-GW-STATUS-"+timestamp; 
		Long bgpAsn = 64999L; 
		String crossConnectRouter =	"LAB-xcr01.dal09"; 
		boolean global = true; 
		Long speedMbps = 1000L; 
		boolean metered = false; 
		String carrierName = "carrier1"; 
		String customerName = "customer1";
		String gatewayType = Gateway.Type.DEDICATED;

		Long bfdInterval = 300L;
		Long bfdMultiplier = 1L;
 
		GatewayBfdConfigTemplate bfdConfig = new GatewayBfdConfigTemplate.Builder().interval(bfdInterval).multiplier(bfdMultiplier).build();

		GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
			.bgpAsn(bgpAsn).global(global).metered(metered).name(gatewayName).speedMbps(speedMbps).type(gatewayType)
			.carrierName(carrierName).crossConnectRouter(crossConnectRouter).customerName(customerName) 
			.locationName(locationName).bfdConfig(bfdConfig).build();
	  
	  	// ***************** Create dedicated Gateway ********************* //
		// Construct an instance of the CreateGatewayOptions model 
		CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder().gatewayTemplate(gatewayTemplateModel).build();
	  
		// Invoke operation with valid options model (positive test)
		Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
			assertNotNull(response); 
			assertEquals(201, 
			response.getStatusCode());
	  
		Gateway responseObj = response.getResult(); 
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), gatewayName);
		assertEquals(responseObj.getBfdConfig().getInterval(), bfdInterval);
		assertEquals(responseObj.getBfdConfig().getMultiplier(), bfdMultiplier);
		
		// save gw id for clean up routine if we terminate
	  	gatewayId = responseObj.getId();
	  
		// ********** Get GW Status of the GW using status API *************
		GetGatewayStatusOptions getGatewayStatusOptions = new GetGatewayStatusOptions.Builder(gatewayId).type("link").build();

		Response<GatewayStatusCollection> gatewayStatusResponse = testService.getGatewayStatus(getGatewayStatusOptions).execute(); 
		assertNotNull(response); 
		assertEquals(200, gatewayStatusResponse.getStatusCode());

		GatewayStatusCollection listStatusObj = gatewayStatusResponse.getResult();
		assertNotNull(listStatusObj);
		assertNotEquals(0,listStatusObj.getStatus().size());
		assertEquals(listStatusObj.getStatus().get(0).getType(), "link");
		assertNotNull(listStatusObj.getStatus().get(0).getValue());
		assertNotNull(listStatusObj.getStatus().get(0).getUpdatedAt());

		// Delete the dedicated GW 
		DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder().id(gatewayId) .build(); 
			
		//  Invoke operation with valid options model (positive test) 
		Response<Void>  Delresponse = testService.deleteGateway(deleteGatewayOptionsModel).execute();
		assertNotNull(Delresponse); 
		assertEquals(204, Delresponse.getStatusCode());
		
		Void delResponseObj = Delresponse.getResult(); // Response does not have a return type. Check that the result is null. 
		assertNull(delResponseObj);
	  
	  	gatewayId = null; // already cleaned up System.out.
	}

}
