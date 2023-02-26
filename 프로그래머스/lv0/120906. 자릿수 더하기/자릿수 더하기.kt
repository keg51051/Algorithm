class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var x = n
        while (x > 0) {
            var y = x % 10
            answer += y
            x /= 10
        }
        
        return answer
    }
}