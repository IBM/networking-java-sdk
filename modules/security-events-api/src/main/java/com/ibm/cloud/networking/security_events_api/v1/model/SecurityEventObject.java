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
package com.ibm.cloud.networking.security_events_api.v1.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Security event object.
 */
public class SecurityEventObject extends GenericModel {

  /**
   * Kind of events. Now it is only firewall.
   */
  public interface Kind {
    /** firewall. */
    String FIREWALL = "firewall";
  }

  /**
   * Source of the event.
   */
  public interface Source {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** asn. */
    String ASN = "asn";
    /** country. */
    String COUNTRY = "country";
    /** ip. */
    String IP = "ip";
    /** ipRange. */
    String IPRANGE = "ipRange";
    /** securityLevel. */
    String SECURITYLEVEL = "securityLevel";
    /** zoneLockdown. */
    String ZONELOCKDOWN = "zoneLockdown";
    /** waf. */
    String WAF = "waf";
    /** uaBlock. */
    String UABLOCK = "uaBlock";
    /** rateLimit. */
    String RATELIMIT = "rateLimit";
    /** firewallRules. */
    String FIREWALLRULES = "firewallRules";
    /** bic. */
    String BIC = "bic";
    /** hot. */
    String HOT = "hot";
    /** l7ddos. */
    String L7DDOS = "l7ddos";
  }

  /**
   * What type of action was taken.
   */
  public interface Action {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** allow. */
    String ALLOW = "allow";
    /** drop. */
    String DROP = "drop";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** jschallenge. */
    String JSCHALLENGE = "jschallenge";
    /** simulate. */
    String SIMULATE = "simulate";
    /** connectionClose. */
    String CONNECTIONCLOSE = "connectionClose";
    /** log. */
    String LOG = "log";
  }

  /**
   * IP class is a map of client IP to visitor classification.
   */
  public interface IpClass {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** clean. */
    String CLEAN = "clean";
    /** badHost. */
    String BADHOST = "badHost";
    /** searchEngine. */
    String SEARCHENGINE = "searchEngine";
    /** whitelist. */
    String WHITELIST = "whitelist";
    /** greylist. */
    String GREYLIST = "greylist";
    /** monitoringService. */
    String MONITORINGSERVICE = "monitoringService";
    /** securityScanner. */
    String SECURITYSCANNER = "securityScanner";
    /** noRecord. */
    String NORECORD = "noRecord";
    /** scan. */
    String SCAN = "scan";
    /** backupService. */
    String BACKUPSERVICE = "backupService";
    /** mobilePlatform. */
    String MOBILEPLATFORM = "mobilePlatform";
    /** tor. */
    String TOR = "tor";
  }

  /**
   * The HTTP method of the request.
   */
  public interface Method {
    /** GET. */
    String GET = "GET";
    /** POST. */
    String POST = "POST";
    /** DELETE. */
    String DELETE = "DELETE";
    /** PUT. */
    String PUT = "PUT";
    /** HEAD. */
    String HEAD = "HEAD";
    /** PURGE. */
    String PURGE = "PURGE";
    /** OPTIONS. */
    String OPTIONS = "OPTIONS";
    /** PROPFIND. */
    String PROPFIND = "PROPFIND";
    /** MKCOL. */
    String MKCOL = "MKCOL";
    /** PATCH. */
    String PATCH = "PATCH";
    /** ACL. */
    String ACL = "ACL";
    /** BCOPY. */
    String BCOPY = "BCOPY";
    /** BDELETE. */
    String BDELETE = "BDELETE";
    /** BMOVE. */
    String BMOVE = "BMOVE";
    /** BPROPFIND. */
    String BPROPFIND = "BPROPFIND";
    /** BPROPPATCH. */
    String BPROPPATCH = "BPROPPATCH";
    /** CHECKIN. */
    String CHECKIN = "CHECKIN";
    /** CHECKOUT. */
    String CHECKOUT = "CHECKOUT";
    /** CONNECT. */
    String CONNECT = "CONNECT";
    /** COPY. */
    String COPY = "COPY";
    /** LABEL. */
    String LABEL = "LABEL";
    /** LOCK. */
    String LOCK = "LOCK";
    /** MERGE. */
    String MERGE = "MERGE";
    /** MKACTIVITY. */
    String MKACTIVITY = "MKACTIVITY";
    /** MKWORKSPACE. */
    String MKWORKSPACE = "MKWORKSPACE";
    /** MOVE. */
    String MOVE = "MOVE";
    /** NOTIFY. */
    String NOTIFY = "NOTIFY";
    /** ORDERPATCH. */
    String ORDERPATCH = "ORDERPATCH";
    /** POLL. */
    String POLL = "POLL";
    /** PROPPATCH. */
    String PROPPATCH = "PROPPATCH";
    /** REPORT. */
    String REPORT = "REPORT";
    /** SEARCH. */
    String SEARCH = "SEARCH";
    /** SUBSCRIBE. */
    String SUBSCRIBE = "SUBSCRIBE";
    /** TRACE. */
    String TRACE = "TRACE";
    /** UNCHECKOUT. */
    String UNCHECKOUT = "UNCHECKOUT";
    /** UNLOCK. */
    String UNLOCK = "UNLOCK";
    /** UNSUBSCRIBE. */
    String UNSUBSCRIBE = "UNSUBSCRIBE";
    /** UPDATE. */
    String UPDATE = "UPDATE";
    /** VERSION-CONTROL. */
    String VERSION_CONTROL = "VERSION-CONTROL";
    /** BASELINE-CONTROL. */
    String BASELINE_CONTROL = "BASELINE-CONTROL";
    /** X-MS-ENUMATTS. */
    String X_MS_ENUMATTS = "X-MS-ENUMATTS";
    /** RPC_OUT_DATA. */
    String RPC_OUT_DATA = "RPC_OUT_DATA";
    /** RPC_IN_DATA. */
    String RPC_IN_DATA = "RPC_IN_DATA";
    /** JSON. */
    String JSON = "JSON";
    /** COOK. */
    String COOK = "COOK";
    /** TRACK. */
    String TRACK = "TRACK";
  }

  /**
   * The protocol of the request.
   */
  public interface Proto {
    /** UNK. */
    String UNK = "UNK";
    /** HTTP/1.0. */
    String HTTP_1_0 = "HTTP/1.0";
    /** HTTP/1.1. */
    String HTTP_1_1 = "HTTP/1.1";
    /** HTTP/1.2. */
    String HTTP_1_2 = "HTTP/1.2";
    /** HTTP/2. */
    String HTTP_2 = "HTTP/2";
    /** SPDY/3.1. */
    String SPDY_3_1 = "SPDY/3.1";
  }

  /**
   * The scheme of the uri.
   */
  public interface Scheme {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
  }

  @SerializedName("ray_id")
  protected String rayId;
  protected String kind;
  protected String source;
  protected String action;
  @SerializedName("rule_id")
  protected String ruleId;
  protected String ip;
  @SerializedName("ip_class")
  protected String ipClass;
  protected String country;
  protected String colo;
  protected String host;
  protected String method;
  protected String proto;
  protected String scheme;
  protected String ua;
  protected String uri;
  @SerializedName("occurred_at")
  protected Date occurredAt;
  protected List<SecurityEventObjectMatchesItem> matches;

  /**
   * Gets the rayId.
   *
   * Ray ID of the request.
   *
   * @return the rayId
   */
  public String getRayId() {
    return rayId;
  }

  /**
   * Gets the kind.
   *
   * Kind of events. Now it is only firewall.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the source.
   *
   * Source of the event.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the action.
   *
   * What type of action was taken.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the ruleId.
   *
   * The ID of the rule that triggered the event, should be considered in the context of source.
   *
   * @return the ruleId
   */
  public String getRuleId() {
    return ruleId;
  }

  /**
   * Gets the ip.
   *
   * The IPv4 or IPv6 address from which the request originated.
   *
   * @return the ip
   */
  public String getIp() {
    return ip;
  }

  /**
   * Gets the ipClass.
   *
   * IP class is a map of client IP to visitor classification.
   *
   * @return the ipClass
   */
  public String getIpClass() {
    return ipClass;
  }

  /**
   * Gets the country.
   *
   * The 2-digit country code in which the request originated.
   *
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Gets the colo.
   *
   * The 3-letter CF PoP code.
   *
   * @return the colo
   */
  public String getColo() {
    return colo;
  }

  /**
   * Gets the host.
   *
   * The hostname the request attempted to access.
   *
   * @return the host
   */
  public String getHost() {
    return host;
  }

  /**
   * Gets the method.
   *
   * The HTTP method of the request.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the proto.
   *
   * The protocol of the request.
   *
   * @return the proto
   */
  public String getProto() {
    return proto;
  }

  /**
   * Gets the scheme.
   *
   * The scheme of the uri.
   *
   * @return the scheme
   */
  public String getScheme() {
    return scheme;
  }

  /**
   * Gets the ua.
   *
   * The client user agent that initiated the request.
   *
   * @return the ua
   */
  public String getUa() {
    return ua;
  }

  /**
   * Gets the uri.
   *
   * The URI requested from the hostname.
   *
   * @return the uri
   */
  public String getUri() {
    return uri;
  }

  /**
   * Gets the occurredAt.
   *
   * The time that the event occurred.
   *
   * @return the occurredAt
   */
  public Date getOccurredAt() {
    return occurredAt;
  }

  /**
   * Gets the matches.
   *
   * The firewall rules those the event matches.
   *
   * @return the matches
   */
  public List<SecurityEventObjectMatchesItem> getMatches() {
    return matches;
  }
}

