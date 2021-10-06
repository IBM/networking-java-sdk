/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.direct_link_provider.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createProviderGateway options.
 */
public class CreateProviderGatewayOptions extends GenericModel {

  protected Long bgpAsn;
  protected String customerAccountId;
  protected String name;
  protected ProviderGatewayPortIdentity port;
  protected Long speedMbps;
  protected String bgpCerCidr;
  protected String bgpIbmCidr;
  protected String checkOnly;

  /**
   * Builder.
   */
  public static class Builder {
    private Long bgpAsn;
    private String customerAccountId;
    private String name;
    private ProviderGatewayPortIdentity port;
    private Long speedMbps;
    private String bgpCerCidr;
    private String bgpIbmCidr;
    private String checkOnly;

    private Builder(CreateProviderGatewayOptions createProviderGatewayOptions) {
      this.bgpAsn = createProviderGatewayOptions.bgpAsn;
      this.customerAccountId = createProviderGatewayOptions.customerAccountId;
      this.name = createProviderGatewayOptions.name;
      this.port = createProviderGatewayOptions.port;
      this.speedMbps = createProviderGatewayOptions.speedMbps;
      this.bgpCerCidr = createProviderGatewayOptions.bgpCerCidr;
      this.bgpIbmCidr = createProviderGatewayOptions.bgpIbmCidr;
      this.checkOnly = createProviderGatewayOptions.checkOnly;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bgpAsn the bgpAsn
     * @param customerAccountId the customerAccountId
     * @param name the name
     * @param port the port
     * @param speedMbps the speedMbps
     */
    public Builder(Long bgpAsn, String customerAccountId, String name, ProviderGatewayPortIdentity port, Long speedMbps) {
      this.bgpAsn = bgpAsn;
      this.customerAccountId = customerAccountId;
      this.name = name;
      this.port = port;
      this.speedMbps = speedMbps;
    }

    /**
     * Builds a CreateProviderGatewayOptions.
     *
     * @return the new CreateProviderGatewayOptions instance
     */
    public CreateProviderGatewayOptions build() {
      return new CreateProviderGatewayOptions(this);
    }

    /**
     * Set the bgpAsn.
     *
     * @param bgpAsn the bgpAsn
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder bgpAsn(long bgpAsn) {
      this.bgpAsn = bgpAsn;
      return this;
    }

    /**
     * Set the customerAccountId.
     *
     * @param customerAccountId the customerAccountId
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder customerAccountId(String customerAccountId) {
      this.customerAccountId = customerAccountId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder port(ProviderGatewayPortIdentity port) {
      this.port = port;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }

    /**
     * Set the checkOnly.
     *
     * @param checkOnly the checkOnly
     * @return the CreateProviderGatewayOptions builder
     */
    public Builder checkOnly(String checkOnly) {
      this.checkOnly = checkOnly;
      return this;
    }
  }

  protected CreateProviderGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bgpAsn,
      "bgpAsn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.customerAccountId,
      "customerAccountId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.speedMbps,
      "speedMbps cannot be null");
    bgpAsn = builder.bgpAsn;
    customerAccountId = builder.customerAccountId;
    name = builder.name;
    port = builder.port;
    speedMbps = builder.speedMbps;
    bgpCerCidr = builder.bgpCerCidr;
    bgpIbmCidr = builder.bgpIbmCidr;
    checkOnly = builder.checkOnly;
  }

  /**
   * New builder.
   *
   * @return a CreateProviderGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bgpAsn.
   *
   * BGP ASN.
   *
   * For a 2-byte range, enter a value between 1-64495 or 64999. For a 2-byte or 4-byte range, enter a value between
   * 131072-4199999999. For a 4-byte range, enter a value between 4201000000-4201064511.
   *
   * @return the bgpAsn
   */
  public Long bgpAsn() {
    return bgpAsn;
  }

  /**
   * Gets the customerAccountId.
   *
   * Customer IBM Cloud account ID for the new gateway.  A gateway object containing the pending create request will
   * become available in the specified account.
   *
   * @return the customerAccountId
   */
  public String customerAccountId() {
    return customerAccountId;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the port.
   *
   * Select Port Label for the gateway.
   *
   * @return the port
   */
  public ProviderGatewayPortIdentity port() {
    return port;
  }

  /**
   * Gets the speedMbps.
   *
   * Gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long speedMbps() {
    return speedMbps;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR.
   *
   * For auto IP assignment, omit bgp_cer_cidr and bgp_ibm_cidr.  IBM will automatically select values for bgp_cer_cidr
   * and bgp_ibm_cidr.
   *
   * For manual IP assignment set a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must reside in one of
   * "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.  bgp_cer_cidr and
   * bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpCerCidr
   */
  public String bgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR.
   *
   * For auto IP assignment, omit bgp_cer_cidr and bgp_ibm_cidr.  IBM will automatically select values for bgp_cer_cidr
   * and bgp_ibm_cidr.
   *
   * For manual IP assignment set a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must reside in one of
   * "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.  bgp_cer_cidr and
   * bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpIbmCidr
   */
  public String bgpIbmCidr() {
    return bgpIbmCidr;
  }

  /**
   * Gets the checkOnly.
   *
   * When true, perform request validation only and do not create a gateway.
   *
   * @return the checkOnly
   */
  public String checkOnly() {
    return checkOnly;
  }
}

