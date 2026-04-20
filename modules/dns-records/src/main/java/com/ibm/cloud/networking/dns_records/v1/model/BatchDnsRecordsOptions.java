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

package com.ibm.cloud.networking.dns_records.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The batchDnsRecords options.
 */
public class BatchDnsRecordsOptions extends GenericModel {

  protected List<BatchDnsRecordsRequestDeletesItem> deletes;
  protected List<BatchDnsRecordsRequestPatchesItem> patches;
  protected List<DnsrecordInput> posts;
  protected List<BatchDnsRecordsRequestPutsItem> puts;

  /**
   * Builder.
   */
  public static class Builder {
    private List<BatchDnsRecordsRequestDeletesItem> deletes;
    private List<BatchDnsRecordsRequestPatchesItem> patches;
    private List<DnsrecordInput> posts;
    private List<BatchDnsRecordsRequestPutsItem> puts;

    /**
     * Instantiates a new Builder from an existing BatchDnsRecordsOptions instance.
     *
     * @param batchDnsRecordsOptions the instance to initialize the Builder with
     */
    private Builder(BatchDnsRecordsOptions batchDnsRecordsOptions) {
      this.deletes = batchDnsRecordsOptions.deletes;
      this.patches = batchDnsRecordsOptions.patches;
      this.posts = batchDnsRecordsOptions.posts;
      this.puts = batchDnsRecordsOptions.puts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BatchDnsRecordsOptions.
     *
     * @return the new BatchDnsRecordsOptions instance
     */
    public BatchDnsRecordsOptions build() {
      return new BatchDnsRecordsOptions(this);
    }

    /**
     * Adds a new element to deletes.
     *
     * @param deletes the new element to be added
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder addDeletes(BatchDnsRecordsRequestDeletesItem deletes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(deletes,
        "deletes cannot be null");
      if (this.deletes == null) {
        this.deletes = new ArrayList<BatchDnsRecordsRequestDeletesItem>();
      }
      this.deletes.add(deletes);
      return this;
    }

    /**
     * Adds a new element to patches.
     *
     * @param patches the new element to be added
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder addPatches(BatchDnsRecordsRequestPatchesItem patches) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(patches,
        "patches cannot be null");
      if (this.patches == null) {
        this.patches = new ArrayList<BatchDnsRecordsRequestPatchesItem>();
      }
      this.patches.add(patches);
      return this;
    }

    /**
     * Adds a new element to posts.
     *
     * @param posts the new element to be added
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder addPosts(DnsrecordInput posts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(posts,
        "posts cannot be null");
      if (this.posts == null) {
        this.posts = new ArrayList<DnsrecordInput>();
      }
      this.posts.add(posts);
      return this;
    }

    /**
     * Adds a new element to puts.
     *
     * @param puts the new element to be added
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder addPuts(BatchDnsRecordsRequestPutsItem puts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(puts,
        "puts cannot be null");
      if (this.puts == null) {
        this.puts = new ArrayList<BatchDnsRecordsRequestPutsItem>();
      }
      this.puts.add(puts);
      return this;
    }

    /**
     * Set the deletes.
     * Existing deletes will be replaced.
     *
     * @param deletes the deletes
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder deletes(List<BatchDnsRecordsRequestDeletesItem> deletes) {
      this.deletes = deletes;
      return this;
    }

    /**
     * Set the patches.
     * Existing patches will be replaced.
     *
     * @param patches the patches
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder patches(List<BatchDnsRecordsRequestPatchesItem> patches) {
      this.patches = patches;
      return this;
    }

    /**
     * Set the posts.
     * Existing posts will be replaced.
     *
     * @param posts the posts
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder posts(List<DnsrecordInput> posts) {
      this.posts = posts;
      return this;
    }

    /**
     * Set the puts.
     * Existing puts will be replaced.
     *
     * @param puts the puts
     * @return the BatchDnsRecordsOptions builder
     */
    public Builder puts(List<BatchDnsRecordsRequestPutsItem> puts) {
      this.puts = puts;
      return this;
    }
  }

  protected BatchDnsRecordsOptions() { }

  protected BatchDnsRecordsOptions(Builder builder) {
    deletes = builder.deletes;
    patches = builder.patches;
    posts = builder.posts;
    puts = builder.puts;
  }

  /**
   * New builder.
   *
   * @return a BatchDnsRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deletes.
   *
   * @return the deletes
   */
  public List<BatchDnsRecordsRequestDeletesItem> deletes() {
    return deletes;
  }

  /**
   * Gets the patches.
   *
   * @return the patches
   */
  public List<BatchDnsRecordsRequestPatchesItem> patches() {
    return patches;
  }

  /**
   * Gets the posts.
   *
   * @return the posts
   */
  public List<DnsrecordInput> posts() {
    return posts;
  }

  /**
   * Gets the puts.
   *
   * @return the puts
   */
  public List<BatchDnsRecordsRequestPutsItem> puts() {
    return puts;
  }
}

