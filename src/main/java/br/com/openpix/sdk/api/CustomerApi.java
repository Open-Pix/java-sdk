/*
 * Woovi
 * A Woovi é uma Plataforma de Gestão de Pagamentos. Para utilizar nossa API você deve acessar  __[https://api.woovi.com/](https://api.woovi.com/)__ e somente o mesmo. A Woovi não aceita subdominios para a API.  Veja como configurar seu acesso a nossa API [aqui](https://developers.woovi.com/docs/apis/api-getting-started).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package br.com.openpix.sdk.api;

import br.com.openpix.sdk.ApiCallback;
import br.com.openpix.sdk.ApiClient;
import br.com.openpix.sdk.ApiException;
import br.com.openpix.sdk.ApiResponse;
import br.com.openpix.sdk.Configuration;
import br.com.openpix.sdk.Pair;
import br.com.openpix.sdk.ProgressRequestBody;
import br.com.openpix.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import br.com.openpix.sdk.model.ApiV1AccountAccountIdGet400Response;
import br.com.openpix.sdk.model.ApiV1CustomerGet200Response;
import br.com.openpix.sdk.model.ApiV1CustomerIdGet200Response;
import br.com.openpix.sdk.model.ApiV1CustomerPost200Response;
import br.com.openpix.sdk.model.CustomerPayload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for apiV1CustomerGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of customers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1CustomerGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/customer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AppID" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1CustomerGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return apiV1CustomerGetCall(_callback);

    }

    /**
     * Get a list of customers
     * 
     * @return ApiV1CustomerGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of customers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1CustomerGet200Response apiV1CustomerGet() throws ApiException {
        ApiResponse<ApiV1CustomerGet200Response> localVarResp = apiV1CustomerGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get a list of customers
     * 
     * @return ApiResponse&lt;ApiV1CustomerGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of customers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1CustomerGet200Response> apiV1CustomerGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = apiV1CustomerGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ApiV1CustomerGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of customers (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of customers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1CustomerGetAsync(final ApiCallback<ApiV1CustomerGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1CustomerGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ApiV1CustomerGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1CustomerIdGet
     * @param id correlation ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The customer retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1CustomerIdGetCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/customer/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AppID" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1CustomerIdGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV1CustomerIdGet(Async)");
        }

        return apiV1CustomerIdGetCall(id, _callback);

    }

    /**
     * Get one customer
     * 
     * @param id correlation ID (required)
     * @return ApiV1CustomerIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The customer retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1CustomerIdGet200Response apiV1CustomerIdGet(String id) throws ApiException {
        ApiResponse<ApiV1CustomerIdGet200Response> localVarResp = apiV1CustomerIdGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get one customer
     * 
     * @param id correlation ID (required)
     * @return ApiResponse&lt;ApiV1CustomerIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The customer retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1CustomerIdGet200Response> apiV1CustomerIdGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = apiV1CustomerIdGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ApiV1CustomerIdGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get one customer (asynchronously)
     * 
     * @param id correlation ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The customer retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1CustomerIdGetAsync(String id, final ApiCallback<ApiV1CustomerIdGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1CustomerIdGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ApiV1CustomerIdGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1CustomerPost
     * @param customerPayload Data to create a new customer (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1CustomerPostCall(CustomerPayload customerPayload, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = customerPayload;

        // create path and map variables
        String localVarPath = "/api/v1/customer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AppID" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1CustomerPostValidateBeforeCall(CustomerPayload customerPayload, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerPayload' is set
        if (customerPayload == null) {
            throw new ApiException("Missing the required parameter 'customerPayload' when calling apiV1CustomerPost(Async)");
        }

        return apiV1CustomerPostCall(customerPayload, _callback);

    }

    /**
     * Create a new Customer
     * Endpoint to create a new Customer
     * @param customerPayload Data to create a new customer (required)
     * @return ApiV1CustomerPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1CustomerPost200Response apiV1CustomerPost(CustomerPayload customerPayload) throws ApiException {
        ApiResponse<ApiV1CustomerPost200Response> localVarResp = apiV1CustomerPostWithHttpInfo(customerPayload);
        return localVarResp.getData();
    }

    /**
     * Create a new Customer
     * Endpoint to create a new Customer
     * @param customerPayload Data to create a new customer (required)
     * @return ApiResponse&lt;ApiV1CustomerPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1CustomerPost200Response> apiV1CustomerPostWithHttpInfo(CustomerPayload customerPayload) throws ApiException {
        okhttp3.Call localVarCall = apiV1CustomerPostValidateBeforeCall(customerPayload, null);
        Type localVarReturnType = new TypeToken<ApiV1CustomerPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Customer (asynchronously)
     * Endpoint to create a new Customer
     * @param customerPayload Data to create a new customer (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1CustomerPostAsync(CustomerPayload customerPayload, final ApiCallback<ApiV1CustomerPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1CustomerPostValidateBeforeCall(customerPayload, _callback);
        Type localVarReturnType = new TypeToken<ApiV1CustomerPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
