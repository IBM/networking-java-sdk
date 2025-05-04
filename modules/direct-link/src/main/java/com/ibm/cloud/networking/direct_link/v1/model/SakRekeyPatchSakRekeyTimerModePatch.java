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
 * SAK rekey mode based on length of time since last rekey.
 */
public class SakRekeyPatchSakRekeyTimerModePatch extends SakRekeyPatch {

  /**
   * Determines that the SAK rekey occurs based on a timer.
   */
  public interface Mode {
    /** timer. */
    String TIMER = "timer";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Long interval;
    private String mode;

    /**
     * Instantiates a new Builder from an existing SakRekeyPatchSakRekeyTimerModePatch instance.
     *
     * @param sakRekeyPatchSakRekeyTimerModePatch the instance to initialize the Builder with
     */
    public Builder(SakRekeyPatch sakRekeyPatchSakRekeyTimerModePatch) {
      this.interval = sakRekeyPatchSakRekeyTimerModePatch.interval;
      this.mode = sakRekeyPatchSakRekeyTimerModePatch.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param interval the interval
     * @param mode the mode
     */
    public Builder(Long interval, String mode) {
      this.interval = interval;
      this.mode = mode;
    }

    /**
     * Builds a SakRekeyPatchSakRekeyTimerModePatch.
     *
     * @return the new SakRekeyPatchSakRekeyTimerModePatch instance
     */
    public SakRekeyPatchSakRekeyTimerModePatch build() {
      return new SakRekeyPatchSakRekeyTimerModePatch(this);
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the SakRekeyPatchSakRekeyTimerModePatch builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the SakRekeyPatchSakRekeyTimerModePatch builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected SakRekeyPatchSakRekeyTimerModePatch() { }

  protected SakRekeyPatchSakRekeyTimerModePatch(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interval,
      "interval cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mode,
      "mode cannot be null");
    interval = builder.interval;
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a SakRekeyPatchSakRekeyTimerModePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

