package webapplication


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class MyProgramSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://abn-vbb-non-d01.dev.trizetto.com:90")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Authorization" -> "Negotiate TlRMTVNTUAADAAAAGAAYAJwAAACaAZoBtAAAAAgACABYAAAAHgAeAGAAAAAeAB4AfgAAABAAEABOAgAAFYKI4gYBsR0AAAAPtqruYb2TvHFPZhKXVsfv+EMATwBSAFAAbQBvAGgAbQBlAGQAeQB1AHMAbwBvAGYALgBhAHMAQwBTAE4ALQBDAEcAWgAtAEMAQQBFAC0AMAA3ADEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAWBWLMjtIHqN1N+VBTl0rvQEBAAAAAAAAZN8EQpUg0gFurmI6q4UcOQAAAAACAAYARABFAFYAAQAeAEEAQgBOAC0AVgBCAEIALQBOAE8ATgAtAEQAMAAxAAQAIABkAGUAdgAuAHQAcgBpAHoAZQB0AHQAbwAuAGMAbwBtAAMAQABBAEIATgAtAFYAQgBCAC0ATgBPAE4ALQBEADAAMQAuAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABQAgAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABwAIAGTfBEKVINIBBgAEAAIAAAAIADAAMAAAAAAAAAABAAAAACAAADifGuSeSABV3ZFAIKWxzhsS8+5547rafQkwdx0tb50eCgAQAAAAAAAAAAAAAAAAAAAAAAAJAEoASABUAFQAUAAvAGEAYgBuAC0AdgBiAGIALQBuAG8AbgAtAGQAMAAxAC4AZABlAHYALgB0AHIAaQB6AGUAdAB0AG8ALgBjAG8AbQAAAAAAAAAAAAAAAAAos7sAiYXqtrBqUJGPlOQA",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "keep-alive")

	val headers_3 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Authorization" -> "Negotiate TlRMTVNTUAADAAAAGAAYAJwAAACaAZoBtAAAAAgACABYAAAAHgAeAGAAAAAeAB4AfgAAABAAEABOAgAAFYKI4gYBsR0AAAAPjD7QxQW8vWjx/eRGhbtRyUMATwBSAFAAbQBvAGgAbQBlAGQAeQB1AHMAbwBvAGYALgBhAHMAQwBTAE4ALQBDAEcAWgAtAEMAQQBFAC0AMAA3ADEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZCTLQLBvcxdd48RjPOZATAEBAAAAAAAAnOPkV5Ug0gHqH5b/Llv0WwAAAAACAAYARABFAFYAAQAeAEEAQgBOAC0AVgBCAEIALQBOAE8ATgAtAEQAMAAxAAQAIABkAGUAdgAuAHQAcgBpAHoAZQB0AHQAbwAuAGMAbwBtAAMAQABBAEIATgAtAFYAQgBCAC0ATgBPAE4ALQBEADAAMQAuAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABQAgAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABwAIAJzj5FeVINIBBgAEAAIAAAAIADAAMAAAAAAAAAABAAAAACAAADifGuSeSABV3ZFAIKWxzhsS8+5547rafQkwdx0tb50eCgAQAAAAAAAAAAAAAAAAAAAAAAAJAEoASABUAFQAUAAvAGEAYgBuAC0AdgBiAGIALQBuAG8AbgAtAGQAMAAxAC4AZABlAHYALgB0AHIAaQB6AGUAdAB0AG8ALgBjAG8AbQAAAAAAAAAAAAAAAACQFydG5UwI88yaAFViOxI+",
		"Connection" -> "keep-alive")

	val headers_4 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Authorization" -> "Negotiate TlRMTVNTUAADAAAAGAAYAJwAAACaAZoBtAAAAAgACABYAAAAHgAeAGAAAAAeAB4AfgAAABAAEABOAgAAFYKI4gYBsR0AAAAP0KS4mSMIXTBT9TpA1C+HY0MATwBSAFAAbQBvAGgAbQBlAGQAeQB1AHMAbwBvAGYALgBhAHMAQwBTAE4ALQBDAEcAWgAtAEMAQQBFAC0AMAA3ADEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALKCSia4HGDIF6ROy/xcNNwEBAAAAAAAAnOPkV5Ug0gEns+kpXdU/SAAAAAACAAYARABFAFYAAQAeAEEAQgBOAC0AVgBCAEIALQBOAE8ATgAtAEQAMAAxAAQAIABkAGUAdgAuAHQAcgBpAHoAZQB0AHQAbwAuAGMAbwBtAAMAQABBAEIATgAtAFYAQgBCAC0ATgBPAE4ALQBEADAAMQAuAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABQAgAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABwAIAJzj5FeVINIBBgAEAAIAAAAIADAAMAAAAAAAAAABAAAAACAAADifGuSeSABV3ZFAIKWxzhsS8+5547rafQkwdx0tb50eCgAQAAAAAAAAAAAAAAAAAAAAAAAJAEoASABUAFQAUAAvAGEAYgBuAC0AdgBiAGIALQBuAG8AbgAtAGQAMAAxAC4AZABlAHYALgB0AHIAaQB6AGUAdAB0AG8ALgBjAG8AbQAAAAAAAAAAAAAAAACMKKAuOA4xlvdSSND1gr9/",
		"Connection" -> "keep-alive")

	val headers_5 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Authorization" -> "Negotiate TlRMTVNTUAADAAAAGAAYAJwAAACaAZoBtAAAAAgACABYAAAAHgAeAGAAAAAeAB4AfgAAABAAEABOAgAAFYKI4gYBsR0AAAAPnvztV8PirKZC/U6QPdKLtUMATwBSAFAAbQBvAGgAbQBlAGQAeQB1AHMAbwBvAGYALgBhAHMAQwBTAE4ALQBDAEcAWgAtAEMAQQBFAC0AMAA3ADEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAApDpqOUXLuC/1kHQVMErIAwEBAAAAAAAAhArlV5Ug0gF3FVUh3iFwzAAAAAACAAYARABFAFYAAQAeAEEAQgBOAC0AVgBCAEIALQBOAE8ATgAtAEQAMAAxAAQAIABkAGUAdgAuAHQAcgBpAHoAZQB0AHQAbwAuAGMAbwBtAAMAQABBAEIATgAtAFYAQgBCAC0ATgBPAE4ALQBEADAAMQAuAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABQAgAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABwAIAIQK5VeVINIBBgAEAAIAAAAIADAAMAAAAAAAAAABAAAAACAAADifGuSeSABV3ZFAIKWxzhsS8+5547rafQkwdx0tb50eCgAQAAAAAAAAAAAAAAAAAAAAAAAJAEoASABUAFQAUAAvAGEAYgBuAC0AdgBiAGIALQBuAG8AbgAtAGQAMAAxAC4AZABlAHYALgB0AHIAaQB6AGUAdAB0AG8ALgBjAG8AbQAAAAAAAAAAAAAAAACi7ufYKzkbSt3gw7cvB6eg",
		"Connection" -> "keep-alive")

	val headers_6 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Authorization" -> "Negotiate TlRMTVNTUAADAAAAGAAYAJwAAACaAZoBtAAAAAgACABYAAAAHgAeAGAAAAAeAB4AfgAAABAAEABOAgAAFYKI4gYBsR0AAAAPOOUR3m3C7oG9lBKUUyTl7EMATwBSAFAAbQBvAGgAbQBlAGQAeQB1AHMAbwBvAGYALgBhAHMAQwBTAE4ALQBDAEcAWgAtAEMAQQBFAC0AMAA3ADEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYmWsQoCqKIojPr2V8kkHYwEBAAAAAAAAnOPkV5Ug0gECcf7k4Cd9iwAAAAACAAYARABFAFYAAQAeAEEAQgBOAC0AVgBCAEIALQBOAE8ATgAtAEQAMAAxAAQAIABkAGUAdgAuAHQAcgBpAHoAZQB0AHQAbwAuAGMAbwBtAAMAQABBAEIATgAtAFYAQgBCAC0ATgBPAE4ALQBEADAAMQAuAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABQAgAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABwAIAJzj5FeVINIBBgAEAAIAAAAIADAAMAAAAAAAAAABAAAAACAAADifGuSeSABV3ZFAIKWxzhsS8+5547rafQkwdx0tb50eCgAQAAAAAAAAAAAAAAAAAAAAAAAJAEoASABUAFQAUAAvAGEAYgBuAC0AdgBiAGIALQBuAG8AbgAtAGQAMAAxAC4AZABlAHYALgB0AHIAaQB6AGUAdAB0AG8ALgBjAG8AbQAAAAAAAAAAAAAAAACoGSrlCHhU9Nc15iy1fmIj",
		"Connection" -> "keep-alive")

	val headers_7 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Authorization" -> "Negotiate TlRMTVNTUAADAAAAGAAYAJwAAACaAZoBtAAAAAgACABYAAAAHgAeAGAAAAAeAB4AfgAAABAAEABOAgAAFYKI4gYBsR0AAAAP1v90kzympP+4fi4j1LkrFEMATwBSAFAAbQBvAGgAbQBlAGQAeQB1AHMAbwBvAGYALgBhAHMAQwBTAE4ALQBDAEcAWgAtAEMAQQBFAC0AMAA3ADEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALNXJl3Iw37aZru8anDJWpgEBAAAAAAAAJ6flV5Ug0gF40nEwXyQ/cAAAAAACAAYARABFAFYAAQAeAEEAQgBOAC0AVgBCAEIALQBOAE8ATgAtAEQAMAAxAAQAIABkAGUAdgAuAHQAcgBpAHoAZQB0AHQAbwAuAGMAbwBtAAMAQABBAEIATgAtAFYAQgBCAC0ATgBPAE4ALQBEADAAMQAuAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABQAgAGQAZQB2AC4AdAByAGkAegBlAHQAdABvAC4AYwBvAG0ABwAIACen5VeVINIBBgAEAAIAAAAIADAAMAAAAAAAAAABAAAAACAAADifGuSeSABV3ZFAIKWxzhsS8+5547rafQkwdx0tb50eCgAQAAAAAAAAAAAAAAAAAAAAAAAJAEoASABUAFQAUAAvAGEAYgBuAC0AdgBiAGIALQBuAG8AbgAtAGQAMAAxAC4AZABlAHYALgB0AHIAaQB6AGUAdAB0AG8ALgBjAG8AbQAAAAAAAAAAAAAAAACA8IELA0li3jqfp2SZDFyi",
		"Connection" -> "keep-alive")

	val headers_8 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "keep-alive")

	val headers_46 = Map(
		"Accept" -> "text/html",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache")

	val headers_49 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "keep-alive")

	val headers_51 = Map("Origin" -> "http://abn-vbb-non-d01.dev.trizetto.com:90")

	val headers_52 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "keep-alive",
		"Origin" -> "http://abn-vbb-non-d01.dev.trizetto.com:90")

	val headers_60 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache")

    val uri2 = "https://fonts.gstatic.com/s/roboto/v15"
    val uri3 = "https://fonts.googleapis.com/css"

	val scn = scenario("MyProgramSimulation")
		.exec(http("request_0")
			.get("/VBB_MEMBER53/?Username=Wendy.Pan")
			.headers(headers_0))
		.pause(36)
		.exec(http("request_1")
			.get("/VBB_MEMBER53/font-awesome-4.4.0/css/font-awesome.min.css")
			.headers(headers_1)
			.resources(http("request_2")
			.get("/VBB_MEMBER53/node_modules/bootstrap/dist/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_3")
			.get("/VBB_MEMBER53/node_modules/bootstrap/dist/css/bootstrap-theme.css")
			.headers(headers_3),
            http("request_4")
			.get("/VBB_MEMBER53/Content/App_Themes/base/default.css")
			.headers(headers_4),
            http("request_5")
			.get("/VBB_MEMBER53/Content/App_Themes/base/photos.css")
			.headers(headers_5),
            http("request_6")
			.get("/VBB_MEMBER53/Content/App_Themes/base/vbb-member-font.css")
			.headers(headers_6),
            http("request_7")
			.get("/VBB_MEMBER53/node_modules/jquery/dist/jquery.min.js")
			.headers(headers_7),
            http("request_8")
			.get("/VBB_MEMBER53/node_modules/bootstrap/dist/js/bootstrap.js")
			.headers(headers_8),
            http("request_9")
			.get("/VBB_MEMBER53/node_modules/angular/angular.js")
			.headers(headers_8),
            http("request_10")
			.get("/VBB_MEMBER53/node_modules/angular-sanitize/angular-sanitize.js")
			.headers(headers_8),
            http("request_11")
			.get("/VBB_MEMBER53/node_modules/angular-cookies/angular-cookies.js")
			.headers(headers_8),
            http("request_12")
			.get("/VBB_MEMBER53/node_modules/angular-animate/angular-animate.js")
			.headers(headers_8),
            http("request_13")
			.get("/VBB_MEMBER53/node_modules/angular-ui-router/release/angular-ui-router.js")
			.headers(headers_8),
            http("request_14")
			.get("/VBB_MEMBER53/node_modules/chart.js/Chart.bundle.js")
			.headers(headers_8),
            http("request_15")
			.get("/VBB_MEMBER53/app/core/programs/programController.js")
			.headers(headers_8),
            http("request_16")
			.get("/VBB_MEMBER53/app/core/health/myHealthController.js")
			.headers(headers_8),
            http("request_17")
			.get("/VBB_MEMBER53/app/core/programs/programDetailsController.js")
			.headers(headers_8),
            http("request_18")
			.get("/VBB_MEMBER53/app/core/programs/componentDetailsController.js")
			.headers(headers_8),
            http("request_19")
			.get("/VBB_MEMBER53/app/core/rewards/rewardsController.js")
			.headers(headers_8),
            http("request_20")
			.get("/VBB_MEMBER53/app/core/health/healthMeasureController.js")
			.headers(headers_8),
            http("request_21")
			.get("/VBB_MEMBER53/app/core/health/healthConditionController.js")
			.headers(headers_8),
            http("request_22")
			.get("/VBB_MEMBER53/app/help/helpController.js")
			.headers(headers_8),
            http("request_23")
			.get("/VBB_MEMBER53/app/appFactory.js")
			.headers(headers_8),
            http("request_24")
			.get("/VBB_MEMBER53/app/util/appUtil.js")
			.headers(headers_8),
            http("request_25")
			.get("/VBB_MEMBER53/app/appConstant.js")
			.headers(headers_8),
            http("request_26")
			.get("/VBB_MEMBER53/app/appService.js")
			.headers(headers_8),
            http("request_27")
			.get("/VBB_MEMBER53/app/appCacheUtil.js")
			.headers(headers_8),
            http("request_28")
			.get("/VBB_MEMBER53/app/appDataService.js")
			.headers(headers_8),
            http("request_29")
			.get("/VBB_MEMBER53/app/directive/resourceItemDirective.js")
			.headers(headers_8),
            http("request_30")
			.get("/VBB_MEMBER53/app/directive/readMoreDirective.js")
			.headers(headers_8),
            http("request_31")
			.get("/VBB_MEMBER53/app/directive/healthMeasureDirective.js")
			.headers(headers_8),
            http("request_32")
			.get("/VBB_MEMBER53/app/directive/healthConditionDirective.js")
			.headers(headers_8),
            http("request_33")
			.get("/VBB_MEMBER53/app/directive/datePickerDirective.js")
			.headers(headers_8),
            http("request_34")
			.get("/VBB_MEMBER53/app/directive/spinnerDirective.js")
			.headers(headers_8),
            http("request_35")
			.get("/VBB_MEMBER53/app/directive/errorMessageDirective.js")
			.headers(headers_8),
            http("request_36")
			.get("/VBB_MEMBER53/app/core/chart/donutChartController.js")
			.headers(headers_8),
            http("request_37")
			.get("/VBB_MEMBER53/app/core/chart/lineChartController.js")
			.headers(headers_8),
            http("request_38")
			.get("/VBB_MEMBER53/app/directive/chartDirective.js")
			.headers(headers_8),
            http("request_39")
			.get("/VBB_MEMBER53/app/directive/linkedComponentDirective.js")
			.headers(headers_8),
            http("request_40")
			.get("/VBB_MEMBER53/app/appConfig.js")
			.headers(headers_8),
            http("request_41")
			.get("/VBB_MEMBER53/app/app.js")
			.headers(headers_8),
            http("request_42")
			.get("/VBB_MEMBER53/app/util/shadowscroll.js")
			.headers(headers_8),
            http("request_43")
			.get("/VBB_MEMBER53/node_modules/angular-confirm/angular.confirm.js")
			.headers(headers_8),
            http("request_44")
			.get("/VBB_MEMBER53/node_modules/angular-ui-bootstrap/ui-bootstrap-tpls.js")
			.headers(headers_8),
            http("request_45")
			.get(uri3 + "?family=Roboto:400,100,700italic,700,500italic,500,400italic,300italic,300,100italic|Roboto+Condensed:400,300,300italic,400italic,700,700italic")))
		.pause(1)
		.exec(http("request_46")
			.get("/VBB_MEMBER53/Home/Content")
			.headers(headers_46)
			.resources(http("request_47")
			.get("/VBB_MEMBER53/Home/Header")
			.headers(headers_46),
            http("request_48")
			.get("/VBB_MEMBER53/Content/App_Themes/Payer/Group/MINNIES%20LIMO'S.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_49")
			.get("/VBB_MEMBER53/Content/App_Themes/images/top-bg-0079C2.png")
			.headers(headers_49),
            http("request_50")
			.get("/VBB_MEMBER53/Content/App_Themes/images/logo-01-darkbg.svg")
			.headers(headers_49),
            http("request_51")
			.get(uri2 + "/CWB0XYA8bzo0kSThX0UTuA.woff2")
			.headers(headers_51),
            http("request_52")
			.get("/VBB_MEMBER53/Content/App_Themes/fonts/vbb-member-font.woff2?enq0sj")
			.headers(headers_52)
			.check(status.is(404)),
            http("request_53")
			.get(uri2 + "/RxZJdnzeo3R5zSexge8UUVtXRa8TVwTICgirnJhmVJw.woff2")
			.headers(headers_51),
            http("request_54")
			.get("/VBB_MEMBER53/Content/App_Themes/fonts/vbb-member-font.ttf?enq0sj")
			.headers(headers_52),
            http("request_55")
			.get("/VBB_MEMBER53/app/core/programs/programList.html")
			.headers(headers_46),
            http("request_56")
			.get("/VBB_MEMBER53/Content/App_Themes/images/main-content-bg-top.png")
			.headers(headers_49),
            http("request_57")
			.get("/VBB_MEMBER53/Content/App_Themes/images/ajax-loader.gif")
			.headers(headers_49),
            http("request_58")
			.get("/VBB_MEMBER53/Content/App_Themes/images/main-content-bg-bottom.png")
			.headers(headers_49),
            http("request_59")
			.get("/VBB_MEMBER53/Content/App_Themes/images/programs-header-photo.png")
			.headers(headers_49),
            http("request_60")
			.get("/VBB_MEMBER53_WEBAPI/api/Program/GetAll?expand=true&extuId=&key1=Aa101&key2=CC102&pageName=ProgramList&payerId=3")
			.headers(headers_60)))
		.pause(61)
		.exec(http("request_61")
			.get(uri2 + "/d-6IYplOFocCacKzxwXSOFtXRa8TVwTICgirnJhmVJw.woff2")
			.headers(headers_51))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}