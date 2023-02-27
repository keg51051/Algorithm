class Solution {
    fun solution(array: IntArray): IntArray {
        var answer = IntArray(2)
        val max = array.maxOrNull() ?: 0
        answer[0] = max
        answer[1] = array.indexOf(max)
        return answer
    }
}