=begin
#Able API

#SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230621235520
Contact: support@able.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'date'
require 'time'

module AbleSDK
  class V1DocumentVersionStatus
    DOCUMENT_VERSION_STATUS_UNSPECIFIED = "DOCUMENT_VERSION_STATUS_UNSPECIFIED".freeze
    COMPLETE = "COMPLETE".freeze
    ERROR = "ERROR".freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = V1DocumentVersionStatus.constants.select { |c| V1DocumentVersionStatus::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #V1DocumentVersionStatus" if constantValues.empty?
      value
    end
  end
end