/*
 * (C) Copyright IBM Corp. 2021.
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
 * The listOfferingTypeLocationCrossConnectRouters options.
 */
public class ListOfferingTypeLocationCrossConnectRoutersOptions extends GenericModel {

  /**
   * The Direct Link offering type.  Only value `"dedicated"` is supported for this API.
   */
  public interface OfferingType {
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

  protected String offeringType;
  protected String locationName;

  /**
   * Builder.
   */
  public static class Builder {
    private String offeringType;
    private String locationName;

    private Builder(ListOfferingTypeLocationCrossConnectRoutersOptions listOfferingTypeLocationCrossConnectRoutersOptions) {
      this.offeringType = listOfferingTypeLocationCrossConnectRoutersOptions.offeringType;
      this.locationName = listOfferingTypeLocationCrossConnectRoutersOptions.locationName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param offeringType the offeringType
     * @param locationName the locationName
     */
    public Builder(String offeringType, String locationName) {
      this.offeringType = offeringType;
      this.locationName = locationName;
    }

    /**
     * Builds a ListOfferingTypeLocationCrossConnectRoutersOptions.
     *
     * @return the new ListOfferingTypeLocationCrossConnectRoutersOptions instance
     */
    public ListOfferingTypeLocationCrossConnectRoutersOptions build() {
      return new ListOfferingTypeLocationCrossConnectRoutersOptions(this);
    }

    /**
     * Set the offeringType.
     *
     * @param offeringType the offeringType
     * @return the ListOfferingTypeLocationCrossConnectRoutersOptions builder
     */
    public Builder offeringType(String offeringType) {
      this.offeringType = offeringType;
      return this;
    }

    /**
     * Set the locationName.
     *
     * @param locationName the locationName
     * @return the ListOfferingTypeLocationCrossConnectRoutersOptions builder
     */
    public Builder locationName(String locationName) {
      this.locationName = locationName;
      return this;
    }
  }

  protected ListOfferingTypeLocationCrossConnectRoutersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.offeringType,
      "offeringType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.locationName,
      "locationName cannot be empty");
    offeringType = builder.offeringType;
    locationName = builder.locationName;
  }

  /**
   * New builder.
   *
   * @return a ListOfferingTypeLocationCrossConnectRoutersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offeringType.
   *
   * The Direct Link offering type.  Only value `"dedicated"` is supported for this API.
   *
   * @return the offeringType
   */
  public String offeringType() {
    return offeringType;
  }

  /**
   * Gets the locationName.
   *
   * The name of the Direct Link location.
   *
   * @return the locationName
   */
  public String locationName() {
    return locationName;
  }
}

