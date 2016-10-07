package webservices

import helpers.WebServiceHttpProtocolHelper
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http
import webservices.scenarios.GetUsersScenarios
import webservices.services.GetAllPostService

import scala.concurrent.duration._
/**
  * Created by yusoof on 5/10/16.
  */
class TestScenario1 extends Simulation{
  setUp(GetUsersScenarios.getAllUsersScenarios.inject(rampUsersPerSec(2) to (10) during(5 seconds))).protocols(WebServiceHttpProtocolHelper.httpProtocol).maxDuration(40 seconds)
}