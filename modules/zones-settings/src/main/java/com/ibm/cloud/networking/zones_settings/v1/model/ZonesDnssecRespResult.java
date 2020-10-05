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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for response information.
 */
public class ZonesDnssecRespResult extends GenericModel {

  /**
   * Status.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** disabled. */
    String DISABLED = "disabled";
    /** pending. */
    String PENDING = "pending";
    /** pending-disabled. */
    String PENDING_DISABLED = "pending-disabled";
    /** error. */
    String ERROR = "error";
  }

  protected String status;
  protected Long flags;
  protected String algorithm;
  @SerializedName("key_type")
  protected String keyType;
  @SerializedName("digest_type")
  protected String digestType;
  @SerializedName("digest_algorithm")
  protected String digestAlgorithm;
  protected String digest;
  protected String ds;
  @SerializedName("key_tag")
  protected Long keyTag;
  @SerializedName("public_key")
  protected String publicKey;

  /**
   * Gets the status.
   *
   * Status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the flags.
   *
   * Flags.
   *
   * @return the flags
   */
  public Long getFlags() {
    return flags;
  }

  /**
   * Gets the algorithm.
   *
   * Algorithm.
   *
   * @return the algorithm
   */
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * Gets the keyType.
   *
   * Key type.
   *
   * @return the keyType
   */
  public String getKeyType() {
    return keyType;
  }

  /**
   * Gets the digestType.
   *
   * Digest type.
   *
   * @return the digestType
   */
  public String getDigestType() {
    return digestType;
  }

  /**
   * Gets the digestAlgorithm.
   *
   * Digest algorithm.
   *
   * @return the digestAlgorithm
   */
  public String getDigestAlgorithm() {
    return digestAlgorithm;
  }

  /**
   * Gets the digest.
   *
   * Digest.
   *
   * @return the digest
   */
  public String getDigest() {
    return digest;
  }

  /**
   * Gets the ds.
   *
   * DS.
   *
   * @return the ds
   */
  public String getDs() {
    return ds;
  }

  /**
   * Gets the keyTag.
   *
   * Key tag.
   *
   * @return the keyTag
   */
  public Long getKeyTag() {
    return keyTag;
  }

  /**
   * Gets the publicKey.
   *
   * Public key.
   *
   * @return the publicKey
   */
  public String getPublicKey() {
    return publicKey;
  }
}

