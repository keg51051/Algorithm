class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var currentPrice: Long = 0
        for(i in 1..count) {
            currentPrice += price*i
        }
        if (currentPrice > money) {
            answer =  currentPrice - money.toLong()
        } else {
            answer = 0
        }
        
        return answer
    }
}