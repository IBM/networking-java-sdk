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
 * BatchDnsRecordsRequestPutsItem.
 */
public class BatchDnsRecordsRequestPutsItem extends GenericModel {

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

  protected String id;
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
    private String id;
    private String name;
    private String type;
    private Long ttl;
    private String content;
    private Long priority;
    private Boolean proxied;
    private Map<String, Object> data;

    /**
     * Instantiates a new Builder from an existing BatchDnsRecordsRequestPutsItem instance.
     *
     * @param batchDnsRecordsRequestPutsItem the instance to initialize the Builder with
     */
    private Builder(BatchDnsRecordsRequestPutsItem batchDnsRecordsRequestPutsItem) {
      this.id = batchDnsRecordsRequestPutsItem.id;
      this.name = batchDnsRecordsRequestPutsItem.name;
      this.type = batchDnsRecordsRequestPutsItem.type;
      this.ttl = batchDnsRecordsRequestPutsItem.ttl;
      this.content = batchDnsRecordsRequestPutsItem.content;
      this.priority = batchDnsRecordsRequestPutsItem.priority;
      this.proxied = batchDnsRecordsRequestPutsItem.proxied;
      this.data = batchDnsRecordsRequestPutsItem.data;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param name the name
     * @param type the type
     * @param ttl the ttl
     * @param content the content
     */
    public Builder(String id, String name, String type, Long ttl, String content) {
      this.id = id;
      this.name = name;
      this.type = type;
      this.ttl = ttl;
      this.content = content;
    }

    /**
     * Builds a BatchDnsRecordsRequestPutsItem.
     *
     * @return the new BatchDnsRecordsRequestPutsItem instance
     */
    public BatchDnsRecordsRequestPutsItem build() {
      return new BatchDnsRecordsRequestPutsItem(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the proxied.
     *
     * @param proxied the proxied
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder proxied(Boolean proxied) {
      this.proxied = proxied;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the BatchDnsRecordsRequestPutsItem builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }
  }

  protected BatchDnsRecordsRequestPutsItem() { }

  protected BatchDnsRecordsRequestPutsItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ttl,
      "ttl cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.content,
      "content cannot be null");
    id = builder.id;
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
   * @return a BatchDnsRecordsRequestPutsItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * DNS record ID to update.
   *
   * @return the id
   */
  public String id() {
    return id;
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

