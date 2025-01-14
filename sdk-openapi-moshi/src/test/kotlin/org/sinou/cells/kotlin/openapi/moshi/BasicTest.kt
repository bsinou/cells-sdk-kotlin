@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package org.sinou.cells.kotlin.openapi.moshi

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec
import org.sinou.cells.kotlin.openapi.moshi.api.NodeServiceApi
import java.util.UUID
import org.sinou.cells.kotlin.openapi.moshi.model.RestCreateRequest
import org.sinou.cells.kotlin.openapi.moshi.model.RestIncomingNode
import org.sinou.cells.kotlin.openapi.moshi.model.RestNodeLocator
import org.sinou.cells.kotlin.openapi.moshi.model.TreeNodeType

class BasicTest : ShouldSpec() {

    init {
        val apiInstance = NodeServiceApi("${SERVER_URL}/a", getTestHttpClient())

        should("ping server") { pingServer() shouldBe 200 }

        should("test create") {
            val id: String = UUID.randomUUID().toString()
            val newPath = "common-files/test-kotlin-moshi-$id.txt"
            try {
                val currRequest =
                    RestCreateRequest(
                        inputs =
                        listOf(
                            RestIncomingNode(
                                type = TreeNodeType.LEAF,
                                locator = RestNodeLocator(path = newPath),
                                contentType = "text/plain")),
                        recursive = false)
                val response = apiInstance.create(currRequest)
                print("Found ${response.nodes.size} nodes")
            } catch (e: Exception) {
                e shouldBe null
            }
        }
    }
}
