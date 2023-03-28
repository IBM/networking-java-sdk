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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateGatewayExportRouteFilter options.
 */
public class UpdateGatewayExportRouteFilterOptions extends GenericModel {

  protected String gatewayId;
  protected String id;
  protected Map<String, Object> updateRouteFilterTemplatePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String id;
    private Map<String, Object> updateRouteFilterTemplatePatch;

    /**
     * Instantiates a new Builder from an existing UpdateGatewayExportRouteFilterOptions instance.
     *
     * @param updateGatewayExportRouteFilterOptions the instance to initialize the Builder with
     */
    private Builder(UpdateGatewayExportRouteFilterOptions updateGatewayExportRouteFilterOptions) {
      this.gatewayId = updateGatewayExportRouteFilterOptions.gatewayId;
      this.id = updateGatewayExportRouteFilterOptions.id;
      this.updateRouteFilterTemplatePatch = updateGatewayExportRouteFilterOptions.updateRouteFilterTemplatePatch;
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
     * @param id the id
     * @param updateRouteFilterTemplatePatch the updateRouteFilterTemplatePatch
     */
    public Builder(String gatewayId, String id, Map<String, Object> updateRouteFilterTemplatePatch) {
      this.gatewayId = gatewayId;
      this.id = id;
      this.updateRouteFilterTemplatePatch = updateRouteFilterTemplatePatch;
    }

    /**
     * Builds a UpdateGatewayExportRouteFilterOptions.
     *
     * @return the new UpdateGatewayExportRouteFilterOptions instance
     */
    public UpdateGatewayExportRouteFilterOptions build() {
      return new UpdateGatewayExportRouteFilterOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the UpdateGatewayExportRouteFilterOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayExportRouteFilterOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the updateRouteFilterTemplatePatch.
     *
     * @param updateRouteFilterTemplatePatch the updateRouteFilterTemplatePatch
     * @return the UpdateGatewayExportRouteFilterOptions builder
     */
    public Builder updateRouteFilterTemplatePatch(Map<String, Object> updateRouteFilterTemplatePatch) {
      this.updateRouteFilterTemplatePatch = updateRouteFilterTemplatePatch;
      return this;
    }
  }

  protected UpdateGatewayExportRouteFilterOptions() { }

  protected UpdateGatewayExportRouteFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.updateRouteFilterTemplatePatch,
      "updateRouteFilterTemplatePatch cannot be null");
    gatewayId = builder.gatewayId;
    id = builder.id;
    updateRouteFilterTemplatePatch = builder.updateRouteFilterTemplatePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayExportRouteFilterOptions builder
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
   * Gets the id.
   *
   * Identifier of an import route filter.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the updateRouteFilterTemplatePatch.
   *
   * The export route filter update template.
   *
   * @return the updateRouteFilterTemplatePatch
   */
  public Map<String, Object> updateRouteFilterTemplatePatch() {
    return updateRouteFilterTemplatePatch;
  }
}

