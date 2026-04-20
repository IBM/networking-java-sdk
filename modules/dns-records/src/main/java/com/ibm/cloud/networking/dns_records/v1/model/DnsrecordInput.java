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

package com.ibm.cloud.networking.dns_records.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * dns record input.
 */
public class DnsrecordInput extends GenericModel {

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
    /** PTR. */
    String PTR = "PTR";
    /** CAA. */
    String CAA = "CAA";
    /** DS. */
    String DS = "DS";
  }

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
    private String name;
    private String type;
    private Long ttl;
    private String content;
    private Long priority;
    private Boolean proxied;
    private Map<String, Object> data;

    /**
     * Instantiates a new Builder from an existing DnsrecordInput instance.
     *
     * @param dnsrecordInput the instance to initialize the Builder with
     */
    private Builder(DnsrecordInput dnsrecordInput) {
      this.name = dnsrecordInput.name;
      this.type = dnsrecordInput.type;
      this.ttl = dnsrecordInput.ttl;
      this.content = dnsrecordInput.content;
      this.priority = dnsrecordInput.priority;
      this.proxied = dnsrecordInput.proxied;
      this.data = dnsrecordInput.data;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a DnsrecordInput.
     *
     * @return the new DnsrecordInput instance
     */
    public DnsrecordInput build() {
      return new DnsrecordInput(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DnsrecordInput builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DnsrecordInput builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the DnsrecordInput builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the DnsrecordInput builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the DnsrecordInput builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the proxied.
     *
     * @param proxied the proxied
     * @return the DnsrecordInput builder
     */
    public Builder proxied(Boolean proxied) {
      this.proxied = proxied;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the DnsrecordInput builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }
  }

  protected DnsrecordInput() { }

  protected DnsrecordInput(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
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
   * @return a DnsrecordInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * dns record content.
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
   * For LOC, SRV, CAA, DS records only.
   *
   * @return the data
   */
  public Map<String, Object> data() {
    return data;
  }
}

