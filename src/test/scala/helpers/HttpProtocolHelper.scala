package helpers

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by yusoof on 7/10/16.
  */
object HttpProtocolHelper {
  val httpProtocol = http.baseURL("https://jsonplaceholder.typicode.com")
}
