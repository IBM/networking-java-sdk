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
package com.ibm.cloud.networking.direct_link.v1.model;

/**
 * overlapping route details.
 */
public class RouteReportOverlappingRouteForOthers extends RouteReportOverlappingRoute {

  /**
   * type of the route.
   */
  public interface Type {
    /** gateway. */
    String GATEWAY = "gateway";
    /** on_prem. */
    String ON_PREM = "on_prem";
  }


  protected RouteReportOverlappingRouteForOthers() { }
}

