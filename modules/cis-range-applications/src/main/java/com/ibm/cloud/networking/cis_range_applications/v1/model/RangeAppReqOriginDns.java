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
package com.ibm.cloud.networking.cis_range_applications.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DNS record pointing to the origin for this Range application. This is used for configuring a load balancer. When
 * specifying an individual IP address, use 'origin_direct'. This requires 'origin_port' and can not be combined with
 * 'origin_direct'.
 */
public class RangeAppReqOriginDns extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    private Builder(RangeAppReqOriginDns rangeAppReqOriginDns) {
      this.name = rangeAppReqOriginDns.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a RangeAppReqOriginDns.
     *
     * @return the new RangeAppReqOriginDns instance
     */
    public RangeAppReqOriginDns build() {
      return new RangeAppReqOriginDns(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RangeAppReqOriginDns builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected RangeAppReqOriginDns(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a RangeAppReqOriginDns builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the origin.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

