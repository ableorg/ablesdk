# AbleSDK::V1CompletedDocumentVersion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **document_version_id** | **String** | The ID of the document version. | [optional] |
| **status** | [**V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | [optional][default to &#39;DOCUMENT_VERSION_STATUS_UNSPECIFIED&#39;] |
| **last_error** | **String** | Any error message generated during processing, empty if status is COMPLETE. | [optional] |
| **acquired_by** | **String** | The name of the worker that acquired the document version. | [optional] |
| **acquired_time** | **Time** | The timestamp when the document version was acquired. | [optional] |
| **completed_by** | **String** | The name of the worker that completed the document version. | [optional] |
| **completed_time** | **Time** | The timestamp when the document version was completed. | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1CompletedDocumentVersion.new(
  document_version_id: null,
  status: null,
  last_error: null,
  acquired_by: null,
  acquired_time: null,
  completed_by: null,
  completed_time: null
)
```

