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
 * The updatePseudoIpv4 options.
 */
public class UpdatePseudoIpv4Options extends GenericModel {

  /**
   * Value.
   */
  public interface Value {
    /** off. */
    String OFF = "off";
    /** add_header. */
    String ADD_HEADER = "add_header";
    /** overwrite_header. */
    String OVERWRITE_HEADER = "overwrite_header";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    private Builder(UpdatePseudoIpv4Options updatePseudoIpv4Options) {
      this.value = updatePseudoIpv4Options.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdatePseudoIpv4Options.
     *
     * @return the new UpdatePseudoIpv4Options instance
     */
    public UpdatePseudoIpv4Options build() {
      return new UpdatePseudoIpv4Options(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdatePseudoIpv4Options builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdatePseudoIpv4Options(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdatePseudoIpv4Options builder
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

