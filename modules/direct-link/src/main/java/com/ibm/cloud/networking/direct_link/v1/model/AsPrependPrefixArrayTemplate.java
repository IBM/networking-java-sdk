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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Create AS Prepend Configuration template.
 */
public class AsPrependPrefixArrayTemplate extends GenericModel {

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
  @SerializedName("specific_prefixes")
  protected List<String> specificPrefixes;

  /**
   * Builder.
   */
  public static class Builder {
    private Long length;
    private String policy;
    private List<String> specificPrefixes;

    /**
     * Instantiates a new Builder from an existing AsPrependPrefixArrayTemplate instance.
     *
     * @param asPrependPrefixArrayTemplate the instance to initialize the Builder with
     */
    private Builder(AsPrependPrefixArrayTemplate asPrependPrefixArrayTemplate) {
      this.length = asPrependPrefixArrayTemplate.length;
      this.policy = asPrependPrefixArrayTemplate.policy;
      this.specificPrefixes = asPrependPrefixArrayTemplate.specificPrefixes;
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
     * Builds a AsPrependPrefixArrayTemplate.
     *
     * @return the new AsPrependPrefixArrayTemplate instance
     */
    public AsPrependPrefixArrayTemplate build() {
      return new AsPrependPrefixArrayTemplate(this);
    }

    /**
     * Adds an specificPrefixes to specificPrefixes.
     *
     * @param specificPrefixes the new specificPrefixes
     * @return the AsPrependPrefixArrayTemplate builder
     */
    public Builder addSpecificPrefixes(String specificPrefixes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(specificPrefixes,
        "specificPrefixes cannot be null");
      if (this.specificPrefixes == null) {
        this.specificPrefixes = new ArrayList<String>();
      }
      this.specificPrefixes.add(specificPrefixes);
      return this;
    }

    /**
     * Set the length.
     *
     * @param length the length
     * @return the AsPrependPrefixArrayTemplate builder
     */
    public Builder length(long length) {
      this.length = length;
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the AsPrependPrefixArrayTemplate builder
     */
    public Builder policy(String policy) {
      this.policy = policy;
      return this;
    }

    /**
     * Set the specificPrefixes.
     * Existing specificPrefixes will be replaced.
     *
     * @param specificPrefixes the specificPrefixes
     * @return the AsPrependPrefixArrayTemplate builder
     */
    public Builder specificPrefixes(List<String> specificPrefixes) {
      this.specificPrefixes = specificPrefixes;
      return this;
    }
  }

  protected AsPrependPrefixArrayTemplate() { }

  protected AsPrependPrefixArrayTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.length,
      "length cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.policy,
      "policy cannot be null");
    length = builder.length;
    policy = builder.policy;
    specificPrefixes = builder.specificPrefixes;
  }

  /**
   * New builder.
   *
   * @return a AsPrependPrefixArrayTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the length.
   *
   * Number of times the ASN to be prepended to the AS Path.
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
   * Gets the specificPrefixes.
   *
   * Array of prefixes this AS Prepend applies to. If this property is absent, the AS Prepend applies to all prefixes.
   * Note that ordering is not significant and may differ from request order.
   *
   * @return the specificPrefixes
   */
  public List<String> specificPrefixes() {
    return specificPrefixes;
  }
}

