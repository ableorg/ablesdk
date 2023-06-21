# OpenAPI\Client\APIApi

All URIs are relative to https://api.ableai.com.

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIAcquireDocumentVersion()**](APIApi.md#aPIAcquireDocumentVersion) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
[**aPICompleteDocumentVersion()**](APIApi.md#aPICompleteDocumentVersion) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
[**aPICreateDocumentVersion()**](APIApi.md#aPICreateDocumentVersion) | **PUT** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.


## `aPIAcquireDocumentVersion()`

```php
aPIAcquireDocumentVersion($extension_id, $worker_name, $properties): \OpenAPI\Client\Model\V1AcquiredDocumentVersion
```

Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

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
$properties = new \OpenAPI\Client\Model\V1AcquireDocumentVersionRequestProperties(); // \OpenAPI\Client\Model\V1AcquireDocumentVersionRequestProperties

try {
    $result = $apiInstance->aPIAcquireDocumentVersion($extension_id, $worker_name, $properties);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling APIApi->aPIAcquireDocumentVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. |
 **worker_name** | **string**| The name of the worker that will process the task. |
 **properties** | [**\OpenAPI\Client\Model\V1AcquireDocumentVersionRequestProperties**](../Model/V1AcquireDocumentVersionRequestProperties.md)|  |

### Return type

[**\OpenAPI\Client\Model\V1AcquiredDocumentVersion**](../Model/V1AcquiredDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `aPICompleteDocumentVersion()`

```php
aPICompleteDocumentVersion($extension_id, $worker_name, $document_version_id, $properties): \OpenAPI\Client\Model\V1CompletedDocumentVersion
```

Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

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
$document_version_id = 'document_version_id_example'; // string | The ID of the document version that was processed.
$properties = new \OpenAPI\Client\Model\V1CompleteDocumentVersionRequestProperties(); // \OpenAPI\Client\Model\V1CompleteDocumentVersionRequestProperties

try {
    $result = $apiInstance->aPICompleteDocumentVersion($extension_id, $worker_name, $document_version_id, $properties);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling APIApi->aPICompleteDocumentVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. |
 **worker_name** | **string**| The name of the worker that processed the task. |
 **document_version_id** | **string**| The ID of the document version that was processed. |
 **properties** | [**\OpenAPI\Client\Model\V1CompleteDocumentVersionRequestProperties**](../Model/V1CompleteDocumentVersionRequestProperties.md)|  |

### Return type

[**\OpenAPI\Client\Model\V1CompletedDocumentVersion**](../Model/V1CompletedDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `aPICreateDocumentVersion()`

```php
aPICreateDocumentVersion($extension_id, $body): \OpenAPI\Client\Model\V1DocumentVersion
```

Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.

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
    $result = $apiInstance->aPICreateDocumentVersion($extension_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling APIApi->aPICreateDocumentVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension_id** | **string**| The unique ID of the extension. |
 **body** | [**\OpenAPI\Client\Model\InlineObject**](../Model/InlineObject.md)|  |

### Return type

[**\OpenAPI\Client\Model\V1DocumentVersion**](../Model/V1DocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
