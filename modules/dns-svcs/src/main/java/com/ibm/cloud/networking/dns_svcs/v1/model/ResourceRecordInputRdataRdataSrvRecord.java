/*
 * (C) Copyright IBM Corp. 2022.
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

/**
 * The content of type-SRV resource record.
 */
public class ResourceRecordInputRdataRdataSrvRecord extends ResourceRecordInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private Long port;
    private Long priority;
    private String target;
    private Long weight;

    public Builder(ResourceRecordInputRdata resourceRecordInputRdataRdataSrvRecord) {
      this.port = resourceRecordInputRdataRdataSrvRecord.port;
      this.priority = resourceRecordInputRdataRdataSrvRecord.priority;
      this.target = resourceRecordInputRdataRdataSrvRecord.target;
      this.weight = resourceRecordInputRdataRdataSrvRecord.weight;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param port the port
     * @param priority the priority
     * @param target the target
     * @param weight the weight
     */
    public Builder(Long port, Long priority, String target, Long weight) {
      this.port = port;
      this.priority = priority;
      this.target = target;
      this.weight = weight;
    }

    /**
     * Builds a ResourceRecordInputRdataRdataSrvRecord.
     *
     * @return the new ResourceRecordInputRdataRdataSrvRecord instance
     */
    public ResourceRecordInputRdataRdataSrvRecord build() {
      return new ResourceRecordInputRdataRdataSrvRecord(this);
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the ResourceRecordInputRdataRdataSrvRecord builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the ResourceRecordInputRdataRdataSrvRecord builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the ResourceRecordInputRdataRdataSrvRecord builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the weight.
     *
     * @param weight the weight
     * @return the ResourceRecordInputRdataRdataSrvRecord builder
     */
    public Builder weight(long weight) {
      this.weight = weight;
      return this;
    }
  }

  protected ResourceRecordInputRdataRdataSrvRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.priority,
      "priority cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.weight,
      "weight cannot be null");
    port = builder.port;
    priority = builder.priority;
    target = builder.target;
    weight = builder.weight;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordInputRdataRdataSrvRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

