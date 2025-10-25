// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) {
    println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean) {
    println("$first || $second == ${first || second}")
}

fun showTruthTable() {
    val values = listOf(true, false)

    println("AND Truth Table:")
    for (first in values) {
        for (second in values) {
            showAnd(first, second)
        }
    }

    println("\nOR Truth Table:")
    for (first in values) {
        for (second in values) {
            showOr(first, second)
        }
    }
}

fun main() {
  showTruthTable()
}