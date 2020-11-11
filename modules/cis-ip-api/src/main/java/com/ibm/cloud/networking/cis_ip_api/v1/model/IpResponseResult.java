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
package com.ibm.cloud.networking.cis_ip_api.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for response information.
 */
public class IpResponseResult extends GenericModel {

  @SerializedName("ipv4_cidrs")
  protected List<String> ipv4Cidrs;
  @SerializedName("ipv6_cidrs")
  protected List<String> ipv6Cidrs;

  /**
   * Gets the ipv4Cidrs.
   *
   * List of IPv4 CIDR addresses.
   *
   * @return the ipv4Cidrs
   */
  public List<String> getIpv4Cidrs() {
    return ipv4Cidrs;
  }

  /**
   * Gets the ipv6Cidrs.
   *
   * List of IPv6 CIDR addresses.
   *
   * @return the ipv6Cidrs
   */
  public List<String> getIpv6Cidrs() {
    return ipv6Cidrs;
  }
}

