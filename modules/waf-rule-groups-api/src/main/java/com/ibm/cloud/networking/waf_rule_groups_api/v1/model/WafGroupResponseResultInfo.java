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
package com.ibm.cloud.networking.waf_rule_groups_api.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Statistics of results.
 */
public class WafGroupResponseResultInfo extends GenericModel {

  protected Long page;
  @SerializedName("per_page")
  protected Long perPage;
  protected Long count;
  @SerializedName("total_count")
  protected Long totalCount;

  /**
   * Gets the page.
   *
   * Page number.
   *
   * @return the page
   */
  public Long getPage() {
    return page;
  }

  /**
   * Gets the perPage.
   *
   * Number of results per page.
   *
   * @return the perPage
   */
  public Long getPerPage() {
    return perPage;
  }

  /**
   * Gets the count.
   *
   * Number of results.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of results.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

