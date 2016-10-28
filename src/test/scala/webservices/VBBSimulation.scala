package webservices

import helpers.WebServiceHttpProtocolHelper
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http
import webservices.scenarios.VbbScenarios
import webservices.services.VbbServices

import scala.concurrent.duration._
/**
  * Created by yusoof on 5/10/16.
  */
class VBBSimulation extends Simulation{
  setUp(VbbScenarios.VbbGetAllProgramsScenario.inject(rampUsers(10) over(5 seconds)),
    VbbScenarios.VbbGetRewardsScenario.inject(rampUsers(10) over(5 seconds)),
    VbbScenarios.VbbGetHealthDashboardScenario.inject(rampUsers(10) over(5 seconds)),
    VbbScenarios.VbbGetHealthAttributeScenario.inject(rampUsers(10) over(5 seconds))
  ).protocols(WebServiceHttpProtocolHelper.vbbhttpprotocol).maxDuration(15 minutes)
}
