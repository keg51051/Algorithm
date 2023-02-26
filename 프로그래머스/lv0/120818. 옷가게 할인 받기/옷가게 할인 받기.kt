class Solution {
    fun solution(price: Int): Int {
        var answer: Int = price
        when {
            price >= 500000 -> answer = (price * 0.8).toInt()
            price >= 300000 -> answer = (price * 0.9).toInt()
            price >= 100000 -> answer = (price * 0.95).toInt()
        }
        return answer
    }
}