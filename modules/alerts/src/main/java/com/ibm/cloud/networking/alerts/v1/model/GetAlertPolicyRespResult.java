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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for response information.
 */
public class GetAlertPolicyRespResult extends GenericModel {

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

  protected String id;
  protected String name;
  protected String description;
  protected Boolean enabled;
  @SerializedName("alert_type")
  protected String alertType;
  protected GetAlertPolicyRespResultMechanisms mechanisms;
  protected String created;
  protected String modified;
  protected Map<String, Object> conditions;
  protected Map<String, Object> filters;

  /**
   * Gets the id.
   *
   * Policy ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Policy Name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Alert Policy description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Is the alert enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the alertType.
   *
   * Condition for the alert.
   *
   * @return the alertType
   */
  public String getAlertType() {
    return alertType;
  }

  /**
   * Gets the mechanisms.
   *
   * Delivery mechanisms for the alert, can include an email, a webhook, or both.
   *
   * @return the mechanisms
   */
  public GetAlertPolicyRespResultMechanisms getMechanisms() {
    return mechanisms;
  }

  /**
   * Gets the created.
   *
   * When was the policy first created.
   *
   * @return the created
   */
  public String getCreated() {
    return created;
  }

  /**
   * Gets the modified.
   *
   * When was the policy last modified.
   *
   * @return the modified
   */
  public String getModified() {
    return modified;
  }

  /**
   * Gets the conditions.
   *
   * Optional conditions depending for the alert type.
   *
   * @return the conditions
   */
  public Map<String, Object> getConditions() {
    return conditions;
  }

  /**
   * Gets the filters.
   *
   * Optional filters depending for the alert type.
   *
   * @return the filters
   */
  public Map<String, Object> getFilters() {
    return filters;
  }
}

