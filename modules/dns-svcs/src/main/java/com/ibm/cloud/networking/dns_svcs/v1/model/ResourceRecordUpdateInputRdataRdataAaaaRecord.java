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
 * The content of type-AAAA resource record.
 */
public class ResourceRecordUpdateInputRdataRdataAaaaRecord extends ResourceRecordUpdateInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String ip;

    public Builder(ResourceRecordUpdateInputRdata resourceRecordUpdateInputRdataRdataAaaaRecord) {
      this.ip = resourceRecordUpdateInputRdataRdataAaaaRecord.ip;
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
     * Builds a ResourceRecordUpdateInputRdataRdataAaaaRecord.
     *
     * @return the new ResourceRecordUpdateInputRdataRdataAaaaRecord instance
     */
    public ResourceRecordUpdateInputRdataRdataAaaaRecord build() {
      return new ResourceRecordUpdateInputRdataRdataAaaaRecord(this);
    }

    /**
     * Set the ip.
     *
     * @param ip the ip
     * @return the ResourceRecordUpdateInputRdataRdataAaaaRecord builder
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }
  }

  protected ResourceRecordUpdateInputRdataRdataAaaaRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ip,
      "ip cannot be null");
    ip = builder.ip;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordUpdateInputRdataRdataAaaaRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

