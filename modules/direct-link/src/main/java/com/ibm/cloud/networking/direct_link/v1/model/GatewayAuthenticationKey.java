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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BGP MD5 authentication key.
 *
 * BGP MD5 keys must be type=standard.
 *
 * The key material that you provide must be base64 encoded and original string must be maximum 126 ASCII characters in
 * length.
 *
 * To clear the optional `authentication_key` field patch its crn to `""`.
 */
public class GatewayAuthenticationKey extends GenericModel {

  protected String crn;

  /**
   * Gets the crn.
   *
   * connectivity association key crn.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }
}

