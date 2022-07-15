package com.github.malyszaryczlowiek
package kessengerlibrary.serdes

import kessengerlibrary.domain.User
import io.circe.Decoder.Result
import io.circe.{Decoder, HCursor}
import io.circe.parser.decode

import org.apache.kafka.common.serialization.Deserializer

import java.util.UUID

class UserDeserializer extends Deserializer[User] {

  given decoder: Decoder[User] = (c: HCursor) =>
    for {
      userId <- c.downField("userId").as[String]
      login  <- c.downField("login").as[String]
    } yield {
      User(UUID.fromString(userId), login)
    }


  override def deserialize(topic: String, data: Array[Byte]): User =
    decode[User](new String(data)) match {
      case Left(_)            => User.nullUser
      case Right(user: User)  => user
    }

}
