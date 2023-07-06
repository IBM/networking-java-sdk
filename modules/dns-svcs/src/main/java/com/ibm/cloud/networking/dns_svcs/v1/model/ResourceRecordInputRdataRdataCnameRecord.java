/*
 * (C) Copyright IBM Corp. 2023.
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
public class ResourceRecordInputRdataRdataCnameRecord extends ResourceRecordInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String cname;

    /**
     * Instantiates a new Builder from an existing ResourceRecordInputRdataRdataCnameRecord instance.
     *
     * @param resourceRecordInputRdataRdataCnameRecord the instance to initialize the Builder with
     */
    public Builder(ResourceRecordInputRdata resourceRecordInputRdataRdataCnameRecord) {
      this.cname = resourceRecordInputRdataRdataCnameRecord.cname;
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
     * Builds a ResourceRecordInputRdataRdataCnameRecord.
     *
     * @return the new ResourceRecordInputRdataRdataCnameRecord instance
     */
    public ResourceRecordInputRdataRdataCnameRecord build() {
      return new ResourceRecordInputRdataRdataCnameRecord(this);
    }

    /**
     * Set the cname.
     *
     * @param cname the cname
     * @return the ResourceRecordInputRdataRdataCnameRecord builder
     */
    public Builder cname(String cname) {
      this.cname = cname;
      return this;
    }
  }

  protected ResourceRecordInputRdataRdataCnameRecord() { }

  protected ResourceRecordInputRdataRdataCnameRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cname,
      "cname cannot be null");
    cname = builder.cname;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordInputRdataRdataCnameRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

