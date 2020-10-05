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
package com.ibm.cloud.networking.ssl_certificate_api.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The orderCertificate options.
 */
public class OrderCertificateOptions extends GenericModel {

  /**
   * priorities.
   */
  public interface Type {
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

  protected String type;
  protected List<String> hosts;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> hosts;
    private String xCorrelationId;

    private Builder(OrderCertificateOptions orderCertificateOptions) {
      this.type = orderCertificateOptions.type;
      this.hosts = orderCertificateOptions.hosts;
      this.xCorrelationId = orderCertificateOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a OrderCertificateOptions.
     *
     * @return the new OrderCertificateOptions instance
     */
    public OrderCertificateOptions build() {
      return new OrderCertificateOptions(this);
    }

    /**
     * Adds an hosts to hosts.
     *
     * @param hosts the new hosts
     * @return the OrderCertificateOptions builder
     */
    public Builder addHosts(String hosts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hosts,
        "hosts cannot be null");
      if (this.hosts == null) {
        this.hosts = new ArrayList<String>();
      }
      this.hosts.add(hosts);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the OrderCertificateOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the hosts.
     * Existing hosts will be replaced.
     *
     * @param hosts the hosts
     * @return the OrderCertificateOptions builder
     */
    public Builder hosts(List<String> hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the OrderCertificateOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected OrderCertificateOptions(Builder builder) {
    type = builder.type;
    hosts = builder.hosts;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a OrderCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * priorities.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the hosts.
   *
   * host name.
   *
   * @return the hosts
   */
  public List<String> hosts() {
    return hosts;
  }

  /**
   * Gets the xCorrelationId.
   *
   * uuid, identify a session.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

