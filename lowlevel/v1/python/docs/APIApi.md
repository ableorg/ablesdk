# able_sdk.APIApi

All URIs are relative to *https://api.ableai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**a_pi_acquire_document_content_v1**](APIApi.md#a_pi_acquire_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**a_pi_complete_document_content_v1**](APIApi.md#a_pi_complete_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**a_pi_create_document_content_v1**](APIApi.md#a_pi_create_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.


# **a_pi_acquire_document_content_v1**
> V1AcquiredDocumentContentV1 a_pi_acquire_document_content_v1(extension_id, worker_name, body)

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example

```python
import time
import able_sdk
from able_sdk.api import api_api
from able_sdk.model.v1_acquire_document_content_request_v1_body import V1AcquireDocumentContentRequestV1Body
from able_sdk.model.v1_acquired_document_content_v1 import V1AcquiredDocumentContentV1
from able_sdk.model.rpc_status import RpcStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api.ableai.com
# See configuration.py for a list of all supported configuration parameters.
configuration = able_sdk.Configuration(
    host = "https://api.ableai.com"
)


# Enter a context with an instance of the API client
with able_sdk.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_api.APIApi(api_client)
    extension_id = "extensionId_example" # str | The unique ID of the extension.
    worker_name = "workerName_example" # str | The name of the worker that will process the task.
    body = V1AcquireDocumentContentRequestV1Body(
        expected_execution_duration="expected_execution_duration_example",
    ) # V1AcquireDocumentContentRequestV1Body | 

    # example passing only required values which don't have defaults set
    try:
        # Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
        api_response = api_instance.a_pi_acquire_document_content_v1(extension_id, worker_name, body)
        pprint(api_response)
    except able_sdk.ApiException as e:
        print("Exception when calling APIApi->a_pi_acquire_document_content_v1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **str**| The unique ID of the extension. |
 **worker_name** | **str**| The name of the worker that will process the task. |
 **body** | [**V1AcquireDocumentContentRequestV1Body**](V1AcquireDocumentContentRequestV1Body.md)|  |

### Return type

[**V1AcquiredDocumentContentV1**](V1AcquiredDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **a_pi_complete_document_content_v1**
> V1CompletedDocumentContentV1 a_pi_complete_document_content_v1(extension_id, worker_name, document_content_id, body)

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example

```python
import time
import able_sdk
from able_sdk.api import api_api
from able_sdk.model.v1_complete_document_content_request_v1_body import V1CompleteDocumentContentRequestV1Body
from able_sdk.model.rpc_status import RpcStatus
from able_sdk.model.v1_completed_document_content_v1 import V1CompletedDocumentContentV1
from pprint import pprint
# Defining the host is optional and defaults to https://api.ableai.com
# See configuration.py for a list of all supported configuration parameters.
configuration = able_sdk.Configuration(
    host = "https://api.ableai.com"
)


# Enter a context with an instance of the API client
with able_sdk.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_api.APIApi(api_client)
    extension_id = "extensionId_example" # str | The unique ID of the extension.
    worker_name = "workerName_example" # str | The name of the worker that processed the task.
    document_content_id = "documentContentId_example" # str | The ID of the document content that was processed.
    body = V1CompleteDocumentContentRequestV1Body(
        status=V1DocumentContentStatusV1("DOCUMENT_CONTENT_STATUS_UNSPECIFIED"),
        last_error="last_error_example",
        attributes=[
            V1Attribute(
                key="key_example",
                value="value_example",
                type=V1AttributeTypeV1("ATTRIBUTE_TYPE_UNSPECIFIED"),
            ),
        ],
    ) # V1CompleteDocumentContentRequestV1Body | 

    # example passing only required values which don't have defaults set
    try:
        # Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
        api_response = api_instance.a_pi_complete_document_content_v1(extension_id, worker_name, document_content_id, body)
        pprint(api_response)
    except able_sdk.ApiException as e:
        print("Exception when calling APIApi->a_pi_complete_document_content_v1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **str**| The unique ID of the extension. |
 **worker_name** | **str**| The name of the worker that processed the task. |
 **document_content_id** | **str**| The ID of the document content that was processed. |
 **body** | [**V1CompleteDocumentContentRequestV1Body**](V1CompleteDocumentContentRequestV1Body.md)|  |

### Return type

[**V1CompletedDocumentContentV1**](V1CompletedDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **a_pi_create_document_content_v1**
> V1DocumentContent a_pi_create_document_content_v1(extension_id, body)

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

### Example

```python
import time
import able_sdk
from able_sdk.api import api_api
from able_sdk.model.v1_document_content import V1DocumentContent
from able_sdk.model.rpc_status import RpcStatus
from able_sdk.model.inline_object import InlineObject
from pprint import pprint
# Defining the host is optional and defaults to https://api.ableai.com
# See configuration.py for a list of all supported configuration parameters.
configuration = able_sdk.Configuration(
    host = "https://api.ableai.com"
)


# Enter a context with an instance of the API client
with able_sdk.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_api.APIApi(api_client)
    extension_id = "extensionId_example" # str | The unique ID of the extension.
    body = InlineObject(
        body=V1CreateDocumentContentRequestV1Body(
            documents=[
                V1Document(
                    external_primary_key="external_primary_key_example",
                    attributes=[
                        V1Attribute(
                            key="key_example",
                            value="value_example",
                            type=V1AttributeTypeV1("ATTRIBUTE_TYPE_UNSPECIFIED"),
                        ),
                    ],
                ),
            ],
        ),
    ) # InlineObject | 

    # example passing only required values which don't have defaults set
    try:
        # Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
        api_response = api_instance.a_pi_create_document_content_v1(extension_id, body)
        pprint(api_response)
    except able_sdk.ApiException as e:
        print("Exception when calling APIApi->a_pi_create_document_content_v1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **str**| The unique ID of the extension. |
 **body** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**V1DocumentContent**](V1DocumentContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

