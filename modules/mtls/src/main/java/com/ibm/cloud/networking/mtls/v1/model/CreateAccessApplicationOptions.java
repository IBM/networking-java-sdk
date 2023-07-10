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
 * The createAccessApplication options.
 */
public class CreateAccessApplicationOptions extends GenericModel {

  protected String zoneId;
  protected String name;
  protected String domain;
  protected String sessionDuration;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String name;
    private String domain;
    private String sessionDuration;

    /**
     * Instantiates a new Builder from an existing CreateAccessApplicationOptions instance.
     *
     * @param createAccessApplicationOptions the instance to initialize the Builder with
     */
    private Builder(CreateAccessApplicationOptions createAccessApplicationOptions) {
      this.zoneId = createAccessApplicationOptions.zoneId;
      this.name = createAccessApplicationOptions.name;
      this.domain = createAccessApplicationOptions.domain;
      this.sessionDuration = createAccessApplicationOptions.sessionDuration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zoneId the zoneId
     */
    public Builder(String zoneId) {
      this.zoneId = zoneId;
    }

    /**
     * Builds a CreateAccessApplicationOptions.
     *
     * @return the new CreateAccessApplicationOptions instance
     */
    public CreateAccessApplicationOptions build() {
      return new CreateAccessApplicationOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the CreateAccessApplicationOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateAccessApplicationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the CreateAccessApplicationOptions builder
     */
    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the sessionDuration.
     *
     * @param sessionDuration the sessionDuration
     * @return the CreateAccessApplicationOptions builder
     */
    public Builder sessionDuration(String sessionDuration) {
      this.sessionDuration = sessionDuration;
      return this;
    }
  }

  protected CreateAccessApplicationOptions() { }

  protected CreateAccessApplicationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    zoneId = builder.zoneId;
    name = builder.name;
    domain = builder.domain;
    sessionDuration = builder.sessionDuration;
  }

  /**
   * New builder.
   *
   * @return a CreateAccessApplicationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zoneId.
   *
   * Zone ID.
   *
   * @return the zoneId
   */
  public String zoneId() {
    return zoneId;
  }

  /**
   * Gets the name.
   *
   * Application name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the domain.
   *
   * The domain and path that Access blocks.
   *
   * @return the domain
   */
  public String domain() {
    return domain;
  }

  /**
   * Gets the sessionDuration.
   *
   * The amount of time that the tokens issued for this application are valid.
   *
   * @return the sessionDuration
   */
  public String sessionDuration() {
    return sessionDuration;
  }
}

