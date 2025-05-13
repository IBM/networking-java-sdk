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
 * A reason for the current `status`.
 */
public class GatewayMacsecStatusReason extends GenericModel {

  /**
   * A reason code for the status:
   * - `macsec_cak_failed`: At least one of the connectivity association keys (CAKs) associated with the MACsec
   * configuration was unable to be configured on the direct link gateway. Refer to the `status` of the CAKs associated
   * with the MACsec configuration to find the the source of this reason.
   */
  public interface Code {
    /** macsec_cak_failed. */
    String MACSEC_CAK_FAILED = "macsec_cak_failed";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected GatewayMacsecStatusReason() { }

  /**
   * Gets the code.
   *
   * A reason code for the status:
   * - `macsec_cak_failed`: At least one of the connectivity association keys (CAKs) associated with the MACsec
   * configuration was unable to be configured on the direct link gateway. Refer to the `status` of the CAKs associated
   * with the MACsec configuration to find the the source of this reason.
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

