/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.mtls.v1.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Policy rule.
 *
 * Classes which extend this class:
 * - PolicyRulePolicyCertRule
 * - PolicyRulePolicyCnRule
 */
public class PolicyRule extends GenericModel {

  protected Map<String, Object> certificate;
  @SerializedName("common_name")
  protected PolicyCnRuleCommonName commonName;

  protected PolicyRule() { }

  /**
   * Gets the certificate.
   *
   * @return the certificate
   */
  public Map<String, Object> certificate() {
    return certificate;
  }

  /**
   * Gets the commonName.
   *
   * @return the commonName
   */
  public PolicyCnRuleCommonName commonName() {
    return commonName;
  }
}

