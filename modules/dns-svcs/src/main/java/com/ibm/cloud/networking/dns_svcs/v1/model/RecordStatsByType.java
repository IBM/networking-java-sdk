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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Number of records classified by type.
 */
public class RecordStatsByType extends GenericModel {

  @SerializedName("A")
  protected Long a;
  @SerializedName("AAAA")
  protected Long aaaa;
  @SerializedName("CNAME")
  protected Long cname;
  @SerializedName("SRV")
  protected Long srv;
  @SerializedName("TXT")
  protected Long txt;
  @SerializedName("MX")
  protected Long mx;
  @SerializedName("PTR")
  protected Long ptr;

  protected RecordStatsByType() { }

  /**
   * Gets the a.
   *
   * Number of records, type A.
   *
   * @return the a
   */
  public Long getA() {
    return a;
  }

  /**
   * Gets the aaaa.
   *
   * Number of records, type AAAA.
   *
   * @return the aaaa
   */
  public Long getAaaa() {
    return aaaa;
  }

  /**
   * Gets the cname.
   *
   * Number of records, type CNAME.
   *
   * @return the cname
   */
  public Long getCname() {
    return cname;
  }

  /**
   * Gets the srv.
   *
   * Number of records, type SRV.
   *
   * @return the srv
   */
  public Long getSrv() {
    return srv;
  }

  /**
   * Gets the txt.
   *
   * Number of records, type TXT.
   *
   * @return the txt
   */
  public Long getTxt() {
    return txt;
  }

  /**
   * Gets the mx.
   *
   * Number of records, type MX.
   *
   * @return the mx
   */
  public Long getMx() {
    return mx;
  }

  /**
   * Gets the ptr.
   *
   * Number of records, type PTR.
   *
   * @return the ptr
   */
  public Long getPtr() {
    return ptr;
  }
}

