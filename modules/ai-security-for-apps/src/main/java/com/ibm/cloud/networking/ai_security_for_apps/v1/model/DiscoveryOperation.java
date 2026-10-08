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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A discovered API operation.
 */
public class DiscoveryOperation extends GenericModel {

  /**
   * The HTTP method used to access the endpoint.
   */
  public interface Method {
    /** GET. */
    String GET = "GET";
    /** POST. */
    String POST = "POST";
    /** HEAD. */
    String HEAD = "HEAD";
    /** OPTIONS. */
    String OPTIONS = "OPTIONS";
    /** PUT. */
    String PUT = "PUT";
    /** DELETE. */
    String DELETE = "DELETE";
    /** CONNECT. */
    String CONNECT = "CONNECT";
    /** PATCH. */
    String PATCH = "PATCH";
    /** TRACE. */
    String TRACE = "TRACE";
  }

  public interface Origin {
    /** ML. */
    String ML = "ML";
    /** SessionIdentifier. */
    String SESSIONIDENTIFIER = "SessionIdentifier";
    /** LabelDiscovery. */
    String LABELDISCOVERY = "LabelDiscovery";
  }

  /**
   * State of the operation in API Discovery. review - not yet saved to Endpoint Management; saved - saved to Endpoint
   * Management; ignored - marked as ignored.
   */
  public interface State {
    /** review. */
    String REVIEW = "review";
    /** saved. */
    String SAVED = "saved";
    /** ignored. */
    String IGNORED = "ignored";
  }

  protected String id;
  protected String endpoint;
  protected String host;
  protected String method;
  @SerializedName("last_updated")
  protected Date lastUpdated;
  protected List<String> origin;
  protected String state;
  protected DiscoveryOperationFeatures features;

  protected DiscoveryOperation() { }

  /**
   * Gets the id.
   *
   * UUID of the discovered operation.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the endpoint.
   *
   * The endpoint path. May contain path parameter templates in curly braces (e.g. /api/user/{var1}/details).
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the host.
   *
   * RFC3986-compliant host.
   *
   * @return the host
   */
  public String getHost() {
    return host;
  }

  /**
   * Gets the method.
   *
   * The HTTP method used to access the endpoint.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the lastUpdated.
   *
   * @return the lastUpdated
   */
  public Date getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Gets the origin.
   *
   * API discovery engine(s) that discovered this operation.
   *
   * @return the origin
   */
  public List<String> getOrigin() {
    return origin;
  }

  /**
   * Gets the state.
   *
   * State of the operation in API Discovery. review - not yet saved to Endpoint Management; saved - saved to Endpoint
   * Management; ignored - marked as ignored.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the features.
   *
   * @return the features
   */
  public DiscoveryOperationFeatures getFeatures() {
    return features;
  }
}

