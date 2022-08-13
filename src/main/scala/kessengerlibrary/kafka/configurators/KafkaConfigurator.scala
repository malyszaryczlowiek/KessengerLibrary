package com.github.malyszaryczlowiek
package kessengerlibrary.kafka.configurators


// earlier was messages.kafkaConfigurations
trait KafkaConfigurator {

  // separate Parts for Production and Testing Environment
  def SERVERS: String
  def TOPIC_REPLICATION_FACTOR: Short

  // common part  for Production and Testing Environment
  // TODO implement


  def TOPIC_PARTITIONS_NUMBER: Int = 3

}

object KafkaConfigurator:

  var conf: KafkaConfigurator = _

  def setConfigurator(conf: KafkaConfigurator): Unit =
    this.conf = conf

  def configurator: KafkaConfigurator = conf
