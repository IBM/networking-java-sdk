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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Patch virtual connection template.
 */
public class GatewayVirtualConnectionPatchTemplate extends GenericModel {

  /**
   * Status of the virtual connection.  Virtual connections that span IBM Cloud Accounts are created in approval_pending
   * status.  The owner of the target network can accept or reject connection requests by patching status to attached or
   * rejected respectively.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** rejected. */
    String REJECTED = "rejected";
  }

  protected String name;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String status;

    /**
     * Instantiates a new Builder from an existing GatewayVirtualConnectionPatchTemplate instance.
     *
     * @param gatewayVirtualConnectionPatchTemplate the instance to initialize the Builder with
     */
    private Builder(GatewayVirtualConnectionPatchTemplate gatewayVirtualConnectionPatchTemplate) {
      this.name = gatewayVirtualConnectionPatchTemplate.name;
      this.status = gatewayVirtualConnectionPatchTemplate.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayVirtualConnectionPatchTemplate.
     *
     * @return the new GatewayVirtualConnectionPatchTemplate instance
     */
    public GatewayVirtualConnectionPatchTemplate build() {
      return new GatewayVirtualConnectionPatchTemplate(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GatewayVirtualConnectionPatchTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the GatewayVirtualConnectionPatchTemplate builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected GatewayVirtualConnectionPatchTemplate() { }

  protected GatewayVirtualConnectionPatchTemplate(Builder builder) {
    name = builder.name;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a GatewayVirtualConnectionPatchTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this virtual connection.  Virtual connection names are unique within a gateway.  This is
   * the name of the virtual connection itself, the network being connected may have its own name attribute.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the status.
   *
   * Status of the virtual connection.  Virtual connections that span IBM Cloud Accounts are created in approval_pending
   * status.  The owner of the target network can accept or reject connection requests by patching status to attached or
   * rejected respectively.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Construct a JSON merge-patch from the GatewayVirtualConnectionPatchTemplate.
   *
   * Note that properties of the GatewayVirtualConnectionPatchTemplate with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the GatewayVirtualConnectionPatchTemplate
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

