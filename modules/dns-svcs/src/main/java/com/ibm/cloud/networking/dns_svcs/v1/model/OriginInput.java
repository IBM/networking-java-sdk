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
 * The request data of origin server.
 */
public class OriginInput extends GenericModel {

  protected String name;
  protected String description;
  protected String address;
  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String address;
    private Boolean enabled;

    private Builder(OriginInput originInput) {
      this.name = originInput.name;
      this.description = originInput.description;
      this.address = originInput.address;
      this.enabled = originInput.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a OriginInput.
     *
     * @return the new OriginInput instance
     */
    public OriginInput build() {
      return new OriginInput(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the OriginInput builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the OriginInput builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the OriginInput builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the OriginInput builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected OriginInput(Builder builder) {
    name = builder.name;
    description = builder.description;
    address = builder.address;
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a OriginInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the origin server.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the origin server.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the address.
   *
   * The address of the origin server. It can be a hostname or an IP address.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the enabled.
   *
   * Whether the origin server is enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

