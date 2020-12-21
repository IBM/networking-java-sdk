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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Resource record details.
 */
public class ResourceRecord extends GenericModel {

  /**
   * Type of the resource record.
   */
  public interface Type {
    /** A. */
    String A = "A";
    /** AAAA. */
    String AAAA = "AAAA";
    /** CNAME. */
    String CNAME = "CNAME";
    /** MX. */
    String MX = "MX";
    /** SRV. */
    String SRV = "SRV";
    /** TXT. */
    String TXT = "TXT";
    /** PTR. */
    String PTR = "PTR";
  }

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  protected String name;
  protected String type;
  protected Long ttl;
  protected Map<String, Object> rdata;
  protected String service;
  protected String protocol;

  /**
   * Gets the id.
   *
   * Identifier of the resource record.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * the time when a resource record is created.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * the recent time when a resource record is modified.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the name.
   *
   * Name of the resource record.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Type of the resource record.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the ttl.
   *
   * Time to live in second.
   *
   * @return the ttl
   */
  public Long getTtl() {
    return ttl;
  }

  /**
   * Gets the rdata.
   *
   * Content of the resource record.
   *
   * @return the rdata
   */
  public Map<String, Object> getRdata() {
    return rdata;
  }

  /**
   * Gets the service.
   *
   * Only used for SRV record.
   *
   * @return the service
   */
  public String getService() {
    return service;
  }

  /**
   * Gets the protocol.
   *
   * Only used for SRV record.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }
}

