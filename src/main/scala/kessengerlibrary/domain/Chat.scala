package com.github.malyszaryczlowiek
package kessengerlibrary.domain

import kessengerlibrary.domain.Domain.{ChatId, ChatName}

import java.time.LocalDateTime


/**
 * @param chatId
 * @param chatName
 * @param groupChat
 * @param offset
 * @param timeOfLastMessage
 */
case class Chat(chatId: ChatId, chatName: ChatName, groupChat: Boolean, offset: Long, timeOfLastMessage: LocalDateTime)

object Chat:

  given reverseChatOrdering: Ordering[Chat] with
    override def compare(x: Chat, y: Chat): Int =
      if x.timeOfLastMessage.isBefore(y.timeOfLastMessage) then 1
      else if x.timeOfLastMessage.isAfter(y.timeOfLastMessage) then -1
      else 0