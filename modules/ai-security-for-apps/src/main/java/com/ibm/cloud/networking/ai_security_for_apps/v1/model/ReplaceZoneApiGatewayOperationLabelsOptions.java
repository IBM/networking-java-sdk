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
 * The replaceZoneApiGatewayOperationLabels options.
 */
public class ReplaceZoneApiGatewayOperationLabelsOptions extends GenericModel {

  protected ApiGatewayOperationsLabelsBulkInputSelector selector;
  protected ApiGatewayOperationsLabelsBulkInputUser user;
  protected ApiGatewayOperationsLabelsBulkInputManaged managed;

  /**
   * Builder.
   */
  public static class Builder {
    private ApiGatewayOperationsLabelsBulkInputSelector selector;
    private ApiGatewayOperationsLabelsBulkInputUser user;
    private ApiGatewayOperationsLabelsBulkInputManaged managed;

    /**
     * Instantiates a new Builder from an existing ReplaceZoneApiGatewayOperationLabelsOptions instance.
     *
     * @param replaceZoneApiGatewayOperationLabelsOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceZoneApiGatewayOperationLabelsOptions replaceZoneApiGatewayOperationLabelsOptions) {
      this.selector = replaceZoneApiGatewayOperationLabelsOptions.selector;
      this.user = replaceZoneApiGatewayOperationLabelsOptions.user;
      this.managed = replaceZoneApiGatewayOperationLabelsOptions.managed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceZoneApiGatewayOperationLabelsOptions.
     *
     * @return the new ReplaceZoneApiGatewayOperationLabelsOptions instance
     */
    public ReplaceZoneApiGatewayOperationLabelsOptions build() {
      return new ReplaceZoneApiGatewayOperationLabelsOptions(this);
    }

    /**
     * Set the selector.
     *
     * @param selector the selector
     * @return the ReplaceZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder selector(ApiGatewayOperationsLabelsBulkInputSelector selector) {
      this.selector = selector;
      return this;
    }

    /**
     * Set the user.
     *
     * @param user the user
     * @return the ReplaceZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder user(ApiGatewayOperationsLabelsBulkInputUser user) {
      this.user = user;
      return this;
    }

    /**
     * Set the managed.
     *
     * @param managed the managed
     * @return the ReplaceZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder managed(ApiGatewayOperationsLabelsBulkInputManaged managed) {
      this.managed = managed;
      return this;
    }
  }

  protected ReplaceZoneApiGatewayOperationLabelsOptions() { }

  protected ReplaceZoneApiGatewayOperationLabelsOptions(Builder builder) {
    selector = builder.selector;
    user = builder.user;
    managed = builder.managed;
  }

  /**
   * New builder.
   *
   * @return a ReplaceZoneApiGatewayOperationLabelsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the selector.
   *
   * Selector specifying which operations to label.
   *
   * @return the selector
   */
  public ApiGatewayOperationsLabelsBulkInputSelector selector() {
    return selector;
  }

  /**
   * Gets the user.
   *
   * User-defined labels to apply.
   *
   * @return the user
   */
  public ApiGatewayOperationsLabelsBulkInputUser user() {
    return user;
  }

  /**
   * Gets the managed.
   *
   * Managed labels to apply (e.g. cf-llm).
   *
   * @return the managed
   */
  public ApiGatewayOperationsLabelsBulkInputManaged managed() {
    return managed;
  }
}

