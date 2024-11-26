package shared

import munit.{FunSuite, Location}

def mySharedTest(suite: FunSuite, dbType: String)(using Location): Unit =
  import suite.*

  test("this works"):
    assertEquals(1, 1)

  test("this fails"):
    assertEquals("abc", "abd")
