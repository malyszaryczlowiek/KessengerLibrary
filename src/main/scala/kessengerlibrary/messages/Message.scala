package com.github.malyszaryczlowiek
package kessengerlibrary.messages

import kessengerlibrary.domain.Domain.{ChatId, ChatName, UserID}

import io.circe.{Decoder, Encoder, HCursor, Json}

import java.time.{ZoneId, ZoneOffset, ZonedDateTime}
import java.util.UUID


case class Message(content: String, authorId: UserID, utcTime: Long, zoneId: ZoneId, chatId: ChatId, chatName: ChatName, groupChat: Boolean)

object Message {

  given encoder: Encoder[Message] = (a: Message) => Json.obj(
    ( "content",   Json.fromString ( a.content           )),
    ( "authorId",  Json.fromString ( a.authorId.toString )),
    ( "utcTime",   Json.fromLong   ( a.utcTime           )),
    ( "zoneId",    Json.fromString ( a.zoneId.toString   )),
    ( "chatId",    Json.fromString ( a.chatId            )),
    ( "chatName",  Json.fromString ( a.chatName          )),
    ( "groupChat", Json.fromBoolean( a.groupChat         ))
  )

  given decoder: Decoder[Message] = (c: HCursor) =>
    for {
      content   <- c.downField("content") .as[String]
      authorId  <- c.downField("authorId").as[String]
      utcTime   <- c.downField("utcTime") .as[Long]
      zoneId    <- c.downField("zoneId")  .as[String]
      chatId    <- c.downField("chatId")  .as[String]
      chatName  <- c.downField("chatName").as[String]
      groupChat <- c.downField("groupChat").as[Boolean]
    } yield {
      Message(
        content,
        UUID.fromString( authorId ),
        utcTime,
        ZoneId.of( zoneId ),
        chatId,
        chatName,
        groupChat
      )
    }

  def nullMessage: Message =
    Message("", UUID.fromString("a092dbb2-2a69-4876-bbe4-8453aa5b6979"), 0L, ZoneOffset.UTC, "", "", false)

}

