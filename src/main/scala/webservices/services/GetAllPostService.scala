package webservices.services

import io.gatling.core.Predef._
import io.gatling.http.Predef._


/**
  * Created by yusoof on 7/10/16.
  */
object GetAllPostService {

  val getAllUsersService = http("Get All Post").get("posts")

  val getPostByUserid = http("get post by userid").get("/?userId=${userId}")
}
