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
package com.ibm.cloud.networking.mtls.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createAccessOrganization options.
 */
public class CreateAccessOrganizationOptions extends GenericModel {

  protected String name;
  protected String authDomain;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String authDomain;

    /**
     * Instantiates a new Builder from an existing CreateAccessOrganizationOptions instance.
     *
     * @param createAccessOrganizationOptions the instance to initialize the Builder with
     */
    private Builder(CreateAccessOrganizationOptions createAccessOrganizationOptions) {
      this.name = createAccessOrganizationOptions.name;
      this.authDomain = createAccessOrganizationOptions.authDomain;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAccessOrganizationOptions.
     *
     * @return the new CreateAccessOrganizationOptions instance
     */
    public CreateAccessOrganizationOptions build() {
      return new CreateAccessOrganizationOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateAccessOrganizationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the authDomain.
     *
     * @param authDomain the authDomain
     * @return the CreateAccessOrganizationOptions builder
     */
    public Builder authDomain(String authDomain) {
      this.authDomain = authDomain;
      return this;
    }
  }

  protected CreateAccessOrganizationOptions() { }

  protected CreateAccessOrganizationOptions(Builder builder) {
    name = builder.name;
    authDomain = builder.authDomain;
  }

  /**
   * New builder.
   *
   * @return a CreateAccessOrganizationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the access organization.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the authDomain.
   *
   * The domain that you are redirected to on Access login attempts.
   *
   * @return the authDomain
   */
  public String authDomain() {
    return authDomain;
  }
}

