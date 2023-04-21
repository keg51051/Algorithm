class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        for (i in num_str.indices) {
            answer += Character.getNumericValue(num_str[i])
        }
        return answer
    }
}