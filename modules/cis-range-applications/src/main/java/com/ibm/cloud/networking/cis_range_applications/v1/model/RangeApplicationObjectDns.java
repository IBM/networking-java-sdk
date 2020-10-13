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
package com.ibm.cloud.networking.cis_range_applications.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The name and type of DNS record for the Range application.
 */
public class RangeApplicationObjectDns extends GenericModel {

  /**
   * The type of DNS record associated with the application.
   */
  public interface Type {
    /** CNAME. */
    String CNAME = "CNAME";
  }

  protected String type;
  protected String name;

  /**
   * Gets the type.
   *
   * The type of DNS record associated with the application.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the name.
   *
   * The name of the DNS record associated with the application.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

