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

/**
 * The content of type-SRV resource record.
 */
public class ResourceRecordUpdateInputRdataRdataSrvRecord extends ResourceRecordUpdateInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private Long port;
    private Long priority;
    private String target;
    private Long weight;

    public Builder(ResourceRecordUpdateInputRdata resourceRecordUpdateInputRdataRdataSrvRecord) {
      this.port = resourceRecordUpdateInputRdataRdataSrvRecord.port;
      this.priority = resourceRecordUpdateInputRdataRdataSrvRecord.priority;
      this.target = resourceRecordUpdateInputRdataRdataSrvRecord.target;
      this.weight = resourceRecordUpdateInputRdataRdataSrvRecord.weight;
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
     * Builds a ResourceRecordUpdateInputRdataRdataSrvRecord.
     *
     * @return the new ResourceRecordUpdateInputRdataRdataSrvRecord instance
     */
    public ResourceRecordUpdateInputRdataRdataSrvRecord build() {
      return new ResourceRecordUpdateInputRdataRdataSrvRecord(this);
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the ResourceRecordUpdateInputRdataRdataSrvRecord builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the ResourceRecordUpdateInputRdataRdataSrvRecord builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the ResourceRecordUpdateInputRdataRdataSrvRecord builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the weight.
     *
     * @param weight the weight
     * @return the ResourceRecordUpdateInputRdataRdataSrvRecord builder
     */
    public Builder weight(long weight) {
      this.weight = weight;
      return this;
    }
  }

  protected ResourceRecordUpdateInputRdataRdataSrvRecord(Builder builder) {
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
   * @return a ResourceRecordUpdateInputRdataRdataSrvRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

