<?php
/**
 * V1AcquiredDocumentContentV1
 *
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
 * The version of the OpenAPI document: 1.20230727053012
 * Contact: support@able.ai
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.0.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * V1AcquiredDocumentContentV1 Class Doc Comment
 *
 * @category Class
 * @description Represents a DocumentContent that has been acquired for processing.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null  
 */
class V1AcquiredDocumentContentV1 implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'v1AcquiredDocumentContentV1';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'document_content_id' => 'string',
        'external_primary_key' => 'string',
        'direction' => '\OpenAPI\Client\Model\V1DataTransferDirectionV1',
        'upload_url' => 'string',
        'raw_file_url' => 'string',
        'standardized_pdf_url' => 'string',
        'content_url' => 'string',
        'acquired_by' => 'string',
        'acquired_time' => '\DateTime',
        'next_retry_time' => '\DateTime',
        'task_type' => 'string',
        'attributes' => '\OpenAPI\Client\Model\V1Attribute[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'document_content_id' => null,
        'external_primary_key' => null,
        'direction' => null,
        'upload_url' => null,
        'raw_file_url' => null,
        'standardized_pdf_url' => null,
        'content_url' => null,
        'acquired_by' => null,
        'acquired_time' => 'date-time',
        'next_retry_time' => 'date-time',
        'task_type' => null,
        'attributes' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'document_content_id' => 'documentContentId',
        'external_primary_key' => 'externalPrimaryKey',
        'direction' => 'direction',
        'upload_url' => 'uploadUrl',
        'raw_file_url' => 'rawFileUrl',
        'standardized_pdf_url' => 'standardizedPdfUrl',
        'content_url' => 'contentUrl',
        'acquired_by' => 'acquiredBy',
        'acquired_time' => 'acquiredTime',
        'next_retry_time' => 'nextRetryTime',
        'task_type' => 'taskType',
        'attributes' => 'attributes'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'document_content_id' => 'setDocumentContentId',
        'external_primary_key' => 'setExternalPrimaryKey',
        'direction' => 'setDirection',
        'upload_url' => 'setUploadUrl',
        'raw_file_url' => 'setRawFileUrl',
        'standardized_pdf_url' => 'setStandardizedPdfUrl',
        'content_url' => 'setContentUrl',
        'acquired_by' => 'setAcquiredBy',
        'acquired_time' => 'setAcquiredTime',
        'next_retry_time' => 'setNextRetryTime',
        'task_type' => 'setTaskType',
        'attributes' => 'setAttributes'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'document_content_id' => 'getDocumentContentId',
        'external_primary_key' => 'getExternalPrimaryKey',
        'direction' => 'getDirection',
        'upload_url' => 'getUploadUrl',
        'raw_file_url' => 'getRawFileUrl',
        'standardized_pdf_url' => 'getStandardizedPdfUrl',
        'content_url' => 'getContentUrl',
        'acquired_by' => 'getAcquiredBy',
        'acquired_time' => 'getAcquiredTime',
        'next_retry_time' => 'getNextRetryTime',
        'task_type' => 'getTaskType',
        'attributes' => 'getAttributes'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['document_content_id'] = $data['document_content_id'] ?? null;
        $this->container['external_primary_key'] = $data['external_primary_key'] ?? null;
        $this->container['direction'] = $data['direction'] ?? null;
        $this->container['upload_url'] = $data['upload_url'] ?? null;
        $this->container['raw_file_url'] = $data['raw_file_url'] ?? null;
        $this->container['standardized_pdf_url'] = $data['standardized_pdf_url'] ?? null;
        $this->container['content_url'] = $data['content_url'] ?? null;
        $this->container['acquired_by'] = $data['acquired_by'] ?? null;
        $this->container['acquired_time'] = $data['acquired_time'] ?? null;
        $this->container['next_retry_time'] = $data['next_retry_time'] ?? null;
        $this->container['task_type'] = $data['task_type'] ?? null;
        $this->container['attributes'] = $data['attributes'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets document_content_id
     *
     * @return string|null
     */
    public function getDocumentContentId()
    {
        return $this->container['document_content_id'];
    }

    /**
     * Sets document_content_id
     *
     * @param string|null $document_content_id The ID of the document content.
     *
     * @return self
     */
    public function setDocumentContentId($document_content_id)
    {
        $this->container['document_content_id'] = $document_content_id;

        return $this;
    }

    /**
     * Gets external_primary_key
     *
     * @return string|null
     */
    public function getExternalPrimaryKey()
    {
        return $this->container['external_primary_key'];
    }

    /**
     * Sets external_primary_key
     *
     * @param string|null $external_primary_key The primary key of the document in the external system.
     *
     * @return self
     */
    public function setExternalPrimaryKey($external_primary_key)
    {
        $this->container['external_primary_key'] = $external_primary_key;

        return $this;
    }

    /**
     * Gets direction
     *
     * @return \OpenAPI\Client\Model\V1DataTransferDirectionV1|null
     */
    public function getDirection()
    {
        return $this->container['direction'];
    }

    /**
     * Sets direction
     *
     * @param \OpenAPI\Client\Model\V1DataTransferDirectionV1|null $direction direction
     *
     * @return self
     */
    public function setDirection($direction)
    {
        $this->container['direction'] = $direction;

        return $this;
    }

    /**
     * Gets upload_url
     *
     * @return string|null
     */
    public function getUploadUrl()
    {
        return $this->container['upload_url'];
    }

    /**
     * Sets upload_url
     *
     * @param string|null $upload_url The upload URL for the document file in GCS.
     *
     * @return self
     */
    public function setUploadUrl($upload_url)
    {
        $this->container['upload_url'] = $upload_url;

        return $this;
    }

    /**
     * Gets raw_file_url
     *
     * @return string|null
     */
    public function getRawFileUrl()
    {
        return $this->container['raw_file_url'];
    }

    /**
     * Sets raw_file_url
     *
     * @param string|null $raw_file_url The download URL for the raw document file in GCS.
     *
     * @return self
     */
    public function setRawFileUrl($raw_file_url)
    {
        $this->container['raw_file_url'] = $raw_file_url;

        return $this;
    }

    /**
     * Gets standardized_pdf_url
     *
     * @return string|null
     */
    public function getStandardizedPdfUrl()
    {
        return $this->container['standardized_pdf_url'];
    }

    /**
     * Sets standardized_pdf_url
     *
     * @param string|null $standardized_pdf_url The download URL for the standardized PDF file in GCS.
     *
     * @return self
     */
    public function setStandardizedPdfUrl($standardized_pdf_url)
    {
        $this->container['standardized_pdf_url'] = $standardized_pdf_url;

        return $this;
    }

    /**
     * Gets content_url
     *
     * @return string|null
     */
    public function getContentUrl()
    {
        return $this->container['content_url'];
    }

    /**
     * Sets content_url
     *
     * @param string|null $content_url The download URL for the content file in GCS.
     *
     * @return self
     */
    public function setContentUrl($content_url)
    {
        $this->container['content_url'] = $content_url;

        return $this;
    }

    /**
     * Gets acquired_by
     *
     * @return string|null
     */
    public function getAcquiredBy()
    {
        return $this->container['acquired_by'];
    }

    /**
     * Sets acquired_by
     *
     * @param string|null $acquired_by The name of the worker that acquired the document content.
     *
     * @return self
     */
    public function setAcquiredBy($acquired_by)
    {
        $this->container['acquired_by'] = $acquired_by;

        return $this;
    }

    /**
     * Gets acquired_time
     *
     * @return \DateTime|null
     */
    public function getAcquiredTime()
    {
        return $this->container['acquired_time'];
    }

    /**
     * Sets acquired_time
     *
     * @param \DateTime|null $acquired_time The timestamp when the document content was acquired.
     *
     * @return self
     */
    public function setAcquiredTime($acquired_time)
    {
        $this->container['acquired_time'] = $acquired_time;

        return $this;
    }

    /**
     * Gets next_retry_time
     *
     * @return \DateTime|null
     */
    public function getNextRetryTime()
    {
        return $this->container['next_retry_time'];
    }

    /**
     * Sets next_retry_time
     *
     * @param \DateTime|null $next_retry_time The expected time of task compleation. If not completed before this time, the task will be retried.
     *
     * @return self
     */
    public function setNextRetryTime($next_retry_time)
    {
        $this->container['next_retry_time'] = $next_retry_time;

        return $this;
    }

    /**
     * Gets task_type
     *
     * @return string|null
     */
    public function getTaskType()
    {
        return $this->container['task_type'];
    }

    /**
     * Sets task_type
     *
     * @param string|null $task_type task_type
     *
     * @return self
     */
    public function setTaskType($task_type)
    {
        $this->container['task_type'] = $task_type;

        return $this;
    }

    /**
     * Gets attributes
     *
     * @return \OpenAPI\Client\Model\V1Attribute[]|null
     */
    public function getAttributes()
    {
        return $this->container['attributes'];
    }

    /**
     * Sets attributes
     *
     * @param \OpenAPI\Client\Model\V1Attribute[]|null $attributes attributes
     *
     * @return self
     */
    public function setAttributes($attributes)
    {
        $this->container['attributes'] = $attributes;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


