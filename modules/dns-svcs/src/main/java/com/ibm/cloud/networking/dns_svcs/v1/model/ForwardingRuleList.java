/*
 * (C) Copyright IBM Corp. 2021.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An array of forwarding rules.
 */
public class ForwardingRuleList extends GenericModel {

  @SerializedName("forwarding_rules")
  protected List<ForwardingRule> forwardingRules;

  /**
   * Gets the forwardingRules.
   *
   * @return the forwardingRules
   */
  public List<ForwardingRule> getForwardingRules() {
    return forwardingRules;
  }
}

