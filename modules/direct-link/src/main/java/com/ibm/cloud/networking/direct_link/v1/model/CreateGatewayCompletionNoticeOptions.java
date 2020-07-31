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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createGatewayCompletionNotice options.
 */
public class CreateGatewayCompletionNoticeOptions extends GenericModel {

  protected String id;
  protected InputStream upload;
  protected String uploadContentType;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private InputStream upload;
    private String uploadContentType;

    private Builder(CreateGatewayCompletionNoticeOptions createGatewayCompletionNoticeOptions) {
      this.id = createGatewayCompletionNoticeOptions.id;
      this.upload = createGatewayCompletionNoticeOptions.upload;
      this.uploadContentType = createGatewayCompletionNoticeOptions.uploadContentType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a CreateGatewayCompletionNoticeOptions.
     *
     * @return the new CreateGatewayCompletionNoticeOptions instance
     */
    public CreateGatewayCompletionNoticeOptions build() {
      return new CreateGatewayCompletionNoticeOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateGatewayCompletionNoticeOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the upload.
     *
     * @param upload the upload
     * @return the CreateGatewayCompletionNoticeOptions builder
     */
    public Builder upload(InputStream upload) {
      this.upload = upload;
      return this;
    }

    /**
     * Set the uploadContentType.
     *
     * @param uploadContentType the uploadContentType
     * @return the CreateGatewayCompletionNoticeOptions builder
     */
    public Builder uploadContentType(String uploadContentType) {
      this.uploadContentType = uploadContentType;
      return this;
    }

    /**
     * Set the upload.
     *
     * @param upload the upload
     * @return the CreateGatewayCompletionNoticeOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder upload(File upload) throws FileNotFoundException {
      this.upload = new FileInputStream(upload);
      return this;
    }
  }

  protected CreateGatewayCompletionNoticeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    upload = builder.upload;
    uploadContentType = builder.uploadContentType;
  }

  /**
   * New builder.
   *
   * @return a CreateGatewayCompletionNoticeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link Dedicated gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the upload.
   *
   * Completion notice PDF file.
   *
   * @return the upload
   */
  public InputStream upload() {
    return upload;
  }

  /**
   * Gets the uploadContentType.
   *
   * The content type of upload. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the uploadContentType
   */
  public String uploadContentType() {
    return uploadContentType;
  }
}

