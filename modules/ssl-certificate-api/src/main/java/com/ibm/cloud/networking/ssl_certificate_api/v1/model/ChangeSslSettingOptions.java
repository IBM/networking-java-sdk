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
package com.ibm.cloud.networking.ssl_certificate_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The changeSslSetting options.
 */
public class ChangeSslSettingOptions extends GenericModel {

  /**
   * value.
   */
  public interface Value {
    /** off. */
    String OFF = "off";
    /** flexible. */
    String FLEXIBLE = "flexible";
    /** full. */
    String FULL = "full";
    /** strict. */
    String STRICT = "strict";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    private Builder(ChangeSslSettingOptions changeSslSettingOptions) {
      this.value = changeSslSettingOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ChangeSslSettingOptions.
     *
     * @return the new ChangeSslSettingOptions instance
     */
    public ChangeSslSettingOptions build() {
      return new ChangeSslSettingOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ChangeSslSettingOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected ChangeSslSettingOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a ChangeSslSettingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

