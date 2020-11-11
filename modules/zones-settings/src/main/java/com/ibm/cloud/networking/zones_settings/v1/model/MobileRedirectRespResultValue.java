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
package com.ibm.cloud.networking.zones_settings.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Value.
 */
public class MobileRedirectRespResultValue extends GenericModel {

  protected String status;
  @SerializedName("mobile_subdomain")
  protected String mobileSubdomain;
  @SerializedName("strip_uri")
  protected Boolean stripUri;

  /**
   * Gets the status.
   *
   * Whether or not the mobile redirection is enabled.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the mobileSubdomain.
   *
   * Which subdomain prefix you wish to redirect visitors on mobile devices to.
   *
   * @return the mobileSubdomain
   */
  public String getMobileSubdomain() {
    return mobileSubdomain;
  }

  /**
   * Gets the stripUri.
   *
   * Whether to drop the current page path and redirect to the mobile subdomain URL root or to keep the path and
   * redirect to the same page on the mobile subdomain.
   *
   * @return the stripUri
   */
  public Boolean isStripUri() {
    return stripUri;
  }
}

