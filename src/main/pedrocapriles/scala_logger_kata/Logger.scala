package pedrocapriles.scala_logger_kata

object Logger {
  var projectName: String = ""

def loggerInitialization(name: String) {
  projectName = name
}

def logger(log: String): Unit = print(projectName+": "+log)

}
