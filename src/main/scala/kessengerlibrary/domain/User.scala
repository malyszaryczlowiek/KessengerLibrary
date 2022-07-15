package com.github.malyszaryczlowiek
package kessengerlibrary.domain

import kessengerlibrary.domain.Domain.{Login, UserID}

import java.util.UUID

case class User(userId: UserID, login: Login, salt: Option[String] = None, joiningOffset: Long = 0L)

object User {
  

  /**
   * nullUser has no login and is used to signify
   * deserialization error, such user must be ignored
   * in any processing
   *
   * @return
   */
  def nullUser: User = User(UUID.fromString("a092dbb2-2a69-4876-bbe4-8453aa5b6979"), "")

}
