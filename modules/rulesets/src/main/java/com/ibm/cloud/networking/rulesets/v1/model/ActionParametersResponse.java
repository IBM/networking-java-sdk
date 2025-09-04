/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ActionParametersResponse.
 */
public class ActionParametersResponse extends GenericModel {

  protected String content;
  @SerializedName("content_type")
  protected String contentType;
  @SerializedName("status_code")
  protected Long statusCode;

  /**
   * Builder.
   */
  public static class Builder {
    private String content;
    private String contentType;
    private Long statusCode;

    /**
     * Instantiates a new Builder from an existing ActionParametersResponse instance.
     *
     * @param actionParametersResponse the instance to initialize the Builder with
     */
    private Builder(ActionParametersResponse actionParametersResponse) {
      this.content = actionParametersResponse.content;
      this.contentType = actionParametersResponse.contentType;
      this.statusCode = actionParametersResponse.statusCode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param content the content
     * @param contentType the contentType
     * @param statusCode the statusCode
     */
    public Builder(String content, String contentType, Long statusCode) {
      this.content = content;
      this.contentType = contentType;
      this.statusCode = statusCode;
    }

    /**
     * Builds a ActionParametersResponse.
     *
     * @return the new ActionParametersResponse instance
     */
    public ActionParametersResponse build() {
      return new ActionParametersResponse(this);
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the ActionParametersResponse builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the contentType.
     *
     * @param contentType the contentType
     * @return the ActionParametersResponse builder
     */
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the ActionParametersResponse builder
     */
    public Builder statusCode(long statusCode) {
      this.statusCode = statusCode;
      return this;
    }
  }

  protected ActionParametersResponse() { }

  protected ActionParametersResponse(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.content,
      "content cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.contentType,
      "contentType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.statusCode,
      "statusCode cannot be null");
    content = builder.content;
    contentType = builder.contentType;
    statusCode = builder.statusCode;
  }

  /**
   * New builder.
   *
   * @return a ActionParametersResponse builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the content.
   *
   * the content to return.
   *
   * @return the content
   */
  public String content() {
    return content;
  }

  /**
   * Gets the contentType.
   *
   * @return the contentType
   */
  public String contentType() {
    return contentType;
  }

  /**
   * Gets the statusCode.
   *
   * The status code to return.
   *
   * @return the statusCode
   */
  public Long statusCode() {
    return statusCode;
  }
}

