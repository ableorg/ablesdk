/*
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230628184958
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ableai.api.sdk;

import com.ableai.api.ApiCallback;
import com.ableai.api.ApiClient;
import com.ableai.api.ApiException;
import com.ableai.api.ApiResponse;
import com.ableai.api.Configuration;
import com.ableai.api.Pair;
import com.ableai.api.ProgressRequestBody;
import com.ableai.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ableai.api.sdk.model.RpcStatus;
import com.ableai.api.sdk.model.V1AcquireDocumentContentRequestV1Body;
import com.ableai.api.sdk.model.V1AcquiredDocumentContentV1;
import com.ableai.api.sdk.model.V1CompleteDocumentContentRequestV1Body;
import com.ableai.api.sdk.model.V1CompletedDocumentContentV1;
import com.ableai.api.sdk.model.V1CreateDocumentContentRequestV1Body;
import com.ableai.api.sdk.model.V1DocumentContent;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiApi {
    private ApiClient localVarApiClient;

    public ApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for aPIAcquireDocumentContentV1
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that will process the task. (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPIAcquireDocumentContentV1Call(String extensionId, String workerName, V1AcquireDocumentContentRequestV1Body body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire"
            .replaceAll("\\{" + "extensionId" + "\\}", localVarApiClient.escapeString(extensionId.toString()))
            .replaceAll("\\{" + "workerName" + "\\}", localVarApiClient.escapeString(workerName.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call aPIAcquireDocumentContentV1ValidateBeforeCall(String extensionId, String workerName, V1AcquireDocumentContentRequestV1Body body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling aPIAcquireDocumentContentV1(Async)");
        }
        
        // verify the required parameter 'workerName' is set
        if (workerName == null) {
            throw new ApiException("Missing the required parameter 'workerName' when calling aPIAcquireDocumentContentV1(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling aPIAcquireDocumentContentV1(Async)");
        }
        

        okhttp3.Call localVarCall = aPIAcquireDocumentContentV1Call(extensionId, workerName, body, _callback);
        return localVarCall;

    }

    /**
     * Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that will process the task. (required)
     * @param body  (required)
     * @return V1AcquiredDocumentContentV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1AcquiredDocumentContentV1 aPIAcquireDocumentContentV1(String extensionId, String workerName, V1AcquireDocumentContentRequestV1Body body) throws ApiException {
        ApiResponse<V1AcquiredDocumentContentV1> localVarResp = aPIAcquireDocumentContentV1WithHttpInfo(extensionId, workerName, body);
        return localVarResp.getData();
    }

    /**
     * Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that will process the task. (required)
     * @param body  (required)
     * @return ApiResponse&lt;V1AcquiredDocumentContentV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1AcquiredDocumentContentV1> aPIAcquireDocumentContentV1WithHttpInfo(String extensionId, String workerName, V1AcquireDocumentContentRequestV1Body body) throws ApiException {
        okhttp3.Call localVarCall = aPIAcquireDocumentContentV1ValidateBeforeCall(extensionId, workerName, body, null);
        Type localVarReturnType = new TypeToken<V1AcquiredDocumentContentV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers. (asynchronously)
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that will process the task. (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPIAcquireDocumentContentV1Async(String extensionId, String workerName, V1AcquireDocumentContentRequestV1Body body, final ApiCallback<V1AcquiredDocumentContentV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = aPIAcquireDocumentContentV1ValidateBeforeCall(extensionId, workerName, body, _callback);
        Type localVarReturnType = new TypeToken<V1AcquiredDocumentContentV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for aPICompleteDocumentContentV1
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that processed the task. (required)
     * @param documentContentId The ID of the document content that was processed. (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPICompleteDocumentContentV1Call(String extensionId, String workerName, String documentContentId, V1CompleteDocumentContentRequestV1Body body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId}"
            .replaceAll("\\{" + "extensionId" + "\\}", localVarApiClient.escapeString(extensionId.toString()))
            .replaceAll("\\{" + "workerName" + "\\}", localVarApiClient.escapeString(workerName.toString()))
            .replaceAll("\\{" + "documentContentId" + "\\}", localVarApiClient.escapeString(documentContentId.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call aPICompleteDocumentContentV1ValidateBeforeCall(String extensionId, String workerName, String documentContentId, V1CompleteDocumentContentRequestV1Body body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling aPICompleteDocumentContentV1(Async)");
        }
        
        // verify the required parameter 'workerName' is set
        if (workerName == null) {
            throw new ApiException("Missing the required parameter 'workerName' when calling aPICompleteDocumentContentV1(Async)");
        }
        
        // verify the required parameter 'documentContentId' is set
        if (documentContentId == null) {
            throw new ApiException("Missing the required parameter 'documentContentId' when calling aPICompleteDocumentContentV1(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling aPICompleteDocumentContentV1(Async)");
        }
        

        okhttp3.Call localVarCall = aPICompleteDocumentContentV1Call(extensionId, workerName, documentContentId, body, _callback);
        return localVarCall;

    }

    /**
     * Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that processed the task. (required)
     * @param documentContentId The ID of the document content that was processed. (required)
     * @param body  (required)
     * @return V1CompletedDocumentContentV1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1CompletedDocumentContentV1 aPICompleteDocumentContentV1(String extensionId, String workerName, String documentContentId, V1CompleteDocumentContentRequestV1Body body) throws ApiException {
        ApiResponse<V1CompletedDocumentContentV1> localVarResp = aPICompleteDocumentContentV1WithHttpInfo(extensionId, workerName, documentContentId, body);
        return localVarResp.getData();
    }

    /**
     * Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that processed the task. (required)
     * @param documentContentId The ID of the document content that was processed. (required)
     * @param body  (required)
     * @return ApiResponse&lt;V1CompletedDocumentContentV1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1CompletedDocumentContentV1> aPICompleteDocumentContentV1WithHttpInfo(String extensionId, String workerName, String documentContentId, V1CompleteDocumentContentRequestV1Body body) throws ApiException {
        okhttp3.Call localVarCall = aPICompleteDocumentContentV1ValidateBeforeCall(extensionId, workerName, documentContentId, body, null);
        Type localVarReturnType = new TypeToken<V1CompletedDocumentContentV1>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request. (asynchronously)
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param workerName The name of the worker that processed the task. (required)
     * @param documentContentId The ID of the document content that was processed. (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPICompleteDocumentContentV1Async(String extensionId, String workerName, String documentContentId, V1CompleteDocumentContentRequestV1Body body, final ApiCallback<V1CompletedDocumentContentV1> _callback) throws ApiException {

        okhttp3.Call localVarCall = aPICompleteDocumentContentV1ValidateBeforeCall(extensionId, workerName, documentContentId, body, _callback);
        Type localVarReturnType = new TypeToken<V1CompletedDocumentContentV1>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for aPICreateDocumentContentV1
     * @param extensionId The unique ID of the extension. (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPICreateDocumentContentV1Call(String extensionId, V1CreateDocumentContentRequestV1Body body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/extensions/{extensionId}/documentContent"
            .replaceAll("\\{" + "extensionId" + "\\}", localVarApiClient.escapeString(extensionId.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call aPICreateDocumentContentV1ValidateBeforeCall(String extensionId, V1CreateDocumentContentRequestV1Body body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling aPICreateDocumentContentV1(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling aPICreateDocumentContentV1(Async)");
        }
        

        okhttp3.Call localVarCall = aPICreateDocumentContentV1Call(extensionId, body, _callback);
        return localVarCall;

    }

    /**
     * Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param body  (required)
     * @return V1DocumentContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1DocumentContent aPICreateDocumentContentV1(String extensionId, V1CreateDocumentContentRequestV1Body body) throws ApiException {
        ApiResponse<V1DocumentContent> localVarResp = aPICreateDocumentContentV1WithHttpInfo(extensionId, body);
        return localVarResp.getData();
    }

    /**
     * Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param body  (required)
     * @return ApiResponse&lt;V1DocumentContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1DocumentContent> aPICreateDocumentContentV1WithHttpInfo(String extensionId, V1CreateDocumentContentRequestV1Body body) throws ApiException {
        okhttp3.Call localVarCall = aPICreateDocumentContentV1ValidateBeforeCall(extensionId, body, null);
        Type localVarReturnType = new TypeToken<V1DocumentContent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed. (asynchronously)
     * 
     * @param extensionId The unique ID of the extension. (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call aPICreateDocumentContentV1Async(String extensionId, V1CreateDocumentContentRequestV1Body body, final ApiCallback<V1DocumentContent> _callback) throws ApiException {

        okhttp3.Call localVarCall = aPICreateDocumentContentV1ValidateBeforeCall(extensionId, body, _callback);
        Type localVarReturnType = new TypeToken<V1DocumentContent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
