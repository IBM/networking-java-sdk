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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedDnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedDnszoneLinkedTo;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LinkedDnszone model.
 */
public class LinkedDnszoneTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLinkedDnszone() throws Throwable {
    LinkedDnszone linkedDnszoneModel = new LinkedDnszone();
    assertNull(linkedDnszoneModel.getId());
    assertNull(linkedDnszoneModel.getInstanceId());
    assertNull(linkedDnszoneModel.getName());
    assertNull(linkedDnszoneModel.getDescription());
    assertNull(linkedDnszoneModel.getLinkedTo());
    assertNull(linkedDnszoneModel.getState());
    assertNull(linkedDnszoneModel.getLabel());
    assertNull(linkedDnszoneModel.getApprovalRequiredBefore());
    assertNull(linkedDnszoneModel.getCreatedOn());
    assertNull(linkedDnszoneModel.getModifiedOn());
  }
}