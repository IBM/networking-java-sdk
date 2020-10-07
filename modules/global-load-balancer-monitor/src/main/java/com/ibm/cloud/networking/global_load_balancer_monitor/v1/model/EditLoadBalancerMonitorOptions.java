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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The editLoadBalancerMonitor options.
 */
public class EditLoadBalancerMonitorOptions extends GenericModel {

  protected String monitorIdentifier;
  protected String type;
  protected String description;
  protected String method;
  protected Long port;
  protected String path;
  protected Long timeout;
  protected Long retries;
  protected Long interval;
  protected String expectedCodes;
  protected Boolean followRedirects;
  protected String expectedBody;
  protected Boolean allowInsecure;

  /**
   * Builder.
   */
  public static class Builder {
    private String monitorIdentifier;
    private String type;
    private String description;
    private String method;
    private Long port;
    private String path;
    private Long timeout;
    private Long retries;
    private Long interval;
    private String expectedCodes;
    private Boolean followRedirects;
    private String expectedBody;
    private Boolean allowInsecure;

    private Builder(EditLoadBalancerMonitorOptions editLoadBalancerMonitorOptions) {
      this.monitorIdentifier = editLoadBalancerMonitorOptions.monitorIdentifier;
      this.type = editLoadBalancerMonitorOptions.type;
      this.description = editLoadBalancerMonitorOptions.description;
      this.method = editLoadBalancerMonitorOptions.method;
      this.port = editLoadBalancerMonitorOptions.port;
      this.path = editLoadBalancerMonitorOptions.path;
      this.timeout = editLoadBalancerMonitorOptions.timeout;
      this.retries = editLoadBalancerMonitorOptions.retries;
      this.interval = editLoadBalancerMonitorOptions.interval;
      this.expectedCodes = editLoadBalancerMonitorOptions.expectedCodes;
      this.followRedirects = editLoadBalancerMonitorOptions.followRedirects;
      this.expectedBody = editLoadBalancerMonitorOptions.expectedBody;
      this.allowInsecure = editLoadBalancerMonitorOptions.allowInsecure;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param monitorIdentifier the monitorIdentifier
     */
    public Builder(String monitorIdentifier) {
      this.monitorIdentifier = monitorIdentifier;
    }

    /**
     * Builds a EditLoadBalancerMonitorOptions.
     *
     * @return the new EditLoadBalancerMonitorOptions instance
     */
    public EditLoadBalancerMonitorOptions build() {
      return new EditLoadBalancerMonitorOptions(this);
    }

    /**
     * Set the monitorIdentifier.
     *
     * @param monitorIdentifier the monitorIdentifier
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder monitorIdentifier(String monitorIdentifier) {
      this.monitorIdentifier = monitorIdentifier;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the retries.
     *
     * @param retries the retries
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder retries(long retries) {
      this.retries = retries;
      return this;
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the expectedCodes.
     *
     * @param expectedCodes the expectedCodes
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder expectedCodes(String expectedCodes) {
      this.expectedCodes = expectedCodes;
      return this;
    }

    /**
     * Set the followRedirects.
     *
     * @param followRedirects the followRedirects
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder followRedirects(Boolean followRedirects) {
      this.followRedirects = followRedirects;
      return this;
    }

    /**
     * Set the expectedBody.
     *
     * @param expectedBody the expectedBody
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder expectedBody(String expectedBody) {
      this.expectedBody = expectedBody;
      return this;
    }

    /**
     * Set the allowInsecure.
     *
     * @param allowInsecure the allowInsecure
     * @return the EditLoadBalancerMonitorOptions builder
     */
    public Builder allowInsecure(Boolean allowInsecure) {
      this.allowInsecure = allowInsecure;
      return this;
    }
  }

  protected EditLoadBalancerMonitorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.monitorIdentifier,
      "monitorIdentifier cannot be empty");
    monitorIdentifier = builder.monitorIdentifier;
    type = builder.type;
    description = builder.description;
    method = builder.method;
    port = builder.port;
    path = builder.path;
    timeout = builder.timeout;
    retries = builder.retries;
    interval = builder.interval;
    expectedCodes = builder.expectedCodes;
    followRedirects = builder.followRedirects;
    expectedBody = builder.expectedBody;
    allowInsecure = builder.allowInsecure;
  }

  /**
   * New builder.
   *
   * @return a EditLoadBalancerMonitorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the monitorIdentifier.
   *
   * monitor identifier.
   *
   * @return the monitorIdentifier
   */
  public String monitorIdentifier() {
    return monitorIdentifier;
  }

  /**
   * Gets the type.
   *
   * http type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * login page monitor.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the method.
   *
   * method.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the port.
   *
   * port number.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the path.
   *
   * path.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the timeout.
   *
   * timeout count.
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }

  /**
   * Gets the retries.
   *
   * retry count.
   *
   * @return the retries
   */
  public Long retries() {
    return retries;
  }

  /**
   * Gets the interval.
   *
   * interval.
   *
   * @return the interval
   */
  public Long interval() {
    return interval;
  }

  /**
   * Gets the expectedCodes.
   *
   * expected codes.
   *
   * @return the expectedCodes
   */
  public String expectedCodes() {
    return expectedCodes;
  }

  /**
   * Gets the followRedirects.
   *
   * follow redirects.
   *
   * @return the followRedirects
   */
  public Boolean followRedirects() {
    return followRedirects;
  }

  /**
   * Gets the expectedBody.
   *
   * expected body.
   *
   * @return the expectedBody
   */
  public String expectedBody() {
    return expectedBody;
  }

  /**
   * Gets the allowInsecure.
   *
   * allow insecure.
   *
   * @return the allowInsecure
   */
  public Boolean allowInsecure() {
    return allowInsecure;
  }
}

