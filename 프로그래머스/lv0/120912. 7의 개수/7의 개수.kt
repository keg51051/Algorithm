class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var a = array.joinToString("")
        for (i in a) {
            if (i == '7') {
                answer++
            }
        }
        return answer
    }
}