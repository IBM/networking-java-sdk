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
package com.ibm.cloud.networking.global_load_balancer_events.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * events list response object.
 */
public class ListEventsResp extends GenericModel {

  protected Boolean success;
  protected List<ListEventsRespResultItem> result;
  @SerializedName("result_info")
  protected ListEventsRespResultInfo resultInfo;
  protected List<List<String>> errors;
  protected List<List<String>> messages;

  /**
   * Gets the success.
   *
   * Was the get successful.
   *
   * @return the success
   */
  public Boolean isSuccess() {
    return success;
  }

  /**
   * Gets the result.
   *
   * Result of the operation.
   *
   * @return the result
   */
  public List<ListEventsRespResultItem> getResult() {
    return result;
  }

  /**
   * Gets the resultInfo.
   *
   * result information.
   *
   * @return the resultInfo
   */
  public ListEventsRespResultInfo getResultInfo() {
    return resultInfo;
  }

  /**
   * Gets the errors.
   *
   * Array of errors returned.
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
  public List<List<String>> getMessages() {
    return messages;
  }
}

