/* tslint:disable */
/* eslint-disable */
/**
 * Able API
 * SDK for building integrations with Able.
 *
 * The version of the OpenAPI document: 1.20230621235520
 * Contact: support@able.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Status of processing a document version.
 * 
 *  - COMPLETE: Document processing has been successful.
 *  - ERROR: Document processing was not successful.
 * @export
 * @enum {string}
 */
export enum V1DocumentVersionStatus {
    DocumentVersionStatusUnspecified = 'DOCUMENT_VERSION_STATUS_UNSPECIFIED',
    Complete = 'COMPLETE',
    Error = 'ERROR'
}

export function V1DocumentVersionStatusFromJSON(json: any): V1DocumentVersionStatus {
    return V1DocumentVersionStatusFromJSONTyped(json, false);
}

export function V1DocumentVersionStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1DocumentVersionStatus {
    return json as V1DocumentVersionStatus;
}

export function V1DocumentVersionStatusToJSON(value?: V1DocumentVersionStatus | null): any {
    return value as any;
}
