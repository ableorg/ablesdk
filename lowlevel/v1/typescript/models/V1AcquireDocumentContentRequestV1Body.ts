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
/**
 * 
 * @export
 * @interface V1AcquireDocumentContentRequestV1Body
 */
export interface V1AcquireDocumentContentRequestV1Body {
    /**
     * The expected amount of time for task execution.
     * @type {string}
     * @memberof V1AcquireDocumentContentRequestV1Body
     */
    expectedExecutionDuration: string;
}

export function V1AcquireDocumentContentRequestV1BodyFromJSON(json: any): V1AcquireDocumentContentRequestV1Body {
    return V1AcquireDocumentContentRequestV1BodyFromJSONTyped(json, false);
}

export function V1AcquireDocumentContentRequestV1BodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1AcquireDocumentContentRequestV1Body {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'expectedExecutionDuration': json['expectedExecutionDuration'],
    };
}

export function V1AcquireDocumentContentRequestV1BodyToJSON(value?: V1AcquireDocumentContentRequestV1Body | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'expectedExecutionDuration': value.expectedExecutionDuration,
    };
}


