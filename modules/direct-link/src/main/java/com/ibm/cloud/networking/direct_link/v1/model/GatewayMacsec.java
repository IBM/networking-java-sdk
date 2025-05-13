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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MACsec configuration information of a Direct Link gateway.
 */
public class GatewayMacsec extends GenericModel {

  /**
   * The cipher suite used in generating the security association key (SAK).
   */
  public interface CipherSuite {
    /** gcm_aes_xpn_256. */
    String GCM_AES_XPN_256 = "gcm_aes_xpn_256";
  }

  /**
   * Determines how packets without MACsec headers are handled.
   *
   * `must_secure` - Packets without MACsec headers are dropped. This policy should be used to prefer security over
   * network availability.
   * `should_secure` - Packets without MACsec headers are allowed. This policy should be used to prefer network
   * availability over security.
   */
  public interface SecurityPolicy {
    /** must_secure. */
    String MUST_SECURE = "must_secure";
    /** should_secure. */
    String SHOULD_SECURE = "should_secure";
  }

  /**
   * Current status of MACsec on this direct link.
   *
   * Status `offline` is returned when MACsec is inactive and during direct link creation.
   *
   * Status `deleting` is returned when MACsec during removal of MACsec from the direct link and during direct link
   * deletion.
   *
   * See `status_reasons[]` for possible remediation of the `failed` `status`.
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
    /** failed. */
    String FAILED = "failed";
    /** deleting. */
    String DELETING = "deleting";
  }

  protected Boolean active;
  @SerializedName("cipher_suite")
  protected String cipherSuite;
  @SerializedName("confidentiality_offset")
  protected Long confidentialityOffset;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("key_server_priority")
  protected Long keyServerPriority;
  @SerializedName("sak_rekey")
  protected SakRekey sakRekey;
  @SerializedName("security_policy")
  protected String securityPolicy;
  protected String status;
  @SerializedName("status_reasons")
  protected List<GatewayMacsecStatusReason> statusReasons;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("window_size")
  protected Long windowSize;

  protected GatewayMacsec() { }

  /**
   * Gets the active.
   *
   * Indicates if the MACsec feature is currently active (true) or inactive (false) for a gateway.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }

  /**
   * Gets the cipherSuite.
   *
   * The cipher suite used in generating the security association key (SAK).
   *
   * @return the cipherSuite
   */
  public String getCipherSuite() {
    return cipherSuite;
  }

  /**
   * Gets the confidentialityOffset.
   *
   * The confidentiality offset determines the number of octets in an Ethernet frame that are not encrypted.
   *
   * @return the confidentialityOffset
   */
  public Long getConfidentialityOffset() {
    return confidentialityOffset;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time the resource was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the keyServerPriority.
   *
   * Used in the MACsec Key Agreement (MKA) protocol to determine which peer acts as the key server.
   *
   * Lower values indicate a higher preference to be the key server.
   *
   * The MACsec configuration on the direct link will always set this value to 255.
   *
   * @return the keyServerPriority
   */
  public Long getKeyServerPriority() {
    return keyServerPriority;
  }

  /**
   * Gets the sakRekey.
   *
   * Determines how SAK rekeying occurs. It is either timer based or based on the amount of used packet numbers.
   *
   * @return the sakRekey
   */
  public SakRekey getSakRekey() {
    return sakRekey;
  }

  /**
   * Gets the securityPolicy.
   *
   * Determines how packets without MACsec headers are handled.
   *
   * `must_secure` - Packets without MACsec headers are dropped. This policy should be used to prefer security over
   * network availability.
   * `should_secure` - Packets without MACsec headers are allowed. This policy should be used to prefer network
   * availability over security.
   *
   * @return the securityPolicy
   */
  public String getSecurityPolicy() {
    return securityPolicy;
  }

  /**
   * Gets the status.
   *
   * Current status of MACsec on this direct link.
   *
   * Status `offline` is returned when MACsec is inactive and during direct link creation.
   *
   * Status `deleting` is returned when MACsec during removal of MACsec from the direct link and during direct link
   * deletion.
   *
   * See `status_reasons[]` for possible remediation of the `failed` `status`.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * Context for certain values of `status`.
   *
   * @return the statusReasons
   */
  public List<GatewayMacsecStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time the resource was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the windowSize.
   *
   * The window size determines the number of frames in a window for replay protection.
   *
   * Replay protection is used to counter replay attacks. Frames within a window size can be out of order and are not
   * replay protected.
   *
   * @return the windowSize
   */
  public Long getWindowSize() {
    return windowSize;
  }
}

