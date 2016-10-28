package helpers

import io.gatling.core.Predef._
/**
  * Created by mohmedyusoof.as on 10/28/2016.
  */
object FeederProvider {
  val UserDetailsFeeder = csv("vbbuserdetails.csv").random
}
