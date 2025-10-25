// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(text: String) {
    var index = 0
    while (index < text.length) {
        println(text[index])
        index++
    }
}

fun main() {
//  displayContent("abc")
}
/* Expected output:
a
b
c
*/