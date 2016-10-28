package webservices.services

import io.gatling.core.Predef._
import io.gatling.http.Predef._


/**
  * Created by yusoof on 7/10/16.
  */
object VbbServices {
  var vbb_user_launch_service = http("vbbuser").get("VBB_MEMBER53/?Username=${username}")

  val vbb_get_all_programs_service = http("get all program service")
    .get("VBB_MEMBER53_WEBAPI/api/Program/GetAll?expand=true&extuId=&key1=${key1}&key2=${key2}&pageName=ProgramList&payerId=${payerid}")

  val vbb_get_reward_summary_service = http("get reward summary")
    .get("VBB_MEMBER53_WEBAPI/api/Reward/GetRewardSummary?extuId=&key1=${key1}&key2=${key2}&payerId=${payerid}&rewardTypeId=")

  val vbb_health_dashboard_service = http("get health dashboard details")
    .get("VBB_MEMBER53_WEBAPI/api/MyHealth/Get?extuId=&key1=${key1}&key2=${key2}&payerId=${payerid}&typeId=")

  val vbb_health_attribute_type_service = http("get health attribute type")
    .get("VBB_MEMBER53_WEBAPI/api/MyHealth/GetAttribute?extuId=&key1=${key1}&key2=${key2}&payerId=${payerid}&typeId=${typeid}")
}
