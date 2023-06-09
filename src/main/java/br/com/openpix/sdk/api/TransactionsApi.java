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
import br.com.openpix.sdk.model.ApiV1TransactionGet200Response;
import br.com.openpix.sdk.model.ApiV1TransactionIdGet200Response;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
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
     * Build call for apiV1TransactionGet
     * @param start  (optional)
     * @param end  (optional)
     * @param charge You can use the charge ID or correlation ID or transaction ID of charge to get a list of transactions related of this transaction (optional)
     * @param pixQrCode You can use the QrCode static ID or correlation ID or identifier field of QrCode static to get a list of QrCode related of this transaction (optional)
     * @param withdrawal You can use the ID or EndToEndId of a withdrawal transaction to get all transactions related to the withdrawal (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1TransactionGetCall(OffsetDateTime start, OffsetDateTime end, String charge, String pixQrCode, String withdrawal, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/transaction";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (start != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start", start));
        }

        if (end != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end", end));
        }

        if (charge != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("charge", charge));
        }

        if (pixQrCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pixQrCode", pixQrCode));
        }

        if (withdrawal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("withdrawal", withdrawal));
        }

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
    private okhttp3.Call apiV1TransactionGetValidateBeforeCall(OffsetDateTime start, OffsetDateTime end, String charge, String pixQrCode, String withdrawal, final ApiCallback _callback) throws ApiException {
        return apiV1TransactionGetCall(start, end, charge, pixQrCode, withdrawal, _callback);

    }

    /**
     * Get a list of transactions
     * 
     * @param start  (optional)
     * @param end  (optional)
     * @param charge You can use the charge ID or correlation ID or transaction ID of charge to get a list of transactions related of this transaction (optional)
     * @param pixQrCode You can use the QrCode static ID or correlation ID or identifier field of QrCode static to get a list of QrCode related of this transaction (optional)
     * @param withdrawal You can use the ID or EndToEndId of a withdrawal transaction to get all transactions related to the withdrawal (optional)
     * @return ApiV1TransactionGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1TransactionGet200Response apiV1TransactionGet(OffsetDateTime start, OffsetDateTime end, String charge, String pixQrCode, String withdrawal) throws ApiException {
        ApiResponse<ApiV1TransactionGet200Response> localVarResp = apiV1TransactionGetWithHttpInfo(start, end, charge, pixQrCode, withdrawal);
        return localVarResp.getData();
    }

    /**
     * Get a list of transactions
     * 
     * @param start  (optional)
     * @param end  (optional)
     * @param charge You can use the charge ID or correlation ID or transaction ID of charge to get a list of transactions related of this transaction (optional)
     * @param pixQrCode You can use the QrCode static ID or correlation ID or identifier field of QrCode static to get a list of QrCode related of this transaction (optional)
     * @param withdrawal You can use the ID or EndToEndId of a withdrawal transaction to get all transactions related to the withdrawal (optional)
     * @return ApiResponse&lt;ApiV1TransactionGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1TransactionGet200Response> apiV1TransactionGetWithHttpInfo(OffsetDateTime start, OffsetDateTime end, String charge, String pixQrCode, String withdrawal) throws ApiException {
        okhttp3.Call localVarCall = apiV1TransactionGetValidateBeforeCall(start, end, charge, pixQrCode, withdrawal, null);
        Type localVarReturnType = new TypeToken<ApiV1TransactionGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of transactions (asynchronously)
     * 
     * @param start  (optional)
     * @param end  (optional)
     * @param charge You can use the charge ID or correlation ID or transaction ID of charge to get a list of transactions related of this transaction (optional)
     * @param pixQrCode You can use the QrCode static ID or correlation ID or identifier field of QrCode static to get a list of QrCode related of this transaction (optional)
     * @param withdrawal You can use the ID or EndToEndId of a withdrawal transaction to get all transactions related to the withdrawal (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1TransactionGetAsync(OffsetDateTime start, OffsetDateTime end, String charge, String pixQrCode, String withdrawal, final ApiCallback<ApiV1TransactionGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1TransactionGetValidateBeforeCall(start, end, charge, pixQrCode, withdrawal, _callback);
        Type localVarReturnType = new TypeToken<ApiV1TransactionGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1TransactionIdGet
     * @param id you can use the transaction id from openpix or the endToEndId of transaction from bank (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1TransactionIdGetCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/transaction/{id}"
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
    private okhttp3.Call apiV1TransactionIdGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV1TransactionIdGet(Async)");
        }

        return apiV1TransactionIdGetCall(id, _callback);

    }

    /**
     * Get a Transaction
     * 
     * @param id you can use the transaction id from openpix or the endToEndId of transaction from bank (required)
     * @return ApiV1TransactionIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1TransactionIdGet200Response apiV1TransactionIdGet(String id) throws ApiException {
        ApiResponse<ApiV1TransactionIdGet200Response> localVarResp = apiV1TransactionIdGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get a Transaction
     * 
     * @param id you can use the transaction id from openpix or the endToEndId of transaction from bank (required)
     * @return ApiResponse&lt;ApiV1TransactionIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1TransactionIdGet200Response> apiV1TransactionIdGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = apiV1TransactionIdGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ApiV1TransactionIdGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a Transaction (asynchronously)
     * 
     * @param id you can use the transaction id from openpix or the endToEndId of transaction from bank (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1TransactionIdGetAsync(String id, final ApiCallback<ApiV1TransactionIdGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1TransactionIdGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ApiV1TransactionIdGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
