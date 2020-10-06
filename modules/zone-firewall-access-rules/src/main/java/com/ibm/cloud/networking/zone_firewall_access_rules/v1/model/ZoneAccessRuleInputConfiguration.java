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
package com.ibm.cloud.networking.zone_firewall_access_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Configuration object specifying access rule.
 */
public class ZoneAccessRuleInputConfiguration extends GenericModel {

  /**
   * The request property to target.
   */
  public interface Target {
    /** ip. */
    String IP = "ip";
    /** ip_range. */
    String IP_RANGE = "ip_range";
    /** asn. */
    String ASN = "asn";
    /** country. */
    String COUNTRY = "country";
  }

  protected String target;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private String value;

    private Builder(ZoneAccessRuleInputConfiguration zoneAccessRuleInputConfiguration) {
      this.target = zoneAccessRuleInputConfiguration.target;
      this.value = zoneAccessRuleInputConfiguration.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     * @param value the value
     */
    public Builder(String target, String value) {
      this.target = target;
      this.value = value;
    }

    /**
     * Builds a ZoneAccessRuleInputConfiguration.
     *
     * @return the new ZoneAccessRuleInputConfiguration instance
     */
    public ZoneAccessRuleInputConfiguration build() {
      return new ZoneAccessRuleInputConfiguration(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the ZoneAccessRuleInputConfiguration builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ZoneAccessRuleInputConfiguration builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected ZoneAccessRuleInputConfiguration(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    target = builder.target;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a ZoneAccessRuleInputConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * The request property to target.
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the value.
   *
   * The value for the selected target.For ip the value is a valid ip address.For ip_range the value specifies ip range
   * limited to /16 and /24. For asn the value is an AS number. For country the value is a country code for the country.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

