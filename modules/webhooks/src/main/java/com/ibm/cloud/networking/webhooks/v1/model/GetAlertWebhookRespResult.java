/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.networking.webhooks.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for response information.
 */
public class GetAlertWebhookRespResult extends GenericModel {

  protected String id;
  protected String name;
  protected String url;
  protected String type;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("last_success")
  protected String lastSuccess;
  @SerializedName("last_failure")
  protected String lastFailure;

  /**
   * Gets the id.
   *
   * Webhook ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Webhook Name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the url.
   *
   * Webhook url.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the type.
   *
   * Webhook type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the createdAt.
   *
   * When was the webhook created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the lastSuccess.
   *
   * When was the webhook last used successfully.
   *
   * @return the lastSuccess
   */
  public String getLastSuccess() {
    return lastSuccess;
  }

  /**
   * Gets the lastFailure.
   *
   * When was the webhook last used and failed.
   *
   * @return the lastFailure
   */
  public String getLastFailure() {
    return lastFailure;
  }
}

