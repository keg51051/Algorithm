class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        citations.sort()
        for (i in citations.indices) {
            var smaller = citations[i].coerceAtMost(citations.size - i)
            answer = answer.coerceAtLeast(smaller)
        }
        return answer
    }
}