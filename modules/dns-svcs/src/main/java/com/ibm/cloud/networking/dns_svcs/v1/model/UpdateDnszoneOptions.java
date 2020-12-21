/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateDnszone options.
 */
public class UpdateDnszoneOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String description;
  protected String label;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String description;
    private String label;
    private String xCorrelationId;

    private Builder(UpdateDnszoneOptions updateDnszoneOptions) {
      this.instanceId = updateDnszoneOptions.instanceId;
      this.dnszoneId = updateDnszoneOptions.dnszoneId;
      this.description = updateDnszoneOptions.description;
      this.label = updateDnszoneOptions.label;
      this.xCorrelationId = updateDnszoneOptions.xCorrelationId;
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
     */
    public Builder(String instanceId, String dnszoneId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
    }

    /**
     * Builds a UpdateDnszoneOptions.
     *
     * @return the new UpdateDnszoneOptions instance
     */
    public UpdateDnszoneOptions build() {
      return new UpdateDnszoneOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateDnszoneOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the UpdateDnszoneOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateDnszoneOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the UpdateDnszoneOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateDnszoneOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateDnszoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    description = builder.description;
    label = builder.label;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateDnszoneOptions builder
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
   * Gets the description.
   *
   * The text describing the purpose of a DNS zone.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * The label of a DNS zone.
   *
   * @return the label
   */
  public String label() {
    return label;
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

