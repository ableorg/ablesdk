=begin
#Able API

#SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230717220244
Contact: support@able.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'spec_helper'

describe AbleSDK::Configuration do
  let(:config) { AbleSDK::Configuration.default }

  before(:each) do
    # uncomment below to setup host and base_path
    # require 'URI'
    # uri = URI.parse("https://api.ableai.com")
    # AbleSDK.configure do |c|
    #   c.host = uri.host
    #   c.base_path = uri.path
    # end
  end

  describe '#base_url' do
    it 'should have the default value' do
      # uncomment below to test default value of the base path
      # expect(config.base_url).to eq("https://api.ableai.com")
    end

    it 'should remove trailing slashes' do
      [nil, '', '/', '//'].each do |base_path|
        config.base_path = base_path
        # uncomment below to test trailing slashes
        # expect(config.base_url).to eq("https://api.ableai.com")
      end
    end
  end
end
