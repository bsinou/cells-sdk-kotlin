# org.sinou.android.kotlin.openapi - Kotlin client library for Pydio Cells Rest API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: v2
- Package version: 
- Generator version: 7.10.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen
For more information, please visit [https://pydio.com](https://pydio.com)

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *NodeServiceApi* | [**backgroundActionInfo**](docs/NodeServiceApi.md#backgroundactioninfo) | **GET** /n/action/{Name}/{JobUuid} | Retrieve information about an action running in background |
| *NodeServiceApi* | [**batchUpdateMeta**](docs/NodeServiceApi.md#batchupdatemeta) | **PATCH** /n/meta/batch | Update/delete user meta in batch. Passed UserMetas must contain a NodeUuid |
| *NodeServiceApi* | [**controlBackgroundAction**](docs/NodeServiceApi.md#controlbackgroundaction) | **PATCH** /n/action/{Name}/{JobUuid} | Send control commands to a background job |
| *NodeServiceApi* | [**create**](docs/NodeServiceApi.md#create) | **POST** /n/nodes/create | Create one or many files (empty or hydrated from a TemplateUuid) or folders |
| *NodeServiceApi* | [**createPublicLink**](docs/NodeServiceApi.md#createpubliclink) | **POST** /n/node/{Uuid}/link | Create a public link on a given node |
| *NodeServiceApi* | [**createSelection**](docs/NodeServiceApi.md#createselection) | **POST** /n/selection | Create and persist a temporary selection of nodes, that can be used by other actions |
| *NodeServiceApi* | [**deletePublicLink**](docs/NodeServiceApi.md#deletepubliclink) | **DELETE** /n/link/{LinkUuid} | Remove a public link |
| *NodeServiceApi* | [**getByUuid**](docs/NodeServiceApi.md#getbyuuid) | **GET** /n/node/{Uuid} | Load a node by its Uuid |
| *NodeServiceApi* | [**getPublicLink**](docs/NodeServiceApi.md#getpubliclink) | **GET** /n/link/{LinkUuid} | Load public link information by Uuid |
| *NodeServiceApi* | [**listNamespaceValues**](docs/NodeServiceApi.md#listnamespacevalues) | **GET** /n/meta/namespace/{Namespace} | List values for a given namespace |
| *NodeServiceApi* | [**listNamespaces**](docs/NodeServiceApi.md#listnamespaces) | **GET** /n/meta/namespace | List defined meta namespaces |
| *NodeServiceApi* | [**listVersions**](docs/NodeServiceApi.md#listversions) | **GET** /n/node/{Uuid}/versions | List all known versions of a node |
| *NodeServiceApi* | [**lookup**](docs/NodeServiceApi.md#lookup) | **POST** /n/nodes | Generic request to either list (using Locators) or search (using Query) for nodes |
| *NodeServiceApi* | [**patchNode**](docs/NodeServiceApi.md#patchnode) | **PATCH** /n/node/{Uuid} | PatchNode is used to update a node specific meta. It is used for reserved meta as well (bookmarks, contentLock) |
| *NodeServiceApi* | [**performAction**](docs/NodeServiceApi.md#performaction) | **POST** /n/action/{Name} | Trigger an action on the tree. Returns a JobInfo describing a background task. |
| *NodeServiceApi* | [**searchMeta**](docs/NodeServiceApi.md#searchmeta) | **POST** /n/meta/find | Search a list of meta by node Id or by User id and by namespace |
| *NodeServiceApi* | [**templates**](docs/NodeServiceApi.md#templates) | **GET** /n/templates | List available templates for hydrating empty files |
| *NodeServiceApi* | [**updateNamespaceValues**](docs/NodeServiceApi.md#updatenamespacevalues) | **PATCH** /n/meta/namespace/{Namespace} | Add/delete a values for a given namespace |
| *NodeServiceApi* | [**updatePublicLink**](docs/NodeServiceApi.md#updatepubliclink) | **PATCH** /n/link/{LinkUuid} | Update public link settings |
| *NodeServiceApi* | [**userBookmarks**](docs/NodeServiceApi.md#userbookmarks) | **GET** /n/nodes/bookmarks | Special API for Bookmarks, will load userMeta and the associated nodes, and return as a node list |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.sinou.android.kotlin.openapi.model.ActivityObject](docs/ActivityObject.md)
 - [org.sinou.android.kotlin.openapi.model.ActivityObjectType](docs/ActivityObjectType.md)
 - [org.sinou.android.kotlin.openapi.model.ActivityOwnerType](docs/ActivityOwnerType.md)
 - [org.sinou.android.kotlin.openapi.model.ActivitySubscription](docs/ActivitySubscription.md)
 - [org.sinou.android.kotlin.openapi.model.IdmSearchUserMetaRequest](docs/IdmSearchUserMetaRequest.md)
 - [org.sinou.android.kotlin.openapi.model.IdmUserMetaNamespace](docs/IdmUserMetaNamespace.md)
 - [org.sinou.android.kotlin.openapi.model.IdmWorkspaceScope](docs/IdmWorkspaceScope.md)
 - [org.sinou.android.kotlin.openapi.model.JobsCommand](docs/JobsCommand.md)
 - [org.sinou.android.kotlin.openapi.model.JobsCtrlCommand](docs/JobsCtrlCommand.md)
 - [org.sinou.android.kotlin.openapi.model.JobsTaskStatus](docs/JobsTaskStatus.md)
 - [org.sinou.android.kotlin.openapi.model.MetaUpdateOp](docs/MetaUpdateOp.md)
 - [org.sinou.android.kotlin.openapi.model.ProtobufAny](docs/ProtobufAny.md)
 - [org.sinou.android.kotlin.openapi.model.RestActionParameters](docs/RestActionParameters.md)
 - [org.sinou.android.kotlin.openapi.model.RestActionStatus](docs/RestActionStatus.md)
 - [org.sinou.android.kotlin.openapi.model.RestBackgroundAction](docs/RestBackgroundAction.md)
 - [org.sinou.android.kotlin.openapi.model.RestBatchUpdateMetaList](docs/RestBatchUpdateMetaList.md)
 - [org.sinou.android.kotlin.openapi.model.RestContextWorkspace](docs/RestContextWorkspace.md)
 - [org.sinou.android.kotlin.openapi.model.RestCountMeta](docs/RestCountMeta.md)
 - [org.sinou.android.kotlin.openapi.model.RestCreateRequest](docs/RestCreateRequest.md)
 - [org.sinou.android.kotlin.openapi.model.RestDataSourceFeatures](docs/RestDataSourceFeatures.md)
 - [org.sinou.android.kotlin.openapi.model.RestError](docs/RestError.md)
 - [org.sinou.android.kotlin.openapi.model.RestFilePreview](docs/RestFilePreview.md)
 - [org.sinou.android.kotlin.openapi.model.RestImageMeta](docs/RestImageMeta.md)
 - [org.sinou.android.kotlin.openapi.model.RestIncomingNode](docs/RestIncomingNode.md)
 - [org.sinou.android.kotlin.openapi.model.RestJsonMeta](docs/RestJsonMeta.md)
 - [org.sinou.android.kotlin.openapi.model.RestListTemplatesResponse](docs/RestListTemplatesResponse.md)
 - [org.sinou.android.kotlin.openapi.model.RestLockInfo](docs/RestLockInfo.md)
 - [org.sinou.android.kotlin.openapi.model.RestLookupRequest](docs/RestLookupRequest.md)
 - [org.sinou.android.kotlin.openapi.model.RestMetaToggle](docs/RestMetaToggle.md)
 - [org.sinou.android.kotlin.openapi.model.RestMetaUpdate](docs/RestMetaUpdate.md)
 - [org.sinou.android.kotlin.openapi.model.RestMode](docs/RestMode.md)
 - [org.sinou.android.kotlin.openapi.model.RestNamespaceValuesOperation](docs/RestNamespaceValuesOperation.md)
 - [org.sinou.android.kotlin.openapi.model.RestNamespaceValuesResponse](docs/RestNamespaceValuesResponse.md)
 - [org.sinou.android.kotlin.openapi.model.RestNode](docs/RestNode.md)
 - [org.sinou.android.kotlin.openapi.model.RestNodeCollection](docs/RestNodeCollection.md)
 - [org.sinou.android.kotlin.openapi.model.RestNodeLocator](docs/RestNodeLocator.md)
 - [org.sinou.android.kotlin.openapi.model.RestNodeLocators](docs/RestNodeLocators.md)
 - [org.sinou.android.kotlin.openapi.model.RestNodeUpdates](docs/RestNodeUpdates.md)
 - [org.sinou.android.kotlin.openapi.model.RestNsOp](docs/RestNsOp.md)
 - [org.sinou.android.kotlin.openapi.model.RestPagination](docs/RestPagination.md)
 - [org.sinou.android.kotlin.openapi.model.RestPerformActionResponse](docs/RestPerformActionResponse.md)
 - [org.sinou.android.kotlin.openapi.model.RestPublicLinkDeleteSuccess](docs/RestPublicLinkDeleteSuccess.md)
 - [org.sinou.android.kotlin.openapi.model.RestPublicLinkRequest](docs/RestPublicLinkRequest.md)
 - [org.sinou.android.kotlin.openapi.model.RestRevisionMeta](docs/RestRevisionMeta.md)
 - [org.sinou.android.kotlin.openapi.model.RestSelection](docs/RestSelection.md)
 - [org.sinou.android.kotlin.openapi.model.RestShareLink](docs/RestShareLink.md)
 - [org.sinou.android.kotlin.openapi.model.RestShareLinkAccessType](docs/RestShareLinkAccessType.md)
 - [org.sinou.android.kotlin.openapi.model.RestShareLinkTargetUser](docs/RestShareLinkTargetUser.md)
 - [org.sinou.android.kotlin.openapi.model.RestTemplate](docs/RestTemplate.md)
 - [org.sinou.android.kotlin.openapi.model.RestTemplateNode](docs/RestTemplateNode.md)
 - [org.sinou.android.kotlin.openapi.model.RestUserActionType](docs/RestUserActionType.md)
 - [org.sinou.android.kotlin.openapi.model.RestUserMeta](docs/RestUserMeta.md)
 - [org.sinou.android.kotlin.openapi.model.RestUserMetaList](docs/RestUserMetaList.md)
 - [org.sinou.android.kotlin.openapi.model.RestUserMetaNamespaceCollection](docs/RestUserMetaNamespaceCollection.md)
 - [org.sinou.android.kotlin.openapi.model.ServiceResourcePolicy](docs/ServiceResourcePolicy.md)
 - [org.sinou.android.kotlin.openapi.model.ServiceResourcePolicyAction](docs/ServiceResourcePolicyAction.md)
 - [org.sinou.android.kotlin.openapi.model.ServiceResourcePolicyPolicyEffect](docs/ServiceResourcePolicyPolicyEffect.md)
 - [org.sinou.android.kotlin.openapi.model.ServiceResourcePolicyQuery](docs/ServiceResourcePolicyQuery.md)
 - [org.sinou.android.kotlin.openapi.model.TreeChangeLog](docs/TreeChangeLog.md)
 - [org.sinou.android.kotlin.openapi.model.TreeGeoPoint](docs/TreeGeoPoint.md)
 - [org.sinou.android.kotlin.openapi.model.TreeGeoQuery](docs/TreeGeoQuery.md)
 - [org.sinou.android.kotlin.openapi.model.TreeNode](docs/TreeNode.md)
 - [org.sinou.android.kotlin.openapi.model.TreeNodeChangeEvent](docs/TreeNodeChangeEvent.md)
 - [org.sinou.android.kotlin.openapi.model.TreeNodeChangeEventEventType](docs/TreeNodeChangeEventEventType.md)
 - [org.sinou.android.kotlin.openapi.model.TreeNodeType](docs/TreeNodeType.md)
 - [org.sinou.android.kotlin.openapi.model.TreeQuery](docs/TreeQuery.md)
 - [org.sinou.android.kotlin.openapi.model.TreeSearchFacet](docs/TreeSearchFacet.md)
 - [org.sinou.android.kotlin.openapi.model.TreeWorkspaceRelativePath](docs/TreeWorkspaceRelativePath.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

