/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createCustomLists options.
 */
public class CreateCustomListsOptions extends GenericModel {

  /**
   * The type of list. Each type supports specific list items (IP addresses, ASNs, hostnames or redirects).
   */
  public interface Kind {
    /** ip. */
    String IP = "ip";
    /** redirect. */
    String REDIRECT = "redirect";
    /** hostname. */
    String HOSTNAME = "hostname";
    /** asn. */
    String ASN = "asn";
  }

  protected String kind;
  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String kind;
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateCustomListsOptions instance.
     *
     * @param createCustomListsOptions the instance to initialize the Builder with
     */
    private Builder(CreateCustomListsOptions createCustomListsOptions) {
      this.kind = createCustomListsOptions.kind;
      this.name = createCustomListsOptions.name;
      this.description = createCustomListsOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateCustomListsOptions.
     *
     * @return the new CreateCustomListsOptions instance
     */
    public CreateCustomListsOptions build() {
      return new CreateCustomListsOptions(this);
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the CreateCustomListsOptions builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateCustomListsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateCustomListsOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateCustomListsOptions() { }

  protected CreateCustomListsOptions(Builder builder) {
    kind = builder.kind;
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateCustomListsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the kind.
   *
   * The type of list. Each type supports specific list items (IP addresses, ASNs, hostnames or redirects).
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the name.
   *
   * An informative name for the list. Use this name in rule expressions.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * An informative summary of the list.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

