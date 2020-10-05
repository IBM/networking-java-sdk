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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * lockdown object.
 */
public class LockdownObject extends GenericModel {

  protected String id;
  protected Boolean paused;
  protected String description;
  protected List<String> urls;
  protected List<LockdownObjectConfigurationsItem> configurations;

  /**
   * Gets the id.
   *
   * Lockdown rule identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the paused.
   *
   * Whether this zone lockdown is currently paused.
   *
   * @return the paused
   */
  public Boolean isPaused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * A note that you can use to describe the reason for a Lockdown rule.
   *
   * @return the description
   */
  public String getDescription() {
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
  public List<String> getUrls() {
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
  public List<LockdownObjectConfigurationsItem> getConfigurations() {
    return configurations;
  }
}

