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
 * The content of type-CNAME resource record.
 */
public class ResourceRecordUpdateInputRdataRdataCnameRecord extends ResourceRecordUpdateInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String cname;

    public Builder(ResourceRecordUpdateInputRdata resourceRecordUpdateInputRdataRdataCnameRecord) {
      this.cname = resourceRecordUpdateInputRdataRdataCnameRecord.cname;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cname the cname
     */
    public Builder(String cname) {
      this.cname = cname;
    }

    /**
     * Builds a ResourceRecordUpdateInputRdataRdataCnameRecord.
     *
     * @return the new ResourceRecordUpdateInputRdataRdataCnameRecord instance
     */
    public ResourceRecordUpdateInputRdataRdataCnameRecord build() {
      return new ResourceRecordUpdateInputRdataRdataCnameRecord(this);
    }

    /**
     * Set the cname.
     *
     * @param cname the cname
     * @return the ResourceRecordUpdateInputRdataRdataCnameRecord builder
     */
    public Builder cname(String cname) {
      this.cname = cname;
      return this;
    }
  }

  protected ResourceRecordUpdateInputRdataRdataCnameRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cname,
      "cname cannot be null");
    cname = builder.cname;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordUpdateInputRdataRdataCnameRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

