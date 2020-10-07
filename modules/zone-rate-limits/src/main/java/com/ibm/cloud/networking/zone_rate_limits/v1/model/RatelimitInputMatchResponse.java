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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * response.
 */
public class RatelimitInputMatchResponse extends GenericModel {

  protected List<Long> status;
  protected List<RatelimitInputMatchResponseHeadersItem> headers;
  @SerializedName("origin_traffic")
  protected Boolean originTraffic;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Long> status;
    private List<RatelimitInputMatchResponseHeadersItem> headers;
    private Boolean originTraffic;

    private Builder(RatelimitInputMatchResponse ratelimitInputMatchResponse) {
      this.status = ratelimitInputMatchResponse.status;
      this.headers = ratelimitInputMatchResponse.headers;
      this.originTraffic = ratelimitInputMatchResponse.originTraffic;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RatelimitInputMatchResponse.
     *
     * @return the new RatelimitInputMatchResponse instance
     */
    public RatelimitInputMatchResponse build() {
      return new RatelimitInputMatchResponse(this);
    }

    /**
     * Adds an status to status.
     *
     * @param status the new status
     * @return the RatelimitInputMatchResponse builder
     */
    public Builder addStatus(Long status) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(status,
        "status cannot be null");
      if (this.status == null) {
        this.status = new ArrayList<Long>();
      }
      this.status.add(status);
      return this;
    }

    /**
     * Adds an headers to headers.
     *
     * @param headers the new headers
     * @return the RatelimitInputMatchResponse builder
     */
    public Builder addHeaders(RatelimitInputMatchResponseHeadersItem headers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(headers,
        "headers cannot be null");
      if (this.headers == null) {
        this.headers = new ArrayList<RatelimitInputMatchResponseHeadersItem>();
      }
      this.headers.add(headers);
      return this;
    }

    /**
     * Set the status.
     * Existing status will be replaced.
     *
     * @param status the status
     * @return the RatelimitInputMatchResponse builder
     */
    public Builder status(List<Long> status) {
      this.status = status;
      return this;
    }

    /**
     * Set the headers.
     * Existing headers will be replaced.
     *
     * @param headers the headers
     * @return the RatelimitInputMatchResponse builder
     */
    public Builder headers(List<RatelimitInputMatchResponseHeadersItem> headers) {
      this.headers = headers;
      return this;
    }

    /**
     * Set the originTraffic.
     *
     * @param originTraffic the originTraffic
     * @return the RatelimitInputMatchResponse builder
     */
    public Builder originTraffic(Boolean originTraffic) {
      this.originTraffic = originTraffic;
      return this;
    }
  }

  protected RatelimitInputMatchResponse(Builder builder) {
    status = builder.status;
    headers = builder.headers;
    originTraffic = builder.originTraffic;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputMatchResponse builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * HTTP Status codes, can be one [403], many [401,403] or indicate all by not providing this value. This field is not
   * required.
   *
   * @return the status
   */
  public List<Long> status() {
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
  public List<RatelimitInputMatchResponseHeadersItem> headers() {
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
  public Boolean originTraffic() {
    return originTraffic;
  }
}

