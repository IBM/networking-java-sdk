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
package com.ibm.cloud.networking.dns_records.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDnsRecord options.
 */
public class UpdateDnsRecordOptions extends GenericModel {

  /**
   * dns record type.
   */
  public interface Type {
    /** A. */
    String A = "A";
    /** AAAA. */
    String AAAA = "AAAA";
    /** CNAME. */
    String CNAME = "CNAME";
    /** NS. */
    String NS = "NS";
    /** MX. */
    String MX = "MX";
    /** TXT. */
    String TXT = "TXT";
    /** LOC. */
    String LOC = "LOC";
    /** SRV. */
    String SRV = "SRV";
    /** SPF. */
    String SPF = "SPF";
    /** CAA. */
    String CAA = "CAA";
  }

  protected String dnsrecordIdentifier;
  protected String name;
  protected String type;
  protected Long ttl;
  protected String content;
  protected Long priority;
  protected Boolean proxied;
  protected Map<String, Object> data;

  /**
   * Builder.
   */
  public static class Builder {
    private String dnsrecordIdentifier;
    private String name;
    private String type;
    private Long ttl;
    private String content;
    private Long priority;
    private Boolean proxied;
    private Map<String, Object> data;

    private Builder(UpdateDnsRecordOptions updateDnsRecordOptions) {
      this.dnsrecordIdentifier = updateDnsRecordOptions.dnsrecordIdentifier;
      this.name = updateDnsRecordOptions.name;
      this.type = updateDnsRecordOptions.type;
      this.ttl = updateDnsRecordOptions.ttl;
      this.content = updateDnsRecordOptions.content;
      this.priority = updateDnsRecordOptions.priority;
      this.proxied = updateDnsRecordOptions.proxied;
      this.data = updateDnsRecordOptions.data;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dnsrecordIdentifier the dnsrecordIdentifier
     */
    public Builder(String dnsrecordIdentifier) {
      this.dnsrecordIdentifier = dnsrecordIdentifier;
    }

    /**
     * Builds a UpdateDnsRecordOptions.
     *
     * @return the new UpdateDnsRecordOptions instance
     */
    public UpdateDnsRecordOptions build() {
      return new UpdateDnsRecordOptions(this);
    }

    /**
     * Set the dnsrecordIdentifier.
     *
     * @param dnsrecordIdentifier the dnsrecordIdentifier
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder dnsrecordIdentifier(String dnsrecordIdentifier) {
      this.dnsrecordIdentifier = dnsrecordIdentifier;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the proxied.
     *
     * @param proxied the proxied
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder proxied(Boolean proxied) {
      this.proxied = proxied;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the UpdateDnsRecordOptions builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }
  }

  protected UpdateDnsRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnsrecordIdentifier,
      "dnsrecordIdentifier cannot be empty");
    dnsrecordIdentifier = builder.dnsrecordIdentifier;
    name = builder.name;
    type = builder.type;
    ttl = builder.ttl;
    content = builder.content;
    priority = builder.priority;
    proxied = builder.proxied;
    data = builder.data;
  }

  /**
   * New builder.
   *
   * @return a UpdateDnsRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dnsrecordIdentifier.
   *
   * Identifier of DNS record.
   *
   * @return the dnsrecordIdentifier
   */
  public String dnsrecordIdentifier() {
    return dnsrecordIdentifier;
  }

  /**
   * Gets the name.
   *
   * Required for all record types except SRV.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * dns record type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the ttl.
   *
   * dns record ttl value.
   *
   * @return the ttl
   */
  public Long ttl() {
    return ttl;
  }

  /**
   * Gets the content.
   *
   * content of dns record.
   *
   * @return the content
   */
  public String content() {
    return content;
  }

  /**
   * Gets the priority.
   *
   * For MX records only.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the proxied.
   *
   * proxied.
   *
   * @return the proxied
   */
  public Boolean proxied() {
    return proxied;
  }

  /**
   * Gets the data.
   *
   * For LOC, SRV and CAA records only.
   *
   * @return the data
   */
  public Map<String, Object> data() {
    return data;
  }
}

