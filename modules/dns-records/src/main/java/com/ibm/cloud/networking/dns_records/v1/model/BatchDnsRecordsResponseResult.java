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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BatchDnsRecordsResponseResult.
 */
public class BatchDnsRecordsResponseResult extends GenericModel {

  protected List<BatchDnsRecordDetails> deletes;
  protected List<BatchDnsRecordDetails> patches;
  protected List<BatchDnsRecordDetails> posts;
  protected List<BatchDnsRecordDetails> puts;

  protected BatchDnsRecordsResponseResult() { }

  /**
   * Gets the deletes.
   *
   * @return the deletes
   */
  public List<BatchDnsRecordDetails> getDeletes() {
    return deletes;
  }

  /**
   * Gets the patches.
   *
   * @return the patches
   */
  public List<BatchDnsRecordDetails> getPatches() {
    return patches;
  }

  /**
   * Gets the posts.
   *
   * @return the posts
   */
  public List<BatchDnsRecordDetails> getPosts() {
    return posts;
  }

  /**
   * Gets the puts.
   *
   * @return the puts
   */
  public List<BatchDnsRecordDetails> getPuts() {
    return puts;
  }
}

