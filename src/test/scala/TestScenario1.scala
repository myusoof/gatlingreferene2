import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http

/**
  * Created by yusoof on 5/10/16.
  */
class TestScenario1 extends Simulation{

  val scenario1 = scenario("first scenario").exec(http.Predef.http("").get("http://www.google.com"))

  setUp(scenario1.inject(atOnceUsers(1)))
}
