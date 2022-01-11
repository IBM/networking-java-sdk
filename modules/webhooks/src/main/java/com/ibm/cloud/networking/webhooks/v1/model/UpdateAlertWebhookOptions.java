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
 * The updateAlertWebhook options.
 */
public class UpdateAlertWebhookOptions extends GenericModel {

  protected String webhookId;
  protected String name;
  protected String url;
  protected String secret;

  /**
   * Builder.
   */
  public static class Builder {
    private String webhookId;
    private String name;
    private String url;
    private String secret;

    private Builder(UpdateAlertWebhookOptions updateAlertWebhookOptions) {
      this.webhookId = updateAlertWebhookOptions.webhookId;
      this.name = updateAlertWebhookOptions.name;
      this.url = updateAlertWebhookOptions.url;
      this.secret = updateAlertWebhookOptions.secret;
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
     * Builds a UpdateAlertWebhookOptions.
     *
     * @return the new UpdateAlertWebhookOptions instance
     */
    public UpdateAlertWebhookOptions build() {
      return new UpdateAlertWebhookOptions(this);
    }

    /**
     * Set the webhookId.
     *
     * @param webhookId the webhookId
     * @return the UpdateAlertWebhookOptions builder
     */
    public Builder webhookId(String webhookId) {
      this.webhookId = webhookId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateAlertWebhookOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the UpdateAlertWebhookOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the UpdateAlertWebhookOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }
  }

  protected UpdateAlertWebhookOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.webhookId,
      "webhookId cannot be empty");
    webhookId = builder.webhookId;
    name = builder.name;
    url = builder.url;
    secret = builder.secret;
  }

  /**
   * New builder.
   *
   * @return a UpdateAlertWebhookOptions builder
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

  /**
   * Gets the name.
   *
   * Webhook Name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the url.
   *
   * Webhook url.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the secret.
   *
   * The optional secret or API key needed to use the webhook.
   *
   * @return the secret
   */
  public String secret() {
    return secret;
  }
}

