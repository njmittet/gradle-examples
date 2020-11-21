package no.njm

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LibraryTest {

    @Test
    fun testLibraryMethod() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.libraryMethod())
    }
}
