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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createGatewayExportRouteFilter options.
 */
public class CreateGatewayExportRouteFilterOptions extends GenericModel {

  /**
   * Determines whether routes that match the prefix-set will be allowed (permit) or rejected (deny) through the filter.
   */
  public interface Action {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  protected String gatewayId;
  protected String action;
  protected String prefix;
  protected String before;
  protected Long ge;
  protected Long le;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String action;
    private String prefix;
    private String before;
    private Long ge;
    private Long le;

    /**
     * Instantiates a new Builder from an existing CreateGatewayExportRouteFilterOptions instance.
     *
     * @param createGatewayExportRouteFilterOptions the instance to initialize the Builder with
     */
    private Builder(CreateGatewayExportRouteFilterOptions createGatewayExportRouteFilterOptions) {
      this.gatewayId = createGatewayExportRouteFilterOptions.gatewayId;
      this.action = createGatewayExportRouteFilterOptions.action;
      this.prefix = createGatewayExportRouteFilterOptions.prefix;
      this.before = createGatewayExportRouteFilterOptions.before;
      this.ge = createGatewayExportRouteFilterOptions.ge;
      this.le = createGatewayExportRouteFilterOptions.le;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param gatewayId the gatewayId
     * @param action the action
     * @param prefix the prefix
     */
    public Builder(String gatewayId, String action, String prefix) {
      this.gatewayId = gatewayId;
      this.action = action;
      this.prefix = prefix;
    }

    /**
     * Builds a CreateGatewayExportRouteFilterOptions.
     *
     * @return the new CreateGatewayExportRouteFilterOptions instance
     */
    public CreateGatewayExportRouteFilterOptions build() {
      return new CreateGatewayExportRouteFilterOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the CreateGatewayExportRouteFilterOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateGatewayExportRouteFilterOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the CreateGatewayExportRouteFilterOptions builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the CreateGatewayExportRouteFilterOptions builder
     */
    public Builder before(String before) {
      this.before = before;
      return this;
    }

    /**
     * Set the ge.
     *
     * @param ge the ge
     * @return the CreateGatewayExportRouteFilterOptions builder
     */
    public Builder ge(long ge) {
      this.ge = ge;
      return this;
    }

    /**
     * Set the le.
     *
     * @param le the le
     * @return the CreateGatewayExportRouteFilterOptions builder
     */
    public Builder le(long le) {
      this.le = le;
      return this;
    }
  }

  protected CreateGatewayExportRouteFilterOptions() { }

  protected CreateGatewayExportRouteFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prefix,
      "prefix cannot be null");
    gatewayId = builder.gatewayId;
    action = builder.action;
    prefix = builder.prefix;
    before = builder.before;
    ge = builder.ge;
    le = builder.le;
  }

  /**
   * New builder.
   *
   * @return a CreateGatewayExportRouteFilterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gatewayId.
   *
   * Direct Link gateway identifier.
   *
   * @return the gatewayId
   */
  public String gatewayId() {
    return gatewayId;
  }

  /**
   * Gets the action.
   *
   * Determines whether routes that match the prefix-set will be allowed (permit) or rejected (deny) through the filter.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the prefix.
   *
   * IP prefix representing an address and mask length of the prefix-set.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }

  /**
   * Gets the before.
   *
   * Identifier of the next route filter considered if a route does not match the current filter. This property builds
   * the ordering among route filters and follows semantics:
   * - When before is an identifier of a route filter that exists and is in the same collection, a route will first
   * attempt to match on the current filter before preceding to the filter referenced in this property.
   * - When a filter is created with before that matches another filter in the same collection, the existing filter will
   * take precedence. The before of the existing filter will be updated to refer to the newly created filter. The newly
   * created filter will refer to the route filter identified by the provided before.
   * - When a filter is created without a before, it takes the lowest precedence. The existing filter of lowest
   * precedence will be updated to refer to the newly created filter.
   *
   * @return the before
   */
  public String before() {
    return before;
  }

  /**
   * Gets the ge.
   *
   * The minimum matching length of the prefix-set (mnemonic for greater than or equal to).
   *
   * @return the ge
   */
  public Long ge() {
    return ge;
  }

  /**
   * Gets the le.
   *
   * The maximum matching length of the prefix-set (mnemonic for less than or equal to).
   *
   * @return the le
   */
  public Long le() {
    return le;
  }
}

