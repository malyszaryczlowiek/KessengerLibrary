package com.github.malyszaryczlowiek
package kessengerlibrary.serdes

import kessengerlibrary.domain.User
import io.circe.syntax.*
import org.apache.kafka.common.serialization.Serializer


class UserSerializer extends Serializer[User] {

  override def serialize(topic: String, data: User): Array[Byte] =
    data.asJson.noSpaces.getBytes
  
}
