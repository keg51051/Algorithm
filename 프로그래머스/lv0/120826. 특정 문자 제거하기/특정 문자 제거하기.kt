class Solution {
    fun solution(my_string: String, letter: String): String {
        var answer: String = ""
        answer = my_string.filterNot { it == letter.first() }
        return answer
    }
}