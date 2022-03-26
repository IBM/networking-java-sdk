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
package com.ibm.cloud.networking.transit_gateway_apis.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

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
		// if (skipTests()) {
		// 	return;
		// }

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
		Date date;
		try {
			date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String version = dateFormat.format(date);
			testService = TransitGatewayApis.newInstance(version, serviceName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTransitGatewayOptions() throws InterruptedException {
		assertNotNull(testService);
        preTestCleanup("JAVA-SDK");
		
		/////////////////////////////////////////////////////
		//              LIST Transit Locations             //
		/////////////////////////////////////////////////////

	    ListGatewayLocationsOptions listGatewayLocationsOptionsModel = new ListGatewayLocationsOptions();

	    // Invoke operation with valid options model (positive test)
	    Response<TSCollection> tgLocResponse = testService.listGatewayLocations(listGatewayLocationsOptionsModel).execute();
	    assertNotNull(tgLocResponse);
	    TSCollection tgLocResponseObj = tgLocResponse.getResult();
	    assertNotNull(tgLocResponseObj);
		assertNotNull(tgLocResponseObj.getLocations());
		
		/////////////////////////////////////////////////////
		//              GET Transit Location               //
		/////////////////////////////////////////////////////

		String instanceLoc = config.get("LOCATION");
	    // Construct an instance of the GetGatewayLocationOptions model
	    GetGatewayLocationOptions getGatewayLocationOptionsModel = new GetGatewayLocationOptions.Builder()
	    .name(instanceLoc)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TSLocation> locResp = testService.getGatewayLocation(getGatewayLocationOptionsModel).execute();
	    assertNotNull(locResp);
	    TSLocation locRespObj = locResp.getResult();
	    assertNotNull(locRespObj);
		assertEquals(locRespObj.getName(), instanceLoc);
		
		/////////////////////////////////////////////////////
		//              POST Transit Gateway               //
		/////////////////////////////////////////////////////

		String locationName = config.get("LOCATION");
		int stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String name = config.get("GW_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayOptions model
		CreateTransitGatewayOptions createTransitGatewayOptionsModel = new CreateTransitGatewayOptions.Builder(locationName, name)
		.build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> response = testService.createTransitGateway(createTransitGatewayOptionsModel).execute();
	    assertNotNull(response);
	    TransitGateway responseObj = response.getResult();
		assertNotNull(responseObj);
		assertNotNull(responseObj.getId());

	    String gatewayID = responseObj.getId();

	    // Gateway creation might not be instantaneous. Poll the  
		// Gateway looking for 'available' status. Fail after 2 min
		isResourceAvailable(gatewayID, "", "");
		
		/////////////////////////////////////////////////////
		//               GET Transit Gateway               //
		/////////////////////////////////////////////////////

	    GetTransitGatewayOptions getTransitGatewayOptionsModel = new GetTransitGatewayOptions.Builder()
	    .id(gatewayID) // Construct an instance of the GetTransitGatewayOptions model
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> resp = testService.getTransitGateway(getTransitGatewayOptionsModel).execute();
	    assertNotNull(resp);
	    TransitGateway respObj = resp.getResult();
	    assertNotNull(respObj);
		assertEquals(respObj.getName(), name);
		assertEquals(respObj.getId(), gatewayID);
		assertEquals(respObj.getLocation(), locationName);
		
		/////////////////////////////////////////////////////
		//             UPDATE Transit Gateway              //
		/////////////////////////////////////////////////////

		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String gatewayNameUpdate = "UPDATED-" + config.get("GW_NAME") + "_" + String.valueOf(stamp);
		
		// Construct an instance of the UpdateTransitGatewayOptions model
	    UpdateTransitGatewayOptions updateTransitGatewayOptionsModel = new UpdateTransitGatewayOptions.Builder()
	    .id(gatewayID)
	    .name(gatewayNameUpdate)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> updateResp = testService.updateTransitGateway(updateTransitGatewayOptionsModel).execute();
	    assertNotNull(updateResp);
	    TransitGateway updateRespObj = updateResp.getResult();
	    assertNotNull(updateRespObj);
		assertEquals(updateRespObj.getName(), gatewayNameUpdate);
		
		/////////////////////////////////////////////////////
		//              LIST Transit Gateways              //
		/////////////////////////////////////////////////////

		ListTransitGatewaysOptions listTransitGatewaysOptionsModel = new ListTransitGatewaysOptions.Builder()
		.limit(Long.valueOf("50")) // Construct an instance of the ListTransitGatewaysOptions model
		.start("")
		.build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayCollection> res = testService.listTransitGateways(listTransitGatewaysOptionsModel).execute();
	    assertNotNull(res);
	    TransitGatewayCollection resObj = res.getResult();
	    assertNotNull(resObj);
		assertNotNull(resObj.getTransitGateways());
		
		//////////////////////////////////////////////////////
		//          POST Transit CLASSIC Connection         //
		//////////////////////////////////////////////////////

		String classicNetworkType = "classic";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String classicName = "CLASSIC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(classicNetworkType)
	    .name(classicName)
	    .build(); 

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		TransitGatewayConnectionCust connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		
	    String classicConnID = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, classicConnID, "");
		
		/////////////////////////////////////////////////////
		//          POST Transit VPC Connection            //
		/////////////////////////////////////////////////////

		String vpcCrn = config.get("VPC_CRN");
		String vpcNetworkType = "vpc";
		String prefixFiltersDefault = "deny";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String vpcName = "VPC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Create prefix filter to add in the request.
		List<TransitGatewayConnectionPrefixFilter> prefixFilters = new ArrayList<TransitGatewayConnectionPrefixFilter>();
		TransitGatewayConnectionPrefixFilter prefixFilter = new TransitGatewayConnectionPrefixFilter.Builder()
		.action("permit")
		.prefix("192.168.100.0/24")
		.ge(Long.valueOf(24))
		.le(Long.valueOf(32))
		.build();
		prefixFilters.add(0, prefixFilter);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(vpcNetworkType)
	    .name(vpcName)
	    .networkId(vpcCrn)
		.prefixFilters(prefixFilters)
		.prefixFiltersDefault(prefixFiltersDefault)
	    .build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		
	    String vpcConnID = connCreateRespObj.getId();
	    String beforeFilterID = connCreateRespObj.getPrefixFilters().get(0).getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, vpcConnID, "");
		
		/////////////////////////////////////////////////////
		//            POST Transit DL Connection           //
		/////////////////////////////////////////////////////

		String dlCrn = config.get("DL_CRN");
		String dlNetworkType = "directlink";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String dlName = "DL-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(dlNetworkType)
	    .name(dlName)
	    .networkId(dlCrn)
	    .build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		
	    String dlConnId = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, dlConnId, "");
		
		//////////////////////////////////////////////////////
		//            POST Transit GRE Connection           //
		//////////////////////////////////////////////////////

		String greNetworkType = "gre_tunnel";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String greName = "GRE-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the ZoneIdentityByName model
		ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
		.name("us-south-1")
		.build();

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(greNetworkType)
	    .name(greName)
		.zone(zoneIdentityModel)
		.localGatewayIp("192.168.100.1")
		.localTunnelIp("192.168.101.1")
		.remoteGatewayIp("10.242.63.12")
		.remoteTunnelIp("192.168.101.2")
		.baseConnectionId(classicConnID)
		.build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		
	    String greConnID = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, greConnID, "");
		
		/////////////////////////////////////////////////////
		//          GET Transit CLASSIC Connection         //
		/////////////////////////////////////////////////////

	    GetTransitGatewayConnectionOptions getClassicTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(classicConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> getConnResp = testService.getTransitGatewayConnection(getClassicTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    TransitGatewayConnectionCust getConnRespObj = getConnResp.getResult();
	    assertNotNull(getConnRespObj);

		assertEquals(getConnRespObj.getId(), classicConnID);
		assertEquals(getConnRespObj.getName(), classicName);
		assertEquals(getConnRespObj.getNetworkType(), classicNetworkType);
		
		/////////////////////////////////////////////////////
		//             GET Transit VPC Connection          //
		/////////////////////////////////////////////////////

	    GetTransitGatewayConnectionOptions getVpcTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
		.transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(vpcConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getVpcTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObj = getConnResp.getResult();
	    assertNotNull(getConnRespObj);

		assertEquals(getConnRespObj.getId(), vpcConnID);
		assertEquals(getConnRespObj.getName(), vpcName);
		assertEquals(getConnRespObj.getNetworkId(), vpcCrn);
		assertEquals(getConnRespObj.getNetworkType(), vpcNetworkType);
		assertEquals(getConnRespObj.getPrefixFilters(), prefixFilters);
		assertEquals(getConnRespObj.getPrefixFiltersDefault(), prefixFiltersDefault);
		
		/////////////////////////////////////////////////////
		//            GET Transit DL Connection            //
		/////////////////////////////////////////////////////

	    GetTransitGatewayConnectionOptions getDLTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(dlConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getDLTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObj = getConnResp.getResult();
	    assertNotNull(getConnRespObj);

		assertEquals(getConnRespObj.getId(), dlConnId);
		assertEquals(getConnRespObj.getName(), dlName);
		assertEquals(getConnRespObj.getNetworkId(), dlCrn);
		assertEquals(getConnRespObj.getNetworkType(), dlNetworkType);
		
		/////////////////////////////////////////////////////
		//            GET Transit GRE Connection           //
		/////////////////////////////////////////////////////

	    GetTransitGatewayConnectionOptions getGreTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(greConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getGreTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObj = getConnResp.getResult();
	    assertNotNull(getConnRespObj);

		assertEquals(getConnRespObj.getId(), greConnID);
		assertEquals(connCreateRespObj.getName(), greName);
		assertEquals(connCreateRespObj.getNetworkType(), greNetworkType);
		assertEquals(connCreateRespObj.getBaseConnectionId(), classicConnID);
		assertEquals(connCreateRespObj.getLocalTunnelIp(), "192.168.101.1");
		assertEquals(connCreateRespObj.getRemoteGatewayIp(), "10.242.63.12");
		assertEquals(connCreateRespObj.getRemoteTunnelIp(), "192.168.101.2");
		assertEquals(connCreateRespObj.getLocalGatewayIp() , "192.168.100.1");
		
		////////////////////////////////////////////////////////
		//         UPDATE Transit CLASSIC Connection          //
		//////////////////////////////////////////////////////// 

		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameCLASSIC = "UPDATED-CLASSIC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(classicConnID)
	    .name(updatedNameCLASSIC)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    TransitGatewayConnectionCust updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameCLASSIC);
		
		/////////////////////////////////////////////////////
		//          UPDATE Transit VPC Connection          //
		///////////////////////////////////////////////////// 

		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameVPC = "UPDATED-VPC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);
		prefixFiltersDefault = "permit";

	    updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(vpcConnID)
	    .name(updatedNameVPC)
		.prefixFiltersDefault(prefixFiltersDefault)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameVPC);
		assertEquals(updateTGConnRespObj.getPrefixFiltersDefault(),prefixFiltersDefault);
		
		/////////////////////////////////////////////////////
		//          UPDATE Transit DL Connection           //
		///////////////////////////////////////////////////// 

		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameDL = "UPDATED-DL-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(dlConnId)
	    .name(updatedNameDL)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameDL);
		
		/////////////////////////////////////////////////////
		//          UPDATE Transit GRE Connection:         //
		///////////////////////////////////////////////////// 

		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameGRE = "UPDATED-GRE-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(greConnID)
	    .name(updatedNameGRE)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameGRE);
		
		/////////////////////////////////////////////////////
		//             LIST Transit Connections:           //
		///////////////////////////////////////////////////// 

	    ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptionsModel = new ListTransitGatewayConnectionsOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the ListTransitGatewayConnectionsOptions model
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCollection> listConnResp = testService.listTransitGatewayConnections(listTransitGatewayConnectionsOptionsModel).execute();
	    assertNotNull(listConnResp);

	    TransitGatewayConnectionCollection listConnRespObj = listConnResp.getResult();
	    assertNotNull(listConnRespObj);

		List<TransitGatewayConnectionCust> connections = listConnRespObj.getConnections();
		assertNotEquals(connections.size(), 0);

		boolean foundDL = false;
		boolean foundVPC = false;
		boolean foundGRE = false;
		boolean foundCLASSIC = false;
		for (TransitGatewayConnectionCust conn : connections) {
			if (conn.getId().equals(classicConnID)){
				assertEquals(conn.getNetworkType(), "classic");
				assertEquals(conn.getName(), updatedNameCLASSIC);
				foundCLASSIC = true;

			} else if (conn.getId().equals(dlConnId)){
				assertEquals(conn.getNetworkType(), "directlink");
				assertEquals(conn.getName(), updatedNameDL);
				foundDL = true;

			} else if (conn.getId().equals(vpcConnID)){
				assertEquals(conn.getNetworkType(), "vpc");
				assertEquals(conn.getName(), updatedNameVPC);
				foundVPC = true;

			} else if (conn.getId().equals(greConnID)){
				assertEquals(conn.getNetworkType(), "gre_tunnel");
				assertEquals(conn.getName(), updatedNameGRE);
				foundGRE = true;
			}
		}
		assertEquals(true, foundDL);
		assertEquals(true, foundVPC);
		assertEquals(true, foundGRE);
		assertEquals(true, foundCLASSIC);
		
		/////////////////////////////////////////////////////
		//            POST Gateway Route Report:           //
		/////////////////////////////////////////////////////

	    CreateTransitGatewayRouteReportOptions createTransitGatewayRouteReportOptionsModel = new CreateTransitGatewayRouteReportOptions
		.Builder() // Construct an instance of the CreateTransitGatewayRouteReportOptions model  
	    .transitGatewayId(gatewayID)
	    .build();

		// Invoke operation with valid options model (positive test)
	    Response<RouteReport> rrCreateResp = testService.createTransitGatewayRouteReport(createTransitGatewayRouteReportOptionsModel).execute();
	    assertNotNull(rrCreateResp);
	    
		RouteReport rrCreateRespObj = rrCreateResp.getResult();
	    assertNotNull(rrCreateRespObj);
		assertNotNull(rrCreateRespObj.getId());

		assertNotEquals(rrCreateRespObj.getStatus(), "");
		assertNotEquals(rrCreateRespObj.getCreatedAt(), "");
		assertNotEquals(rrCreateRespObj.getUpdatedAt(), "");
		
		String rrId = rrCreateRespObj.getId();

		// Route report creation might not be instantaneous. Poll the  
		// Route report looking for 'complete' status. Fail after 2 min
		isResourceAvailable(gatewayID, "", rrId);
		
		/////////////////////////////////////////////////////
		// 		      GET Gateway Route Report             //
		/////////////////////////////////////////////////////

		GetTransitGatewayRouteReportOptions getTransitGatewayRouteReportOptionsModel = new GetTransitGatewayRouteReportOptions
		.Builder() // Construct an instance of the GetTransitGatewayRouteReportOptions model 
		.transitGatewayId(gatewayID)
		.id(rrId)
		.build();

		// Invoke operation with valid options model (positive test)
		Response<RouteReport> rrGetResp = testService.getTransitGatewayRouteReport(getTransitGatewayRouteReportOptionsModel).execute();
		assertNotNull(rrGetResp);
		RouteReport rrGetRespObj = rrGetResp.getResult();
		assertNotNull(rrGetRespObj);	
		
		List<RouteReportConnection> rrConnections = rrGetRespObj.getConnections();
		assertNotNull(rrConnections);
		assertNotEquals(rrConnections.size(), 0);
		assertEquals(rrGetRespObj.getId(), rrId);
		assertNotEquals(rrGetRespObj.getCreatedAt(), "");
		assertNotEquals(rrGetRespObj.getUpdatedAt(), "");
		assertEquals(rrGetRespObj.getStatus(), "complete");

		foundDL = false;
		foundVPC = false;
		foundGRE = false;
		foundCLASSIC = false;
		for (RouteReportConnection rrConn : rrConnections) {
			if(rrConn.getId().equals(vpcConnID)){
				assertEquals(rrConn.getType(), "vpc");
				assertEquals(rrConn.getName(), updatedNameVPC);
				foundVPC = true;
			} else if (rrConn.getId().equals(classicConnID)){
				assertEquals(rrConn.getType(), "classic");
				assertEquals(rrConn.getName(), updatedNameCLASSIC);
				foundCLASSIC = true;
			} else if (rrConn.getId().equals(dlConnId)){
				assertEquals(rrConn.getType(), "directlink");
				assertEquals(rrConn.getName(), updatedNameDL);
				foundDL = true;
			} else if (rrConn.getId().equals(greConnID)){
				assertEquals(rrConn.getType(), "gre_tunnel");
				assertEquals(rrConn.getName(), updatedNameGRE);
				foundGRE = true;
			}
		}
		assertEquals(true, foundDL);
		assertEquals(true, foundVPC);
		assertEquals(true, foundGRE);
		assertEquals(true, foundCLASSIC);
		
		/////////////////////////////////////////////////////
		//           LIST Gateway Route Report             //
		/////////////////////////////////////////////////////

	    ListTransitGatewayRouteReportsOptions listTransitGatewayRouteReportsOptionsModel = new ListTransitGatewayRouteReportsOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the ListTransitGatewayRouteReportsOptions model
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<RouteReportCollection> rrListResp = testService.listTransitGatewayRouteReports(listTransitGatewayRouteReportsOptionsModel).execute();
	    assertNotNull(rrListResp);
	    RouteReportCollection rrListRespObj = rrListResp.getResult();
	    assertNotNull(rrListRespObj);
		List<RouteReport> routeReports = rrListRespObj.getRouteReports();
		assertNotNull(routeReports);

		boolean foundRR = false;
		for (RouteReport rr : routeReports) {
			if (rr.getId().equals(rrId)){
				assertNotNull(rr.getConnections());
				assertNotEquals(rr.getCreatedAt(), "");
				assertNotEquals(rr.getUpdatedAt(), "");
				assertEquals(rr.getStatus(), "complete");
				assertNotEquals(rr.getConnections().size(), 0);
				foundRR = true;
			}
		}
		assertEquals(true, foundRR);
		
		/////////////////////////////////////////////////////
		//          POST Connection Prefix Filter          //
		/////////////////////////////////////////////////////
		
		CreateTransitGatewayConnectionPrefixFilterOptions createTransitGatewayConnectionPrefixFilterOptionsModel = new CreateTransitGatewayConnectionPrefixFilterOptions
		.Builder() // Construct an instance of the CreateTransitGatewayConnectionPrefixFilterOptions model  
	    .transitGatewayId(gatewayID)
		.id(vpcConnID)
		.action("permit")
		.ge(Long.valueOf(16))
		.le(Long.valueOf(24))
		.before(beforeFilterID)
		.prefix("192.168.101.1/16")
	    .build();

		// Invoke operation with valid options model (positive test)
	    Response<PrefixFilterCust> prefixFiltersResp = testService.createTransitGatewayConnectionPrefixFilter(createTransitGatewayConnectionPrefixFilterOptionsModel).execute();
	    assertNotNull(prefixFiltersResp);

		PrefixFilterCust prefixFiltersRespObj = prefixFiltersResp.getResult();
	    assertNotNull(prefixFiltersRespObj);
		assertNotNull(prefixFiltersRespObj.getId());
		
	    String filterID = prefixFiltersRespObj.getId();
		
		/////////////////////////////////////////////////////
		//         GET Connection Prefix Filter            //
		/////////////////////////////////////////////////////

		GetTransitGatewayConnectionPrefixFilterOptions getTransitGatewayConnectionPrefixFilterOptionsModel = new GetTransitGatewayConnectionPrefixFilterOptions.Builder()
		.transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionPrefixFilterOptions model
	    .id(vpcConnID)
		.filterId(filterID)
	    .build();

	    // Invoke operation with valid options model (positive test)
		prefixFiltersResp = testService.getTransitGatewayConnectionPrefixFilter(getTransitGatewayConnectionPrefixFilterOptionsModel).execute();
		assertNotNull(prefixFiltersResp);

	    prefixFiltersRespObj = prefixFiltersResp.getResult();
	    assertNotNull(prefixFiltersRespObj);
		assertNotNull(prefixFiltersRespObj.getCreatedAt());
		assertNotNull(prefixFiltersRespObj.getUpdatedAt());

		assertEquals(prefixFiltersRespObj.getId(), filterID);
		assertEquals(prefixFiltersRespObj.getAction(), "permit");
		assertEquals(prefixFiltersRespObj.getGe(), Long.valueOf(16));
		assertEquals(prefixFiltersRespObj.getLe(), Long.valueOf(24));
		assertEquals(prefixFiltersRespObj.getBefore(), beforeFilterID);
		assertEquals(prefixFiltersRespObj.getPrefix(), "192.168.101.1/16");
		
		/////////////////////////////////////////////////////
		//         UPDATE Connection Prefix Filter         //
		/////////////////////////////////////////////////////
		
		UpdateTransitGatewayConnectionPrefixFilterOptions updateTransitGatewayConnectionPrefixFilterOptionsModel = new UpdateTransitGatewayConnectionPrefixFilterOptions
		.Builder() // Construct an instance of the UpdateTransitGatewayConnectionPrefixFilterOptions model  
	    .transitGatewayId(gatewayID)
		.id(vpcConnID)
		.filterId(filterID)
		.action("deny")
		.ge(Long.valueOf(18))
		.le(Long.valueOf(26))
		.prefix("192.168.102.2/18")
	    .build();

		// Invoke operation with valid options model (positive test)
	    prefixFiltersResp = testService.updateTransitGatewayConnectionPrefixFilter(updateTransitGatewayConnectionPrefixFilterOptionsModel).execute();
	    assertNotNull(prefixFiltersResp);

		prefixFiltersRespObj = prefixFiltersResp.getResult();
	    assertNotNull(prefixFiltersRespObj);
		
		assertEquals(prefixFiltersRespObj.getId(), filterID);
		assertEquals(prefixFiltersRespObj.getAction(), "deny");
		assertEquals(prefixFiltersRespObj.getGe(), Long.valueOf(18));
		assertEquals(prefixFiltersRespObj.getLe(), Long.valueOf(26));
		assertEquals(prefixFiltersRespObj.getPrefix(), "192.168.102.2/18");
		
		/////////////////////////////////////////////////////
		//          LIST Connection Prefix Filters         //
		/////////////////////////////////////////////////////

		ListTransitGatewayConnectionPrefixFiltersOptions listTransitGatewayConnectionPrefixFilterOptionsModel = new ListTransitGatewayConnectionPrefixFiltersOptions.Builder()
		.transitGatewayId(gatewayID) // Construct an instance of the ListTransitGatewayConnectionPrefixFiltersOptions model
	    .id(vpcConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
		Response<PrefixFilterCollection> listPrefixFiltersResp = testService.listTransitGatewayConnectionPrefixFilters(listTransitGatewayConnectionPrefixFilterOptionsModel).execute();
		assertNotNull(listPrefixFiltersResp);

		PrefixFilterCollection listPrefixFiltersRespObj = listPrefixFiltersResp.getResult();
	    assertNotNull(listPrefixFiltersRespObj);

		List<PrefixFilterCust> prefixFilterList = listPrefixFiltersRespObj.getPrefixFilters();
		assertNotEquals(prefixFilterList.size(), 0);

		boolean foundPF1 = false;
		boolean foundPF2 = false;
		for (PrefixFilterCust filter : prefixFilterList) {
			if (filter.getId().equals(filterID)){
				assertEquals(filter.getAction(), "deny");
				assertEquals(filter.getGe(), Long.valueOf(18));
				assertEquals(filter.getLe(), Long.valueOf(26));
				assertEquals(filter.getBefore(), beforeFilterID);
				assertEquals(filter.getPrefix(), "192.168.102.2/18");
				foundPF1 = true;
			} else if (filter.getId().equals(beforeFilterID)){
				assertEquals(filter.getAction(), "permit");
				assertEquals(filter.getGe(), Long.valueOf(24));
				assertEquals(filter.getLe(), Long.valueOf(32));
				assertEquals(filter.getPrefix(), "192.168.100.0/24");
				foundPF2 = true;
			} 
		}
		assertEquals(true, foundPF1);
		assertEquals(true, foundPF2);
		
		/////////////////////////////////////////////////////
		//         DELETE Connection Prefix Filter         //
		/////////////////////////////////////////////////////

		DeleteTransitGatewayConnectionPrefixFilterOptions deleteTransitGatewayConnectionPrefixFilterOptionsModel = new DeleteTransitGatewayConnectionPrefixFilterOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayRouteReportOptions model
	    .id(vpcConnID)
		.filterId(filterID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> pfDelResp = testService.deleteTransitGatewayConnectionPrefixFilter(deleteTransitGatewayConnectionPrefixFilterOptionsModel).execute();
	    assertNotNull(pfDelResp);
	    
		// Response does not have a return type. Check that the result is null.
	    Void pfDelRespObj = pfDelResp.getResult();
	    assertNull(pfDelRespObj);

		// Prefix Filters deletion might not be instantaneous. 
		checkResourceDeletion(null, null, null, getTransitGatewayConnectionPrefixFilterOptionsModel);
		
		/////////////////////////////////////////////////////
		//           DELETE Gateway Route Report           //
		/////////////////////////////////////////////////////

		DeleteTransitGatewayRouteReportOptions deleteTransitGatewayRouteReportOptionsModel = new DeleteTransitGatewayRouteReportOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayRouteReportOptions model
	    .id(rrId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> rrDelResp = testService.deleteTransitGatewayRouteReport(deleteTransitGatewayRouteReportOptionsModel).execute();
	    assertNotNull(rrDelResp);
	    
		// Response does not have a return type. Check that the result is null.
	    Void rrDelRespObj = rrDelResp.getResult();
	    assertNull(rrDelRespObj);

		// Route report deletion might not be instantaneous. 
		checkResourceDeletion(null, null, getTransitGatewayRouteReportOptionsModel, null);
		
		/////////////////////////////////////////////////////
		//          DELETE Transit GRE Connection          //
		/////////////////////////////////////////////////////

	    DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(greConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    Void delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getGreTransitGatewayConnectionOptionsModel, null, null);
		
		/////////////////////////////////////////////////////
		//           DELETE Transit VPC Connection         //
		/////////////////////////////////////////////////////

	    deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(vpcConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getVpcTransitGatewayConnectionOptionsModel, null, null);
		
		/////////////////////////////////////////////////////
		//           DELETE Transit DL Connection          //
		/////////////////////////////////////////////////////

	    deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(dlConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getDLTransitGatewayConnectionOptionsModel, null, null);
		
		////////////////////////////////////////////////////////
		//          DELETE Transit CLASSIC Connection         //
		////////////////////////////////////////////////////////

	    deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(classicConnID)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getClassicTransitGatewayConnectionOptionsModel, null, null);
		
		/////////////////////////////////////////////////////
		//            DELETE Transit Gateway               //
		/////////////////////////////////////////////////////

	    DeleteTransitGatewayOptions deleteTransitGatewayOptionsModel = new DeleteTransitGatewayOptions.Builder()
	    .id(gatewayID) // Construct an instance of the DeleteTransitGatewayOptions model
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> delGtwResp = testService.deleteTransitGateway(deleteTransitGatewayOptionsModel).execute();
	    assertNotNull(delGtwResp);
	    
		// Response does not have a return type. Check that the result is null.
	    Void delGtwRespObj = delGtwResp.getResult();
	    assertNull(delGtwRespObj);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	//                                 Test Helper Methods                                 //
	/////////////////////////////////////////////////////////////////////////////////////////

	private void preTestCleanup(String name) throws InterruptedException {
		// Construct an instance of the ListTransitGatewaysOptions model
		ListTransitGatewaysOptions listTransitGatewaysOptionsModel = new ListTransitGatewaysOptions.Builder()
		.limit(Long.valueOf("50"))
		.start("")
		.build();
	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayCollection> res = testService.listTransitGateways(listTransitGatewaysOptionsModel).execute();
	    assertNotNull(res);
	    TransitGatewayCollection resObj = res.getResult();
		List<TransitGateway> gateways = resObj.getTransitGateways();
		for (TransitGateway gtw : gateways) {
			// Only process SDK test resources.
			if (gtw.getName().contains(name)) {
				ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptionsModel = new ListTransitGatewayConnectionsOptions.Builder()
	            .transitGatewayId(gtw.getId())
				.build();
				
                Response<TransitGatewayConnectionCollection> listConnResp = testService.listTransitGatewayConnections(listTransitGatewayConnectionsOptionsModel).execute();
	            assertNotNull(listConnResp);
	            TransitGatewayConnectionCollection listConnRespObj = listConnResp.getResult();
				List<TransitGatewayConnectionCust> connections = listConnRespObj.getConnections();
				if (!connections.isEmpty()) {
					List<String> connectionIDs = new ArrayList<String>();
					for (TransitGatewayConnectionCust conn : connections) {
						// Deletes GRE Connections first.
						if (conn.getNetworkType().contains("gre_tunnel")) {
							DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
							.transitGatewayId(gtw.getId())
							.id(conn.getId())
							.build();

							Response<Void> delResponse = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
							assertNotNull(delResponse);

							GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
							.transitGatewayId(gtw.getId())
							.id(conn.getId())
							.build();
							
							// Connection deletion might not be instantaneous.
							checkResourceDeletion(null, getTransitGatewayConnectionOptionsModel, null, null);
						} else {
							connectionIDs.add(conn.getId());
						}
					}
					// Deletes Connections from other types.
					for (String connID : connectionIDs) {
						DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
						.transitGatewayId(gtw.getId())
						.id(connID)
						.build();

						Response<Void> delResponse = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
						assertNotNull(delResponse);

						GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
						.transitGatewayId(gtw.getId())
						.id(connID)
						.build();
						
						// Connection deletion might not be instantaneous.
						checkResourceDeletion(null, getTransitGatewayConnectionOptionsModel, null, null);			
					} 
				}
				// Construct an instance of the DeleteTransitGatewayOptions model
				DeleteTransitGatewayOptions deleteTransitGatewayOptionsModel = new DeleteTransitGatewayOptions.Builder()
				.id(gtw.getId())
				.build();
		
				// Invoke operation with valid options model (positive test)
				Response<Void> delTGresponse = testService.deleteTransitGateway(deleteTransitGatewayOptionsModel).execute();
				assertNotNull(delTGresponse);
				
				// Construct an instance of the GetTransitGatewayOptions model
				GetTransitGatewayOptions getTransitGatewayOptionsModel = new GetTransitGatewayOptions.Builder()
				.id(gtw.getId())
				.build();

				checkResourceDeletion(getTransitGatewayOptionsModel, null, null, null);
			}
		}
	}

	private void checkResourceDeletion(GetTransitGatewayOptions gtwModel, GetTransitGatewayConnectionOptions connModel, GetTransitGatewayRouteReportOptions rrModel, GetTransitGatewayConnectionPrefixFilterOptions pfModel) throws InterruptedException {
		int timer = 0;
		while(true) {
			// Invoke operation with valid options model (positive test)
			try {
				if (connModel != null){
					Response<TransitGatewayConnectionCust> connGetResp = testService.getTransitGatewayConnection(connModel).execute();
					assertNotNull(connGetResp); 
				} else if (gtwModel != null){
					Response<TransitGateway> gtwGetResp = testService.getTransitGateway(gtwModel).execute();
					assertNotNull(gtwGetResp);	
				} else if (pfModel != null){
					Response<PrefixFilterCust> pfGetResp = testService.getTransitGatewayConnectionPrefixFilter(pfModel).execute();
					assertNotNull(pfGetResp);	
				} else {
					Response<RouteReport> rrGetResp = testService.getTransitGatewayRouteReport(rrModel).execute();
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

	private void isResourceAvailable(String gatewayID, String connID, String rrID) throws InterruptedException {
		int timer = 0;
		int delay = 5000;
		boolean breaker = false;

		while(true) {
			if (connID.equals("") == false){
				GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
				.transitGatewayId(gatewayID)
				.id(connID)
				.build();
	
				Response<TransitGatewayConnectionCust> connGetResp = testService.getTransitGatewayConnection(getTransitGatewayConnectionOptionsModel).execute();
				 assertNotNull(connGetResp);
				TransitGatewayConnectionCust connGetRespObj = connGetResp.getResult();
				assertNotNull(connGetRespObj);
	
				if("attached".equals(connGetRespObj.getStatus())){
					breaker = true;
				}
				delay = 8000;
			} else if (rrID.equals("") == false){
				GetTransitGatewayRouteReportOptions getTransitGatewayRouteReportOptionsModel = new GetTransitGatewayRouteReportOptions
				.Builder()
				.transitGatewayId(gatewayID)
				.id(rrID)
				.build();
	
				Response<RouteReport> rrGetResp = testService.getTransitGatewayRouteReport(getTransitGatewayRouteReportOptionsModel).execute();
				assertNotNull(rrGetResp);
				RouteReport rrGetRespObj = rrGetResp.getResult();
				assertNotNull(rrGetRespObj);

				if("complete".equals(rrGetRespObj.getStatus())){
					breaker = true;
				} 
				delay = 10000;
			} else {
				GetTransitGatewayOptions getTransitGatewayOptionsModel = new GetTransitGatewayOptions.Builder()
				.id(gatewayID)
				.build();

				Response<TransitGateway> gtwGetResp = testService.getTransitGateway(getTransitGatewayOptionsModel).execute();
				assertNotNull(gtwGetResp);
				TransitGateway gtwGetRespObj = gtwGetResp.getResult();
				assertNotNull(gtwGetRespObj);

				if("available".equals(gtwGetRespObj.getStatus())){
					breaker = true;
				}
			}
			// available/attached/complete status is reached.
	        if(breaker){
	        	break;
	        } 
			
			// If not available/attached/complete status is reached.
			if(timer > 24) {
				// timed out fail if resourse is not available. 
				assertEquals("complete", "non-complete");
				break;
			} else {
				// Still exists, wait 5 or 10 sec.
				Thread.sleep(delay);
				timer = timer + 1;
			}
		}
	}
}
