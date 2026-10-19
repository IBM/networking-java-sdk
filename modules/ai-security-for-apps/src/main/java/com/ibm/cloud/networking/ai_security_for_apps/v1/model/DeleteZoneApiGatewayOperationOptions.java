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
 * The deleteZoneApiGatewayOperation options.
 */
public class DeleteZoneApiGatewayOperationOptions extends GenericModel {

  protected String operationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String operationId;

    /**
     * Instantiates a new Builder from an existing DeleteZoneApiGatewayOperationOptions instance.
     *
     * @param deleteZoneApiGatewayOperationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteZoneApiGatewayOperationOptions deleteZoneApiGatewayOperationOptions) {
      this.operationId = deleteZoneApiGatewayOperationOptions.operationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param operationId the operationId
     */
    public Builder(String operationId) {
      this.operationId = operationId;
    }

    /**
     * Builds a DeleteZoneApiGatewayOperationOptions.
     *
     * @return the new DeleteZoneApiGatewayOperationOptions instance
     */
    public DeleteZoneApiGatewayOperationOptions build() {
      return new DeleteZoneApiGatewayOperationOptions(this);
    }

    /**
     * Set the operationId.
     *
     * @param operationId the operationId
     * @return the DeleteZoneApiGatewayOperationOptions builder
     */
    public Builder operationId(String operationId) {
      this.operationId = operationId;
      return this;
    }
  }

  protected DeleteZoneApiGatewayOperationOptions() { }

  protected DeleteZoneApiGatewayOperationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.operationId,
      "operationId cannot be empty");
    operationId = builder.operationId;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneApiGatewayOperationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the operationId.
   *
   * UUID of the API Gateway operation.
   *
   * @return the operationId
   */
  public String operationId() {
    return operationId;
  }
}

