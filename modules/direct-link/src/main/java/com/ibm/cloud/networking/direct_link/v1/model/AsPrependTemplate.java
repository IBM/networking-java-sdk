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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Create AS Prepend Configuration template.
 */
public class AsPrependTemplate extends GenericModel {

  /**
   * Route type this AS Prepend applies to.
   */
  public interface Policy {
    /** import. */
    String X_IMPORT = "import";
    /** export. */
    String EXPORT = "export";
  }

  protected Long length;
  protected String policy;
  protected String prefix;

  /**
   * Builder.
   */
  public static class Builder {
    private Long length;
    private String policy;
    private String prefix;

    private Builder(AsPrependTemplate asPrependTemplate) {
      this.length = asPrependTemplate.length;
      this.policy = asPrependTemplate.policy;
      this.prefix = asPrependTemplate.prefix;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param length the length
     * @param policy the policy
     */
    public Builder(Long length, String policy) {
      this.length = length;
      this.policy = policy;
    }

    /**
     * Builds a AsPrependTemplate.
     *
     * @return the new AsPrependTemplate instance
     */
    public AsPrependTemplate build() {
      return new AsPrependTemplate(this);
    }

    /**
     * Set the length.
     *
     * @param length the length
     * @return the AsPrependTemplate builder
     */
    public Builder length(long length) {
      this.length = length;
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the AsPrependTemplate builder
     */
    public Builder policy(String policy) {
      this.policy = policy;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the AsPrependTemplate builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected AsPrependTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.length,
      "length cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.policy,
      "policy cannot be null");
    length = builder.length;
    policy = builder.policy;
    prefix = builder.prefix;
  }

  /**
   * New builder.
   *
   * @return a AsPrependTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the length.
   *
   * Number of times the ASN to appended to the AS Path.
   *
   * @return the length
   */
  public Long length() {
    return length;
  }

  /**
   * Gets the policy.
   *
   * Route type this AS Prepend applies to.
   *
   * @return the policy
   */
  public String policy() {
    return policy;
  }

  /**
   * Gets the prefix.
   *
   * Comma separated list of prefixes this AS Prepend applies to.  Maximum of 10 prefixes.  If not specified, this AS
   * Prepend applies to all prefixes.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }
}

