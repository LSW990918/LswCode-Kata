package codeKata

fun main() {
    var num1 = readln().toInt()


    println("${solution(num1)}")
}
fun solution(num1: Int){ if (num1 <90) 1 else if (num1 == 90) 2 else if (num1==180) 4 else 3
}
