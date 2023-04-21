class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer: String = ""
        for (i in my_string) {
            if (i == alp.first()) {
                answer += i.uppercaseChar()
            } else {
                answer += i
            }
        }
        return answer
    }
}