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
package com.ibm.cloud.networking.alerts.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List Alert Policies Response.
 */
public class ListAlertPoliciesResp extends GenericModel {

  protected Boolean success;
  protected List<ListAlertPoliciesRespErrorsItem> errors;
  protected List<ListAlertPoliciesRespMessagesItem> messages;
  protected List<ListAlertPoliciesRespResultItem> result;

  /**
   * Gets the success.
   *
   * Was operation successful.
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
  public List<ListAlertPoliciesRespErrorsItem> getErrors() {
    return errors;
  }

  /**
   * Gets the messages.
   *
   * Array of messages returned.
   *
   * @return the messages
   */
  public List<ListAlertPoliciesRespMessagesItem> getMessages() {
    return messages;
  }

  /**
   * Gets the result.
   *
   * Container for response information.
   *
   * @return the result
   */
  public List<ListAlertPoliciesRespResultItem> getResult() {
    return result;
  }
}
