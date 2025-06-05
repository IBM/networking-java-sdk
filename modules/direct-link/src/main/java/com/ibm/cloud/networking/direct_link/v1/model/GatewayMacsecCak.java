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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A connectivity association key (CAK) used in the MACsec Key Agreement (MKA) protocol.
 *
 * MACsec CAKs consist of both a name and key. The CAK's `name` must be a hexadecimal string of even lengths between 2
 * to 64 inclusive. The CAK's `key` must be a [Hyper Protect Crypto Service Standard
 * Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started) type=standard with key material a hexadecimal
 * string exactly 64 characters in length.
 */
public class GatewayMacsecCak extends GenericModel {

  /**
   * The intended session the key will be used to secure.
   *
   * If the `primary` MACsec session fails due to a key/key name mismatch on the peers, the `fallback` session can take
   * over.
   *
   * There must be a `primary` session CAK. A `fallback` CAK is optional.
   */
  public interface Session {
    /** primary. */
    String PRIMARY = "primary";
    /** fallback. */
    String FALLBACK = "fallback";
  }

  /**
   * Current status of the CAK.
   *
   * Status `operational` is returned when the CAK is configured successfully.
   *
   * Status `rotating` is returned during a key rotation. The CAK defined by `active_delta` is still configured on the
   * device and could be securing the MACsec session. In the case of a primary CAK, the status will be `rotating` for a
   * period of time while waiting for the MACsec session to be secured with the new CAK. After that time, the CAK will
   * either enter `active` or `inactive` status.
   *
   * Status `active` is returned when the CAK is configured successfully and is currently used to secure the MACsec
   * session.
   *
   * Status `inactive` is returned when the CAK is configured successfully, but is not currently used to secure the
   * MACsec session. The CAK may enter `rotating` status, and ultimately the `active` status, if it is found to be used
   * to secure the MACsec session. The CAK may never leave this status on its own (e.g. if there is a key/key name
   * mismatch). You are allowed to patch the CAK in this state to start the rotation procedure again.
   *
   * Status `failed` is returned when the CAK cannot be configured. To recover, first resolve any issues with your HPCS
   * key, then patch this CAK with the same or new key. Alternatively, you can delete this CAK if used for the
   * `fallback` session.
   */
  public interface Status {
    /** operational. */
    String OPERATIONAL = "operational";
    /** rotating. */
    String ROTATING = "rotating";
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("active_delta")
  protected GatewayMacsecCakActiveDelta activeDelta;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String id;
  protected HpcsKeyReference key;
  protected String name;
  protected String session;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected GatewayMacsecCak() { }

  /**
   * Gets the activeDelta.
   *
   * This field will be present when the `status` of the MACsec CAK is `rotating` or `inactive`. It may be present when
   * the CAK `status` is `failed`.
   *
   * This object denotes the MACsec CAK's values prior to beginning a CAK rotation and represents the previous key still
   * configured in the direct link's MACsec key chain.
   *
   * This object will be removed when the MACsec CAK rotation completes, indicating that the previous key has been
   * removed from the key chain, and the current CAK's values are in use.
   *
   * @return the activeDelta
   */
  public GatewayMacsecCakActiveDelta getActiveDelta() {
    return activeDelta;
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
   * Gets the id.
   *
   * The unique identifier for this connectivity association key (CAK).
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the key.
   *
   * A reference to a [Hyper Protect Crypto Service Standard
   * Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started).
   *
   * @return the key
   */
  public HpcsKeyReference getKey() {
    return key;
  }

  /**
   * Gets the name.
   *
   * The name identifies the connectivity association key (CAK) within the MACsec key chain.
   *
   * The CAK's `name` must be a hexadecimal string of even lengths between 2 to 64 inclusive.
   *
   * This value, along with the material of the `key`, must match on the MACsec peers.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the session.
   *
   * The intended session the key will be used to secure.
   *
   * If the `primary` MACsec session fails due to a key/key name mismatch on the peers, the `fallback` session can take
   * over.
   *
   * There must be a `primary` session CAK. A `fallback` CAK is optional.
   *
   * @return the session
   */
  public String getSession() {
    return session;
  }

  /**
   * Gets the status.
   *
   * Current status of the CAK.
   *
   * Status `operational` is returned when the CAK is configured successfully.
   *
   * Status `rotating` is returned during a key rotation. The CAK defined by `active_delta` is still configured on the
   * device and could be securing the MACsec session. In the case of a primary CAK, the status will be `rotating` for a
   * period of time while waiting for the MACsec session to be secured with the new CAK. After that time, the CAK will
   * either enter `active` or `inactive` status.
   *
   * Status `active` is returned when the CAK is configured successfully and is currently used to secure the MACsec
   * session.
   *
   * Status `inactive` is returned when the CAK is configured successfully, but is not currently used to secure the
   * MACsec session. The CAK may enter `rotating` status, and ultimately the `active` status, if it is found to be used
   * to secure the MACsec session. The CAK may never leave this status on its own (e.g. if there is a key/key name
   * mismatch). You are allowed to patch the CAK in this state to start the rotation procedure again.
   *
   * Status `failed` is returned when the CAK cannot be configured. To recover, first resolve any issues with your HPCS
   * key, then patch this CAK with the same or new key. Alternatively, you can delete this CAK if used for the
   * `fallback` session.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
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
}

