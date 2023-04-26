class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        for (i in 0 until my_string.length step m) {
            answer += my_string[i + c - 1]
        }
        return answer
    }
}