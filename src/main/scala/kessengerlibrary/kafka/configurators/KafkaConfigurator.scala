package com.github.malyszaryczlowiek
package kessengerlibrary.kafka.configurators


// earlier was messages.kafkaConfigurations
trait KafkaConfigurator {

  // separate Parts for Production and Testing Environment
  def SERVERS: String
  def CHAT_TOPIC_REPLICATION_FACTOR: Short
  def JOINING_TOPIC_REPLICATION_FACTOR: Short

  // common part for Production and Testing Environment
  def CHAT_TOPIC_PARTITIONS_NUMBER:    Int = 3
  def JOINING_TOPIC_PARTITIONS_NUMBER: Int = 1

}

object KafkaConfigurator:

  var conf: KafkaConfigurator = _

  def setConfigurator(conf: KafkaConfigurator): Unit =
    this.conf = conf

  def configurator: KafkaConfigurator = conf
