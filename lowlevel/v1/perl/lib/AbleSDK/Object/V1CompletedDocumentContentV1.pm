=begin comment

Able API

SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230628184958
Contact: support@able.ai
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package AbleSDK::Object::V1CompletedDocumentContentV1;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use AbleSDK::Object::V1DocumentContentStatusV1;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#Represents a DocumentContent that has been completed after processing.
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

Able API

SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230628184958
Contact: support@able.ai
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new { 
    my ($class, %args) = @_; 

    my $self = bless {}, $class;

    $self->init(%args);
    
    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "AbleSDK::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => 'Represents a DocumentContent that has been completed after processing.',
                                  class => 'V1CompletedDocumentContentV1',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'document_content_id' => {
        datatype => 'string',
        base_name => 'documentContentId',
        description => 'The ID of the document content.',
        format => '',
        read_only => '',
            },
    'status' => {
        datatype => 'V1DocumentContentStatusV1',
        base_name => 'status',
        description => '',
        format => '',
        read_only => '',
            },
    'last_error' => {
        datatype => 'string',
        base_name => 'lastError',
        description => 'Any error message generated during processing, empty if status is COMPLETE.',
        format => '',
        read_only => '',
            },
    'acquired_by' => {
        datatype => 'string',
        base_name => 'acquiredBy',
        description => 'The name of the worker that acquired the document content.',
        format => '',
        read_only => '',
            },
    'acquired_time' => {
        datatype => 'DateTime',
        base_name => 'acquiredTime',
        description => 'The timestamp when the document content was acquired.',
        format => '',
        read_only => '',
            },
    'completed_by' => {
        datatype => 'string',
        base_name => 'completedBy',
        description => 'The name of the worker that completed the document content.',
        format => '',
        read_only => '',
            },
    'completed_time' => {
        datatype => 'DateTime',
        base_name => 'completedTime',
        description => 'The timestamp when the document content was completed.',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'document_content_id' => 'string',
    'status' => 'V1DocumentContentStatusV1',
    'last_error' => 'string',
    'acquired_by' => 'string',
    'acquired_time' => 'DateTime',
    'completed_by' => 'string',
    'completed_time' => 'DateTime'
} );

__PACKAGE__->attribute_map( {
    'document_content_id' => 'documentContentId',
    'status' => 'status',
    'last_error' => 'lastError',
    'acquired_by' => 'acquiredBy',
    'acquired_time' => 'acquiredTime',
    'completed_by' => 'completedBy',
    'completed_time' => 'completedTime'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
