"""
    Able API

    SDK for building integrations with Able.  # noqa: E501

    The version of the OpenAPI document: 1.20230727053012
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
from able_sdk.model.rpc_status import RpcStatus
from able_sdk.model.v1_acquire_document_content_request_v1_body import V1AcquireDocumentContentRequestV1Body
from able_sdk.model.v1_acquired_document_content_v1 import V1AcquiredDocumentContentV1
from able_sdk.model.v1_complete_document_content_request_v1_body import V1CompleteDocumentContentRequestV1Body
from able_sdk.model.v1_completed_document_content_v1 import V1CompletedDocumentContentV1
from able_sdk.model.v1_create_document_content_request_v1_body import V1CreateDocumentContentRequestV1Body
from able_sdk.model.v1_document_content import V1DocumentContent


class APIApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __a_pi_acquire_document_content_v1(
            self,
            extension_id,
            worker_name,
            body,
            **kwargs
        ):
            """Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_acquire_document_content_v1(extension_id, worker_name, body, async_req=True)
            >>> result = thread.get()

            Args:
                extension_id (str): The unique ID of the extension.
                worker_name (str): The name of the worker that will process the task.
                body (V1AcquireDocumentContentRequestV1Body):

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
                V1AcquiredDocumentContentV1
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
            kwargs['body'] = \
                body
            return self.call_with_http_info(**kwargs)

        self.a_pi_acquire_document_content_v1 = _Endpoint(
            settings={
                'response_type': (V1AcquiredDocumentContentV1,),
                'auth': [],
                'endpoint_path': '/v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire',
                'operation_id': 'a_pi_acquire_document_content_v1',
                'http_method': 'PUT',
                'servers': None,
            },
            params_map={
                'all': [
                    'extension_id',
                    'worker_name',
                    'body',
                ],
                'required': [
                    'extension_id',
                    'worker_name',
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
                    'worker_name':
                        (str,),
                    'body':
                        (V1AcquireDocumentContentRequestV1Body,),
                },
                'attribute_map': {
                    'extension_id': 'extensionId',
                    'worker_name': 'workerName',
                },
                'location_map': {
                    'extension_id': 'path',
                    'worker_name': 'path',
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
            callable=__a_pi_acquire_document_content_v1
        )

        def __a_pi_complete_document_content_v1(
            self,
            extension_id,
            worker_name,
            document_content_id,
            body,
            **kwargs
        ):
            """Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_complete_document_content_v1(extension_id, worker_name, document_content_id, body, async_req=True)
            >>> result = thread.get()

            Args:
                extension_id (str): The unique ID of the extension.
                worker_name (str): The name of the worker that processed the task.
                document_content_id (str): The ID of the document content that was processed.
                body (V1CompleteDocumentContentRequestV1Body):

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
                V1CompletedDocumentContentV1
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
            kwargs['document_content_id'] = \
                document_content_id
            kwargs['body'] = \
                body
            return self.call_with_http_info(**kwargs)

        self.a_pi_complete_document_content_v1 = _Endpoint(
            settings={
                'response_type': (V1CompletedDocumentContentV1,),
                'auth': [],
                'endpoint_path': '/v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId}',
                'operation_id': 'a_pi_complete_document_content_v1',
                'http_method': 'PUT',
                'servers': None,
            },
            params_map={
                'all': [
                    'extension_id',
                    'worker_name',
                    'document_content_id',
                    'body',
                ],
                'required': [
                    'extension_id',
                    'worker_name',
                    'document_content_id',
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
                    'worker_name':
                        (str,),
                    'document_content_id':
                        (str,),
                    'body':
                        (V1CompleteDocumentContentRequestV1Body,),
                },
                'attribute_map': {
                    'extension_id': 'extensionId',
                    'worker_name': 'workerName',
                    'document_content_id': 'documentContentId',
                },
                'location_map': {
                    'extension_id': 'path',
                    'worker_name': 'path',
                    'document_content_id': 'path',
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
            callable=__a_pi_complete_document_content_v1
        )

        def __a_pi_create_document_content_v1(
            self,
            extension_id,
            body,
            **kwargs
        ):
            """Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_create_document_content_v1(extension_id, body, async_req=True)
            >>> result = thread.get()

            Args:
                extension_id (str): The unique ID of the extension.
                body (V1CreateDocumentContentRequestV1Body):

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
                V1DocumentContent
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

        self.a_pi_create_document_content_v1 = _Endpoint(
            settings={
                'response_type': (V1DocumentContent,),
                'auth': [],
                'endpoint_path': '/v1/extensions/{extensionId}/documentContent',
                'operation_id': 'a_pi_create_document_content_v1',
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
                        (V1CreateDocumentContentRequestV1Body,),
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
            callable=__a_pi_create_document_content_v1
        )
