/*
 * (C) Copyright IBM Corp. 2024.
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
package com.ibm.cloud.networking.direct_link_provider.v2.model;

import com.ibm.cloud.networking.direct_link_provider.v2.DirectLinkProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * ProviderGatewaysPager can be used to simplify the use of the "listProviderGateways" method.
 */
public class ProviderGatewaysPager {
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
  protected ListProviderGatewaysOptions options;
  protected DirectLinkProvider client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected ProviderGatewaysPager() { }

  /**
   * Constructs a new ProviderGatewaysPager instance with the specified client and options model instance.
   * @param client the DirectLinkProvider instance to be used to invoke the "listProviderGateways" method
   * @param options the ListProviderGatewaysOptions instance to be used to invoke the "listProviderGateways" method
   */
  public ProviderGatewaysPager(DirectLinkProvider client, ListProviderGatewaysOptions options) {
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
   * @return a List&lt;ProviderGateway&gt; that contains the next page of results
   */
  public List<ProviderGateway> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListProviderGatewaysOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.start(this.pageContext.getNext());
    }
    this.options = builder.build();

    ProviderGatewayCollection result = client.listProviderGateways(options).execute().getResult();

    String next = null;
    if (result.getNext() != null) {
      next = result.getNext().getStart();
    }
    this.pageContext.setNext(next);
    if (next == null) {
      this.hasNext = false;
    }

    return result.getGateways();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;ProviderGateway&gt; containing all results returned by the "listProviderGateways" method
   */
  public List<ProviderGateway> getAll() {
    List<ProviderGateway> results = new ArrayList<>();
    while (hasNext()) {
      List<ProviderGateway> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
