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
package com.ibm.cloud.networking.global_load_balancer_monitor.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * monitor package.
 */
public class MonitorPack extends GenericModel {

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  protected String type;
  protected String description;
  protected String method;
  protected Long port;
  protected String path;
  protected Long timeout;
  protected Long retries;
  protected Long interval;
  @SerializedName("expected_body")
  protected String expectedBody;
  @SerializedName("expected_codes")
  protected String expectedCodes;
  @SerializedName("follow_redirects")
  protected Boolean followRedirects;
  @SerializedName("allow_insecure")
  protected Boolean allowInsecure;

  /**
   * Gets the id.
   *
   * identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * created date.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * modified date.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the type.
   *
   * type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the description.
   *
   * login page.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the method.
   *
   * method name.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the port.
   *
   * port number.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the path.
   *
   * path.
   *
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Gets the timeout.
   *
   * timeout count.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }

  /**
   * Gets the retries.
   *
   * retries count.
   *
   * @return the retries
   */
  public Long getRetries() {
    return retries;
  }

  /**
   * Gets the interval.
   *
   * interval.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the expectedBody.
   *
   * expected body.
   *
   * @return the expectedBody
   */
  public String getExpectedBody() {
    return expectedBody;
  }

  /**
   * Gets the expectedCodes.
   *
   * expected codes.
   *
   * @return the expectedCodes
   */
  public String getExpectedCodes() {
    return expectedCodes;
  }

  /**
   * Gets the followRedirects.
   *
   * follow redirects.
   *
   * @return the followRedirects
   */
  public Boolean isFollowRedirects() {
    return followRedirects;
  }

  /**
   * Gets the allowInsecure.
   *
   * allow insecure.
   *
   * @return the allowInsecure
   */
  public Boolean isAllowInsecure() {
    return allowInsecure;
  }
}

