/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * API version: 1.20230621235520
 * Contact: support@able.ai
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ablesdk

import (
	"bytes"
	_context "context"
	_ioutil "io/ioutil"
	_nethttp "net/http"
	_neturl "net/url"
	"strings"
)

// Linger please
var (
	_ _context.Context
)

// APIApiService APIApi service
type APIApiService service

type ApiAPIAcquireDocumentVersionRequest struct {
	ctx _context.Context
	ApiService *APIApiService
	extensionId string
	workerName string
	properties *V1AcquireDocumentVersionRequestProperties
}

func (r ApiAPIAcquireDocumentVersionRequest) Properties(properties V1AcquireDocumentVersionRequestProperties) ApiAPIAcquireDocumentVersionRequest {
	r.properties = &properties
	return r
}

func (r ApiAPIAcquireDocumentVersionRequest) Execute() (V1AcquiredDocumentVersion, *_nethttp.Response, error) {
	return r.ApiService.APIAcquireDocumentVersionExecute(r)
}

/*
 * APIAcquireDocumentVersion Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param extensionId The unique ID of the extension.
 * @param workerName The name of the worker that will process the task.
 * @return ApiAPIAcquireDocumentVersionRequest
 */
func (a *APIApiService) APIAcquireDocumentVersion(ctx _context.Context, extensionId string, workerName string) ApiAPIAcquireDocumentVersionRequest {
	return ApiAPIAcquireDocumentVersionRequest{
		ApiService: a,
		ctx: ctx,
		extensionId: extensionId,
		workerName: workerName,
	}
}

/*
 * Execute executes the request
 * @return V1AcquiredDocumentVersion
 */
func (a *APIApiService) APIAcquireDocumentVersionExecute(r ApiAPIAcquireDocumentVersionRequest) (V1AcquiredDocumentVersion, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPut
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  V1AcquiredDocumentVersion
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "APIApiService.APIAcquireDocumentVersion")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire"
	localVarPath = strings.Replace(localVarPath, "{"+"extensionId"+"}", _neturl.PathEscape(parameterToString(r.extensionId, "")), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"workerName"+"}", _neturl.PathEscape(parameterToString(r.workerName, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if r.properties == nil {
		return localVarReturnValue, nil, reportError("properties is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.properties
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
			var v RpcStatus
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiAPICompleteDocumentVersionRequest struct {
	ctx _context.Context
	ApiService *APIApiService
	extensionId string
	workerName string
	documentVersionId string
	properties *V1CompleteDocumentVersionRequestProperties
}

func (r ApiAPICompleteDocumentVersionRequest) Properties(properties V1CompleteDocumentVersionRequestProperties) ApiAPICompleteDocumentVersionRequest {
	r.properties = &properties
	return r
}

func (r ApiAPICompleteDocumentVersionRequest) Execute() (V1CompletedDocumentVersion, *_nethttp.Response, error) {
	return r.ApiService.APICompleteDocumentVersionExecute(r)
}

/*
 * APICompleteDocumentVersion Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param extensionId The unique ID of the extension.
 * @param workerName The name of the worker that processed the task.
 * @param documentVersionId The ID of the document version that was processed.
 * @return ApiAPICompleteDocumentVersionRequest
 */
func (a *APIApiService) APICompleteDocumentVersion(ctx _context.Context, extensionId string, workerName string, documentVersionId string) ApiAPICompleteDocumentVersionRequest {
	return ApiAPICompleteDocumentVersionRequest{
		ApiService: a,
		ctx: ctx,
		extensionId: extensionId,
		workerName: workerName,
		documentVersionId: documentVersionId,
	}
}

/*
 * Execute executes the request
 * @return V1CompletedDocumentVersion
 */
func (a *APIApiService) APICompleteDocumentVersionExecute(r ApiAPICompleteDocumentVersionRequest) (V1CompletedDocumentVersion, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPut
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  V1CompletedDocumentVersion
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "APIApiService.APICompleteDocumentVersion")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId}"
	localVarPath = strings.Replace(localVarPath, "{"+"extensionId"+"}", _neturl.PathEscape(parameterToString(r.extensionId, "")), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"workerName"+"}", _neturl.PathEscape(parameterToString(r.workerName, "")), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"documentVersionId"+"}", _neturl.PathEscape(parameterToString(r.documentVersionId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if r.properties == nil {
		return localVarReturnValue, nil, reportError("properties is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.properties
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
			var v RpcStatus
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiAPICreateDocumentVersionRequest struct {
	ctx _context.Context
	ApiService *APIApiService
	extensionId string
	body *InlineObject
}

func (r ApiAPICreateDocumentVersionRequest) Body(body InlineObject) ApiAPICreateDocumentVersionRequest {
	r.body = &body
	return r
}

func (r ApiAPICreateDocumentVersionRequest) Execute() (V1DocumentVersion, *_nethttp.Response, error) {
	return r.ApiService.APICreateDocumentVersionExecute(r)
}

/*
 * APICreateDocumentVersion Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param extensionId The unique ID of the extension.
 * @return ApiAPICreateDocumentVersionRequest
 */
func (a *APIApiService) APICreateDocumentVersion(ctx _context.Context, extensionId string) ApiAPICreateDocumentVersionRequest {
	return ApiAPICreateDocumentVersionRequest{
		ApiService: a,
		ctx: ctx,
		extensionId: extensionId,
	}
}

/*
 * Execute executes the request
 * @return V1DocumentVersion
 */
func (a *APIApiService) APICreateDocumentVersionExecute(r ApiAPICreateDocumentVersionRequest) (V1DocumentVersion, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPut
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  V1DocumentVersion
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "APIApiService.APICreateDocumentVersion")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/extensions/{extensionId}/documentVersion"
	localVarPath = strings.Replace(localVarPath, "{"+"extensionId"+"}", _neturl.PathEscape(parameterToString(r.extensionId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if r.body == nil {
		return localVarReturnValue, nil, reportError("body is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.body
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
			var v RpcStatus
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
