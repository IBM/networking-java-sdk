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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Custom content-type and body to return, this overrides the custom error for the zone. This field is not required.
 * Omission will result in default HTML error page.This field is valid only when mode is "simulate" or "ban".
 */
public class RatelimitInputActionResponse extends GenericModel {

  /**
   * The content type of the body.
   */
  public interface ContentType {
    /** text/plain. */
    String TEXT_PLAIN = "text/plain";
    /** text/xml. */
    String TEXT_XML = "text/xml";
    /** application/json. */
    String APPLICATION_JSON = "application/json";
  }

  @SerializedName("content_type")
  protected String contentType;
  protected String body;

  /**
   * Builder.
   */
  public static class Builder {
    private String contentType;
    private String body;

    private Builder(RatelimitInputActionResponse ratelimitInputActionResponse) {
      this.contentType = ratelimitInputActionResponse.contentType;
      this.body = ratelimitInputActionResponse.body;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RatelimitInputActionResponse.
     *
     * @return the new RatelimitInputActionResponse instance
     */
    public RatelimitInputActionResponse build() {
      return new RatelimitInputActionResponse(this);
    }

    /**
     * Set the contentType.
     *
     * @param contentType the contentType
     * @return the RatelimitInputActionResponse builder
     */
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the RatelimitInputActionResponse builder
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }
  }

  protected RatelimitInputActionResponse(Builder builder) {
    contentType = builder.contentType;
    body = builder.body;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputActionResponse builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the contentType.
   *
   * The content type of the body.
   *
   * @return the contentType
   */
  public String contentType() {
    return contentType;
  }

  /**
   * Gets the body.
   *
   * The body to return, the content here should conform to the content_type.
   *
   * @return the body
   */
  public String body() {
    return body;
  }
}

