package webservices.scenarios

import helpers.{FeederProvider, HeaderProvider}
import io.gatling.core.action.builder.ActionBuilder
import webservices.services.VbbServices

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import spray.json._
/**
  * Created by mohmedyusoof.as on 10/7/2016.
  */
object VbbScenarios {

  var vbb_home_page_action: ActionBuilder = VbbServices.vbb_user_launch_service
    .check(status.is(200))
    .check(header("set-cookie").saveAs("cookie"))

  var vbb_get_all_program_action: ActionBuilder = VbbServices.vbb_get_all_programs_service.headers(HeaderProvider.headers_1)
    .header("Cookie", session => session("cookie").as[String])
    .check(status.is(200))

  var vbb_get_reward_summary_action : ActionBuilder = VbbServices.vbb_get_reward_summary_service.headers(HeaderProvider.headers_1)
    .header("Cookie", session => session("cookie").as[String])
    .check(status.is(200))

  var vbb_health_dashboard_action : ActionBuilder = VbbServices.vbb_health_dashboard_service.headers(HeaderProvider.headers_1)
    .header("Cookie", session => session("cookie").as[String])
    .check(status.is(200))

  var vbb_health_attribute_action : ActionBuilder = VbbServices.vbb_health_attribute_type_service.headers(HeaderProvider.headers_1)
    .header("Cookie", session => session("cookie").as[String])
    .check(status.is(200))

  val VbbGetAllProgramsScenario = scenario("Get All Programs").group("Get All Programs"){
    feed(FeederProvider.UserDetailsFeeder)
      .exec(vbb_home_page_action)
      .exec(vbb_get_all_program_action)
  }
  val VbbGetRewardsScenario = scenario("Get Rewards").group("Get Rewards") {
    feed(FeederProvider.UserDetailsFeeder).
    exec(vbb_home_page_action)
      .exec(vbb_get_reward_summary_action)
  }
  val VbbGetHealthDashboardScenario = scenario("Get Health Dashboard").group("Get health bashboard"){
    feed(FeederProvider.UserDetailsFeeder).
    exec(vbb_home_page_action)
      .exec(vbb_health_dashboard_action)
  }
  val VbbGetHealthAttributeScenario = scenario("Get Health Attribute").group("Get Health Attribute"){
    feed(FeederProvider.UserDetailsFeeder).
    exec(vbb_home_page_action)
      .exec(vbb_health_attribute_action)
  }
}
