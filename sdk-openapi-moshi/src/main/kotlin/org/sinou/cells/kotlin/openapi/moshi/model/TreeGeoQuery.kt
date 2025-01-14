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

import org.sinou.cells.kotlin.openapi.moshi.model.TreeGeoPoint

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param bottomRight 
 * @param center 
 * @param distance Example formats supported: \"5in\" \"5inch\" \"7yd\" \"7yards\" \"9ft\" \"9feet\" \"11km\" \"11kilometers\" \"3nm\" \"3nauticalmiles\" \"13mm\" \"13millimeters\" \"15cm\" \"15centimeters\" \"17mi\" \"17miles\" \"19m\" \"19meters\" If the unit cannot be determined, the entire string is parsed and the unit of meters is assumed.
 * @param topLeft 
 */


data class TreeGeoQuery (

    @Json(name = "BottomRight")
    val bottomRight: TreeGeoPoint? = null,

    @Json(name = "Center")
    val center: TreeGeoPoint? = null,

    /* Example formats supported: \"5in\" \"5inch\" \"7yd\" \"7yards\" \"9ft\" \"9feet\" \"11km\" \"11kilometers\" \"3nm\" \"3nauticalmiles\" \"13mm\" \"13millimeters\" \"15cm\" \"15centimeters\" \"17mi\" \"17miles\" \"19m\" \"19meters\" If the unit cannot be determined, the entire string is parsed and the unit of meters is assumed. */
    @Json(name = "Distance")
    val distance: kotlin.String? = null,

    @Json(name = "TopLeft")
    val topLeft: TreeGeoPoint? = null

) {


}

