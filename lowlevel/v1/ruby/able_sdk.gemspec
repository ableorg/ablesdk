# -*- encoding: utf-8 -*-

=begin
#Able API

#SDK for building integrations with Able.

The version of the OpenAPI document: 1.20230717220244
Contact: support@able.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

$:.push File.expand_path("../lib", __FILE__)
require "able_sdk/version"

Gem::Specification.new do |s|
  s.name        = "able_sdk"
  s.version     = AbleSDK::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["Able AI"]
  s.email       = ["support@able.ai"]
  s.homepage    = "https://openapi-generator.tech"
  s.summary     = "Able API Ruby Gem"
  s.description = "SDK for building integrations with Able."
  s.license     = "MIT"
  s.required_ruby_version = ">= 2.4"

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
