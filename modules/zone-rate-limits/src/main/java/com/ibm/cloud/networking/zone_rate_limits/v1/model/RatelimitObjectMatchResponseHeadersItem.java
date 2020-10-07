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
 * RatelimitObjectMatchResponseHeadersItem.
 */
public class RatelimitObjectMatchResponseHeadersItem extends GenericModel {

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
   * Gets the name.
   *
   * The name of the response header to match.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the op.
   *
   * The operator when matchin, eq means equals, ne means not equals.
   *
   * @return the op
   */
  public String getOp() {
    return op;
  }

  /**
   * Gets the value.
   *
   * The value of the header, which will be exactly matched.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

