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
package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RatelimitObjectBypassItem.
 */
public class RatelimitObjectBypassItem extends GenericModel {

  /**
   * rate limit name.
   */
  public interface Name {
    /** url. */
    String URL = "url";
  }

  protected String name;
  protected String value;

  /**
   * Gets the name.
   *
   * rate limit name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the value.
   *
   * The url to bypass.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

