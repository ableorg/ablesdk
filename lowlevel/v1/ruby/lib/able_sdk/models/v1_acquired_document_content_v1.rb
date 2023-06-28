=begin
#Able API

#SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230628184958
Contact: support@able.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'date'
require 'time'

module AbleSDK
  # Represents a DocumentContent that has been acquired for processing.
  class V1AcquiredDocumentContentV1
    # The ID of the document content.
    attr_accessor :document_content_id

    # The primary key of the document in the external system.
    attr_accessor :external_primary_key

    attr_accessor :direction

    # The upload URL for the document file in GCS.
    attr_accessor :upload_url

    # The download URL for the raw document file in GCS.
    attr_accessor :raw_file_url

    # The download URL for the standardized PDF file in GCS.
    attr_accessor :standardized_pdf_url

    # The download URL for the content file in GCS.
    attr_accessor :content_url

    # The name of the worker that acquired the document content.
    attr_accessor :acquired_by

    # The timestamp when the document content was acquired.
    attr_accessor :acquired_time

    # The expected time of task compleation. If not completed before this time, the task will be retried.
    attr_accessor :next_retry_time

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'document_content_id' => :'documentContentId',
        :'external_primary_key' => :'externalPrimaryKey',
        :'direction' => :'direction',
        :'upload_url' => :'uploadUrl',
        :'raw_file_url' => :'rawFileUrl',
        :'standardized_pdf_url' => :'standardizedPdfUrl',
        :'content_url' => :'contentUrl',
        :'acquired_by' => :'acquiredBy',
        :'acquired_time' => :'acquiredTime',
        :'next_retry_time' => :'nextRetryTime'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'document_content_id' => :'String',
        :'external_primary_key' => :'String',
        :'direction' => :'V1DataTransferDirectionV1',
        :'upload_url' => :'String',
        :'raw_file_url' => :'String',
        :'standardized_pdf_url' => :'String',
        :'content_url' => :'String',
        :'acquired_by' => :'String',
        :'acquired_time' => :'Time',
        :'next_retry_time' => :'Time'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `AbleSDK::V1AcquiredDocumentContentV1` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `AbleSDK::V1AcquiredDocumentContentV1`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'document_content_id')
        self.document_content_id = attributes[:'document_content_id']
      end

      if attributes.key?(:'external_primary_key')
        self.external_primary_key = attributes[:'external_primary_key']
      end

      if attributes.key?(:'direction')
        self.direction = attributes[:'direction']
      else
        self.direction = 'DATA_TRANSFER_DIRECTION_UNSPECIFIED'
      end

      if attributes.key?(:'upload_url')
        self.upload_url = attributes[:'upload_url']
      end

      if attributes.key?(:'raw_file_url')
        self.raw_file_url = attributes[:'raw_file_url']
      end

      if attributes.key?(:'standardized_pdf_url')
        self.standardized_pdf_url = attributes[:'standardized_pdf_url']
      end

      if attributes.key?(:'content_url')
        self.content_url = attributes[:'content_url']
      end

      if attributes.key?(:'acquired_by')
        self.acquired_by = attributes[:'acquired_by']
      end

      if attributes.key?(:'acquired_time')
        self.acquired_time = attributes[:'acquired_time']
      end

      if attributes.key?(:'next_retry_time')
        self.next_retry_time = attributes[:'next_retry_time']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          document_content_id == o.document_content_id &&
          external_primary_key == o.external_primary_key &&
          direction == o.direction &&
          upload_url == o.upload_url &&
          raw_file_url == o.raw_file_url &&
          standardized_pdf_url == o.standardized_pdf_url &&
          content_url == o.content_url &&
          acquired_by == o.acquired_by &&
          acquired_time == o.acquired_time &&
          next_retry_time == o.next_retry_time
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [document_content_id, external_primary_key, direction, upload_url, raw_file_url, standardized_pdf_url, content_url, acquired_by, acquired_time, next_retry_time].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = AbleSDK.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
