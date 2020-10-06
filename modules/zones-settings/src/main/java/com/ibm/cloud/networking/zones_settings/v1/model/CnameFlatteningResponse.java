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
 * CNAME Flattening response.
 */
public class CnameFlatteningResponse extends GenericModel {

  /**
   * value.
   */
  public interface Value {
    /** flatten_all. */
    String FLATTEN_ALL = "flatten_all";
    /** flatten_at_root. */
    String FLATTEN_AT_ROOT = "flatten_at_root";
  }

  protected String id;
  protected String value;
  @SerializedName("modified_on")
  protected Date modifiedOn;
  protected Boolean editable;

  /**
   * Gets the id.
   *
   * id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the value.
   *
   * value.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * Gets the modifiedOn.
   *
   * Date when it is modified.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the editable.
   *
   * editable.
   *
   * @return the editable
   */
  public Boolean isEditable() {
    return editable;
  }
}

