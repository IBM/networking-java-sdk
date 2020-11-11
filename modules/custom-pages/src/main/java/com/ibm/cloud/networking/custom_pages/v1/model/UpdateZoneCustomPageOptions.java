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
package com.ibm.cloud.networking.custom_pages.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateZoneCustomPage options.
 */
public class UpdateZoneCustomPageOptions extends GenericModel {

  /**
   * Custom page identifier.
   */
  public interface PageIdentifier {
    /** basic_challenge. */
    String BASIC_CHALLENGE = "basic_challenge";
    /** waf_challenge. */
    String WAF_CHALLENGE = "waf_challenge";
    /** waf_block. */
    String WAF_BLOCK = "waf_block";
    /** ratelimit_block. */
    String RATELIMIT_BLOCK = "ratelimit_block";
    /** country_challenge. */
    String COUNTRY_CHALLENGE = "country_challenge";
    /** ip_block. */
    String IP_BLOCK = "ip_block";
    /** under_attack. */
    String UNDER_ATTACK = "under_attack";
  }

  /**
   * The Custom Page state.
   */
  public interface State {
    /** default. */
    String X_DEFAULT = "default";
    /** customized. */
    String CUSTOMIZED = "customized";
  }

  protected String pageIdentifier;
  protected String url;
  protected String state;

  /**
   * Builder.
   */
  public static class Builder {
    private String pageIdentifier;
    private String url;
    private String state;

    private Builder(UpdateZoneCustomPageOptions updateZoneCustomPageOptions) {
      this.pageIdentifier = updateZoneCustomPageOptions.pageIdentifier;
      this.url = updateZoneCustomPageOptions.url;
      this.state = updateZoneCustomPageOptions.state;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pageIdentifier the pageIdentifier
     */
    public Builder(String pageIdentifier) {
      this.pageIdentifier = pageIdentifier;
    }

    /**
     * Builds a UpdateZoneCustomPageOptions.
     *
     * @return the new UpdateZoneCustomPageOptions instance
     */
    public UpdateZoneCustomPageOptions build() {
      return new UpdateZoneCustomPageOptions(this);
    }

    /**
     * Set the pageIdentifier.
     *
     * @param pageIdentifier the pageIdentifier
     * @return the UpdateZoneCustomPageOptions builder
     */
    public Builder pageIdentifier(String pageIdentifier) {
      this.pageIdentifier = pageIdentifier;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the UpdateZoneCustomPageOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the UpdateZoneCustomPageOptions builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }
  }

  protected UpdateZoneCustomPageOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pageIdentifier,
      "pageIdentifier cannot be empty");
    pageIdentifier = builder.pageIdentifier;
    url = builder.url;
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a UpdateZoneCustomPageOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pageIdentifier.
   *
   * Custom page identifier.
   *
   * @return the pageIdentifier
   */
  public String pageIdentifier() {
    return pageIdentifier;
  }

  /**
   * Gets the url.
   *
   * A URL that is associated with the Custom Page.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the state.
   *
   * The Custom Page state.
   *
   * @return the state
   */
  public String state() {
    return state;
  }
}

