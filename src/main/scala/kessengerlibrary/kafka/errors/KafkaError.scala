package com.github.malyszaryczlowiek
package kessengerlibrary.kafka.errors

case class KafkaError(errorStatus: KafkaErrorStatus, description: KafkaErrorMessage)
