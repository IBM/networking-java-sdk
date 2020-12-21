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
package com.ibm.cloud.networking.dns_svcs.v1.model;

/**
 * The content of type-PTR resource record.
 */
public class ResourceRecordUpdateInputRdataRdataPtrRecord extends ResourceRecordUpdateInputRdata {


  /**
   * Builder.
   */
  public static class Builder {
    private String ptrdname;

    public Builder(ResourceRecordUpdateInputRdata resourceRecordUpdateInputRdataRdataPtrRecord) {
      this.ptrdname = resourceRecordUpdateInputRdataRdataPtrRecord.ptrdname;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ptrdname the ptrdname
     */
    public Builder(String ptrdname) {
      this.ptrdname = ptrdname;
    }

    /**
     * Builds a ResourceRecordUpdateInputRdataRdataPtrRecord.
     *
     * @return the new ResourceRecordUpdateInputRdataRdataPtrRecord instance
     */
    public ResourceRecordUpdateInputRdataRdataPtrRecord build() {
      return new ResourceRecordUpdateInputRdataRdataPtrRecord(this);
    }

    /**
     * Set the ptrdname.
     *
     * @param ptrdname the ptrdname
     * @return the ResourceRecordUpdateInputRdataRdataPtrRecord builder
     */
    public Builder ptrdname(String ptrdname) {
      this.ptrdname = ptrdname;
      return this;
    }
  }

  protected ResourceRecordUpdateInputRdataRdataPtrRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ptrdname,
      "ptrdname cannot be null");
    ptrdname = builder.ptrdname;
  }

  /**
   * New builder.
   *
   * @return a ResourceRecordUpdateInputRdataRdataPtrRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

