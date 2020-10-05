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
package com.ibm.cloud.networking.caching_api.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The purgeByUrls options.
 */
public class PurgeByUrlsOptions extends GenericModel {

  protected List<String> files;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> files;

    private Builder(PurgeByUrlsOptions purgeByUrlsOptions) {
      this.files = purgeByUrlsOptions.files;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PurgeByUrlsOptions.
     *
     * @return the new PurgeByUrlsOptions instance
     */
    public PurgeByUrlsOptions build() {
      return new PurgeByUrlsOptions(this);
    }

    /**
     * Adds an files to files.
     *
     * @param files the new files
     * @return the PurgeByUrlsOptions builder
     */
    public Builder addFiles(String files) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(files,
        "files cannot be null");
      if (this.files == null) {
        this.files = new ArrayList<String>();
      }
      this.files.add(files);
      return this;
    }

    /**
     * Set the files.
     * Existing files will be replaced.
     *
     * @param files the files
     * @return the PurgeByUrlsOptions builder
     */
    public Builder files(List<String> files) {
      this.files = files;
      return this;
    }
  }

  protected PurgeByUrlsOptions(Builder builder) {
    files = builder.files;
  }

  /**
   * New builder.
   *
   * @return a PurgeByUrlsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the files.
   *
   * purge url array.
   *
   * @return the files
   */
  public List<String> files() {
    return files;
  }
}

