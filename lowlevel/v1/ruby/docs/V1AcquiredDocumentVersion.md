# AbleSDK::V1AcquiredDocumentVersion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **document_version_id** | **String** | The ID of the document version. | [optional] |
| **external_primary_key** | **String** | The primary key of the document in the external system. | [optional] |
| **direction** | [**V1DataTransferDirection**](V1DataTransferDirection.md) |  | [optional][default to &#39;DATA_TRANSFER_DIRECTION_UNSPECIFIED&#39;] |
| **upload_url** | **String** | The upload URL for the document file in GCS. | [optional] |
| **raw_file_url** | **String** | The download URL for the raw document file in GCS. | [optional] |
| **standardized_pdf_url** | **String** | The download URL for the standardized PDF file in GCS. | [optional] |
| **content_url** | **String** | The download URL for the content file in GCS. | [optional] |
| **acquired_by** | **String** | The name of the worker that acquired the document version. | [optional] |
| **acquired_time** | **Time** | The timestamp when the document version was acquired. | [optional] |
| **acquired_duration** | **String** | The expected amount of time for task execution. | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1AcquiredDocumentVersion.new(
  document_version_id: null,
  external_primary_key: null,
  direction: null,
  upload_url: null,
  raw_file_url: null,
  standardized_pdf_url: null,
  content_url: null,
  acquired_by: null,
  acquired_time: null,
  acquired_duration: null
)
```

