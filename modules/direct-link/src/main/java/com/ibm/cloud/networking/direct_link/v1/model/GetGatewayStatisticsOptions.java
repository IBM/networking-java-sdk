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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getGatewayStatistics options.
 */
public class GetGatewayStatisticsOptions extends GenericModel {

  /**
   * Specify statistic to retrieve.
   */
  public interface Type {
    /** macsec_mka. */
    String MACSEC_MKA = "macsec_mka";
    /** macsec_security. */
    String MACSEC_SECURITY = "macsec_security";
  }

  protected String id;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String type;

    private Builder(GetGatewayStatisticsOptions getGatewayStatisticsOptions) {
      this.id = getGatewayStatisticsOptions.id;
      this.type = getGatewayStatisticsOptions.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param type the type
     */
    public Builder(String id, String type) {
      this.id = id;
      this.type = type;
    }

    /**
     * Builds a GetGatewayStatisticsOptions.
     *
     * @return the new GetGatewayStatisticsOptions instance
     */
    public GetGatewayStatisticsOptions build() {
      return new GetGatewayStatisticsOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetGatewayStatisticsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the GetGatewayStatisticsOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected GetGatewayStatisticsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    id = builder.id;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a GetGatewayStatisticsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Specify statistic to retrieve.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

