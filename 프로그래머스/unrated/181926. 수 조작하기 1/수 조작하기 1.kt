class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        for (i in control) {
            when (i) {
                'w' -> answer += 1
                's'-> answer -= 1
                'd' -> answer += 10
                else -> answer -= 10
            }
        }
        return answer
    }
}