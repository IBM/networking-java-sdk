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
 * Configures IP version for the hostname of this application. Default is {"type":"dynamic", "connectivity":"all"}.
 */
public class RangeAppReqEdgeIps extends GenericModel {

  /**
   * The type of edge IP configuration.
   */
  public interface Type {
    /** dynamic. */
    String DYNAMIC = "dynamic";
  }

  /**
   * Specifies the IP version (or all).
   */
  public interface Connectivity {
    /** ipv4. */
    String IPV4 = "ipv4";
    /** ipv6. */
    String IPV6 = "ipv6";
    /** all. */
    String ALL = "all";
  }

  protected String type;
  protected String connectivity;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String connectivity;

    private Builder(RangeAppReqEdgeIps rangeAppReqEdgeIps) {
      this.type = rangeAppReqEdgeIps.type;
      this.connectivity = rangeAppReqEdgeIps.connectivity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RangeAppReqEdgeIps.
     *
     * @return the new RangeAppReqEdgeIps instance
     */
    public RangeAppReqEdgeIps build() {
      return new RangeAppReqEdgeIps(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the RangeAppReqEdgeIps builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the connectivity.
     *
     * @param connectivity the connectivity
     * @return the RangeAppReqEdgeIps builder
     */
    public Builder connectivity(String connectivity) {
      this.connectivity = connectivity;
      return this;
    }
  }

  protected RangeAppReqEdgeIps(Builder builder) {
    type = builder.type;
    connectivity = builder.connectivity;
  }

  /**
   * New builder.
   *
   * @return a RangeAppReqEdgeIps builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The type of edge IP configuration.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the connectivity.
   *
   * Specifies the IP version (or all).
   *
   * @return the connectivity
   */
  public String connectivity() {
    return connectivity;
  }
}

