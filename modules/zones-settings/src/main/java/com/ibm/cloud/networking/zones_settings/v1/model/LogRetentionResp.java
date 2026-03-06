/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.zones_settings.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Schema for the response to a GET call for the log retention setting.
 */
public class LogRetentionResp extends GenericModel {

  protected Boolean success;
  protected LogRetentionRespResult result;
  protected List<String> errors;
  protected List<String> messages;

  protected LogRetentionResp() { }

  /**
   * Gets the success.
   *
   * Boolean flag indicating whether hte API call was successful in retrieving the requested data.
   *
   * @return the success
   */
  public Boolean isSuccess() {
    return success;
  }

  /**
   * Gets the result.
   *
   * @return the result
   */
  public LogRetentionRespResult getResult() {
    return result;
  }

  /**
   * Gets the errors.
   *
   * Array of errors messages.
   *
   * @return the errors
   */
  public List<String> getErrors() {
    return errors;
  }

  /**
   * Gets the messages.
   *
   * Array of additional messages.
   *
   * @return the messages
   */
  public List<String> getMessages() {
    return messages;
  }
}

