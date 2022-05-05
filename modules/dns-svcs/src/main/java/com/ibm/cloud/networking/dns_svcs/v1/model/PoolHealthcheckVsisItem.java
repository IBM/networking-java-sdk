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
 * PoolHealthcheckVsisItem.
 */
public class PoolHealthcheckVsisItem extends GenericModel {

  protected String subnet;
  @SerializedName("ipv4_address")
  protected String ipv4Address;
  @SerializedName("ipv4_cidr_block")
  protected String ipv4CidrBlock;
  protected String vpc;

  /**
   * Gets the subnet.
   *
   * Health check VSI subnet CRN.
   *
   * @return the subnet
   */
  public String getSubnet() {
    return subnet;
  }

  /**
   * Gets the ipv4Address.
   *
   * healthcheck VSI ip address.
   *
   * @return the ipv4Address
   */
  public String getIpv4Address() {
    return ipv4Address;
  }

  /**
   * Gets the ipv4CidrBlock.
   *
   * ipv4 cidr block.
   *
   * @return the ipv4CidrBlock
   */
  public String getIpv4CidrBlock() {
    return ipv4CidrBlock;
  }

  /**
   * Gets the vpc.
   *
   * vpc crn.
   *
   * @return the vpc
   */
  public String getVpc() {
    return vpc;
  }
}

