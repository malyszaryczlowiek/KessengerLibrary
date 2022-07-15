package com.github.malyszaryczlowiek
package kessengerlibrary.serdes


import kessengerlibrary.domain.User
import kessengerlibrary.serdes.*

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

}