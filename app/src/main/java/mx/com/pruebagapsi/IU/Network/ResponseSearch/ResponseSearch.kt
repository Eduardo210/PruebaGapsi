package mx.com.pruebagapsi.IU.Network.ResponseSearch

import com.google.gson.annotations.SerializedName

data class ResponseSearch(

	@field:SerializedName("domainCode")
	val domainCode: String? = null,

	@field:SerializedName("item")
	val item: Item? = null,

	@field:SerializedName("sortStrategy")
	val sortStrategy: String? = null,

	@field:SerializedName("responseStatus")
	val responseStatus: String? = null,

	@field:SerializedName("responseMessage")
	val responseMessage: String? = null,

	@field:SerializedName("keyword")
	val keyword: String? = null
)

data class Headers(
	val any: Any? = null
)

data class EventAttributes(

	@field:SerializedName("priceFlip")
	val priceFlip: Boolean? = null,

	@field:SerializedName("specialBuy")
	val specialBuy: Boolean? = null
)

data class TopZone5(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class MediaSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class JsonMember934571270(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember1707140316(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember709633232(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class RawConfigs(

	@field:SerializedName("lazy")
	val lazy: String? = null,

	@field:SerializedName("moduleLocation")
	val moduleLocation: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)

data class JsonMember402070537(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Pulse(

	@field:SerializedName("_all_")
	val all: All? = null
)

data class ValuesItem(

	@field:SerializedName("expandOnLoad")
	val expandOnLoad: Boolean? = null,

	@field:SerializedName("values")
	val values: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("isSelected")
	val isSelected: Any? = null,

	@field:SerializedName("description")
	val description: Any? = null,

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("title")
	val title: Any? = null,

	@field:SerializedName("type")
	val type: Any? = null,

	@field:SerializedName("baseSeoURL")
	val baseSeoURL: Any? = null,

	@field:SerializedName("itemCount")
	val itemCount: Int? = null
)

data class Meta(

	@field:SerializedName("borderColor")
	val borderColor: Any? = null,

	@field:SerializedName("isPartialResult")
	val isPartialResult: Any? = null,

	@field:SerializedName("subTitle")
	val subTitle: Any? = null,

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("stackId")
	val stackId: Int? = null,

	@field:SerializedName("adsBeacon")
	val adsBeacon: AdsBeacon? = null,

	@field:SerializedName("stackName")
	val stackName: Any? = null,

	@field:SerializedName("iconUrl")
	val iconUrl: Any? = null,

	@field:SerializedName("stackType")
	val stackType: String? = null,

	@field:SerializedName("layoutEnum")
	val layoutEnum: String? = null
)

data class PageMetadata(

	@field:SerializedName("pageContext")
	val pageContext: PageContext? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("storeSelectionHeader")
	val storeSelectionHeader: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("subscriptionEligible")
	val subscriptionEligible: Boolean? = null
)

data class JsonMember470461045(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class ItemStacksInterleavePositionItem(

	@field:SerializedName("stackId")
	val stackId: Int? = null
)

data class TopZone1(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class SponsoredProduct(

	@field:SerializedName("clickBeacon")
	val clickBeacon: String? = null,

	@field:SerializedName("spTags")
	val spTags: Any? = null,

	@field:SerializedName("spQs")
	val spQs: String? = null,

	@field:SerializedName("viewBeacon")
	val viewBeacon: Any? = null
)

data class JsonMember20370542(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class ArExperiences(

	@field:SerializedName("isARHome")
	val isARHome: Boolean? = null,

	@field:SerializedName("isZeekit")
	val isZeekit: Boolean? = null
)

data class CatInfo(

	@field:SerializedName("catId")
	val catId: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class AdditionalQueryParams(

	@field:SerializedName("translation")
	val translation: Any? = null,

	@field:SerializedName("hidden_facet")
	val hiddenFacet: Any? = null,

	@field:SerializedName("isMoreOptionsTileEnabled")
	val isMoreOptionsTileEnabled: Boolean? = null
)

data class Header(

	@field:SerializedName("headers")
	val headers: Headers? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("_all_")
	val all: All? = null
)

data class TagsItem(

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("key")
	val key: String? = null
)

data class TopZone6(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class TopZone2(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class Csp(

	@field:SerializedName("directives")
	val directives: Directives? = null,

	@field:SerializedName("reportViolations")
	val reportViolations: Boolean? = null,

	@field:SerializedName("reportUri")
	val reportUri: String? = null
)

data class Trace(

	@field:SerializedName("traceId")
	val traceId: String? = null,

	@field:SerializedName("spanId")
	val spanId: String? = null,

	@field:SerializedName("traceFlags")
	val traceFlags: Int? = null
)

data class RuntimeConfig(

	@field:SerializedName("perimeterX")
	val perimeterX: PerimeterX? = null,

	@field:SerializedName("csp")
	val csp: Csp? = null,

	@field:SerializedName("appVersion")
	val appVersion: String? = null,

	@field:SerializedName("nxApplicationName")
	val nxApplicationName: String? = null,

	@field:SerializedName("queryContext")
	val queryContext: QueryContext? = null,

	@field:SerializedName("googleMaps")
	val googleMaps: GoogleMaps? = null,

	@field:SerializedName("membershipConfig")
	val membershipConfig: MembershipConfig? = null,

	@field:SerializedName("vid")
	val vid: String? = null,

	@field:SerializedName("mockURL")
	val mockURL: String? = null,

	@field:SerializedName("threatMetrix")
	val threatMetrix: ThreatMetrix? = null,

	@field:SerializedName("identity")
	val identity: Identity? = null,

	@field:SerializedName("tenantV2")
	val tenantV2: TenantV2? = null,

	@field:SerializedName("enableLatencyTrace")
	val enableLatencyTrace: Boolean? = null,

	@field:SerializedName("tenant")
	val tenant: String? = null,

	@field:SerializedName("tmxOrgId")
	val tmxOrgId: String? = null,

	@field:SerializedName("dataCenter")
	val dataCenter: String? = null,

	@field:SerializedName("profile")
	val profile: String? = null,

	@field:SerializedName("pulseBeacon")
	val pulseBeacon: PulseBeacon? = null,

	@field:SerializedName("paymentsPageUrl")
	val paymentsPageUrl: String? = null,

	@field:SerializedName("walletPageUrl")
	val walletPageUrl: String? = null,

	@field:SerializedName("moatIvt")
	val moatIvt: String? = null,

	@field:SerializedName("appSha")
	val appSha: String? = null,

	@field:SerializedName("paymentsChooserPageUrl")
	val paymentsChooserPageUrl: String? = null,

	@field:SerializedName("ads")
	val ads: Ads? = null,

	@field:SerializedName("isDev")
	val isDev: Boolean? = null,

	@field:SerializedName("mock")
	val mock: Boolean? = null,

	@field:SerializedName("endpointMappings")
	val endpointMappings: EndpointMappings? = null,

	@field:SerializedName("wmcashFormPageUrl")
	val wmcashFormPageUrl: String? = null
)

data class Props(

	@field:SerializedName("pageProps")
	val pageProps: PageProps? = null
)

data class JsonMember441387712(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class TopNavFacetsItem(

	@field:SerializedName("max")
	val max: Any? = null,

	@field:SerializedName("values")
	val values: Any? = null,

	@field:SerializedName("stepSize")
	val stepSize: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("selectedMax")
	val selectedMax: Any? = null,

	@field:SerializedName("layout")
	val layout: String? = null,

	@field:SerializedName("min")
	val min: Any? = null,

	@field:SerializedName("selectedMin")
	val selectedMin: Any? = null,

	@field:SerializedName("expandOnLoad")
	val expandOnLoad: Boolean? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("unboundedMax")
	val unboundedMax: Any? = null,

	@field:SerializedName("isSelected")
	val isSelected: Any? = null
)

data class ClickThrough(

	@field:SerializedName("rawValue")
	val rawValue: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class ObjectSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class JsonMember674598288(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Bookslot(

	@field:SerializedName("_all_")
	val all: All? = null
)

data class AspectInfo(

	@field:SerializedName("snippet")
	val snippet: Any? = null,

	@field:SerializedName("name")
	val name: Any? = null,

	@field:SerializedName("header")
	val header: Any? = null,

	@field:SerializedName("id")
	val id: Any? = null
)

data class DehydratedSearchCv(

	@field:SerializedName("enableLCPSingleImagePrefetchScaleFallback")
	val enableLCPSingleImagePrefetchScaleFallback: Boolean? = null,

	@field:SerializedName("enableLCPSingleImagePrefetch")
	val enableLCPSingleImagePrefetch: Boolean? = null,

	@field:SerializedName("enableLCPHighFetchPriority")
	val enableLCPHighFetchPriority: Boolean? = null
)

data class ThreatMetrix(

	@field:SerializedName("enable")
	val enable: Boolean? = null
)

data class PulseBeacon(

	@field:SerializedName("photoHostWithoutQM")
	val photoHostWithoutQM: String? = null,

	@field:SerializedName("hostname")
	val hostname: String? = null,

	@field:SerializedName("bd")
	val bd: String? = null,

	@field:SerializedName("hostWithQM")
	val hostWithQM: String? = null,

	@field:SerializedName("photoHost")
	val photoHost: String? = null,

	@field:SerializedName("enable")
	val enable: Boolean? = null,

	@field:SerializedName("bh")
	val bh: String? = null,

	@field:SerializedName("hostWithoutQM")
	val hostWithoutQM: String? = null
)

data class Vision(

	@field:SerializedName("visionCenterApproved")
	val visionCenterApproved: Boolean? = null,

	@field:SerializedName("ageGroup")
	val ageGroup: Any? = null
)

data class Spelling(
	val any: Any? = null
)

data class ContentLayout(

	@field:SerializedName("pageMetadata")
	val pageMetadata: PageMetadata? = null,

	@field:SerializedName("layouts")
	val layouts: List<LayoutsItem?>? = null,

	@field:SerializedName("modules")
	val modules: List<ModulesItem?>? = null
)

data class PageProperties(

	@field:SerializedName("ps")
	val ps: String? = null,

	@field:SerializedName("prg")
	val prg: String? = null,

	@field:SerializedName("spelling")
	val spelling: String? = null,

	@field:SerializedName("stores")
	val stores: String? = null,

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("sort")
	val sort: String? = null,

	@field:SerializedName("displayGuidedNav")
	val displayGuidedNav: Boolean? = null,

	@field:SerializedName("itemStacks")
	val itemStacks: ItemStacks? = null,

	@field:SerializedName("ptss")
	val ptss: String? = null,

	@field:SerializedName("itemStacksInterleavePosition")
	val itemStacksInterleavePosition: List<ItemStacksInterleavePositionItem?>? = null,

	@field:SerializedName("affinityOverride")
	val affinityOverride: String? = null,

	@field:SerializedName("grid")
	val grid: String? = null,

	@field:SerializedName("cat_id")
	val catId: String? = null,

	@field:SerializedName("page")
	val page: Int? = null
)

data class JsonMember17480442(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Badge(

	@field:SerializedName("bundleId")
	val bundleId: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("styleId")
	val styleId: Any? = null,

	@field:SerializedName("__typename")
	val typename: String? = null
)

data class PersistedQueriesConfig(

	@field:SerializedName("enableAllowList")
	val enableAllowList: Boolean? = null,

	@field:SerializedName("enablePersistedQueries")
	val enablePersistedQueries: Boolean? = null,

	@field:SerializedName("blackList")
	val blackList: List<String?>? = null,

	@field:SerializedName("allowList")
	val allowList: List<String?>? = null
)

data class ModuleConfigs(

	@field:SerializedName("moduleLocation")
	val moduleLocation: String? = null
)

data class JsonMember1289566748(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember884437848(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember667802535(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember987511243(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Badges(

	@field:SerializedName("flags")
	val flags: Any? = null,

	@field:SerializedName("groups")
	val groups: List<Any?>? = null,

	@field:SerializedName("tags")
	val tags: List<TagsItem?>? = null
)

data class Cv(

	@field:SerializedName("shared")
	val shared: Shared? = null,

	@field:SerializedName("ads")
	val ads: Ads? = null,

	@field:SerializedName("search")
	val search: Search? = null,

	@field:SerializedName("footer")
	val footer: Footer? = null,

	@field:SerializedName("pulse")
	val pulse: Pulse? = null,

	@field:SerializedName("header")
	val header: Header? = null,

	@field:SerializedName("bookslot")
	val bookslot: Bookslot? = null,

	@field:SerializedName("account")
	val account: Account? = null,

	@field:SerializedName("cart")
	val cart: Cart? = null
)

data class SearchNormalize(

	@field:SerializedName("verticalId")
	val verticalId: String? = null,

	@field:SerializedName("original_query")
	val originalQuery: String? = null,

	@field:SerializedName("analytics_log")
	val analyticsLog: AnalyticsLog? = null,

	@field:SerializedName("normalized_query")
	val normalizedQuery: String? = null,

	@field:SerializedName("specificity")
	val specificity: String? = null,

	@field:SerializedName("rewritten_query")
	val rewrittenQuery: String? = null,

	@field:SerializedName("top_query_cat_path")
	val topQueryCatPath: String? = null,

	@field:SerializedName("top_query_cat_path_name")
	val topQueryCatPathName: String? = null,

	@field:SerializedName("brand")
	val brand: Brand? = null
)

data class TenantsItem(

	@field:SerializedName("mart")
	val mart: String? = null,

	@field:SerializedName("templates")
	val templates: List<String?>? = null,

	@field:SerializedName("host")
	val host: Host? = null
)

data class JsonMember46354349(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember1895788426(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Debug(

	@field:SerializedName("adsUrl")
	val adsUrl: String? = null,

	@field:SerializedName("sisUrl")
	val sisUrl: String? = null
)

data class JsonMember738261044(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Ad(

	@field:SerializedName("zipCode")
	val zipCode: String? = null,

	@field:SerializedName("moduleType")
	val moduleType: String? = null,

	@field:SerializedName("adContent")
	val adContent: AdContent? = null,

	@field:SerializedName("adRequestComposite")
	val adRequestComposite: AdRequestComposite? = null,

	@field:SerializedName("pageId")
	val pageId: String? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("platform")
	val platform: String? = null,

	@field:SerializedName("pageContext")
	val pageContext: PageContext? = null,

	@field:SerializedName("pageType")
	val pageType: String? = null,

	@field:SerializedName("moduleConfigs")
	val moduleConfigs: ModuleConfigs? = null,

	@field:SerializedName("adsContext")
	val adsContext: AdsContext? = null,

	@field:SerializedName("stateCode")
	val stateCode: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class SelectedProduct(

	@field:SerializedName("canonicalUrl")
	val canonicalUrl: String? = null,

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Content(

	@field:SerializedName("mapping")
	val mapping: List<MappingItem?>? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class InitialData(

	@field:SerializedName("searchResult")
	val searchResult: SearchResult? = null,

)

data class VariantCriteriaItem(

	@field:SerializedName("isVariantTypeSwatch")
	val isVariantTypeSwatch: Boolean? = null,

	@field:SerializedName("displayName")
	val displayName: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("variantList")
	val variantList: List<VariantListItem?>? = null,

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class JsonMember653683256(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class GoogleMaps(

	@field:SerializedName("checkAddressAPIKey")
	val checkAddressAPIKey: String? = null,

	@field:SerializedName("addressAPIKey")
	val addressAPIKey: String? = null,

	@field:SerializedName("geoCodingAPIKey")
	val geoCodingAPIKey: String? = null,

	@field:SerializedName("riseMapAPIKey")
	val riseMapAPIKey: RiseMapAPIKey? = null
)

data class GroupMetaData(

	@field:SerializedName("groupType")
	val groupType: Any? = null,

	@field:SerializedName("groupComponents")
	val groupComponents: Any? = null,

	@field:SerializedName("groupSubType")
	val groupSubType: Any? = null,

	@field:SerializedName("numberOfComponents")
	val numberOfComponents: Int? = null
)

data class JsonMember586378841(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class PreOrder(

	@field:SerializedName("streetDateDisplayable")
	val streetDateDisplayable: Any? = null,

	@field:SerializedName("streetDateType")
	val streetDateType: Any? = null,

	@field:SerializedName("streetDate")
	val streetDate: Any? = null,

	@field:SerializedName("isPreOrder")
	val isPreOrder: Boolean? = null
)

data class Subscription(

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("subscriptionEligible")
	val subscriptionEligible: Boolean? = null
)

data class JsonMember885552459(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class AuthFrameRoutes(

	@field:SerializedName("reauthFrame")
	val reauthFrame: String? = null,

	@field:SerializedName("gxoSignin")
	val gxoSignin: String? = null,

	@field:SerializedName("gxoSignup")
	val gxoSignup: String? = null,

	@field:SerializedName("frame")
	val frame: String? = null
)

data class JsonMember243342946(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class PriceInfo(

	@field:SerializedName("unitPrice")
	val unitPrice: String? = null,

	@field:SerializedName("minPriceForVariant")
	val minPriceForVariant: String? = null,

	@field:SerializedName("priceRangeString")
	val priceRangeString: String? = null,

	@field:SerializedName("submapType")
	val submapType: String? = null,

	@field:SerializedName("linePriceDisplay")
	val linePriceDisplay: String? = null,

	@field:SerializedName("wasPrice")
	val wasPrice: String? = null,

	@field:SerializedName("memberPriceString")
	val memberPriceString: String? = null,

	@field:SerializedName("finalCostByWeight")
	val finalCostByWeight: Boolean? = null,

	@field:SerializedName("linePrice")
	val linePrice: String? = null,

	@field:SerializedName("priceDisplayCondition")
	val priceDisplayCondition: String? = null,

	@field:SerializedName("shipPrice")
	val shipPrice: String? = null,

	@field:SerializedName("subscriptionString")
	val subscriptionString: String? = null,

	@field:SerializedName("eaPricingPreText")
	val eaPricingPreText: String? = null,

	@field:SerializedName("subscriptionPercentage")
	val subscriptionPercentage: Any? = null,



	@field:SerializedName("itemPrice")
	val itemPrice: String? = null,

	@field:SerializedName("savings")
	val savings: String? = null,

	@field:SerializedName("subscriptionDualPrice")
	val subscriptionDualPrice: Any? = null,

	@field:SerializedName("subscriptionPrice")
	val subscriptionPrice: String? = null,

	@field:SerializedName("eaPricingText")
	val eaPricingText: String? = null
)

data class JsonMember50013156(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class All(

	@field:SerializedName("enableAuthErrorFix")
	val enableAuthErrorFix: Boolean? = null,

	@field:SerializedName("enableItemUpdates")
	val enableItemUpdates: Boolean? = null,

	@field:SerializedName("enableShopSimilarForPickup")
	val enableShopSimilarForPickup: Boolean? = null,

	@field:SerializedName("enablePartialCheckout")
	val enablePartialCheckout: Boolean? = null,

	@field:SerializedName("enableLeanModeSFL")
	val enableLeanModeSFL: Boolean? = null,

	@field:SerializedName("cartQueryStaleTime")
	val cartQueryStaleTime: Int? = null,

	@field:SerializedName("enableWplusCashback")
	val enableWplusCashback: Boolean? = null,

	@field:SerializedName("enableSingletonATF")
	val enableSingletonATF: Boolean? = null,

	@field:SerializedName("enableForceFooterVisibility")
	val enableForceFooterVisibility: Boolean? = null,

	@field:SerializedName("enableFullPagePAC")
	val enableFullPagePAC: Boolean? = null,

	@field:SerializedName("enableGXOSignInNudge")
	val enableGXOSignInNudge: Boolean? = null,

	@field:SerializedName("enableSSRRedirect")
	val enableSSRRedirect: Boolean? = null,

	@field:SerializedName("enableReturnsLabel")
	val enableReturnsLabel: Boolean? = null,

	@field:SerializedName("enableCapOneRewards")
	val enableCapOneRewards: Boolean? = null,

	@field:SerializedName("enableGuestCheckout")
	val enableGuestCheckout: Boolean? = null,

	@field:SerializedName("enableACCOnPAC")
	val enableACCOnPAC: Boolean? = null,

	@field:SerializedName("enableSFLMoveToCartOptimization")
	val enableSFLMoveToCartOptimization: Boolean? = null,

	@field:SerializedName("enableLeanModeATC")
	val enableLeanModeATC: Boolean? = null,

	@field:SerializedName("enableDetailedPartialXoLabel")
	val enableDetailedPartialXoLabel: Boolean? = null,

	@field:SerializedName("enableCartWplusBannerPickup")
	val enableCartWplusBannerPickup: Boolean? = null,

	@field:SerializedName("enableWplusThirtyDaystrial")
	val enableWplusThirtyDaystrial: Boolean? = null,

	@field:SerializedName("showPersonalization")
	val showPersonalization: Boolean? = null,

	@field:SerializedName("enablelastCallOptimizatation")
	val enablelastCallOptimizatation: Boolean? = null,

	@field:SerializedName("enableCartWplusBannerNoSlotSelected")
	val enableCartWplusBannerNoSlotSelected: Boolean? = null,

	@field:SerializedName("enableAddOnServicesPAC")
	val enableAddOnServicesPAC: Boolean? = null,

	@field:SerializedName("enableCarePlansAndHomeServices")
	val enableCarePlansAndHomeServices: Boolean? = null,

	@field:SerializedName("enableFullPageSignin")
	val enableFullPageSignin: Boolean? = null,

	@field:SerializedName("enableSetShippingOrDeliveryMutation")
	val enableSetShippingOrDeliveryMutation: Boolean? = null,

	@field:SerializedName("enableShippingLabel")
	val enableShippingLabel: Boolean? = null,

	@field:SerializedName("enableSubstituteOOSV2")
	val enableSubstituteOOSV2: Boolean? = null,

	@field:SerializedName("disableP13nOnPAC")
	val disableP13nOnPAC: Boolean? = null,

	@field:SerializedName("enableOmniPromise")
	val enableOmniPromise: Boolean? = null,

	@field:SerializedName("enableEnhancedEmptyCart")
	val enableEnhancedEmptyCart: Boolean? = null,

	@field:SerializedName("enableWirelessPostpaid")
	val enableWirelessPostpaid: Boolean? = null,

	@field:SerializedName("projectThunderbolt")
	val projectThunderbolt: Boolean? = null,

	@field:SerializedName("enableLargeImagesMWeb")
	val enableLargeImagesMWeb: Boolean? = null,

	@field:SerializedName("sflCountPerPagination")
	val sflCountPerPagination: Int? = null,

	@field:SerializedName("enableNewSignInBenefitCards")
	val enableNewSignInBenefitCards: Boolean? = null,

	@field:SerializedName("enableInHomeDelivery")
	val enableInHomeDelivery: Boolean? = null,

	@field:SerializedName("enableEarlyAccess")
	val enableEarlyAccess: Boolean? = null,

	@field:SerializedName("enablePickupNotAvailable")
	val enablePickupNotAvailable: Boolean? = null,

	@field:SerializedName("enableLastCallNonRoutine")
	val enableLastCallNonRoutine: Boolean? = null,

	@field:SerializedName("disableGetCartCSR")
	val disableGetCartCSR: Boolean? = null,

	@field:SerializedName("enableWplusBannersPostCartLoadPage")
	val enableWplusBannersPostCartLoadPage: Boolean? = null,

	@field:SerializedName("enablePostLoadDeals")
	val enablePostLoadDeals: Boolean? = null,

	@field:SerializedName("enablePAC")
	val enablePAC: Boolean? = null,

	@field:SerializedName("disableNoTimesMessage")
	val disableNoTimesMessage: Boolean? = null,

	@field:SerializedName("enableNonConfigBundles")
	val enableNonConfigBundles: Boolean? = null,

	@field:SerializedName("slotShortcutMaxSlotReqCount")
	val slotShortcutMaxSlotReqCount: Int? = null,

	@field:SerializedName("enableSigninBenefits")
	val enableSigninBenefits: Boolean? = null,

	@field:SerializedName("enableFPCEHeader")
	val enableFPCEHeader: Boolean? = null,

	@field:SerializedName("slotShortcutGetSlotsQueryCacheTime")
	val slotShortcutGetSlotsQueryCacheTime: Int? = null,

	@field:SerializedName("enableWplusFulfillmentBanner")
	val enableWplusFulfillmentBanner: Boolean? = null,

	@field:SerializedName("enableHelium")
	val enableHelium: Boolean? = null,

	@field:SerializedName("enableFFCollapseMode")
	val enableFFCollapseMode: Boolean? = null,

	@field:SerializedName("enableLoadAfterATF")
	val enableLoadAfterATF: Boolean? = null,

	@field:SerializedName("enableIbotta")
	val enableIbotta: Boolean? = null,

	@field:SerializedName("enableCXOPrefetch")
	val enableCXOPrefetch: Boolean? = null,

	@field:SerializedName("enableItemSwitchableTempBadge")
	val enableItemSwitchableTempBadge: Boolean? = null,

	@field:SerializedName("enableCartLevelMSI")
	val enableCartLevelMSI: Boolean? = null,

	@field:SerializedName("enableAEBadge")
	val enableAEBadge: Boolean? = null,

	@field:SerializedName("enableATCAnimation")
	val enableATCAnimation: Boolean? = null,

	@field:SerializedName("enableWplusGuestBanner")
	val enableWplusGuestBanner: Boolean? = null,

	@field:SerializedName("enableGetCartAuthErrorRefetch")
	val enableGetCartAuthErrorRefetch: Boolean? = null,

	@field:SerializedName("enableCapOne")
	val enableCapOne: Boolean? = null,

	@field:SerializedName("enableFCTodayTomorrowHeader")
	val enableFCTodayTomorrowHeader: Boolean? = null,

	@field:SerializedName("enableIntentControl")
	val enableIntentControl: Boolean? = null,

	@field:SerializedName("enableWideProductImages")
	val enableWideProductImages: Boolean? = null,

	@field:SerializedName("enableWeightedItems")
	val enableWeightedItems: Boolean? = null,

	@field:SerializedName("enableWalmartPlusIntegratedSignUp")
	val enableWalmartPlusIntegratedSignUp: Boolean? = null,

	@field:SerializedName("enableItemSwitchableBadge")
	val enableItemSwitchableBadge: Boolean? = null,

	@field:SerializedName("enableATCOptimization")
	val enableATCOptimization: Boolean? = null,

	@field:SerializedName("enableATCRateLimitingMessage")
	val enableATCRateLimitingMessage: Boolean? = null,

	@field:SerializedName("enableFeeThresholdBar")
	val enableFeeThresholdBar: Boolean? = null,

	@field:SerializedName("enableSubstituteOOS")
	val enableSubstituteOOS: Boolean? = null,

	@field:SerializedName("enableBenefitSavings")
	val enableBenefitSavings: Boolean? = null,

	@field:SerializedName("enableSmartNudges")
	val enableSmartNudges: Boolean? = null,

	@field:SerializedName("enableACCScheduling")
	val enableACCScheduling: Boolean? = null,

	@field:SerializedName("enableMPStoreSelector")
	val enableMPStoreSelector: Boolean? = null,

	@field:SerializedName("enableCartLight")
	val enableCartLight: Boolean? = null,

	@field:SerializedName("enableSmileyPricing")
	val enableSmileyPricing: Boolean? = null,

	@field:SerializedName("enableACCVariant")
	val enableACCVariant: Int? = null,

	@field:SerializedName("enablePartialSwitchModuleLevel")
	val enablePartialSwitchModuleLevel: Boolean? = null,

	@field:SerializedName("enableGroceryPAC")
	val enableGroceryPAC: Boolean? = null,

	@field:SerializedName("enableCallouts")
	val enableCallouts: Boolean? = null,

	@field:SerializedName("enableAffirm")
	val enableAffirm: Boolean? = null,

	@field:SerializedName("enableItemNotSwitchableBadge")
	val enableItemNotSwitchableBadge: Boolean? = null,

	@field:SerializedName("enableWplusOldBannerUI")
	val enableWplusOldBannerUI: Boolean? = null,

	@field:SerializedName("enablePriceChange")
	val enablePriceChange: Boolean? = null,

	@field:SerializedName("enableEbt")
	val enableEbt: Boolean? = null,

	@field:SerializedName("enableWplus")
	val enableWplus: Boolean? = null,

	@field:SerializedName("enableLastCallFullPage")
	val enableLastCallFullPage: Boolean? = null,

	@field:SerializedName("enableSFL")
	val enableSFL: Boolean? = null,

	@field:SerializedName("enablePickupNotAvailableVariation2")
	val enablePickupNotAvailableVariation2: Boolean? = null,

	@field:SerializedName("enableSetPickupMutation")
	val enableSetPickupMutation: Boolean? = null,

	@field:SerializedName("enableSlotShortcutImplicitIntent")
	val enableSlotShortcutImplicitIntent: Boolean? = null,

	@field:SerializedName("enableCrossPollination")
	val enableCrossPollination: Boolean? = null,

	@field:SerializedName("enableWirelessFreebiePromo")
	val enableWirelessFreebiePromo: Boolean? = null,

	@field:SerializedName("enableRegistry")
	val enableRegistry: Boolean? = null,

	@field:SerializedName("enableCartGIC")
	val enableCartGIC: Boolean? = null,

	@field:SerializedName("enableLastCallPhase2")
	val enableLastCallPhase2: Boolean? = null,

	@field:SerializedName("disableCartIconPriceTotal")
	val disableCartIconPriceTotal: Boolean? = null,

	@field:SerializedName("enableShippingIntent")
	val enableShippingIntent: Boolean? = null,

	@field:SerializedName("enableExpressUpsell")
	val enableExpressUpsell: Boolean? = null,

	@field:SerializedName("enableLeanMode")
	val enableLeanMode: Boolean? = null,

	@field:SerializedName("enableCartWplusBannerTempo")
	val enableCartWplusBannerTempo: Boolean? = null,

	@field:SerializedName("disableEstTotalOnMweb")
	val disableEstTotalOnMweb: Boolean? = null,

	@field:SerializedName("enableQueueing")
	val enableQueueing: Boolean? = null,

	@field:SerializedName("enableFFModuleHideUnhideCarrot")
	val enableFFModuleHideUnhideCarrot: Boolean? = null,

	@field:SerializedName("enableProductTileV2")
	val enableProductTileV2: Boolean? = null,

	@field:SerializedName("enableEvergreenFee")
	val enableEvergreenFee: Boolean? = null,

	@field:SerializedName("enableFulfillmentHeadersV2")
	val enableFulfillmentHeadersV2: Boolean? = null,

	@field:SerializedName("leanModeRetryLimit")
	val leanModeRetryLimit: Int? = null,

	@field:SerializedName("enableLastCall")
	val enableLastCall: Boolean? = null,

	@field:SerializedName("enableFulfillmentGroupId")
	val enableFulfillmentGroupId: Boolean? = null,

	@field:SerializedName("enableAccSchedulingFindStores")
	val enableAccSchedulingFindStores: Boolean? = null,

	@field:SerializedName("enableFPCEAosVariant")
	val enableFPCEAosVariant: Int? = null,

	@field:SerializedName("enableOOSHotFix")
	val enableOOSHotFix: Boolean? = null,

	@field:SerializedName("enableMiniCart")
	val enableMiniCart: Boolean? = null,

	@field:SerializedName("enableFreeAmendAndReturn")
	val enableFreeAmendAndReturn: Boolean? = null,

	@field:SerializedName("enableStarRatings")
	val enableStarRatings: Boolean? = null,

	@field:SerializedName("enableFreeShippingAndPickup")
	val enableFreeShippingAndPickup: Boolean? = null,

	@field:SerializedName("enableSFLPerformanceMode")
	val enableSFLPerformanceMode: Boolean? = null,

	@field:SerializedName("enableOnXoMoveOosToSfl")
	val enableOnXoMoveOosToSfl: Boolean? = null,

	@field:SerializedName("enableSSR")
	val enableSSR: Boolean? = null,

	@field:SerializedName("enableClearMergeCartSFL")
	val enableClearMergeCartSFL: Boolean? = null,

	@field:SerializedName("enableShopSimilar")
	val enableShopSimilar: Boolean? = null,

	@field:SerializedName("enableSFLSmileyPrice")
	val enableSFLSmileyPrice: Boolean? = null,

	@field:SerializedName("enableATFGiftingUI")
	val enableATFGiftingUI: Boolean? = null,

	@field:SerializedName("enableCartBookslotShortcut")
	val enableCartBookslotShortcut: Boolean? = null,

	@field:SerializedName("enablePACCheckout")
	val enablePACCheckout: Boolean? = null,

	@field:SerializedName("enableCartWplusBannerShippingMoreThanMin")
	val enableCartWplusBannerShippingMoreThanMin: Boolean? = null,

	@field:SerializedName("enableEnhancedItemUpdates")
	val enableEnhancedItemUpdates: Boolean? = null,

	@field:SerializedName("disableCartPartialIntentWarning")
	val disableCartPartialIntentWarning: Boolean? = null,

	@field:SerializedName("initialSFLCount")
	val initialSFLCount: Int? = null,

	@field:SerializedName("enableClearMergeCartId")
	val enableClearMergeCartId: Boolean? = null,

	@field:SerializedName("enableExpressReservationEndTime")
	val enableExpressReservationEndTime: Boolean? = null,

	@field:SerializedName("hideGuestXOCTA")
	val hideGuestXOCTA: Boolean? = null,

	@field:SerializedName("enableSplashRouteAddition")
	val enableSplashRouteAddition: Boolean? = null,

	@field:SerializedName("enablePACAOSVariants")
	val enablePACAOSVariants: Int? = null,

	@field:SerializedName("disableItemLevelMSI")
	val disableItemLevelMSI: Boolean? = null,

	@field:SerializedName("enableGiftingCheckbox")
	val enableGiftingCheckbox: Boolean? = null,

	@field:SerializedName("enableWplusRemoveBannersCardCheck")
	val enableWplusRemoveBannersCardCheck: Boolean? = null,

	@field:SerializedName("enableAccModalOnItemPage")
	val enableAccModalOnItemPage: Boolean? = null,

	@field:SerializedName("enableSignInFromCart")
	val enableSignInFromCart: Boolean? = null,

	@field:SerializedName("enableOOSAlertScroll")
	val enableOOSAlertScroll: Boolean? = null,

	@field:SerializedName("disableGuestPartialXO")
	val disableGuestPartialXO: Boolean? = null,

	@field:SerializedName("savingsRecommendationTextV2")
	val savingsRecommendationTextV2: Boolean? = null,

	@field:SerializedName("calculateFooterPositionOnResize")
	val calculateFooterPositionOnResize: Boolean? = null,

	@field:SerializedName("enableStoreSnackBarMessage")
	val enableStoreSnackBarMessage: Boolean? = null,

	@field:SerializedName("enableAccountDWeb")
	val enableAccountDWeb: Boolean? = null,

	@field:SerializedName("registriesUrl")
	val registriesUrl: String? = null,

	@field:SerializedName("enableGoogleAutoComplete")
	val enableGoogleAutoComplete: Boolean? = null,

	@field:SerializedName("enableMyItemsMenu")
	val enableMyItemsMenu: Boolean? = null,

	@field:SerializedName("isLoginRedirectionEnabled")
	val isLoginRedirectionEnabled: Boolean? = null,

	@field:SerializedName("enablePostalCodeMessage")
	val enablePostalCodeMessage: Boolean? = null,

	@field:SerializedName("enableAccountWallet")
	val enableAccountWallet: Boolean? = null,

	@field:SerializedName("ccpaUrl")
	val ccpaUrl: String? = null,

	@field:SerializedName("enableZipcodeInAddressSelector")
	val enableZipcodeInAddressSelector: Boolean? = null,

	@field:SerializedName("showSignInNudgeDweb")
	val showSignInNudgeDweb: Boolean? = null,

	@field:SerializedName("customCakeUrl")
	val customCakeUrl: String? = null,

	@field:SerializedName("enableDigitalRewards")
	val enableDigitalRewards: Boolean? = null,

	@field:SerializedName("communicationAndPrivacyUrl")
	val communicationAndPrivacyUrl: String? = null,

	@field:SerializedName("digitalRewardsUrl")
	val digitalRewardsUrl: String? = null,

	@field:SerializedName("disableGuestUserAutocomplete")
	val disableGuestUserAutocomplete: Boolean? = null,

	@field:SerializedName("protectionPlanUrl")
	val protectionPlanUrl: String? = null,

	@field:SerializedName("enchancedAccountPharmacyUrl")
	val enchancedAccountPharmacyUrl: String? = null,

	@field:SerializedName("reorderUrl")
	val reorderUrl: String? = null,

	@field:SerializedName("enableItemSubscriptionRamp")
	val enableItemSubscriptionRamp: Boolean? = null,

	@field:SerializedName("enablePetsLink")
	val enablePetsLink: Boolean? = null,

	@field:SerializedName("ccpaNewRequestUrl")
	val ccpaNewRequestUrl: String? = null,

	@field:SerializedName("autoCareCenterUrl")
	val autoCareCenterUrl: String? = null,

	@field:SerializedName("enablePhoneCollection")
	val enablePhoneCollection: Boolean? = null,

	@field:SerializedName("enableAddressLineOneAutofill")
	val enableAddressLineOneAutofill: Boolean? = null,

	@field:SerializedName("enableCharityOfChoice")
	val enableCharityOfChoice: Boolean? = null,

	@field:SerializedName("enableInHomeAddress")
	val enableInHomeAddress: Boolean? = null,

	@field:SerializedName("vuduLibraryUrl")
	val vuduLibraryUrl: String? = null,

	@field:SerializedName("enablePetHubPage")
	val enablePetHubPage: Boolean? = null,

	@field:SerializedName("enableLocationAutoComplete")
	val enableLocationAutoComplete: Boolean? = null,

	@field:SerializedName("eBookUrl")
	val eBookUrl: String? = null,

	@field:SerializedName("isInHomeEnabled")
	val isInHomeEnabled: Boolean? = null,

	@field:SerializedName("enableSpendAnalyzer")
	val enableSpendAnalyzer: Boolean? = null,

	@field:SerializedName("enableNextBestAction")
	val enableNextBestAction: Boolean? = null,

	@field:SerializedName("enableAccountMWeb")
	val enableAccountMWeb: Boolean? = null,

	@field:SerializedName("enableSubscriptionModule")
	val enableSubscriptionModule: Boolean? = null,

	@field:SerializedName("enableAVSOverrideGoogleAutoComplete")
	val enableAVSOverrideGoogleAutoComplete: Boolean? = null,

	@field:SerializedName("walmartPlusUrl")
	val walmartPlusUrl: String? = null,

	@field:SerializedName("enablePostalCodeOnly")
	val enablePostalCodeOnly: Boolean? = null,

	@field:SerializedName("enableInHomeEdit")
	val enableInHomeEdit: Boolean? = null,

	@field:SerializedName("listsUrl")
	val listsUrl: String? = null,

	@field:SerializedName("showSignInNudgeMWeb")
	val showSignInNudgeMWeb: Boolean? = null,

	@field:SerializedName("placeholder")
	val placeholder: String? = null,

	@field:SerializedName("enableWalmartPlus")
	val enableWalmartPlus: Boolean? = null,

	@field:SerializedName("enableYourProfileSection")
	val enableYourProfileSection: Boolean? = null,

	@field:SerializedName("itemSubscriptionUrl")
	val itemSubscriptionUrl: String? = null,

	@field:SerializedName("enableWalmartPlusPreference")
	val enableWalmartPlusPreference: Boolean? = null,

	@field:SerializedName("walmartAssociateUrl")
	val walmartAssociateUrl: String? = null,

	@field:SerializedName("pharmacyUrl")
	val pharmacyUrl: String? = null,

	@field:SerializedName("enableFeatureCommsAndPrivacy")
	val enableFeatureCommsAndPrivacy: Boolean? = null,

	@field:SerializedName("enableAvsOverride")
	val enableAvsOverride: Boolean? = null,

	@field:SerializedName("shouldUpdateCartAfterUpdateZipcode")
	val shouldUpdateCartAfterUpdateZipcode: Boolean? = null,

	@field:SerializedName("isFCShippingEnabled")
	val isFCShippingEnabled: Boolean? = null,

	@field:SerializedName("enableItemSubscription")
	val enableItemSubscription: Boolean? = null,

	@field:SerializedName("isRewardsEnabled")
	val isRewardsEnabled: Boolean? = null,

	@field:SerializedName("isMobileVerificationEnabled")
	val isMobileVerificationEnabled: Boolean? = null,

	@field:SerializedName("enableEvergreenSlot")
	val enableEvergreenSlot: Boolean? = null,

	@field:SerializedName("enablePriorityTimesIntegratedSignup")
	val enablePriorityTimesIntegratedSignup: Boolean? = null,

	@field:SerializedName("expressDeliveryOnlyStores")
	val expressDeliveryOnlyStores: Boolean? = null,

	@field:SerializedName("hidePickupSlotPrice")
	val hidePickupSlotPrice: Boolean? = null,

	@field:SerializedName("enableEvergreenHolidayDiscount")
	val enableEvergreenHolidayDiscount: Boolean? = null,

	@field:SerializedName("enableUseCurrentLocation")
	val enableUseCurrentLocation: Boolean? = null,

	@field:SerializedName("enableBlockRegistrantAddressDelivery")
	val enableBlockRegistrantAddressDelivery: Boolean? = null,

	@field:SerializedName("enableEarliestAvailableSlotPreselection")
	val enableEarliestAvailableSlotPreselection: Boolean? = null,

	@field:SerializedName("enableFulfillmentIntent")
	val enableFulfillmentIntent: Boolean? = null,

	@field:SerializedName("enableInHomeAmPmSlotsPhase2")
	val enableInHomeAmPmSlotsPhase2: Boolean? = null,

	@field:SerializedName("enableUseCurrentLocationFromBrowser")
	val enableUseCurrentLocationFromBrowser: Boolean? = null,

	@field:SerializedName("evergreenWPlusMemberHolidayDiscountStrikeoutPrice")
	val evergreenWPlusMemberHolidayDiscountStrikeoutPrice: String? = null,

	@field:SerializedName("enableEarliestAvailableDayPreselection")
	val enableEarliestAvailableDayPreselection: Boolean? = null,

	@field:SerializedName("enableNoPickupSlotSelectionForDefaultStore")
	val enableNoPickupSlotSelectionForDefaultStore: Boolean? = null,

	@field:SerializedName("nodeSelectableOnlineEnable")
	val nodeSelectableOnlineEnable: Boolean? = null,

	@field:SerializedName("enableStoreHours")
	val enableStoreHours: Boolean? = null,

	@field:SerializedName("hideStoreChooserDefaultAlert")
	val hideStoreChooserDefaultAlert: Boolean? = null,

	@field:SerializedName("tempoCacheExpirationInSeconds")
	val tempoCacheExpirationInSeconds: Int? = null,

	@field:SerializedName("enableReservationNotAcceptableFix")
	val enableReservationNotAcceptableFix: Boolean? = null,

	@field:SerializedName("enableStoreSelectorFeedback")
	val enableStoreSelectorFeedback: Boolean? = null,

	@field:SerializedName("enableStoreSelectorMarketplacePickup")
	val enableStoreSelectorMarketplacePickup: Boolean? = null,

	@field:SerializedName("enableAllSlotsUnavailableMessageTypesFix")
	val enableAllSlotsUnavailableMessageTypesFix: Boolean? = null,

	@field:SerializedName("enableACCStoreSelectorOnSlotsUnavailable")
	val enableACCStoreSelectorOnSlotsUnavailable: Boolean? = null,

	@field:SerializedName("enableFulfillmentOptionURLParam")
	val enableFulfillmentOptionURLParam: Boolean? = null,

	@field:SerializedName("disableFreeDeliveryBannerForExpressOnlyStores")
	val disableFreeDeliveryBannerForExpressOnlyStores: Boolean? = null,

	@field:SerializedName("enablePassCartIdAcidCheckStoreSelector")
	val enablePassCartIdAcidCheckStoreSelector: Boolean? = null,

	@field:SerializedName("enableInHomeAmPmSlots")
	val enableInHomeAmPmSlots: Boolean? = null,

	@field:SerializedName("enableInHomeSlotsQueryHeader")
	val enableInHomeSlotsQueryHeader: Boolean? = null,

	@field:SerializedName("mergeSlotsEnable")
	val mergeSlotsEnable: Boolean? = null,

	@field:SerializedName("gmStoreMessageForNoUSPSlot")
	val gmStoreMessageForNoUSPSlot: Boolean? = null,

	@field:SerializedName("enableZeroDeliverySlotPriceFree")
	val enableZeroDeliverySlotPriceFree: Boolean? = null,

	@field:SerializedName("enableReReserveSlot")
	val enableReReserveSlot: Boolean? = null,

	@field:SerializedName("walmartPlusFreeDelivery")
	val walmartPlusFreeDelivery: Boolean? = null,

	@field:SerializedName("evergreenNonMemberHolidayDiscountStrikeoutPrice")
	val evergreenNonMemberHolidayDiscountStrikeoutPrice: String? = null,

	@field:SerializedName("disableSlotShortcutInGIC")
	val disableSlotShortcutInGIC: Boolean? = null,

	@field:SerializedName("alcoholRestrictedSlotsFilterEnable")
	val alcoholRestrictedSlotsFilterEnable: Boolean? = null,

	@field:SerializedName("disableMergeAndGetCartCSR")
	val disableMergeAndGetCartCSR: Boolean? = null,

	@field:SerializedName("enableAvailableForInstallationText")
	val enableAvailableForInstallationText: Boolean? = null,

	@field:SerializedName("enablePassCartIdAcidCheck")
	val enablePassCartIdAcidCheck: Boolean? = null,

	@field:SerializedName("bookslotShortcutMaxSlotReqCount")
	val bookslotShortcutMaxSlotReqCount: Int? = null,

	@field:SerializedName("enableNoSlotPreselectionOnTabSwitch")
	val enableNoSlotPreselectionOnTabSwitch: Boolean? = null,

	@field:SerializedName("enableSlotPreSelectionV2")
	val enableSlotPreSelectionV2: Boolean? = null,

	@field:SerializedName("enableUnauthorizedAccessToCartErrorFix")
	val enableUnauthorizedAccessToCartErrorFix: Boolean? = null,

	@field:SerializedName("enablePickupOnShippingIntent")
	val enablePickupOnShippingIntent: Boolean? = null,

	@field:SerializedName("enableDeliveryFromStoreInfoModule")
	val enableDeliveryFromStoreInfoModule: Boolean? = null,

	@field:SerializedName("enableDeliveryAddressFromSlotData")
	val enableDeliveryAddressFromSlotData: Boolean? = null,

	@field:SerializedName("enableHideInstoreCheckmark")
	val enableHideInstoreCheckmark: Boolean? = null,

	@field:SerializedName("enablePriorityTimes")
	val enablePriorityTimes: Boolean? = null,

	@field:SerializedName("maxCountOfStoresForInventory")
	val maxCountOfStoresForInventory: Int? = null,

	@field:SerializedName("enablePreselectionV2UserIntentOverReservation")
	val enablePreselectionV2UserIntentOverReservation: Boolean? = null,

	@field:SerializedName("enableCartFulfillmentOption")
	val enableCartFulfillmentOption: Boolean? = null,

	@field:SerializedName("enableNoSlotsAvailableScreen")
	val enableNoSlotsAvailableScreen: Boolean? = null,

	@field:SerializedName("enableStoreSelectorUnauthorizedAccessToCartErrorFix")
	val enableStoreSelectorUnauthorizedAccessToCartErrorFix: Boolean? = null,

	@field:SerializedName("hideServiceWidget")
	val hideServiceWidget: Boolean? = null,

	@field:SerializedName("showNavLinks")
	val showNavLinks: Boolean? = null,

	@field:SerializedName("fetchLocation")
	val fetchLocation: Boolean? = null,

	@field:SerializedName("maxCalloutsPerBSTC")
	val maxCalloutsPerBSTC: Int? = null,

	@field:SerializedName("enableNavClickability")
	val enableNavClickability: Boolean? = null,

	@field:SerializedName("enableGoogleEnhancedPlaceActions")
	val enableGoogleEnhancedPlaceActions: Boolean? = null,

	@field:SerializedName("enableGICAutoShowOnSessionStart")
	val enableGICAutoShowOnSessionStart: Boolean? = null,

	@field:SerializedName("showOptOut")
	val showOptOut: Boolean? = null,

	@field:SerializedName("enabledGICRetentionPrompt")
	val enabledGICRetentionPrompt: Boolean? = null,

	@field:SerializedName("enableL0SeoLinksForAllPage")
	val enableL0SeoLinksForAllPage: Boolean? = null,

	@field:SerializedName("heartingEnhancementsEnable")
	val heartingEnhancementsEnable: Boolean? = null,

	@field:SerializedName("enableTADropdown")
	val enableTADropdown: Boolean? = null,

	@field:SerializedName("enableGIC")
	val enableGIC: Boolean? = null,

	@field:SerializedName("calloutViewsPerIdPerBSTC")
	val calloutViewsPerIdPerBSTC: Int? = null,

	@field:SerializedName("flyOutExpandOnClick")
	val flyOutExpandOnClick: Boolean? = null,

	@field:SerializedName("enableWplusLogoOnSiteHeader")
	val enableWplusLogoOnSiteHeader: Boolean? = null,

	@field:SerializedName("navLinks")
	val navLinks: String? = null,

	@field:SerializedName("isAlertBarEnabled")
	val isAlertBarEnabled: Boolean? = null,

	@field:SerializedName("fetchLocationCSROnLoad")
	val fetchLocationCSROnLoad: Boolean? = null,

	@field:SerializedName("enableResponsiveHF")
	val enableResponsiveHF: Boolean? = null,

	@field:SerializedName("calloutViewsPerIdPerVTC")
	val calloutViewsPerIdPerVTC: Int? = null,

	@field:SerializedName("enableDeliveryStoreSelection")
	val enableDeliveryStoreSelection: Boolean? = null,

	@field:SerializedName("calloutsEnabled")
	val calloutsEnabled: Boolean? = null,

	@field:SerializedName("enableL0SeoLinksForItemPage")
	val enableL0SeoLinksForItemPage: Boolean? = null,

	@field:SerializedName("showAddressLineOne")
	val showAddressLineOne: Boolean? = null,

	@field:SerializedName("enableStickyGIC")
	val enableStickyGIC: Boolean? = null,

	@field:SerializedName("alwaysAllowedTagList")
	val alwaysAllowedTagList: String? = null,

	@field:SerializedName("logLevel")
	val logLevel: String? = null,

	@field:SerializedName("enableV1Schema")
	val enableV1Schema: Boolean? = null,

	@field:SerializedName("enableQuantumMetric")
	val enableQuantumMetric: Boolean? = null,

	@field:SerializedName("enableXOFeedback")
	val enableXOFeedback: Boolean? = null,

	@field:SerializedName("feedbackFetchMigrationToPlatformFetch")
	val feedbackFetchMigrationToPlatformFetch: Boolean? = null,

	@field:SerializedName("hideGiveFeedbackSection")
	val hideGiveFeedbackSection: Boolean? = null,

	@field:SerializedName("enableNativeAppDownloadBottomsheet")
	val enableNativeAppDownloadBottomsheet: Boolean? = null,

	@field:SerializedName("enableEmailSignup")
	val enableEmailSignup: Boolean? = null,

	@field:SerializedName("timeIntervalInHoursNativeAppInstallPrompt")
	val timeIntervalInHoursNativeAppInstallPrompt: Int? = null,

	@field:SerializedName("enableNativeAppDownloadStickyBanner")
	val enableNativeAppDownloadStickyBanner: Boolean? = null,

	@field:SerializedName("enableInStoreWifiAppPrompt")
	val enableInStoreWifiAppPrompt: Boolean? = null,

	@field:SerializedName("enablePrivacyLinkUpdate")
	val enablePrivacyLinkUpdate: Boolean? = null,

	@field:SerializedName("maxNumberOfNativeAppInstallPrompt")
	val maxNumberOfNativeAppInstallPrompt: Int? = null,

	@field:SerializedName("enableForceB2BLogout")
	val enableForceB2BLogout: Boolean? = null,

	@field:SerializedName("isFullFooterEnabled")
	val isFullFooterEnabled: Boolean? = null,

	@field:SerializedName("enableExternalInfoUrl")
	val enableExternalInfoUrl: Boolean? = null,

	@field:SerializedName("enableNewStackedRecallNoResult")
	val enableNewStackedRecallNoResult: Boolean? = null,

	@field:SerializedName("fetchItemsV2Enable")
	val fetchItemsV2Enable: Boolean? = null,

	@field:SerializedName("threeColumnGrid")
	val threeColumnGrid: Boolean? = null,

	@field:SerializedName("atfDwebGridCount")
	val atfDwebGridCount: Int? = null,

	@field:SerializedName("enableAccInstallation")
	val enableAccInstallation: Boolean? = null,

	@field:SerializedName("enableFashionTopNav")
	val enableFashionTopNav: Boolean? = null,

	@field:SerializedName("enableFlattenedFitment")
	val enableFlattenedFitment: Boolean? = null,

	@field:SerializedName("enableFulfillmentBadge")
	val enableFulfillmentBadge: Boolean? = null,

	@field:SerializedName("enableTopNavItemStack")
	val enableTopNavItemStack: Boolean? = null,

	@field:SerializedName("enableFacetCount")
	val enableFacetCount: Boolean? = null,

	@field:SerializedName("fitmentTopicPageEnable")
	val fitmentTopicPageEnable: Boolean? = null,

	@field:SerializedName("enableGrapqlQueryParams")
	val enableGrapqlQueryParams: Boolean? = null,

	@field:SerializedName("enableStylesheetsForInlineStyles")
	val enableStylesheetsForInlineStyles: Boolean? = null,

	@field:SerializedName("fetchTimeoutMs")
	val fetchTimeoutMs: Int? = null,

	@field:SerializedName("bookSlotPersistentFilterEnable")
	val bookSlotPersistentFilterEnable: Boolean? = null,

	@field:SerializedName("mwebGridProductCount")
	val mwebGridProductCount: Int? = null,

	@field:SerializedName("enableRemoveEmptyProductFlagRows")
	val enableRemoveEmptyProductFlagRows: Boolean? = null,

	@field:SerializedName("secondaryQuerySwitch")
	val secondaryQuerySwitch: Boolean? = null,

	@field:SerializedName("enableViewportThreshold")
	val enableViewportThreshold: Boolean? = null,

	@field:SerializedName("enableRelatedSearches")
	val enableRelatedSearches: Boolean? = null,

	@field:SerializedName("enableItemStackLazyLoading")
	val enableItemStackLazyLoading: Boolean? = null,

	@field:SerializedName("enableSearchSkinnyBanner")
	val enableSearchSkinnyBanner: Boolean? = null,

	@field:SerializedName("enableInvalidateGICQuery")
	val enableInvalidateGICQuery: Boolean? = null,

	@field:SerializedName("enablePortableFacets")
	val enablePortableFacets: Boolean? = null,

	@field:SerializedName("viewportThresholdDesktop")
	val viewportThresholdDesktop: Double? = null,

	@field:SerializedName("enableVariantsPagination")
	val enableVariantsPagination: Boolean? = null,

	@field:SerializedName("displayMobileATCJustified")
	val displayMobileATCJustified: Boolean? = null,

	@field:SerializedName("displayMobileATCLeftAligned")
	val displayMobileATCLeftAligned: Boolean? = null,

	@field:SerializedName("enablePaginationIO")
	val enablePaginationIO: Boolean? = null,

	@field:SerializedName("showARExperienceBadging")
	val showARExperienceBadging: Boolean? = null,

	@field:SerializedName("lazyLoadMS")
	val lazyLoadMS: Int? = null,

	@field:SerializedName("enableSearchPageSSR")
	val enableSearchPageSSR: Boolean? = null,

	@field:SerializedName("smileVariation")
	val smileVariation: Int? = null,

	@field:SerializedName("enableOLImageSize")
	val enableOLImageSize: Boolean? = null,

	@field:SerializedName("fitmentModulesEnable")
	val fitmentModulesEnable: Boolean? = null,

	@field:SerializedName("pricingDisclaimerText")
	val pricingDisclaimerText: String? = null,

	@field:SerializedName("skipGICIntent")
	val skipGICIntent: Boolean? = null,

	@field:SerializedName("mwebListProductCount")
	val mwebListProductCount: Int? = null,

	@field:SerializedName("enableStickyDisclaimerBar")
	val enableStickyDisclaimerBar: Boolean? = null,

	@field:SerializedName("enableLHNFilterUpdateGQLCall")
	val enableLHNFilterUpdateGQLCall: Boolean? = null,

	@field:SerializedName("enableAOSPanel")
	val enableAOSPanel: Boolean? = null,

	@field:SerializedName("postProcessedQueryEnable")
	val postProcessedQueryEnable: Boolean? = null,

	@field:SerializedName("seoModulesEnable")
	val seoModulesEnable: Boolean? = null,

	@field:SerializedName("enableTopNavUpdateGQLCall")
	val enableTopNavUpdateGQLCall: Boolean? = null,

	@field:SerializedName("enableMaxWidth")
	val enableMaxWidth: Boolean? = null,

	@field:SerializedName("enableIntersectedSearchResults")
	val enableIntersectedSearchResults: Boolean? = null,

	@field:SerializedName("enableFIDLogging")
	val enableFIDLogging: Boolean? = null,

	@field:SerializedName("topResultSubHeader")
	val topResultSubHeader: String? = null,

	@field:SerializedName("enableSubscriptionFeature")
	val enableSubscriptionFeature: Boolean? = null,

	@field:SerializedName("subscriptionHeaderImage")
	val subscriptionHeaderImage: String? = null,

	@field:SerializedName("topResultHeader")
	val topResultHeader: String? = null,

	@field:SerializedName("enableValuePricing")
	val enableValuePricing: Boolean? = null,

	@field:SerializedName("enableColorSwatch")
	val enableColorSwatch: Boolean? = null,

	@field:SerializedName("enableScrollBasedLazyLoading")
	val enableScrollBasedLazyLoading: Boolean? = null,

	@field:SerializedName("enableAspectRecommendation")
	val enableAspectRecommendation: Boolean? = null,

	@field:SerializedName("enableSpecificLazyFeature")
	val enableSpecificLazyFeature: String? = null,

	@field:SerializedName("enableFacetExpansion")
	val enableFacetExpansion: Boolean? = null,

	@field:SerializedName("viewportThresholdMobile")
	val viewportThresholdMobile: Double? = null,

	@field:SerializedName("enableFulfillmentMethodDemo")
	val enableFulfillmentMethodDemo: Boolean? = null,

	@field:SerializedName("interesectedResultsBottomMargin")
	val interesectedResultsBottomMargin: Double? = null,

	@field:SerializedName("enableRemovePadding")
	val enableRemovePadding: Boolean? = null,

	@field:SerializedName("enableRelatedSearchHorizontalPills")
	val enableRelatedSearchHorizontalPills: Boolean? = null,

	@field:SerializedName("enableNUps")
	val enableNUps: Boolean? = null,

	@field:SerializedName("enableAOS")
	val enableAOS: Boolean? = null,

	@field:SerializedName("enableVisionCenterBadgeSearch")
	val enableVisionCenterBadgeSearch: Boolean? = null,

	@field:SerializedName("removeLHNDuplicates")
	val removeLHNDuplicates: Boolean? = null,

	@field:SerializedName("enableSingleItemTopResult")
	val enableSingleItemTopResult: Boolean? = null,

	@field:SerializedName("listViewEnum")
	val listViewEnum: Int? = null,

	@field:SerializedName("dwebGridProductCount")
	val dwebGridProductCount: Int? = null,

	@field:SerializedName("enableLeftHandNav")
	val enableLeftHandNav: Boolean? = null,

	@field:SerializedName("atfMwebListCount")
	val atfMwebListCount: Int? = null,

	@field:SerializedName("enablePricingDisclaimer")
	val enablePricingDisclaimer: Boolean? = null,

	@field:SerializedName("enableVariantDynamicText")
	val enableVariantDynamicText: Boolean? = null,

	@field:SerializedName("topicPageSortBy")
	val topicPageSortBy: String? = null,

	@field:SerializedName("enableLCPSingleImagePrefetch")
	val enableLCPSingleImagePrefetch: Boolean? = null,

	@field:SerializedName("enableLCPHighFetchPriority")
	val enableLCPHighFetchPriority: Boolean? = null,

	@field:SerializedName("enableVariantItemSmile")
	val enableVariantItemSmile: Boolean? = null,

	@field:SerializedName("displayMobileATCRightAligned")
	val displayMobileATCRightAligned: Boolean? = null,

	@field:SerializedName("bannerModulesEnable")
	val bannerModulesEnable: Boolean? = null,

	@field:SerializedName("enableLHNCategoryTree")
	val enableLHNCategoryTree: Boolean? = null,

	@field:SerializedName("lcpImageQuality")
	val lcpImageQuality: String? = null,

	@field:SerializedName("searchPersistentFilterEnable")
	val searchPersistentFilterEnable: Boolean? = null,

	@field:SerializedName("enableLCPSingleImagePrefetchScaleFallback")
	val enableLCPSingleImagePrefetchScaleFallback: Boolean? = null,

	@field:SerializedName("clientFetchTimeoutMs")
	val clientFetchTimeoutMs: Int? = null,

	@field:SerializedName("enableSearchSSRParallelQueries")
	val enableSearchSSRParallelQueries: Boolean? = null,

	@field:SerializedName("enableSimilarItems")
	val enableSimilarItems: Boolean? = null,

	@field:SerializedName("searchPageBuyNowType")
	val searchPageBuyNowType: Int? = null,

	@field:SerializedName("imageSizeEnum")
	val imageSizeEnum: Int? = null,

	@field:SerializedName("enableSecondaryStackType")
	val enableSecondaryStackType: Int? = null,

	@field:SerializedName("partialRenderEnable")
	val partialRenderEnable: Boolean? = null,

	@field:SerializedName("tileTakeOver")
	val tileTakeOver: Boolean? = null,

	@field:SerializedName("enableRemoveEmptyProductVariantRows")
	val enableRemoveEmptyProductVariantRows: Boolean? = null,

	@field:SerializedName("spSvplaysInline")
	val spSvplaysInline: Boolean? = null,

	@field:SerializedName("cpMq1RenderEnable")
	val cpMq1RenderEnable: Boolean? = null,

	@field:SerializedName("spSvLoopCompleteEventEnable")
	val spSvLoopCompleteEventEnable: Boolean? = null,

	@field:SerializedName("ipMq1RenderEnable")
	val ipMq1RenderEnable: Boolean? = null,

	@field:SerializedName("ipMq1DSPEnable")
	val ipMq1DSPEnable: Boolean? = null,

	@field:SerializedName("enableHpRedesignXPA")
	val enableHpRedesignXPA: Boolean? = null,

	@field:SerializedName("bpMq2Measure1PEnable")
	val bpMq2Measure1PEnable: Boolean? = null,

	@field:SerializedName("measure3PImpEnable")
	val measure3PImpEnable: Boolean? = null,

	@field:SerializedName("ipBr1VideoDSPEnabled")
	val ipBr1VideoDSPEnabled: Boolean? = null,

	@field:SerializedName("adPreviewMode")
	val adPreviewMode: Boolean? = null,

	@field:SerializedName("spSvInViewRemoveVideoData")
	val spSvInViewRemoveVideoData: Boolean? = null,

	@field:SerializedName("adsHpControlGroupXpa")
	val adsHpControlGroupXpa: String? = null,

	@field:SerializedName("hpMq1Measure1PEnable")
	val hpMq1Measure1PEnable: Boolean? = null,

	@field:SerializedName("enableVideoTracker")
	val enableVideoTracker: Boolean? = null,

	@field:SerializedName("hpMq1Measure3PEnable")
	val hpMq1Measure3PEnable: Boolean? = null,

	@field:SerializedName("bpSpc1ReqEnable")
	val bpSpc1ReqEnable: Boolean? = null,

	@field:SerializedName("sbaUiEnhanceEnable")
	val sbaUiEnhanceEnable: Boolean? = null,

	@field:SerializedName("displayCheckIp")
	val displayCheckIp: Boolean? = null,

	@field:SerializedName("spSvUiAlphaUpdate")
	val spSvUiAlphaUpdate: Boolean? = null,

	@field:SerializedName("cartP13nMeasure1PEnable")
	val cartP13nMeasure1PEnable: Boolean? = null,

	@field:SerializedName("cpSkRenderEnable")
	val cpSkRenderEnable: Boolean? = null,

	@field:SerializedName("hpRedesignVisitedXpa")
	val hpRedesignVisitedXpa: String? = null,

	@field:SerializedName("spSvHideTabletVideo")
	val spSvHideTabletVideo: Boolean? = null,

	@field:SerializedName("shpSkRenderEnable")
	val shpSkRenderEnable: Boolean? = null,

	@field:SerializedName("adsControlGroupXpa")
	val adsControlGroupXpa: String? = null,

	@field:SerializedName("moatRefactorEnable")
	val moatRefactorEnable: Boolean? = null,

	@field:SerializedName("bpSpc1Measure1PEnable")
	val bpSpc1Measure1PEnable: Boolean? = null,

	@field:SerializedName("typMq1ReqEnable")
	val typMq1ReqEnable: Boolean? = null,

	@field:SerializedName("bpMq1DSPEnable")
	val bpMq1DSPEnable: Boolean? = null,

	@field:SerializedName("sbaMwebRedesignV2Enable")
	val sbaMwebRedesignV2Enable: Boolean? = null,

	@field:SerializedName("hpGalRenderEnable")
	val hpGalRenderEnable: Boolean? = null,

	@field:SerializedName("adSPIncrementDecrementCheck")
	val adSPIncrementDecrementCheck: Boolean? = null,

	@field:SerializedName("hpGpbFs1Measure3PEnable")
	val hpGpbFs1Measure3PEnable: Boolean? = null,

	@field:SerializedName("spMq1Measure1PEnable")
	val spMq1Measure1PEnable: Boolean? = null,

	@field:SerializedName("odpSkMeasure1PEnable")
	val odpSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("odpSkReqEnable")
	val odpSkReqEnable: Boolean? = null,

	@field:SerializedName("typMq1Measure1PEnable")
	val typMq1Measure1PEnable: Boolean? = null,

	@field:SerializedName("bpMq1Measure1PEnable")
	val bpMq1Measure1PEnable: Boolean? = null,

	@field:SerializedName("spMq2ReqEnable")
	val spMq2ReqEnable: Boolean? = null,

	@field:SerializedName("dspViewabilityTracking")
	val dspViewabilityTracking: Boolean? = null,

	@field:SerializedName("bpSkRenderEnable")
	val bpSkRenderEnable: Boolean? = null,

	@field:SerializedName("hpTpFs2ReqEnable")
	val hpTpFs2ReqEnable: Boolean? = null,

	@field:SerializedName("ipBbReqEnable")
	val ipBbReqEnable: Boolean? = null,

	@field:SerializedName("displayPreviousRenderCheck")
	val displayPreviousRenderCheck: Boolean? = null,

	@field:SerializedName("enableGalleryItemChanges")
	val enableGalleryItemChanges: Boolean? = null,

	@field:SerializedName("hpMq1ReqEnable")
	val hpMq1ReqEnable: Boolean? = null,

	@field:SerializedName("bpBigMeasure1PEnable")
	val bpBigMeasure1PEnable: Boolean? = null,

	@field:SerializedName("sbaMwebRedesignV1Enable")
	val sbaMwebRedesignV1Enable: Boolean? = null,

	@field:SerializedName("ipSkMeasure3PEnable")
	val ipSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("hpMq2Measure3PEnable")
	val hpMq2Measure3PEnable: Boolean? = null,

	@field:SerializedName("spVideoAdsMobileStyling")
	val spVideoAdsMobileStyling: Boolean? = null,

	@field:SerializedName("bpMq2Measure3PEnable")
	val bpMq2Measure3PEnable: Boolean? = null,

	@field:SerializedName("displayDeduplication")
	val displayDeduplication: Boolean? = null,

	@field:SerializedName("ipGalTopMeasure1PEnable")
	val ipGalTopMeasure1PEnable: Boolean? = null,

	@field:SerializedName("ipSkRenderEnable")
	val ipSkRenderEnable: Boolean? = null,

	@field:SerializedName("cpMq2RenderEnable")
	val cpMq2RenderEnable: Boolean? = null,

	@field:SerializedName("enableSponsoredRedirectParam")
	val enableSponsoredRedirectParam: Boolean? = null,

	@field:SerializedName("ipMq2RenderEnable")
	val ipMq2RenderEnable: Boolean? = null,

	@field:SerializedName("phSkMeasure1PEnable")
	val phSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("ipGalMiddleMeasure1PEnable")
	val ipGalMiddleMeasure1PEnable: Boolean? = null,

	@field:SerializedName("phSkReqEnable")
	val phSkReqEnable: Boolean? = null,

	@field:SerializedName("spGalRenderEnable")
	val spGalRenderEnable: Boolean? = null,

	@field:SerializedName("enableGalleryMultipleLocations")
	val enableGalleryMultipleLocations: Boolean? = null,

	@field:SerializedName("hpGalReqEnable")
	val hpGalReqEnable: Boolean? = null,

	@field:SerializedName("enableGalleryV2Design")
	val enableGalleryV2Design: Boolean? = null,

	@field:SerializedName("useLegacyBtfCmp")
	val useLegacyBtfCmp: Boolean? = null,

	@field:SerializedName("hpTpFs2RenderEnable")
	val hpTpFs2RenderEnable: Boolean? = null,

	@field:SerializedName("displayOrderDeduplication")
	val displayOrderDeduplication: Boolean? = null,

	@field:SerializedName("bpMq2ReqEnable")
	val bpMq2ReqEnable: Boolean? = null,

	@field:SerializedName("spMq1RenderEnable")
	val spMq1RenderEnable: Boolean? = null,

	@field:SerializedName("spMq1DSPEnable")
	val spMq1DSPEnable: Boolean? = null,

	@field:SerializedName("displayPoVAdBlockerEnable")
	val displayPoVAdBlockerEnable: Boolean? = null,

	@field:SerializedName("enableProductBrandOnBeacon")
	val enableProductBrandOnBeacon: Boolean? = null,

	@field:SerializedName("ipGalMiddleReqEnable")
	val ipGalMiddleReqEnable: Boolean? = null,

	@field:SerializedName("hpGalMiddleReqEnable")
	val hpGalMiddleReqEnable: Boolean? = null,

	@field:SerializedName("adsXpa")
	val adsXpa: String? = null,

	@field:SerializedName("contentPageClickBeaconEnable")
	val contentPageClickBeaconEnable: Boolean? = null,

	@field:SerializedName("typMq1RenderEnable")
	val typMq1RenderEnable: Boolean? = null,

	@field:SerializedName("bpMq2DSPEnable")
	val bpMq2DSPEnable: Boolean? = null,

	@field:SerializedName("hpMq2RenderEnable")
	val hpMq2RenderEnable: Boolean? = null,

	@field:SerializedName("bpMq2RenderEnable")
	val bpMq2RenderEnable: Boolean? = null,

	@field:SerializedName("spSvViewableBeaconEnable")
	val spSvViewableBeaconEnable: Boolean? = null,

	@field:SerializedName("bpGalMeasure1PEnable")
	val bpGalMeasure1PEnable: Boolean? = null,

	@field:SerializedName("useSearchBrowseBtfCmp")
	val useSearchBrowseBtfCmp: Boolean? = null,

	@field:SerializedName("phSkConfigLazy")
	val phSkConfigLazy: Int? = null,

	@field:SerializedName("hpGpbFs1ReqEnable")
	val hpGpbFs1ReqEnable: Boolean? = null,

	@field:SerializedName("bpGalRenderEnable")
	val bpGalRenderEnable: Boolean? = null,

	@field:SerializedName("ipBr1RenderEnable")
	val ipBr1RenderEnable: Boolean? = null,

	@field:SerializedName("enableSeasonalColorOption")
	val enableSeasonalColorOption: Boolean? = null,

	@field:SerializedName("spSvLazyLoadingEnable")
	val spSvLazyLoadingEnable: Boolean? = null,

	@field:SerializedName("ipGalMiddleRenderEnable")
	val ipGalMiddleRenderEnable: Boolean? = null,

	@field:SerializedName("enableBrandBoxEarlyLoad")
	val enableBrandBoxEarlyLoad: Boolean? = null,

	@field:SerializedName("hpGpbFs1Measure1PEnable")
	val hpGpbFs1Measure1PEnable: Boolean? = null,

	@field:SerializedName("odpSkMeasure3PEnable")
	val odpSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("spGalMeasure1PEnable")
	val spGalMeasure1PEnable: Boolean? = null,

	@field:SerializedName("typSkRenderEnable")
	val typSkRenderEnable: Boolean? = null,

	@field:SerializedName("hpP13nMeasure1PEnable")
	val hpP13nMeasure1PEnable: Boolean? = null,

	@field:SerializedName("typSkMeasure1PEnable")
	val typSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("spSvGridPositionBeacon")
	val spSvGridPositionBeacon: Boolean? = null,

	@field:SerializedName("ipSpc1ReqEnable")
	val ipSpc1ReqEnable: Boolean? = null,

	@field:SerializedName("phSkConfigModuleLocation")
	val phSkConfigModuleLocation: String? = null,

	@field:SerializedName("lazyRenderCmp")
	val lazyRenderCmp: Boolean? = null,

	@field:SerializedName("displayIdentifyAdServer")
	val displayIdentifyAdServer: Boolean? = null,

	@field:SerializedName("ipMq2DSPEnable")
	val ipMq2DSPEnable: Boolean? = null,

	@field:SerializedName("safeframeURL")
	val safeframeURL: String? = null,

	@field:SerializedName("typSkReqEnable")
	val typSkReqEnable: Boolean? = null,

	@field:SerializedName("displayPPMMode")
	val displayPPMMode: Boolean? = null,

	@field:SerializedName("ipSpc1Measure1PEnable")
	val ipSpc1Measure1PEnable: Boolean? = null,

	@field:SerializedName("addSpVideoNaBeacon")
	val addSpVideoNaBeacon: Boolean? = null,

	@field:SerializedName("spMq1ReqEnable")
	val spMq1ReqEnable: Boolean? = null,

	@field:SerializedName("ipBr1MinScreenHeight")
	val ipBr1MinScreenHeight: Int? = null,

	@field:SerializedName("ipP13nMeasure1PEnable")
	val ipP13nMeasure1PEnable: Boolean? = null,

	@field:SerializedName("enableAdSmilePricing")
	val enableAdSmilePricing: Boolean? = null,

	@field:SerializedName("hpTpFs1ReqEnable")
	val hpTpFs1ReqEnable: Boolean? = null,

	@field:SerializedName("enableLegalDisclaimerSponsored")
	val enableLegalDisclaimerSponsored: Boolean? = null,

	@field:SerializedName("shpSkMeasure1PEnable")
	val shpSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("hpGalMiddleMeasure3PEnable")
	val hpGalMiddleMeasure3PEnable: Boolean? = null,

	@field:SerializedName("enableSvTestAds")
	val enableSvTestAds: Boolean? = null,

	@field:SerializedName("hpPovLockoutPriorityEnable")
	val hpPovLockoutPriorityEnable: Boolean? = null,

	@field:SerializedName("adPreviousResponseNullCheck")
	val adPreviousResponseNullCheck: Boolean? = null,

	@field:SerializedName("bpGalReqEnable")
	val bpGalReqEnable: Boolean? = null,

	@field:SerializedName("spSkDSPEnable")
	val spSkDSPEnable: Boolean? = null,

	@field:SerializedName("ipSkReqEnable")
	val ipSkReqEnable: Boolean? = null,

	@field:SerializedName("enableGetPvId")
	val enableGetPvId: Boolean? = null,

	@field:SerializedName("bpSkReqEnable")
	val bpSkReqEnable: Boolean? = null,

	@field:SerializedName("videoEarlyloadOffset")
	val videoEarlyloadOffset: Int? = null,

	@field:SerializedName("adShowAtcFieldEnable")
	val adShowAtcFieldEnable: Boolean? = null,

	@field:SerializedName("hpTpFs1Measure1PEnable")
	val hpTpFs1Measure1PEnable: Boolean? = null,

	@field:SerializedName("videoCCEnable")
	val videoCCEnable: Boolean? = null,

	@field:SerializedName("hpMq2DSPEnable")
	val hpMq2DSPEnable: Boolean? = null,

	@field:SerializedName("spSkRenderEnable")
	val spSkRenderEnable: Boolean? = null,

	@field:SerializedName("displayUnitWrapperUnmount")
	val displayUnitWrapperUnmount: Boolean? = null,

	@field:SerializedName("updateAdV2QueryUbsEnable")
	val updateAdV2QueryUbsEnable: Boolean? = null,

	@field:SerializedName("ipBr1Measure3PEnable")
	val ipBr1Measure3PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs1Measure3PEnable")
	val hpTpFs1Measure3PEnable: Boolean? = null,

	@field:SerializedName("bpSkDSPEnable")
	val bpSkDSPEnable: Boolean? = null,

	@field:SerializedName("phSkRenderEnable")
	val phSkRenderEnable: Boolean? = null,

	@field:SerializedName("ipBr1Measure1PEnable")
	val ipBr1Measure1PEnable: Boolean? = null,

	@field:SerializedName("adManualShelfIdCheck")
	val adManualShelfIdCheck: Boolean? = null,

	@field:SerializedName("hpGalMeasure3PEnable")
	val hpGalMeasure3PEnable: Boolean? = null,

	@field:SerializedName("hpGalMeasure1PEnable")
	val hpGalMeasure1PEnable: Boolean? = null,

	@field:SerializedName("ipGalTopReqEnable")
	val ipGalTopReqEnable: Boolean? = null,

	@field:SerializedName("enableMyitemsBlending")
	val enableMyitemsBlending: Boolean? = null,

	@field:SerializedName("spSvContainerEnable")
	val spSvContainerEnable: Boolean? = null,

	@field:SerializedName("spSkMeasure1PEnable")
	val spSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("displaySbaLogospQs")
	val displaySbaLogospQs: Boolean? = null,

	@field:SerializedName("spSkMeasure3PEnable")
	val spSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("adSpClipBeaconEnable")
	val adSpClipBeaconEnable: Boolean? = null,

	@field:SerializedName("spGalReqEnable")
	val spGalReqEnable: Boolean? = null,

	@field:SerializedName("spSigMeasure1PEnable")
	val spSigMeasure1PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs2Measure3PEnable")
	val hpTpFs2Measure3PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs2Measure1PEnable")
	val hpTpFs2Measure1PEnable: Boolean? = null,

	@field:SerializedName("ipBr1EarlyLoadRootMargin")
	val ipBr1EarlyLoadRootMargin: Int? = null,

	@field:SerializedName("odpSkRenderEnable")
	val odpSkRenderEnable: Boolean? = null,

	@field:SerializedName("hpGalMiddleMeasure1PEnable")
	val hpGalMiddleMeasure1PEnable: Boolean? = null,

	@field:SerializedName("spGalMeasure3PEnable")
	val spGalMeasure3PEnable: Boolean? = null,

	@field:SerializedName("shpSkReqEnable")
	val shpSkReqEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs3ReqEnable")
	val hpGpbFs3ReqEnable: Boolean? = null,

	@field:SerializedName("spIbottaEnable")
	val spIbottaEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs3RenderEnable")
	val hpGpbFs3RenderEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs2RenderEnable")
	val hpGpbFs2RenderEnable: Boolean? = null,

	@field:SerializedName("displaySpMyItems")
	val displaySpMyItems: Boolean? = null,

	@field:SerializedName("typSkMeasure3PEnable")
	val typSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("buyBoxVariations")
	val buyBoxVariations: String? = null,

	@field:SerializedName("updateAdV2Query2StoreEnable")
	val updateAdV2Query2StoreEnable: Boolean? = null,

	@field:SerializedName("enableSearchGalleryMaxWidth")
	val enableSearchGalleryMaxWidth: Boolean? = null,

	@field:SerializedName("ipMq1Measure1PEnable")
	val ipMq1Measure1PEnable: Boolean? = null,

	@field:SerializedName("odpSkConfigModuleLocation")
	val odpSkConfigModuleLocation: String? = null,

	@field:SerializedName("spSkReqEnable")
	val spSkReqEnable: Boolean? = null,

	@field:SerializedName("ipMq2Measure3PEnable")
	val ipMq2Measure3PEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs2Measure1PEnable")
	val hpGpbFs2Measure1PEnable: Boolean? = null,

	@field:SerializedName("enableMyitemsSortPlacementBeacon")
	val enableMyitemsSortPlacementBeacon: Boolean? = null,

	@field:SerializedName("hpGpbFs1RenderEnable")
	val hpGpbFs1RenderEnable: Boolean? = null,

	@field:SerializedName("blockInternal")
	val blockInternal: Boolean? = null,

	@field:SerializedName("display3PVisibilityCheck")
	val display3PVisibilityCheck: Boolean? = null,

	@field:SerializedName("shpSkMeasure3PEnable")
	val shpSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs3Measure3PEnable")
	val hpGpbFs3Measure3PEnable: Boolean? = null,

	@field:SerializedName("ipMq2ReqEnable")
	val ipMq2ReqEnable: Boolean? = null,

	@field:SerializedName("disableLowPriorityBeacons")
	val disableLowPriorityBeacons: Boolean? = null,

	@field:SerializedName("spMq2Measure3PEnable")
	val spMq2Measure3PEnable: Boolean? = null,

	@field:SerializedName("adResponseBeaconEnable")
	val adResponseBeaconEnable: Boolean? = null,

	@field:SerializedName("displayProductPos")
	val displayProductPos: Boolean? = null,

	@field:SerializedName("ipGalTopRenderEnable")
	val ipGalTopRenderEnable: Boolean? = null,

	@field:SerializedName("spMq2Measure1PEnable")
	val spMq2Measure1PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs3Measure3PEnable")
	val hpTpFs3Measure3PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs3Measure1PEnable")
	val hpTpFs3Measure1PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs1RenderEnable")
	val hpTpFs1RenderEnable: Boolean? = null,

	@field:SerializedName("cacheBusterTimeDiffMs")
	val cacheBusterTimeDiffMs: Int? = null,

	@field:SerializedName("enableStackedRecallTracking")
	val enableStackedRecallTracking: Boolean? = null,

	@field:SerializedName("odpSkConfigLazy")
	val odpSkConfigLazy: Int? = null,

	@field:SerializedName("hpTpFs3RenderEnable")
	val hpTpFs3RenderEnable: Boolean? = null,

	@field:SerializedName("ipBr1VideoMeasure3PEnable")
	val ipBr1VideoMeasure3PEnable: Boolean? = null,

	@field:SerializedName("enableMyitemsAtcSortPlacementBeacon")
	val enableMyitemsAtcSortPlacementBeacon: Boolean? = null,

	@field:SerializedName("dspProcessingEnable")
	val dspProcessingEnable: Boolean? = null,

	@field:SerializedName("hpFontStyleFix")
	val hpFontStyleFix: Boolean? = null,

	@field:SerializedName("enableGalleryReRender")
	val enableGalleryReRender: Boolean? = null,

	@field:SerializedName("bpSkMeasure1PEnable")
	val bpSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("bpSkMeasure3PEnable")
	val bpSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("ipBr1DSPEnable")
	val ipBr1DSPEnable: Boolean? = null,

	@field:SerializedName("spMq2RenderEnable")
	val spMq2RenderEnable: Boolean? = null,

	@field:SerializedName("ipSpc2Measure1PEnable")
	val ipSpc2Measure1PEnable: Boolean? = null,

	@field:SerializedName("enableDisclaimerIconVar1")
	val enableDisclaimerIconVar1: Boolean? = null,

	@field:SerializedName("spSvMeasure1PEnable")
	val spSvMeasure1PEnable: Boolean? = null,

	@field:SerializedName("myitemsMeasure1PEnable")
	val myitemsMeasure1PEnable: Boolean? = null,

	@field:SerializedName("currCpSafeframeURL")
	val currCpSafeframeURL: String? = null,

	@field:SerializedName("spSvVideoTrackingEnable")
	val spSvVideoTrackingEnable: Boolean? = null,

	@field:SerializedName("bpMq1ReqEnable")
	val bpMq1ReqEnable: Boolean? = null,

	@field:SerializedName("displayAddlInfo")
	val displayAddlInfo: Boolean? = null,

	@field:SerializedName("spSbaReqEnable")
	val spSbaReqEnable: Boolean? = null,

	@field:SerializedName("bpMq1RenderEnable")
	val bpMq1RenderEnable: Boolean? = null,

	@field:SerializedName("viewableBeaconFix")
	val viewableBeaconFix: Boolean? = null,

	@field:SerializedName("moatIvt")
	val moatIvt: String? = null,

	@field:SerializedName("adsQuickshopBeaconEnable")
	val adsQuickshopBeaconEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs2ReqEnable")
	val hpGpbFs2ReqEnable: Boolean? = null,

	@field:SerializedName("ipBbMeasure1PEnable")
	val ipBbMeasure1PEnable: Boolean? = null,

	@field:SerializedName("hpMq1RenderEnable")
	val hpMq1RenderEnable: Boolean? = null,

	@field:SerializedName("ipSpc2ReqEnable")
	val ipSpc2ReqEnable: Boolean? = null,

	@field:SerializedName("hpGalMiddleRenderEnable")
	val hpGalMiddleRenderEnable: Boolean? = null,

	@field:SerializedName("bpGalMeasure3PEnable")
	val bpGalMeasure3PEnable: Boolean? = null,

	@field:SerializedName("hpTpFs3ReqEnable")
	val hpTpFs3ReqEnable: Boolean? = null,

	@field:SerializedName("pacP13nMeasure1PEnable")
	val pacP13nMeasure1PEnable: Boolean? = null,

	@field:SerializedName("displayProductsPos")
	val displayProductsPos: Boolean? = null,

	@field:SerializedName("spSvMwebLoadingFixEnable")
	val spSvMwebLoadingFixEnable: Boolean? = null,

	@field:SerializedName("hpMq1DSPEnable")
	val hpMq1DSPEnable: Boolean? = null,

	@field:SerializedName("typMq1Measure3PEnable")
	val typMq1Measure3PEnable: Boolean? = null,

	@field:SerializedName("enableGalleryTitle")
	val enableGalleryTitle: Boolean? = null,

	@field:SerializedName("hpOldPageVisitedXpa")
	val hpOldPageVisitedXpa: String? = null,

	@field:SerializedName("ipSkMeasure1PEnable")
	val ipSkMeasure1PEnable: Boolean? = null,

	@field:SerializedName("adViewableGmBeaconCheck")
	val adViewableGmBeaconCheck: Boolean? = null,

	@field:SerializedName("spMq1Measure3PEnable")
	val spMq1Measure3PEnable: Boolean? = null,

	@field:SerializedName("ipMq1Measure3PEnable")
	val ipMq1Measure3PEnable: Boolean? = null,

	@field:SerializedName("ipBbLazyLoadingEnable")
	val ipBbLazyLoadingEnable: Boolean? = null,

	@field:SerializedName("phSkMeasure3PEnable")
	val phSkMeasure3PEnable: Boolean? = null,

	@field:SerializedName("spSbaMeasure1PEnable")
	val spSbaMeasure1PEnable: Boolean? = null,

	@field:SerializedName("hpGpbFs3Measure1PEnable")
	val hpGpbFs3Measure1PEnable: Boolean? = null,

	@field:SerializedName("bpMq1Measure3PEnable")
	val bpMq1Measure3PEnable: Boolean? = null,

	@field:SerializedName("ipMq1ReqEnable")
	val ipMq1ReqEnable: Boolean? = null,

	@field:SerializedName("spSvRenderEnable")
	val spSvRenderEnable: Boolean? = null,

	@field:SerializedName("ipSkDSPEnable")
	val ipSkDSPEnable: Boolean? = null,

	@field:SerializedName("ipMq2Measure1PEnable")
	val ipMq2Measure1PEnable: Boolean? = null,

	@field:SerializedName("hpMq2Measure1PEnable")
	val hpMq2Measure1PEnable: Boolean? = null,

	@field:SerializedName("ipGalTopMeasure3PEnable")
	val ipGalTopMeasure3PEnable: Boolean? = null,

	@field:SerializedName("spSpc1ReqEnable")
	val spSpc1ReqEnable: Boolean? = null,

	@field:SerializedName("spSvReqEnable")
	val spSvReqEnable: Boolean? = null,

	@field:SerializedName("adCategoryTakeoverCheck")
	val adCategoryTakeoverCheck: Boolean? = null,

	@field:SerializedName("hpGpbFs2Measure3PEnable")
	val hpGpbFs2Measure3PEnable: Boolean? = null,

	@field:SerializedName("hpMq2ReqEnable")
	val hpMq2ReqEnable: Boolean? = null,

	@field:SerializedName("enableVideoUIErrorState")
	val enableVideoUIErrorState: Boolean? = null,

	@field:SerializedName("spMq2DSPEnable")
	val spMq2DSPEnable: Boolean? = null,

	@field:SerializedName("spSpc1Measure1PEnable")
	val spSpc1Measure1PEnable: Boolean? = null,

	@field:SerializedName("ipBr1ReqEnable")
	val ipBr1ReqEnable: Boolean? = null,

	@field:SerializedName("ipGalMiddleMeasure3PEnable")
	val ipGalMiddleMeasure3PEnable: Boolean? = null,

	@field:SerializedName("enableGICBookslot")
	val enableGICBookslot: Boolean? = null,

	@field:SerializedName("cacheFullFooterVersion")
	val cacheFullFooterVersion: Int? = null,

	@field:SerializedName("enableIbotta2xRewards")
	val enableIbotta2xRewards: Boolean? = null,

	@field:SerializedName("enableEBTCheckBalance")
	val enableEBTCheckBalance: Boolean? = null,

	@field:SerializedName("itemReservationsBannerText")
	val itemReservationsBannerText: String? = null,

	@field:SerializedName("enableSmileNowPricing")
	val enableSmileNowPricing: Boolean? = null,

	@field:SerializedName("enableEnhancedCarouselTiles")
	val enableEnhancedCarouselTiles: Boolean? = null,

	@field:SerializedName("substitutionItemPriceAndQuantityClarity")
	val substitutionItemPriceAndQuantityClarity: Boolean? = null,

	@field:SerializedName("accSlotShortcutMaxSlotCount")
	val accSlotShortcutMaxSlotCount: Int? = null,

	@field:SerializedName("enableFulfillmentDisplay")
	val enableFulfillmentDisplay: Boolean? = null,

	@field:SerializedName("enableCsp")
	val enableCsp: Boolean? = null,

	@field:SerializedName("enableSmileSaveBadge")
	val enableSmileSaveBadge: Boolean? = null,

	@field:SerializedName("enableWplusRetentionNudge")
	val enableWplusRetentionNudge: Boolean? = null,

	@field:SerializedName("enableLiquorBoxAlcoholExpansionCartBookslot")
	val enableLiquorBoxAlcoholExpansionCartBookslot: Boolean? = null,

	@field:SerializedName("cspReportOnlyOverrides")
	val cspReportOnlyOverrides: String? = null,

	@field:SerializedName("enableFullPageCart")
	val enableFullPageCart: Boolean? = null,

	@field:SerializedName("enableHubAndSpoke")
	val enableHubAndSpoke: Boolean? = null,

	@field:SerializedName("enableCartParallelFetch")
	val enableCartParallelFetch: Boolean? = null,

	@field:SerializedName("queueRefetchInterval")
	val queueRefetchInterval: Int? = null,

	@field:SerializedName("enableBuyNowWallet")
	val enableBuyNowWallet: Boolean? = null,

	@field:SerializedName("queueMaxRefetchDuration")
	val queueMaxRefetchDuration: Int? = null,

	@field:SerializedName("subscriptionManagePageUrl")
	val subscriptionManagePageUrl: String? = null,

	@field:SerializedName("enableAstCookie")
	val enableAstCookie: Boolean? = null,

	@field:SerializedName("enableFPO")
	val enableFPO: Boolean? = null,

	@field:SerializedName("enableFloatingAddToOrder")
	val enableFloatingAddToOrder: Boolean? = null,

	@field:SerializedName("enableDynamicOptionsFeedback")
	val enableDynamicOptionsFeedback: Boolean? = null,

	@field:SerializedName("enableSinglePageXO")
	val enableSinglePageXO: Boolean? = null,

	@field:SerializedName("cacheFooterExpireDurationMs")
	val cacheFooterExpireDurationMs: Int? = null,

	@field:SerializedName("enableWplusSignUpOffer")
	val enableWplusSignUpOffer: Boolean? = null,

	@field:SerializedName("enableBuyNowSFLPrompt")
	val enableBuyNowSFLPrompt: Boolean? = null,

	@field:SerializedName("substitutionsOptInClarity")
	val substitutionsOptInClarity: Boolean? = null,

	@field:SerializedName("enableDynamicMainReducer")
	val enableDynamicMainReducer: Boolean? = null,

	@field:SerializedName("helpLinkMPReturnPolicy")
	val helpLinkMPReturnPolicy: String? = null,

	@field:SerializedName("enableBuyNowPromiseMessage")
	val enableBuyNowPromiseMessage: Boolean? = null,

	@field:SerializedName("helpLinkTermsOfUse")
	val helpLinkTermsOfUse: String? = null,

	@field:SerializedName("enablePersistedQueries")
	val enablePersistedQueries: Boolean? = null,

	@field:SerializedName("legacySiteEbtRedirectEnabled")
	val legacySiteEbtRedirectEnabled: Boolean? = null,

	@field:SerializedName("disableGetCartSSR")
	val disableGetCartSSR: Boolean? = null,

	@field:SerializedName("enableAdSessionId")
	val enableAdSessionId: Boolean? = null,

	@field:SerializedName("cacheFullFooterExpireDurationMs")
	val cacheFullFooterExpireDurationMs: Int? = null,

	@field:SerializedName("helpLinkStorePurchase")
	val helpLinkStorePurchase: String? = null,

	@field:SerializedName("enableCheckoutProp65")
	val enableCheckoutProp65: Boolean? = null,

	@field:SerializedName("enableGicEngagement")
	val enableGicEngagement: Boolean? = null,

	@field:SerializedName("enableSlotsParallelFetch")
	val enableSlotsParallelFetch: Boolean? = null,

	@field:SerializedName("enableWalmartPlusFreeDiscountedExpress")
	val enableWalmartPlusFreeDiscountedExpress: Boolean? = null,

	@field:SerializedName("enableMPPickupBottomSheet")
	val enableMPPickupBottomSheet: Boolean? = null,

	@field:SerializedName("enableExpressSla")
	val enableExpressSla: Boolean? = null,

	@field:SerializedName("enableSinglePaymentForm")
	val enableSinglePaymentForm: Boolean? = null,

	@field:SerializedName("aeModuleHeaderText")
	val aeModuleHeaderText: String? = null,

	@field:SerializedName("enablePersistedCartId")
	val enablePersistedCartId: Boolean? = null,

	@field:SerializedName("enableQueueSizeIncrease")
	val enableQueueSizeIncrease: Boolean? = null,

	@field:SerializedName("legacySiteDirectspendingRedirectEnabled")
	val legacySiteDirectspendingRedirectEnabled: Boolean? = null,

	@field:SerializedName("enableACCSchedulingUpsell")
	val enableACCSchedulingUpsell: Boolean? = null,

	@field:SerializedName("enableOutOfStockFiltering")
	val enableOutOfStockFiltering: Boolean? = null,

	@field:SerializedName("enableFeedbackSubmitPageType")
	val enableFeedbackSubmitPageType: Boolean? = null,

	@field:SerializedName("helpLinkMobileAlertsTerms")
	val helpLinkMobileAlertsTerms: String? = null,

	@field:SerializedName("enableBuyNowCXORedirect")
	val enableBuyNowCXORedirect: Boolean? = null,

	@field:SerializedName("enableBuyNowFreeShippingNudge")
	val enableBuyNowFreeShippingNudge: Boolean? = null,

	@field:SerializedName("enableHpRedesign")
	val enableHpRedesign: Boolean? = null,

	@field:SerializedName("enableAccUpsellVariant")
	val enableAccUpsellVariant: Int? = null,

	@field:SerializedName("enableSpendAnalyticsPhaseTwo")
	val enableSpendAnalyticsPhaseTwo: Boolean? = null,

	@field:SerializedName("legacySiteNGRedirectEnabled")
	val legacySiteNGRedirectEnabled: Boolean? = null,

	@field:SerializedName("cacheHeaderVersion")
	val cacheHeaderVersion: Int? = null,

	@field:SerializedName("enableBuyNow")
	val enableBuyNow: Boolean? = null,

	@field:SerializedName("enableChargeForSubs")
	val enableChargeForSubs: Boolean? = null,

	@field:SerializedName("enableNoOrderMinimumFee")
	val enableNoOrderMinimumFee: Boolean? = null,

	@field:SerializedName("savingsRecommendationFlag")
	val savingsRecommendationFlag: Int? = null,

	@field:SerializedName("cacheHeaderExpireDurationMs")
	val cacheHeaderExpireDurationMs: Int? = null,

	@field:SerializedName("enableACCShipInsteadCTA")
	val enableACCShipInsteadCTA: Boolean? = null,

	@field:SerializedName("enableBuyNowSavings")
	val enableBuyNowSavings: Boolean? = null,

	@field:SerializedName("enableSmileWasPricing")
	val enableSmileWasPricing: Boolean? = null,

	@field:SerializedName("cvEndpoint")
	val cvEndpoint: String? = null,

	@field:SerializedName("enableSinglePaymentFormWallet")
	val enableSinglePaymentFormWallet: Boolean? = null,

	@field:SerializedName("enableHPO")
	val enableHPO: Boolean? = null,

	@field:SerializedName("helpLinkReturnRefunds")
	val helpLinkReturnRefunds: String? = null,

	@field:SerializedName("foo")
	val foo: Boolean? = null,

	@field:SerializedName("enableBadges")
	val enableBadges: Boolean? = null,

	@field:SerializedName("cacheFooterVersion")
	val cacheFooterVersion: Int? = null,

	@field:SerializedName("enableWeeklyReservationCartBookslot")
	val enableWeeklyReservationCartBookslot: Boolean? = null,

	@field:SerializedName("enableRebrandRewardsToCash")
	val enableRebrandRewardsToCash: Boolean? = null,

	@field:SerializedName("enableBenefitTracker")
	val enableBenefitTracker: Boolean? = null,

	@field:SerializedName("enableBenefitBadge")
	val enableBenefitBadge: Boolean? = null,

	@field:SerializedName("enableCSRBootstrapCall")
	val enableCSRBootstrapCall: Boolean? = null,

	@field:SerializedName("enableFeedbackGqlMigration")
	val enableFeedbackGqlMigration: Boolean? = null,

	@field:SerializedName("legacySiteInhomeRedirectEnabled")
	val legacySiteInhomeRedirectEnabled: Boolean? = null,

	@field:SerializedName("enableBuyNowAspectiva")
	val enableBuyNowAspectiva: Boolean? = null,

	@field:SerializedName("enableWaitingHallway")
	val enableWaitingHallway: Boolean? = null,

	@field:SerializedName("queueTimeToCompletePurchase")
	val queueTimeToCompletePurchase: Int? = null,

	@field:SerializedName("enableWmtpcBenefitCard")
	val enableWmtpcBenefitCard: Boolean? = null,

	@field:SerializedName("beaconWithQuantumMetrics")
	val beaconWithQuantumMetrics: Boolean? = null,

	@field:SerializedName("enableEnhancedCarouselTilesByCategory")
	val enableEnhancedCarouselTilesByCategory: String? = null,

	@field:SerializedName("enableGifting")
	val enableGifting: Boolean? = null,

	@field:SerializedName("enableBuyNowAOS")
	val enableBuyNowAOS: Boolean? = null,

	@field:SerializedName("enableBuyNowTYUrl")
	val enableBuyNowTYUrl: Boolean? = null,

	@field:SerializedName("enablePartialSwitchModuleLevelCartBookslot")
	val enablePartialSwitchModuleLevelCartBookslot: Boolean? = null,

	@field:SerializedName("disableAuthHeaderCheck")
	val disableAuthHeaderCheck: Boolean? = null
)

data class SearchArgs(

	@field:SerializedName("prg")
	val prg: String? = null,

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("cat_id")
	val catId: String? = null,

	@field:SerializedName("facet")
	val facet: String? = null
)

data class FitmentSearchParams(

	@field:SerializedName("ps")
	val ps: Int? = null,

	@field:SerializedName("prg")
	val prg: String? = null,

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("seoPath")
	val seoPath: String? = null,

	@field:SerializedName("beShelfId")
	val beShelfId1: String? = null,

	@field:SerializedName("sort")
	val sort: String? = null,

	@field:SerializedName("trsp")
	val trsp: String? = null,

	@field:SerializedName("module_search")
	val moduleSearch: String? = null,

	@field:SerializedName("storeSlotBooked")
	val storeSlotBooked: String? = null,

	@field:SerializedName("_be_shelf_id")
	val beShelfId: String? = null,

	@field:SerializedName("dealsId")
	val dealsId: String? = null,

	@field:SerializedName("ptss")
	val ptss: String? = null,

	@field:SerializedName("catId")
	val catId1: String? = null,

	@field:SerializedName("max_price")
	val maxPrice: String? = null,

	@field:SerializedName("rawFacet")
	val rawFacet: String? = null,

	@field:SerializedName("min_price")
	val minPrice: String? = null,

	@field:SerializedName("cat_id")
	val catId: String? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("recall_set")
	val recallSet: String? = null,

	@field:SerializedName("searchArgs")
	val searchArgs: SearchArgs? = null,

	@field:SerializedName("facet")
	val facet: String? = null,

	@field:SerializedName("additionalQueryParams")
	val additionalQueryParams: AdditionalQueryParams? = null
)

data class ModulesItem(

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("version")
	val version: Int? = null
)

data class JsonMember232401713(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember315857618(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Configs(

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("zoneV1")
	val zoneV1: List<ZoneV1Item?>? = null,

	@field:SerializedName("fitments")
	val fitments: Any? = null,

	@field:SerializedName("subTitle")
	val subTitle: Any? = null,

	@field:SerializedName("urlLinkText")
	val urlLinkText: Any? = null,

	@field:SerializedName("title")
	val title: Any? = null,

	@field:SerializedName("url")
	val url: Any? = null,

	@field:SerializedName("moduleSource")
	val moduleSource: String? = null,

	@field:SerializedName("pillsV2")
	val pillsV2: Any? = null,

	@field:SerializedName("ad")
	val ad: Any? = null,

	@field:SerializedName("_rawConfigs")
	val rawConfigs: RawConfigs? = null,

	@field:SerializedName("moduleLocation")
	val moduleLocation: String? = null,

	@field:SerializedName("topNavFacets")
	val topNavFacets: List<TopNavFacetsItem?>? = null,

	@field:SerializedName("allSortAndFilterFacets")
	val allSortAndFilterFacets: List<AllSortAndFilterFacetsItem?>? = null,

	@field:SerializedName("subLinks")
	val subLinks: List<SubLinksItem?>? = null,

	@field:SerializedName("subCategory")
	val subCategory: List<SubCategoryItem?>? = null
)

data class FulfillmentIcon(

	@field:SerializedName("label")
	val label: String? = null,

	@field:SerializedName("key")
	val key: String? = null
)

data class TopZone3(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class TenantV2(

	@field:SerializedName("bu")
	val bu: String? = null,

	@field:SerializedName("mart")
	val mart: String? = null
)

data class Search(

	@field:SerializedName("_all_")
	val all: All? = null
)

data class FrameSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class JsonMember351301088(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember485968604(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class SearchResult(
	@field:SerializedName("itemStacks")
	val itemStacks1: List<ItemStacksItem?>? = null,
)

data class ItemStacksItem(
	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null,
)

data class JsonMember655371556(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class FontSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class Directives(

	@field:SerializedName("style-src")
	val styleSrc: StyleSrc? = null,

	@field:SerializedName("connect-src")
	val connectSrc: ConnectSrc? = null,

	@field:SerializedName("child-src")
	val childSrc: ChildSrc? = null,

	@field:SerializedName("script-src")
	val scriptSrc: ScriptSrc? = null,

	@field:SerializedName("object-src")
	val objectSrc: ObjectSrc? = null,

	@field:SerializedName("worker-src")
	val workerSrc: WorkerSrc? = null,

	@field:SerializedName("frame-src")
	val frameSrc: FrameSrc? = null,

	@field:SerializedName("media-src")
	val mediaSrc: MediaSrc? = null,

	@field:SerializedName("frame-ancestors")
	val frameAncestors: FrameAncestors? = null,

	@field:SerializedName("img-src")
	val imgSrc: ImgSrc? = null,

	@field:SerializedName("default-src")
	val defaultSrc: DefaultSrc? = null,

	@field:SerializedName("font-src")
	val fontSrc: FontSrc? = null
)

data class AdsContext(

	@field:SerializedName("itemId")
	val itemId: String? = null,

	@field:SerializedName("verticalId")
	val verticalId: String? = null,

	@field:SerializedName("dedupeList")
	val dedupeList: List<String?>? = null,

	@field:SerializedName("normKeyword")
	val normKeyword: String? = null,

	@field:SerializedName("categoryName")
	val categoryName: String? = null,

	@field:SerializedName("brand")
	val brand: String? = null,

	@field:SerializedName("locationContext")
	val locationContext: LocationContext? = null,

	@field:SerializedName("categoryId")
	val categoryId: String? = null,

	@field:SerializedName("productName")
	val productName: String? = null,

	@field:SerializedName("productTypeId")
	val productTypeId: String? = null
)

data class JsonMember101507200(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Options(

	@field:SerializedName("refId")
	val refId: String? = null,

	@field:SerializedName("displayInTempo")
	val displayInTempo: Boolean? = null,

	@field:SerializedName("tempoLabel")
	val tempoLabel: String? = null
)

data class JsonMember743130229(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class PerimeterX(

	@field:SerializedName("enable")
	val enable: Boolean? = null,

	@field:SerializedName("initScript")
	val initScript: String? = null
)

data class ItemStacks(

	@field:SerializedName("709633232")
	val jsonMember709633232: JsonMember709633232? = null,

	@field:SerializedName("352101663")
	val jsonMember352101663: JsonMember352101663? = null,

	@field:SerializedName("783158652")
	val jsonMember783158652: JsonMember783158652? = null,

	@field:SerializedName("641709380")
	val jsonMember641709380: JsonMember641709380? = null,

	@field:SerializedName("585225061")
	val jsonMember585225061: JsonMember585225061? = null,

	@field:SerializedName("452782971")
	val jsonMember452782971: JsonMember452782971? = null,

	@field:SerializedName("470461045")
	val jsonMember470461045: JsonMember470461045? = null,

	@field:SerializedName("49987014")
	val jsonMember49987014: JsonMember49987014? = null,

	@field:SerializedName("197016857")
	val jsonMember197016857: JsonMember197016857? = null,

	@field:SerializedName("17480442")
	val jsonMember17480442: JsonMember17480442? = null,

	@field:SerializedName("835389329")
	val jsonMember835389329: JsonMember835389329? = null,

	@field:SerializedName("759182028")
	val jsonMember759182028: JsonMember759182028? = null,

	@field:SerializedName("987511243")
	val jsonMember987511243: JsonMember987511243? = null,

	@field:SerializedName("934571270")
	val jsonMember934571270: JsonMember934571270? = null,

	@field:SerializedName("351301088")
	val jsonMember351301088: JsonMember351301088? = null,

	@field:SerializedName("315857618")
	val jsonMember315857618: JsonMember315857618? = null,

	@field:SerializedName("655371556")
	val jsonMember655371556: JsonMember655371556? = null,

	@field:SerializedName("667802535")
	val jsonMember667802535: JsonMember667802535? = null,

	@field:SerializedName("50013156")
	val jsonMember50013156: JsonMember50013156? = null,

	@field:SerializedName("653683256")
	val jsonMember653683256: JsonMember653683256? = null,

	@field:SerializedName("885552459")
	val jsonMember885552459: JsonMember885552459? = null,

	@field:SerializedName("609137213")
	val jsonMember609137213: JsonMember609137213? = null,

	@field:SerializedName("20370542")
	val jsonMember20370542: JsonMember20370542? = null,

	@field:SerializedName("243342946")
	val jsonMember243342946: JsonMember243342946? = null,

	@field:SerializedName("46354349")
	val jsonMember46354349: JsonMember46354349? = null,

	@field:SerializedName("738261044")
	val jsonMember738261044: JsonMember738261044? = null,

	@field:SerializedName("743130229")
	val jsonMember743130229: JsonMember743130229? = null,

	@field:SerializedName("586378841")
	val jsonMember586378841: JsonMember586378841? = null,

	@field:SerializedName("674598288")
	val jsonMember674598288: JsonMember674598288? = null,

	@field:SerializedName("847625727")
	val jsonMember847625727: JsonMember847625727? = null,

	@field:SerializedName("362084014")
	val jsonMember362084014: JsonMember362084014? = null,

	@field:SerializedName("101507200")
	val jsonMember101507200: JsonMember101507200? = null,

	@field:SerializedName("402070537")
	val jsonMember402070537: JsonMember402070537? = null,

	@field:SerializedName("485968604")
	val jsonMember485968604: JsonMember485968604? = null,

	@field:SerializedName("884437848")
	val jsonMember884437848: JsonMember884437848? = null,

	@field:SerializedName("994712501")
	val jsonMember994712501: JsonMember994712501? = null,

	@field:SerializedName("1707140316")
	val jsonMember1707140316: JsonMember1707140316? = null,

	@field:SerializedName("1895788426")
	val jsonMember1895788426: JsonMember1895788426? = null,

	@field:SerializedName("1238109482")
	val jsonMember1238109482: JsonMember1238109482? = null,

	@field:SerializedName("441387712")
	val jsonMember441387712: JsonMember441387712? = null,

	@field:SerializedName("1289566748")
	val jsonMember1289566748: JsonMember1289566748? = null,

	@field:SerializedName("232401713")
	val jsonMember232401713: JsonMember232401713? = null,

	@field:SerializedName("508565564")
	val jsonMember508565564: JsonMember508565564? = null
)

data class InitialSearchQueryVariables(

	@field:SerializedName("ps")
	val ps: Int? = null,

	@field:SerializedName("fetchGallery")
	val fetchGallery: Boolean? = null,

	@field:SerializedName("enableFashionTopNav")
	val enableFashionTopNav: Boolean? = null,

	@field:SerializedName("enableFlattenedFitment")
	val enableFlattenedFitment: Boolean? = null,

	@field:SerializedName("beShelfId")
	val beShelfId: String? = null,

	@field:SerializedName("fitmentSearchParams")
	val fitmentSearchParams: FitmentSearchParams? = null,

	@field:SerializedName("module_search")
	val moduleSearch: String? = null,

	@field:SerializedName("enableFacetCount")
	val enableFacetCount: Boolean? = null,

	@field:SerializedName("dealsId")
	val dealsId: String? = null,

	@field:SerializedName("ptss")
	val ptss: String? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("enableRelatedSearches")
	val enableRelatedSearches: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("recall_set")
	val recallSet: String? = null,

	@field:SerializedName("enablePortableFacets")
	val enablePortableFacets: Boolean? = null,

	@field:SerializedName("tenant")
	val tenant: String? = null,

	@field:SerializedName("prg")
	val prg: String? = null,

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("fetchSkyline")
	val fetchSkyline: Boolean? = null,

	@field:SerializedName("enableMultiSave")
	val enableMultiSave: Boolean? = null,

	@field:SerializedName("seoPath")
	val seoPath: String? = null,

	@field:SerializedName("sort")
	val sort: String? = null,

	@field:SerializedName("trsp")
	val trsp: String? = null,

	@field:SerializedName("storeSlotBooked")
	val storeSlotBooked: String? = null,

	@field:SerializedName("fetchSbaTop")
	val fetchSbaTop: Boolean? = null,

	@field:SerializedName("catId")
	val catId: String? = null,

	@field:SerializedName("fitmentFieldParams")
	val fitmentFieldParams: FitmentFieldParams? = null,

	@field:SerializedName("max_price")
	val maxPrice: String? = null,

	@field:SerializedName("rawFacet")
	val rawFacet: String? = null,

	@field:SerializedName("min_price")
	val minPrice: String? = null,

	@field:SerializedName("fetchMarquee")
	val fetchMarquee: Boolean? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("searchArgs")
	val searchArgs: SearchArgs? = null,

	@field:SerializedName("facet")
	val facet: String? = null,

	@field:SerializedName("additionalQueryParams")
	val additionalQueryParams: AdditionalQueryParams? = null
)

data class VariantListItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("productId")
	val productId: String? = null,

	@field:SerializedName("canonicalUrl")
	val canonicalUrl: String? = null,

	@field:SerializedName("usItemId")
	val usItemId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("swatchImageUrl")
	val swatchImageUrl: String? = null,

	@field:SerializedName("images")
	val images: List<String?>? = null,

	@field:SerializedName("selectedProduct")
	val selectedProduct: SelectedProduct? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("availabilityStatus")
	val availabilityStatus: String? = null,

	@field:SerializedName("products")
	val products: List<String?>? = null
)

data class JsonMember641709380(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Item(

	@field:SerializedName("props")
	val props: Props? = null,


)

data class Rest(

	@field:SerializedName("endpointsByName")
	val endpointsByName: EndpointsByName? = null
)

data class Channel(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class ImageInfo(

	@field:SerializedName("size")
	val size: String? = null,

	@field:SerializedName("thumbnailUrl")
	val thumbnailUrl: String? = null
)

data class PetRx(

	@field:SerializedName("eligible")
	val eligible: Boolean? = null,

	@field:SerializedName("singleDispense")
	val singleDispense: Any? = null
)

data class ContentItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("flow")
	val flow: String? = null,

	@field:SerializedName("content")
	val content: Content? = null
)

data class Definition(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("flow")
	val flow: String? = null,

	@field:SerializedName("content")
	val content: List<ContentItem?>? = null
)

data class ConnectSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class Psych(

	@field:SerializedName("isBot")
	val isBot: Boolean? = null,

	@field:SerializedName("isDesktop")
	val isDesktop: Boolean? = null,

	@field:SerializedName("trafficType")
	val trafficType: String? = null,

	@field:SerializedName("isMobile")
	val isMobile: Boolean? = null
)

data class RiseMapAPIKey(

	@field:SerializedName("dev")
	val dev: String? = null,

	@field:SerializedName("defaultKey")
	val defaultKey: String? = null
)

data class SubLinksItem(

	@field:SerializedName("link")
	val link: Link? = null,

	@field:SerializedName("openInNewTab")
	val openInNewTab: String? = null,

	@field:SerializedName("isSFLink")
	val isSFLink: String? = null,

	@field:SerializedName("icon")
	val icon: String? = null
)

data class ImgSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class SubCategoryItem(

	@field:SerializedName("subLinks")
	val subLinks: List<SubLinksItem?>? = null
)

data class JsonMember783158652(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Membership(

	@field:SerializedName("data")
	val data: Data? = null
)

data class JsonMember452782971(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Layout(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("channel")
	val channel: Channel? = null,

	@field:SerializedName("definition")
	val definition: Definition? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("version")
	val version: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class JsonMember609137213(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class AdsBeacon(

	@field:SerializedName("adUuid")
	val adUuid: String? = null,

	@field:SerializedName("max_ads")
	val maxAds: Int? = null,

	@field:SerializedName("moduleInfo")
	val moduleInfo: String? = null
)

data class FrameAncestors(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class Data(

	@field:SerializedName("adUuid")
	val adUuid: String? = null,

	@field:SerializedName("brands")
	val brands: List<Any?>? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("moduleInfo")
	val moduleInfo: String? = null,

	@field:SerializedName("adExpInfo")
	val adExpInfo: Any? = null,

	@field:SerializedName("shouldShowWplusLogo")
	val shouldShowWplusLogo: Boolean? = null,

	@field:SerializedName("contentLayout")
	val contentLayout: ContentLayout? = null
)

data class Location(

	@field:SerializedName("accessType")
	val accessType: Any? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("postalCode")
	val postalCode: String? = null,

	@field:SerializedName("pickupStore")
	val pickupStore: String? = null,

	@field:SerializedName("deliveryStore")
	val deliveryStore: String? = null,

	@field:SerializedName("accessPointId")
	val accessPointId: Any? = null,

	@field:SerializedName("stateOrProvinceCode")
	val stateOrProvinceCode: String? = null,

	@field:SerializedName("spokeNodeId")
	val spokeNodeId: Any? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("intent")
	val intent: String? = null,

	@field:SerializedName("addressId")
	val addressId: String? = null
)

data class Context(

	@field:SerializedName("tenants")
	val tenants: List<TenantsItem?>? = null,

	@field:SerializedName("signInPathname")
	val signInPathname: String? = null,

	@field:SerializedName("signOutUrl")
	val signOutUrl: String? = null,

	@field:SerializedName("createAccountPathname")
	val createAccountPathname: String? = null,

	@field:SerializedName("marketingEmails")
	val marketingEmails: Boolean? = null
)

data class Shared(

	@field:SerializedName("_all_")
	val all: All? = null
)

data class BottomZone2(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class PaginationV2(

	@field:SerializedName("pageProperties")
	val pageProperties: PageProperties? = null,

	@field:SerializedName("maxPage")
	val maxPage: Int? = null
)

data class Link(

	@field:SerializedName("uid")
	val uid: String? = null,

	@field:SerializedName("linkText")
	val linkText: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("clickThrough")
	val clickThrough: ClickThrough? = null
)

data class FitmentFieldParams(

	@field:SerializedName("powerSportEnabled")
	val powerSportEnabled: Boolean? = null
)

data class WorkerSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class JsonMember835389329(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class LocationContext(

	@field:SerializedName("incatchment")
	val incatchment: Boolean? = null,

	@field:SerializedName("zipCode")
	val zipCode: String? = null,

	@field:SerializedName("pickupStore")
	val pickupStore: String? = null,

	@field:SerializedName("deliveryStore")
	val deliveryStore: String? = null,

	@field:SerializedName("stateCode")
	val stateCode: String? = null,

	@field:SerializedName("storeId")
	val storeId: String? = null,

	@field:SerializedName("intent")
	val intent: String? = null
)

data class PageProps(

	@field:SerializedName("initialData")
	val initialData: InitialData? = null,

)

data class EndpointMappings(

	@field:SerializedName("operations")
	val operations: Operations? = null,

	@field:SerializedName("pages")
	val pages: Pages? = null,

	@field:SerializedName("queryStrings")
	val queryStrings: QueryStrings? = null
)

data class Brand(

	@field:SerializedName("pcs_brand")
	val pcsBrand: List<String?>? = null,

	@field:SerializedName("score")
	val score: Int? = null,

	@field:SerializedName("extractedValue")
	val extractedValue: String? = null
)

data class Operations(

	@field:SerializedName("query checkItemCartEligibility")
	val queryCheckItemCartEligibility: String? = null,

	@field:SerializedName("query PurchasedProtectionPlans")
	val queryPurchasedProtectionPlans: String? = null,

	@field:SerializedName("query PostCartLoadPage")
	val queryPostCartLoadPage: String? = null,

	@field:SerializedName("mutation CancelOrder")
	val mutationCancelOrder: String? = null,

	@field:SerializedName("mutation NotifyCapOneBannerSnooze")
	val mutationNotifyCapOneBannerSnooze: String? = null,

	@field:SerializedName("query LocalStoreContentQuery")
	val queryLocalStoreContentQuery: String? = null,

	@field:SerializedName("query feedsByStatus")
	val queryFeedsByStatus: String? = null,

	@field:SerializedName("query LastCallPage")
	val queryLastCallPage: String? = null,

	@field:SerializedName("query ProtectionPlanDetail")
	val queryProtectionPlanDetail: String? = null,

	@field:SerializedName("query getCart")
	val queryGetCart: String? = null,

	@field:SerializedName("mutation setPickup")
	val mutationSetPickup: String? = null,

	@field:SerializedName("query getGuestOrder")
	val queryGetGuestOrder: String? = null,

	@field:SerializedName("query nodeDetails")
	val queryNodeDetails: String? = null,

	@field:SerializedName("query SearchStore")
	val querySearchStore: String? = null,

	@field:SerializedName("mutation MergeAndGetCart")
	val mutationMergeAndGetCart: String? = null,

	@field:SerializedName("query feedShow")
	val queryFeedShow: String? = null,

	@field:SerializedName("query CartSubstitutions")
	val queryCartSubstitutions: String? = null,

	@field:SerializedName("query subscriptions")
	val querySubscriptions: String? = null,

	@field:SerializedName("query configuration")
	val queryConfiguration: String? = null,

	@field:SerializedName("query ContentPage")
	val queryContentPage: String? = null,

	@field:SerializedName("query LocalStoreCategoryContent")
	val queryLocalStoreCategoryContent: String? = null,

	@field:SerializedName("query RewardsHistoryPage")
	val queryRewardsHistoryPage: String? = null,

	@field:SerializedName("query PurchaseHistory")
	val queryPurchaseHistory: String? = null,

	@field:SerializedName("query BrandPage")
	val queryBrandPage: String? = null,

	@field:SerializedName("query NodeDetailQuery")
	val queryNodeDetailQuery: String? = null,

	@field:SerializedName("query CartShopSimilar")
	val queryCartShopSimilar: String? = null,

	@field:SerializedName("query GetCommPreference")
	val queryGetCommPreference: String? = null,

	@field:SerializedName("query feedShowCategories")
	val queryFeedShowCategories: String? = null,

	@field:SerializedName("query storeFinderNearbyNodesQuery")
	val queryStoreFinderNearbyNodesQuery: String? = null,

	@field:SerializedName("query GetEarlyAccessLearnMoreData")
	val queryGetEarlyAccessLearnMoreData: String? = null,

	@field:SerializedName("query NearbyNodesQuery")
	val queryNearbyNodesQuery: String? = null,

	@field:SerializedName("mutation CreateInsuranceSalesLead")
	val mutationCreateInsuranceSalesLead: String? = null,

	@field:SerializedName("query AdV2Display")
	val queryAdV2Display: String? = null
)

data class ChildSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class MatchedTrigger(

	@field:SerializedName("zone")
	val zone: String? = null
)

data class Gql(

	@field:SerializedName("endpointsByName")
	val endpointsByName: EndpointsByName? = null
)

data class JsonMember759182028(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember352101663(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class PillsTopZone(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class JsonMember362084014(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class MappingItem(

	@field:SerializedName("options")
	val options: Options? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class PageContext(

	@field:SerializedName("searchNormalize")
	val searchNormalize: SearchNormalize? = null
)

data class JsonMember197016857(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Account(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("_all_")
	val all: All? = null
)

data class AnalyticsLog(

	@field:SerializedName("fe_log")
	val feLog: FeLog? = null
)

data class QueryStrings(

	@field:SerializedName("step=cart")
	val stepCart: String? = null,

	@field:SerializedName("state=*")
	val state: String? = null,

	@field:SerializedName("step=bookslot")
	val stepBookslot: String? = null,

	@field:SerializedName("entitytype=*")
	val entitytype: String? = null,

	@field:SerializedName("source=*")
	val source: String? = null
)

data class LayoutsItem(

	@field:SerializedName("layout")
	val layout: Layout? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class QueryContext(

	@field:SerializedName("rest")
	val rest: Rest? = null,

	@field:SerializedName("appVersion")
	val appVersion: String? = null,

	@field:SerializedName("gql")
	val gql: Gql? = null
)

data class Cart(

	@field:SerializedName("_all_")
	val all: All? = null
)

data class AdRequestComposite(

	@field:SerializedName("isDebug")
	val isDebug: Boolean? = null,

	@field:SerializedName("keyword")
	val keyword: String? = null,

	@field:SerializedName("categoryId")
	val categoryId: String? = null,

	@field:SerializedName("isManualShelf")
	val isManualShelf: Boolean? = null,

	@field:SerializedName("facets")
	val facets: String? = null
)

data class FlagsItem(

	@field:SerializedName("styleId")
	val styleId: Any? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("key")
	val key: String? = null
)

data class StyleSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class Identity(

	@field:SerializedName("authFrameRoutes")
	val authFrameRoutes: AuthFrameRoutes? = null,

	@field:SerializedName("context")
	val context: Context? = null
)

data class Query(

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("sort")
	val sort: String? = null,

	@field:SerializedName("page")
	val page: String? = null
)

data class JsonMember49987014(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class ZoneV1Item(

	@field:SerializedName("isP13nBtfModule")
	val isP13nBtfModule: Boolean? = null,

	@field:SerializedName("isNativeLazyLoaded")
	val isNativeLazyLoaded: Boolean? = null,

	@field:SerializedName("zone")
	val zone: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null
)

data class BootstrapData(

	@field:SerializedName("cv")
	val cv: Cv? = null,

	@field:SerializedName("footer")
	val footer: Footer? = null,

	@field:SerializedName("header")
	val header: Header? = null,

	@field:SerializedName("membership")
	val membership: Membership? = null,

	@field:SerializedName("account")
	val account: Account? = null
)

data class BottomZone1(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class Footer(

	@field:SerializedName("headers")
	val headers: Headers? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("_all_")
	val all: All? = null
)

data class ErrorResponse(

	@field:SerializedName("errorCodes")
	val errorCodes: Any? = null,

	@field:SerializedName("correlationId")
	val correlationId: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("errors")
	val errors: List<Any?>? = null
)

data class JsonMember1238109482(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class EndpointsByName(

	@field:SerializedName("aroundme")
	val aroundme: String? = null,

	@field:SerializedName("adsgateway")
	val adsgateway: String? = null,

	@field:SerializedName("cegateway")
	val cegateway: String? = null,

	@field:SerializedName("wellness")
	val wellness: String? = null,

	@field:SerializedName("ceaccount")
	val ceaccount: String? = null,

	@field:SerializedName("cecxo")
	val cecxo: String? = null,

	@field:SerializedName("cecph")
	val cecph: String? = null,

	@field:SerializedName("ceorders")
	val ceorders: String? = null,

	@field:SerializedName("cehelpchat")
	val cehelpchat: String? = null,

	@field:SerializedName("shopwithme")
	val shopwithme: String? = null,

	@field:SerializedName("cereturns")
	val cereturns: String? = null,

	@field:SerializedName("quimbyMobile")
	val quimbyMobile: String? = null,

	@field:SerializedName("ceccm")
	val ceccm: String? = null,

	@field:SerializedName("feedbackSubmit")
	val feedbackSubmit: String? = null,

	@field:SerializedName("cewireless")
	val cewireless: String? = null,

	@field:SerializedName("cehelp")
	val cehelp: String? = null,

	@field:SerializedName("typeahead")
	val typeahead: String? = null,

	@field:SerializedName("ceidentity")
	val ceidentity: String? = null,

	@field:SerializedName("espvalidation")
	val espvalidation: String? = null,

	@field:SerializedName("storeservices")
	val storeservices: String? = null,

	@field:SerializedName("warppaymentoptions")
	val warppaymentoptions: String? = null,

	@field:SerializedName("cewarp")
	val cewarp: String? = null,

	@field:SerializedName("fuelPrices")
	val fuelPrices: String? = null
)

data class Categories(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class RequestContext(

	@field:SerializedName("searchMatchType")
	val searchMatchType: String? = null,

	@field:SerializedName("isFitmentFilterQueryApplied")
	val isFitmentFilterQueryApplied: Boolean? = null,

	@field:SerializedName("hasGicIntent")
	val hasGicIntent: Boolean? = null,

	@field:SerializedName("vertical")
	val vertical: String? = null,

	@field:SerializedName("categories")
	val categories: Categories? = null
)

data class JsonMember994712501(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class JsonMember508565564(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class Schedule(

	@field:SerializedName("priority")
	val priority: Int? = null
)

data class Ads(

	@field:SerializedName("moatVideoId")
	val moatVideoId: String? = null,

	@field:SerializedName("host")
	val host: String? = null,

	@field:SerializedName("moatId")
	val moatId: String? = null,

	@field:SerializedName("env")
	val env: String? = null,

	@field:SerializedName("_all_")
	val all: All? = null
)

data class Host(

	@field:SerializedName("stage")
	val stage: String? = null,

	@field:SerializedName("production")
	val production: String? = null,

	@field:SerializedName("teflon")
	val teflon: String? = null
)

data class AvailabilityStatusV2(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class JsonMember585225061(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class INVALID(

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("configs")
	val configs: Configs? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("moduleId")
	val moduleId: String? = null,

	@field:SerializedName("version")
	val version: Int? = null,

	@field:SerializedName("matchedTrigger")
	val matchedTrigger: MatchedTrigger? = null
)

data class AllSortAndFilterFacetsItem(

	@field:SerializedName("max")
	val max: Any? = null,

	@field:SerializedName("values")
	val values: List<ValuesItem?>? = null,

	@field:SerializedName("stepSize")
	val stepSize: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("selectedMax")
	val selectedMax: Any? = null,

	@field:SerializedName("layout")
	val layout: String? = null,

	@field:SerializedName("min")
	val min: Any? = null,

	@field:SerializedName("selectedMin")
	val selectedMin: Any? = null,

	@field:SerializedName("expandOnLoad")
	val expandOnLoad: Boolean? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("unboundedMax")
	val unboundedMax: Any? = null,

	@field:SerializedName("isSelected")
	val isSelected: Any? = null
)

data class DefaultSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null
)

data class Rating(

	@field:SerializedName("numberOfReviews")
	val numberOfReviews: Int? = null,

	@field:SerializedName("averageRating")
	val averageRating: Int? = null
)

data class Pages(

	@field:SerializedName("/my-items")
	val myItems: String? = null,

	@field:SerializedName("/content/[...categoryParams]")
	val contentCategoryParams: String? = null,

	@field:SerializedName("/updatecart")
	val updatecart: String? = null,

	@field:SerializedName("/cart")
	val cart: String? = null,

	@field:SerializedName("/product/[...itemParams]")
	val productItemParams: String? = null,

	@field:SerializedName("/orders/*")
	val orders: String? = null,

	@field:SerializedName("/c/auto-directory/*")
	val cAutoDirectory: String? = null,

	@field:SerializedName("/all-departments")
	val allDepartments: String? = null,

	@field:SerializedName("/lists/*")
	val lists: String? = null,

	@field:SerializedName("/update-payment-method-form")
	val updatePaymentMethodForm: String? = null,

	@field:SerializedName("/rewards-history")
	val rewardsHistory: String? = null,

	@field:SerializedName("/acc/garage")
	val accGarage: String? = null,

	@field:SerializedName("/pac")
	val pac: String? = null,

	@field:SerializedName("/partner/plus/*")
	val partnerPlus: String? = null,

	@field:SerializedName("/topic/[...seo]")
	val topicSeo: String? = null,

	@field:SerializedName("/sparkgood/*")
	val sparkgood: String? = null,

	@field:SerializedName("/ip/[...itemParams]")
	val ipItemParams: String? = null,

	@field:SerializedName("/ci-control")
	val ciControl: String? = null,

	@field:SerializedName("/gic")
	val gic: String? = null,

	@field:SerializedName("/store/[storeId]/[...contentType]")
	val storeStoreIdContentType: String? = null,


	@field:SerializedName("/g/[...seo]")
	val gSeo: String? = null,

	@field:SerializedName("/store")
	val store: String? = null,

	@field:SerializedName("/thankyou/pindrop")
	val thankyouPindrop: String? = null,

	@field:SerializedName("/wallet/associate-discount")
	val walletAssociateDiscount: String? = null,


	@field:SerializedName("/shop/*")
	val shop: String? = null,

	@field:SerializedName("/my-registries")
	val myRegistries: String? = null,

	@field:SerializedName("/seller/*")
	val seller: String? = null,

	@field:SerializedName("/help/*")
	val help: String? = null,

	@field:SerializedName("/reviews/*")
	val reviews: String? = null,

	@field:SerializedName("/store/[storeId]")
	val storeStoreId: String? = null,

	@field:SerializedName("/live-next")
	val liveNext: String? = null,

	@field:SerializedName("/search/*")
	val search: String? = null,

	@field:SerializedName("/shop/[...seo]")
	val shopSeo: String? = null,

	@field:SerializedName("/404")
	val jsonMember404: String? = null,

	@field:SerializedName("/thankyou")
	val thankyou: String? = null,

	@field:SerializedName("/live-next/browse")
	val liveNextBrowse: String? = null,

	@field:SerializedName("/services")
	val services: String? = null,

	@field:SerializedName("/registry/*")
	val registry: String? = null,

	@field:SerializedName("/tp/*")
	val tp: String? = null,

	@field:SerializedName("/live-next/shows")
	val liveNextShows: String? = null,

	@field:SerializedName("/shopwithme/*")
	val shopwithme: String? = null,

	@field:SerializedName("/browse/*")
	val browse: String? = null,

	@field:SerializedName("/i/*")
	val I: String? = null,

	@field:SerializedName("/g/*")
	val G: String? = null,

	@field:SerializedName("/update-payment-method")
	val updatePaymentMethod: String? = null,

	@field:SerializedName("/plus/*")
	val plus: String? = null,

	@field:SerializedName("/account/*")
	val account: String? = null,

	@field:SerializedName("/wp/*")
	val wp: String? = null,

	@field:SerializedName("/hp-redesign")
	val hpRedesign: String? = null,

	@field:SerializedName("/cp/[...categoryParams]")
	val cpCategoryParams: String? = null,

	@field:SerializedName("/c/[...seo]")
	val cSeo: String? = null,

	@field:SerializedName("/subscriptions/manage")
	val subscriptionsManage: String? = null,

	@field:SerializedName("/brand/[...brandParams]")
	val brandBrandParams: String? = null,

	@field:SerializedName("/global/[...seo]")
	val globalSeo: String? = null,

	@field:SerializedName("/nonprofits/*")
	val nonprofits: String? = null
)

data class AdContent(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class ModuleDataByZone(

	@field:SerializedName("bottomZone2")
	val bottomZone2: BottomZone2? = null,

	@field:SerializedName("topZone3")
	val topZone3: TopZone3? = null,

	@field:SerializedName("bottomZone1")
	val bottomZone1: BottomZone1? = null,

	@field:SerializedName("topZone2")
	val topZone2: TopZone2? = null,

	@field:SerializedName("topZone1")
	val topZone1: TopZone1? = null,

	@field:SerializedName("pillsTopZone")
	val pillsTopZone: PillsTopZone? = null,

	@field:SerializedName("topZone6")
	val topZone6: TopZone6? = null,

	@field:SerializedName("topZone5")
	val topZone5: TopZone5? = null,

	@field:SerializedName("INVALID")
	val iNVALID: INVALID? = null
)

data class ScriptSrc(

	@field:SerializedName("values")
	val values: List<String?>? = null,

	@field:SerializedName("nonce")
	val nonce: Boolean? = null
)

data class Category(

	@field:SerializedName("path")
	val path: Any? = null
)

data class FeLog(

	@field:SerializedName("s")
	val S: String? = null,

	@field:SerializedName("g")
	val G: String? = null,

	@field:SerializedName("trf")
	val trf: String? = null,

	@field:SerializedName("dept")
	val dept: String? = null
)

data class LayoutContainerData(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("flow")
	val flow: String? = null,

	@field:SerializedName("content")
	val content: List<ContentItem?>? = null
)

data class JsonMember847625727(

	@field:SerializedName("usItemId")
	val usItemId: String? = null
)

data class ItemsItem(

	@field:SerializedName("quickShop")
	val quickShop: Any? = null,

	@field:SerializedName("numberOfReviews")
	val numberOfReviews: Int? = null,

	@field:SerializedName("rating")
	val rating: Rating? = null,

	@field:SerializedName("imageInfo")
	val imageInfo: ImageInfo? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("canAddToCart")
	val canAddToCart: Boolean? = null,

	@field:SerializedName("specialBuy")
	val specialBuy: Boolean? = null,

	@field:SerializedName("pac")
	val pac: Any? = null,

	@field:SerializedName("priceFlip")
	val priceFlip: Boolean? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("earlyAccessEvent")
	val earlyAccessEvent: Boolean? = null,

	@field:SerializedName("preOrder")
	val preOrder: PreOrder? = null,

	@field:SerializedName("groupMetaData")
	val groupMetaData: GroupMetaData? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("petRx")
	val petRx: PetRx? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("fulfillmentBadgeGroups")
	val fulfillmentBadgeGroups: Any? = null,

	@field:SerializedName("weightIncrement")
	val weightIncrement: Int? = null,

	@field:SerializedName("shortDescription")
	val shortDescription: Any? = null,

	@field:SerializedName("isEarlyAccessItem")
	val isEarlyAccessItem: Boolean? = null,

	@field:SerializedName("fulfillmentTitle")
	val fulfillmentTitle: String? = null,

	@field:SerializedName("buyBoxSuppression")
	val buyBoxSuppression: Boolean? = null,

	@field:SerializedName("vision")
	val vision: Vision? = null,

	@field:SerializedName("badge")
	val badge: Badge? = null,

	@field:SerializedName("usItemId")
	val usItemId: String? = null,

	@field:SerializedName("salesUnit")
	val salesUnit: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("classType")
	val classType: String? = null,

	@field:SerializedName("annualEventV2")
	val annualEventV2: Boolean? = null,

	@field:SerializedName("rewards")
	val rewards: Any? = null,

	@field:SerializedName("isVariantTypeSwatch")
	val isVariantTypeSwatch: Boolean? = null,

	@field:SerializedName("seeShippingEligibility")
	val seeShippingEligibility: Boolean? = null,

	@field:SerializedName("itemType")
	val itemType: Any? = null,

	@field:SerializedName("flag")
	val flag: String? = null,

	@field:SerializedName("isAtfMarker")
	val isAtfMarker: Boolean? = null,

	@field:SerializedName("topResult")
	val topResult: Any? = null,

	@field:SerializedName("aspectInfo")
	val aspectInfo: AspectInfo? = null,

	@field:SerializedName("externalInfo")
	val externalInfo: Any? = null,

	@field:SerializedName("__typename")
	val typename: String? = null,

	@field:SerializedName("showOptions")
	val showOptions: Boolean? = null,

	@field:SerializedName("variantList")
	val variantList: List<Any?>? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("variantCriteria")
	val variantCriteria: List<Any?>? = null,

	@field:SerializedName("productLocation")
	val productLocation: Any? = null,

	@field:SerializedName("subscription")
	val subscription: Subscription? = null,

	@field:SerializedName("salesUnitType")
	val salesUnitType: String? = null,

	@field:SerializedName("priceInfo")
	val priceInfo: PriceInfo? = null,

	@field:SerializedName("isSponsoredFlag")
	val isSponsoredFlag: Boolean? = null,

	@field:SerializedName("averageRating")
	val averageRating: Double? = null,

	@field:SerializedName("arExperiences")
	val arExperiences: ArExperiences? = null,

	@field:SerializedName("hasCarePlans")
	val hasCarePlans: Boolean? = null,

	@field:SerializedName("imageSize")
	val imageSize: String? = null,

	@field:SerializedName("fulfillmentBadges")
	val fulfillmentBadges: List<String?>? = null,

	@field:SerializedName("quickShopCTALabel")
	val quickShopCTALabel: Any? = null,

	@field:SerializedName("checkStoreAvailabilityATC")
	val checkStoreAvailabilityATC: Boolean? = null,

	@field:SerializedName("eventAttributes")
	val eventAttributes: EventAttributes? = null,

	@field:SerializedName("showAtc")
	val showAtc: Boolean? = null,

	@field:SerializedName("canonicalUrl")
	val canonicalUrl: String? = null,

	@field:SerializedName("similarItems")
	val similarItems: Boolean? = null,

	@field:SerializedName("annualEvent")
	val annualEvent: Boolean? = null,

	@field:SerializedName("externalInfoUrl")
	val externalInfoUrl: String? = null,

	@field:SerializedName("isOutOfStock")
	val isOutOfStock: Boolean? = null,

	@field:SerializedName("badges")
	val badges: Badges? = null,

	@field:SerializedName("esrb")
	val esrb: String? = null,

	@field:SerializedName("snapEligible")
	val snapEligible: Boolean? = null,

	@field:SerializedName("showBuyNow")
	val showBuyNow: Boolean? = null,

	@field:SerializedName("availabilityStatusV2")
	val availabilityStatusV2: AvailabilityStatusV2? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("shouldLazyLoad")
	val shouldLazyLoad: Boolean? = null,

	@field:SerializedName("sellerId")
	val sellerId: String? = null,

	@field:SerializedName("fulfillmentSpeed")
	val fulfillmentSpeed: List<String?>? = null,

	@field:SerializedName("fulfillmentIcon")
	val fulfillmentIcon: FulfillmentIcon? = null,

	@field:SerializedName("offerId")
	val offerId: String? = null,

	@field:SerializedName("availabilityStatusDisplayValue")
	val availabilityStatusDisplayValue: String? = null,

	@field:SerializedName("sellerName")
	val sellerName: String? = null,

	@field:SerializedName("fulfillmentType")
	val fulfillmentType: String? = null,

	@field:SerializedName("displayName")
	val displayName: String? = null,

	@field:SerializedName("lazy")
	val lazy: String? = null,

	@field:SerializedName("moduleLocation")
	val moduleLocation: String? = null,

	@field:SerializedName("sponsoredProduct")
	val sponsoredProduct: SponsoredProduct? = null
)

data class MembershipConfig(

	@field:SerializedName("showWPlusBanner")
	val showWPlusBanner: Boolean? = null
)
