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
package com.ibm.cloud.networking.alerts.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Delivery mechanisms for the alert, can include an email, a webhook, or both.
 */
public class UpdateAlertPolicyInputMechanisms extends GenericModel {

  protected List<UpdateAlertPolicyInputMechanismsEmailItem> email;
  protected List<UpdateAlertPolicyInputMechanismsWebhooksItem> webhooks;

  /**
   * Builder.
   */
  public static class Builder {
    private List<UpdateAlertPolicyInputMechanismsEmailItem> email;
    private List<UpdateAlertPolicyInputMechanismsWebhooksItem> webhooks;

    private Builder(UpdateAlertPolicyInputMechanisms updateAlertPolicyInputMechanisms) {
      this.email = updateAlertPolicyInputMechanisms.email;
      this.webhooks = updateAlertPolicyInputMechanisms.webhooks;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateAlertPolicyInputMechanisms.
     *
     * @return the new UpdateAlertPolicyInputMechanisms instance
     */
    public UpdateAlertPolicyInputMechanisms build() {
      return new UpdateAlertPolicyInputMechanisms(this);
    }

    /**
     * Adds an email to email.
     *
     * @param email the new email
     * @return the UpdateAlertPolicyInputMechanisms builder
     */
    public Builder addEmail(UpdateAlertPolicyInputMechanismsEmailItem email) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(email,
        "email cannot be null");
      if (this.email == null) {
        this.email = new ArrayList<UpdateAlertPolicyInputMechanismsEmailItem>();
      }
      this.email.add(email);
      return this;
    }

    /**
     * Adds an webhooks to webhooks.
     *
     * @param webhooks the new webhooks
     * @return the UpdateAlertPolicyInputMechanisms builder
     */
    public Builder addWebhooks(UpdateAlertPolicyInputMechanismsWebhooksItem webhooks) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(webhooks,
        "webhooks cannot be null");
      if (this.webhooks == null) {
        this.webhooks = new ArrayList<UpdateAlertPolicyInputMechanismsWebhooksItem>();
      }
      this.webhooks.add(webhooks);
      return this;
    }

    /**
     * Set the email.
     * Existing email will be replaced.
     *
     * @param email the email
     * @return the UpdateAlertPolicyInputMechanisms builder
     */
    public Builder email(List<UpdateAlertPolicyInputMechanismsEmailItem> email) {
      this.email = email;
      return this;
    }

    /**
     * Set the webhooks.
     * Existing webhooks will be replaced.
     *
     * @param webhooks the webhooks
     * @return the UpdateAlertPolicyInputMechanisms builder
     */
    public Builder webhooks(List<UpdateAlertPolicyInputMechanismsWebhooksItem> webhooks) {
      this.webhooks = webhooks;
      return this;
    }
  }

  protected UpdateAlertPolicyInputMechanisms(Builder builder) {
    email = builder.email;
    webhooks = builder.webhooks;
  }

  /**
   * New builder.
   *
   * @return a UpdateAlertPolicyInputMechanisms builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public List<UpdateAlertPolicyInputMechanismsEmailItem> email() {
    return email;
  }

  /**
   * Gets the webhooks.
   *
   * @return the webhooks
   */
  public List<UpdateAlertPolicyInputMechanismsWebhooksItem> webhooks() {
    return webhooks;
  }
}

