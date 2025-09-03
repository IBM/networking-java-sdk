/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Ruleset response.
 */
public class RulesetResp extends GenericModel {

  protected Boolean success;
  protected List<Message> errors;
  protected List<Message> messages;
  protected RulesetDetails result;

  protected RulesetResp() { }

  /**
   * Gets the success.
   *
   * Was operation successful.
   *
   * @return the success
   */
  public Boolean isSuccess() {
    return success;
  }

  /**
   * Gets the errors.
   *
   * Array of errors encountered.
   *
   * @return the errors
   */
  public List<Message> getErrors() {
    return errors;
  }

  /**
   * Gets the messages.
   *
   * Array of messages returned.
   *
   * @return the messages
   */
  public List<Message> getMessages() {
    return messages;
  }

  /**
   * Gets the result.
   *
   * @return the result
   */
  public RulesetDetails getResult() {
    return result;
  }
}

