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
package com.ibm.cloud.networking.cis_range_applications.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * range application response.
 */
public class RangeApplicationResp extends GenericModel {

  protected Boolean success;
  protected List<List<String>> errors;
  protected List<List<String>> messages;
  protected RangeApplicationObject result;

  /**
   * Gets the success.
   *
   * Was the get successful.
   *
   * @return the success
   */
  public Boolean isSuccess() {
    return success;
  }

  /**
   * Gets the errors.
   *
   * errors.
   *
   * @return the errors
   */
  public List<List<String>> getErrors() {
    return errors;
  }

  /**
   * Gets the messages.
   *
   * messages.
   *
   * @return the messages
   */
  public List<List<String>> getMessages() {
    return messages;
  }

  /**
   * Gets the result.
   *
   * range application object.
   *
   * @return the result
   */
  public RangeApplicationObject getResult() {
    return result;
  }
}

