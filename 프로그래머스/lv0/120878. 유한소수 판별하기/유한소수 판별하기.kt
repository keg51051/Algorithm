class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 2
        var fraction = (a.toDouble() / b.toDouble())
        if (fraction.toString().length < 16) {
            answer = 1
        }
        return answer
    }
}