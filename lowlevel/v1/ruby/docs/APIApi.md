# AbleSDK::APIApi

All URIs are relative to *https://api.ableai.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**a_pi_acquire_document_version**](APIApi.md#a_pi_acquire_document_version) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers. |
| [**a_pi_complete_document_version**](APIApi.md#a_pi_complete_document_version) | **PUT** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request. |
| [**a_pi_create_document_version**](APIApi.md#a_pi_create_document_version) | **PUT** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed. |


## a_pi_acquire_document_version

> <V1AcquiredDocumentVersion> a_pi_acquire_document_version(extension_id, worker_name, properties)

Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Examples

```ruby
require 'time'
require 'able_sdk'

api_instance = AbleSDK::APIApi.new
extension_id = 'extension_id_example' # String | The unique ID of the extension.
worker_name = 'worker_name_example' # String | The name of the worker that will process the task.
properties = AbleSDK::V1AcquireDocumentVersionRequestProperties.new({expected_execution_duration: 'expected_execution_duration_example'}) # V1AcquireDocumentVersionRequestProperties | 

begin
  # Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
  result = api_instance.a_pi_acquire_document_version(extension_id, worker_name, properties)
  p result
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_acquire_document_version: #{e}"
end
```

#### Using the a_pi_acquire_document_version_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1AcquiredDocumentVersion>, Integer, Hash)> a_pi_acquire_document_version_with_http_info(extension_id, worker_name, properties)

```ruby
begin
  # Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
  data, status_code, headers = api_instance.a_pi_acquire_document_version_with_http_info(extension_id, worker_name, properties)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1AcquiredDocumentVersion>
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_acquire_document_version_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **extension_id** | **String** | The unique ID of the extension. |  |
| **worker_name** | **String** | The name of the worker that will process the task. |  |
| **properties** | [**V1AcquireDocumentVersionRequestProperties**](V1AcquireDocumentVersionRequestProperties.md) |  |  |

### Return type

[**V1AcquiredDocumentVersion**](V1AcquiredDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## a_pi_complete_document_version

> <V1CompletedDocumentVersion> a_pi_complete_document_version(extension_id, worker_name, document_version_id, properties)

Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Examples

```ruby
require 'time'
require 'able_sdk'

api_instance = AbleSDK::APIApi.new
extension_id = 'extension_id_example' # String | The unique ID of the extension.
worker_name = 'worker_name_example' # String | The name of the worker that processed the task.
document_version_id = 'document_version_id_example' # String | The ID of the document version that was processed.
properties = AbleSDK::V1CompleteDocumentVersionRequestProperties.new({status: AbleSDK::V1DocumentVersionStatus::DOCUMENT_VERSION_STATUS_UNSPECIFIED}) # V1CompleteDocumentVersionRequestProperties | 

begin
  # Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
  result = api_instance.a_pi_complete_document_version(extension_id, worker_name, document_version_id, properties)
  p result
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_complete_document_version: #{e}"
end
```

#### Using the a_pi_complete_document_version_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1CompletedDocumentVersion>, Integer, Hash)> a_pi_complete_document_version_with_http_info(extension_id, worker_name, document_version_id, properties)

```ruby
begin
  # Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
  data, status_code, headers = api_instance.a_pi_complete_document_version_with_http_info(extension_id, worker_name, document_version_id, properties)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1CompletedDocumentVersion>
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_complete_document_version_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **extension_id** | **String** | The unique ID of the extension. |  |
| **worker_name** | **String** | The name of the worker that processed the task. |  |
| **document_version_id** | **String** | The ID of the document version that was processed. |  |
| **properties** | [**V1CompleteDocumentVersionRequestProperties**](V1CompleteDocumentVersionRequestProperties.md) |  |  |

### Return type

[**V1CompletedDocumentVersion**](V1CompletedDocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## a_pi_create_document_version

> <V1DocumentVersion> a_pi_create_document_version(extension_id, body)

Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.

### Examples

```ruby
require 'time'
require 'able_sdk'

api_instance = AbleSDK::APIApi.new
extension_id = 'extension_id_example' # String | The unique ID of the extension.
body = AbleSDK::InlineObject.new # InlineObject | 

begin
  # Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.
  result = api_instance.a_pi_create_document_version(extension_id, body)
  p result
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_create_document_version: #{e}"
end
```

#### Using the a_pi_create_document_version_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1DocumentVersion>, Integer, Hash)> a_pi_create_document_version_with_http_info(extension_id, body)

```ruby
begin
  # Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.
  data, status_code, headers = api_instance.a_pi_create_document_version_with_http_info(extension_id, body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1DocumentVersion>
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_create_document_version_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **extension_id** | **String** | The unique ID of the extension. |  |
| **body** | [**InlineObject**](InlineObject.md) |  |  |

### Return type

[**V1DocumentVersion**](V1DocumentVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

