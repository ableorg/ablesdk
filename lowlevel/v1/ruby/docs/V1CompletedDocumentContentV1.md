# AbleSDK::V1CompletedDocumentContentV1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **document_content_id** | **String** | The ID of the document content. | [optional] |
| **status** | [**V1DocumentContentStatusV1**](V1DocumentContentStatusV1.md) |  | [optional][default to &#39;DOCUMENT_CONTENT_STATUS_UNSPECIFIED&#39;] |
| **last_error** | **String** | Any error message generated during processing, empty if status is COMPLETE. | [optional] |
| **acquired_by** | **String** | The name of the worker that acquired the document content. | [optional] |
| **acquired_time** | **Time** | The timestamp when the document content was acquired. | [optional] |
| **completed_by** | **String** | The name of the worker that completed the document content. | [optional] |
| **completed_time** | **Time** | The timestamp when the document content was completed. | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1CompletedDocumentContentV1.new(
  document_content_id: null,
  status: null,
  last_error: null,
  acquired_by: null,
  acquired_time: null,
  completed_by: null,
  completed_time: null
)
```

