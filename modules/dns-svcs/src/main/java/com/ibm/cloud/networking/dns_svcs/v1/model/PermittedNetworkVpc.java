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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Permitted network data for VPC.
 */
public class PermittedNetworkVpc extends GenericModel {

  @SerializedName("vpc_crn")
  protected String vpcCrn;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcCrn;

    private Builder(PermittedNetworkVpc permittedNetworkVpc) {
      this.vpcCrn = permittedNetworkVpc.vpcCrn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcCrn the vpcCrn
     */
    public Builder(String vpcCrn) {
      this.vpcCrn = vpcCrn;
    }

    /**
     * Builds a PermittedNetworkVpc.
     *
     * @return the new PermittedNetworkVpc instance
     */
    public PermittedNetworkVpc build() {
      return new PermittedNetworkVpc(this);
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the PermittedNetworkVpc builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }
  }

  protected PermittedNetworkVpc(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpcCrn,
      "vpcCrn cannot be null");
    vpcCrn = builder.vpcCrn;
  }

  /**
   * New builder.
   *
   * @return a PermittedNetworkVpc builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcCrn.
   *
   * CRN string uniquely identifies a VPC.
   *
   * @return the vpcCrn
   */
  public String vpcCrn() {
    return vpcCrn;
  }
}

