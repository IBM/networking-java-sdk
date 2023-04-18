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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The source address of XFR rule.
 */
public class XfrRuleInputTransferFromItem extends GenericModel {

  protected String address;

  /**
   * Builder.
   */
  public static class Builder {
    private String address;

    private Builder(XfrRuleInputTransferFromItem xfrRuleInputTransferFromItem) {
      this.address = xfrRuleInputTransferFromItem.address;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a XfrRuleInputTransferFromItem.
     *
     * @return the new XfrRuleInputTransferFromItem instance
     */
    public XfrRuleInputTransferFromItem build() {
      return new XfrRuleInputTransferFromItem(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the XfrRuleInputTransferFromItem builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected XfrRuleInputTransferFromItem(Builder builder) {
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a XfrRuleInputTransferFromItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the address.
   *
   * The address of XFR source.
   *
   * @return the address
   */
  public String address() {
    return address;
  }
}

