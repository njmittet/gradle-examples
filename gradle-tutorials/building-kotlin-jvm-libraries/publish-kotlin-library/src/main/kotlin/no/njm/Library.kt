package no.njm

/**
 * Defines a programming language with a name and hotness score.
 *
 * @property name The name of the language.
 * @property hotness A score from 1 to 10 of user enthusiasm, where 10 is maximum.
 */
data class Language(val name: String, val hotness: Int)

class MyLibrary {

    /**
     * @return The hotness score of the Kotlin {@code Language}.
     */
    fun kotlinLanguage() = Language("Kotlin", 10)
}
