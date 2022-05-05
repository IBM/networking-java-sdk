/*
 * (C) Copyright IBM Corp. 2022.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RecordsImportErrorModel.
 */
public class RecordsImportErrorModel extends GenericModel {

  @SerializedName("resource_record")
  protected String resourceRecord;
  protected RecordsImportErrorModelError error;

  /**
   * Gets the resourceRecord.
   *
   * resource record content in zone file.
   *
   * @return the resourceRecord
   */
  public String getResourceRecord() {
    return resourceRecord;
  }

  /**
   * Gets the error.
   *
   * @return the error
   */
  public RecordsImportErrorModelError getError() {
    return error;
  }
}

