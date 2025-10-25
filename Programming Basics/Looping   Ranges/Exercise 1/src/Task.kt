// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
    var result = 1L  // Start with Long to avoid overflow
    for (i in 1..n) {
        result *= i.toLong()  // Convert i to Long before multiplying
    }
    return result
}

fun main() {
  println(factorial(10))  // 3628800
}