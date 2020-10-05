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
 * configuration.
 */
public class ZoneAccessRuleObjectConfiguration extends GenericModel {

  /**
   * target.
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
   * Gets the target.
   *
   * target.
   *
   * @return the target
   */
  public String getTarget() {
    return target;
  }

  /**
   * Gets the value.
   *
   * Value for the given target. For ip the value is a valid ip address.For ip_range the value specifies ip range
   * limited to /16 and /24. For asn the value is an AS number. For country the value is a country code for the country.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

