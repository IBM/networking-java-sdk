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
package com.ibm.cloud.networking.caching_api.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The purgeByHosts options.
 */
public class PurgeByHostsOptions extends GenericModel {

  protected List<String> hosts;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> hosts;

    private Builder(PurgeByHostsOptions purgeByHostsOptions) {
      this.hosts = purgeByHostsOptions.hosts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PurgeByHostsOptions.
     *
     * @return the new PurgeByHostsOptions instance
     */
    public PurgeByHostsOptions build() {
      return new PurgeByHostsOptions(this);
    }

    /**
     * Adds an hosts to hosts.
     *
     * @param hosts the new hosts
     * @return the PurgeByHostsOptions builder
     */
    public Builder addHosts(String hosts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hosts,
        "hosts cannot be null");
      if (this.hosts == null) {
        this.hosts = new ArrayList<String>();
      }
      this.hosts.add(hosts);
      return this;
    }

    /**
     * Set the hosts.
     * Existing hosts will be replaced.
     *
     * @param hosts the hosts
     * @return the PurgeByHostsOptions builder
     */
    public Builder hosts(List<String> hosts) {
      this.hosts = hosts;
      return this;
    }
  }

  protected PurgeByHostsOptions(Builder builder) {
    hosts = builder.hosts;
  }

  /**
   * New builder.
   *
   * @return a PurgeByHostsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hosts.
   *
   * hosts name.
   *
   * @return the hosts
   */
  public List<String> hosts() {
    return hosts;
  }
}

