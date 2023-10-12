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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.TransitGatewayApis;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * TransitGatewaysPager can be used to simplify the use of the "listTransitGateways" method.
 */
public class TransitGatewaysPager {
  private static class PageContext {
    private String next;
    public String getNext() {
      return next;
    }
    public void setNext(String next) {
      this.next = next;
    }
  }

  protected boolean hasNext;
  protected ListTransitGatewaysOptions options;
  protected TransitGatewayApis client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected TransitGatewaysPager() { }

  /**
   * Constructs a new TransitGatewaysPager instance with the specified client and options model instance.
   * @param client the TransitGatewayApis instance to be used to invoke the "listTransitGateways" method
   * @param options the ListTransitGatewaysOptions instance to be used to invoke the "listTransitGateways" method
   */
  public TransitGatewaysPager(TransitGatewayApis client, ListTransitGatewaysOptions options) {
    if (options.start() != null) {
      throw new IllegalArgumentException("The options 'start' field should not be set");
    }

    this.hasNext = true;
    this.client = client;
    this.options = options.newBuilder().build();
    this.pageContext = new PageContext();
  }

  /**
   * Returns true if there are more results to be retrieved.
   * @return boolean
   */
  public boolean hasNext() {
    return hasNext;
  }

  /**
   * Returns the next page of results.
   * @return a List&lt;TransitGateway&gt; that contains the next page of results
   */
  public List<TransitGateway> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListTransitGatewaysOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.start(this.pageContext.getNext());
    }
    this.options = builder.build();

    TransitGatewayCollection result = client.listTransitGateways(options).execute().getResult();

    String next = null;
    if (result.getNext() != null) {
      next = result.getNext().getStart();
    }
    this.pageContext.setNext(next);
    if (next == null) {
      this.hasNext = false;
    }

    return result.getTransitGateways();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;TransitGateway&gt; containing all results returned by the "listTransitGateways" method
   */
  public List<TransitGateway> getAll() {
    List<TransitGateway> results = new ArrayList<>();
    while (hasNext()) {
      List<TransitGateway> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
