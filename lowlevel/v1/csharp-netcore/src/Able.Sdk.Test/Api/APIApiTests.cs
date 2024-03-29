/*
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230727053012
 * Contact: support@able.ai
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Able.Sdk.Client;
using Able.Sdk.Api;
// uncomment below to import models
//using Able.Sdk.Model;

namespace Able.Sdk.Test.Api
{
    /// <summary>
    ///  Class for testing APIApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class APIApiTests : IDisposable
    {
        private APIApi instance;

        public APIApiTests()
        {
            instance = new APIApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of APIApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' APIApi
            //Assert.IsType<APIApi>(instance);
        }

        /// <summary>
        /// Test APIAcquireDocumentContentV1
        /// </summary>
        [Fact]
        public void APIAcquireDocumentContentV1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string extensionId = null;
            //string workerName = null;
            //V1AcquireDocumentContentRequestV1Body body = null;
            //var response = instance.APIAcquireDocumentContentV1(extensionId, workerName, body);
            //Assert.IsType<V1AcquiredDocumentContentV1>(response);
        }

        /// <summary>
        /// Test APICompleteDocumentContentV1
        /// </summary>
        [Fact]
        public void APICompleteDocumentContentV1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string extensionId = null;
            //string workerName = null;
            //string documentContentId = null;
            //V1CompleteDocumentContentRequestV1Body body = null;
            //var response = instance.APICompleteDocumentContentV1(extensionId, workerName, documentContentId, body);
            //Assert.IsType<V1CompletedDocumentContentV1>(response);
        }

        /// <summary>
        /// Test APICreateDocumentContentV1
        /// </summary>
        [Fact]
        public void APICreateDocumentContentV1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string extensionId = null;
            //V1CreateDocumentContentRequestV1Body body = null;
            //var response = instance.APICreateDocumentContentV1(extensionId, body);
            //Assert.IsType<V1DocumentContent>(response);
        }
    }
}
