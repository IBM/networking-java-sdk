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

/**
 * Packet number (PN) rollover SAK rekey mode. The SAK is rekeyed based on the proportion of used packet numbers with
 * the current SAK.
 */
public class SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype extends SakRekeyPrototype {

  /**
   * Determines that the SAK rekey occurs based on the used packet numbers.
   */
  public interface Mode {
    /** packet_number_rollover. */
    String PACKET_NUMBER_ROLLOVER = "packet_number_rollover";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String mode;

    /**
     * Instantiates a new Builder from an existing SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype instance.
     *
     * @param sakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype the instance to initialize the Builder with
     */
    public Builder(SakRekeyPrototype sakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype) {
      this.mode = sakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mode the mode
     */
    public Builder(String mode) {
      this.mode = mode;
    }

    /**
     * Builds a SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype.
     *
     * @return the new SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype instance
     */
    public SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype build() {
      return new SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype() { }

  protected SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mode,
      "mode cannot be null");
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

