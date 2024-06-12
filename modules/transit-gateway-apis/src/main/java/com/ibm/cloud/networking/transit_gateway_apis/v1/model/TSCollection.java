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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A list of Transit Gateway locations.
 */
public class TSCollection extends GenericModel {

  protected List<TSLocationBasic> locations;

  protected TSCollection() { }

  /**
   * Gets the locations.
   *
   * Collection of Transit Gateway locations.
   *
   * @return the locations
   */
  public List<TSLocationBasic> getLocations() {
    return locations;
  }
}

