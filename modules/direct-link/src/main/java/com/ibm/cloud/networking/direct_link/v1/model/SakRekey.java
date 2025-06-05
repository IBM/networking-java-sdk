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
 * Determines how SAK rekeying occurs. It is either timer based or based on the amount of used packet numbers.
 *
 * Classes which extend this class:
 * - SakRekeyTimerMode
 * - SakRekeyPacketNumberRolloverMode
 */
public class SakRekey extends GenericModel {

  /**
   * Determines that the SAK rekey occurs based on a timer.
   */
  public interface Mode {
    /** timer. */
    String TIMER = "timer";
  }

  protected Long interval;
  protected String mode;

  protected SakRekey() { }

  /**
   * Gets the interval.
   *
   * The time, in seconds, to force a Secure Association Key (SAK) rekey.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the mode.
   *
   * Determines that the SAK rekey occurs based on a timer.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }
}

