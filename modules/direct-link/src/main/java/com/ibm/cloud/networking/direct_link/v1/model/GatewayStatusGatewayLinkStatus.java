/*
 * (C) Copyright IBM Corp. 2021.
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
 * Gateway link status. Only available for dedicated gateways.
 */
public class GatewayStatusGatewayLinkStatus extends GatewayStatus {

  /**
   * Status type.
   */
  public interface Type {
    /** link. */
    String LINK = "link";
  }

  /**
   * Status.
   */
  public interface Value {
    /** up. */
    String UP = "up";
    /** down. */
    String DOWN = "down";
  }

}

