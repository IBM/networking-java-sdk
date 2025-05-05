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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The setGatewayMacsec options.
 */
public class SetGatewayMacsecOptions extends GenericModel {

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

  protected String id;
  protected Boolean active;
  protected List<GatewayMacsecCakPrototype> caks;
  protected SakRekeyPrototype sakRekey;
  protected String securityPolicy;
  protected Long windowSize;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean active;
    private List<GatewayMacsecCakPrototype> caks;
    private SakRekeyPrototype sakRekey;
    private String securityPolicy;
    private Long windowSize;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing SetGatewayMacsecOptions instance.
     *
     * @param setGatewayMacsecOptions the instance to initialize the Builder with
     */
    private Builder(SetGatewayMacsecOptions setGatewayMacsecOptions) {
      this.id = setGatewayMacsecOptions.id;
      this.active = setGatewayMacsecOptions.active;
      this.caks = setGatewayMacsecOptions.caks;
      this.sakRekey = setGatewayMacsecOptions.sakRekey;
      this.securityPolicy = setGatewayMacsecOptions.securityPolicy;
      this.windowSize = setGatewayMacsecOptions.windowSize;
      this.ifMatch = setGatewayMacsecOptions.ifMatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param active the active
     * @param caks the caks
     * @param sakRekey the sakRekey
     * @param securityPolicy the securityPolicy
     */
    public Builder(String id, Boolean active, List<GatewayMacsecCakPrototype> caks, SakRekeyPrototype sakRekey, String securityPolicy) {
      this.id = id;
      this.active = active;
      this.caks = caks;
      this.sakRekey = sakRekey;
      this.securityPolicy = securityPolicy;
    }

    /**
     * Builds a SetGatewayMacsecOptions.
     *
     * @return the new SetGatewayMacsecOptions instance
     */
    public SetGatewayMacsecOptions build() {
      return new SetGatewayMacsecOptions(this);
    }

    /**
     * Adds a new element to caks.
     *
     * @param caks the new element to be added
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder addCaks(GatewayMacsecCakPrototype caks) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(caks,
        "caks cannot be null");
      if (this.caks == null) {
        this.caks = new ArrayList<GatewayMacsecCakPrototype>();
      }
      this.caks.add(caks);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the caks.
     * Existing caks will be replaced.
     *
     * @param caks the caks
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder caks(List<GatewayMacsecCakPrototype> caks) {
      this.caks = caks;
      return this;
    }

    /**
     * Set the sakRekey.
     *
     * @param sakRekey the sakRekey
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder sakRekey(SakRekeyPrototype sakRekey) {
      this.sakRekey = sakRekey;
      return this;
    }

    /**
     * Set the securityPolicy.
     *
     * @param securityPolicy the securityPolicy
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder securityPolicy(String securityPolicy) {
      this.securityPolicy = securityPolicy;
      return this;
    }

    /**
     * Set the windowSize.
     *
     * @param windowSize the windowSize
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder windowSize(long windowSize) {
      this.windowSize = windowSize;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the SetGatewayMacsecOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected SetGatewayMacsecOptions() { }

  protected SetGatewayMacsecOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.active,
      "active cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.caks,
      "caks cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sakRekey,
      "sakRekey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.securityPolicy,
      "securityPolicy cannot be null");
    id = builder.id;
    active = builder.active;
    caks = builder.caks;
    sakRekey = builder.sakRekey;
    securityPolicy = builder.securityPolicy;
    windowSize = builder.windowSize;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a SetGatewayMacsecOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the active.
   *
   * Determines if the MACsec feature should initially be active (true) or inactive (false) for a gateway.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the caks.
   *
   * List of all connectivity association keys (CAKs) to be associated associated with the MACsec feature on a direct
   * link.
   *
   * There must be at least one CAK with `session`: `primary`. There can be at most one CAK with `session`: `fallback`
   *
   * All CAKs must reference a unique key.
   *
   * @return the caks
   */
  public List<GatewayMacsecCakPrototype> caks() {
    return caks;
  }

  /**
   * Gets the sakRekey.
   *
   * Determines how SAK rekeying occurs. It is either timer based or based on the amount of used packet numbers.
   *
   * @return the sakRekey
   */
  public SakRekeyPrototype sakRekey() {
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
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   *
   * `If-Match` is required when the resource exists and has an ETag value.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

