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
package com.ibm.cloud.networking.custom_pages.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * list of custom pages response.
 */
public class ListCustomPagesResp extends GenericModel {

  protected Boolean success;
  protected List<List<String>> errors;
  protected List<List<String>> messages;
  protected List<CustomPageObject> result;
  @SerializedName("result_info")
  protected ListCustomPagesRespResultInfo resultInfo;

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

  /**
   * Gets the result.
   *
   * custom pages array.
   *
   * @return the result
   */
  public List<CustomPageObject> getResult() {
    return result;
  }

  /**
   * Gets the resultInfo.
   *
   * Statistics of results.
   *
   * @return the resultInfo
   */
  public ListCustomPagesRespResultInfo getResultInfo() {
    return resultInfo;
  }
}
