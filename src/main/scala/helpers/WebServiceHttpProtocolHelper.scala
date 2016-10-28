package helpers

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by yusoof on 7/10/16.
  */
object WebServiceHttpProtocolHelper{
  val vbbhttpprotocol = http.baseURL("http://abn-vbb-fdn-d03.dev.trizetto.com:90/").disableCaching.ntlmAuth("mohmedyusoof.as", "Sep@2017", "corp","")
}
