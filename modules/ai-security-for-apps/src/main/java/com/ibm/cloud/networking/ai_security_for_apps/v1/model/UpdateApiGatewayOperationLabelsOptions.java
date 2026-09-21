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
 * The updateApiGatewayOperationLabels options.
 */
public class UpdateApiGatewayOperationLabelsOptions extends GenericModel {

  protected ApiGatewayOperationsLabelsInputUser user;
  protected ApiGatewayOperationsLabelsInputManaged managed;
  protected ApiGatewayOperationsLabelsInputSelector selector;

  /**
   * Builder.
   */
  public static class Builder {
    private ApiGatewayOperationsLabelsInputUser user;
    private ApiGatewayOperationsLabelsInputManaged managed;
    private ApiGatewayOperationsLabelsInputSelector selector;

    /**
     * Instantiates a new Builder from an existing UpdateApiGatewayOperationLabelsOptions instance.
     *
     * @param updateApiGatewayOperationLabelsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateApiGatewayOperationLabelsOptions updateApiGatewayOperationLabelsOptions) {
      this.user = updateApiGatewayOperationLabelsOptions.user;
      this.managed = updateApiGatewayOperationLabelsOptions.managed;
      this.selector = updateApiGatewayOperationLabelsOptions.selector;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateApiGatewayOperationLabelsOptions.
     *
     * @return the new UpdateApiGatewayOperationLabelsOptions instance
     */
    public UpdateApiGatewayOperationLabelsOptions build() {
      return new UpdateApiGatewayOperationLabelsOptions(this);
    }

    /**
     * Set the user.
     *
     * @param user the user
     * @return the UpdateApiGatewayOperationLabelsOptions builder
     */
    public Builder user(ApiGatewayOperationsLabelsInputUser user) {
      this.user = user;
      return this;
    }

    /**
     * Set the managed.
     *
     * @param managed the managed
     * @return the UpdateApiGatewayOperationLabelsOptions builder
     */
    public Builder managed(ApiGatewayOperationsLabelsInputManaged managed) {
      this.managed = managed;
      return this;
    }

    /**
     * Set the selector.
     *
     * @param selector the selector
     * @return the UpdateApiGatewayOperationLabelsOptions builder
     */
    public Builder selector(ApiGatewayOperationsLabelsInputSelector selector) {
      this.selector = selector;
      return this;
    }
  }

  protected UpdateApiGatewayOperationLabelsOptions() { }

  protected UpdateApiGatewayOperationLabelsOptions(Builder builder) {
    user = builder.user;
    managed = builder.managed;
    selector = builder.selector;
  }

  /**
   * New builder.
   *
   * @return a UpdateApiGatewayOperationLabelsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the user.
   *
   * User-defined labels to apply.
   *
   * @return the user
   */
  public ApiGatewayOperationsLabelsInputUser user() {
    return user;
  }

  /**
   * Gets the managed.
   *
   * Managed labels to apply (e.g. cf-llm).
   *
   * @return the managed
   */
  public ApiGatewayOperationsLabelsInputManaged managed() {
    return managed;
  }

  /**
   * Gets the selector.
   *
   * Selector specifying which operations to label.
   *
   * @return the selector
   */
  public ApiGatewayOperationsLabelsInputSelector selector() {
    return selector;
  }
}

