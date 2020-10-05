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
package com.ibm.cloud.networking.dns_record_bulk.v1.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The postDnsRecordsBulk options.
 */
public class PostDnsRecordsBulkOptions extends GenericModel {

  protected InputStream file;
  protected String fileContentType;

  /**
   * Builder.
   */
  public static class Builder {
    private InputStream file;
    private String fileContentType;

    private Builder(PostDnsRecordsBulkOptions postDnsRecordsBulkOptions) {
      this.file = postDnsRecordsBulkOptions.file;
      this.fileContentType = postDnsRecordsBulkOptions.fileContentType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PostDnsRecordsBulkOptions.
     *
     * @return the new PostDnsRecordsBulkOptions instance
     */
    public PostDnsRecordsBulkOptions build() {
      return new PostDnsRecordsBulkOptions(this);
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the PostDnsRecordsBulkOptions builder
     */
    public Builder file(InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * Set the fileContentType.
     *
     * @param fileContentType the fileContentType
     * @return the PostDnsRecordsBulkOptions builder
     */
    public Builder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the PostDnsRecordsBulkOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder file(File file) throws FileNotFoundException {
      this.file = new FileInputStream(file);
      return this;
    }
  }

  protected PostDnsRecordsBulkOptions(Builder builder) {
    file = builder.file;
    fileContentType = builder.fileContentType;
  }

  /**
   * New builder.
   *
   * @return a PostDnsRecordsBulkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the file.
   *
   * file to upload.
   *
   * @return the file
   */
  public InputStream file() {
    return file;
  }

  /**
   * Gets the fileContentType.
   *
   * The content type of file. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the fileContentType
   */
  public String fileContentType() {
    return fileContentType;
  }
}

