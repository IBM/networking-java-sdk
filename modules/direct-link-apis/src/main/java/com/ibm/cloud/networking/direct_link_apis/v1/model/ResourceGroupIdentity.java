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
package com.ibm.cloud.networking.direct_link_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Resource group for this resource. If unspecified, the account's [default resource
 * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
 */
public class ResourceGroupIdentity extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    private Builder(ResourceGroupIdentity resourceGroupIdentity) {
      this.id = resourceGroupIdentity.id;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ResourceGroupIdentity.
     *
     * @return the new ResourceGroupIdentity instance
     */
    public ResourceGroupIdentity build() {
      return new ResourceGroupIdentity(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ResourceGroupIdentity builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ResourceGroupIdentity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ResourceGroupIdentity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Resource group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

