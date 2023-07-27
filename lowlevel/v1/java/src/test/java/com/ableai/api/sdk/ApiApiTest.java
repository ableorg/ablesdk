/*
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230727053012
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ableai.api.sdk;

import com.ableai.api.ApiException;
import com.ableai.api.sdk.model.RpcStatus;
import com.ableai.api.sdk.model.V1AcquireDocumentContentRequestV1Body;
import com.ableai.api.sdk.model.V1AcquiredDocumentContentV1;
import com.ableai.api.sdk.model.V1CompleteDocumentContentRequestV1Body;
import com.ableai.api.sdk.model.V1CompletedDocumentContentV1;
import com.ableai.api.sdk.model.V1CreateDocumentContentRequestV1Body;
import com.ableai.api.sdk.model.V1DocumentContent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiApi
 */
@Ignore
public class ApiApiTest {

    private final ApiApi api = new ApiApi();

    
    /**
     * Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aPIAcquireDocumentContentV1Test() throws ApiException {
        String extensionId = null;
        String workerName = null;
        V1AcquireDocumentContentRequestV1Body body = null;
        V1AcquiredDocumentContentV1 response = api.aPIAcquireDocumentContentV1(extensionId, workerName, body);

        // TODO: test validations
    }
    
    /**
     * Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aPICompleteDocumentContentV1Test() throws ApiException {
        String extensionId = null;
        String workerName = null;
        String documentContentId = null;
        V1CompleteDocumentContentRequestV1Body body = null;
        V1CompletedDocumentContentV1 response = api.aPICompleteDocumentContentV1(extensionId, workerName, documentContentId, body);

        // TODO: test validations
    }
    
    /**
     * Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aPICreateDocumentContentV1Test() throws ApiException {
        String extensionId = null;
        V1CreateDocumentContentRequestV1Body body = null;
        V1DocumentContent response = api.aPICreateDocumentContentV1(extensionId, body);

        // TODO: test validations
    }
    
}
