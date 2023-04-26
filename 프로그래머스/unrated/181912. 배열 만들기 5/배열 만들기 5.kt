class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in intStrs) {
            if (i.substring(s, s+l).toInt() > k) {
                answer += i.substring(s, s+l).toInt()
            }
        }
        return answer
    }
}