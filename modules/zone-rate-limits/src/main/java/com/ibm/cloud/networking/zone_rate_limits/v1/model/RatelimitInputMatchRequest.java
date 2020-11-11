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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * request.
 */
public class RatelimitInputMatchRequest extends GenericModel {

  public interface Methods {
    /** GET. */
    String GET = "GET";
    /** POST. */
    String POST = "POST";
    /** PUT. */
    String PUT = "PUT";
    /** DELETE. */
    String DELETE = "DELETE";
    /** PATCH. */
    String PATCH = "PATCH";
    /** HEAD. */
    String HEAD = "HEAD";
    /** _ALL_. */
    String ALL = "_ALL_";
  }

  public interface Schemes {
    /** HTTP. */
    String HTTP = "HTTP";
    /** HTTPS. */
    String HTTPS = "HTTPS";
    /** _ALL_. */
    String ALL = "_ALL_";
  }

  protected List<String> methods;
  protected List<String> schemes;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> methods;
    private List<String> schemes;
    private String url;

    private Builder(RatelimitInputMatchRequest ratelimitInputMatchRequest) {
      this.methods = ratelimitInputMatchRequest.methods;
      this.schemes = ratelimitInputMatchRequest.schemes;
      this.url = ratelimitInputMatchRequest.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param url the url
     */
    public Builder(String url) {
      this.url = url;
    }

    /**
     * Builds a RatelimitInputMatchRequest.
     *
     * @return the new RatelimitInputMatchRequest instance
     */
    public RatelimitInputMatchRequest build() {
      return new RatelimitInputMatchRequest(this);
    }

    /**
     * Adds an methods to methods.
     *
     * @param methods the new methods
     * @return the RatelimitInputMatchRequest builder
     */
    public Builder addMethods(String methods) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(methods,
        "methods cannot be null");
      if (this.methods == null) {
        this.methods = new ArrayList<String>();
      }
      this.methods.add(methods);
      return this;
    }

    /**
     * Adds an schemes to schemes.
     *
     * @param schemes the new schemes
     * @return the RatelimitInputMatchRequest builder
     */
    public Builder addSchemes(String schemes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(schemes,
        "schemes cannot be null");
      if (this.schemes == null) {
        this.schemes = new ArrayList<String>();
      }
      this.schemes.add(schemes);
      return this;
    }

    /**
     * Set the methods.
     * Existing methods will be replaced.
     *
     * @param methods the methods
     * @return the RatelimitInputMatchRequest builder
     */
    public Builder methods(List<String> methods) {
      this.methods = methods;
      return this;
    }

    /**
     * Set the schemes.
     * Existing schemes will be replaced.
     *
     * @param schemes the schemes
     * @return the RatelimitInputMatchRequest builder
     */
    public Builder schemes(List<String> schemes) {
      this.schemes = schemes;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the RatelimitInputMatchRequest builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected RatelimitInputMatchRequest(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    methods = builder.methods;
    schemes = builder.schemes;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputMatchRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the methods.
   *
   * A subset of the list HTTP methods, or ["_ALL_"] for selecting all methods.
   *
   * @return the methods
   */
  public List<String> methods() {
    return methods;
  }

  /**
   * Gets the schemes.
   *
   * HTTP schemes list, or ["_ALL_"] for selecting all schemes.
   *
   * @return the schemes
   */
  public List<String> schemes() {
    return schemes;
  }

  /**
   * Gets the url.
   *
   * The URL pattern to match comprised of the host and path, i.e. example.org/path. Wildcard are expanded to match
   * applicable traffic, query strings are not matched. Use * for all traffic to your zone.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

