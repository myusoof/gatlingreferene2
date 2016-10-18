package helpers

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by yusoof on 7/10/16.
  */
object WebServiceHttpProtocolHelper{
  val httpProtocol = http.baseURL("http://jsonplaceholder.typicode.com/")
  val internetHeroKuppProtocol = http.baseURL("http://the-internet.herokuapp.com/").disableCaching
}
