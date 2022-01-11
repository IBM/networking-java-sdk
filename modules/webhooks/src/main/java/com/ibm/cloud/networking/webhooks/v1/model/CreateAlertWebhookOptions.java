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
 * The createAlertWebhook options.
 */
public class CreateAlertWebhookOptions extends GenericModel {

  protected String name;
  protected String url;
  protected String secret;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String url;
    private String secret;

    private Builder(CreateAlertWebhookOptions createAlertWebhookOptions) {
      this.name = createAlertWebhookOptions.name;
      this.url = createAlertWebhookOptions.url;
      this.secret = createAlertWebhookOptions.secret;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAlertWebhookOptions.
     *
     * @return the new CreateAlertWebhookOptions instance
     */
    public CreateAlertWebhookOptions build() {
      return new CreateAlertWebhookOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateAlertWebhookOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the CreateAlertWebhookOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the CreateAlertWebhookOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }
  }

  protected CreateAlertWebhookOptions(Builder builder) {
    name = builder.name;
    url = builder.url;
    secret = builder.secret;
  }

  /**
   * New builder.
   *
   * @return a CreateAlertWebhookOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

