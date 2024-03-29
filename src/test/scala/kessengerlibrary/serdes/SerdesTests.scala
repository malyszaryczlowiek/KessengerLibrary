package com.github.malyszaryczlowiek
package kessengerlibrary.serdes


import kessengerlibrary.domain.User
import kessengerlibrary.serdes.*
import kessengerlibrary.messages.Message

import java.time.ZoneId
import java.util.UUID



class SerdesTests extends munit.FunSuite {

  test("Testing User's serdes") {

    val user = User(UUID.randomUUID(), "AnyLogin")

    val ser = new UserSerializer
    val serialized = ser.serialize("", user)

    val deser = new UserDeserializer
    val deserialied = deser.deserialize("", serialized)

    assert(deserialied == user)

  }

  test("Message serdes test") {

    val mess = Message("Hello moto", UUID.randomUUID(),"User", 0L, ZoneId.of("Europe/Warsaw"), "chatId" , "chatName", false)

    val ser  = new MessageSerializer
    val bytes = ser.serialize("", mess)

    val deser = new MessageDeserializer
    val mess2 = deser.deserialize("", bytes)

    assert(mess == mess2)

  }

}