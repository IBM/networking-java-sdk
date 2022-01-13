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
 * Delivery mechanisms for the alert.
 */
public class CreateAlertPolicyInputMechanisms extends GenericModel {

  protected List<CreateAlertPolicyInputMechanismsEmailItem> email;
  protected List<CreateAlertPolicyInputMechanismsWebhooksItem> webhooks;

  /**
   * Builder.
   */
  public static class Builder {
    private List<CreateAlertPolicyInputMechanismsEmailItem> email;
    private List<CreateAlertPolicyInputMechanismsWebhooksItem> webhooks;

    private Builder(CreateAlertPolicyInputMechanisms createAlertPolicyInputMechanisms) {
      this.email = createAlertPolicyInputMechanisms.email;
      this.webhooks = createAlertPolicyInputMechanisms.webhooks;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAlertPolicyInputMechanisms.
     *
     * @return the new CreateAlertPolicyInputMechanisms instance
     */
    public CreateAlertPolicyInputMechanisms build() {
      return new CreateAlertPolicyInputMechanisms(this);
    }

    /**
     * Adds an email to email.
     *
     * @param email the new email
     * @return the CreateAlertPolicyInputMechanisms builder
     */
    public Builder addEmail(CreateAlertPolicyInputMechanismsEmailItem email) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(email,
        "email cannot be null");
      if (this.email == null) {
        this.email = new ArrayList<CreateAlertPolicyInputMechanismsEmailItem>();
      }
      this.email.add(email);
      return this;
    }

    /**
     * Adds an webhooks to webhooks.
     *
     * @param webhooks the new webhooks
     * @return the CreateAlertPolicyInputMechanisms builder
     */
    public Builder addWebhooks(CreateAlertPolicyInputMechanismsWebhooksItem webhooks) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(webhooks,
        "webhooks cannot be null");
      if (this.webhooks == null) {
        this.webhooks = new ArrayList<CreateAlertPolicyInputMechanismsWebhooksItem>();
      }
      this.webhooks.add(webhooks);
      return this;
    }

    /**
     * Set the email.
     * Existing email will be replaced.
     *
     * @param email the email
     * @return the CreateAlertPolicyInputMechanisms builder
     */
    public Builder email(List<CreateAlertPolicyInputMechanismsEmailItem> email) {
      this.email = email;
      return this;
    }

    /**
     * Set the webhooks.
     * Existing webhooks will be replaced.
     *
     * @param webhooks the webhooks
     * @return the CreateAlertPolicyInputMechanisms builder
     */
    public Builder webhooks(List<CreateAlertPolicyInputMechanismsWebhooksItem> webhooks) {
      this.webhooks = webhooks;
      return this;
    }
  }

  protected CreateAlertPolicyInputMechanisms(Builder builder) {
    email = builder.email;
    webhooks = builder.webhooks;
  }

  /**
   * New builder.
   *
   * @return a CreateAlertPolicyInputMechanisms builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public List<CreateAlertPolicyInputMechanismsEmailItem> email() {
    return email;
  }

  /**
   * Gets the webhooks.
   *
   * @return the webhooks
   */
  public List<CreateAlertPolicyInputMechanismsWebhooksItem> webhooks() {
    return webhooks;
  }
}

