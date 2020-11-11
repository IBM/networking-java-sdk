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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GatewayChangeRequest.
 *
 * Classes which extend this class:
 * - GatewayChangeRequestGatewayClientGatewayCreate
 * - GatewayChangeRequestGatewayClientGatewayDelete
 * - GatewayChangeRequestGatewayClientGatewayUpdateAttributes
 */
public class GatewayChangeRequest extends GenericModel {

  /**
   * type of gateway change request.
   */
  public interface Type {
    /** create_gateway. */
    String CREATE_GATEWAY = "create_gateway";
  }

  protected String type;
  protected List<GatewayChangeRequestUpdatesItem> updates;

  protected GatewayChangeRequest() {
  }

  /**
   * Gets the type.
   *
   * type of gateway change request.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the updates.
   *
   * array of pending updates.
   *
   * @return the updates
   */
  public List<GatewayChangeRequestUpdatesItem> getUpdates() {
    return updates;
  }
}

