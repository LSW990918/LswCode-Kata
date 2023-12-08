package codeKata

fun solution(num: Int): String {
    var num = 10
    var answer = ""
    if (num%2 == 0) {
        answer = "Even"
    } else {
        answer = "Odd"
    }
    return answer
}
}