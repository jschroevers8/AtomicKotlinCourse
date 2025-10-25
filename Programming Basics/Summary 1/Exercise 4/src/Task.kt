// Summary1/Task4.kt
package summaryIExercise4

fun testLong() {
    val maxLong = Long.MAX_VALUE
    println(maxLong + 1)      // overflow: wraps around to Long.MIN_VALUE
}

fun testDouble() {
    val maxDouble = Double.MAX_VALUE
    println(maxDouble + 1)    // adding 1 does nothing due to precision limits
}

fun testDouble2() {
    val maxDouble = Double.MAX_VALUE
    println(maxDouble == maxDouble + 1) // true, adding 1 doesn't change it
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
/* Output:
-9223372036854775808
1.7976931348623157E308
true
 */