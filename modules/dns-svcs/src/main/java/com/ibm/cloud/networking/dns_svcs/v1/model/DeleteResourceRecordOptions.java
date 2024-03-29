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
 * The deleteResourceRecord options.
 */
public class DeleteResourceRecordOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String recordId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String recordId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing DeleteResourceRecordOptions instance.
     *
     * @param deleteResourceRecordOptions the instance to initialize the Builder with
     */
    private Builder(DeleteResourceRecordOptions deleteResourceRecordOptions) {
      this.instanceId = deleteResourceRecordOptions.instanceId;
      this.dnszoneId = deleteResourceRecordOptions.dnszoneId;
      this.recordId = deleteResourceRecordOptions.recordId;
      this.xCorrelationId = deleteResourceRecordOptions.xCorrelationId;
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
     * @param recordId the recordId
     */
    public Builder(String instanceId, String dnszoneId, String recordId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
      this.recordId = recordId;
    }

    /**
     * Builds a DeleteResourceRecordOptions.
     *
     * @return the new DeleteResourceRecordOptions instance
     */
    public DeleteResourceRecordOptions build() {
      return new DeleteResourceRecordOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteResourceRecordOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the DeleteResourceRecordOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the DeleteResourceRecordOptions builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the DeleteResourceRecordOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected DeleteResourceRecordOptions() { }

  protected DeleteResourceRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordId,
      "recordId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    recordId = builder.recordId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a DeleteResourceRecordOptions builder
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
   * Gets the recordId.
   *
   * The unique identifier of a resource record.
   *
   * @return the recordId
   */
  public String recordId() {
    return recordId;
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

