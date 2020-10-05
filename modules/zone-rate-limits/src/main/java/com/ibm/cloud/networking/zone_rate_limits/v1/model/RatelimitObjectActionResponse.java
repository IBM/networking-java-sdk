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
public class RatelimitObjectActionResponse extends GenericModel {

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
   * Gets the contentType.
   *
   * The content type of the body.
   *
   * @return the contentType
   */
  public String getContentType() {
    return contentType;
  }

  /**
   * Gets the body.
   *
   * The body to return, the content here should conform to the content_type.
   *
   * @return the body
   */
  public String getBody() {
    return body;
  }
}

