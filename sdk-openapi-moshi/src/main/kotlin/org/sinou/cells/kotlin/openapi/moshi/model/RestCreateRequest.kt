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

import org.sinou.cells.kotlin.openapi.moshi.model.RestIncomingNode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param inputs 
 * @param recursive 
 */


data class RestCreateRequest (

    @Json(name = "Inputs")
    val inputs: kotlin.collections.List<RestIncomingNode>,

    @Json(name = "Recursive")
    val recursive: kotlin.Boolean? = null

) {


}

