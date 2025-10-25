// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
    val number = int + double
    val stringChar = string + character
    val boolString = string + boolean

    val s1 = string + int
    val s2 = string + double
    val s3 = string + boolean
    val s4 = string + boolean

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
//  val boolInt = int + boolean
//    val boolDouble = double + boolean
//    val charBool = character + boolean
}