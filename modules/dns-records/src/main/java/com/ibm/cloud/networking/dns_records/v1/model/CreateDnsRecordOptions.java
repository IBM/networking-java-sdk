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
 * The createDnsRecord options.
 */
public class CreateDnsRecordOptions extends GenericModel {

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

  protected String name;
  protected String type;
  protected Long ttl;
  protected String content;
  protected Long priority;
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
    private Map<String, Object> data;

    private Builder(CreateDnsRecordOptions createDnsRecordOptions) {
      this.name = createDnsRecordOptions.name;
      this.type = createDnsRecordOptions.type;
      this.ttl = createDnsRecordOptions.ttl;
      this.content = createDnsRecordOptions.content;
      this.priority = createDnsRecordOptions.priority;
      this.data = createDnsRecordOptions.data;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateDnsRecordOptions.
     *
     * @return the new CreateDnsRecordOptions instance
     */
    public CreateDnsRecordOptions build() {
      return new CreateDnsRecordOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDnsRecordOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDnsRecordOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the CreateDnsRecordOptions builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the CreateDnsRecordOptions builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the CreateDnsRecordOptions builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the CreateDnsRecordOptions builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }
  }

  protected CreateDnsRecordOptions(Builder builder) {
    name = builder.name;
    type = builder.type;
    ttl = builder.ttl;
    content = builder.content;
    priority = builder.priority;
    data = builder.data;
  }

  /**
   * New builder.
   *
   * @return a CreateDnsRecordOptions builder
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

