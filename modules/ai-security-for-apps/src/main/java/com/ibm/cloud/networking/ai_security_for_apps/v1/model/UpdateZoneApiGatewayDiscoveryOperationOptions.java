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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateZoneApiGatewayDiscoveryOperation options.
 */
public class UpdateZoneApiGatewayDiscoveryOperationOptions extends GenericModel {

  protected Map<String, Object> requestBody;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> requestBody;

    /**
     * Instantiates a new Builder from an existing UpdateZoneApiGatewayDiscoveryOperationOptions instance.
     *
     * @param updateZoneApiGatewayDiscoveryOperationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateZoneApiGatewayDiscoveryOperationOptions updateZoneApiGatewayDiscoveryOperationOptions) {
      this.requestBody = updateZoneApiGatewayDiscoveryOperationOptions.requestBody;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateZoneApiGatewayDiscoveryOperationOptions.
     *
     * @return the new UpdateZoneApiGatewayDiscoveryOperationOptions instance
     */
    public UpdateZoneApiGatewayDiscoveryOperationOptions build() {
      return new UpdateZoneApiGatewayDiscoveryOperationOptions(this);
    }

    /**
     * Set the requestBody.
     *
     * @param requestBody the requestBody
     * @return the UpdateZoneApiGatewayDiscoveryOperationOptions builder
     */
    public Builder requestBody(Map<String, Object> requestBody) {
      this.requestBody = requestBody;
      return this;
    }
  }

  protected UpdateZoneApiGatewayDiscoveryOperationOptions() { }

  protected UpdateZoneApiGatewayDiscoveryOperationOptions(Builder builder) {
    requestBody = builder.requestBody;
  }

  /**
   * New builder.
   *
   * @return a UpdateZoneApiGatewayDiscoveryOperationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the requestBody.
   *
   * List of operation state updates.
   *
   * @return the requestBody
   */
  public Map<String, Object> requestBody() {
    return requestBody;
  }
}

