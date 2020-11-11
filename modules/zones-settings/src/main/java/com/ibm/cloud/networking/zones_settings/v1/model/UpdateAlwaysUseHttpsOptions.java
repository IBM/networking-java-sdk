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
package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateAlwaysUseHttps options.
 */
public class UpdateAlwaysUseHttpsOptions extends GenericModel {

  /**
   * Value.
   */
  public interface Value {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    private Builder(UpdateAlwaysUseHttpsOptions updateAlwaysUseHttpsOptions) {
      this.value = updateAlwaysUseHttpsOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateAlwaysUseHttpsOptions.
     *
     * @return the new UpdateAlwaysUseHttpsOptions instance
     */
    public UpdateAlwaysUseHttpsOptions build() {
      return new UpdateAlwaysUseHttpsOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateAlwaysUseHttpsOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateAlwaysUseHttpsOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateAlwaysUseHttpsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

