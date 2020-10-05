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
package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RatelimitInputBypassItem.
 */
public class RatelimitInputBypassItem extends GenericModel {

  /**
   * Rate limit name.
   */
  public interface Name {
    /** url. */
    String URL = "url";
  }

  protected String name;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;

    private Builder(RatelimitInputBypassItem ratelimitInputBypassItem) {
      this.name = ratelimitInputBypassItem.name;
      this.value = ratelimitInputBypassItem.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param value the value
     */
    public Builder(String name, String value) {
      this.name = name;
      this.value = value;
    }

    /**
     * Builds a RatelimitInputBypassItem.
     *
     * @return the new RatelimitInputBypassItem instance
     */
    public RatelimitInputBypassItem build() {
      return new RatelimitInputBypassItem(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RatelimitInputBypassItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the RatelimitInputBypassItem builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected RatelimitInputBypassItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    name = builder.name;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputBypassItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Rate limit name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * The url to bypass.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

