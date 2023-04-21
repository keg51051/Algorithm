class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        for (i in number) {
            answer += Character.getNumericValue(i)
        }
        return answer % 9
    }
}