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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * custom page object.
 */
public class CustomPageObject extends GenericModel {

  /**
   * Custom page identifier.
   */
  public interface Id {
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

  public interface RequiredTokens {
    /** ::CAPTCHA_BOX::. */
    String CAPTCHA_BOX = "::CAPTCHA_BOX::";
    /** ::IM_UNDER_ATTACK_BOX::. */
    String IM_UNDER_ATTACK_BOX = "::IM_UNDER_ATTACK_BOX::";
    /** ::CLOUDFLARE_ERROR_500S_BOX::. */
    String CLOUDFLARE_ERROR_500S_BOX = "::CLOUDFLARE_ERROR_500S_BOX::";
    /** ::CLOUDFLARE_ERROR_1000S_BOX::. */
    String CLOUDFLARE_ERROR_1000S_BOX = "::CLOUDFLARE_ERROR_1000S_BOX::";
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

  protected String id;
  protected String description;
  @SerializedName("required_tokens")
  protected List<String> requiredTokens;
  @SerializedName("preview_target")
  protected String previewTarget;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;
  protected String url;
  protected String state;

  /**
   * Gets the id.
   *
   * Custom page identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the description.
   *
   * Description of custom page.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the requiredTokens.
   *
   * array of page tokens.
   *
   * @return the requiredTokens
   */
  public List<String> getRequiredTokens() {
    return requiredTokens;
  }

  /**
   * Gets the previewTarget.
   *
   * Preview target.
   *
   * @return the previewTarget
   */
  public String getPreviewTarget() {
    return previewTarget;
  }

  /**
   * Gets the createdOn.
   *
   * Created date.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * Modified date.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the url.
   *
   * A URL that is associated with the Custom Page.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the state.
   *
   * The Custom Page state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }
}

