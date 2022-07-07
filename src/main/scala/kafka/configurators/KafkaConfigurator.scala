package com.github.malyszaryczlowiek
package kafka.configurators


// earlier was messages.kafkaConfigurations
trait KafkaConfigurator {

  // separate Parts for Production and Testing Environment
  def SERVERS: String

  // common part  for Production and Testing Environment
  // TODO implement
  def TOPIC_REPLICATION_FACTOR: Short

  def TOPIC_PARTITIONS_NUMBER: Int = 1

}
