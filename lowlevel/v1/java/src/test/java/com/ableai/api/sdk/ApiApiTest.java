/*
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230615090446
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ableai.api.sdk;

import com.ableai.api.ApiException;
import com.ableai.api.sdk.model.RpcStatus;
import com.ableai.api.sdk.model.V1Relationship;
import com.ableai.api.sdk.model.V1Upload;
import com.ableai.api.sdk.model.V1UploadRef;
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
     * Creates a new relationship.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aPICreateRelationshipTest() throws ApiException {
        String parent = null;
        V1Relationship relationship = null;
        String relationshipId = null;
        V1Relationship response = api.aPICreateRelationship(parent, relationship, relationshipId);

        // TODO: test validations
    }
    
    /**
     * Creates a new upload.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aPICreateUploadTest() throws ApiException {
        String parent = null;
        V1Upload upload = null;
        String uploadId = null;
        V1Upload response = api.aPICreateUpload(parent, upload, uploadId);

        // TODO: test validations
    }
    
    /**
     * Creates an upload session to start uploading a file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aPIStartUploadTest() throws ApiException {
        String parent = null;
        Object body = null;
        V1UploadRef response = api.aPIStartUpload(parent, body);

        // TODO: test validations
    }
    
}
