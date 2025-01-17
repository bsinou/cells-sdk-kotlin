/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package org.sinou.cells.kotlin.openapi.moshi.model

import com.squareup.moshi.Json

/**
 * @param operation
 * @param propertyValues
 */
data class RestNamespaceValuesOperation(
    @Json(name = "Operation") val operation: RestNsOp = RestNsOp.PUT,
    @Json(name = "Values") val propertyValues: kotlin.collections.List<kotlin.String>
) {}
