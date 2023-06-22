# OpenAPI\Client\APIApi

All URIs are relative to https://api.ableai.com.

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIAcquireDocumentContentV1()**](APIApi.md#aPIAcquireDocumentContentV1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**aPICompleteDocumentContentV1()**](APIApi.md#aPICompleteDocumentContentV1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**aPICreateDocumentContentV1()**](APIApi.md#aPICreateDocumentContentV1) | **PUT** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.


## `aPIAcquireDocumentContentV1()`

```php
aPIAcquireDocumentContentV1($extension_id, $worker_name, $body): \OpenAPI\Client\Model\V1AcquiredDocumentContentV1
```

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\APIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$extension_id = 'extension_id_example'; // string | The unique ID of the extension.
$worker_name = 'worker_name_example'; // string | The name of the worker that will process the task.
$body = new \OpenAPI\Client\Model\V1AcquireDocumentContentRequestV1Body(); // \OpenAPI\Client\Model\V1AcquireDocumentContentRequestV1Body

try {
    $result = $apiInstance->aPIAcquireDocumentContentV1($extension_id, $worker_name, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling APIApi->aPIAcquireDocumentContentV1: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. |
 **worker_name** | **string**| The name of the worker that will process the task. |
 **body** | [**\OpenAPI\Client\Model\V1AcquireDocumentContentRequestV1Body**](../Model/V1AcquireDocumentContentRequestV1Body.md)|  |

### Return type

[**\OpenAPI\Client\Model\V1AcquiredDocumentContentV1**](../Model/V1AcquiredDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `aPICompleteDocumentContentV1()`

```php
aPICompleteDocumentContentV1($extension_id, $worker_name, $document_content_id, $body): \OpenAPI\Client\Model\V1CompletedDocumentContentV1
```

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\APIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$extension_id = 'extension_id_example'; // string | The unique ID of the extension.
$worker_name = 'worker_name_example'; // string | The name of the worker that processed the task.
$document_content_id = 'document_content_id_example'; // string | The ID of the document content that was processed.
$body = new \OpenAPI\Client\Model\V1CompleteDocumentContentRequestV1Body(); // \OpenAPI\Client\Model\V1CompleteDocumentContentRequestV1Body

try {
    $result = $apiInstance->aPICompleteDocumentContentV1($extension_id, $worker_name, $document_content_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling APIApi->aPICompleteDocumentContentV1: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. |
 **worker_name** | **string**| The name of the worker that processed the task. |
 **document_content_id** | **string**| The ID of the document content that was processed. |
 **body** | [**\OpenAPI\Client\Model\V1CompleteDocumentContentRequestV1Body**](../Model/V1CompleteDocumentContentRequestV1Body.md)|  |

### Return type

[**\OpenAPI\Client\Model\V1CompletedDocumentContentV1**](../Model/V1CompletedDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `aPICreateDocumentContentV1()`

```php
aPICreateDocumentContentV1($extension_id, $body): \OpenAPI\Client\Model\V1DocumentContent
```

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\APIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$extension_id = 'extension_id_example'; // string | The unique ID of the extension.
$body = new \OpenAPI\Client\Model\InlineObject(); // \OpenAPI\Client\Model\InlineObject

try {
    $result = $apiInstance->aPICreateDocumentContentV1($extension_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling APIApi->aPICreateDocumentContentV1: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. |
 **body** | [**\OpenAPI\Client\Model\InlineObject**](../Model/InlineObject.md)|  |

### Return type

[**\OpenAPI\Client\Model\V1DocumentContent**](../Model/V1DocumentContent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
