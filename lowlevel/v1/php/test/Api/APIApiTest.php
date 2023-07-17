<?php
/**
 * APIApiTest
 * PHP version 7.2
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Able API
 *
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230717220244
 * Contact: support@able.ai
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.0.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Client\Test\Api;

use \OpenAPI\Client\Configuration;
use \OpenAPI\Client\ApiException;
use \OpenAPI\Client\ObjectSerializer;
use PHPUnit\Framework\TestCase;

/**
 * APIApiTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class APIApiTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test case for aPIAcquireDocumentContentV1
     *
     * Acquires a DocumentContent task. The task represents a document to be processed and once acquired, should be processed within the expected execution time. If the task is not completed within the expected time, it will be made available for acquisition by other workers..
     *
     */
    public function testAPIAcquireDocumentContentV1()
    {
        // TODO: implement
        $this->markTestIncomplete('Not implemented');
    }

    /**
     * Test case for aPICompleteDocumentContentV1
     *
     * Completes a DocumentContent task. The task should be marked as complete after successful processing or if an error occurs during processing. If completed successfully, any extracted document attributes should be included in the completion request..
     *
     */
    public function testAPICompleteDocumentContentV1()
    {
        // TODO: implement
        $this->markTestIncomplete('Not implemented');
    }

    /**
     * Test case for aPICreateDocumentContentV1
     *
     * Creates a new DocumentContent. The DocumentContent represents a document from an external system that needs to be processed..
     *
     */
    public function testAPICreateDocumentContentV1()
    {
        // TODO: implement
        $this->markTestIncomplete('Not implemented');
    }
}
