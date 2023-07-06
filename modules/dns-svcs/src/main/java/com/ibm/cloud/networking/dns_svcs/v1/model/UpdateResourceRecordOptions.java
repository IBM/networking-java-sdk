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
 * The updateResourceRecord options.
 */
public class UpdateResourceRecordOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String recordId;
  protected String name;
  protected ResourceRecordUpdateInputRdata rdata;
  protected Long ttl;
  protected String service;
  protected String protocol;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String recordId;
    private String name;
    private ResourceRecordUpdateInputRdata rdata;
    private Long ttl;
    private String service;
    private String protocol;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing UpdateResourceRecordOptions instance.
     *
     * @param updateResourceRecordOptions the instance to initialize the Builder with
     */
    private Builder(UpdateResourceRecordOptions updateResourceRecordOptions) {
      this.instanceId = updateResourceRecordOptions.instanceId;
      this.dnszoneId = updateResourceRecordOptions.dnszoneId;
      this.recordId = updateResourceRecordOptions.recordId;
      this.name = updateResourceRecordOptions.name;
      this.rdata = updateResourceRecordOptions.rdata;
      this.ttl = updateResourceRecordOptions.ttl;
      this.service = updateResourceRecordOptions.service;
      this.protocol = updateResourceRecordOptions.protocol;
      this.xCorrelationId = updateResourceRecordOptions.xCorrelationId;
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
     * Builds a UpdateResourceRecordOptions.
     *
     * @return the new UpdateResourceRecordOptions instance
     */
    public UpdateResourceRecordOptions build() {
      return new UpdateResourceRecordOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rdata.
     *
     * @param rdata the rdata
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder rdata(ResourceRecordUpdateInputRdata rdata) {
      this.rdata = rdata;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the service.
     *
     * @param service the service
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder service(String service) {
      this.service = service;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateResourceRecordOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateResourceRecordOptions() { }

  protected UpdateResourceRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordId,
      "recordId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    recordId = builder.recordId;
    name = builder.name;
    rdata = builder.rdata;
    ttl = builder.ttl;
    service = builder.service;
    protocol = builder.protocol;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateResourceRecordOptions builder
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
   * Gets the name.
   *
   * Name of the resource record.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the rdata.
   *
   * Content of the resource record.
   *
   * @return the rdata
   */
  public ResourceRecordUpdateInputRdata rdata() {
    return rdata;
  }

  /**
   * Gets the ttl.
   *
   * Time to live in second.
   *
   * @return the ttl
   */
  public Long ttl() {
    return ttl;
  }

  /**
   * Gets the service.
   *
   * Only used for SRV record.
   *
   * @return the service
   */
  public String service() {
    return service;
  }

  /**
   * Gets the protocol.
   *
   * Only used for SRV record.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
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

