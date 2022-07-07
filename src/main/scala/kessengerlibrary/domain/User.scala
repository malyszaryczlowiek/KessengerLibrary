package com.github.malyszaryczlowiek
package kessengerlibrary.domain

import kessengerlibrary.domain.Domain.{Login, UserID}

import java.util.UUID

case class User(userId: UserID, login: Login, salt: Option[String] = None, joiningOffset: Long = 0L)
