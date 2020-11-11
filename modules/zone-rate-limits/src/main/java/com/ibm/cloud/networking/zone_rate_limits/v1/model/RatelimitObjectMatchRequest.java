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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * request.
 */
public class RatelimitObjectMatchRequest extends GenericModel {

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
   * Gets the methods.
   *
   * A subset of the list HTTP methods, or ["_ALL_"] for selecting all methods.
   *
   * @return the methods
   */
  public List<String> getMethods() {
    return methods;
  }

  /**
   * Gets the schemes.
   *
   * HTTP schemes list, or ["_ALL_"] for selecting all schemes.
   *
   * @return the schemes
   */
  public List<String> getSchemes() {
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
  public String getUrl() {
    return url;
  }
}

