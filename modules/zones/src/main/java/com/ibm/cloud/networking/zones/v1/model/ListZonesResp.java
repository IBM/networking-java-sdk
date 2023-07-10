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
package com.ibm.cloud.networking.zones.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * list zones response.
 */
public class ListZonesResp extends GenericModel {

  protected Boolean success;
  protected List<List<String>> errors;
  protected List<List<String>> messages;
  protected List<ZoneDetails> result;
  @SerializedName("result_info")
  protected ResultInfo resultInfo;

  protected ListZonesResp() { }

  /**
   * Gets the success.
   *
   * success.
   *
   * @return the success
   */
  public Boolean isSuccess() {
    return success;
  }

  /**
   * Gets the errors.
   *
   * errors.
   *
   * @return the errors
   */
  public List<List<String>> getErrors() {
    return errors;
  }

  /**
   * Gets the messages.
   *
   * messages.
   *
   * @return the messages
   */
  public List<List<String>> getMessages() {
    return messages;
  }

  /**
   * Gets the result.
   *
   * zone list.
   *
   * @return the result
   */
  public List<ZoneDetails> getResult() {
    return result;
  }

  /**
   * Gets the resultInfo.
   *
   * result information.
   *
   * @return the resultInfo
   */
  public ResultInfo getResultInfo() {
    return resultInfo;
  }
}

