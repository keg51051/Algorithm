class Solution {
    fun solution(angle: Int): Int {
        var answer = 0
        when (angle) {
            in 0 until 90 -> answer = 1
            90 -> answer = 2
            in 90 until 180 -> answer = 3
            else -> answer = 4
        }
        return answer
    }
}