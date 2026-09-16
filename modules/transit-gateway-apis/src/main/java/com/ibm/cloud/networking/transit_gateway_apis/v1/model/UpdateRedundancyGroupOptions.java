/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateRedundancyGroup options.
 */
public class UpdateRedundancyGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> redundancyGroupPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> redundancyGroupPatch;

    /**
     * Instantiates a new Builder from an existing UpdateRedundancyGroupOptions instance.
     *
     * @param updateRedundancyGroupOptions the instance to initialize the Builder with
     */
    private Builder(UpdateRedundancyGroupOptions updateRedundancyGroupOptions) {
      this.id = updateRedundancyGroupOptions.id;
      this.redundancyGroupPatch = updateRedundancyGroupOptions.redundancyGroupPatch;
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
     * @param redundancyGroupPatch the redundancyGroupPatch
     */
    public Builder(String id, Map<String, Object> redundancyGroupPatch) {
      this.id = id;
      this.redundancyGroupPatch = redundancyGroupPatch;
    }

    /**
     * Builds a UpdateRedundancyGroupOptions.
     *
     * @return the new UpdateRedundancyGroupOptions instance
     */
    public UpdateRedundancyGroupOptions build() {
      return new UpdateRedundancyGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateRedundancyGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the redundancyGroupPatch.
     *
     * @param redundancyGroupPatch the redundancyGroupPatch
     * @return the UpdateRedundancyGroupOptions builder
     */
    public Builder redundancyGroupPatch(Map<String, Object> redundancyGroupPatch) {
      this.redundancyGroupPatch = redundancyGroupPatch;
      return this;
    }
  }

  protected UpdateRedundancyGroupOptions() { }

  protected UpdateRedundancyGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.redundancyGroupPatch,
      "redundancyGroupPatch cannot be null");
    id = builder.id;
    redundancyGroupPatch = builder.redundancyGroupPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateRedundancyGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The redundancy group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the redundancyGroupPatch.
   *
   * The redundancy group update template.
   *
   * @return the redundancyGroupPatch
   */
  public Map<String, Object> redundancyGroupPatch() {
    return redundancyGroupPatch;
  }
}

