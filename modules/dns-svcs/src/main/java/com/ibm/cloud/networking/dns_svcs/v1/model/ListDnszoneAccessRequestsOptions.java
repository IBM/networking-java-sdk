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
 * The listDnszoneAccessRequests options.
 */
public class ListDnszoneAccessRequestsOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String xCorrelationId;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String xCorrelationId;
    private Long offset;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListDnszoneAccessRequestsOptions instance.
     *
     * @param listDnszoneAccessRequestsOptions the instance to initialize the Builder with
     */
    private Builder(ListDnszoneAccessRequestsOptions listDnszoneAccessRequestsOptions) {
      this.instanceId = listDnszoneAccessRequestsOptions.instanceId;
      this.dnszoneId = listDnszoneAccessRequestsOptions.dnszoneId;
      this.xCorrelationId = listDnszoneAccessRequestsOptions.xCorrelationId;
      this.offset = listDnszoneAccessRequestsOptions.offset;
      this.limit = listDnszoneAccessRequestsOptions.limit;
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
     * Builds a ListDnszoneAccessRequestsOptions.
     *
     * @return the new ListDnszoneAccessRequestsOptions instance
     */
    public ListDnszoneAccessRequestsOptions build() {
      return new ListDnszoneAccessRequestsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListDnszoneAccessRequestsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the ListDnszoneAccessRequestsOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the ListDnszoneAccessRequestsOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDnszoneAccessRequestsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDnszoneAccessRequestsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListDnszoneAccessRequestsOptions() { }

  protected ListDnszoneAccessRequestsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    xCorrelationId = builder.xCorrelationId;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListDnszoneAccessRequestsOptions builder
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
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }

  /**
   * Gets the offset.
   *
   * Specify how many resources to skip over, the default value is 0.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * Specify maximum resources might be returned.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

