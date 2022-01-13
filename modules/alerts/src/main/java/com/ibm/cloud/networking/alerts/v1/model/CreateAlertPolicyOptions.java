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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createAlertPolicy options.
 */
public class CreateAlertPolicyOptions extends GenericModel {

  /**
   * Condition for the alert.
   */
  public interface AlertType {
    /** dos_attack_l7. */
    String DOS_ATTACK_L7 = "dos_attack_l7";
    /** g6_pool_toggle_alert. */
    String G6_POOL_TOGGLE_ALERT = "g6_pool_toggle_alert";
    /** clickhouse_alert_fw_anomaly. */
    String CLICKHOUSE_ALERT_FW_ANOMALY = "clickhouse_alert_fw_anomaly";
    /** clickhouse_alert_fw_ent_anomaly. */
    String CLICKHOUSE_ALERT_FW_ENT_ANOMALY = "clickhouse_alert_fw_ent_anomaly";
  }

  protected String name;
  protected String description;
  protected Boolean enabled;
  protected String alertType;
  protected CreateAlertPolicyInputMechanisms mechanisms;
  protected Map<String, Object> filters;
  protected Map<String, Object> conditions;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private Boolean enabled;
    private String alertType;
    private CreateAlertPolicyInputMechanisms mechanisms;
    private Map<String, Object> filters;
    private Map<String, Object> conditions;

    private Builder(CreateAlertPolicyOptions createAlertPolicyOptions) {
      this.name = createAlertPolicyOptions.name;
      this.description = createAlertPolicyOptions.description;
      this.enabled = createAlertPolicyOptions.enabled;
      this.alertType = createAlertPolicyOptions.alertType;
      this.mechanisms = createAlertPolicyOptions.mechanisms;
      this.filters = createAlertPolicyOptions.filters;
      this.conditions = createAlertPolicyOptions.conditions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAlertPolicyOptions.
     *
     * @return the new CreateAlertPolicyOptions instance
     */
    public CreateAlertPolicyOptions build() {
      return new CreateAlertPolicyOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the alertType.
     *
     * @param alertType the alertType
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder alertType(String alertType) {
      this.alertType = alertType;
      return this;
    }

    /**
     * Set the mechanisms.
     *
     * @param mechanisms the mechanisms
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder mechanisms(CreateAlertPolicyInputMechanisms mechanisms) {
      this.mechanisms = mechanisms;
      return this;
    }

    /**
     * Set the filters.
     *
     * @param filters the filters
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder filters(Map<String, Object> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * Set the conditions.
     *
     * @param conditions the conditions
     * @return the CreateAlertPolicyOptions builder
     */
    public Builder conditions(Map<String, Object> conditions) {
      this.conditions = conditions;
      return this;
    }
  }

  protected CreateAlertPolicyOptions(Builder builder) {
    name = builder.name;
    description = builder.description;
    enabled = builder.enabled;
    alertType = builder.alertType;
    mechanisms = builder.mechanisms;
    filters = builder.filters;
    conditions = builder.conditions;
  }

  /**
   * New builder.
   *
   * @return a CreateAlertPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Policy name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Policy description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Is the alert policy active.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the alertType.
   *
   * Condition for the alert.
   *
   * @return the alertType
   */
  public String alertType() {
    return alertType;
  }

  /**
   * Gets the mechanisms.
   *
   * Delivery mechanisms for the alert.
   *
   * @return the mechanisms
   */
  public CreateAlertPolicyInputMechanisms mechanisms() {
    return mechanisms;
  }

  /**
   * Gets the filters.
   *
   * Optional filters depending for the alert type.
   *
   * @return the filters
   */
  public Map<String, Object> filters() {
    return filters;
  }

  /**
   * Gets the conditions.
   *
   * Conditions depending on the alert type. HTTP DDOS Attack Alerter does not have any conditions. The Load Balancing
   * Pool Enablement Alerter takes conditions that describe for all pools whether the pool is being enabled, disabled,
   * or both. This field is not required when creating a new alert.
   *
   * @return the conditions
   */
  public Map<String, Object> conditions() {
    return conditions;
  }
}

