// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
    val maxNumber = rows * columns - 1
    val width = maxNumber.toString().length + 1 // +1 space before each number

    var number = 0
    for (i in 0 until rows) {
        val rowNumbers = mutableListOf<Int>()
        for (j in 0 until columns) {
            rowNumbers.add(number++)
        }
        if (i % 2 == 1) { // reverse every odd row
            rowNumbers.reverse()
        }
        for (num in rowNumbers) {
            print("%${width}d".format(num))
        }
        println()
    }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/