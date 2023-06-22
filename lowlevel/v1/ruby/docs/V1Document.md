# AbleSDK::V1Document

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_primary_key** | **String** | The primary key of the document in the external system. | [optional] |
| **attributes** | [**Array&lt;V1Attribute&gt;**](V1Attribute.md) | Attributes associated with the document. | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1Document.new(
  external_primary_key: null,
  attributes: null
)
```

