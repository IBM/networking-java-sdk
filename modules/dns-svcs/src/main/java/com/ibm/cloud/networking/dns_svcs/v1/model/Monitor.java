/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Load balancer monitor details.
 */
public class Monitor extends GenericModel {

  /**
   * The method to use for the health check applicable to HTTP/HTTPS based checks, the default value is 'GET'.
   */
  public interface Method {
    /** GET. */
    String GET = "GET";
    /** HEAD. */
    String HEAD = "HEAD";
  }

  protected String id;
  protected String name;
  protected String description;
  protected String type;
  protected Long port;
  protected Long interval;
  protected Long retries;
  protected Long timeout;
  protected String method;
  protected String path;
  protected List<HealthcheckHeader> headers;
  @SerializedName("allow_insecure")
  protected Boolean allowInsecure;
  @SerializedName("expected_codes")
  protected String expectedCodes;
  @SerializedName("expected_body")
  protected String expectedBody;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  protected Monitor() { }

  /**
   * Gets the id.
   *
   * Identifier of the load balancer monitor.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the load balancer monitor.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the load balancer monitor.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * The protocol to use for the health check. Currently supported protocols are 'HTTP','HTTPS' and 'TCP'.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the port.
   *
   * Port number to connect to for the health check. Required for TCP checks. HTTP and HTTPS checks should only define
   * the port when using a non-standard port (HTTP: default 80, HTTPS: default 443).
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the interval.
   *
   * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the
   * origins as we check from multiple locations.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the retries.
   *
   * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted
   * immediately.
   *
   * @return the retries
   */
  public Long getRetries() {
    return retries;
  }

  /**
   * Gets the timeout.
   *
   * The timeout (in seconds) before marking the health check as failed.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }

  /**
   * Gets the method.
   *
   * The method to use for the health check applicable to HTTP/HTTPS based checks, the default value is 'GET'.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the path.
   *
   * The endpoint path to health check against. This parameter is only valid for HTTP and HTTPS monitors.
   *
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Gets the headers.
   *
   * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The
   * User-Agent header cannot be overridden. This parameter is only valid for HTTP and HTTPS monitors.
   *
   * @return the headers
   */
  public List<HealthcheckHeader> getHeaders() {
    return headers;
  }

  /**
   * Gets the allowInsecure.
   *
   * Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTPS monitors.
   *
   * @return the allowInsecure
   */
  public Boolean isAllowInsecure() {
    return allowInsecure;
  }

  /**
   * Gets the expectedCodes.
   *
   * The expected HTTP response code or code range of the health check. This parameter is only valid for HTTP and HTTPS
   * monitors.
   *
   * @return the expectedCodes
   */
  public String getExpectedCodes() {
    return expectedCodes;
  }

  /**
   * Gets the expectedBody.
   *
   * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be
   * marked as unhealthy. This parameter is only valid for HTTP and HTTPS monitors.
   *
   * @return the expectedBody
   */
  public String getExpectedBody() {
    return expectedBody;
  }

  /**
   * Gets the createdOn.
   *
   * the time when a load balancer monitor is created.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * the recent time when a load balancer monitor is modified.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

