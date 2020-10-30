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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Gateway statistics.  Currently data retrieval is only supported for MACsec configurations.
 */
public class GatewayStatistic extends GenericModel {

  /**
   * statistic type.
   */
  public interface Type {
    /** macsec_mka_session. */
    String MACSEC_MKA_SESSION = "macsec_mka_session";
    /** macsec_policy. */
    String MACSEC_POLICY = "macsec_policy";
    /** macsec_mka_statistics. */
    String MACSEC_MKA_STATISTICS = "macsec_mka_statistics";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String data;
  protected String type;

  /**
   * Gets the createdAt.
   *
   * Date and time data was collected.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the data.
   *
   * statistics output.
   *
   * @return the data
   */
  public String getData() {
    return data;
  }

  /**
   * Gets the type.
   *
   * statistic type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

