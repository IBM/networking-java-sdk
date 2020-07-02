/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.direct_link_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listOfferingTypeSpeeds options.
 */
public class ListOfferingTypeSpeedsOptions extends GenericModel {

  /**
   * The Direct Link offering type.  Current supported values are `"dedicated"` and `"connect"`.
   */
  public interface OfferingType {
    /** dedicated. */
    String DEDICATED = "dedicated";
    /** connect. */
    String CONNECT = "connect";
  }

  protected String offeringType;

  /**
   * Builder.
   */
  public static class Builder {
    private String offeringType;

    private Builder(ListOfferingTypeSpeedsOptions listOfferingTypeSpeedsOptions) {
      this.offeringType = listOfferingTypeSpeedsOptions.offeringType;
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
     */
    public Builder(String offeringType) {
      this.offeringType = offeringType;
    }

    /**
     * Builds a ListOfferingTypeSpeedsOptions.
     *
     * @return the new ListOfferingTypeSpeedsOptions instance
     */
    public ListOfferingTypeSpeedsOptions build() {
      return new ListOfferingTypeSpeedsOptions(this);
    }

    /**
     * Set the offeringType.
     *
     * @param offeringType the offeringType
     * @return the ListOfferingTypeSpeedsOptions builder
     */
    public Builder offeringType(String offeringType) {
      this.offeringType = offeringType;
      return this;
    }
  }

  protected ListOfferingTypeSpeedsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.offeringType,
      "offeringType cannot be empty");
    offeringType = builder.offeringType;
  }

  /**
   * New builder.
   *
   * @return a ListOfferingTypeSpeedsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offeringType.
   *
   * The Direct Link offering type.  Current supported values are `"dedicated"` and `"connect"`.
   *
   * @return the offeringType
   */
  public String offeringType() {
    return offeringType;
  }
}

