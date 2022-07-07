package com.github.malyszaryczlowiek
package kafka.errors

enum KafkaErrorStatus(errorType: String):
  override def toString: String = errorType

  case Warning     extends KafkaErrorStatus("Warning! ")
  case Error       extends KafkaErrorStatus("Error! ")
  case FatalError  extends KafkaErrorStatus("Fatal Error! ")

