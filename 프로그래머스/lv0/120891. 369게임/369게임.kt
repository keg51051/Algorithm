class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        var str = order.toString()
        for (i in str) {
            if (i == '3' || i == '6' || i == '9') {
                answer++
            }
        }
        return answer
    }
}