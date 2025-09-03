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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateZoneEntrypointRuleset options.
 */
public class UpdateZoneEntrypointRulesetOptions extends GenericModel {

  /**
   * The phase of the ruleset.
   */
  public interface RulesetPhase {
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

  protected String rulesetPhase;
  protected String description;
  protected String kind;
  protected String name;
  protected String phase;
  protected List<RuleCreate> rules;

  /**
   * Builder.
   */
  public static class Builder {
    private String rulesetPhase;
    private String description;
    private String kind;
    private String name;
    private String phase;
    private List<RuleCreate> rules;

    /**
     * Instantiates a new Builder from an existing UpdateZoneEntrypointRulesetOptions instance.
     *
     * @param updateZoneEntrypointRulesetOptions the instance to initialize the Builder with
     */
    private Builder(UpdateZoneEntrypointRulesetOptions updateZoneEntrypointRulesetOptions) {
      this.rulesetPhase = updateZoneEntrypointRulesetOptions.rulesetPhase;
      this.description = updateZoneEntrypointRulesetOptions.description;
      this.kind = updateZoneEntrypointRulesetOptions.kind;
      this.name = updateZoneEntrypointRulesetOptions.name;
      this.phase = updateZoneEntrypointRulesetOptions.phase;
      this.rules = updateZoneEntrypointRulesetOptions.rules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rulesetPhase the rulesetPhase
     */
    public Builder(String rulesetPhase) {
      this.rulesetPhase = rulesetPhase;
    }

    /**
     * Builds a UpdateZoneEntrypointRulesetOptions.
     *
     * @return the new UpdateZoneEntrypointRulesetOptions instance
     */
    public UpdateZoneEntrypointRulesetOptions build() {
      return new UpdateZoneEntrypointRulesetOptions(this);
    }

    /**
     * Adds a new element to rules.
     *
     * @param rules the new element to be added
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder addRules(RuleCreate rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<RuleCreate>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the rulesetPhase.
     *
     * @param rulesetPhase the rulesetPhase
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder rulesetPhase(String rulesetPhase) {
      this.rulesetPhase = rulesetPhase;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the phase.
     *
     * @param phase the phase
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder phase(String phase) {
      this.phase = phase;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the UpdateZoneEntrypointRulesetOptions builder
     */
    public Builder rules(List<RuleCreate> rules) {
      this.rules = rules;
      return this;
    }
  }

  protected UpdateZoneEntrypointRulesetOptions() { }

  protected UpdateZoneEntrypointRulesetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetPhase,
      "rulesetPhase cannot be empty");
    rulesetPhase = builder.rulesetPhase;
    description = builder.description;
    kind = builder.kind;
    name = builder.name;
    phase = builder.phase;
    rules = builder.rules;
  }

  /**
   * New builder.
   *
   * @return a UpdateZoneEntrypointRulesetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rulesetPhase.
   *
   * The phase of the ruleset.
   *
   * @return the rulesetPhase
   */
  public String rulesetPhase() {
    return rulesetPhase;
  }

  /**
   * Gets the description.
   *
   * description of the ruleset.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the kind.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the name.
   *
   * human readable name of the ruleset.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the phase.
   *
   * The phase of the ruleset.
   *
   * @return the phase
   */
  public String phase() {
    return phase;
  }

  /**
   * Gets the rules.
   *
   * @return the rules
   */
  public List<RuleCreate> rules() {
    return rules;
  }
}

