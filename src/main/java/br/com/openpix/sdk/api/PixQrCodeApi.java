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
import br.com.openpix.sdk.model.ApiV1PixQrCodeStaticIdGet200Response;
import br.com.openpix.sdk.model.ApiV1QrcodeStaticGet200Response;
import br.com.openpix.sdk.model.ApiV1QrcodeStaticPost200Response;
import br.com.openpix.sdk.model.PixQrCodePayload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PixQrCodeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PixQrCodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PixQrCodeApi(ApiClient apiClient) {
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
     * Build call for apiV1PixQrCodeStaticIdGet
     * @param id pixQrCode ID, correlation ID or emv identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The pixQrCode retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PixQrCodeStaticIdGetCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/pixQrCode-static/{id}"
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
    private okhttp3.Call apiV1PixQrCodeStaticIdGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV1PixQrCodeStaticIdGet(Async)");
        }

        return apiV1PixQrCodeStaticIdGetCall(id, _callback);

    }

    /**
     * Get one Pix QrCode
     * 
     * @param id pixQrCode ID, correlation ID or emv identifier (required)
     * @return ApiV1PixQrCodeStaticIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The pixQrCode retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1PixQrCodeStaticIdGet200Response apiV1PixQrCodeStaticIdGet(String id) throws ApiException {
        ApiResponse<ApiV1PixQrCodeStaticIdGet200Response> localVarResp = apiV1PixQrCodeStaticIdGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get one Pix QrCode
     * 
     * @param id pixQrCode ID, correlation ID or emv identifier (required)
     * @return ApiResponse&lt;ApiV1PixQrCodeStaticIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The pixQrCode retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1PixQrCodeStaticIdGet200Response> apiV1PixQrCodeStaticIdGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = apiV1PixQrCodeStaticIdGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ApiV1PixQrCodeStaticIdGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get one Pix QrCode (asynchronously)
     * 
     * @param id pixQrCode ID, correlation ID or emv identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The pixQrCode retrieve using the given ID </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1PixQrCodeStaticIdGetAsync(String id, final ApiCallback<ApiV1PixQrCodeStaticIdGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1PixQrCodeStaticIdGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ApiV1PixQrCodeStaticIdGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1QrcodeStaticGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of pixQrCodes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1QrcodeStaticGetCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/qrcode-static";

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
    private okhttp3.Call apiV1QrcodeStaticGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return apiV1QrcodeStaticGetCall(_callback);

    }

    /**
     * Get a list of Pix QrCodes
     * 
     * @return ApiV1QrcodeStaticGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of pixQrCodes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1QrcodeStaticGet200Response apiV1QrcodeStaticGet() throws ApiException {
        ApiResponse<ApiV1QrcodeStaticGet200Response> localVarResp = apiV1QrcodeStaticGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get a list of Pix QrCodes
     * 
     * @return ApiResponse&lt;ApiV1QrcodeStaticGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of pixQrCodes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1QrcodeStaticGet200Response> apiV1QrcodeStaticGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = apiV1QrcodeStaticGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ApiV1QrcodeStaticGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of Pix QrCodes (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of pixQrCodes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1QrcodeStaticGetAsync(final ApiCallback<ApiV1QrcodeStaticGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1QrcodeStaticGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ApiV1QrcodeStaticGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1QrcodeStaticPost
     * @param pixQrCodePayload Data to create a new Pix QrCode Static (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PixQrCode ID and also the generated Dynamic BR Code to be rendered as a QRCode </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1QrcodeStaticPostCall(PixQrCodePayload pixQrCodePayload, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = pixQrCodePayload;

        // create path and map variables
        String localVarPath = "/api/v1/qrcode-static";

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
    private okhttp3.Call apiV1QrcodeStaticPostValidateBeforeCall(PixQrCodePayload pixQrCodePayload, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pixQrCodePayload' is set
        if (pixQrCodePayload == null) {
            throw new ApiException("Missing the required parameter 'pixQrCodePayload' when calling apiV1QrcodeStaticPost(Async)");
        }

        return apiV1QrcodeStaticPostCall(pixQrCodePayload, _callback);

    }

    /**
     * Create a new Pix QrCode Static
     * Endpoint to create a new Pix QrCode Static
     * @param pixQrCodePayload Data to create a new Pix QrCode Static (required)
     * @return ApiV1QrcodeStaticPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PixQrCode ID and also the generated Dynamic BR Code to be rendered as a QRCode </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiV1QrcodeStaticPost200Response apiV1QrcodeStaticPost(PixQrCodePayload pixQrCodePayload) throws ApiException {
        ApiResponse<ApiV1QrcodeStaticPost200Response> localVarResp = apiV1QrcodeStaticPostWithHttpInfo(pixQrCodePayload);
        return localVarResp.getData();
    }

    /**
     * Create a new Pix QrCode Static
     * Endpoint to create a new Pix QrCode Static
     * @param pixQrCodePayload Data to create a new Pix QrCode Static (required)
     * @return ApiResponse&lt;ApiV1QrcodeStaticPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PixQrCode ID and also the generated Dynamic BR Code to be rendered as a QRCode </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiV1QrcodeStaticPost200Response> apiV1QrcodeStaticPostWithHttpInfo(PixQrCodePayload pixQrCodePayload) throws ApiException {
        okhttp3.Call localVarCall = apiV1QrcodeStaticPostValidateBeforeCall(pixQrCodePayload, null);
        Type localVarReturnType = new TypeToken<ApiV1QrcodeStaticPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Pix QrCode Static (asynchronously)
     * Endpoint to create a new Pix QrCode Static
     * @param pixQrCodePayload Data to create a new Pix QrCode Static (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PixQrCode ID and also the generated Dynamic BR Code to be rendered as a QRCode </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1QrcodeStaticPostAsync(PixQrCodePayload pixQrCodePayload, final ApiCallback<ApiV1QrcodeStaticPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1QrcodeStaticPostValidateBeforeCall(pixQrCodePayload, _callback);
        Type localVarReturnType = new TypeToken<ApiV1QrcodeStaticPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
