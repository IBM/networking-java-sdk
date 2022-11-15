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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceGatewayAsPrepends options.
 */
public class ReplaceGatewayAsPrependsOptions extends GenericModel {

  protected String gatewayId;
  protected String ifMatch;
  protected List<AsPrependPrefixArrayTemplate> asPrepends;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String ifMatch;
    private List<AsPrependPrefixArrayTemplate> asPrepends;

    /**
     * Instantiates a new Builder from an existing ReplaceGatewayAsPrependsOptions instance.
     *
     * @param replaceGatewayAsPrependsOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceGatewayAsPrependsOptions replaceGatewayAsPrependsOptions) {
      this.gatewayId = replaceGatewayAsPrependsOptions.gatewayId;
      this.ifMatch = replaceGatewayAsPrependsOptions.ifMatch;
      this.asPrepends = replaceGatewayAsPrependsOptions.asPrepends;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param gatewayId the gatewayId
     * @param ifMatch the ifMatch
     */
    public Builder(String gatewayId, String ifMatch) {
      this.gatewayId = gatewayId;
      this.ifMatch = ifMatch;
    }

    /**
     * Builds a ReplaceGatewayAsPrependsOptions.
     *
     * @return the new ReplaceGatewayAsPrependsOptions instance
     */
    public ReplaceGatewayAsPrependsOptions build() {
      return new ReplaceGatewayAsPrependsOptions(this);
    }

    /**
     * Adds an asPrepends to asPrepends.
     *
     * @param asPrepends the new asPrepends
     * @return the ReplaceGatewayAsPrependsOptions builder
     */
    public Builder addAsPrepends(AsPrependPrefixArrayTemplate asPrepends) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(asPrepends,
        "asPrepends cannot be null");
      if (this.asPrepends == null) {
        this.asPrepends = new ArrayList<AsPrependPrefixArrayTemplate>();
      }
      this.asPrepends.add(asPrepends);
      return this;
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the ReplaceGatewayAsPrependsOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the ReplaceGatewayAsPrependsOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the asPrepends.
     * Existing asPrepends will be replaced.
     *
     * @param asPrepends the asPrepends
     * @return the ReplaceGatewayAsPrependsOptions builder
     */
    public Builder asPrepends(List<AsPrependPrefixArrayTemplate> asPrepends) {
      this.asPrepends = asPrepends;
      return this;
    }
  }

  protected ReplaceGatewayAsPrependsOptions() { }

  protected ReplaceGatewayAsPrependsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    gatewayId = builder.gatewayId;
    ifMatch = builder.ifMatch;
    asPrepends = builder.asPrepends;
  }

  /**
   * New builder.
   *
   * @return a ReplaceGatewayAsPrependsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gatewayId.
   *
   * Direct Link gateway identifier.
   *
   * @return the gatewayId
   */
  public String gatewayId() {
    return gatewayId;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the asPrepends.
   *
   * array of AS Prepend configuration information.
   *
   * @return the asPrepends
   */
  public List<AsPrependPrefixArrayTemplate> asPrepends() {
    return asPrepends;
  }
}

