import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http
import scala.concurrent.duration._
/**
  * Created by yusoof on 5/10/16.
  */
class TestScenario1 extends Simulation{

  val scenario1 = scenario("first scenario").exec(http.Predef.http("post call").get("http://jsonplaceholder.typicode.com/posts/1"))

  setUp(scenario1.inject(rampUsersPerSec(2) to (10) during(20 seconds))).maxDuration(40 seconds)
}
