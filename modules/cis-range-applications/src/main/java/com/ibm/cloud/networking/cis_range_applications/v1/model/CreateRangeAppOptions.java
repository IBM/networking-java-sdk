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
package com.ibm.cloud.networking.cis_range_applications.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createRangeApp options.
 */
public class CreateRangeAppOptions extends GenericModel {

  /**
   * Allows for the true client IP to be passed to the service.
   */
  public interface ProxyProtocol {
    /** off. */
    String OFF = "off";
    /** v1. */
    String V1 = "v1";
    /** v2. */
    String V2 = "v2";
    /** simple. */
    String SIMPLE = "simple";
  }

  /**
   * Configure how traffic is handled at the edge. If set to "direct" traffic is passed through to the service. In the
   * case of "http" or "https" HTTP/s features at the edge are applied ot this traffic.
   */
  public interface TrafficType {
    /** direct. */
    String DIRECT = "direct";
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
  }

  /**
   * Configure if and how TLS connections are terminated at the edge.
   */
  public interface Tls {
    /** off. */
    String OFF = "off";
    /** flexible. */
    String FLEXIBLE = "flexible";
    /** full. */
    String FULL = "full";
    /** strict. */
    String STRICT = "strict";
  }

  protected String protocol;
  protected RangeAppReqDns dns;
  protected List<String> originDirect;
  protected RangeAppReqOriginDns originDns;
  protected Long originPort;
  protected Boolean ipFirewall;
  protected String proxyProtocol;
  protected RangeAppReqEdgeIps edgeIps;
  protected String trafficType;
  protected String tls;

  /**
   * Builder.
   */
  public static class Builder {
    private String protocol;
    private RangeAppReqDns dns;
    private List<String> originDirect;
    private RangeAppReqOriginDns originDns;
    private Long originPort;
    private Boolean ipFirewall;
    private String proxyProtocol;
    private RangeAppReqEdgeIps edgeIps;
    private String trafficType;
    private String tls;

    private Builder(CreateRangeAppOptions createRangeAppOptions) {
      this.protocol = createRangeAppOptions.protocol;
      this.dns = createRangeAppOptions.dns;
      this.originDirect = createRangeAppOptions.originDirect;
      this.originDns = createRangeAppOptions.originDns;
      this.originPort = createRangeAppOptions.originPort;
      this.ipFirewall = createRangeAppOptions.ipFirewall;
      this.proxyProtocol = createRangeAppOptions.proxyProtocol;
      this.edgeIps = createRangeAppOptions.edgeIps;
      this.trafficType = createRangeAppOptions.trafficType;
      this.tls = createRangeAppOptions.tls;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param protocol the protocol
     * @param dns the dns
     */
    public Builder(String protocol, RangeAppReqDns dns) {
      this.protocol = protocol;
      this.dns = dns;
    }

    /**
     * Builds a CreateRangeAppOptions.
     *
     * @return the new CreateRangeAppOptions instance
     */
    public CreateRangeAppOptions build() {
      return new CreateRangeAppOptions(this);
    }

    /**
     * Adds an originDirect to originDirect.
     *
     * @param originDirect the new originDirect
     * @return the CreateRangeAppOptions builder
     */
    public Builder addOriginDirect(String originDirect) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(originDirect,
        "originDirect cannot be null");
      if (this.originDirect == null) {
        this.originDirect = new ArrayList<String>();
      }
      this.originDirect.add(originDirect);
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the CreateRangeAppOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the dns.
     *
     * @param dns the dns
     * @return the CreateRangeAppOptions builder
     */
    public Builder dns(RangeAppReqDns dns) {
      this.dns = dns;
      return this;
    }

    /**
     * Set the originDirect.
     * Existing originDirect will be replaced.
     *
     * @param originDirect the originDirect
     * @return the CreateRangeAppOptions builder
     */
    public Builder originDirect(List<String> originDirect) {
      this.originDirect = originDirect;
      return this;
    }

    /**
     * Set the originDns.
     *
     * @param originDns the originDns
     * @return the CreateRangeAppOptions builder
     */
    public Builder originDns(RangeAppReqOriginDns originDns) {
      this.originDns = originDns;
      return this;
    }

    /**
     * Set the originPort.
     *
     * @param originPort the originPort
     * @return the CreateRangeAppOptions builder
     */
    public Builder originPort(long originPort) {
      this.originPort = originPort;
      return this;
    }

    /**
     * Set the ipFirewall.
     *
     * @param ipFirewall the ipFirewall
     * @return the CreateRangeAppOptions builder
     */
    public Builder ipFirewall(Boolean ipFirewall) {
      this.ipFirewall = ipFirewall;
      return this;
    }

    /**
     * Set the proxyProtocol.
     *
     * @param proxyProtocol the proxyProtocol
     * @return the CreateRangeAppOptions builder
     */
    public Builder proxyProtocol(String proxyProtocol) {
      this.proxyProtocol = proxyProtocol;
      return this;
    }

    /**
     * Set the edgeIps.
     *
     * @param edgeIps the edgeIps
     * @return the CreateRangeAppOptions builder
     */
    public Builder edgeIps(RangeAppReqEdgeIps edgeIps) {
      this.edgeIps = edgeIps;
      return this;
    }

    /**
     * Set the trafficType.
     *
     * @param trafficType the trafficType
     * @return the CreateRangeAppOptions builder
     */
    public Builder trafficType(String trafficType) {
      this.trafficType = trafficType;
      return this;
    }

    /**
     * Set the tls.
     *
     * @param tls the tls
     * @return the CreateRangeAppOptions builder
     */
    public Builder tls(String tls) {
      this.tls = tls;
      return this;
    }
  }

  protected CreateRangeAppOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dns,
      "dns cannot be null");
    protocol = builder.protocol;
    dns = builder.dns;
    originDirect = builder.originDirect;
    originDns = builder.originDns;
    originPort = builder.originPort;
    ipFirewall = builder.ipFirewall;
    proxyProtocol = builder.proxyProtocol;
    edgeIps = builder.edgeIps;
    trafficType = builder.trafficType;
    tls = builder.tls;
  }

  /**
   * New builder.
   *
   * @return a CreateRangeAppOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the protocol.
   *
   * Defines the protocol and port for this application.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the dns.
   *
   * Name and type of the DNS record for this application.
   *
   * @return the dns
   */
  public RangeAppReqDns dns() {
    return dns;
  }

  /**
   * Gets the originDirect.
   *
   * IP address and port of the origin for this Range application. If configuring a load balancer, use 'origin_dns' and
   * 'origin_port'. This can not be combined with 'origin_dns' and 'origin_port'.
   *
   * @return the originDirect
   */
  public List<String> originDirect() {
    return originDirect;
  }

  /**
   * Gets the originDns.
   *
   * DNS record pointing to the origin for this Range application. This is used for configuring a load balancer. When
   * specifying an individual IP address, use 'origin_direct'. This requires 'origin_port' and can not be combined with
   * 'origin_direct'.
   *
   * @return the originDns
   */
  public RangeAppReqOriginDns originDns() {
    return originDns;
  }

  /**
   * Gets the originPort.
   *
   * Port at the origin that listens to traffic from this Range application. Requires 'origin_dns' and can not be
   * combined with 'origin_direct'.
   *
   * @return the originPort
   */
  public Long originPort() {
    return originPort;
  }

  /**
   * Gets the ipFirewall.
   *
   * Enables the IP Firewall for this application. Only available for TCP applications.
   *
   * @return the ipFirewall
   */
  public Boolean ipFirewall() {
    return ipFirewall;
  }

  /**
   * Gets the proxyProtocol.
   *
   * Allows for the true client IP to be passed to the service.
   *
   * @return the proxyProtocol
   */
  public String proxyProtocol() {
    return proxyProtocol;
  }

  /**
   * Gets the edgeIps.
   *
   * Configures IP version for the hostname of this application. Default is {"type":"dynamic", "connectivity":"all"}.
   *
   * @return the edgeIps
   */
  public RangeAppReqEdgeIps edgeIps() {
    return edgeIps;
  }

  /**
   * Gets the trafficType.
   *
   * Configure how traffic is handled at the edge. If set to "direct" traffic is passed through to the service. In the
   * case of "http" or "https" HTTP/s features at the edge are applied ot this traffic.
   *
   * @return the trafficType
   */
  public String trafficType() {
    return trafficType;
  }

  /**
   * Gets the tls.
   *
   * Configure if and how TLS connections are terminated at the edge.
   *
   * @return the tls
   */
  public String tls() {
    return tls;
  }
}

