/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MACsec configuration information.  For Dedicated Gateways with MACsec configured, return configuration information.
 * Contact IBM support for access to MACsec.
 */
public class GatewayMacsecConfig extends GenericModel {

  /**
   * SAK cipher suite.
   */
  public interface CipherSuite {
    /** gcm_aes_xpn_256. */
    String GCM_AES_XPN_256 = "gcm_aes_xpn_256";
  }

  /**
   * cryptographic algorithm.
   */
  public interface CryptographicAlgorithm {
    /** aes_256_cmac. */
    String AES_256_CMAC = "aes_256_cmac";
  }

  /**
   * Packets without MACsec headers are dropped when security_policy is `must_secure`.
   */
  public interface SecurityPolicy {
    /** must_secure. */
    String MUST_SECURE = "must_secure";
  }

  /**
   * Current status of MACsec on this gateway.
   *
   * Status 'offline' is returned during gateway creation and deletion.
   */
  public interface Status {
    /** init. */
    String INIT = "init";
    /** pending. */
    String PENDING = "pending";
    /** offline. */
    String OFFLINE = "offline";
    /** secured. */
    String SECURED = "secured";
  }

  protected Boolean active;
  @SerializedName("active_cak")
  protected GatewayMacsecConfigActiveCak activeCak;
  @SerializedName("cipher_suite")
  protected String cipherSuite;
  @SerializedName("confidentiality_offset")
  protected Long confidentialityOffset;
  @SerializedName("cryptographic_algorithm")
  protected String cryptographicAlgorithm;
  @SerializedName("fallback_cak")
  protected GatewayMacsecConfigFallbackCak fallbackCak;
  @SerializedName("key_server_priority")
  protected Long keyServerPriority;
  @SerializedName("primary_cak")
  protected GatewayMacsecConfigPrimaryCak primaryCak;
  @SerializedName("sak_expiry_time")
  protected Long sakExpiryTime;
  @SerializedName("security_policy")
  protected String securityPolicy;
  protected String status;
  @SerializedName("window_size")
  protected Long windowSize;

  /**
   * Gets the active.
   *
   * Indicate whether MACsec should currently be active (true) or inactive (false) for a MACsec enabled gateway.   To be
   * MACsec enabled a `macsec_config` must be specified at gateway create time.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }

  /**
   * Gets the activeCak.
   *
   * Active connectivity association key.
   *
   * During normal operation `active_cak` will match the desired `primary_cak`.  During CAK changes this field can be
   * used to indicate which key is currently active on the gateway.
   *
   * @return the activeCak
   */
  public GatewayMacsecConfigActiveCak getActiveCak() {
    return activeCak;
  }

  /**
   * Gets the cipherSuite.
   *
   * SAK cipher suite.
   *
   * @return the cipherSuite
   */
  public String getCipherSuite() {
    return cipherSuite;
  }

  /**
   * Gets the confidentialityOffset.
   *
   * confidentiality offset.
   *
   * @return the confidentialityOffset
   */
  public Long getConfidentialityOffset() {
    return confidentialityOffset;
  }

  /**
   * Gets the cryptographicAlgorithm.
   *
   * cryptographic algorithm.
   *
   * @return the cryptographicAlgorithm
   */
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  /**
   * Gets the fallbackCak.
   *
   * fallback connectivity association key.
   *
   * @return the fallbackCak
   */
  public GatewayMacsecConfigFallbackCak getFallbackCak() {
    return fallbackCak;
  }

  /**
   * Gets the keyServerPriority.
   *
   * key server priority.
   *
   * @return the keyServerPriority
   */
  public Long getKeyServerPriority() {
    return keyServerPriority;
  }

  /**
   * Gets the primaryCak.
   *
   * desired primary connectivity association key.
   *
   * @return the primaryCak
   */
  public GatewayMacsecConfigPrimaryCak getPrimaryCak() {
    return primaryCak;
  }

  /**
   * Gets the sakExpiryTime.
   *
   * Secure Association Key (SAK) expiry time in seconds.
   *
   * @return the sakExpiryTime
   */
  public Long getSakExpiryTime() {
    return sakExpiryTime;
  }

  /**
   * Gets the securityPolicy.
   *
   * Packets without MACsec headers are dropped when security_policy is `must_secure`.
   *
   * @return the securityPolicy
   */
  public String getSecurityPolicy() {
    return securityPolicy;
  }

  /**
   * Gets the status.
   *
   * Current status of MACsec on this gateway.
   *
   * Status 'offline' is returned during gateway creation and deletion.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the windowSize.
   *
   * replay protection window size.
   *
   * @return the windowSize
   */
  public Long getWindowSize() {
    return windowSize;
  }
}

