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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteZoneApiGatewayOperationLabels options.
 */
public class DeleteZoneApiGatewayOperationLabelsOptions extends GenericModel {

  protected ApiGatewayOperationsLabelsBulkDeleteInputSelector selector;
  protected ApiGatewayOperationsLabelsBulkDeleteInputUser user;
  protected ApiGatewayOperationsLabelsBulkDeleteInputManaged managed;

  /**
   * Builder.
   */
  public static class Builder {
    private ApiGatewayOperationsLabelsBulkDeleteInputSelector selector;
    private ApiGatewayOperationsLabelsBulkDeleteInputUser user;
    private ApiGatewayOperationsLabelsBulkDeleteInputManaged managed;

    /**
     * Instantiates a new Builder from an existing DeleteZoneApiGatewayOperationLabelsOptions instance.
     *
     * @param deleteZoneApiGatewayOperationLabelsOptions the instance to initialize the Builder with
     */
    private Builder(DeleteZoneApiGatewayOperationLabelsOptions deleteZoneApiGatewayOperationLabelsOptions) {
      this.selector = deleteZoneApiGatewayOperationLabelsOptions.selector;
      this.user = deleteZoneApiGatewayOperationLabelsOptions.user;
      this.managed = deleteZoneApiGatewayOperationLabelsOptions.managed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteZoneApiGatewayOperationLabelsOptions.
     *
     * @return the new DeleteZoneApiGatewayOperationLabelsOptions instance
     */
    public DeleteZoneApiGatewayOperationLabelsOptions build() {
      return new DeleteZoneApiGatewayOperationLabelsOptions(this);
    }

    /**
     * Set the selector.
     *
     * @param selector the selector
     * @return the DeleteZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder selector(ApiGatewayOperationsLabelsBulkDeleteInputSelector selector) {
      this.selector = selector;
      return this;
    }

    /**
     * Set the user.
     *
     * @param user the user
     * @return the DeleteZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder user(ApiGatewayOperationsLabelsBulkDeleteInputUser user) {
      this.user = user;
      return this;
    }

    /**
     * Set the managed.
     *
     * @param managed the managed
     * @return the DeleteZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder managed(ApiGatewayOperationsLabelsBulkDeleteInputManaged managed) {
      this.managed = managed;
      return this;
    }
  }

  protected DeleteZoneApiGatewayOperationLabelsOptions() { }

  protected DeleteZoneApiGatewayOperationLabelsOptions(Builder builder) {
    selector = builder.selector;
    user = builder.user;
    managed = builder.managed;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneApiGatewayOperationLabelsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the selector.
   *
   * Selector specifying which operations to affect.
   *
   * @return the selector
   */
  public ApiGatewayOperationsLabelsBulkDeleteInputSelector selector() {
    return selector;
  }

  /**
   * Gets the user.
   *
   * User-defined labels to remove.
   *
   * @return the user
   */
  public ApiGatewayOperationsLabelsBulkDeleteInputUser user() {
    return user;
  }

  /**
   * Gets the managed.
   *
   * Managed labels to remove.
   *
   * @return the managed
   */
  public ApiGatewayOperationsLabelsBulkDeleteInputManaged managed() {
    return managed;
  }
}

