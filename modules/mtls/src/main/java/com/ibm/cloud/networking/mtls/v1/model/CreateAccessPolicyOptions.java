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
package com.ibm.cloud.networking.mtls.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createAccessPolicy options.
 */
public class CreateAccessPolicyOptions extends GenericModel {

  /**
   * Defines the action Access takes if the policy matches the user.
   */
  public interface Decision {
    /** non_identity. */
    String NON_IDENTITY = "non_identity";
  }

  protected String zoneId;
  protected String appId;
  protected String name;
  protected String decision;
  protected List<PolicyRule> include;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String appId;
    private String name;
    private String decision;
    private List<PolicyRule> include;

    /**
     * Instantiates a new Builder from an existing CreateAccessPolicyOptions instance.
     *
     * @param createAccessPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateAccessPolicyOptions createAccessPolicyOptions) {
      this.zoneId = createAccessPolicyOptions.zoneId;
      this.appId = createAccessPolicyOptions.appId;
      this.name = createAccessPolicyOptions.name;
      this.decision = createAccessPolicyOptions.decision;
      this.include = createAccessPolicyOptions.include;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zoneId the zoneId
     * @param appId the appId
     */
    public Builder(String zoneId, String appId) {
      this.zoneId = zoneId;
      this.appId = appId;
    }

    /**
     * Builds a CreateAccessPolicyOptions.
     *
     * @return the new CreateAccessPolicyOptions instance
     */
    public CreateAccessPolicyOptions build() {
      return new CreateAccessPolicyOptions(this);
    }

    /**
     * Adds an include to include.
     *
     * @param include the new include
     * @return the CreateAccessPolicyOptions builder
     */
    public Builder addInclude(PolicyRule include) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(include,
        "include cannot be null");
      if (this.include == null) {
        this.include = new ArrayList<PolicyRule>();
      }
      this.include.add(include);
      return this;
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the CreateAccessPolicyOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the appId.
     *
     * @param appId the appId
     * @return the CreateAccessPolicyOptions builder
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateAccessPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the decision.
     *
     * @param decision the decision
     * @return the CreateAccessPolicyOptions builder
     */
    public Builder decision(String decision) {
      this.decision = decision;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the CreateAccessPolicyOptions builder
     */
    public Builder include(List<PolicyRule> include) {
      this.include = include;
      return this;
    }
  }

  protected CreateAccessPolicyOptions() { }

  protected CreateAccessPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.appId,
      "appId cannot be empty");
    zoneId = builder.zoneId;
    appId = builder.appId;
    name = builder.name;
    decision = builder.decision;
    include = builder.include;
  }

  /**
   * New builder.
   *
   * @return a CreateAccessPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zoneId.
   *
   * Zone ID.
   *
   * @return the zoneId
   */
  public String zoneId() {
    return zoneId;
  }

  /**
   * Gets the appId.
   *
   * Access application ID.
   *
   * @return the appId
   */
  public String appId() {
    return appId;
  }

  /**
   * Gets the name.
   *
   * Policy name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the decision.
   *
   * Defines the action Access takes if the policy matches the user.
   *
   * @return the decision
   */
  public String decision() {
    return decision;
  }

  /**
   * Gets the include.
   *
   * The include policy works like an OR logical operator. The user must satisfy one of the rules in includes.
   *
   * @return the include
   */
  public List<PolicyRule> include() {
    return include;
  }
}

