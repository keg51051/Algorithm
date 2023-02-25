class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var chars = CharArray(my_string.length)
        for (i in 0 until my_string.length) {
            chars[i] = my_string[my_string.length-i-1]
        }
        answer = String(chars)
        return answer
    }
}