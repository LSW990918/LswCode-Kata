package codeKata

fun main() {
    var num1 = readln().toDouble()
    var num2 = readln().toDouble()

    var sol = Solution(num1, num2)
    sol.solution()
}
class Solution(num1: Double, num2: Double){
    var num1 = num1
    var num2 = num2

    fun solution(): Int {
        var answer = (num1/num2*1000).toInt()
        return answer
    }

}