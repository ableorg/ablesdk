# AbleSDK::V1Attribute

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key** | **String** | The key of the attribute. |  |
| **value** | **String** | The value of the attribute. |  |
| **type** | [**V1AttributeType**](V1AttributeType.md) |  | [default to &#39;ATTRIBUTE_TYPE_UNSPECIFIED&#39;] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::V1Attribute.new(
  key: null,
  value: null,
  type: null
)
```

