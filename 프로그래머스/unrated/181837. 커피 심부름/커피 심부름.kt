class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        for (i in order) {
            when {
                i.contains("cafelatte") -> answer += 5000
                else -> answer += 4500
            }
        }
        return answer
    }
}