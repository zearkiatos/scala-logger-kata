package pedrocapriles.scala_logger_kata

import org.scalatest._
import org.scalatest.Matchers._

final class ScalaloggerkataTest extends WordSpec with GivenWhenThen {
  "Scalaloggerkata" should {
    "greet" in {
      Given("a Scalaloggerkata")

      val scalaloggerkata = new Scalaloggerkata

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = scalaloggerkata.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
