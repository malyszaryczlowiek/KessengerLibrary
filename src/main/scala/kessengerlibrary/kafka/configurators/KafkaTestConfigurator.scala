package com.github.malyszaryczlowiek
package kessengerlibrary.kafka.configurators

class KafkaTestConfigurator extends KafkaConfigurator:
  override def SERVERS: String = "localhost:9093" // in test environment we have only one kafka broker

  // topics
  override def TOPIC_REPLICATION_FACTOR: Short = 1

