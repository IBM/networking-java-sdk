/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.networking.dns_svcs.v1.model;

/**
 * The content of type-TXT resource record.
 */
public class ResourceRecordInputRdataRdataTxtRecord extends ResourceRecordInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String text;

    public Builder(ResourceRecordInputRdata resourceRecordInputRdataRdataTxtRecord) {
      this.text = resourceRecordInputRdataRdataTxtRecord.text;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param text the text
     */
    public Builder(String text) {
      this.text = text;
    }

    /**
     * Builds a ResourceRecordInputRdataRdataTxtRecord.
     *
     * @return the new ResourceRecordInputRdataRdataTxtRecord instance
     */
    public ResourceRecordInputRdataRdataTxtRecord build() {
      return new ResourceRecordInputRdataRdataTxtRecord(this);
    }

    /**
     * Set the text.
     *
     * @param text the text
     * @return the ResourceRecordInputRdataRdataTxtRecord builder
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }
  }

  protected ResourceRecordInputRdataRdataTxtRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.text,
      "text cannot be null");
    text = builder.text;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordInputRdataRdataTxtRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

