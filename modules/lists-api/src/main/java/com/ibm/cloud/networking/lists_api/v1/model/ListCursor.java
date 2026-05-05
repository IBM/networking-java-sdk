/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ListCursor.
 */
public class ListCursor extends GenericModel {

  protected String after;
  protected String before;

  protected ListCursor() { }

  /**
   * Gets the after.
   *
   * The cursor token to fetch the next page of results.
   *
   * @return the after
   */
  public String getAfter() {
    return after;
  }

  /**
   * Gets the before.
   *
   * The cursor token to fetch the previous page of results.
   *
   * @return the before
   */
  public String getBefore() {
    return before;
  }
}

