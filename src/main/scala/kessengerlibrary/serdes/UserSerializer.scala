package com.github.malyszaryczlowiek
package kessengerlibrary.serdes

import kessengerlibrary.domain.User
import io.circe.{Encoder, Json}
import io.circe.syntax.*
import org.apache.kafka.common.serialization.Serializer


class UserSerializer extends Serializer[User] {

  given encoder: Encoder[User] = (a: User) => Json.obj(
    ("userId", Json.fromString(a.userId.toString)),
    ("login",  Json.fromString(a.login))
  )

  override def serialize(topic: String, data: User): Array[Byte] =
    data.asJson.noSpaces.getBytes
}
