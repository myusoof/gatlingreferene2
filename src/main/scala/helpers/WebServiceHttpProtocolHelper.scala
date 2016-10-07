package helpers

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by yusoof on 7/10/16.
  */
object WebServiceHttpProtocolHelper extends IHttpProtocol {
  override val httpProtocol = http.baseURL("http://jsonplaceholder.typicode.com/")
}
