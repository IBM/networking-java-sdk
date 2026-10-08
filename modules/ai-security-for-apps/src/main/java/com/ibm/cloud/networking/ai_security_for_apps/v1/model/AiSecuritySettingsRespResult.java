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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for response information.
 */
public class AiSecuritySettingsRespResult extends GenericModel {

  protected Boolean enabled;

  protected AiSecuritySettingsRespResult() { }

  /**
   * Gets the enabled.
   *
   * Whether AI Security for Apps is enabled on the zone.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }
}

