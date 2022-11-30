/*
 * (C) Copyright IBM Corp. 2020, 2022.
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
import java.util.Map;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
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
	@Ignore
	@Test
	public void testTransitGatewayOptions() throws InterruptedException {
		assertNotNull(testService);
        preTestCleanup("SDK-JAVA");
		
		///////////////////////////////////////////
		// Success: LIST Transit Locations:
		///////////////////////////////////////////
	    ListGatewayLocationsOptions listGatewayLocationsOptionsModel = new ListGatewayLocationsOptions();

	    // Invoke operation with valid options model (positive test)
	    Response<TSCollection> tgLocResponse = testService.listGatewayLocations(listGatewayLocationsOptionsModel).execute();
	    assertNotNull(tgLocResponse);
	    TSCollection tgLocResponseObj = tgLocResponse.getResult();
	    assertNotNull(tgLocResponseObj);
		assertNotNull(tgLocResponseObj.getLocations());
		
		///////////////////////////////////////////
		// Success: GET Transit Location:
		///////////////////////////////////////////
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
		
		///////////////////////////////////////////
		// Success: POST Transit Gateway:
		///////////////////////////////////////////
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
		assertEquals(responseObj.getName(), name);
		assertEquals(responseObj.getLocation(), locationName);
	    String gatewayID = responseObj.getId();

	    // Gateway creation might not be instantaneous. Poll the  
		// Gateway looking for 'available' status. Fail after 2 min
		isResourceAvailable(gatewayID, "", "");
		
		///////////////////////////////////////////
		// Success: GET Transit Gateway:
		///////////////////////////////////////////
	    GetTransitGatewayOptions getTransitGatewayOptionsModel = new GetTransitGatewayOptions.Builder()
	    .id(gatewayID) // Construct an instance of the GetTransitGatewayOptions model
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGateway> resp = testService.getTransitGateway(getTransitGatewayOptionsModel).execute();
	    assertNotNull(resp);
	    TransitGateway respObj = resp.getResult();
	    assertNotNull(respObj);
		assertEquals(respObj.getId(), gatewayID);
		
		///////////////////////////////////////////
        // Success: UPDATE Transit Gateway:
        ///////////////////////////////////////////
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
		
		///////////////////////////////////////////
		// Success: LIST Transit Gateways:
		///////////////////////////////////////////
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
		
		////////////////////////////////////////////
		// Success: POST Transit CLASSIC Connection:
		////////////////////////////////////////////
		String connectionNetworkType = "classic";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String connectionName = "CLASSIC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(connectionNetworkType)
	    .name(connectionName)
	    .build(); 

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		TransitGatewayConnectionCust connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		assertEquals(connCreateRespObj.getName(), connectionName);
		assertEquals(connCreateRespObj.getNetworkType(), connectionNetworkType);
	    String classicConnId = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, classicConnId, "");

		///////////////////////////////////////////
		// Success: POST Transit VPC Connection:
		///////////////////////////////////////////
		String vpcCrn = config.get("VPC_CRN");
		connectionNetworkType = "vpc";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		connectionName = "VPC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(connectionNetworkType)
	    .name(connectionName)
	    .networkId(vpcCrn)
	    .build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		assertEquals(connCreateRespObj.getName(), connectionName);
		assertEquals(connCreateRespObj.getNetworkId(), vpcCrn);
		assertEquals(connCreateRespObj.getNetworkType(), connectionNetworkType);
	    String vpcConnId = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, vpcConnId, "");

		///////////////////////////////////////////
		// Success: POST Transit DL Connection:
		///////////////////////////////////////////
		String dlCrn = config.get("DL_CRN");
		connectionNetworkType = "directlink";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		connectionName = "DL-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(connectionNetworkType)
	    .name(connectionName)
	    .networkId(dlCrn)
	    .build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		assertEquals(connCreateRespObj.getName(), connectionName);
		assertEquals(connCreateRespObj.getNetworkId(), dlCrn);
		assertEquals(connCreateRespObj.getNetworkType(), connectionNetworkType);
	    String dlConnId = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, dlConnId, "");

		////////////////////////////////////////////
		// Success: POST Transit GRE Connection:
		////////////////////////////////////////////
		connectionNetworkType = "gre_tunnel";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		connectionName = "GRE-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the ZoneIdentityByName model
		ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
		.name("us-south-1")
		.build();

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(connectionNetworkType)
	    .name(connectionName)
		.zone(zoneIdentityModel)
		.localGatewayIp("192.168.100.1")
		.localTunnelIp("192.168.101.1")
		.remoteGatewayIp("10.242.63.12")
		.remoteTunnelIp("192.168.101.2")
		.baseConnectionId(classicConnId)
		.build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		assertEquals(connCreateRespObj.getName(), connectionName);
		assertEquals(connCreateRespObj.getNetworkType(), connectionNetworkType);
	    String greConnId = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, greConnId, "");


		////////////////////////////////////////////
		// Success: POST Transit Unbound GRE Connection:
		////////////////////////////////////////////
		connectionNetworkType = "unbound_gre_tunnel";
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		connectionName = "unbound-GRE-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

		// Construct an instance of the CreateTransitGatewayConnectionOptions model
	    createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) 
	    .networkType(connectionNetworkType)
	    .name(connectionName)
		.zone(zoneIdentityModel)
		.localGatewayIp("192.168.100.1")
		.localTunnelIp("192.168.101.1")
		.remoteGatewayIp("10.242.63.12")
		.remoteTunnelIp("192.168.101.2")
		.baseConnectionId(classicConnId)
		.baseNetworkType("classic")
		.build(); 

	    // Invoke operation with valid options model (positive test)
	    connCreateResp = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(connCreateResp);
	    
		connCreateRespObj = connCreateResp.getResult();
	    assertNotNull(connCreateRespObj);
		assertNotNull(connCreateRespObj.getId());
		assertEquals(connCreateRespObj.getName(), connectionName);
		assertEquals(connCreateRespObj.getNetworkType(), connectionNetworkType);
		assertEquals(connCreateRespObj.getBaseNetworkType(), "classic");
	    String unboundGreConnId = connCreateRespObj.getId();

		// Connection creation might not be instantaneous. Poll the  
		// Connection looking for 'attached' status. Fail after 2 min
		isResourceAvailable(gatewayID, unboundGreConnId, "");
		
		
		///////////////////////////////////////////
		// Success: GET Transit CLASSIC Connection:
		///////////////////////////////////////////
	    GetTransitGatewayConnectionOptions getClassicTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(classicConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> getConnResp = testService.getTransitGatewayConnection(getClassicTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    TransitGatewayConnectionCust getConnRespObjObj = getConnResp.getResult();
	    assertNotNull(getConnRespObjObj);
		assertEquals(getConnRespObjObj.getId(), classicConnId);
		
		///////////////////////////////////////////
		// Success: GET Transit VPC Connection:
		///////////////////////////////////////////
	    GetTransitGatewayConnectionOptions getVpcTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
		.transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(vpcConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getVpcTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObjObj = getConnResp.getResult();
	    assertNotNull(getConnRespObjObj);
		assertEquals(getConnRespObjObj.getId(), vpcConnId);

		///////////////////////////////////////////
		// Success: GET Transit DL Connection:
		///////////////////////////////////////////
	    GetTransitGatewayConnectionOptions getDLTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(dlConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getDLTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObjObj = getConnResp.getResult();
	    assertNotNull(getConnRespObjObj);
		assertEquals(getConnRespObjObj.getId(), dlConnId);

		///////////////////////////////////////////
		// Success: GET Transit GRE Connection:
		///////////////////////////////////////////
	    GetTransitGatewayConnectionOptions getGreTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(greConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getGreTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObjObj = getConnResp.getResult();
	    assertNotNull(getConnRespObjObj);
		assertEquals(getConnRespObjObj.getId(), greConnId);

		///////////////////////////////////////////
		// Success: GET Transit Unbound GRE Connection:
		///////////////////////////////////////////
	    GetTransitGatewayConnectionOptions getUnboundGreTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the GetTransitGatewayConnectionOptions model
	    .id(unboundGreConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	   	getConnResp = testService.getTransitGatewayConnection(getUnboundGreTransitGatewayConnectionOptionsModel).execute();
		assertNotNull(getConnResp);

	    getConnRespObjObj = getConnResp.getResult();
	    assertNotNull(getConnRespObjObj);
		assertEquals(getConnRespObjObj.getId(), unboundGreConnId);
		
		//////////////////////////////////////////////
		// Success: UPDATE Transit CLASSIC Connection:
		////////////////////////////////////////////// 
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameCLASSIC = "UPDATED-CLASSIC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(classicConnId)
	    .name(updatedNameCLASSIC)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<TransitGatewayConnectionCust> updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    TransitGatewayConnectionCust updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameCLASSIC);
		
		///////////////////////////////////////////
		// Success: UPDATE Transit VPC Connection:
		/////////////////////////////////////////// 
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameVPC = "UPDATED-VPC-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(vpcConnId)
	    .name(updatedNameVPC)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameVPC);

		///////////////////////////////////////////
		// Success: UPDATE Transit DL Connection:
		/////////////////////////////////////////// 
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

		///////////////////////////////////////////
		// Success: UPDATE Transit GRE Connection:
		/////////////////////////////////////////// 
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameGRE = "UPDATED-GRE-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(greConnId)
	    .name(updatedNameGRE)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameGRE);


		///////////////////////////////////////////
		// Success: UPDATE Transit Unbound GRE Connection:
		/////////////////////////////////////////// 
		stamp = (int)Math.floor(Math.random()*(1000-0+1)+0);
		String updatedNameUnboundGRE = "UPDATED-UNBOUND-GRE-" + config.get("CONN_NAME") + "_" + String.valueOf(stamp);

	    updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the UpdateTransitGatewayConnectionOptions model
	    .id(unboundGreConnId)
	    .name(updatedNameUnboundGRE)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    updateTGConnResp = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(updateTGConnResp);
	    updateTGConnRespObj = updateTGConnResp.getResult();
	    assertNotNull(updateTGConnRespObj);
		assertEquals(updateTGConnRespObj.getName(),updatedNameUnboundGRE);
		
		///////////////////////////////////////////
		// Success: LIST Transit Connections:
		/////////////////////////////////////////// 	
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
		boolean foundUnboundGRE = false;
		for (TransitGatewayConnectionCust conn : connections) {
			if (conn.getId().equals(classicConnId)){
				assertEquals(conn.getNetworkType(), "classic");
				assertEquals(conn.getName(), updatedNameCLASSIC);
				foundCLASSIC = true;

			} else if (conn.getId().equals(dlConnId)){
				assertEquals(conn.getNetworkType(), "directlink");
				assertEquals(conn.getName(), updatedNameDL);
				foundDL = true;

			} else if (conn.getId().equals(vpcConnId)){
				assertEquals(conn.getNetworkType(), "vpc");
				assertEquals(conn.getName(), updatedNameVPC);
				foundVPC = true;

			} else if (conn.getId().equals(greConnId)){
				assertEquals(conn.getNetworkType(), "gre_tunnel");
				assertEquals(conn.getName(), updatedNameGRE);
				foundGRE = true;
			} else if (conn.getId().equals(greConnId)){
				assertEquals(conn.getNetworkType(), "unbound_gre_tunnel");
				assertEquals(conn.getName(), updatedNameUnboundGRE);
				foundGRE = true;
			}
		}
		assertEquals(true, foundDL);
		assertEquals(true, foundVPC);
		assertEquals(true, foundGRE);
		assertEquals(true, foundCLASSIC);
		assertEquals(true, foundUnboundGRE);
		
		///////////////////////////////////////////
		// Success: POST Gateway Route Report:
		///////////////////////////////////////////
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
		
		///////////////////////////////////////////
		// Success: GET Gateway Route Report:
		///////////////////////////////////////////
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
		foundUnboundGRE = false;
		for (RouteReportConnection rrConn : rrConnections) {
			if(rrConn.getId().equals(vpcConnId)){
				assertEquals(rrConn.getType(), "vpc");
				assertEquals(rrConn.getName(), updatedNameVPC);
				foundVPC = true;
			} else if (rrConn.getId().equals(classicConnId)){
				assertEquals(rrConn.getType(), "classic");
				assertEquals(rrConn.getName(), updatedNameCLASSIC);
				foundCLASSIC = true;

			} else if (rrConn.getId().equals(dlConnId)){
				assertEquals(rrConn.getType(), "directlink");
				assertEquals(rrConn.getName(), updatedNameDL);
				foundDL = true;

			} else if (rrConn.getId().equals(greConnId)){
				assertEquals(rrConn.getType(), "gre_tunnel");
				assertEquals(rrConn.getName(), updatedNameGRE);
				foundGRE = true;
			} else if (rrConn.getId().equals(greConnId)){
				assertEquals(rrConn.getType(), "unbound_gre_tunnel");
				assertEquals(rrConn.getName(), updatedNameUnboundGRE);
				foundUnboundGRE = true;
			}
		}
		assertEquals(true, foundDL);
		assertEquals(true, foundVPC);
		assertEquals(true, foundGRE);
		assertEquals(true, foundCLASSIC);
		assertEquals(true, foundUnboundGRE);
		
		///////////////////////////////////////////
		// Success: LIST Gateway Route Report:
		///////////////////////////////////////////
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
		
		///////////////////////////////////////////
		// Success: DELETE Gateway Route Report:
		///////////////////////////////////////////
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
		checkResourceDeletion(null, null, getTransitGatewayRouteReportOptionsModel);

		///////////////////////////////////////////
		// Success: DELETE Transit GRE Connection:
		///////////////////////////////////////////
	    DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(greConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    Response<Void> delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    Void delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getGreTransitGatewayConnectionOptionsModel, null);
		
		///////////////////////////////////////////
		// Success: DELETE Transit Unbound GRE Connection:
		///////////////////////////////////////////
		deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(unboundGreConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
		delConnRespObj = delConnResp.getResult();
		assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getGreTransitGatewayConnectionOptionsModel, null);
		
		///////////////////////////////////////////
		// Success: DELETE Transit VPC Connection:
		///////////////////////////////////////////
	    deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(vpcConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getVpcTransitGatewayConnectionOptionsModel, null);
		
		///////////////////////////////////////////
		// Success: DELETE Transit DL Connection:
		///////////////////////////////////////////
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
		checkResourceDeletion(null, getDLTransitGatewayConnectionOptionsModel, null);
		
		//////////////////////////////////////////////
		// Success: DELETE Transit CLASSIC Connection:
		//////////////////////////////////////////////
	    deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
	    .transitGatewayId(gatewayID) // Construct an instance of the DeleteTransitGatewayConnectionOptions model
	    .id(classicConnId)
	    .build();

	    // Invoke operation with valid options model (positive test)
	    delConnResp = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
	    assertNotNull(delConnResp);
	    
		// Response does not have a return type. Check that the result is null.
	    delConnRespObj = delConnResp.getResult();
	    assertNull(delConnRespObj);

		// Connection deletion might not be instantaneous.  
		checkResourceDeletion(null, getClassicTransitGatewayConnectionOptionsModel, null);
		
		///////////////////////////////////////////
		// Success: DELETE Transit Gateway:
		///////////////////////////////////////////
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
	
	///////////////////////////////////////////////////////////////////////////////
	//                           Test Helper Methods                             //
	///////////////////////////////////////////////////////////////////////////////

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
						if (conn.getNetworkType().contains("gre_tunnel")) { //will handle unbound_gre_tunnel as well
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
							checkResourceDeletion(null, getTransitGatewayConnectionOptionsModel, null);
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
						checkResourceDeletion(null, getTransitGatewayConnectionOptionsModel, null);			
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

				checkResourceDeletion(getTransitGatewayOptionsModel, null, null);
			}
		}
	}

	private void checkResourceDeletion(GetTransitGatewayOptions gtwModel, GetTransitGatewayConnectionOptions connModel, GetTransitGatewayRouteReportOptions rrModel) throws InterruptedException {
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
