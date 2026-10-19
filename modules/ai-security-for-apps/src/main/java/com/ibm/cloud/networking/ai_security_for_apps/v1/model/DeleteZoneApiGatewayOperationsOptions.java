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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteZoneApiGatewayOperations options.
 */
public class DeleteZoneApiGatewayOperationsOptions extends GenericModel {

  protected List<ApiGatewayOperationsDeleteInputItem> apiGatewayOperationsDeleteInputItem;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ApiGatewayOperationsDeleteInputItem> apiGatewayOperationsDeleteInputItem;

    /**
     * Instantiates a new Builder from an existing DeleteZoneApiGatewayOperationsOptions instance.
     *
     * @param deleteZoneApiGatewayOperationsOptions the instance to initialize the Builder with
     */
    private Builder(DeleteZoneApiGatewayOperationsOptions deleteZoneApiGatewayOperationsOptions) {
      this.apiGatewayOperationsDeleteInputItem = deleteZoneApiGatewayOperationsOptions.apiGatewayOperationsDeleteInputItem;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param apiGatewayOperationsDeleteInputItem the apiGatewayOperationsDeleteInputItem
     */
    public Builder(List<ApiGatewayOperationsDeleteInputItem> apiGatewayOperationsDeleteInputItem) {
      this.apiGatewayOperationsDeleteInputItem = apiGatewayOperationsDeleteInputItem;
    }

    /**
     * Builds a DeleteZoneApiGatewayOperationsOptions.
     *
     * @return the new DeleteZoneApiGatewayOperationsOptions instance
     */
    public DeleteZoneApiGatewayOperationsOptions build() {
      return new DeleteZoneApiGatewayOperationsOptions(this);
    }

    /**
     * Adds a new element to apiGatewayOperationsDeleteInputItem.
     *
     * @param apiGatewayOperationsDeleteInputItem the new element to be added
     * @return the DeleteZoneApiGatewayOperationsOptions builder
     */
    public Builder addApiGatewayOperationsDeleteInputItem(ApiGatewayOperationsDeleteInputItem apiGatewayOperationsDeleteInputItem) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(apiGatewayOperationsDeleteInputItem,
        "apiGatewayOperationsDeleteInputItem cannot be null");
      if (this.apiGatewayOperationsDeleteInputItem == null) {
        this.apiGatewayOperationsDeleteInputItem = new ArrayList<ApiGatewayOperationsDeleteInputItem>();
      }
      this.apiGatewayOperationsDeleteInputItem.add(apiGatewayOperationsDeleteInputItem);
      return this;
    }

    /**
     * Set the apiGatewayOperationsDeleteInputItem.
     * Existing apiGatewayOperationsDeleteInputItem will be replaced.
     *
     * @param apiGatewayOperationsDeleteInputItem the apiGatewayOperationsDeleteInputItem
     * @return the DeleteZoneApiGatewayOperationsOptions builder
     */
    public Builder apiGatewayOperationsDeleteInputItem(List<ApiGatewayOperationsDeleteInputItem> apiGatewayOperationsDeleteInputItem) {
      this.apiGatewayOperationsDeleteInputItem = apiGatewayOperationsDeleteInputItem;
      return this;
    }
  }

  protected DeleteZoneApiGatewayOperationsOptions() { }

  protected DeleteZoneApiGatewayOperationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiGatewayOperationsDeleteInputItem,
      "apiGatewayOperationsDeleteInputItem cannot be null");
    apiGatewayOperationsDeleteInputItem = builder.apiGatewayOperationsDeleteInputItem;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneApiGatewayOperationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiGatewayOperationsDeleteInputItem.
   *
   * List of specific operation IDs to delete.
   *
   * @return the apiGatewayOperationsDeleteInputItem
   */
  public List<ApiGatewayOperationsDeleteInputItem> apiGatewayOperationsDeleteInputItem() {
    return apiGatewayOperationsDeleteInputItem;
  }
}

