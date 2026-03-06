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

package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateOriginPostQuantumEncryption options.
 */
public class UpdateOriginPostQuantumEncryptionOptions extends GenericModel {

  /**
   * Instructs CIS to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin.
   * - `preferred`: Instructs CIS to opportunistically send a Post-Quantum keyshare in the first message to the origin
   * for fastest connections when the origin supports and prefers PQ.
   * - `supported`: The PQ algorithms are advertised but used only when requested by the origin.
   * - `off`: The PQ algorithms are not advertised.
   */
  public interface Value {
    /** preferred. */
    String PREFERRED = "preferred";
    /** supported. */
    String SUPPORTED = "supported";
    /** off. */
    String OFF = "off";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    /**
     * Instantiates a new Builder from an existing UpdateOriginPostQuantumEncryptionOptions instance.
     *
     * @param updateOriginPostQuantumEncryptionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateOriginPostQuantumEncryptionOptions updateOriginPostQuantumEncryptionOptions) {
      this.value = updateOriginPostQuantumEncryptionOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateOriginPostQuantumEncryptionOptions.
     *
     * @return the new UpdateOriginPostQuantumEncryptionOptions instance
     */
    public UpdateOriginPostQuantumEncryptionOptions build() {
      return new UpdateOriginPostQuantumEncryptionOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateOriginPostQuantumEncryptionOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateOriginPostQuantumEncryptionOptions() { }

  protected UpdateOriginPostQuantumEncryptionOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateOriginPostQuantumEncryptionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Instructs CIS to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin.
   * - `preferred`: Instructs CIS to opportunistically send a Post-Quantum keyshare in the first message to the origin
   * for fastest connections when the origin supports and prefers PQ.
   * - `supported`: The PQ algorithms are advertised but used only when requested by the origin.
   * - `off`: The PQ algorithms are not advertised.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

