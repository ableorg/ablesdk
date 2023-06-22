# AbleSDK::RpcStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Integer** |  | [optional] |
| **message** | **String** |  | [optional] |
| **details** | [**Array&lt;ProtobufAny&gt;**](ProtobufAny.md) |  | [optional] |

## Example

```ruby
require 'able_sdk'

instance = AbleSDK::RpcStatus.new(
  code: null,
  message: null,
  details: null
)
```

