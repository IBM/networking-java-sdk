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
package com.ibm.cloud.networking.zones.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * zone details.
 */
public class ZoneDetails extends GenericModel {

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  protected String name;
  @SerializedName("original_registrar")
  protected String originalRegistrar;
  @SerializedName("original_dnshost")
  protected String originalDnshost;
  protected String status;
  protected Boolean paused;
  @SerializedName("original_name_servers")
  protected List<String> originalNameServers;
  @SerializedName("name_servers")
  protected List<String> nameServers;

  /**
   * Gets the id.
   *
   * id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * created date.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * modified date.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the name.
   *
   * name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the originalRegistrar.
   *
   * original registrar.
   *
   * @return the originalRegistrar
   */
  public String getOriginalRegistrar() {
    return originalRegistrar;
  }

  /**
   * Gets the originalDnshost.
   *
   * orginal dns host.
   *
   * @return the originalDnshost
   */
  public String getOriginalDnshost() {
    return originalDnshost;
  }

  /**
   * Gets the status.
   *
   * status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the paused.
   *
   * paused.
   *
   * @return the paused
   */
  public Boolean isPaused() {
    return paused;
  }

  /**
   * Gets the originalNameServers.
   *
   * orginal name servers.
   *
   * @return the originalNameServers
   */
  public List<String> getOriginalNameServers() {
    return originalNameServers;
  }

  /**
   * Gets the nameServers.
   *
   * name servers.
   *
   * @return the nameServers
   */
  public List<String> getNameServers() {
    return nameServers;
  }
}

