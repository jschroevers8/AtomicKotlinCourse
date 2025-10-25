// Summary1/Task1.kt
package summaryIExercise1

fun main() {
    var x = 1       // mutable variable
    val y = x       // copy the current value of x
    val z = y       // copy the value of y

    x = 2           // change x

    // Display the values
    println(x)      // 2
    println(y)      // 1
    println(z)      // 1
}