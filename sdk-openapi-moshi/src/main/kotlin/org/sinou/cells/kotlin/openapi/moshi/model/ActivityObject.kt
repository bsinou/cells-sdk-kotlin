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

import org.sinou.cells.kotlin.openapi.moshi.model.ActivityObjectType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param atContext 
 * @param accuracy 
 * @param actor 
 * @param altitude 
 * @param anyOf 
 * @param attachment 
 * @param attributedTo 
 * @param audience 
 * @param bcc 
 * @param bto 
 * @param cc 
 * @param closed 
 * @param content 
 * @param current 
 * @param deleted 
 * @param duration 
 * @param endTime 
 * @param first 
 * @param formerType 
 * @param generator 
 * @param height 
 * @param href 
 * @param hreflang 
 * @param icon 
 * @param id 
 * @param image 
 * @param inReplyTo 
 * @param instrument 
 * @param items 
 * @param last 
 * @param latitude 
 * @param location 
 * @param longitude 
 * @param markdown 
 * @param mediaType 
 * @param name 
 * @param next 
 * @param `object` 
 * @param oneOf 
 * @param origin 
 * @param partOf 
 * @param prev 
 * @param preview 
 * @param published 
 * @param radius 
 * @param rel 
 * @param relationship 
 * @param replies 
 * @param result 
 * @param startTime 
 * @param subject 
 * @param summary 
 * @param tag 
 * @param target 
 * @param to 
 * @param totalItems 
 * @param type 
 * @param units 
 * @param updated 
 * @param url 
 * @param width 
 */


data class ActivityObject (

    @Json(name = "@context")
    val atContext: kotlin.String? = null,

    @Json(name = "accuracy")
    val accuracy: kotlin.Float? = null,

    @Json(name = "actor")
    val actor: ActivityObject? = null,

    @Json(name = "altitude")
    val altitude: kotlin.Float? = null,

    @Json(name = "anyOf")
    val anyOf: ActivityObject? = null,

    @Json(name = "attachment")
    val attachment: ActivityObject? = null,

    @Json(name = "attributedTo")
    val attributedTo: ActivityObject? = null,

    @Json(name = "audience")
    val audience: ActivityObject? = null,

    @Json(name = "bcc")
    val bcc: ActivityObject? = null,

    @Json(name = "bto")
    val bto: ActivityObject? = null,

    @Json(name = "cc")
    val cc: ActivityObject? = null,

    @Json(name = "closed")
    val closed: java.time.OffsetDateTime? = null,

    @Json(name = "content")
    val content: ActivityObject? = null,

    @Json(name = "current")
    val current: ActivityObject? = null,

    @Json(name = "deleted")
    val deleted: java.time.OffsetDateTime? = null,

    @Json(name = "duration")
    val duration: java.time.OffsetDateTime? = null,

    @Json(name = "endTime")
    val endTime: java.time.OffsetDateTime? = null,

    @Json(name = "first")
    val first: ActivityObject? = null,

    @Json(name = "formerType")
    val formerType: ActivityObjectType? = ActivityObjectType.BaseObject,

    @Json(name = "generator")
    val generator: ActivityObject? = null,

    @Json(name = "height")
    val height: kotlin.Int? = null,

    @Json(name = "href")
    val href: kotlin.String? = null,

    @Json(name = "hreflang")
    val hreflang: kotlin.String? = null,

    @Json(name = "icon")
    val icon: ActivityObject? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "image")
    val image: ActivityObject? = null,

    @Json(name = "inReplyTo")
    val inReplyTo: ActivityObject? = null,

    @Json(name = "instrument")
    val instrument: ActivityObject? = null,

    @Json(name = "items")
    val items: kotlin.collections.List<ActivityObject>? = null,

    @Json(name = "last")
    val last: ActivityObject? = null,

    @Json(name = "latitude")
    val latitude: kotlin.Float? = null,

    @Json(name = "location")
    val location: ActivityObject? = null,

    @Json(name = "longitude")
    val longitude: kotlin.Float? = null,

    @Json(name = "markdown")
    val markdown: kotlin.String? = null,

    @Json(name = "mediaType")
    val mediaType: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "next")
    val next: ActivityObject? = null,

    @Json(name = "object")
    val `object`: ActivityObject? = null,

    @Json(name = "oneOf")
    val oneOf: ActivityObject? = null,

    @Json(name = "origin")
    val origin: ActivityObject? = null,

    @Json(name = "partOf")
    val partOf: ActivityObject? = null,

    @Json(name = "prev")
    val prev: ActivityObject? = null,

    @Json(name = "preview")
    val preview: ActivityObject? = null,

    @Json(name = "published")
    val published: java.time.OffsetDateTime? = null,

    @Json(name = "radius")
    val radius: kotlin.Float? = null,

    @Json(name = "rel")
    val rel: kotlin.String? = null,

    @Json(name = "relationship")
    val relationship: ActivityObject? = null,

    @Json(name = "replies")
    val replies: ActivityObject? = null,

    @Json(name = "result")
    val result: ActivityObject? = null,

    @Json(name = "startTime")
    val startTime: java.time.OffsetDateTime? = null,

    @Json(name = "subject")
    val subject: ActivityObject? = null,

    @Json(name = "summary")
    val summary: kotlin.String? = null,

    @Json(name = "tag")
    val tag: ActivityObject? = null,

    @Json(name = "target")
    val target: ActivityObject? = null,

    @Json(name = "to")
    val to: ActivityObject? = null,

    @Json(name = "totalItems")
    val totalItems: kotlin.Int? = null,

    @Json(name = "type")
    val type: ActivityObjectType? = ActivityObjectType.BaseObject,

    @Json(name = "units")
    val units: kotlin.String? = null,

    @Json(name = "updated")
    val updated: java.time.OffsetDateTime? = null,

    @Json(name = "url")
    val url: ActivityObject? = null,

    @Json(name = "width")
    val width: kotlin.Int? = null

) {


}

