// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false                     // Must not be empty
    if (!s[0].isLetter() && s[0] != '_') return false // First character must be a letter or underscore

    for (ch in s) {
        if (!ch.isLetterOrDigit() && ch != '_') {
            return false
        }
    }

    return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}