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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Content of the resource record.
 *
 * Classes which extend this class:
 * - ResourceRecordUpdateInputRdataRdataARecord
 * - ResourceRecordUpdateInputRdataRdataAaaaRecord
 * - ResourceRecordUpdateInputRdataRdataCnameRecord
 * - ResourceRecordUpdateInputRdataRdataMxRecord
 * - ResourceRecordUpdateInputRdataRdataSrvRecord
 * - ResourceRecordUpdateInputRdataRdataTxtRecord
 * - ResourceRecordUpdateInputRdataRdataPtrRecord
 */
public class ResourceRecordUpdateInputRdata extends GenericModel {

  protected String ip;
  protected String cname;
  protected String exchange;
  protected Long preference;
  protected Long port;
  protected Long priority;
  protected String target;
  protected Long weight;
  protected String text;
  protected String ptrdname;

  protected ResourceRecordUpdateInputRdata() {
  }

  /**
   * Gets the ip.
   *
   * IPv4 address.
   *
   * @return the ip
   */
  public String ip() {
    return ip;
  }

  /**
   * Gets the cname.
   *
   * Canonical name.
   *
   * @return the cname
   */
  public String cname() {
    return cname;
  }

  /**
   * Gets the exchange.
   *
   * Hostname of Exchange server.
   *
   * @return the exchange
   */
  public String exchange() {
    return exchange;
  }

  /**
   * Gets the preference.
   *
   * Preference of the MX record.
   *
   * @return the preference
   */
  public Long preference() {
    return preference;
  }

  /**
   * Gets the port.
   *
   * Port number of the target server.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the priority.
   *
   * Priority of the SRV record.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the target.
   *
   * Hostname of the target server.
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the weight.
   *
   * Weight of distributing queries among multiple target servers.
   *
   * @return the weight
   */
  public Long weight() {
    return weight;
  }

  /**
   * Gets the text.
   *
   * Human readable text.
   *
   * @return the text
   */
  public String text() {
    return text;
  }

  /**
   * Gets the ptrdname.
   *
   * Hostname of the relevant A or AAAA record.
   *
   * @return the ptrdname
   */
  public String ptrdname() {
    return ptrdname;
  }
}

