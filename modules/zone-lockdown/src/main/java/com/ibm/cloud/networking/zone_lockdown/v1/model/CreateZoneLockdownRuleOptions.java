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
 * The createZoneLockdownRule options.
 */
public class CreateZoneLockdownRuleOptions extends GenericModel {

  protected String id;
  protected Boolean paused;
  protected String description;
  protected List<String> urls;
  protected List<LockdownInputConfigurationsItem> configurations;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean paused;
    private String description;
    private List<String> urls;
    private List<LockdownInputConfigurationsItem> configurations;

    private Builder(CreateZoneLockdownRuleOptions createZoneLockdownRuleOptions) {
      this.id = createZoneLockdownRuleOptions.id;
      this.paused = createZoneLockdownRuleOptions.paused;
      this.description = createZoneLockdownRuleOptions.description;
      this.urls = createZoneLockdownRuleOptions.urls;
      this.configurations = createZoneLockdownRuleOptions.configurations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateZoneLockdownRuleOptions.
     *
     * @return the new CreateZoneLockdownRuleOptions instance
     */
    public CreateZoneLockdownRuleOptions build() {
      return new CreateZoneLockdownRuleOptions(this);
    }

    /**
     * Adds an urls to urls.
     *
     * @param urls the new urls
     * @return the CreateZoneLockdownRuleOptions builder
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
     * @return the CreateZoneLockdownRuleOptions builder
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
     * Set the id.
     *
     * @param id the id
     * @return the CreateZoneLockdownRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the CreateZoneLockdownRuleOptions builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateZoneLockdownRuleOptions builder
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
     * @return the CreateZoneLockdownRuleOptions builder
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
     * @return the CreateZoneLockdownRuleOptions builder
     */
    public Builder configurations(List<LockdownInputConfigurationsItem> configurations) {
      this.configurations = configurations;
      return this;
    }
  }

  protected CreateZoneLockdownRuleOptions(Builder builder) {
    id = builder.id;
    paused = builder.paused;
    description = builder.description;
    urls = builder.urls;
    configurations = builder.configurations;
  }

  /**
   * New builder.
   *
   * @return a CreateZoneLockdownRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

