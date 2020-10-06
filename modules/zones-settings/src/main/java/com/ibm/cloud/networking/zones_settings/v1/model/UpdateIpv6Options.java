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
 * The updateIpv6 options.
 */
public class UpdateIpv6Options extends GenericModel {

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

    private Builder(UpdateIpv6Options updateIpv6Options) {
      this.value = updateIpv6Options.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateIpv6Options.
     *
     * @return the new UpdateIpv6Options instance
     */
    public UpdateIpv6Options build() {
      return new UpdateIpv6Options(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateIpv6Options builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateIpv6Options(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateIpv6Options builder
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

