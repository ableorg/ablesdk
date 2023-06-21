=begin comment

Able API

SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230621235520
Contact: support@able.ai
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package AbleSDK::APIApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use AbleSDK::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'AbleSDK::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = AbleSDK::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# a_pi_acquire_document_version
#
# Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.
# 
# @param string $extension_id The unique ID of the extension. (required)
# @param string $worker_name The name of the worker that will process the task. (required)
# @param V1AcquireDocumentVersionRequestProperties $properties  (required)
{
    my $params = {
    'extension_id' => {
        data_type => 'string',
        description => 'The unique ID of the extension.',
        required => '1',
    },
    'worker_name' => {
        data_type => 'string',
        description => 'The name of the worker that will process the task.',
        required => '1',
    },
    'properties' => {
        data_type => 'V1AcquireDocumentVersionRequestProperties',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'a_pi_acquire_document_version' } = { 
        summary => 'Acquires a DocumentVersion task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers.',
        params => $params,
        returns => 'V1AcquiredDocumentVersion',
        };
}
# @return V1AcquiredDocumentVersion
#
sub a_pi_acquire_document_version {
    my ($self, %args) = @_;

    # verify the required parameter 'extension_id' is set
    unless (exists $args{'extension_id'}) {
      croak("Missing the required parameter 'extension_id' when calling a_pi_acquire_document_version");
    }

    # verify the required parameter 'worker_name' is set
    unless (exists $args{'worker_name'}) {
      croak("Missing the required parameter 'worker_name' when calling a_pi_acquire_document_version");
    }

    # verify the required parameter 'properties' is set
    unless (exists $args{'properties'}) {
      croak("Missing the required parameter 'properties' when calling a_pi_acquire_document_version");
    }

    # parse inputs
    my $_resource_path = '/v1/extensions/{extensionId}/documentVersionQueue/{workerName}/acquire';

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # path params
    if ( exists $args{'extension_id'}) {
        my $_base_variable = "{" . "extensionId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'extension_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'worker_name'}) {
        my $_base_variable = "{" . "workerName" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'worker_name'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'properties'}) {
        $_body_data = $args{'properties'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('V1AcquiredDocumentVersion', $response);
    return $_response_object;
}

#
# a_pi_complete_document_version
#
# Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.
# 
# @param string $extension_id The unique ID of the extension. (required)
# @param string $worker_name The name of the worker that processed the task. (required)
# @param string $document_version_id The ID of the document version that was processed. (required)
# @param V1CompleteDocumentVersionRequestProperties $properties  (required)
{
    my $params = {
    'extension_id' => {
        data_type => 'string',
        description => 'The unique ID of the extension.',
        required => '1',
    },
    'worker_name' => {
        data_type => 'string',
        description => 'The name of the worker that processed the task.',
        required => '1',
    },
    'document_version_id' => {
        data_type => 'string',
        description => 'The ID of the document version that was processed.',
        required => '1',
    },
    'properties' => {
        data_type => 'V1CompleteDocumentVersionRequestProperties',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'a_pi_complete_document_version' } = { 
        summary => 'Completes a DocumentVersion task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request.',
        params => $params,
        returns => 'V1CompletedDocumentVersion',
        };
}
# @return V1CompletedDocumentVersion
#
sub a_pi_complete_document_version {
    my ($self, %args) = @_;

    # verify the required parameter 'extension_id' is set
    unless (exists $args{'extension_id'}) {
      croak("Missing the required parameter 'extension_id' when calling a_pi_complete_document_version");
    }

    # verify the required parameter 'worker_name' is set
    unless (exists $args{'worker_name'}) {
      croak("Missing the required parameter 'worker_name' when calling a_pi_complete_document_version");
    }

    # verify the required parameter 'document_version_id' is set
    unless (exists $args{'document_version_id'}) {
      croak("Missing the required parameter 'document_version_id' when calling a_pi_complete_document_version");
    }

    # verify the required parameter 'properties' is set
    unless (exists $args{'properties'}) {
      croak("Missing the required parameter 'properties' when calling a_pi_complete_document_version");
    }

    # parse inputs
    my $_resource_path = '/v1/extensions/{extensionId}/documentVersionQueue/{workerName}/complete/{documentVersionId}';

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # path params
    if ( exists $args{'extension_id'}) {
        my $_base_variable = "{" . "extensionId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'extension_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'worker_name'}) {
        my $_base_variable = "{" . "workerName" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'worker_name'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'document_version_id'}) {
        my $_base_variable = "{" . "documentVersionId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'document_version_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'properties'}) {
        $_body_data = $args{'properties'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('V1CompletedDocumentVersion', $response);
    return $_response_object;
}

#
# a_pi_create_document_version
#
# Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.
# 
# @param string $extension_id The unique ID of the extension. (required)
# @param InlineObject $body  (required)
{
    my $params = {
    'extension_id' => {
        data_type => 'string',
        description => 'The unique ID of the extension.',
        required => '1',
    },
    'body' => {
        data_type => 'InlineObject',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'a_pi_create_document_version' } = { 
        summary => 'Creates a new DocumentVersion. The DocumentVersion represents a document from an external system that needs to be processed.',
        params => $params,
        returns => 'V1DocumentVersion',
        };
}
# @return V1DocumentVersion
#
sub a_pi_create_document_version {
    my ($self, %args) = @_;

    # verify the required parameter 'extension_id' is set
    unless (exists $args{'extension_id'}) {
      croak("Missing the required parameter 'extension_id' when calling a_pi_create_document_version");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling a_pi_create_document_version");
    }

    # parse inputs
    my $_resource_path = '/v1/extensions/{extensionId}/documentVersion';

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # path params
    if ( exists $args{'extension_id'}) {
        my $_base_variable = "{" . "extensionId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'extension_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('V1DocumentVersion', $response);
    return $_response_object;
}

1;
