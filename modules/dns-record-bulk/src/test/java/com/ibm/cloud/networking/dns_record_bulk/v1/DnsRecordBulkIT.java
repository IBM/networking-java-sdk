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

package com.ibm.cloud.networking.dns_record_bulk.v1;

import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObject;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObjectMessagesItem;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObjectResult;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObjectTiming;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.GetDnsRecordsBulkOptions;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.PostDnsRecordsBulkOptions;
import com.ibm.cloud.networking.dns_record_bulk.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * Integration test class for the DnsRecordBulk service.
 */
public class DnsRecordBulkIT extends SdkIntegrationTestBase {
  public DnsRecordBulk service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;

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
      service = DnsRecordBulk.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testPostDnsRecordsBulk")
  public void testGetDnsRecordsBulk() throws Exception {
    try {
      GetDnsRecordsBulkOptions getDnsRecordsBulkOptions = new GetDnsRecordsBulkOptions();

      // Invoke operation
      Response<InputStream> response = service.getDnsRecordsBulk(getDnsRecordsBulkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();
      System.out.println("#########");
      System.out.println(inputStreamResult);
      System.out.println("########");
      System.out.println(response);
      System.out.println("#######");
      // reads till the end of the stream
      int i;
      char c;
         while((i = inputStreamResult.read())!=-1) {
         
            // converts integer to character
            c = (char)i;
            
            // prints character
            System.out.print(c);
         }
      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostDnsRecordsBulk() throws Exception {

    // Create Test File that will be used for bulk import
    try {
      // Create a file
      File myObj = new File("test_dns_records.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }

      // Write to the file
      FileWriter myWriter = new FileWriter("test_dns_records.txt");
      myWriter.write("example.sdk.cistest-load.com.   1   IN  A   1.1.1.1");
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    // Read the file content
    String data = null;
    try {
      File myObj = new File("test_dns_records.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    try {
      PostDnsRecordsBulkOptions postDnsRecordsBulkOptions = new PostDnsRecordsBulkOptions.Builder()
      .file(TestUtilities.createMockStream(data))
      .fileContentType("text")
      .build();

      // Invoke operation
      Response<DnsRecordsObject> response = service.postDnsRecordsBulk(postDnsRecordsBulkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DnsRecordsObject dnsRecordsObjectResult = response.getResult();
      System.out.println(dnsRecordsObjectResult);

      assertNotNull(dnsRecordsObjectResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
    
    // Delete the test file
    File myObj = new File("test_dns_records.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
