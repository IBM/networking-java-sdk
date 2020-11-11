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
package com.ibm.cloud.networking.zones_settings.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for response information.
 */
public class ChallengeTtlRespResult extends GenericModel {

  protected String id;
  protected Long value;
  protected Boolean editable;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  /**
   * Gets the id.
   *
   * ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the value.
   *
   * Value.
   *
   * @return the value
   */
  public Long getValue() {
    return value;
  }

  /**
   * Gets the editable.
   *
   * Editable.
   *
   * @return the editable
   */
  public Boolean isEditable() {
    return editable;
  }

  /**
   * Gets the modifiedOn.
   *
   * Modified date.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

