package com.github.malyszaryczlowiek
package kafka.errors

// earlier messages.kafkaErrorUtils
case class KafkaError(errorStatus: KafkaErrorStatus, description: KafkaErrorMessage)
