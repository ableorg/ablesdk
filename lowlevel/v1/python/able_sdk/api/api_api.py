"""
    Able API

    SDK for building integrations with Able.  # noqa: E501

    The version of the OpenAPI document: 1.20230615090446
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
from able_sdk.model.v1_relationship import V1Relationship
from able_sdk.model.v1_upload import V1Upload
from able_sdk.model.v1_upload_ref import V1UploadRef


class APIApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __a_pi_create_relationship(
            self,
            parent,
            relationship,
            **kwargs
        ):
            """Creates a new relationship.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_create_relationship(parent, relationship, async_req=True)
            >>> result = thread.get()

            Args:
                parent (str): The parent tenant resource name where this relationship will be created. Format: tenants/{tenant}
                relationship (V1Relationship): The relationship to create.

            Keyword Args:
                relationship_id (str): The ID to use for the relationship, which will become the final component of the relationship's resource name.  This value should be a valid XID.  If no ID is specified, an ID will be generated by the server.. [optional]
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
                V1Relationship
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
            kwargs['parent'] = \
                parent
            kwargs['relationship'] = \
                relationship
            return self.call_with_http_info(**kwargs)

        self.a_pi_create_relationship = _Endpoint(
            settings={
                'response_type': (V1Relationship,),
                'auth': [],
                'endpoint_path': '/v1/{parent}/relationships',
                'operation_id': 'a_pi_create_relationship',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'parent',
                    'relationship',
                    'relationship_id',
                ],
                'required': [
                    'parent',
                    'relationship',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'parent',
                ]
            },
            root_map={
                'validations': {
                    ('parent',): {

                        'regex': {
                            'pattern': r'tenants\/[^\/]+',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'parent':
                        (str,),
                    'relationship':
                        (V1Relationship,),
                    'relationship_id':
                        (str,),
                },
                'attribute_map': {
                    'parent': 'parent',
                    'relationship_id': 'relationshipId',
                },
                'location_map': {
                    'parent': 'path',
                    'relationship': 'body',
                    'relationship_id': 'query',
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
            callable=__a_pi_create_relationship
        )

        def __a_pi_create_upload(
            self,
            parent,
            upload,
            **kwargs
        ):
            """Creates a new upload.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_create_upload(parent, upload, async_req=True)
            >>> result = thread.get()

            Args:
                parent (str): The parent tenant and realtionship where this upload will be created. Format: tenants/{tenant}/realtionships/{realtionship}
                upload (V1Upload): The upload to create.

            Keyword Args:
                upload_id (str): The ID to use for the upload, which will become the final component of the upload's resource name.  This value should be a valid XID.  If no ID is specified, an ID will be generated by the server.. [optional]
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
                V1Upload
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
            kwargs['parent'] = \
                parent
            kwargs['upload'] = \
                upload
            return self.call_with_http_info(**kwargs)

        self.a_pi_create_upload = _Endpoint(
            settings={
                'response_type': (V1Upload,),
                'auth': [],
                'endpoint_path': '/v1/{parent}/uploads',
                'operation_id': 'a_pi_create_upload',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'parent',
                    'upload',
                    'upload_id',
                ],
                'required': [
                    'parent',
                    'upload',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'parent',
                ]
            },
            root_map={
                'validations': {
                    ('parent',): {

                        'regex': {
                            'pattern': r'tenants\/[^\/]+\/relationships\/[^\/]+',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'parent':
                        (str,),
                    'upload':
                        (V1Upload,),
                    'upload_id':
                        (str,),
                },
                'attribute_map': {
                    'parent': 'parent',
                    'upload_id': 'uploadId',
                },
                'location_map': {
                    'parent': 'path',
                    'upload': 'body',
                    'upload_id': 'query',
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
            callable=__a_pi_create_upload
        )

        def __a_pi_start_upload(
            self,
            parent,
            body,
            **kwargs
        ):
            """Creates an upload session to start uploading a file.  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.a_pi_start_upload(parent, body, async_req=True)
            >>> result = thread.get()

            Args:
                parent (str): The parent upload to be started. Format: tenants/{tenant}/realtionships/{realtionship}/uploads/{upload}
                body ({str: (bool, date, datetime, dict, float, int, list, str, none_type)}):

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
                V1UploadRef
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
            kwargs['parent'] = \
                parent
            kwargs['body'] = \
                body
            return self.call_with_http_info(**kwargs)

        self.a_pi_start_upload = _Endpoint(
            settings={
                'response_type': (V1UploadRef,),
                'auth': [],
                'endpoint_path': '/v1/{parent}:startUpload',
                'operation_id': 'a_pi_start_upload',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'parent',
                    'body',
                ],
                'required': [
                    'parent',
                    'body',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'parent',
                ]
            },
            root_map={
                'validations': {
                    ('parent',): {

                        'regex': {
                            'pattern': r'tenants\/[^\/]+\/relationships\/[^\/]+\/uploads',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'parent':
                        (str,),
                    'body':
                        ({str: (bool, date, datetime, dict, float, int, list, str, none_type)},),
                },
                'attribute_map': {
                    'parent': 'parent',
                },
                'location_map': {
                    'parent': 'path',
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
            callable=__a_pi_start_upload
        )
