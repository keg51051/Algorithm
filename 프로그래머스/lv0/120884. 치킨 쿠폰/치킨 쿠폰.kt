class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var chick = chicken
        while (chick >= 10) {
            answer += chick / 10
            chick = chick / 10 + chick % 10
        }
        return answer
    }
}