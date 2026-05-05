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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.114.0-a902401e-20260427-192904
 */

package com.ibm.cloud.networking.lists_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.lists_api.v1.model.CreateCustomListsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.CreateListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.CustomListResp;
import com.ibm.cloud.networking.lists_api.v1.model.CustomListsResp;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteResourceResp;
import com.ibm.cloud.networking.lists_api.v1.model.GetCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetCustomListsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetListItemOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetManagedListsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetOperationStatusOptions;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemsResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListOperationResp;
import com.ibm.cloud.networking.lists_api.v1.model.ManagedListsResp;
import com.ibm.cloud.networking.lists_api.v1.model.OperationStatusResp;
import com.ibm.cloud.networking.lists_api.v1.model.UpdateCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.UpdateListItemsOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * CIS Lists.
 *
 * API Version: 1.0.0
 */
public class ListsApi extends BaseService {

  /**
   * Default service name used when configuring the `ListsApi` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "lists_api";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String itemId;

  private String listId;

  private String operationId;

 /**
   * Class method which constructs an instance of the `ListsApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full URL-encoded CRN of the service instance.
   * @param itemId List item identifier.
   * @param listId List identifier.
   * @param operationId List operation identifier.
   * @return an instance of the `ListsApi` client using external configuration
   */
  public static ListsApi newInstance(String crn, String itemId, String listId, String operationId) {
    return newInstance(crn, itemId, listId, operationId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `ListsApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full URL-encoded CRN of the service instance.
   * @param itemId List item identifier.
   * @param listId List identifier.
   * @param operationId List operation identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `ListsApi` client using external configuration
   */
  public static ListsApi newInstance(String crn, String itemId, String listId, String operationId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    ListsApi service = new ListsApi(crn, itemId, listId, operationId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `ListsApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full URL-encoded CRN of the service instance.
   * @param itemId List item identifier.
   * @param listId List identifier.
   * @param operationId List operation identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public ListsApi(String crn, String itemId, String listId, String operationId, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setItemId(itemId);
    setListId(listId);
    setOperationId(operationId);
  }

  /**
   * Gets the crn.
   *
   * Full URL-encoded CRN of the service instance.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Sets the crn.
   *
   * @param crn the new crn
   */
  public void setCrn(final String crn) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(crn, "crn cannot be empty.");
    this.crn = crn;
  }

  /**
   * Gets the itemId.
   *
   * List item identifier.
   *
   * @return the itemId
   */
  public String getItemId() {
    return this.itemId;
  }

  /**
   * Sets the itemId.
   *
   * @param itemId the new itemId
   */
  public void setItemId(final String itemId) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(itemId, "itemId cannot be empty.");
    this.itemId = itemId;
  }

  /**
   * Gets the listId.
   *
   * List identifier.
   *
   * @return the listId
   */
  public String getListId() {
    return this.listId;
  }

  /**
   * Sets the listId.
   *
   * @param listId the new listId
   */
  public void setListId(final String listId) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(listId, "listId cannot be empty.");
    this.listId = listId;
  }

  /**
   * Gets the operationId.
   *
   * List operation identifier.
   *
   * @return the operationId
   */
  public String getOperationId() {
    return this.operationId;
  }

  /**
   * Sets the operationId.
   *
   * @param operationId the new operationId
   */
  public void setOperationId(final String operationId) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(operationId, "operationId cannot be empty.");
    this.operationId = operationId;
  }

  /**
   * List Managed Lists.
   *
   * List available managed lists for your instance.
   *
   * @param getManagedListsOptions the {@link GetManagedListsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ManagedListsResp}
   */
  public ServiceCall<ManagedListsResp> getManagedLists(GetManagedListsOptions getManagedListsOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/managed_lists", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "getManagedLists");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ManagedListsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ManagedListsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Managed Lists.
   *
   * List available managed lists for your instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ManagedListsResp}
   */
  public ServiceCall<ManagedListsResp> getManagedLists() {
    return getManagedLists(null);
  }

  /**
   * List Custom Lists.
   *
   * List the custom lists for your instance.
   *
   * @param getCustomListsOptions the {@link GetCustomListsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomListsResp}
   */
  public ServiceCall<CustomListsResp> getCustomLists(GetCustomListsOptions getCustomListsOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "getCustomLists");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CustomListsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomListsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Custom Lists.
   *
   * List the custom lists for your instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link CustomListsResp}
   */
  public ServiceCall<CustomListsResp> getCustomLists() {
    return getCustomLists(null);
  }

  /**
   * Create Custom List.
   *
   * Create a custom list for your instance.
   *
   * @param createCustomListsOptions the {@link CreateCustomListsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomListResp}
   */
  public ServiceCall<CustomListResp> createCustomLists(CreateCustomListsOptions createCustomListsOptions) {
    boolean skipBody = false;
    if (createCustomListsOptions == null) {
      createCustomListsOptions = new CreateCustomListsOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "createCustomLists");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createCustomListsOptions.kind() != null) {
        contentJson.addProperty("kind", createCustomListsOptions.kind());
      }
      if (createCustomListsOptions.name() != null) {
        contentJson.addProperty("name", createCustomListsOptions.name());
      }
      if (createCustomListsOptions.description() != null) {
        contentJson.addProperty("description", createCustomListsOptions.description());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<CustomListResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomListResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create Custom List.
   *
   * Create a custom list for your instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link CustomListResp}
   */
  public ServiceCall<CustomListResp> createCustomLists() {
    return createCustomLists(null);
  }

  /**
   * Get Custom List.
   *
   * Get a custom list for your instance.
   *
   * @param getCustomListOptions the {@link GetCustomListOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomListResp}
   */
  public ServiceCall<CustomListResp> getCustomList(GetCustomListOptions getCustomListOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "getCustomList");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CustomListResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomListResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Custom List.
   *
   * Get a custom list for your instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link CustomListResp}
   */
  public ServiceCall<CustomListResp> getCustomList() {
    return getCustomList(null);
  }

  /**
   * Update Custom List.
   *
   * Update the description of a custom list.
   *
   * @param updateCustomListOptions the {@link UpdateCustomListOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomListResp}
   */
  public ServiceCall<CustomListResp> updateCustomList(UpdateCustomListOptions updateCustomListOptions) {
    boolean skipBody = false;
    if (updateCustomListOptions == null) {
      updateCustomListOptions = new UpdateCustomListOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "updateCustomList");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateCustomListOptions.description() != null) {
        contentJson.addProperty("description", updateCustomListOptions.description());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<CustomListResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomListResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update Custom List.
   *
   * Update the description of a custom list.
   *
   * @return a {@link ServiceCall} with a result of type {@link CustomListResp}
   */
  public ServiceCall<CustomListResp> updateCustomList() {
    return updateCustomList(null);
  }

  /**
   * Delete Custom List.
   *
   * Delete a custom list for your instance.
   *
   * @param deleteCustomListOptions the {@link DeleteCustomListOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteResourceResp}
   */
  public ServiceCall<DeleteResourceResp> deleteCustomList(DeleteCustomListOptions deleteCustomListOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "deleteCustomList");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteResourceResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteResourceResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Custom List.
   *
   * Delete a custom list for your instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link DeleteResourceResp}
   */
  public ServiceCall<DeleteResourceResp> deleteCustomList() {
    return deleteCustomList(null);
  }

  /**
   * Get List Items.
   *
   * Get the list items for a custom list.
   *
   * @param getListItemsOptions the {@link GetListItemsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListItemsResp}
   */
  public ServiceCall<ListItemsResp> getListItems(GetListItemsOptions getListItemsOptions) {
    if (getListItemsOptions == null) {
      getListItemsOptions = new GetListItemsOptions.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}/items", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "getListItems");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getListItemsOptions.cursor() != null) {
      builder.query("cursor", String.valueOf(getListItemsOptions.cursor()));
    }
    if (getListItemsOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(getListItemsOptions.perPage()));
    }
    if (getListItemsOptions.search() != null) {
      builder.query("search", String.valueOf(getListItemsOptions.search()));
    }
    ResponseConverter<ListItemsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListItemsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get List Items.
   *
   * Get the list items for a custom list.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListItemsResp}
   */
  public ServiceCall<ListItemsResp> getListItems() {
    return getListItems(null);
  }

  /**
   * Create List Items.
   *
   * Create list items for your custom list. This operation is asynchronous. To get current the operation status, use
   * the get operation status API.
   *
   * @param createListItemsOptions the {@link CreateListItemsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListOperationResp}
   */
  public ServiceCall<ListOperationResp> createListItems(CreateListItemsOptions createListItemsOptions) {
    if (createListItemsOptions == null) {
      createListItemsOptions = new CreateListItemsOptions.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}/items", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "createListItems");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createListItemsOptions.createListItemsReqItem() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createListItemsOptions.createListItemsReqItem()), "application/json");
    }
    ResponseConverter<ListOperationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListOperationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create List Items.
   *
   * Create list items for your custom list. This operation is asynchronous. To get current the operation status, use
   * the get operation status API.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListOperationResp}
   */
  public ServiceCall<ListOperationResp> createListItems() {
    return createListItems(null);
  }

  /**
   * Delete List Items.
   *
   * Remove one or more list items from your custom list. This operation is asynchronous. To get current the operation
   * status, use the get operation status API.
   *
   * @param deleteListItemsOptions the {@link DeleteListItemsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListOperationResp}
   */
  public ServiceCall<ListOperationResp> deleteListItems(DeleteListItemsOptions deleteListItemsOptions) {
    boolean skipBody = false;
    if (deleteListItemsOptions == null) {
      deleteListItemsOptions = new DeleteListItemsOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}/items", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "deleteListItems");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (deleteListItemsOptions.items() != null) {
        contentJson.add("items", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteListItemsOptions.items()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ListOperationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListOperationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete List Items.
   *
   * Remove one or more list items from your custom list. This operation is asynchronous. To get current the operation
   * status, use the get operation status API.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListOperationResp}
   */
  public ServiceCall<ListOperationResp> deleteListItems() {
    return deleteListItems(null);
  }

  /**
   * Update All List Items.
   *
   * Update all list items for your custom list. This removes existing items from the list. This operation is
   * asynchronous. To get current the operation status, use the get operation status API.
   *
   * @param updateListItemsOptions the {@link UpdateListItemsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListOperationResp}
   */
  public ServiceCall<ListOperationResp> updateListItems(UpdateListItemsOptions updateListItemsOptions) {
    if (updateListItemsOptions == null) {
      updateListItemsOptions = new UpdateListItemsOptions.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}/items", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "updateListItems");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateListItemsOptions.createListItemsReqItem() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateListItemsOptions.createListItemsReqItem()), "application/json");
    }
    ResponseConverter<ListOperationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListOperationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update All List Items.
   *
   * Update all list items for your custom list. This removes existing items from the list. This operation is
   * asynchronous. To get current the operation status, use the get operation status API.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListOperationResp}
   */
  public ServiceCall<ListOperationResp> updateListItems() {
    return updateListItems(null);
  }

  /**
   * Get List Item.
   *
   * Get a specific list item.
   *
   * @param getListItemOptions the {@link GetListItemOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListItemResp}
   */
  public ServiceCall<ListItemResp> getListItem(GetListItemOptions getListItemOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("list_id", this.listId);
    pathParamsMap.put("item_id", this.itemId);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/{list_id}/items/{item_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "getListItem");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListItemResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListItemResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get List Item.
   *
   * Get a specific list item.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListItemResp}
   */
  public ServiceCall<ListItemResp> getListItem() {
    return getListItem(null);
  }

  /**
   * Get List Operation Status.
   *
   * Get the operation status for a custom list operation.
   *
   * @param getOperationStatusOptions the {@link GetOperationStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OperationStatusResp}
   */
  public ServiceCall<OperationStatusResp> getOperationStatus(GetOperationStatusOptions getOperationStatusOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("operation_id", this.operationId);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rules/lists/bulk_operations/{operation_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("lists_api", "v1", "getOperationStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<OperationStatusResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OperationStatusResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get List Operation Status.
   *
   * Get the operation status for a custom list operation.
   *
   * @return a {@link ServiceCall} with a result of type {@link OperationStatusResp}
   */
  public ServiceCall<OperationStatusResp> getOperationStatus() {
    return getOperationStatus(null);
  }

}
