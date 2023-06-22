=begin comment

Able API

SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230622180011
Contact: support@able.ai
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by the OpenAPI Generator
# Please update the test cases below to test the model.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 2;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;


use_ok('AbleSDK::Object::V1Document');

my $instance = AbleSDK::Object::V1Document->new();

isa_ok($instance, 'AbleSDK::Object::V1Document');

