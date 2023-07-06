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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDnszoneAccessRequest options.
 */
public class UpdateDnszoneAccessRequestOptions extends GenericModel {

  /**
   * The action applies to the access request.
   */
  public interface Action {
    /** APPROVE. */
    String APPROVE = "APPROVE";
    /** REJECT. */
    String REJECT = "REJECT";
    /** REVOKE. */
    String REVOKE = "REVOKE";
  }

  protected String instanceId;
  protected String dnszoneId;
  protected String requestId;
  protected String action;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String requestId;
    private String action;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing UpdateDnszoneAccessRequestOptions instance.
     *
     * @param updateDnszoneAccessRequestOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDnszoneAccessRequestOptions updateDnszoneAccessRequestOptions) {
      this.instanceId = updateDnszoneAccessRequestOptions.instanceId;
      this.dnszoneId = updateDnszoneAccessRequestOptions.dnszoneId;
      this.requestId = updateDnszoneAccessRequestOptions.requestId;
      this.action = updateDnszoneAccessRequestOptions.action;
      this.xCorrelationId = updateDnszoneAccessRequestOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param dnszoneId the dnszoneId
     * @param requestId the requestId
     */
    public Builder(String instanceId, String dnszoneId, String requestId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
      this.requestId = requestId;
    }

    /**
     * Builds a UpdateDnszoneAccessRequestOptions.
     *
     * @return the new UpdateDnszoneAccessRequestOptions instance
     */
    public UpdateDnszoneAccessRequestOptions build() {
      return new UpdateDnszoneAccessRequestOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateDnszoneAccessRequestOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the UpdateDnszoneAccessRequestOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the requestId.
     *
     * @param requestId the requestId
     * @return the UpdateDnszoneAccessRequestOptions builder
     */
    public Builder requestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateDnszoneAccessRequestOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateDnszoneAccessRequestOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateDnszoneAccessRequestOptions() { }

  protected UpdateDnszoneAccessRequestOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.requestId,
      "requestId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    requestId = builder.requestId;
    action = builder.action;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateDnszoneAccessRequestOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the dnszoneId.
   *
   * The unique identifier of a DNS zone.
   *
   * @return the dnszoneId
   */
  public String dnszoneId() {
    return dnszoneId;
  }

  /**
   * Gets the requestId.
   *
   * The unique identifier of an access request.
   *
   * @return the requestId
   */
  public String requestId() {
    return requestId;
  }

  /**
   * Gets the action.
   *
   * The action applies to the access request.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

