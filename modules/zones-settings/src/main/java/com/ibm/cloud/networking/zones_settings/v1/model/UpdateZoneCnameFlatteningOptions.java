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
 * The updateZoneCnameFlattening options.
 */
public class UpdateZoneCnameFlatteningOptions extends GenericModel {

  /**
   * Valid values are "flatten_at_root", "flatten_all". "flatten_at_root" - Flatten CNAME at root domain. This is the
   * default value. "flatten_all" - Flatten all CNAME records under your domain.
   */
  public interface Value {
    /** flatten_at_root. */
    String FLATTEN_AT_ROOT = "flatten_at_root";
    /** flatten_all. */
    String FLATTEN_ALL = "flatten_all";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    private Builder(UpdateZoneCnameFlatteningOptions updateZoneCnameFlatteningOptions) {
      this.value = updateZoneCnameFlatteningOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateZoneCnameFlatteningOptions.
     *
     * @return the new UpdateZoneCnameFlatteningOptions instance
     */
    public UpdateZoneCnameFlatteningOptions build() {
      return new UpdateZoneCnameFlatteningOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateZoneCnameFlatteningOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateZoneCnameFlatteningOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateZoneCnameFlatteningOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Valid values are "flatten_at_root", "flatten_all". "flatten_at_root" - Flatten CNAME at root domain. This is the
   * default value. "flatten_all" - Flatten all CNAME records under your domain.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

