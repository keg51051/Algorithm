class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var x = hp
        answer += (x / 5)
        x %= 5
        answer += (x / 3)
        x %= 3
        answer += (x / 1)
        return answer
    }
}