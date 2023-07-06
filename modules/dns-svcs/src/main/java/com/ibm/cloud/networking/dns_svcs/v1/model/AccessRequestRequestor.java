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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The information of requestor.
 */
public class AccessRequestRequestor extends GenericModel {

  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("linked_zone_id")
  protected String linkedZoneId;

  protected AccessRequestRequestor() { }

  /**
   * Gets the accountId.
   *
   * The account ID of requestor.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the instanceId.
   *
   * The requestor's DNS service instance ID.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the linkedZoneId.
   *
   * The requestor's linked zone ID.
   *
   * @return the linkedZoneId
   */
  public String getLinkedZoneId() {
    return linkedZoneId;
  }
}

