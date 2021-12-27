package pedrocapriles.scala_logger_kata

import org.scalatest._
import org.scalatest.Matchers._

final class LoggerTest extends WordSpec with GivenWhenThen {
  "Logger" should {
    "print" in {
      Given("a log with the name of the project and some message log")

      val PROJECT_NAME = "Kata Project"
      val expectedLog = print("Kata Project: This is a test log")

      When("we ask him to greet someone")

      Logger.loggerInitialization(PROJECT_NAME)
      val log = Logger.logger("This is a test log")

      Then("It should return a message  Kata Project: This is a test log")

      log shouldBe expectedLog
    }
  }
}
