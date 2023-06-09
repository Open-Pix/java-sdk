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
import br.com.openpix.sdk.model.ApiV1PaymentGet200Response;
import br.com.openpix.sdk.model.ApiV1PaymentIdGet200Response;
import br.com.openpix.sdk.model.ApiV1PaymentPost200Response;
import br.com.openpix.sdk.model.PaymentCreatePayload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentRequestAccessApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentRequestAccessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentRequestAccessApi(ApiClient apiClient) {
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
     * Build call for apiV1PaymentGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PaymentGetCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/payment";

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
    private okhttp3.Call apiV1PaymentGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return apiV1PaymentGetCall(_callback);

    }

    /**
     * Get a list of payments
     * 
     * @return ApiV1PaymentGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1PaymentGet200Response apiV1PaymentGet() throws ApiException {
        ApiResponse<ApiV1PaymentGet200Response> localVarResp = apiV1PaymentGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get a list of payments
     * 
     * @return ApiResponse&lt;ApiV1PaymentGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1PaymentGet200Response> apiV1PaymentGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = apiV1PaymentGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ApiV1PaymentGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of payments (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PaymentGetAsync(final ApiCallback<ApiV1PaymentGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1PaymentGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ApiV1PaymentGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1PaymentIdGet
     * @param id payment ID or correlation ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The payment retrieved using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PaymentIdGetCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/payment/{id}"
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
    private okhttp3.Call apiV1PaymentIdGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV1PaymentIdGet(Async)");
        }

        return apiV1PaymentIdGetCall(id, _callback);

    }

    /**
     * Get one Payment
     * 
     * @param id payment ID or correlation ID (required)
     * @return ApiV1PaymentIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The payment retrieved using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1PaymentIdGet200Response apiV1PaymentIdGet(String id) throws ApiException {
        ApiResponse<ApiV1PaymentIdGet200Response> localVarResp = apiV1PaymentIdGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get one Payment
     * 
     * @param id payment ID or correlation ID (required)
     * @return ApiResponse&lt;ApiV1PaymentIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The payment retrieved using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1PaymentIdGet200Response> apiV1PaymentIdGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = apiV1PaymentIdGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ApiV1PaymentIdGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get one Payment (asynchronously)
     * 
     * @param id payment ID or correlation ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The payment retrieved using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PaymentIdGetAsync(String id, final ApiCallback<ApiV1PaymentIdGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1PaymentIdGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ApiV1PaymentIdGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1PaymentPost
     * @param paymentCreatePayload Data to create a payment request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment destination account information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PaymentPostCall(PaymentCreatePayload paymentCreatePayload, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentCreatePayload;

        // create path and map variables
        String localVarPath = "/api/v1/payment";

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
    private okhttp3.Call apiV1PaymentPostValidateBeforeCall(PaymentCreatePayload paymentCreatePayload, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentCreatePayload' is set
        if (paymentCreatePayload == null) {
            throw new ApiException("Missing the required parameter 'paymentCreatePayload' when calling apiV1PaymentPost(Async)");
        }

        return apiV1PaymentPostCall(paymentCreatePayload, _callback);

    }

    /**
     * Create a Payment Request
     * Endpoint to request a payment
     * @param paymentCreatePayload Data to create a payment request (required)
     * @return ApiV1PaymentPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment destination account information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1PaymentPost200Response apiV1PaymentPost(PaymentCreatePayload paymentCreatePayload) throws ApiException {
        ApiResponse<ApiV1PaymentPost200Response> localVarResp = apiV1PaymentPostWithHttpInfo(paymentCreatePayload);
        return localVarResp.getData();
    }

    /**
     * Create a Payment Request
     * Endpoint to request a payment
     * @param paymentCreatePayload Data to create a payment request (required)
     * @return ApiResponse&lt;ApiV1PaymentPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment destination account information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1PaymentPost200Response> apiV1PaymentPostWithHttpInfo(PaymentCreatePayload paymentCreatePayload) throws ApiException {
        okhttp3.Call localVarCall = apiV1PaymentPostValidateBeforeCall(paymentCreatePayload, null);
        Type localVarReturnType = new TypeToken<ApiV1PaymentPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a Payment Request (asynchronously)
     * Endpoint to request a payment
     * @param paymentCreatePayload Data to create a payment request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment destination account information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PaymentPostAsync(PaymentCreatePayload paymentCreatePayload, final ApiCallback<ApiV1PaymentPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1PaymentPostValidateBeforeCall(paymentCreatePayload, _callback);
        Type localVarReturnType = new TypeToken<ApiV1PaymentPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
