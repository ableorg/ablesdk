# AbleSDK::Object::V1CompleteDocumentVersionRequestProperties

## Load the model package
```perl
use AbleSDK::Object::V1CompleteDocumentVersionRequestProperties;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**V1DocumentVersionStatus**](V1DocumentVersionStatus.md) |  | 
**last_error** | **string** | Any error message generated during processing, empty if status is COMPLETE. | [optional] 
**attributes** | [**ARRAY[V1Attribute]**](V1Attribute.md) | Any attributes extracted from the document during processing. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


