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
package com.ibm.cloud.networking.dns_record_bulk.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * dns records objects.
 */
public class DnsRecordsObject extends GenericModel {

  protected Boolean success;
  protected List<List<String>> errors;
  protected List<DnsRecordsObjectMessagesItem> messages;
  protected DnsRecordsObjectResult result;
  protected DnsRecordsObjectTiming timing;

  /**
   * Gets the success.
   *
   * Operation success flag.
   *
   * @return the success
   */
  public Boolean isSuccess() {
    return success;
  }

  /**
   * Gets the errors.
   *
   * Array of errors encountered.
   *
   * @return the errors
   */
  public List<List<String>> getErrors() {
    return errors;
  }

  /**
   * Gets the messages.
   *
   * Array of messages returned.
   *
   * @return the messages
   */
  public List<DnsRecordsObjectMessagesItem> getMessages() {
    return messages;
  }

  /**
   * Gets the result.
   *
   * DNS record.
   *
   * @return the result
   */
  public DnsRecordsObjectResult getResult() {
    return result;
  }

  /**
   * Gets the timing.
   *
   * timing object.
   *
   * @return the timing
   */
  public DnsRecordsObjectTiming getTiming() {
    return timing;
  }
}

