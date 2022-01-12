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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * UpdateAlertPolicyInputMechanismsEmailItem.
 */
public class UpdateAlertPolicyInputMechanismsEmailItem extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    private Builder(UpdateAlertPolicyInputMechanismsEmailItem updateAlertPolicyInputMechanismsEmailItem) {
      this.id = updateAlertPolicyInputMechanismsEmailItem.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateAlertPolicyInputMechanismsEmailItem.
     *
     * @return the new UpdateAlertPolicyInputMechanismsEmailItem instance
     */
    public UpdateAlertPolicyInputMechanismsEmailItem build() {
      return new UpdateAlertPolicyInputMechanismsEmailItem(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateAlertPolicyInputMechanismsEmailItem builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected UpdateAlertPolicyInputMechanismsEmailItem(Builder builder) {
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a UpdateAlertPolicyInputMechanismsEmailItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

