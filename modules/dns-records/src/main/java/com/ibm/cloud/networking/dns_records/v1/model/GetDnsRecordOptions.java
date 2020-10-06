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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDnsRecord options.
 */
public class GetDnsRecordOptions extends GenericModel {

  protected String dnsrecordIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String dnsrecordIdentifier;

    private Builder(GetDnsRecordOptions getDnsRecordOptions) {
      this.dnsrecordIdentifier = getDnsRecordOptions.dnsrecordIdentifier;
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
     * Builds a GetDnsRecordOptions.
     *
     * @return the new GetDnsRecordOptions instance
     */
    public GetDnsRecordOptions build() {
      return new GetDnsRecordOptions(this);
    }

    /**
     * Set the dnsrecordIdentifier.
     *
     * @param dnsrecordIdentifier the dnsrecordIdentifier
     * @return the GetDnsRecordOptions builder
     */
    public Builder dnsrecordIdentifier(String dnsrecordIdentifier) {
      this.dnsrecordIdentifier = dnsrecordIdentifier;
      return this;
    }
  }

  protected GetDnsRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnsrecordIdentifier,
      "dnsrecordIdentifier cannot be empty");
    dnsrecordIdentifier = builder.dnsrecordIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetDnsRecordOptions builder
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
}

