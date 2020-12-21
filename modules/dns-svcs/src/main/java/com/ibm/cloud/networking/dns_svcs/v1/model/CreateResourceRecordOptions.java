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
 * The createResourceRecord options.
 */
public class CreateResourceRecordOptions extends GenericModel {

  /**
   * Type of the resource record.
   */
  public interface Type {
    /** A. */
    String A = "A";
    /** AAAA. */
    String AAAA = "AAAA";
    /** CNAME. */
    String CNAME = "CNAME";
    /** MX. */
    String MX = "MX";
    /** SRV. */
    String SRV = "SRV";
    /** TXT. */
    String TXT = "TXT";
    /** PTR. */
    String PTR = "PTR";
  }

  protected String instanceId;
  protected String dnszoneId;
  protected String name;
  protected String type;
  protected ResourceRecordInputRdata rdata;
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
    private String name;
    private String type;
    private ResourceRecordInputRdata rdata;
    private Long ttl;
    private String service;
    private String protocol;
    private String xCorrelationId;

    private Builder(CreateResourceRecordOptions createResourceRecordOptions) {
      this.instanceId = createResourceRecordOptions.instanceId;
      this.dnszoneId = createResourceRecordOptions.dnszoneId;
      this.name = createResourceRecordOptions.name;
      this.type = createResourceRecordOptions.type;
      this.rdata = createResourceRecordOptions.rdata;
      this.ttl = createResourceRecordOptions.ttl;
      this.service = createResourceRecordOptions.service;
      this.protocol = createResourceRecordOptions.protocol;
      this.xCorrelationId = createResourceRecordOptions.xCorrelationId;
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
     * Builds a CreateResourceRecordOptions.
     *
     * @return the new CreateResourceRecordOptions instance
     */
    public CreateResourceRecordOptions build() {
      return new CreateResourceRecordOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateResourceRecordOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the CreateResourceRecordOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateResourceRecordOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateResourceRecordOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the rdata.
     *
     * @param rdata the rdata
     * @return the CreateResourceRecordOptions builder
     */
    public Builder rdata(ResourceRecordInputRdata rdata) {
      this.rdata = rdata;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the CreateResourceRecordOptions builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the service.
     *
     * @param service the service
     * @return the CreateResourceRecordOptions builder
     */
    public Builder service(String service) {
      this.service = service;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the CreateResourceRecordOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreateResourceRecordOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreateResourceRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    name = builder.name;
    type = builder.type;
    rdata = builder.rdata;
    ttl = builder.ttl;
    service = builder.service;
    protocol = builder.protocol;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreateResourceRecordOptions builder
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
   * Gets the type.
   *
   * Type of the resource record.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the rdata.
   *
   * Content of the resource record.
   *
   * @return the rdata
   */
  public ResourceRecordInputRdata rdata() {
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

