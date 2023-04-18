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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The HTTP header of health check request.
 */
public class HealthcheckHeader extends GenericModel {

  protected String name;
  protected List<String> value;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> value;

    private Builder(HealthcheckHeader healthcheckHeader) {
      this.name = healthcheckHeader.name;
      this.value = healthcheckHeader.value;
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
    public Builder(String name, List<String> value) {
      this.name = name;
      this.value = value;
    }

    /**
     * Builds a HealthcheckHeader.
     *
     * @return the new HealthcheckHeader instance
     */
    public HealthcheckHeader build() {
      return new HealthcheckHeader(this);
    }

    /**
     * Adds an value to value.
     *
     * @param value the new value
     * @return the HealthcheckHeader builder
     */
    public Builder addValue(String value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(value,
        "value cannot be null");
      if (this.value == null) {
        this.value = new ArrayList<String>();
      }
      this.value.add(value);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the HealthcheckHeader builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     * Existing value will be replaced.
     *
     * @param value the value
     * @return the HealthcheckHeader builder
     */
    public Builder value(List<String> value) {
      this.value = value;
      return this;
    }
  }

  protected HealthcheckHeader(Builder builder) {
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
   * @return a HealthcheckHeader builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of HTTP request header.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * The value of HTTP request header.
   *
   * @return the value
   */
  public List<String> value() {
    return value;
  }
}

