# V1CreateDocumentContentRequestV1Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Documents** | Pointer to [**[]V1Document**](V1Document.md) | A list of documents to be added to the DocumentContent. | [optional] 

## Methods

### NewV1CreateDocumentContentRequestV1Body

`func NewV1CreateDocumentContentRequestV1Body() *V1CreateDocumentContentRequestV1Body`

NewV1CreateDocumentContentRequestV1Body instantiates a new V1CreateDocumentContentRequestV1Body object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1CreateDocumentContentRequestV1BodyWithDefaults

`func NewV1CreateDocumentContentRequestV1BodyWithDefaults() *V1CreateDocumentContentRequestV1Body`

NewV1CreateDocumentContentRequestV1BodyWithDefaults instantiates a new V1CreateDocumentContentRequestV1Body object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDocuments

`func (o *V1CreateDocumentContentRequestV1Body) GetDocuments() []V1Document`

GetDocuments returns the Documents field if non-nil, zero value otherwise.

### GetDocumentsOk

`func (o *V1CreateDocumentContentRequestV1Body) GetDocumentsOk() (*[]V1Document, bool)`

GetDocumentsOk returns a tuple with the Documents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocuments

`func (o *V1CreateDocumentContentRequestV1Body) SetDocuments(v []V1Document)`

SetDocuments sets Documents field to given value.

### HasDocuments

`func (o *V1CreateDocumentContentRequestV1Body) HasDocuments() bool`

HasDocuments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


