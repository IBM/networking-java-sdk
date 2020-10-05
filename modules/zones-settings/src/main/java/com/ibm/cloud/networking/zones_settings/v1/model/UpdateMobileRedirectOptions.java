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
 * The updateMobileRedirect options.
 */
public class UpdateMobileRedirectOptions extends GenericModel {

  protected MobileRedirecSettingValue value;

  /**
   * Builder.
   */
  public static class Builder {
    private MobileRedirecSettingValue value;

    private Builder(UpdateMobileRedirectOptions updateMobileRedirectOptions) {
      this.value = updateMobileRedirectOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateMobileRedirectOptions.
     *
     * @return the new UpdateMobileRedirectOptions instance
     */
    public UpdateMobileRedirectOptions build() {
      return new UpdateMobileRedirectOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateMobileRedirectOptions builder
     */
    public Builder value(MobileRedirecSettingValue value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateMobileRedirectOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateMobileRedirectOptions builder
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
  public MobileRedirecSettingValue value() {
    return value;
  }
}

