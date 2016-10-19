package webservices.scenarios

import io.gatling.core.session.Session
import webservices.services.GetAllPostService

import io.gatling.core.Predef._
import io.gatling.http.Predef._
/**
  * Created by mohmedyusoof.as on 10/7/2016.
  */
object GetUsersScenarios {

  val getAllUsersScenarios = scenario("scenario 1").exec(
    GetAllPostService.getAllUsersService.check(status.is(200)).check(jsonPath("$..[?(@.id==94)].userId").find.saveAs("userId")).resources(GetAllPostService.getPostByUserid)
  )

  val feederExample = scenario("feeder example").feed(csv("username.csv").random)
    .exec(session =>{
      println(session("userid").as[String])
      session
      })
    .exec(GetAllPostService.getAllUsersService.check(status.is(200))
      .check(jsonPath("$..[?(@.id==94)].userId").find.saveAs("userId")))

  val abTestingScenario = scenario("ab testing site").group("Ab Testing"){
    exec(GetAllPostService.internetHerokuppsite.check(status.is(200)))
      .exec(GetAllPostService.abTesting.check(status.is(200)))
  }

  val basicAuthScenario = scenario("basic auth site").group("Basic Auth"){
    exec(GetAllPostService.internetHerokuppsite.check(status.is(200)).check(header("set-cookie").saveAs("cookie1")))
        .exec(session => {println(session("cookie1").as[String])
          session
        })
      .exec(GetAllPostService.basicAuth.check(status.is(200)))
  }

  val vbbhomepage = scenario("vbb internet application").exec(GetAllPostService.vbb_user_launch.check(status.is(200)))
}
