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

/**
 * The content of type-A resource record.
 */
public class ResourceRecordInputRdataRdataARecord extends ResourceRecordInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String ip;

    /**
     * Instantiates a new Builder from an existing ResourceRecordInputRdataRdataARecord instance.
     *
     * @param resourceRecordInputRdataRdataARecord the instance to initialize the Builder with
     */
    public Builder(ResourceRecordInputRdata resourceRecordInputRdataRdataARecord) {
      this.ip = resourceRecordInputRdataRdataARecord.ip;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ip the ip
     */
    public Builder(String ip) {
      this.ip = ip;
    }

    /**
     * Builds a ResourceRecordInputRdataRdataARecord.
     *
     * @return the new ResourceRecordInputRdataRdataARecord instance
     */
    public ResourceRecordInputRdataRdataARecord build() {
      return new ResourceRecordInputRdataRdataARecord(this);
    }

    /**
     * Set the ip.
     *
     * @param ip the ip
     * @return the ResourceRecordInputRdataRdataARecord builder
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }
  }

  protected ResourceRecordInputRdataRdataARecord() { }

  protected ResourceRecordInputRdataRdataARecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ip,
      "ip cannot be null");
    ip = builder.ip;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordInputRdataRdataARecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

