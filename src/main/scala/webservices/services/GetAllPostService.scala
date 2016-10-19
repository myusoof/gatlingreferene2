package webservices.services

import io.gatling.core.Predef._
import io.gatling.http.Predef._


/**
  * Created by yusoof on 7/10/16.
  */
object GetAllPostService {
  val getAllUsersService = http("Get All Post").get("posts")
  val getPostByUserid = http("get post by userid").get("/?userId=${userId}")

  val internetHerokuppsite = http("internet site").get("")
  val abTesting = http("abtest").get("abtest")
  val basicAuth = http("basic Auth").get("basic_auth").basicAuth("admin", "admin")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, sdch",
    "Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
    "Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36")

  val vbb_user_launch = http("vbbuser").get("?Username=Noah.Mohler").headers(headers_0)
}
