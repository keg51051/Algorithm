import kotlin.math.*
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        val sqrt = Math.sqrt(n.toDouble())
        if (sqrt == Math.floor(sqrt)) {
            answer = 1
        }
        return answer
    }
}