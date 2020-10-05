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
package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RatelimitInputMatchResponseHeadersItem.
 */
public class RatelimitInputMatchResponseHeadersItem extends GenericModel {

  /**
   * The operator when matchin, eq means equals, ne means not equals.
   */
  public interface Op {
    /** eq. */
    String EQ = "eq";
    /** ne. */
    String NE = "ne";
  }

  /**
   * The value of the header, which will be exactly matched.
   */
  public interface Value {
    /** HIT. */
    String HIT = "HIT";
  }

  protected String name;
  protected String op;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String op;
    private String value;

    private Builder(RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItem) {
      this.name = ratelimitInputMatchResponseHeadersItem.name;
      this.op = ratelimitInputMatchResponseHeadersItem.op;
      this.value = ratelimitInputMatchResponseHeadersItem.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param op the op
     * @param value the value
     */
    public Builder(String name, String op, String value) {
      this.name = name;
      this.op = op;
      this.value = value;
    }

    /**
     * Builds a RatelimitInputMatchResponseHeadersItem.
     *
     * @return the new RatelimitInputMatchResponseHeadersItem instance
     */
    public RatelimitInputMatchResponseHeadersItem build() {
      return new RatelimitInputMatchResponseHeadersItem(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RatelimitInputMatchResponseHeadersItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the op.
     *
     * @param op the op
     * @return the RatelimitInputMatchResponseHeadersItem builder
     */
    public Builder op(String op) {
      this.op = op;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the RatelimitInputMatchResponseHeadersItem builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected RatelimitInputMatchResponseHeadersItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.op,
      "op cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    name = builder.name;
    op = builder.op;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputMatchResponseHeadersItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the response header to match.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the op.
   *
   * The operator when matchin, eq means equals, ne means not equals.
   *
   * @return the op
   */
  public String op() {
    return op;
  }

  /**
   * Gets the value.
   *
   * The value of the header, which will be exactly matched.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

