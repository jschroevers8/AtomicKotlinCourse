// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
    for (i in 1..n) {
        val spaces = n - i                // number of leading spaces
        val hashes = 2 * i - 1            // number of # in the row
        println(" ".repeat(spaces) + "#".repeat(hashes))
    }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/