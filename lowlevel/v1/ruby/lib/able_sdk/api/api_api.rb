=begin
#Able API

#SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230727053012
Contact: support@able.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'cgi'

module AbleSDK
  class APIApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
    # @param extension_id [String] The unique ID of the extension.
    # @param worker_name [String] The name of the worker that will process the task.
    # @param body [V1AcquireDocumentContentRequestV1Body] 
    # @param [Hash] opts the optional parameters
    # @return [V1AcquiredDocumentContentV1]
    def a_pi_acquire_document_content_v1(extension_id, worker_name, body, opts = {})
      data, _status_code, _headers = a_pi_acquire_document_content_v1_with_http_info(extension_id, worker_name, body, opts)
      data
    end

    # Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
    # @param extension_id [String] The unique ID of the extension.
    # @param worker_name [String] The name of the worker that will process the task.
    # @param body [V1AcquireDocumentContentRequestV1Body] 
    # @param [Hash] opts the optional parameters
    # @return [Array<(V1AcquiredDocumentContentV1, Integer, Hash)>] V1AcquiredDocumentContentV1 data, response status code and response headers
    def a_pi_acquire_document_content_v1_with_http_info(extension_id, worker_name, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: APIApi.a_pi_acquire_document_content_v1 ...'
      end
      # verify the required parameter 'extension_id' is set
      if @api_client.config.client_side_validation && extension_id.nil?
        fail ArgumentError, "Missing the required parameter 'extension_id' when calling APIApi.a_pi_acquire_document_content_v1"
      end
      # verify the required parameter 'worker_name' is set
      if @api_client.config.client_side_validation && worker_name.nil?
        fail ArgumentError, "Missing the required parameter 'worker_name' when calling APIApi.a_pi_acquire_document_content_v1"
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling APIApi.a_pi_acquire_document_content_v1"
      end
      # resource path
      local_var_path = '/v1/extensions/{extensionId}/documentContentQueue/{workerName}/acquire'.sub('{' + 'extensionId' + '}', CGI.escape(extension_id.to_s)).sub('{' + 'workerName' + '}', CGI.escape(worker_name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(body)

      # return_type
      return_type = opts[:debug_return_type] || 'V1AcquiredDocumentContentV1'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"APIApi.a_pi_acquire_document_content_v1",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: APIApi#a_pi_acquire_document_content_v1\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
    # @param extension_id [String] The unique ID of the extension.
    # @param worker_name [String] The name of the worker that processed the task.
    # @param document_content_id [String] The ID of the document content that was processed.
    # @param body [V1CompleteDocumentContentRequestV1Body] 
    # @param [Hash] opts the optional parameters
    # @return [V1CompletedDocumentContentV1]
    def a_pi_complete_document_content_v1(extension_id, worker_name, document_content_id, body, opts = {})
      data, _status_code, _headers = a_pi_complete_document_content_v1_with_http_info(extension_id, worker_name, document_content_id, body, opts)
      data
    end

    # Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
    # @param extension_id [String] The unique ID of the extension.
    # @param worker_name [String] The name of the worker that processed the task.
    # @param document_content_id [String] The ID of the document content that was processed.
    # @param body [V1CompleteDocumentContentRequestV1Body] 
    # @param [Hash] opts the optional parameters
    # @return [Array<(V1CompletedDocumentContentV1, Integer, Hash)>] V1CompletedDocumentContentV1 data, response status code and response headers
    def a_pi_complete_document_content_v1_with_http_info(extension_id, worker_name, document_content_id, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: APIApi.a_pi_complete_document_content_v1 ...'
      end
      # verify the required parameter 'extension_id' is set
      if @api_client.config.client_side_validation && extension_id.nil?
        fail ArgumentError, "Missing the required parameter 'extension_id' when calling APIApi.a_pi_complete_document_content_v1"
      end
      # verify the required parameter 'worker_name' is set
      if @api_client.config.client_side_validation && worker_name.nil?
        fail ArgumentError, "Missing the required parameter 'worker_name' when calling APIApi.a_pi_complete_document_content_v1"
      end
      # verify the required parameter 'document_content_id' is set
      if @api_client.config.client_side_validation && document_content_id.nil?
        fail ArgumentError, "Missing the required parameter 'document_content_id' when calling APIApi.a_pi_complete_document_content_v1"
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling APIApi.a_pi_complete_document_content_v1"
      end
      # resource path
      local_var_path = '/v1/extensions/{extensionId}/documentContentQueue/{workerName}/complete/{documentContentId}'.sub('{' + 'extensionId' + '}', CGI.escape(extension_id.to_s)).sub('{' + 'workerName' + '}', CGI.escape(worker_name.to_s)).sub('{' + 'documentContentId' + '}', CGI.escape(document_content_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(body)

      # return_type
      return_type = opts[:debug_return_type] || 'V1CompletedDocumentContentV1'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"APIApi.a_pi_complete_document_content_v1",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: APIApi#a_pi_complete_document_content_v1\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
    # @param extension_id [String] The unique ID of the extension.
    # @param body [V1CreateDocumentContentRequestV1Body] 
    # @param [Hash] opts the optional parameters
    # @return [V1DocumentContent]
    def a_pi_create_document_content_v1(extension_id, body, opts = {})
      data, _status_code, _headers = a_pi_create_document_content_v1_with_http_info(extension_id, body, opts)
      data
    end

    # Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed.
    # @param extension_id [String] The unique ID of the extension.
    # @param body [V1CreateDocumentContentRequestV1Body] 
    # @param [Hash] opts the optional parameters
    # @return [Array<(V1DocumentContent, Integer, Hash)>] V1DocumentContent data, response status code and response headers
    def a_pi_create_document_content_v1_with_http_info(extension_id, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: APIApi.a_pi_create_document_content_v1 ...'
      end
      # verify the required parameter 'extension_id' is set
      if @api_client.config.client_side_validation && extension_id.nil?
        fail ArgumentError, "Missing the required parameter 'extension_id' when calling APIApi.a_pi_create_document_content_v1"
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling APIApi.a_pi_create_document_content_v1"
      end
      # resource path
      local_var_path = '/v1/extensions/{extensionId}/documentContent'.sub('{' + 'extensionId' + '}', CGI.escape(extension_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(body)

      # return_type
      return_type = opts[:debug_return_type] || 'V1DocumentContent'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"APIApi.a_pi_create_document_content_v1",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: APIApi#a_pi_create_document_content_v1\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
