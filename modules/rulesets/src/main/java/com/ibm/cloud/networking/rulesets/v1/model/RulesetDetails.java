/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RulesetDetails.
 */
public class RulesetDetails extends GenericModel {

  public interface Kind {
    /** managed. */
    String MANAGED = "managed";
    /** custom. */
    String CUSTOM = "custom";
    /** root. */
    String ROOT = "root";
    /** zone. */
    String ZONE = "zone";
  }

  /**
   * The phase of the ruleset.
   */
  public interface Phase {
    /** ddos_l4. */
    String DDOS_L4 = "ddos_l4";
    /** ddos_l7. */
    String DDOS_L7 = "ddos_l7";
    /** http_config_settings. */
    String HTTP_CONFIG_SETTINGS = "http_config_settings";
    /** http_custom_errors. */
    String HTTP_CUSTOM_ERRORS = "http_custom_errors";
    /** http_log_custom_fields. */
    String HTTP_LOG_CUSTOM_FIELDS = "http_log_custom_fields";
    /** http_ratelimit. */
    String HTTP_RATELIMIT = "http_ratelimit";
    /** http_request_cache_settings. */
    String HTTP_REQUEST_CACHE_SETTINGS = "http_request_cache_settings";
    /** http_request_dynamic_redirect. */
    String HTTP_REQUEST_DYNAMIC_REDIRECT = "http_request_dynamic_redirect";
    /** http_request_firewall_custom. */
    String HTTP_REQUEST_FIREWALL_CUSTOM = "http_request_firewall_custom";
    /** http_request_firewall_managed. */
    String HTTP_REQUEST_FIREWALL_MANAGED = "http_request_firewall_managed";
    /** http_request_late_transform. */
    String HTTP_REQUEST_LATE_TRANSFORM = "http_request_late_transform";
    /** http_request_origin. */
    String HTTP_REQUEST_ORIGIN = "http_request_origin";
    /** http_request_redirect. */
    String HTTP_REQUEST_REDIRECT = "http_request_redirect";
    /** http_request_sanitize. */
    String HTTP_REQUEST_SANITIZE = "http_request_sanitize";
    /** http_request_sbfm. */
    String HTTP_REQUEST_SBFM = "http_request_sbfm";
    /** http_request_select_configuration. */
    String HTTP_REQUEST_SELECT_CONFIGURATION = "http_request_select_configuration";
    /** http_request_transform. */
    String HTTP_REQUEST_TRANSFORM = "http_request_transform";
    /** http_response_compression. */
    String HTTP_RESPONSE_COMPRESSION = "http_response_compression";
    /** http_response_firewall_managed. */
    String HTTP_RESPONSE_FIREWALL_MANAGED = "http_response_firewall_managed";
    /** http_response_headers_transform. */
    String HTTP_RESPONSE_HEADERS_TRANSFORM = "http_response_headers_transform";
  }

  protected String description;
  protected String id;
  protected String kind;
  @SerializedName("last_updated")
  protected String lastUpdated;
  protected String name;
  protected String phase;
  protected String version;
  protected List<RuleDetails> rules;

  protected RulesetDetails() { }

  /**
   * Gets the description.
   *
   * description of the ruleset.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the id.
   *
   * unique ID of the ruleset.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the kind.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the lastUpdated.
   *
   * The timestamp of when the resource was last modified.
   *
   * @return the lastUpdated
   */
  public String getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Gets the name.
   *
   * human readable name of the ruleset.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the phase.
   *
   * The phase of the ruleset.
   *
   * @return the phase
   */
  public String getPhase() {
    return phase;
  }

  /**
   * Gets the version.
   *
   * The version of the ruleset.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the rules.
   *
   * @return the rules
   */
  public List<RuleDetails> getRules() {
    return rules;
  }
}

