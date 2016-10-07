package webservices.scenarios

import io.gatling.http.Predef._
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

}
