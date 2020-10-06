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
 * Determines which traffic the rate limit counts towards the threshold. Needs to be one of "request" or "response"
 * objects.
 */
public class RatelimitObjectMatch extends GenericModel {

  protected RatelimitObjectMatchRequest request;
  protected RatelimitObjectMatchResponse response;

  /**
   * Gets the request.
   *
   * request.
   *
   * @return the request
   */
  public RatelimitObjectMatchRequest getRequest() {
    return request;
  }

  /**
   * Gets the response.
   *
   * response.
   *
   * @return the response
   */
  public RatelimitObjectMatchResponse getResponse() {
    return response;
  }
}

