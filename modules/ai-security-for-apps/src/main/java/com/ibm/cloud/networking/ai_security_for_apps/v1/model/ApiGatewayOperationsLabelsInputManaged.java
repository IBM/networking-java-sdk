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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Managed labels to apply (e.g. cf-llm).
 */
public class ApiGatewayOperationsLabelsInputManaged extends GenericModel {

  protected List<String> labels;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> labels;

    /**
     * Instantiates a new Builder from an existing ApiGatewayOperationsLabelsInputManaged instance.
     *
     * @param apiGatewayOperationsLabelsInputManaged the instance to initialize the Builder with
     */
    private Builder(ApiGatewayOperationsLabelsInputManaged apiGatewayOperationsLabelsInputManaged) {
      this.labels = apiGatewayOperationsLabelsInputManaged.labels;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ApiGatewayOperationsLabelsInputManaged.
     *
     * @return the new ApiGatewayOperationsLabelsInputManaged instance
     */
    public ApiGatewayOperationsLabelsInputManaged build() {
      return new ApiGatewayOperationsLabelsInputManaged(this);
    }

    /**
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the ApiGatewayOperationsLabelsInputManaged builder
     */
    public Builder addLabels(String labels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(labels,
        "labels cannot be null");
      if (this.labels == null) {
        this.labels = new ArrayList<String>();
      }
      this.labels.add(labels);
      return this;
    }

    /**
     * Set the labels.
     * Existing labels will be replaced.
     *
     * @param labels the labels
     * @return the ApiGatewayOperationsLabelsInputManaged builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }
  }

  protected ApiGatewayOperationsLabelsInputManaged() { }

  protected ApiGatewayOperationsLabelsInputManaged(Builder builder) {
    labels = builder.labels;
  }

  /**
   * New builder.
   *
   * @return a ApiGatewayOperationsLabelsInputManaged builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the labels.
   *
   * Array of managed label strings.
   *
   * @return the labels
   */
  public List<String> labels() {
    return labels;
  }
}

