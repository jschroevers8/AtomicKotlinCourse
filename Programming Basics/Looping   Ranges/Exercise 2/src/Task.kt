// LoopingAndRanges/Task2.kt
package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
    var sum = 0L

    for (i in 1..n) {
        var factorial = 1L
        for (j in 1..i) {
            factorial *= j.toLong()
        }
        sum += factorial
    }

    return sum
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}