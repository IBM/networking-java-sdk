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
 * The updateAlertPolicy options.
 */
public class UpdateAlertPolicyOptions extends GenericModel {

  /**
   * Condition for the alert. Use 'dos_attack_l7' to set up an HTTP DDOS Attack Alerter, use 'g6_pool_toggle_alert' to
   * set up Load Balancing Pool Enablement Alerter, use 'clickhouse_alert_fw_anomaly' to set up WAF Alerter and
   * 'clickhouse_alert_fw_ent_anomaly' to set up Advanced Security Alerter.
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

  protected String policyId;
  protected String name;
  protected String description;
  protected Boolean enabled;
  protected String alertType;
  protected UpdateAlertPolicyInputMechanisms mechanisms;
  protected Map<String, Object> conditions;
  protected Map<String, Object> filters;

  /**
   * Builder.
   */
  public static class Builder {
    private String policyId;
    private String name;
    private String description;
    private Boolean enabled;
    private String alertType;
    private UpdateAlertPolicyInputMechanisms mechanisms;
    private Map<String, Object> conditions;
    private Map<String, Object> filters;

    private Builder(UpdateAlertPolicyOptions updateAlertPolicyOptions) {
      this.policyId = updateAlertPolicyOptions.policyId;
      this.name = updateAlertPolicyOptions.name;
      this.description = updateAlertPolicyOptions.description;
      this.enabled = updateAlertPolicyOptions.enabled;
      this.alertType = updateAlertPolicyOptions.alertType;
      this.mechanisms = updateAlertPolicyOptions.mechanisms;
      this.conditions = updateAlertPolicyOptions.conditions;
      this.filters = updateAlertPolicyOptions.filters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param policyId the policyId
     */
    public Builder(String policyId) {
      this.policyId = policyId;
    }

    /**
     * Builds a UpdateAlertPolicyOptions.
     *
     * @return the new UpdateAlertPolicyOptions instance
     */
    public UpdateAlertPolicyOptions build() {
      return new UpdateAlertPolicyOptions(this);
    }

    /**
     * Set the policyId.
     *
     * @param policyId the policyId
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the alertType.
     *
     * @param alertType the alertType
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder alertType(String alertType) {
      this.alertType = alertType;
      return this;
    }

    /**
     * Set the mechanisms.
     *
     * @param mechanisms the mechanisms
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder mechanisms(UpdateAlertPolicyInputMechanisms mechanisms) {
      this.mechanisms = mechanisms;
      return this;
    }

    /**
     * Set the conditions.
     *
     * @param conditions the conditions
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder conditions(Map<String, Object> conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Set the filters.
     *
     * @param filters the filters
     * @return the UpdateAlertPolicyOptions builder
     */
    public Builder filters(Map<String, Object> filters) {
      this.filters = filters;
      return this;
    }
  }

  protected UpdateAlertPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyId,
      "policyId cannot be empty");
    policyId = builder.policyId;
    name = builder.name;
    description = builder.description;
    enabled = builder.enabled;
    alertType = builder.alertType;
    mechanisms = builder.mechanisms;
    conditions = builder.conditions;
    filters = builder.filters;
  }

  /**
   * New builder.
   *
   * @return a UpdateAlertPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the policyId.
   *
   * Alert policy identifier.
   *
   * @return the policyId
   */
  public String policyId() {
    return policyId;
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
   * Condition for the alert. Use 'dos_attack_l7' to set up an HTTP DDOS Attack Alerter, use 'g6_pool_toggle_alert' to
   * set up Load Balancing Pool Enablement Alerter, use 'clickhouse_alert_fw_anomaly' to set up WAF Alerter and
   * 'clickhouse_alert_fw_ent_anomaly' to set up Advanced Security Alerter.
   *
   * @return the alertType
   */
  public String alertType() {
    return alertType;
  }

  /**
   * Gets the mechanisms.
   *
   * Delivery mechanisms for the alert, can include an email, a webhook, or both.
   *
   * @return the mechanisms
   */
  public UpdateAlertPolicyInputMechanisms mechanisms() {
    return mechanisms;
  }

  /**
   * Gets the conditions.
   *
   * Conditions depending on the alert type. HTTP DDOS Attack Alerter does not have any conditions. The Load Balancing
   * Pool Enablement Alerter takes conditions that describe for all pools whether the pool is being enabled, disabled,
   * or both.
   *
   * @return the conditions
   */
  public Map<String, Object> conditions() {
    return conditions;
  }

  /**
   * Gets the filters.
   *
   * Optional filters depending for the alert type. HTTP DDOS Attack Alerter does not require any filters. The Load
   * Balancing Pool Enablement Alerter requires a list of IDs for the pools and their corresponding alert trigger (set
   * whether alerts are recieved on disablement, enablement, or both). The basic WAF Alerter requires a list of zones to
   * be monitored. The Advanced Security Alerter requires a list of zones to be monitored as well as a list of services
   * to monitor.
   *
   * @return the filters
   */
  public Map<String, Object> filters() {
    return filters;
  }
}

