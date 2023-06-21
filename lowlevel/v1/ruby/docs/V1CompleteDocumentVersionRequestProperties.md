# AbleSDK::V1CompleteDocumentVersionRequestProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | [default to &#39;DOCUMENT_VERSION_STATUS_UNSPECIFIED&#39;] |
| **last_error** | **String** | Any error message generated during processing, empty if status is COMPLETE. | [optional] |
| **attributes** | [**Array&lt;V1Attribute&gt;**](V1Attribute.md) | Any attributes extracted from the document during processing. | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1CompleteDocumentVersionRequestProperties.new(
  status: null,
  last_error: null,
  attributes: null
)
```

