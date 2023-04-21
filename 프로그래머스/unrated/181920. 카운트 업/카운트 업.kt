class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in start..end) {
            answer += i
        }
        return answer
    }
}