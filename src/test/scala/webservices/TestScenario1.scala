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
/*  setUp(GetUsersScenarios.feederExample.inject(rampUsersPerSec(2) to (10) during(5 seconds)))
    .protocols(WebServiceHttpProtocolHelper.httpProtocol).maxDuration(10 seconds)*/

  setUp(GetUsersScenarios.abTestingScenario.inject(rampUsersPerSec(2) to (10) during(5 seconds)),
    GetUsersScenarios.basicAuthScenario.inject(rampUsersPerSec(2) to (10) during(5 seconds))
  )
    .protocols(WebServiceHttpProtocolHelper.internetHeroKuppProtocol).maxDuration(10 seconds)

}
