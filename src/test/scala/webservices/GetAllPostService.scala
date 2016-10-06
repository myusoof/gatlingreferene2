package webservices

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jsonpath.JsonPath


/**
  * Created by yusoof on 7/10/16.
  */
class GetAllPostService {

  val getAllPostScenario = http("Get All Post").get("").check(status.is(200))
    .check(jsonPath("$..[?(@.id==94)].userId").find.saveAs("userId"))

  val getPostByUserid = http("get post by userid").get("/?userId=${userId}")
}
