/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.security_events_api.v1.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecurityEventObjectMatchesItem.
 */
public class SecurityEventObjectMatchesItem extends GenericModel {

  @SerializedName("rule_id")
  protected String ruleId;
  protected String source;
  protected String action;
  protected Map<String, Object> metadata;

  /**
   * Gets the ruleId.
   *
   * The ID of the rule that triggered the event, should be considered in the context of source.
   *
   * @return the ruleId
   */
  public String getRuleId() {
    return ruleId;
  }

  /**
   * Gets the source.
   *
   * Source of the event.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the action.
   *
   * What type of action was taken.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the metadata.
   *
   * metadata.
   *
   * @return the metadata
   */
  public Map<String, Object> getMetadata() {
    return metadata;
  }
}

