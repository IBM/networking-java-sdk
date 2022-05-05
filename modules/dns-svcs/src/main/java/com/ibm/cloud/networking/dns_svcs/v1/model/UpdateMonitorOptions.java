/*
 * (C) Copyright IBM Corp. 2022.
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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateMonitor options.
 */
public class UpdateMonitorOptions extends GenericModel {

  /**
   * The protocol to use for the health check. Currently supported protocols are 'HTTP','HTTPS' and 'TCP'.
   */
  public interface Type {
    /** HTTP. */
    String HTTP = "HTTP";
    /** HTTPS. */
    String HTTPS = "HTTPS";
    /** TCP. */
    String TCP = "TCP";
  }

  /**
   * The method to use for the health check applicable to HTTP/HTTPS based checks, the default value is 'GET'.
   */
  public interface Method {
    /** GET. */
    String GET = "GET";
    /** HEAD. */
    String HEAD = "HEAD";
  }

  protected String instanceId;
  protected String monitorId;
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
  protected Boolean allowInsecure;
  protected String expectedCodes;
  protected String expectedBody;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String monitorId;
    private String name;
    private String description;
    private String type;
    private Long port;
    private Long interval;
    private Long retries;
    private Long timeout;
    private String method;
    private String path;
    private List<HealthcheckHeader> headers;
    private Boolean allowInsecure;
    private String expectedCodes;
    private String expectedBody;
    private String xCorrelationId;

    private Builder(UpdateMonitorOptions updateMonitorOptions) {
      this.instanceId = updateMonitorOptions.instanceId;
      this.monitorId = updateMonitorOptions.monitorId;
      this.name = updateMonitorOptions.name;
      this.description = updateMonitorOptions.description;
      this.type = updateMonitorOptions.type;
      this.port = updateMonitorOptions.port;
      this.interval = updateMonitorOptions.interval;
      this.retries = updateMonitorOptions.retries;
      this.timeout = updateMonitorOptions.timeout;
      this.method = updateMonitorOptions.method;
      this.path = updateMonitorOptions.path;
      this.headers = updateMonitorOptions.headers;
      this.allowInsecure = updateMonitorOptions.allowInsecure;
      this.expectedCodes = updateMonitorOptions.expectedCodes;
      this.expectedBody = updateMonitorOptions.expectedBody;
      this.xCorrelationId = updateMonitorOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param monitorId the monitorId
     */
    public Builder(String instanceId, String monitorId) {
      this.instanceId = instanceId;
      this.monitorId = monitorId;
    }

    /**
     * Builds a UpdateMonitorOptions.
     *
     * @return the new UpdateMonitorOptions instance
     */
    public UpdateMonitorOptions build() {
      return new UpdateMonitorOptions(this);
    }

    /**
     * Adds an headers to headers.
     *
     * @param headers the new headers
     * @return the UpdateMonitorOptions builder
     */
    public Builder addHeaders(HealthcheckHeader headers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(headers,
        "headers cannot be null");
      if (this.headers == null) {
        this.headers = new ArrayList<HealthcheckHeader>();
      }
      this.headers.add(headers);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateMonitorOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the monitorId.
     *
     * @param monitorId the monitorId
     * @return the UpdateMonitorOptions builder
     */
    public Builder monitorId(String monitorId) {
      this.monitorId = monitorId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateMonitorOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateMonitorOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateMonitorOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the UpdateMonitorOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the UpdateMonitorOptions builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the retries.
     *
     * @param retries the retries
     * @return the UpdateMonitorOptions builder
     */
    public Builder retries(long retries) {
      this.retries = retries;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the UpdateMonitorOptions builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the UpdateMonitorOptions builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the UpdateMonitorOptions builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the headers.
     * Existing headers will be replaced.
     *
     * @param headers the headers
     * @return the UpdateMonitorOptions builder
     */
    public Builder headers(List<HealthcheckHeader> headers) {
      this.headers = headers;
      return this;
    }

    /**
     * Set the allowInsecure.
     *
     * @param allowInsecure the allowInsecure
     * @return the UpdateMonitorOptions builder
     */
    public Builder allowInsecure(Boolean allowInsecure) {
      this.allowInsecure = allowInsecure;
      return this;
    }

    /**
     * Set the expectedCodes.
     *
     * @param expectedCodes the expectedCodes
     * @return the UpdateMonitorOptions builder
     */
    public Builder expectedCodes(String expectedCodes) {
      this.expectedCodes = expectedCodes;
      return this;
    }

    /**
     * Set the expectedBody.
     *
     * @param expectedBody the expectedBody
     * @return the UpdateMonitorOptions builder
     */
    public Builder expectedBody(String expectedBody) {
      this.expectedBody = expectedBody;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateMonitorOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateMonitorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.monitorId,
      "monitorId cannot be empty");
    instanceId = builder.instanceId;
    monitorId = builder.monitorId;
    name = builder.name;
    description = builder.description;
    type = builder.type;
    port = builder.port;
    interval = builder.interval;
    retries = builder.retries;
    timeout = builder.timeout;
    method = builder.method;
    path = builder.path;
    headers = builder.headers;
    allowInsecure = builder.allowInsecure;
    expectedCodes = builder.expectedCodes;
    expectedBody = builder.expectedBody;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateMonitorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the monitorId.
   *
   * The unique identifier of a load balancer monitor.
   *
   * @return the monitorId
   */
  public String monitorId() {
    return monitorId;
  }

  /**
   * Gets the name.
   *
   * The name of the load balancer monitor.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the load balancer monitor.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the type.
   *
   * The protocol to use for the health check. Currently supported protocols are 'HTTP','HTTPS' and 'TCP'.
   *
   * @return the type
   */
  public String type() {
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
  public Long port() {
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
  public Long interval() {
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
  public Long retries() {
    return retries;
  }

  /**
   * Gets the timeout.
   *
   * The timeout (in seconds) before marking the health check as failed.
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }

  /**
   * Gets the method.
   *
   * The method to use for the health check applicable to HTTP/HTTPS based checks, the default value is 'GET'.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the path.
   *
   * The endpoint path to health check against. This parameter is only valid for HTTP and HTTPS monitors.
   *
   * @return the path
   */
  public String path() {
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
  public List<HealthcheckHeader> headers() {
    return headers;
  }

  /**
   * Gets the allowInsecure.
   *
   * Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTP and HTTPS
   * monitors.
   *
   * @return the allowInsecure
   */
  public Boolean allowInsecure() {
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
  public String expectedCodes() {
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
  public String expectedBody() {
    return expectedBody;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

