/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230622180011
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    V1DocumentContentStatusV1,
    V1DocumentContentStatusV1FromJSON,
    V1DocumentContentStatusV1FromJSONTyped,
    V1DocumentContentStatusV1ToJSON,
} from './';

/**
 * Represents a DocumentContent that has been completed after processing.
 * @export
 * @interface V1CompletedDocumentContentV1
 */
export interface V1CompletedDocumentContentV1 {
    /**
     * The ID of the document content.
     * @type {string}
     * @memberof V1CompletedDocumentContentV1
     */
    documentContentId?: string;
    /**
     * 
     * @type {V1DocumentContentStatusV1}
     * @memberof V1CompletedDocumentContentV1
     */
    status?: V1DocumentContentStatusV1;
    /**
     * Any error message generated during processing, empty if status is
     * COMPLETE.
     * @type {string}
     * @memberof V1CompletedDocumentContentV1
     */
    lastError?: string;
    /**
     * The name of the worker that acquired the document content.
     * @type {string}
     * @memberof V1CompletedDocumentContentV1
     */
    acquiredBy?: string;
    /**
     * The timestamp when the document content was acquired.
     * @type {Date}
     * @memberof V1CompletedDocumentContentV1
     */
    acquiredTime?: Date;
    /**
     * The name of the worker that completed the document content.
     * @type {string}
     * @memberof V1CompletedDocumentContentV1
     */
    completedBy?: string;
    /**
     * The timestamp when the document content was completed.
     * @type {Date}
     * @memberof V1CompletedDocumentContentV1
     */
    completedTime?: Date;
}

export function V1CompletedDocumentContentV1FromJSON(json: any): V1CompletedDocumentContentV1 {
    return V1CompletedDocumentContentV1FromJSONTyped(json, false);
}

export function V1CompletedDocumentContentV1FromJSONTyped(json: any, ignoreDiscriminator: boolean): V1CompletedDocumentContentV1 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'documentContentId': !exists(json, 'documentContentId') ? undefined : json['documentContentId'],
        'status': !exists(json, 'status') ? undefined : V1DocumentContentStatusV1FromJSON(json['status']),
        'lastError': !exists(json, 'lastError') ? undefined : json['lastError'],
        'acquiredBy': !exists(json, 'acquiredBy') ? undefined : json['acquiredBy'],
        'acquiredTime': !exists(json, 'acquiredTime') ? undefined : (new Date(json['acquiredTime'])),
        'completedBy': !exists(json, 'completedBy') ? undefined : json['completedBy'],
        'completedTime': !exists(json, 'completedTime') ? undefined : (new Date(json['completedTime'])),
    };
}

export function V1CompletedDocumentContentV1ToJSON(value?: V1CompletedDocumentContentV1 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'documentContentId': value.documentContentId,
        'status': V1DocumentContentStatusV1ToJSON(value.status),
        'lastError': value.lastError,
        'acquiredBy': value.acquiredBy,
        'acquiredTime': value.acquiredTime === undefined ? undefined : (value.acquiredTime.toISOString()),
        'completedBy': value.completedBy,
        'completedTime': value.completedTime === undefined ? undefined : (value.completedTime.toISOString()),
    };
}


