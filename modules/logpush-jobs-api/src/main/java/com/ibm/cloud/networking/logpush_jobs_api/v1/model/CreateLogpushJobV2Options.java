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

package com.ibm.cloud.networking.logpush_jobs_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createLogpushJobV2 options.
 */
public class CreateLogpushJobV2Options extends GenericModel {

  protected CreateLogpushJobV2Request createLogpushJobV2Request;

  /**
   * Builder.
   */
  public static class Builder {
    private CreateLogpushJobV2Request createLogpushJobV2Request;

    /**
     * Instantiates a new Builder from an existing CreateLogpushJobV2Options instance.
     *
     * @param createLogpushJobV2Options the instance to initialize the Builder with
     */
    private Builder(CreateLogpushJobV2Options createLogpushJobV2Options) {
      this.createLogpushJobV2Request = createLogpushJobV2Options.createLogpushJobV2Request;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateLogpushJobV2Options.
     *
     * @return the new CreateLogpushJobV2Options instance
     */
    public CreateLogpushJobV2Options build() {
      return new CreateLogpushJobV2Options(this);
    }

    /**
     * Set the createLogpushJobV2Request.
     *
     * @param createLogpushJobV2Request the createLogpushJobV2Request
     * @return the CreateLogpushJobV2Options builder
     */
    public Builder createLogpushJobV2Request(CreateLogpushJobV2Request createLogpushJobV2Request) {
      this.createLogpushJobV2Request = createLogpushJobV2Request;
      return this;
    }
  }

  protected CreateLogpushJobV2Options() { }

  protected CreateLogpushJobV2Options(Builder builder) {
    createLogpushJobV2Request = builder.createLogpushJobV2Request;
  }

  /**
   * New builder.
   *
   * @return a CreateLogpushJobV2Options builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the createLogpushJobV2Request.
   *
   * Create logpush job body.
   *
   * @return the createLogpushJobV2Request
   */
  public CreateLogpushJobV2Request createLogpushJobV2Request() {
    return createLogpushJobV2Request;
  }
}

