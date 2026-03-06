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

package com.ibm.cloud.networking.zones_settings.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Bot Management settings.
 */
public class BotMgtSettings extends GenericModel {

  /**
   * Block scrapers and crawlers known to be feeding AI training data.
   */
  public interface AiBotsProtection {
    /** block. */
    String BLOCK = "block";
    /** disabled. */
    String DISABLED = "disabled";
  }

  @SerializedName("session_score")
  protected Boolean sessionScore;
  @SerializedName("enable_js")
  protected Boolean enableJs;
  @SerializedName("use_latest_model")
  protected Boolean useLatestModel;
  @SerializedName("ai_bots_protection")
  protected String aiBotsProtection;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean sessionScore;
    private Boolean enableJs;
    private Boolean useLatestModel;
    private String aiBotsProtection;

    /**
     * Instantiates a new Builder from an existing BotMgtSettings instance.
     *
     * @param botMgtSettings the instance to initialize the Builder with
     */
    private Builder(BotMgtSettings botMgtSettings) {
      this.sessionScore = botMgtSettings.sessionScore;
      this.enableJs = botMgtSettings.enableJs;
      this.useLatestModel = botMgtSettings.useLatestModel;
      this.aiBotsProtection = botMgtSettings.aiBotsProtection;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BotMgtSettings.
     *
     * @return the new BotMgtSettings instance
     */
    public BotMgtSettings build() {
      return new BotMgtSettings(this);
    }

    /**
     * Set the sessionScore.
     *
     * @param sessionScore the sessionScore
     * @return the BotMgtSettings builder
     */
    public Builder sessionScore(Boolean sessionScore) {
      this.sessionScore = sessionScore;
      return this;
    }

    /**
     * Set the enableJs.
     *
     * @param enableJs the enableJs
     * @return the BotMgtSettings builder
     */
    public Builder enableJs(Boolean enableJs) {
      this.enableJs = enableJs;
      return this;
    }

    /**
     * Set the useLatestModel.
     *
     * @param useLatestModel the useLatestModel
     * @return the BotMgtSettings builder
     */
    public Builder useLatestModel(Boolean useLatestModel) {
      this.useLatestModel = useLatestModel;
      return this;
    }

    /**
     * Set the aiBotsProtection.
     *
     * @param aiBotsProtection the aiBotsProtection
     * @return the BotMgtSettings builder
     */
    public Builder aiBotsProtection(String aiBotsProtection) {
      this.aiBotsProtection = aiBotsProtection;
      return this;
    }
  }

  protected BotMgtSettings() { }

  protected BotMgtSettings(Builder builder) {
    sessionScore = builder.sessionScore;
    enableJs = builder.enableJs;
    useLatestModel = builder.useLatestModel;
    aiBotsProtection = builder.aiBotsProtection;
  }

  /**
   * New builder.
   *
   * @return a BotMgtSettings builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sessionScore.
   *
   * Set to disable tracking the max bot score during a session using the Bot Management cookie.
   *
   * @return the sessionScore
   */
  public Boolean sessionScore() {
    return sessionScore;
  }

  /**
   * Gets the enableJs.
   *
   * Use JavaScript detections to improve bot detection.
   *
   * @return the enableJs
   */
  public Boolean enableJs() {
    return enableJs;
  }

  /**
   * Gets the useLatestModel.
   *
   * Automatically update to the newest bot detection models as they are released.
   *
   * @return the useLatestModel
   */
  public Boolean useLatestModel() {
    return useLatestModel;
  }

  /**
   * Gets the aiBotsProtection.
   *
   * Block scrapers and crawlers known to be feeding AI training data.
   *
   * @return the aiBotsProtection
   */
  public String aiBotsProtection() {
    return aiBotsProtection;
  }
}

