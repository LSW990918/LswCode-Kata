package codeKata

fun main() {
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    println("${solution(num1, num2)}")
}

class Solution {
    fun solution(num1: Int, num2: Int)= num1/num2
}