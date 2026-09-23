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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An API Gateway operation definition.
 */
public class ApiGatewayOperation extends GenericModel {

  /**
   * The HTTP method for the operation.
   */
  public interface Method {
    /** GET. */
    String GET = "GET";
    /** POST. */
    String POST = "POST";
    /** PUT. */
    String PUT = "PUT";
    /** PATCH. */
    String PATCH = "PATCH";
    /** DELETE. */
    String DELETE = "DELETE";
    /** HEAD. */
    String HEAD = "HEAD";
    /** OPTIONS. */
    String OPTIONS = "OPTIONS";
  }

  protected String method;
  protected String host;
  protected String endpoint;

  /**
   * Builder.
   */
  public static class Builder {
    private String method;
    private String host;
    private String endpoint;

    /**
     * Instantiates a new Builder from an existing ApiGatewayOperation instance.
     *
     * @param apiGatewayOperation the instance to initialize the Builder with
     */
    private Builder(ApiGatewayOperation apiGatewayOperation) {
      this.method = apiGatewayOperation.method;
      this.host = apiGatewayOperation.host;
      this.endpoint = apiGatewayOperation.endpoint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param method the method
     * @param host the host
     * @param endpoint the endpoint
     */
    public Builder(String method, String host, String endpoint) {
      this.method = method;
      this.host = host;
      this.endpoint = endpoint;
    }

    /**
     * Builds a ApiGatewayOperation.
     *
     * @return the new ApiGatewayOperation instance
     */
    public ApiGatewayOperation build() {
      return new ApiGatewayOperation(this);
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the ApiGatewayOperation builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the ApiGatewayOperation builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the ApiGatewayOperation builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }
  }

  protected ApiGatewayOperation() { }

  protected ApiGatewayOperation(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.host,
      "host cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    method = builder.method;
    host = builder.host;
    endpoint = builder.endpoint;
  }

  /**
   * New builder.
   *
   * @return a ApiGatewayOperation builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the method.
   *
   * The HTTP method for the operation.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the host.
   *
   * RFC3986-compliant host.
   *
   * @return the host
   */
  public String host() {
    return host;
  }

  /**
   * Gets the endpoint.
   *
   * The endpoint path. Must start with /.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }
}

