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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listApiGatewayDiscoveryOperations options.
 */
public class ListApiGatewayDiscoveryOperationsOptions extends GenericModel {

  /**
   * Direction to order results.
   */
  public interface Direction {
    /** asc. */
    String ASC = "asc";
    /** desc. */
    String DESC = "desc";
  }

  /**
   * Field to order results by.
   */
  public interface Order {
    /** host. */
    String HOST = "host";
    /** method. */
    String METHOD = "method";
    /** endpoint. */
    String ENDPOINT = "endpoint";
    /** traffic_stats.requests. */
    String TRAFFIC_STATS_REQUESTS = "traffic_stats.requests";
    /** traffic_stats.last_updated. */
    String TRAFFIC_STATS_LAST_UPDATED = "traffic_stats.last_updated";
  }

  /**
   * Filter by discovery engine source.
   */
  public interface Origin {
    /** ML. */
    String ML = "ML";
    /** SessionIdentifier. */
    String SESSIONIDENTIFIER = "SessionIdentifier";
    /** LabelDiscovery. */
    String LABELDISCOVERY = "LabelDiscovery";
  }

  /**
   * Filter results by discovery state (review/saved/ignored).
   */
  public interface State {
    /** review. */
    String REVIEW = "review";
    /** saved. */
    String SAVED = "saved";
    /** ignored. */
    String IGNORED = "ignored";
  }

  protected Boolean diff;
  protected String direction;
  protected String endpoint;
  protected List<String> host;
  protected List<String> method;
  protected String order;
  protected String origin;
  protected String state;
  protected Long page;
  protected Long perPage;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean diff;
    private String direction;
    private String endpoint;
    private List<String> host;
    private List<String> method;
    private String order;
    private String origin;
    private String state;
    private Long page;
    private Long perPage;

    /**
     * Instantiates a new Builder from an existing ListApiGatewayDiscoveryOperationsOptions instance.
     *
     * @param listApiGatewayDiscoveryOperationsOptions the instance to initialize the Builder with
     */
    private Builder(ListApiGatewayDiscoveryOperationsOptions listApiGatewayDiscoveryOperationsOptions) {
      this.diff = listApiGatewayDiscoveryOperationsOptions.diff;
      this.direction = listApiGatewayDiscoveryOperationsOptions.direction;
      this.endpoint = listApiGatewayDiscoveryOperationsOptions.endpoint;
      this.host = listApiGatewayDiscoveryOperationsOptions.host;
      this.method = listApiGatewayDiscoveryOperationsOptions.method;
      this.order = listApiGatewayDiscoveryOperationsOptions.order;
      this.origin = listApiGatewayDiscoveryOperationsOptions.origin;
      this.state = listApiGatewayDiscoveryOperationsOptions.state;
      this.page = listApiGatewayDiscoveryOperationsOptions.page;
      this.perPage = listApiGatewayDiscoveryOperationsOptions.perPage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListApiGatewayDiscoveryOperationsOptions.
     *
     * @return the new ListApiGatewayDiscoveryOperationsOptions instance
     */
    public ListApiGatewayDiscoveryOperationsOptions build() {
      return new ListApiGatewayDiscoveryOperationsOptions(this);
    }

    /**
     * Adds a new element to host.
     *
     * @param host the new element to be added
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder addHost(String host) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(host,
        "host cannot be null");
      if (this.host == null) {
        this.host = new ArrayList<String>();
      }
      this.host.add(host);
      return this;
    }

    /**
     * Adds a new element to method.
     *
     * @param method the new element to be added
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder addMethod(String method) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(method,
        "method cannot be null");
      if (this.method == null) {
        this.method = new ArrayList<String>();
      }
      this.method.add(method);
      return this;
    }

    /**
     * Set the diff.
     *
     * @param diff the diff
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder diff(Boolean diff) {
      this.diff = diff;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the host.
     * Existing host will be replaced.
     *
     * @param host the host
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder host(List<String> host) {
      this.host = host;
      return this;
    }

    /**
     * Set the method.
     * Existing method will be replaced.
     *
     * @param method the method
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder method(List<String> method) {
      this.method = method;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListApiGatewayDiscoveryOperationsOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }
  }

  protected ListApiGatewayDiscoveryOperationsOptions() { }

  protected ListApiGatewayDiscoveryOperationsOptions(Builder builder) {
    diff = builder.diff;
    direction = builder.direction;
    endpoint = builder.endpoint;
    host = builder.host;
    method = builder.method;
    order = builder.order;
    origin = builder.origin;
    state = builder.state;
    page = builder.page;
    perPage = builder.perPage;
  }

  /**
   * New builder.
   *
   * @return a ListApiGatewayDiscoveryOperationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the diff.
   *
   * When true, only return operations not yet saved into API Shield Endpoint Management.
   *
   * @return the diff
   */
  public Boolean diff() {
    return diff;
  }

  /**
   * Gets the direction.
   *
   * Direction to order results.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the endpoint.
   *
   * Filter results to only include endpoints containing this pattern.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the host.
   *
   * Filter results to only include the specified hosts.
   *
   * @return the host
   */
  public List<String> host() {
    return host;
  }

  /**
   * Gets the method.
   *
   * Filter results to only include the specified HTTP methods.
   *
   * @return the method
   */
  public List<String> method() {
    return method;
  }

  /**
   * Gets the order.
   *
   * Field to order results by.
   *
   * @return the order
   */
  public String order() {
    return order;
  }

  /**
   * Gets the origin.
   *
   * Filter by discovery engine source.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the state.
   *
   * Filter results by discovery state (review/saved/ignored).
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the page.
   *
   * Page number of paginated results.
   *
   * @return the page
   */
  public Long page() {
    return page;
  }

  /**
   * Gets the perPage.
   *
   * Maximum number of results per page.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }
}

