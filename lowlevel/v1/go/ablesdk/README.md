# Go API client for ablesdk

SDK for building integrations with Able.

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.20230621235520
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen
For more information, please visit [https://www.able.ai/contact](https://www.able.ai/contact)

## Installation

Install the following dependencies:

```shell
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
```

Put the package under your project folder and add the following in import:

```golang
import sw "./ablesdk"
```

To use a proxy, set the environment variable `HTTP_PROXY`:

```golang
os.Setenv("HTTP_PROXY", "http://proxy_name:proxy_port")
```

## Configuration of Server URL

Default configuration comes with `Servers` field that contains server objects as defined in the OpenAPI specification.

### Select Server Configuration

For using other server than the one defined on index 0 set context value `sw.ContextServerIndex` of type `int`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerIndex, 1)
```

### Templated Server URL

Templated server URL is formatted using default variables from configuration or from context value `sw.ContextServerVariables` of type `map[string]string`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerVariables, map[string]string{
	"basePath": "v2",
})
```

Note, enum values are always validated and all unused variables are silently ignored.

### URLs Configuration per Operation

Each operation can use different server URL defined using `OperationServers` map in the `Configuration`.
An operation is uniquely identifield by `"{classname}Service.{nickname}"` string.
Similar rules for overriding default operation server index and variables applies by using `sw.ContextOperationServerIndices` and `sw.ContextOperationServerVariables` context maps.

```
ctx := context.WithValue(context.Background(), sw.ContextOperationServerIndices, map[string]int{
	"{classname}Service.{nickname}": 2,
})
ctx = context.WithValue(context.Background(), sw.ContextOperationServerVariables, map[string]map[string]string{
	"{classname}Service.{nickname}": {
		"port": "8443",
	},
})
```

## Documentation for API Endpoints

All URIs are relative to *https://api.ableai.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*APIApi* | [**APIAcquireDocumentVersion**](docs/APIApi.md#apiacquiredocumentversion) | **Put** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire | Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
*APIApi* | [**APICompleteDocumentVersion**](docs/APIApi.md#apicompletedocumentversion) | **Put** /v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId} | Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
*APIApi* | [**APICreateDocumentVersion**](docs/APIApi.md#apicreatedocumentversion) | **Put** /v1/extensions/{extensionId}/documentVersion | Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.


## Documentation For Models

 - [InlineObject](docs/InlineObject.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [V1AcquireDocumentVersionRequestProperties](docs/V1AcquireDocumentVersionRequestProperties.md)
 - [V1AcquiredDocumentVersion](docs/V1AcquiredDocumentVersion.md)
 - [V1Attribute](docs/V1Attribute.md)
 - [V1AttributeType](docs/V1AttributeType.md)
 - [V1CompleteDocumentVersionRequestProperties](docs/V1CompleteDocumentVersionRequestProperties.md)
 - [V1CompletedDocumentVersion](docs/V1CompletedDocumentVersion.md)
 - [V1DataTransferDirection](docs/V1DataTransferDirection.md)
 - [V1Document](docs/V1Document.md)
 - [V1DocumentVersion](docs/V1DocumentVersion.md)
 - [V1DocumentVersionStatus](docs/V1DocumentVersionStatus.md)


## Documentation For Authorization

 Endpoints do not require authorization.


## Documentation for Utility Methods

Due to the fact that model structure members are all pointers, this package contains
a number of utility functions to easily obtain pointers to values of basic types.
Each of these functions takes a value of the given basic type and returns a pointer to it:

* `PtrBool`
* `PtrInt`
* `PtrInt32`
* `PtrInt64`
* `PtrFloat`
* `PtrFloat32`
* `PtrFloat64`
* `PtrString`
* `PtrTime`

## Author

support@able.ai
