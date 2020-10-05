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
package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Value.
 */
public class MinifySettingValue extends GenericModel {

  /**
   * Automatically minify all CSS for your website.
   */
  public interface Css {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  /**
   * Automatically minify all HTML for your website.
   */
  public interface Html {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  /**
   * Automatically minify all JavaScript for your website.
   */
  public interface Js {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String css;
  protected String html;
  protected String js;

  /**
   * Builder.
   */
  public static class Builder {
    private String css;
    private String html;
    private String js;

    private Builder(MinifySettingValue minifySettingValue) {
      this.css = minifySettingValue.css;
      this.html = minifySettingValue.html;
      this.js = minifySettingValue.js;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param css the css
     * @param html the html
     * @param js the js
     */
    public Builder(String css, String html, String js) {
      this.css = css;
      this.html = html;
      this.js = js;
    }

    /**
     * Builds a MinifySettingValue.
     *
     * @return the new MinifySettingValue instance
     */
    public MinifySettingValue build() {
      return new MinifySettingValue(this);
    }

    /**
     * Set the css.
     *
     * @param css the css
     * @return the MinifySettingValue builder
     */
    public Builder css(String css) {
      this.css = css;
      return this;
    }

    /**
     * Set the html.
     *
     * @param html the html
     * @return the MinifySettingValue builder
     */
    public Builder html(String html) {
      this.html = html;
      return this;
    }

    /**
     * Set the js.
     *
     * @param js the js
     * @return the MinifySettingValue builder
     */
    public Builder js(String js) {
      this.js = js;
      return this;
    }
  }

  protected MinifySettingValue(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.css,
      "css cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.html,
      "html cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.js,
      "js cannot be null");
    css = builder.css;
    html = builder.html;
    js = builder.js;
  }

  /**
   * New builder.
   *
   * @return a MinifySettingValue builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the css.
   *
   * Automatically minify all CSS for your website.
   *
   * @return the css
   */
  public String css() {
    return css;
  }

  /**
   * Gets the html.
   *
   * Automatically minify all HTML for your website.
   *
   * @return the html
   */
  public String html() {
    return html;
  }

  /**
   * Gets the js.
   *
   * Automatically minify all JavaScript for your website.
   *
   * @return the js
   */
  public String js() {
    return js;
  }
}

