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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Patch fields for MACsec configuration of a Direct Link gateway.
 */
public class GatewayMacsecPatch extends GenericModel {

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

  protected Boolean active;
  @SerializedName("sak_rekey")
  protected SakRekeyPatch sakRekey;
  @SerializedName("security_policy")
  protected String securityPolicy;
  @SerializedName("window_size")
  protected Long windowSize;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;
    private SakRekeyPatch sakRekey;
    private String securityPolicy;
    private Long windowSize;

    /**
     * Instantiates a new Builder from an existing GatewayMacsecPatch instance.
     *
     * @param gatewayMacsecPatch the instance to initialize the Builder with
     */
    private Builder(GatewayMacsecPatch gatewayMacsecPatch) {
      this.active = gatewayMacsecPatch.active;
      this.sakRekey = gatewayMacsecPatch.sakRekey;
      this.securityPolicy = gatewayMacsecPatch.securityPolicy;
      this.windowSize = gatewayMacsecPatch.windowSize;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayMacsecPatch.
     *
     * @return the new GatewayMacsecPatch instance
     */
    public GatewayMacsecPatch build() {
      return new GatewayMacsecPatch(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the GatewayMacsecPatch builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the sakRekey.
     *
     * @param sakRekey the sakRekey
     * @return the GatewayMacsecPatch builder
     */
    public Builder sakRekey(SakRekeyPatch sakRekey) {
      this.sakRekey = sakRekey;
      return this;
    }

    /**
     * Set the securityPolicy.
     *
     * @param securityPolicy the securityPolicy
     * @return the GatewayMacsecPatch builder
     */
    public Builder securityPolicy(String securityPolicy) {
      this.securityPolicy = securityPolicy;
      return this;
    }

    /**
     * Set the windowSize.
     *
     * @param windowSize the windowSize
     * @return the GatewayMacsecPatch builder
     */
    public Builder windowSize(long windowSize) {
      this.windowSize = windowSize;
      return this;
    }
  }

  protected GatewayMacsecPatch() { }

  protected GatewayMacsecPatch(Builder builder) {
    active = builder.active;
    sakRekey = builder.sakRekey;
    securityPolicy = builder.securityPolicy;
    windowSize = builder.windowSize;
  }

  /**
   * New builder.
   *
   * @return a GatewayMacsecPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the active.
   *
   * Sets the MACsec feature to be active (true) or inactive (false) for a gateway.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the sakRekey.
   *
   * Determines how SAK rekeying occurs. It is either timer based or based on the amount of used packet numbers.
   *
   * @return the sakRekey
   */
  public SakRekeyPatch sakRekey() {
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
  public String securityPolicy() {
    return securityPolicy;
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
  public Long windowSize() {
    return windowSize;
  }

  /**
   * Construct a JSON merge-patch from the GatewayMacsecPatch.
   *
   * Note that properties of the GatewayMacsecPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the GatewayMacsecPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

