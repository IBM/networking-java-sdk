/*
 * (C) Copyright IBM Corp. 2021.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Import DNS records response.
 */
public class ImportResourceRecordsResp extends GenericModel {

  @SerializedName("total_records_parsed")
  protected Long totalRecordsParsed;
  @SerializedName("records_added")
  protected Long recordsAdded;
  @SerializedName("records_failed")
  protected Long recordsFailed;
  @SerializedName("records_added_by_type")
  protected RecordStatsByType recordsAddedByType;
  @SerializedName("records_failed_by_type")
  protected RecordStatsByType recordsFailedByType;
  protected List<RecordsImportMessageModel> messages;
  protected List<RecordsImportErrorModel> errors;

  /**
   * Gets the totalRecordsParsed.
   *
   * Number of records parsed from the zone file.
   *
   * @return the totalRecordsParsed
   */
  public Long getTotalRecordsParsed() {
    return totalRecordsParsed;
  }

  /**
   * Gets the recordsAdded.
   *
   * Number of records imported successfully.
   *
   * @return the recordsAdded
   */
  public Long getRecordsAdded() {
    return recordsAdded;
  }

  /**
   * Gets the recordsFailed.
   *
   * Number of records failed import.
   *
   * @return the recordsFailed
   */
  public Long getRecordsFailed() {
    return recordsFailed;
  }

  /**
   * Gets the recordsAddedByType.
   *
   * Number of records classified by type.
   *
   * @return the recordsAddedByType
   */
  public RecordStatsByType getRecordsAddedByType() {
    return recordsAddedByType;
  }

  /**
   * Gets the recordsFailedByType.
   *
   * Number of records classified by type.
   *
   * @return the recordsFailedByType
   */
  public RecordStatsByType getRecordsFailedByType() {
    return recordsFailedByType;
  }

  /**
   * Gets the messages.
   *
   * Error messages.
   *
   * @return the messages
   */
  public List<RecordsImportMessageModel> getMessages() {
    return messages;
  }

  /**
   * Gets the errors.
   *
   * Number of records parsed from the zone file.
   *
   * @return the errors
   */
  public List<RecordsImportErrorModel> getErrors() {
    return errors;
  }
}

