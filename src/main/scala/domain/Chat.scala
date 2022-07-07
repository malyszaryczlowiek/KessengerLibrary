package com.github.malyszaryczlowiek
package domain

import com.github.malyszaryczlowiek.domain.Domain.{ChatId, ChatName}

import java.time.LocalDateTime


/**
 * tutaj zmienić pakiet z messages na domain
 * @param chatId
 * @param chatName
 * @param groupChat
 * @param offset
 * @param timeOfLastMessage
 */
case class Chat(chatId: ChatId, chatName: ChatName, groupChat: Boolean, offset: Long, timeOfLastMessage: LocalDateTime)
