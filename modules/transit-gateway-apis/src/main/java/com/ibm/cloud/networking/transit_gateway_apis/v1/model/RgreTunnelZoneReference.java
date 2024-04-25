/*
 * (C) Copyright IBM Corp. 2024.
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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The tunnel's location.  The specified availability zone must reside in the gateway's region. Use the IBM Cloud global
 * catalog to list zones within the desired region.
 */
public class RgreTunnelZoneReference extends GenericModel {

  protected String name;

  protected RgreTunnelZoneReference() { }

  /**
   * Gets the name.
   *
   * Availability zone name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

