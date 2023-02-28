class Solution {
    fun factorial(n: Int): Int {
        if(n > 1) {
            return n * factorial(n-1)
        } else {
            return 1
        }
    }
    
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 1..11) {
            if (factorial(i) > n) {
                answer = i-1
                break;
            }
        }
        return answer
    }
}