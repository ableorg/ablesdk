# AbleSDK::APIApi

All URIs are relative to *https://api.ableai.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**a_pi_acquire_document_content_v1**](APIApi.md#a_pi_acquire_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire | Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers. |
| [**a_pi_complete_document_content_v1**](APIApi.md#a_pi_complete_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId} | Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request. |
| [**a_pi_create_document_content_v1**](APIApi.md#a_pi_create_document_content_v1) | **PUT** /v1/extensions/{extensionId}/documentContent | Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed. |


## a_pi_acquire_document_content_v1

> <V1AcquiredDocumentContentV1> a_pi_acquire_document_content_v1(extension_id, worker_name, body)

Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.

### Examples

```ruby
require 'time'
require 'able_sdk'

api_instance = AbleSDK::APIApi.new
extension_id = 'extension_id_example' # String | The unique ID of the extension.
worker_name = 'worker_name_example' # String | The name of the worker that will process the task.
body = AbleSDK::V1AcquireDocumentContentRequestV1Body.new({expected_execution_duration: 'expected_execution_duration_example'}) # V1AcquireDocumentContentRequestV1Body | 

begin
  # Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
  result = api_instance.a_pi_acquire_document_content_v1(extension_id, worker_name, body)
  p result
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_acquire_document_content_v1: #{e}"
end
```

#### Using the a_pi_acquire_document_content_v1_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1AcquiredDocumentContentV1>, Integer, Hash)> a_pi_acquire_document_content_v1_with_http_info(extension_id, worker_name, body)

```ruby
begin
  # Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
  data, status_code, headers = api_instance.a_pi_acquire_document_content_v1_with_http_info(extension_id, worker_name, body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1AcquiredDocumentContentV1>
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_acquire_document_content_v1_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **extension_id** | **String** | The unique ID of the extension. |  |
| **worker_name** | **String** | The name of the worker that will process the task. |  |
| **body** | [**V1AcquireDocumentContentRequestV1Body**](V1AcquireDocumentContentRequestV1Body.md) |  |  |

### Return type

[**V1AcquiredDocumentContentV1**](V1AcquiredDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## a_pi_complete_document_content_v1

> <V1CompletedDocumentContentV1> a_pi_complete_document_content_v1(extension_id, worker_name, document_content_id, body)

Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.

### Examples

```ruby
require 'time'
require 'able_sdk'

api_instance = AbleSDK::APIApi.new
extension_id = 'extension_id_example' # String | The unique ID of the extension.
worker_name = 'worker_name_example' # String | The name of the worker that processed the task.
document_content_id = 'document_content_id_example' # String | The ID of the document content that was processed.
body = AbleSDK::V1CompleteDocumentContentRequestV1Body.new({status: AbleSDK::V1DocumentContentStatusV1::DOCUMENT_CONTENT_STATUS_UNSPECIFIED}) # V1CompleteDocumentContentRequestV1Body | 

begin
  # Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
  result = api_instance.a_pi_complete_document_content_v1(extension_id, worker_name, document_content_id, body)
  p result
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_complete_document_content_v1: #{e}"
end
```

#### Using the a_pi_complete_document_content_v1_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1CompletedDocumentContentV1>, Integer, Hash)> a_pi_complete_document_content_v1_with_http_info(extension_id, worker_name, document_content_id, body)

```ruby
begin
  # Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
  data, status_code, headers = api_instance.a_pi_complete_document_content_v1_with_http_info(extension_id, worker_name, document_content_id, body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1CompletedDocumentContentV1>
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_complete_document_content_v1_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **extension_id** | **String** | The unique ID of the extension. |  |
| **worker_name** | **String** | The name of the worker that processed the task. |  |
| **document_content_id** | **String** | The ID of the document content that was processed. |  |
| **body** | [**V1CompleteDocumentContentRequestV1Body**](V1CompleteDocumentContentRequestV1Body.md) |  |  |

### Return type

[**V1CompletedDocumentContentV1**](V1CompletedDocumentContentV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## a_pi_create_document_content_v1

> <V1DocumentContent> a_pi_create_document_content_v1(extension_id, body)

Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.

### Examples

```ruby
require 'time'
require 'able_sdk'

api_instance = AbleSDK::APIApi.new
extension_id = 'extension_id_example' # String | The unique ID of the extension.
body = AbleSDK::InlineObject.new # InlineObject | 

begin
  # Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
  result = api_instance.a_pi_create_document_content_v1(extension_id, body)
  p result
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_create_document_content_v1: #{e}"
end
```

#### Using the a_pi_create_document_content_v1_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1DocumentContent>, Integer, Hash)> a_pi_create_document_content_v1_with_http_info(extension_id, body)

```ruby
begin
  # Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
  data, status_code, headers = api_instance.a_pi_create_document_content_v1_with_http_info(extension_id, body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1DocumentContent>
rescue AbleSDK::ApiError => e
  puts "Error when calling APIApi->a_pi_create_document_content_v1_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **extension_id** | **String** | The unique ID of the extension. |  |
| **body** | [**InlineObject**](InlineObject.md) |  |  |

### Return type

[**V1DocumentContent**](V1DocumentContent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

