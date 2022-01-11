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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getWebhook options.
 */
public class GetWebhookOptions extends GenericModel {

  protected String webhookId;

  /**
   * Builder.
   */
  public static class Builder {
    private String webhookId;

    private Builder(GetWebhookOptions getWebhookOptions) {
      this.webhookId = getWebhookOptions.webhookId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param webhookId the webhookId
     */
    public Builder(String webhookId) {
      this.webhookId = webhookId;
    }

    /**
     * Builds a GetWebhookOptions.
     *
     * @return the new GetWebhookOptions instance
     */
    public GetWebhookOptions build() {
      return new GetWebhookOptions(this);
    }

    /**
     * Set the webhookId.
     *
     * @param webhookId the webhookId
     * @return the GetWebhookOptions builder
     */
    public Builder webhookId(String webhookId) {
      this.webhookId = webhookId;
      return this;
    }
  }

  protected GetWebhookOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.webhookId,
      "webhookId cannot be empty");
    webhookId = builder.webhookId;
  }

  /**
   * New builder.
   *
   * @return a GetWebhookOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the webhookId.
   *
   * Alert webhook identifier.
   *
   * @return the webhookId
   */
  public String webhookId() {
    return webhookId;
  }
}

