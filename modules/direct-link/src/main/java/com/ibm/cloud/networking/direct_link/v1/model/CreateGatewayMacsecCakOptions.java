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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createGatewayMacsecCak options.
 */
public class CreateGatewayMacsecCakOptions extends GenericModel {

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

  protected String id;
  protected HpcsKeyIdentity key;
  protected String name;
  protected String session;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private HpcsKeyIdentity key;
    private String name;
    private String session;

    /**
     * Instantiates a new Builder from an existing CreateGatewayMacsecCakOptions instance.
     *
     * @param createGatewayMacsecCakOptions the instance to initialize the Builder with
     */
    private Builder(CreateGatewayMacsecCakOptions createGatewayMacsecCakOptions) {
      this.id = createGatewayMacsecCakOptions.id;
      this.key = createGatewayMacsecCakOptions.key;
      this.name = createGatewayMacsecCakOptions.name;
      this.session = createGatewayMacsecCakOptions.session;
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
     * @param key the key
     * @param name the name
     * @param session the session
     */
    public Builder(String id, HpcsKeyIdentity key, String name, String session) {
      this.id = id;
      this.key = key;
      this.name = name;
      this.session = session;
    }

    /**
     * Builds a CreateGatewayMacsecCakOptions.
     *
     * @return the new CreateGatewayMacsecCakOptions instance
     */
    public CreateGatewayMacsecCakOptions build() {
      return new CreateGatewayMacsecCakOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateGatewayMacsecCakOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the CreateGatewayMacsecCakOptions builder
     */
    public Builder key(HpcsKeyIdentity key) {
      this.key = key;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateGatewayMacsecCakOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the session.
     *
     * @param session the session
     * @return the CreateGatewayMacsecCakOptions builder
     */
    public Builder session(String session) {
      this.session = session;
      return this;
    }
  }

  protected CreateGatewayMacsecCakOptions() { }

  protected CreateGatewayMacsecCakOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.session,
      "session cannot be null");
    id = builder.id;
    key = builder.key;
    name = builder.name;
    session = builder.session;
  }

  /**
   * New builder.
   *
   * @return a CreateGatewayMacsecCakOptions builder
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
   * Gets the key.
   *
   * A [Hyper Protect Crypto Service Standard Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started).
   *
   * @return the key
   */
  public HpcsKeyIdentity key() {
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
  public String name() {
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
  public String session() {
    return session;
  }
}

