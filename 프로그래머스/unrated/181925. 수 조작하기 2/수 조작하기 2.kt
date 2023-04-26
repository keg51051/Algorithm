class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var arr = intArrayOf()
        for (i in 1 until numLog.size) {
            arr += numLog[i] - numLog[i-1]
        }
        
        for (i in arr) {
            when (i) {
                1 -> answer += 'w'
                -1 -> answer += 's'
                10 -> answer += 'd'
                else -> answer += 'a'
            }
        }

        return answer
    }
}