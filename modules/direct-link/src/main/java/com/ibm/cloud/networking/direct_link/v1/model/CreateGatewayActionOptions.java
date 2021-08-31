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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createGatewayAction options.
 */
public class CreateGatewayActionOptions extends GenericModel {

  /**
   * Action request.
   */
  public interface Action {
    /** create_gateway_approve. */
    String CREATE_GATEWAY_APPROVE = "create_gateway_approve";
    /** create_gateway_reject. */
    String CREATE_GATEWAY_REJECT = "create_gateway_reject";
    /** delete_gateway_approve. */
    String DELETE_GATEWAY_APPROVE = "delete_gateway_approve";
    /** delete_gateway_reject. */
    String DELETE_GATEWAY_REJECT = "delete_gateway_reject";
    /** update_attributes_approve. */
    String UPDATE_ATTRIBUTES_APPROVE = "update_attributes_approve";
    /** update_attributes_reject. */
    String UPDATE_ATTRIBUTES_REJECT = "update_attributes_reject";
  }

  /**
   * Type of services this Gateway is attached to. Mode transit means this Gateway will be attached to Transit Gateway
   * Service and direct means this Gateway will be attached to vpc or classic connection. The list of enumerated values
   * for this property may expand in the future. Code and processes using this field  must tolerate unexpected values.
   */
  public interface ConnectionMode {
    /** direct. */
    String DIRECT = "direct";
    /** transit. */
    String TRANSIT = "transit";
  }

  protected String id;
  protected String action;
  protected GatewayActionTemplateAuthenticationKey authenticationKey;
  protected String connectionMode;
  protected Boolean global;
  protected Boolean metered;
  protected ResourceGroupIdentity resourceGroup;
  protected List<GatewayActionTemplateUpdatesItem> updates;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String action;
    private GatewayActionTemplateAuthenticationKey authenticationKey;
    private String connectionMode;
    private Boolean global;
    private Boolean metered;
    private ResourceGroupIdentity resourceGroup;
    private List<GatewayActionTemplateUpdatesItem> updates;

    private Builder(CreateGatewayActionOptions createGatewayActionOptions) {
      this.id = createGatewayActionOptions.id;
      this.action = createGatewayActionOptions.action;
      this.authenticationKey = createGatewayActionOptions.authenticationKey;
      this.connectionMode = createGatewayActionOptions.connectionMode;
      this.global = createGatewayActionOptions.global;
      this.metered = createGatewayActionOptions.metered;
      this.resourceGroup = createGatewayActionOptions.resourceGroup;
      this.updates = createGatewayActionOptions.updates;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param action the action
     */
    public Builder(String id, String action) {
      this.id = id;
      this.action = action;
    }

    /**
     * Builds a CreateGatewayActionOptions.
     *
     * @return the new CreateGatewayActionOptions instance
     */
    public CreateGatewayActionOptions build() {
      return new CreateGatewayActionOptions(this);
    }

    /**
     * Adds an updates to updates.
     *
     * @param updates the new updates
     * @return the CreateGatewayActionOptions builder
     */
    public Builder addUpdates(GatewayActionTemplateUpdatesItem updates) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(updates,
        "updates cannot be null");
      if (this.updates == null) {
        this.updates = new ArrayList<GatewayActionTemplateUpdatesItem>();
      }
      this.updates.add(updates);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateGatewayActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateGatewayActionOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the authenticationKey.
     *
     * @param authenticationKey the authenticationKey
     * @return the CreateGatewayActionOptions builder
     */
    public Builder authenticationKey(GatewayActionTemplateAuthenticationKey authenticationKey) {
      this.authenticationKey = authenticationKey;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the CreateGatewayActionOptions builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the CreateGatewayActionOptions builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the metered.
     *
     * @param metered the metered
     * @return the CreateGatewayActionOptions builder
     */
    public Builder metered(Boolean metered) {
      this.metered = metered;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateGatewayActionOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the updates.
     * Existing updates will be replaced.
     *
     * @param updates the updates
     * @return the CreateGatewayActionOptions builder
     */
    public Builder updates(List<GatewayActionTemplateUpdatesItem> updates) {
      this.updates = updates;
      return this;
    }
  }

  protected CreateGatewayActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    id = builder.id;
    action = builder.action;
    authenticationKey = builder.authenticationKey;
    connectionMode = builder.connectionMode;
    global = builder.global;
    metered = builder.metered;
    resourceGroup = builder.resourceGroup;
    updates = builder.updates;
  }

  /**
   * New builder.
   *
   * @return a CreateGatewayActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link Connect gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the action.
   *
   * Action request.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the authenticationKey.
   *
   * The identity of the standard key to use for BGP MD5 authentication key.
   * The key material that you provide must be base64 encoded and original string must be maximum 126 ASCII characters
   * in length.
   * To clear the optional `authentication_key` field patch its crn to `""`.
   *
   * @return the authenticationKey
   */
  public GatewayActionTemplateAuthenticationKey authenticationKey() {
    return authenticationKey;
  }

  /**
   * Gets the connectionMode.
   *
   * Type of services this Gateway is attached to. Mode transit means this Gateway will be attached to Transit Gateway
   * Service and direct means this Gateway will be attached to vpc or classic connection. The list of enumerated values
   * for this property may expand in the future. Code and processes using this field  must tolerate unexpected values.
   *
   * @return the connectionMode
   */
  public String connectionMode() {
    return connectionMode;
  }

  /**
   * Gets the global.
   *
   * Required for create_gateway_approve requests to select the gateway's routing option.  Gateways with global routing
   * (`true`) can connect to networks outside of their associated region.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the metered.
   *
   * Required for create_gateway_approve requests to select the gateway's metered billing option.  When `true` gateway
   * usage is billed per gigabyte.  When `false` there is no per gigabyte usage charge, instead a flat rate is charged
   * for the gateway.
   *
   * @return the metered
   */
  public Boolean metered() {
    return metered;
  }

  /**
   * Gets the resourceGroup.
   *
   * Set for create_gateway_approve requests to select the gateway's resource group.  If unspecified on
   * create_gateway_approve, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the updates.
   *
   * Specify attribute updates being approved or rejected, update_attributes_approve and update_attributes_reject
   * actions must provide an updates field that matches the gateway's current pending changes.
   *
   * @return the updates
   */
  public List<GatewayActionTemplateUpdatesItem> updates() {
    return updates;
  }
}

