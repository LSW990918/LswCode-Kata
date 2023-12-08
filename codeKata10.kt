package codeKata

fun main() {
    var numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    var answer:Double = 0.0

    for ( n in numbers) {
        answer += n
    }
    println(answer/numbers.size)
}