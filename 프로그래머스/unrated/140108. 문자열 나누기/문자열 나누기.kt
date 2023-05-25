class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var same = 0
        var diff = 0
        var char = ' '
        
        for (c in s) {
            if (same == diff) {
                answer++
                char = c
            }
            if (c == char) {
                same++
            } else {
                diff++
            }
        }
        return answer
    }
}