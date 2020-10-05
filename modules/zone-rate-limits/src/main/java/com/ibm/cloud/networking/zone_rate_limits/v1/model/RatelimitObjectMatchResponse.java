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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * response.
 */
public class RatelimitObjectMatchResponse extends GenericModel {

  protected List<Long> status;
  protected List<RatelimitObjectMatchResponseHeadersItem> headers;
  @SerializedName("origin_traffic")
  protected Boolean originTraffic;

  /**
   * Gets the status.
   *
   * HTTP Status codes, can be one [403], many [401,403] or indicate all by not providing this value. This field is not
   * required.
   *
   * @return the status
   */
  public List<Long> getStatus() {
    return status;
  }

  /**
   * Gets the headers.
   *
   * Array of response headers to match. If a response does not meet the header criteria then the request will not be
   * counted towards the rate limit.
   *
   * @return the headers
   */
  public List<RatelimitObjectMatchResponseHeadersItem> getHeaders() {
    return headers;
  }

  /**
   * Gets the originTraffic.
   *
   * Deprecated, please use response headers instead and also provide "origin_traffic:false" to avoid legacy behaviour
   * interacting with the response.headers property.
   *
   * @return the originTraffic
   */
  public Boolean isOriginTraffic() {
    return originTraffic;
  }
}

