// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
    var worker = number
    var result = 0

    while (worker > 0) {
        val digit = worker % 10       // get right-most digit
        result = result * 10 + digit  // append it to result
        worker /= 10                  // remove right-most digit
    }

    return result
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}