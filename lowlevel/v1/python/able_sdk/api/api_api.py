"""
    Able API

    SDK for building integrations with Able.  # noqa: E501

    The version of the OpenAPI document: 1.20230621235520
    Contact: support@able.ai
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from able_sdk.api_client import ApiClient, Endpoint as _Endpoint
from able_sdk.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from able_sdk.model.inline_object import InlineObject
from able_sdk.model.rpc_status import RpcStatus
from able_sdk.model.v1_acquire_document_version_request_properties import V1AcquireDocumentVersionRequestProperties
from able_sdk.model.v1_acquired_document_version import V1AcquiredDocumentVersion
from able_sdk.model.v1_complete_document_version_request_properties import V1CompleteDocumentVersionRequestProperties
from able_sdk.model.v1_completed_document_version import V1CompletedDocumentVersion
from able_sdk.model.v1_document_version import V1DocumentVersion


class APIApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __a_pi_acquire_document_version(
            self,
            extension_id,
            worker_name,
            properties,
            **kwargs
        ):
            """Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_acquire_document_version(extension_id, worker_name, properties, async_req=True)
            >>> result = thread.get()

            Args:
                extension_id (str): The unique ID of the extension.
                worker_name (str): The name of the worker that will process the task.
                properties (V1AcquireDocumentVersionRequestProperties):

            Keyword Args:
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                V1AcquiredDocumentVersion
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['extension_id'] = \
                extension_id
            kwargs['worker_name'] = \
                worker_name
            kwargs['properties'] = \
                properties
            return self.call_with_http_info(**kwargs)

        self.a_pi_acquire_document_version = _Endpoint(
            settings={
                'response_type': (V1AcquiredDocumentVersion,),
                'auth': [],
                'endpoint_path': '/v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire',
                'operation_id': 'a_pi_acquire_document_version',
                'http_method': 'PUT',
                'servers': None,
            },
            params_map={
                'all': [
                    'extension_id',
                    'worker_name',
                    'properties',
                ],
                'required': [
                    'extension_id',
                    'worker_name',
                    'properties',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'extension_id':
                        (str,),
                    'worker_name':
                        (str,),
                    'properties':
                        (V1AcquireDocumentVersionRequestProperties,),
                },
                'attribute_map': {
                    'extension_id': 'extensionId',
                    'worker_name': 'workerName',
                },
                'location_map': {
                    'extension_id': 'path',
                    'worker_name': 'path',
                    'properties': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__a_pi_acquire_document_version
        )

        def __a_pi_complete_document_version(
            self,
            extension_id,
            worker_name,
            document_version_id,
            properties,
            **kwargs
        ):
            """Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_complete_document_version(extension_id, worker_name, document_version_id, properties, async_req=True)
            >>> result = thread.get()

            Args:
                extension_id (str): The unique ID of the extension.
                worker_name (str): The name of the worker that processed the task.
                document_version_id (str): The ID of the document version that was processed.
                properties (V1CompleteDocumentVersionRequestProperties):

            Keyword Args:
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                V1CompletedDocumentVersion
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['extension_id'] = \
                extension_id
            kwargs['worker_name'] = \
                worker_name
            kwargs['document_version_id'] = \
                document_version_id
            kwargs['properties'] = \
                properties
            return self.call_with_http_info(**kwargs)

        self.a_pi_complete_document_version = _Endpoint(
            settings={
                'response_type': (V1CompletedDocumentVersion,),
                'auth': [],
                'endpoint_path': '/v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId}',
                'operation_id': 'a_pi_complete_document_version',
                'http_method': 'PUT',
                'servers': None,
            },
            params_map={
                'all': [
                    'extension_id',
                    'worker_name',
                    'document_version_id',
                    'properties',
                ],
                'required': [
                    'extension_id',
                    'worker_name',
                    'document_version_id',
                    'properties',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'extension_id':
                        (str,),
                    'worker_name':
                        (str,),
                    'document_version_id':
                        (str,),
                    'properties':
                        (V1CompleteDocumentVersionRequestProperties,),
                },
                'attribute_map': {
                    'extension_id': 'extensionId',
                    'worker_name': 'workerName',
                    'document_version_id': 'documentVersionId',
                },
                'location_map': {
                    'extension_id': 'path',
                    'worker_name': 'path',
                    'document_version_id': 'path',
                    'properties': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__a_pi_complete_document_version
        )

        def __a_pi_create_document_version(
            self,
            extension_id,
            body,
            **kwargs
        ):
            """Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_create_document_version(extension_id, body, async_req=True)
            >>> result = thread.get()

            Args:
                extension_id (str): The unique ID of the extension.
                body (InlineObject):

            Keyword Args:
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                V1DocumentVersion
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['extension_id'] = \
                extension_id
            kwargs['body'] = \
                body
            return self.call_with_http_info(**kwargs)

        self.a_pi_create_document_version = _Endpoint(
            settings={
                'response_type': (V1DocumentVersion,),
                'auth': [],
                'endpoint_path': '/v1/extensions/{extensionId}/documentVersion',
                'operation_id': 'a_pi_create_document_version',
                'http_method': 'PUT',
                'servers': None,
            },
            params_map={
                'all': [
                    'extension_id',
                    'body',
                ],
                'required': [
                    'extension_id',
                    'body',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'extension_id':
                        (str,),
                    'body':
                        (InlineObject,),
                },
                'attribute_map': {
                    'extension_id': 'extensionId',
                },
                'location_map': {
                    'extension_id': 'path',
                    'body': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__a_pi_create_document_version
        )