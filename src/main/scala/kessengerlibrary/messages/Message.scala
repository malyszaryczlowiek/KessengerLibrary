package com.github.malyszaryczlowiek
package kessengerlibrary.messages

import kessengerlibrary.domain.Domain.{ChatId, UserID}

import java.time.ZoneId


case class Message(content: String, author: UserID, utcTime: Long, zoneId: ZoneId, chatId: ChatId)


