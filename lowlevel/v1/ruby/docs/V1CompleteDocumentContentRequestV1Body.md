# AbleSDK::V1CompleteDocumentContentRequestV1Body

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**V1DocumentContentStatusV1**](V1DocumentContentStatusV1.md) |  | [default to &#39;DOCUMENT_CONTENT_STATUS_UNSPECIFIED&#39;] |
| **last_error** | **String** | Any error message generated during processing, empty if status is COMPLETE. | [optional] |
| **attributes** | [**Array&lt;V1Attribute&gt;**](V1Attribute.md) | Any attributes extracted from the document during processing. | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1CompleteDocumentContentRequestV1Body.new(
  status: null,
  last_error: null,
  attributes: null
)
```

