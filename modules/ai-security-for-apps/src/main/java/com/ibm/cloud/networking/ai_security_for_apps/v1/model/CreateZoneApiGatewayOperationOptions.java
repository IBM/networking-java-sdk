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
 * The createZoneApiGatewayOperation options.
 */
public class CreateZoneApiGatewayOperationOptions extends GenericModel {

  protected List<ApiGatewayOperation> apiGatewayOperation;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ApiGatewayOperation> apiGatewayOperation;

    /**
     * Instantiates a new Builder from an existing CreateZoneApiGatewayOperationOptions instance.
     *
     * @param createZoneApiGatewayOperationOptions the instance to initialize the Builder with
     */
    private Builder(CreateZoneApiGatewayOperationOptions createZoneApiGatewayOperationOptions) {
      this.apiGatewayOperation = createZoneApiGatewayOperationOptions.apiGatewayOperation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateZoneApiGatewayOperationOptions.
     *
     * @return the new CreateZoneApiGatewayOperationOptions instance
     */
    public CreateZoneApiGatewayOperationOptions build() {
      return new CreateZoneApiGatewayOperationOptions(this);
    }

    /**
     * Adds a new element to apiGatewayOperation.
     *
     * @param apiGatewayOperation the new element to be added
     * @return the CreateZoneApiGatewayOperationOptions builder
     */
    public Builder addApiGatewayOperation(ApiGatewayOperation apiGatewayOperation) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(apiGatewayOperation,
        "apiGatewayOperation cannot be null");
      if (this.apiGatewayOperation == null) {
        this.apiGatewayOperation = new ArrayList<ApiGatewayOperation>();
      }
      this.apiGatewayOperation.add(apiGatewayOperation);
      return this;
    }

    /**
     * Set the apiGatewayOperation.
     * Existing apiGatewayOperation will be replaced.
     *
     * @param apiGatewayOperation the apiGatewayOperation
     * @return the CreateZoneApiGatewayOperationOptions builder
     */
    public Builder apiGatewayOperation(List<ApiGatewayOperation> apiGatewayOperation) {
      this.apiGatewayOperation = apiGatewayOperation;
      return this;
    }
  }

  protected CreateZoneApiGatewayOperationOptions() { }

  protected CreateZoneApiGatewayOperationOptions(Builder builder) {
    apiGatewayOperation = builder.apiGatewayOperation;
  }

  /**
   * New builder.
   *
   * @return a CreateZoneApiGatewayOperationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiGatewayOperation.
   *
   * List of operations to create.
   *
   * @return the apiGatewayOperation
   */
  public List<ApiGatewayOperation> apiGatewayOperation() {
    return apiGatewayOperation;
  }
}

