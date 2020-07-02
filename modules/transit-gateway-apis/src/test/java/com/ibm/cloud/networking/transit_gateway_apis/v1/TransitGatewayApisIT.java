/**
 * 
 */
package com.ibm.cloud.networking.transit_gateway_apis.v1;



import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.Date;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.NotFoundException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;



/**
 * @author pinkybhargava
 *
 */
public class TransitGatewayApisIT extends SdkIntegrationTestBase{
	
	TransitGatewayApis testService;
	Map<String, String> config = null;
	/**
	 * This method provides our config filename to the base class.
	 */
	public String getConfigFilename() {
		return "../../transit.env";
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
		// set mock values for global params

		final String serviceName = "tg_services";

		// Load up the config properties for this service.
        config = CredentialUtils.getServiceProperties(serviceName);

		// set mock values for global params
		Date version;
		try {
			version = new Date();
			testService = TransitGatewayApis.newInstance(version, serviceName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTransitGatewayOptions() throws InterruptedException {
		assertNotNull(testService);
		String locationName = config.get("LOCATION");
		String name = config.get("GW_NAME");
	    // Construct an instance of the CreateTransitGatewayOptions model
		CreateTransitGatewayOptions createTransitGatewayOptionsModel = new CreateTransitGatewayOptions.Builder(locationName, name)
		.build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> response = testService.createTransitGateway(createTransitGatewayOptionsModel).execute();
	    assertNotNull(response);
	    TransitGateway responseObj = response.getResult();
		assertNotNull(responseObj);
		assertEquals(responseObj.getName(), name);
		assertEquals(responseObj.getLocation(), locationName);
	    String tgGatewayId = responseObj.getId();

	    // Gateway creation might not be instantaneous.  Poll the Gateway looking for 'available' status.  Fail after 2 min
		int timer = 0;
		while(true) {
			// Construct an instance of the DetailTransitGatewayOptions model
			DetailTransitGatewayOptions detailTransitGatewayOptionsModel = new DetailTransitGatewayOptions.Builder()
			.id(tgGatewayId)
			.build();

			// Invoke operation with valid options model (positive test)
			Response<TransitGateway> resp = testService.detailTransitGateway(detailTransitGatewayOptionsModel).execute();
			assertNotNull(resp);
			TransitGateway respObj = resp.getResult();
			assertNotNull(respObj);

			if("available".equals(respObj.getStatus())){
				break;
			}// other than available, see if we have reached the timeout value.  If so, exit with failure
			if(timer > 24) { // 2 min timer (24x5sec)
				assertEquals("available",respObj.getStatus());// timed out fail if status is not available
				break;
			} else {
				// Still exists, wait 5 sec
				Thread.sleep(5000);
				timer = timer + 1;
			}
		}

		// Construct an instance of the ListTransitGatewaysOptions model
		ListTransitGatewaysOptions listTransitGatewaysOptionsModel = new ListTransitGatewaysOptions();
	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayCollection> res = testService.listTransitGateways(listTransitGatewaysOptionsModel).execute();
	    assertNotNull(res);
	    TransitGatewayCollection resObj = res.getResult();
	    assertNotNull(resObj);
		assertNotNull(resObj.getTransitGateways());
		
	   	// Construct an instance of the UpdateTransitGatewayOptions model
		String gatewayNameUpdate = "Test-Java-SDK-INT-TG-PATCH";
	    UpdateTransitGatewayOptions updateTransitGatewayOptionsModel = new UpdateTransitGatewayOptions.Builder()
	    .id(tgGatewayId)
	    .name(gatewayNameUpdate)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> updateResp = testService.updateTransitGateway(updateTransitGatewayOptionsModel).execute();
	    assertNotNull(updateResp);
	    TransitGateway updateRespObj = updateResp.getResult();
	    assertNotNull(updateRespObj);
		assertEquals(updateRespObj.getName(), gatewayNameUpdate);
		
	  	// Construct an instance of the DetailTransitGatewayOptions model
	    DetailTransitGatewayOptions detailTransitGatewayOptionsModel = new DetailTransitGatewayOptions.Builder()
	    .id(tgGatewayId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> resp = testService.detailTransitGateway(detailTransitGatewayOptionsModel).execute();
	    assertNotNull(resp);
	    TransitGateway respObj = resp.getResult();
	    assertNotNull(respObj);
		assertEquals(respObj.getId(), tgGatewayId);

	   	// Construct an instance of the CreateTransitGatewayConnectionOptions model
	 	String crn = config.get("VPC_CRN");
		String connectionName = "Test-Java-SDK-INT-TG-CONN";
		String connectionNetworkType = "vpc";
	    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(tgGatewayId)
	    .networkType(connectionNetworkType)
	    .name(connectionName)
	    .networkId(crn)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> createResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(createResp);
	    TransitGatewayConnectionCust createRespObj = createResp.getResult();
	    assertNotNull(createRespObj);
		assertNotNull(createRespObj.getId());
		assertEquals(createRespObj.getName(), connectionName);
		assertEquals(createRespObj.getNetworkId(), crn);
		assertEquals(createRespObj.getNetworkType(), connectionNetworkType);
	    String tgConnId=createRespObj.getId();
	    
		timer = 0;
		while(true) {
			 // Construct an instance of the DetailTransitGatewayConnectionOptions model
		    DetailTransitGatewayConnectionOptions detailTransitGatewayConnectionOptionsModel = new DetailTransitGatewayConnectionOptions.Builder()
		    .transitGatewayId(tgGatewayId)
		    .id(tgConnId)
		    .build();

		    // Invoke operation with valid options model (positive test)
		    Response<TransitGatewayConnectionCust> tgConnresp = testService.detailTransitGatewayConnection(detailTransitGatewayConnectionOptionsModel).execute();
			 assertNotNull(tgConnresp);
		    TransitGatewayConnectionCust tgConnrespObj = tgConnresp.getResult();
		    assertNotNull(tgConnrespObj);

	        if("attached".equals(tgConnrespObj.getStatus())){
	        	break;
	        }// other than available, see if we have reached the timeout value.  If so, exit with failure
			if(timer > 24) { // 2 min timer (24x5sec)
				assertEquals("attached",tgConnrespObj.getStatus());// timed out fail if status is not available
				break;
			} else {
				// Still exists, wait 5 sec
				Thread.sleep(5000);
				timer = timer + 1;
			}
	   }
		 	
	    // Construct an instance of the ListTransitGatewayConnectionsOptions model
	    ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptionsModel = new ListTransitGatewayConnectionsOptions.Builder()
	    .transitGatewayId(tgGatewayId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCollection> listTGConnResponse = testService.listTransitGatewayConnections(listTransitGatewayConnectionsOptionsModel).execute();
	    assertNotNull(listTGConnResponse);
	    TransitGatewayConnectionCollection listTGConnResponseObj = listTGConnResponse.getResult();
	    assertNotNull(listTGConnResponseObj);
		assertNotNull(listTGConnResponseObj.getConnections());

	    // Construct an instance of the UpdateTransitGatewayConnectionOptions model
		String connectionNameUpdate = "Test-Java-SDK-INT-TG-CONN-PATCH";
	    UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(tgGatewayId)
	    .id(tgConnId)
	    .name(connectionNameUpdate)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    TransitGatewayConnectionCust updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),connectionNameUpdate);

		 // Construct an instance of the DetailTransitGatewayConnectionOptions model
	    DetailTransitGatewayConnectionOptions detailTransitGatewayConnectionOptionsModel = new DetailTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(tgGatewayId)
	    .id(tgConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> tgConnresp = testService.detailTransitGatewayConnection(detailTransitGatewayConnectionOptionsModel).execute();
		 assertNotNull(tgConnresp);
	    TransitGatewayConnectionCust tgConnrespObj = tgConnresp.getResult();
	    assertNotNull(tgConnrespObj);
		assertEquals(tgConnrespObj.getId(), tgConnId);

	    // Construct an instance of the ListGatewayLocationsOptions model
	    ListGatewayLocationsOptions listGatewayLocationsOptionsModel = new ListGatewayLocationsOptions();

	    // Invoke operation with valid options model (positive test)
	    Response<TSCollection> tgLocResponse = testService.listGatewayLocations(listGatewayLocationsOptionsModel).execute();
	    assertNotNull(tgLocResponse);
	    TSCollection tgLocResponseObj = tgLocResponse.getResult();
	    assertNotNull(tgLocResponseObj);
		assertNotNull(tgLocResponseObj.getLocations());

	    String instanceLoc = config.get("LOCATION");
	    // Construct an instance of the DetailGatewayLocationOptions model
	    DetailGatewayLocationOptions detailGatewayLocationOptionsModel = new DetailGatewayLocationOptions.Builder()
	    .name(instanceLoc)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TSLocation> locResp = testService.detailGatewayLocation(detailGatewayLocationOptionsModel).execute();
	    assertNotNull(locResp);
	    TSLocation locRespObj = locResp.getResult();
	    assertNotNull(locRespObj);
		assertEquals(locRespObj.getName(), instanceLoc);

	    // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(tgGatewayId)
	    .id(tgConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> delResponse = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delResponse);
	    Void delResponseObj = delResponse.getResult();
	    // Response does not have a return type. Check that the result is null.
	    assertNull(delResponseObj);

		// Connection deletion might not be instantaneous.  Poll the Connection looking for a 404 error code being returned.  Fail after 2 min
		timer = 0;
		while(true) {
			Response<TransitGatewayConnectionCust> tgConnrespDeletion = null;
			// Invoke operation with valid options model (positive test)
			try {
				tgConnrespDeletion = testService.detailTransitGatewayConnection(detailTransitGatewayConnectionOptionsModel).execute();
			} catch (NotFoundException e) {
				assertEquals(e.getMessage(),"connection_not_found");
				break;
			}

			assertNotNull(tgConnrespDeletion); 
			Thread.sleep(10000);
			timer = timer + 1;
			
			if(timer > 24) { // 4 min timer (24x10sec)
				break;
			}
	  	}
	    
	    // Construct an instance of the DeleteTransitGatewayOptions model
	    DeleteTransitGatewayOptions deleteTransitGatewayOptionsModel = new DeleteTransitGatewayOptions.Builder()
	    .id(tgGatewayId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> delTGresponse = testService.deleteTransitGateway(deleteTransitGatewayOptionsModel).execute();
	    assertNotNull(delTGresponse);
	    Void delTGresponseObj = delTGresponse.getResult();
	    // Response does not have a return type. Check that the result is null.
	    assertNull(delTGresponseObj);

	}
}
