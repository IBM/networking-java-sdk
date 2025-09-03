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

package com.ibm.cloud.networking.rulesets.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Ratelimit.
 */
public class Ratelimit extends GenericModel {

  protected List<String> characteristics;
  @SerializedName("counting_expression")
  protected String countingExpression;
  @SerializedName("mitigation_timeout")
  protected Long mitigationTimeout;
  protected Long period;
  @SerializedName("requests_per_period")
  protected Long requestsPerPeriod;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> characteristics;
    private String countingExpression;
    private Long mitigationTimeout;
    private Long period;
    private Long requestsPerPeriod;

    /**
     * Instantiates a new Builder from an existing Ratelimit instance.
     *
     * @param ratelimit the instance to initialize the Builder with
     */
    private Builder(Ratelimit ratelimit) {
      this.characteristics = ratelimit.characteristics;
      this.countingExpression = ratelimit.countingExpression;
      this.mitigationTimeout = ratelimit.mitigationTimeout;
      this.period = ratelimit.period;
      this.requestsPerPeriod = ratelimit.requestsPerPeriod;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Ratelimit.
     *
     * @return the new Ratelimit instance
     */
    public Ratelimit build() {
      return new Ratelimit(this);
    }

    /**
     * Adds a new element to characteristics.
     *
     * @param characteristics the new element to be added
     * @return the Ratelimit builder
     */
    public Builder addCharacteristics(String characteristics) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(characteristics,
        "characteristics cannot be null");
      if (this.characteristics == null) {
        this.characteristics = new ArrayList<String>();
      }
      this.characteristics.add(characteristics);
      return this;
    }

    /**
     * Set the characteristics.
     * Existing characteristics will be replaced.
     *
     * @param characteristics the characteristics
     * @return the Ratelimit builder
     */
    public Builder characteristics(List<String> characteristics) {
      this.characteristics = characteristics;
      return this;
    }

    /**
     * Set the countingExpression.
     *
     * @param countingExpression the countingExpression
     * @return the Ratelimit builder
     */
    public Builder countingExpression(String countingExpression) {
      this.countingExpression = countingExpression;
      return this;
    }

    /**
     * Set the mitigationTimeout.
     *
     * @param mitigationTimeout the mitigationTimeout
     * @return the Ratelimit builder
     */
    public Builder mitigationTimeout(long mitigationTimeout) {
      this.mitigationTimeout = mitigationTimeout;
      return this;
    }

    /**
     * Set the period.
     *
     * @param period the period
     * @return the Ratelimit builder
     */
    public Builder period(long period) {
      this.period = period;
      return this;
    }

    /**
     * Set the requestsPerPeriod.
     *
     * @param requestsPerPeriod the requestsPerPeriod
     * @return the Ratelimit builder
     */
    public Builder requestsPerPeriod(long requestsPerPeriod) {
      this.requestsPerPeriod = requestsPerPeriod;
      return this;
    }
  }

  protected Ratelimit() { }

  protected Ratelimit(Builder builder) {
    characteristics = builder.characteristics;
    countingExpression = builder.countingExpression;
    mitigationTimeout = builder.mitigationTimeout;
    period = builder.period;
    requestsPerPeriod = builder.requestsPerPeriod;
  }

  /**
   * New builder.
   *
   * @return a Ratelimit builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the characteristics.
   *
   * The set of parameters that define how rate for this rule is tracked.
   *
   * @return the characteristics
   */
  public List<String> characteristics() {
    return characteristics;
  }

  /**
   * Gets the countingExpression.
   *
   * Expression that specifies the criteria you are matching traffic on.
   *
   * @return the countingExpression
   */
  public String countingExpression() {
    return countingExpression;
  }

  /**
   * Gets the mitigationTimeout.
   *
   * Once the rate is reached, the rate limiting rule blocks further requests for the period of time defined in this
   * field.
   *
   * @return the mitigationTimeout
   */
  public Long mitigationTimeout() {
    return mitigationTimeout;
  }

  /**
   * Gets the period.
   *
   * The period of time to consider (in seconds) when evaluating the rate.
   *
   * @return the period
   */
  public Long period() {
    return period;
  }

  /**
   * Gets the requestsPerPeriod.
   *
   * The number of requests over the period of time that will trigger the rate limiting rule.
   *
   * @return the requestsPerPeriod
   */
  public Long requestsPerPeriod() {
    return requestsPerPeriod;
  }
}

