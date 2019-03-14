package no.njm


import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryTest {

    @Test
    fun testMyLanguage() {
        assertEquals("Kotlin", MyLibrary().kotlinLanguage().name)
        assertEquals(10, MyLibrary().kotlinLanguage().hotness)
    }
}