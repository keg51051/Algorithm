class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        if (before.toCharArray().sorted() == after.toCharArray().sorted()) {
            answer = 1
        }
        return answer
    }
}