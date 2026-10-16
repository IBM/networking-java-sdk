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
 * The setZoneApiGatewayOperationLabels options.
 */
public class SetZoneApiGatewayOperationLabelsOptions extends GenericModel {

  protected String operationId;
  protected List<String> user;
  protected List<String> managed;

  /**
   * Builder.
   */
  public static class Builder {
    private String operationId;
    private List<String> user;
    private List<String> managed;

    /**
     * Instantiates a new Builder from an existing SetZoneApiGatewayOperationLabelsOptions instance.
     *
     * @param setZoneApiGatewayOperationLabelsOptions the instance to initialize the Builder with
     */
    private Builder(SetZoneApiGatewayOperationLabelsOptions setZoneApiGatewayOperationLabelsOptions) {
      this.operationId = setZoneApiGatewayOperationLabelsOptions.operationId;
      this.user = setZoneApiGatewayOperationLabelsOptions.user;
      this.managed = setZoneApiGatewayOperationLabelsOptions.managed;
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
     * Builds a SetZoneApiGatewayOperationLabelsOptions.
     *
     * @return the new SetZoneApiGatewayOperationLabelsOptions instance
     */
    public SetZoneApiGatewayOperationLabelsOptions build() {
      return new SetZoneApiGatewayOperationLabelsOptions(this);
    }

    /**
     * Adds a new element to user.
     *
     * @param user the new element to be added
     * @return the SetZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder addUser(String user) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(user,
        "user cannot be null");
      if (this.user == null) {
        this.user = new ArrayList<String>();
      }
      this.user.add(user);
      return this;
    }

    /**
     * Adds a new element to managed.
     *
     * @param managed the new element to be added
     * @return the SetZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder addManaged(String managed) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(managed,
        "managed cannot be null");
      if (this.managed == null) {
        this.managed = new ArrayList<String>();
      }
      this.managed.add(managed);
      return this;
    }

    /**
     * Set the operationId.
     *
     * @param operationId the operationId
     * @return the SetZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder operationId(String operationId) {
      this.operationId = operationId;
      return this;
    }

    /**
     * Set the user.
     * Existing user will be replaced.
     *
     * @param user the user
     * @return the SetZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder user(List<String> user) {
      this.user = user;
      return this;
    }

    /**
     * Set the managed.
     * Existing managed will be replaced.
     *
     * @param managed the managed
     * @return the SetZoneApiGatewayOperationLabelsOptions builder
     */
    public Builder managed(List<String> managed) {
      this.managed = managed;
      return this;
    }
  }

  protected SetZoneApiGatewayOperationLabelsOptions() { }

  protected SetZoneApiGatewayOperationLabelsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.operationId,
      "operationId cannot be empty");
    operationId = builder.operationId;
    user = builder.user;
    managed = builder.managed;
  }

  /**
   * New builder.
   *
   * @return a SetZoneApiGatewayOperationLabelsOptions builder
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

  /**
   * Gets the user.
   *
   * Flat list of user-defined label names to attach. Must be present; send an empty array if no user labels are needed.
   *
   * @return the user
   */
  public List<String> user() {
    return user;
  }

  /**
   * Gets the managed.
   *
   * Flat list of managed label names to attach (e.g. cf-llm).
   *
   * @return the managed
   */
  public List<String> managed() {
    return managed;
  }
}

