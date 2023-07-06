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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Custom resolver location.
 */
public class Location extends GenericModel {

  protected String id;
  @SerializedName("subnet_crn")
  protected String subnetCrn;
  protected Boolean enabled;
  protected Boolean healthy;
  @SerializedName("dns_server_ip")
  protected String dnsServerIp;

  protected Location() { }

  /**
   * Gets the id.
   *
   * Location ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the subnetCrn.
   *
   * Subnet CRN.
   *
   * @return the subnetCrn
   */
  public String getSubnetCrn() {
    return subnetCrn;
  }

  /**
   * Gets the enabled.
   *
   * Whether the location is enabled for the custom resolver.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the healthy.
   *
   * Whether the DNS server in this location is healthy or not.
   *
   * @return the healthy
   */
  public Boolean isHealthy() {
    return healthy;
  }

  /**
   * Gets the dnsServerIp.
   *
   * The ip address of this dns server.
   *
   * @return the dnsServerIp
   */
  public String getDnsServerIp() {
    return dnsServerIp;
  }
}

