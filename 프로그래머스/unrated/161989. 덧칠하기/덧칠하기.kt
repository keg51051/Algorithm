class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var paint = section[0] - 1
        section.forEach {
            if (paint < it) {
                paint = it + m - 1
                answer++
            }
        }
        return answer
    }
}