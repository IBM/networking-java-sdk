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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Operations to include in the label operation.
 */
public class ApiGatewayOperationsLabelsBulkInputSelectorInclude extends GenericModel {

  @SerializedName("operation_ids")
  protected List<String> operationIds;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> operationIds;

    /**
     * Instantiates a new Builder from an existing ApiGatewayOperationsLabelsBulkInputSelectorInclude instance.
     *
     * @param apiGatewayOperationsLabelsBulkInputSelectorInclude the instance to initialize the Builder with
     */
    private Builder(ApiGatewayOperationsLabelsBulkInputSelectorInclude apiGatewayOperationsLabelsBulkInputSelectorInclude) {
      this.operationIds = apiGatewayOperationsLabelsBulkInputSelectorInclude.operationIds;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ApiGatewayOperationsLabelsBulkInputSelectorInclude.
     *
     * @return the new ApiGatewayOperationsLabelsBulkInputSelectorInclude instance
     */
    public ApiGatewayOperationsLabelsBulkInputSelectorInclude build() {
      return new ApiGatewayOperationsLabelsBulkInputSelectorInclude(this);
    }

    /**
     * Adds a new element to operationIds.
     *
     * @param operationIds the new element to be added
     * @return the ApiGatewayOperationsLabelsBulkInputSelectorInclude builder
     */
    public Builder addOperationIds(String operationIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(operationIds,
        "operationIds cannot be null");
      if (this.operationIds == null) {
        this.operationIds = new ArrayList<String>();
      }
      this.operationIds.add(operationIds);
      return this;
    }

    /**
     * Set the operationIds.
     * Existing operationIds will be replaced.
     *
     * @param operationIds the operationIds
     * @return the ApiGatewayOperationsLabelsBulkInputSelectorInclude builder
     */
    public Builder operationIds(List<String> operationIds) {
      this.operationIds = operationIds;
      return this;
    }
  }

  protected ApiGatewayOperationsLabelsBulkInputSelectorInclude() { }

  protected ApiGatewayOperationsLabelsBulkInputSelectorInclude(Builder builder) {
    operationIds = builder.operationIds;
  }

  /**
   * New builder.
   *
   * @return a ApiGatewayOperationsLabelsBulkInputSelectorInclude builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the operationIds.
   *
   * Array of operation UUIDs to label.
   *
   * @return the operationIds
   */
  public List<String> operationIds() {
    return operationIds;
  }
}

