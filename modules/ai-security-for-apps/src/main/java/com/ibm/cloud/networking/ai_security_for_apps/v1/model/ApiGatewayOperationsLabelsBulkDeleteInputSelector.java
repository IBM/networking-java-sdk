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
 * Selector specifying which operations to affect.
 */
public class ApiGatewayOperationsLabelsBulkDeleteInputSelector extends GenericModel {

  protected ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude include;

  /**
   * Builder.
   */
  public static class Builder {
    private ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude include;

    /**
     * Instantiates a new Builder from an existing ApiGatewayOperationsLabelsBulkDeleteInputSelector instance.
     *
     * @param apiGatewayOperationsLabelsBulkDeleteInputSelector the instance to initialize the Builder with
     */
    private Builder(ApiGatewayOperationsLabelsBulkDeleteInputSelector apiGatewayOperationsLabelsBulkDeleteInputSelector) {
      this.include = apiGatewayOperationsLabelsBulkDeleteInputSelector.include;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param include the include
     */
    public Builder(ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude include) {
      this.include = include;
    }

    /**
     * Builds a ApiGatewayOperationsLabelsBulkDeleteInputSelector.
     *
     * @return the new ApiGatewayOperationsLabelsBulkDeleteInputSelector instance
     */
    public ApiGatewayOperationsLabelsBulkDeleteInputSelector build() {
      return new ApiGatewayOperationsLabelsBulkDeleteInputSelector(this);
    }

    /**
     * Set the include.
     *
     * @param include the include
     * @return the ApiGatewayOperationsLabelsBulkDeleteInputSelector builder
     */
    public Builder include(ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude include) {
      this.include = include;
      return this;
    }
  }

  protected ApiGatewayOperationsLabelsBulkDeleteInputSelector() { }

  protected ApiGatewayOperationsLabelsBulkDeleteInputSelector(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.include,
      "include cannot be null");
    include = builder.include;
  }

  /**
   * New builder.
   *
   * @return a ApiGatewayOperationsLabelsBulkDeleteInputSelector builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the include.
   *
   * Operations to include.
   *
   * @return the include
   */
  public ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude include() {
    return include;
  }
}

