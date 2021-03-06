package com.github.malyszaryczlowiek
package kessengerlibrary.serdes

import kessengerlibrary.domain.User
import org.apache.kafka.common.serialization.{Deserializer, Serde, Serializer}

class UserSerde extends Serde[User] {

  override def serializer(): Serializer[User] = new UserSerializer

  override def deserializer(): Deserializer[User] = new UserDeserializer
}




