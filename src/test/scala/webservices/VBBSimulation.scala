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
  setUp(VbbScenarios.VbbGetAllProgramsScenario.inject(atOnceUsers(1)),
    VbbScenarios.VbbGetRewardsScenario.inject(atOnceUsers(1)),
    VbbScenarios.VbbGetHealthDashboardScenario.inject(atOnceUsers(1)),
    VbbScenarios.VbbGetHealthAttributeScenario.inject(atOnceUsers(1))
  ).protocols(WebServiceHttpProtocolHelper.vbbhttpprotocol)
}
