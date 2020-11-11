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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * range application object.
 */
public class RangeApplicationObject extends GenericModel {

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
   * Specifies the TLS termination at the edge.
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

  protected String id;
  protected String protocol;
  protected RangeApplicationObjectDns dns;
  @SerializedName("origin_direct")
  protected List<String> originDirect;
  @SerializedName("ip_firewall")
  protected Boolean ipFirewall;
  @SerializedName("proxy_protocol")
  protected String proxyProtocol;
  @SerializedName("edge_ips")
  protected RangeApplicationObjectEdgeIps edgeIps;
  protected String tls;
  @SerializedName("traffic_type")
  protected String trafficType;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  /**
   * Gets the id.
   *
   * Application identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the protocol.
   *
   * Port configuration.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the dns.
   *
   * The name and type of DNS record for the Range application.
   *
   * @return the dns
   */
  public RangeApplicationObjectDns getDns() {
    return dns;
  }

  /**
   * Gets the originDirect.
   *
   * A list of destination addresses to the origin.
   *
   * @return the originDirect
   */
  public List<String> getOriginDirect() {
    return originDirect;
  }

  /**
   * Gets the ipFirewall.
   *
   * Enables the IP Firewall for this application.
   *
   * @return the ipFirewall
   */
  public Boolean isIpFirewall() {
    return ipFirewall;
  }

  /**
   * Gets the proxyProtocol.
   *
   * Allows for the true client IP to be passed to the service.
   *
   * @return the proxyProtocol
   */
  public String getProxyProtocol() {
    return proxyProtocol;
  }

  /**
   * Gets the edgeIps.
   *
   * Configures IP version for the hostname of this application.
   *
   * @return the edgeIps
   */
  public RangeApplicationObjectEdgeIps getEdgeIps() {
    return edgeIps;
  }

  /**
   * Gets the tls.
   *
   * Specifies the TLS termination at the edge.
   *
   * @return the tls
   */
  public String getTls() {
    return tls;
  }

  /**
   * Gets the trafficType.
   *
   * Configure how traffic is handled at the edge. If set to "direct" traffic is passed through to the service. In the
   * case of "http" or "https" HTTP/s features at the edge are applied ot this traffic.
   *
   * @return the trafficType
   */
  public String getTrafficType() {
    return trafficType;
  }

  /**
   * Gets the createdOn.
   *
   * When the Application was created.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * When the Application was last modified.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

