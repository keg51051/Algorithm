class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        answer = phone_number.replaceRange(0, phone_number.length-4, "*".repeat(phone_number.length-4))
        return answer
    }
}