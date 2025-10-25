// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int) = a + b                // Returns Int

fun g(s1: String, s2: String) = s1 + s2     // Returns String

fun h() = println("h()")                     // Returns Unit

fun main() {
    val resultF: Int = f(3, 4)
    val resultG: String = g("Hello, ", "World!")
    val resultH: Unit = h()

    // Display the types of the function results
    println(resultF::class.simpleName)  // Int
    println(resultG::class.simpleName)  // String
    println(resultH::class.simpleName)  // Unit
 }