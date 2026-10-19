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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updated operation with its label set.
 */
public class ApiGatewayOperationLabelRespResult extends GenericModel {

  @SerializedName("operation_id")
  protected String operationId;
  protected List<ApiGatewayOperationLabelRespResultLabelsItem> labels;

  protected ApiGatewayOperationLabelRespResult() { }

  /**
   * Gets the operationId.
   *
   * UUID of the operation.
   *
   * @return the operationId
   */
  public String getOperationId() {
    return operationId;
  }

  /**
   * Gets the labels.
   *
   * Labels applied to the operation.
   *
   * @return the labels
   */
  public List<ApiGatewayOperationLabelRespResultLabelsItem> getLabels() {
    return labels;
  }
}

