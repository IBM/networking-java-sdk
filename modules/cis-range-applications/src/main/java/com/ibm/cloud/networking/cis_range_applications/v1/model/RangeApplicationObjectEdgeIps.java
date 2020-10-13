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
 * Configures IP version for the hostname of this application.
 */
public class RangeApplicationObjectEdgeIps extends GenericModel {

  /**
   * The type of edge IP configuration.
   */
  public interface Type {
    /** dynamic. */
    String DYNAMIC = "dynamic";
  }

  /**
   * Specifies the IP version (or all).
   */
  public interface Connectivity {
    /** ipv4. */
    String IPV4 = "ipv4";
    /** ipv6. */
    String IPV6 = "ipv6";
    /** all. */
    String ALL = "all";
  }

  protected String type;
  protected String connectivity;

  /**
   * Gets the type.
   *
   * The type of edge IP configuration.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the connectivity.
   *
   * Specifies the IP version (or all).
   *
   * @return the connectivity
   */
  public String getConnectivity() {
    return connectivity;
  }
}

