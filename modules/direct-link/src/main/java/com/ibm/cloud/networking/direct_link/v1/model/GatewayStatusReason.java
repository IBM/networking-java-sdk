/*
 * (C) Copyright IBM Corp. 2025.
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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A reason for the current `operational_status`.
 */
public class GatewayStatusReason extends GenericModel {

  /**
   * A reason code for the status:
   * - `authentication_key_failed`: `authentication_key` was unable to be configured on the direct link gateway. To
   * recover, first resolve any issues with your key, then patch the gateway with the same or new key.
   */
  public interface Code {
    /** authentication_key_failed. */
    String AUTHENTICATION_KEY_FAILED = "authentication_key_failed";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected GatewayStatusReason() { }

  /**
   * Gets the code.
   *
   * A reason code for the status:
   * - `authentication_key_failed`: `authentication_key` was unable to be configured on the direct link gateway. To
   * recover, first resolve any issues with your key, then patch the gateway with the same or new key.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An explanation of the status reason.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * Link to documentation about this status reason.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

