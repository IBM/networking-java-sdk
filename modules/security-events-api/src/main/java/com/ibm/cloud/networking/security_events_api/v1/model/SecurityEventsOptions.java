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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The securityEvents options.
 */
public class SecurityEventsOptions extends GenericModel {

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
   * Kind of events. Now it is only firewall.
   */
  public interface Kind {
    /** firewall. */
    String FIREWALL = "firewall";
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

  protected String ipClass;
  protected String method;
  protected String scheme;
  protected String ip;
  protected String host;
  protected String proto;
  protected String uri;
  protected String ua;
  protected String colo;
  protected String rayId;
  protected String kind;
  protected String action;
  protected String cursor;
  protected String country;
  protected Date since;
  protected String source;
  protected Long limit;
  protected String ruleId;
  protected Date until;

  /**
   * Builder.
   */
  public static class Builder {
    private String ipClass;
    private String method;
    private String scheme;
    private String ip;
    private String host;
    private String proto;
    private String uri;
    private String ua;
    private String colo;
    private String rayId;
    private String kind;
    private String action;
    private String cursor;
    private String country;
    private Date since;
    private String source;
    private Long limit;
    private String ruleId;
    private Date until;

    private Builder(SecurityEventsOptions securityEventsOptions) {
      this.ipClass = securityEventsOptions.ipClass;
      this.method = securityEventsOptions.method;
      this.scheme = securityEventsOptions.scheme;
      this.ip = securityEventsOptions.ip;
      this.host = securityEventsOptions.host;
      this.proto = securityEventsOptions.proto;
      this.uri = securityEventsOptions.uri;
      this.ua = securityEventsOptions.ua;
      this.colo = securityEventsOptions.colo;
      this.rayId = securityEventsOptions.rayId;
      this.kind = securityEventsOptions.kind;
      this.action = securityEventsOptions.action;
      this.cursor = securityEventsOptions.cursor;
      this.country = securityEventsOptions.country;
      this.since = securityEventsOptions.since;
      this.source = securityEventsOptions.source;
      this.limit = securityEventsOptions.limit;
      this.ruleId = securityEventsOptions.ruleId;
      this.until = securityEventsOptions.until;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SecurityEventsOptions.
     *
     * @return the new SecurityEventsOptions instance
     */
    public SecurityEventsOptions build() {
      return new SecurityEventsOptions(this);
    }

    /**
     * Set the ipClass.
     *
     * @param ipClass the ipClass
     * @return the SecurityEventsOptions builder
     */
    public Builder ipClass(String ipClass) {
      this.ipClass = ipClass;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the SecurityEventsOptions builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the scheme.
     *
     * @param scheme the scheme
     * @return the SecurityEventsOptions builder
     */
    public Builder scheme(String scheme) {
      this.scheme = scheme;
      return this;
    }

    /**
     * Set the ip.
     *
     * @param ip the ip
     * @return the SecurityEventsOptions builder
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the SecurityEventsOptions builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set the proto.
     *
     * @param proto the proto
     * @return the SecurityEventsOptions builder
     */
    public Builder proto(String proto) {
      this.proto = proto;
      return this;
    }

    /**
     * Set the uri.
     *
     * @param uri the uri
     * @return the SecurityEventsOptions builder
     */
    public Builder uri(String uri) {
      this.uri = uri;
      return this;
    }

    /**
     * Set the ua.
     *
     * @param ua the ua
     * @return the SecurityEventsOptions builder
     */
    public Builder ua(String ua) {
      this.ua = ua;
      return this;
    }

    /**
     * Set the colo.
     *
     * @param colo the colo
     * @return the SecurityEventsOptions builder
     */
    public Builder colo(String colo) {
      this.colo = colo;
      return this;
    }

    /**
     * Set the rayId.
     *
     * @param rayId the rayId
     * @return the SecurityEventsOptions builder
     */
    public Builder rayId(String rayId) {
      this.rayId = rayId;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the SecurityEventsOptions builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the SecurityEventsOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the cursor.
     *
     * @param cursor the cursor
     * @return the SecurityEventsOptions builder
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * Set the country.
     *
     * @param country the country
     * @return the SecurityEventsOptions builder
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * Set the since.
     *
     * @param since the since
     * @return the SecurityEventsOptions builder
     */
    public Builder since(Date since) {
      this.since = since;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the SecurityEventsOptions builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the SecurityEventsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the ruleId.
     *
     * @param ruleId the ruleId
     * @return the SecurityEventsOptions builder
     */
    public Builder ruleId(String ruleId) {
      this.ruleId = ruleId;
      return this;
    }

    /**
     * Set the until.
     *
     * @param until the until
     * @return the SecurityEventsOptions builder
     */
    public Builder until(Date until) {
      this.until = until;
      return this;
    }
  }

  protected SecurityEventsOptions(Builder builder) {
    ipClass = builder.ipClass;
    method = builder.method;
    scheme = builder.scheme;
    ip = builder.ip;
    host = builder.host;
    proto = builder.proto;
    uri = builder.uri;
    ua = builder.ua;
    colo = builder.colo;
    rayId = builder.rayId;
    kind = builder.kind;
    action = builder.action;
    cursor = builder.cursor;
    country = builder.country;
    since = builder.since;
    source = builder.source;
    limit = builder.limit;
    ruleId = builder.ruleId;
    until = builder.until;
  }

  /**
   * New builder.
   *
   * @return a SecurityEventsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ipClass.
   *
   * IP class is a map of client IP to visitor classification.
   *
   * @return the ipClass
   */
  public String ipClass() {
    return ipClass;
  }

  /**
   * Gets the method.
   *
   * The HTTP method of the request.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the scheme.
   *
   * The scheme of the uri.
   *
   * @return the scheme
   */
  public String scheme() {
    return scheme;
  }

  /**
   * Gets the ip.
   *
   * The IPv4 or IPv6 address from which the request originated.
   *
   * @return the ip
   */
  public String ip() {
    return ip;
  }

  /**
   * Gets the host.
   *
   * The hostname the request attempted to access.
   *
   * @return the host
   */
  public String host() {
    return host;
  }

  /**
   * Gets the proto.
   *
   * The protocol of the request.
   *
   * @return the proto
   */
  public String proto() {
    return proto;
  }

  /**
   * Gets the uri.
   *
   * The URI requested from the hostname.
   *
   * @return the uri
   */
  public String uri() {
    return uri;
  }

  /**
   * Gets the ua.
   *
   * The client user agent that initiated the request.
   *
   * @return the ua
   */
  public String ua() {
    return ua;
  }

  /**
   * Gets the colo.
   *
   * The 3-letter CF PoP code.
   *
   * @return the colo
   */
  public String colo() {
    return colo;
  }

  /**
   * Gets the rayId.
   *
   * Ray ID of the request.
   *
   * @return the rayId
   */
  public String rayId() {
    return rayId;
  }

  /**
   * Gets the kind.
   *
   * Kind of events. Now it is only firewall.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the action.
   *
   * What type of action was taken.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the cursor.
   *
   * Cursor position and direction for requesting next set of records when amount of results was limited by the limit
   * parameter. A valid value for the cursor can be obtained from the cursors object in the result_info structure.
   *
   * @return the cursor
   */
  public String cursor() {
    return cursor;
  }

  /**
   * Gets the country.
   *
   * The 2-digit country code in which the request originated.
   *
   * @return the country
   */
  public String country() {
    return country;
  }

  /**
   * Gets the since.
   *
   * Start date and time of requesting data period in the ISO8601 format. Can't go back more than a year.
   *
   * @return the since
   */
  public Date since() {
    return since;
  }

  /**
   * Gets the source.
   *
   * Source of the event.
   *
   * @return the source
   */
  public String source() {
    return source;
  }

  /**
   * Gets the limit.
   *
   * The number of events to return.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the ruleId.
   *
   * The ID of the rule that triggered the event, should be considered in the context of source.
   *
   * @return the ruleId
   */
  public String ruleId() {
    return ruleId;
  }

  /**
   * Gets the until.
   *
   * End date and time of requesting data period in the ISO8601 format.
   *
   * @return the until
   */
  public Date until() {
    return until;
  }
}

