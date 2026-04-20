/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.dns_records.v1.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * dns record details as returned by the batch API.
 */
public class BatchDnsRecordDetails extends GenericModel {

  /**
   * dns record type.
   */
  public interface Type {
    /** A. */
    String A = "A";
    /** AAAA. */
    String AAAA = "AAAA";
    /** CNAME. */
    String CNAME = "CNAME";
    /** NS. */
    String NS = "NS";
    /** MX. */
    String MX = "MX";
    /** TXT. */
    String TXT = "TXT";
    /** LOC. */
    String LOC = "LOC";
    /** SRV. */
    String SRV = "SRV";
    /** PTR. */
    String PTR = "PTR";
    /** CAA. */
    String CAA = "CAA";
    /** DS. */
    String DS = "DS";
  }

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  protected String name;
  protected String type;
  protected String content;
  protected Boolean proxiable;
  protected Boolean proxied;
  protected Long ttl;
  protected Long priority;
  protected Map<String, Object> data;
  protected Map<String, Object> settings;
  protected Map<String, Object> meta;
  protected String comment;
  protected List<String> tags;

  protected BatchDnsRecordDetails() { }

  /**
   * Gets the id.
   *
   * dns record identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * created on.
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
   * dns record name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * dns record type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the content.
   *
   * dns record content.
   *
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * Gets the proxiable.
   *
   * proxiable.
   *
   * @return the proxiable
   */
  public Boolean isProxiable() {
    return proxiable;
  }

  /**
   * Gets the proxied.
   *
   * proxied.
   *
   * @return the proxied
   */
  public Boolean isProxied() {
    return proxied;
  }

  /**
   * Gets the ttl.
   *
   * dns record ttl value.
   *
   * @return the ttl
   */
  public Long getTtl() {
    return ttl;
  }

  /**
   * Gets the priority.
   *
   * Relevant only to MX type records.
   *
   * @return the priority
   */
  public Long getPriority() {
    return priority;
  }

  /**
   * Gets the data.
   *
   * Data details for the DNS record. Only for LOC, SRV, CAA records.
   *
   * @return the data
   */
  public Map<String, Object> getData() {
    return data;
  }

  /**
   * Gets the settings.
   *
   * DNS record settings.
   *
   * @return the settings
   */
  public Map<String, Object> getSettings() {
    return settings;
  }

  /**
   * Gets the meta.
   *
   * DNS record metadata.
   *
   * @return the meta
   */
  public Map<String, Object> getMeta() {
    return meta;
  }

  /**
   * Gets the comment.
   *
   * Optional comment for the DNS record.
   *
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * Gets the tags.
   *
   * Tags associated with the DNS record.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }
}

