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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RecordsImportErrorModelError.
 */
public class RecordsImportErrorModelError extends GenericModel {

  protected String code;
  protected String message;

  /**
   * Gets the code.
   *
   * Internal service error when DNS resource created fails by internal error.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An internal error occurred. Try again later.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}

