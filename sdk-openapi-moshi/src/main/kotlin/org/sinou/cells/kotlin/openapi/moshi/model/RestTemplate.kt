/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.sinou.cells.kotlin.openapi.moshi.model

import org.sinou.cells.kotlin.openapi.moshi.model.RestTemplateNode
import org.sinou.cells.kotlin.openapi.moshi.model.ServiceResourcePolicy

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param editable 
 * @param label 
 * @param node 
 * @param policies 
 * @param UUID 
 */


data class RestTemplate (

    @Json(name = "Editable")
    val editable: kotlin.Boolean? = null,

    @Json(name = "Label")
    val label: kotlin.String? = null,

    @Json(name = "Node")
    val node: RestTemplateNode? = null,

    @Json(name = "Policies")
    val policies: kotlin.collections.List<ServiceResourcePolicy>? = null,

    @Json(name = "UUID")
    val UUID: kotlin.String? = null

) {


}

