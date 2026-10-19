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
 * The listZoneApiGatewayOperations options.
 */
public class ListZoneApiGatewayOperationsOptions extends GenericModel {

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
    /** last_updated. */
    String LAST_UPDATED = "last_updated";
  }

  protected List<String> host;
  protected List<String> method;
  protected String endpoint;
  protected List<String> labels;
  protected String direction;
  protected String order;
  protected Long page;
  protected Long perPage;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> host;
    private List<String> method;
    private String endpoint;
    private List<String> labels;
    private String direction;
    private String order;
    private Long page;
    private Long perPage;

    /**
     * Instantiates a new Builder from an existing ListZoneApiGatewayOperationsOptions instance.
     *
     * @param listZoneApiGatewayOperationsOptions the instance to initialize the Builder with
     */
    private Builder(ListZoneApiGatewayOperationsOptions listZoneApiGatewayOperationsOptions) {
      this.host = listZoneApiGatewayOperationsOptions.host;
      this.method = listZoneApiGatewayOperationsOptions.method;
      this.endpoint = listZoneApiGatewayOperationsOptions.endpoint;
      this.labels = listZoneApiGatewayOperationsOptions.labels;
      this.direction = listZoneApiGatewayOperationsOptions.direction;
      this.order = listZoneApiGatewayOperationsOptions.order;
      this.page = listZoneApiGatewayOperationsOptions.page;
      this.perPage = listZoneApiGatewayOperationsOptions.perPage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListZoneApiGatewayOperationsOptions.
     *
     * @return the new ListZoneApiGatewayOperationsOptions instance
     */
    public ListZoneApiGatewayOperationsOptions build() {
      return new ListZoneApiGatewayOperationsOptions(this);
    }

    /**
     * Adds a new element to host.
     *
     * @param host the new element to be added
     * @return the ListZoneApiGatewayOperationsOptions builder
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
     * @return the ListZoneApiGatewayOperationsOptions builder
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
     * Adds a new element to labels.
     *
     * @param labels the new element to be added
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder addLabels(String labels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(labels,
        "labels cannot be null");
      if (this.labels == null) {
        this.labels = new ArrayList<String>();
      }
      this.labels.add(labels);
      return this;
    }

    /**
     * Set the host.
     * Existing host will be replaced.
     *
     * @param host the host
     * @return the ListZoneApiGatewayOperationsOptions builder
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
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder method(List<String> method) {
      this.method = method;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the labels.
     * Existing labels will be replaced.
     *
     * @param labels the labels
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder labels(List<String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListZoneApiGatewayOperationsOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }
  }

  protected ListZoneApiGatewayOperationsOptions() { }

  protected ListZoneApiGatewayOperationsOptions(Builder builder) {
    host = builder.host;
    method = builder.method;
    endpoint = builder.endpoint;
    labels = builder.labels;
    direction = builder.direction;
    order = builder.order;
    page = builder.page;
    perPage = builder.perPage;
  }

  /**
   * New builder.
   *
   * @return a ListZoneApiGatewayOperationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the labels.
   *
   * Filter results to only include operations with these labels applied. Use cf-llm to find endpoints tagged for AI
   * Security for Apps scanning.
   *
   * @return the labels
   */
  public List<String> labels() {
    return labels;
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

