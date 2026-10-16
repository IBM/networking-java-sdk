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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ApiGatewayOperationsRespResultItem.
 */
public class ApiGatewayOperationsRespResultItem extends GenericModel {

  @SerializedName("operation_id")
  protected String operationId;
  protected String method;
  protected String host;
  protected String endpoint;

  protected ApiGatewayOperationsRespResultItem() { }

  /**
   * Gets the operationId.
   *
   * UUID of the created operation.
   *
   * @return the operationId
   */
  public String getOperationId() {
    return operationId;
  }

  /**
   * Gets the method.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the host.
   *
   * @return the host
   */
  public String getHost() {
    return host;
  }

  /**
   * Gets the endpoint.
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }
}

