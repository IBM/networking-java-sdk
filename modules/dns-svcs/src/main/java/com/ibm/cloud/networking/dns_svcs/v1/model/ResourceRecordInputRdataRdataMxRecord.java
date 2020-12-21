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
 * The content of type-MX resource record.
 */
public class ResourceRecordInputRdataRdataMxRecord extends ResourceRecordInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String exchange;
    private Long preference;

    public Builder(ResourceRecordInputRdata resourceRecordInputRdataRdataMxRecord) {
      this.exchange = resourceRecordInputRdataRdataMxRecord.exchange;
      this.preference = resourceRecordInputRdataRdataMxRecord.preference;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param exchange the exchange
     * @param preference the preference
     */
    public Builder(String exchange, Long preference) {
      this.exchange = exchange;
      this.preference = preference;
    }

    /**
     * Builds a ResourceRecordInputRdataRdataMxRecord.
     *
     * @return the new ResourceRecordInputRdataRdataMxRecord instance
     */
    public ResourceRecordInputRdataRdataMxRecord build() {
      return new ResourceRecordInputRdataRdataMxRecord(this);
    }

    /**
     * Set the exchange.
     *
     * @param exchange the exchange
     * @return the ResourceRecordInputRdataRdataMxRecord builder
     */
    public Builder exchange(String exchange) {
      this.exchange = exchange;
      return this;
    }

    /**
     * Set the preference.
     *
     * @param preference the preference
     * @return the ResourceRecordInputRdataRdataMxRecord builder
     */
    public Builder preference(long preference) {
      this.preference = preference;
      return this;
    }
  }

  protected ResourceRecordInputRdataRdataMxRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.exchange,
      "exchange cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.preference,
      "preference cannot be null");
    exchange = builder.exchange;
    preference = builder.preference;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordInputRdataRdataMxRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

