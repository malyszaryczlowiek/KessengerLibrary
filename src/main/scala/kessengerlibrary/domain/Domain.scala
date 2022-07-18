package com.github.malyszaryczlowiek
package kessengerlibrary.domain

import java.util.UUID

object Domain {

  type UserID    = UUID
  type Login     = String
  type Password  = String
  type ChatName  = String
  type ChatId    = String
  type WritingId = String
  type JoinId    = String


  def generateChatId(uuid1: UUID, uuid2: UUID): ChatId =
    s"chat--$uuid1--$uuid2"


  def generateWritingId(uuid1: UUID, uuid2: UUID): WritingId =
    s"whoIsWriting--$uuid1--$uuid2"


  def generateJoinId(user: UUID): JoinId =
    s"join--${user.toString}"

}
