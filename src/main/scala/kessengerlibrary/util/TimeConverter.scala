package com.github.malyszaryczlowiek
package kessengerlibrary.util

import java.time.*

/**
 *
 * // https://docs.oracle.com/javase/tutorial/datetime/iso/timezones.html
 */
object TimeConverter:

  def fromMilliSecondsToLocal(milliSeconds: Long): LocalDateTime =
    LocalDateTime.ofInstant(Instant.ofEpochSecond(milliSeconds / 1000L), ZoneId.systemDefault())

  /**
   *
   * @param local
   * @return
   */
  def fromLocalToEpochTime(local: LocalDateTime): Long =
    ZonedDateTime.ofLocal(local, ZoneId.systemDefault(), ZoneOffset.UTC).toEpochSecond * 1000L
