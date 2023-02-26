class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 2
        if (str1.contains(str2)) {
            answer = 1
        }
        return answer
    }
}