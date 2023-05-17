import kotlin.math.abs

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        if (abs(dots[1][1] - dots[0][1]).toDouble() / abs(dots[1][0] - dots[0][0]).toDouble() == abs(dots[3][1] - dots[2][1]).toDouble() / abs(dots[3][0] - dots[2][0]).toDouble() || abs(dots[2][1] - dots[0][1]).toDouble() / abs(dots[2][0] - dots[0][0]).toDouble() == abs(dots[3][1] - dots[1][1]).toDouble() / abs(dots[3][0] - dots[1][0]).toDouble() || abs(dots[3][1] - dots[0][1]).toDouble() / abs(dots[3][0] - dots[0][0]).toDouble() == abs(dots[2][1] - dots[1][1]).toDouble() / abs(dots[2][0] - dots[1][0]).toDouble()) {
            answer = 1
        }
        return answer
    }
}