// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
    var count = 0
    for (ch in s) {
        if (ch != ' ') {
            count++
            if (count % 5 == 0) {
                println(ch)
            }
        }
    }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/