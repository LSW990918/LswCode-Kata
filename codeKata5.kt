package codeKata

fun main() {
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    println("${solution(num1, num2)}")
}
fun solution(num1: Int, num2: Int)= if(num1==num2) 1 else -1


