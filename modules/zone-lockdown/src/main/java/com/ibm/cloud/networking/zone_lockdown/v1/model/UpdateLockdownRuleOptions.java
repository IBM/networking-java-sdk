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
package com.ibm.cloud.networking.zone_lockdown.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateLockdownRule options.
 */
public class UpdateLockdownRuleOptions extends GenericModel {

  protected String lockdownRuleIdentifier;
  protected String id;
  protected Boolean paused;
  protected String description;
  protected List<String> urls;
  protected List<LockdownInputConfigurationsItem> configurations;

  /**
   * Builder.
   */
  public static class Builder {
    private String lockdownRuleIdentifier;
    private String id;
    private Boolean paused;
    private String description;
    private List<String> urls;
    private List<LockdownInputConfigurationsItem> configurations;

    private Builder(UpdateLockdownRuleOptions updateLockdownRuleOptions) {
      this.lockdownRuleIdentifier = updateLockdownRuleOptions.lockdownRuleIdentifier;
      this.id = updateLockdownRuleOptions.id;
      this.paused = updateLockdownRuleOptions.paused;
      this.description = updateLockdownRuleOptions.description;
      this.urls = updateLockdownRuleOptions.urls;
      this.configurations = updateLockdownRuleOptions.configurations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param lockdownRuleIdentifier the lockdownRuleIdentifier
     */
    public Builder(String lockdownRuleIdentifier) {
      this.lockdownRuleIdentifier = lockdownRuleIdentifier;
    }

    /**
     * Builds a UpdateLockdownRuleOptions.
     *
     * @return the new UpdateLockdownRuleOptions instance
     */
    public UpdateLockdownRuleOptions build() {
      return new UpdateLockdownRuleOptions(this);
    }

    /**
     * Adds an urls to urls.
     *
     * @param urls the new urls
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder addUrls(String urls) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(urls,
        "urls cannot be null");
      if (this.urls == null) {
        this.urls = new ArrayList<String>();
      }
      this.urls.add(urls);
      return this;
    }

    /**
     * Adds an configurations to configurations.
     *
     * @param configurations the new configurations
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder addConfigurations(LockdownInputConfigurationsItem configurations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(configurations,
        "configurations cannot be null");
      if (this.configurations == null) {
        this.configurations = new ArrayList<LockdownInputConfigurationsItem>();
      }
      this.configurations.add(configurations);
      return this;
    }

    /**
     * Set the lockdownRuleIdentifier.
     *
     * @param lockdownRuleIdentifier the lockdownRuleIdentifier
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder lockdownRuleIdentifier(String lockdownRuleIdentifier) {
      this.lockdownRuleIdentifier = lockdownRuleIdentifier;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the urls.
     * Existing urls will be replaced.
     *
     * @param urls the urls
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder urls(List<String> urls) {
      this.urls = urls;
      return this;
    }

    /**
     * Set the configurations.
     * Existing configurations will be replaced.
     *
     * @param configurations the configurations
     * @return the UpdateLockdownRuleOptions builder
     */
    public Builder configurations(List<LockdownInputConfigurationsItem> configurations) {
      this.configurations = configurations;
      return this;
    }
  }

  protected UpdateLockdownRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lockdownRuleIdentifier,
      "lockdownRuleIdentifier cannot be empty");
    lockdownRuleIdentifier = builder.lockdownRuleIdentifier;
    id = builder.id;
    paused = builder.paused;
    description = builder.description;
    urls = builder.urls;
    configurations = builder.configurations;
  }

  /**
   * New builder.
   *
   * @return a UpdateLockdownRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the lockdownRuleIdentifier.
   *
   * Identifier of lockdown rule.
   *
   * @return the lockdownRuleIdentifier
   */
  public String lockdownRuleIdentifier() {
    return lockdownRuleIdentifier;
  }

  /**
   * Gets the id.
   *
   * Lockdown rule identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the paused.
   *
   * Whether this zone lockdown is currently paused.
   *
   * @return the paused
   */
  public Boolean paused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * A note that you can use to describe the reason for a Lockdown rule.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the urls.
   *
   * URLs to be included in this rule definition. Wildcards are permitted. The URL pattern entered here will be escaped
   * before use. This limits the URL to just simple wildcard patterns.
   *
   * @return the urls
   */
  public List<String> urls() {
    return urls;
  }

  /**
   * Gets the configurations.
   *
   * List of IP addresses or CIDR ranges to use for this rule. This can include any number of ip or ip_range
   * configurations that can access the provided URLs.
   *
   * @return the configurations
   */
  public List<LockdownInputConfigurationsItem> configurations() {
    return configurations;
  }
}

