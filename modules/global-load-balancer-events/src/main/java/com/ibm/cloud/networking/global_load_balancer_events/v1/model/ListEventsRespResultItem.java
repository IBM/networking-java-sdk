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
package com.ibm.cloud.networking.global_load_balancer_events.v1.model;

import java.util.Date;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ListEventsRespResultItem.
 */
public class ListEventsRespResultItem extends GenericModel {

  protected String id;
  protected Date timestamp;
  protected List<ListEventsRespResultItemPoolItem> pool;
  protected List<ListEventsRespResultItemOriginsItem> origins;

  /**
   * Gets the id.
   *
   * ID of the event.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the timestamp.
   *
   * Time of the event.
   *
   * @return the timestamp
   */
  public Date getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the pool.
   *
   * Pool information.
   *
   * @return the pool
   */
  public List<ListEventsRespResultItemPoolItem> getPool() {
    return pool;
  }

  /**
   * Gets the origins.
   *
   * Load balancer origins.
   *
   * @return the origins
   */
  public List<ListEventsRespResultItemOriginsItem> getOrigins() {
    return origins;
  }
}

