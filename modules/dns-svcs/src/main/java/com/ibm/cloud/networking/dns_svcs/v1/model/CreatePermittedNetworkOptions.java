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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createPermittedNetwork options.
 */
public class CreatePermittedNetworkOptions extends GenericModel {

  /**
   * The type of a permitted network.
   */
  public interface Type {
    /** vpc. */
    String VPC = "vpc";
  }

  protected String instanceId;
  protected String dnszoneId;
  protected String type;
  protected PermittedNetworkVpc permittedNetwork;
  protected String accounts;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String type;
    private PermittedNetworkVpc permittedNetwork;
    private String accounts;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing CreatePermittedNetworkOptions instance.
     *
     * @param createPermittedNetworkOptions the instance to initialize the Builder with
     */
    private Builder(CreatePermittedNetworkOptions createPermittedNetworkOptions) {
      this.instanceId = createPermittedNetworkOptions.instanceId;
      this.dnszoneId = createPermittedNetworkOptions.dnszoneId;
      this.type = createPermittedNetworkOptions.type;
      this.permittedNetwork = createPermittedNetworkOptions.permittedNetwork;
      this.accounts = createPermittedNetworkOptions.accounts;
      this.xCorrelationId = createPermittedNetworkOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param dnszoneId the dnszoneId
     */
    public Builder(String instanceId, String dnszoneId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
    }

    /**
     * Builds a CreatePermittedNetworkOptions.
     *
     * @return the new CreatePermittedNetworkOptions instance
     */
    public CreatePermittedNetworkOptions build() {
      return new CreatePermittedNetworkOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreatePermittedNetworkOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the CreatePermittedNetworkOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreatePermittedNetworkOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the permittedNetwork.
     *
     * @param permittedNetwork the permittedNetwork
     * @return the CreatePermittedNetworkOptions builder
     */
    public Builder permittedNetwork(PermittedNetworkVpc permittedNetwork) {
      this.permittedNetwork = permittedNetwork;
      return this;
    }

    /**
     * Set the accounts.
     *
     * @param accounts the accounts
     * @return the CreatePermittedNetworkOptions builder
     */
    public Builder accounts(String accounts) {
      this.accounts = accounts;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreatePermittedNetworkOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreatePermittedNetworkOptions() { }

  protected CreatePermittedNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    type = builder.type;
    permittedNetwork = builder.permittedNetwork;
    accounts = builder.accounts;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreatePermittedNetworkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the dnszoneId.
   *
   * The unique identifier of a DNS zone.
   *
   * @return the dnszoneId
   */
  public String dnszoneId() {
    return dnszoneId;
  }

  /**
   * Gets the type.
   *
   * The type of a permitted network.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the permittedNetwork.
   *
   * Permitted network data for VPC.
   *
   * @return the permittedNetwork
   */
  public PermittedNetworkVpc permittedNetwork() {
    return permittedNetwork;
  }

  /**
   * Gets the accounts.
   *
   * The account identifiers of the owner zone and linked zones in the format of "?account=account1,account2,account3".
   * Maximum 5 accounts are allowed.
   *
   * @return the accounts
   */
  public String accounts() {
    return accounts;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

