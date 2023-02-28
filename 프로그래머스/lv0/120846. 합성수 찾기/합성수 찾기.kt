class Solution {
    fun composite(n: Int): Int {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) count++
        }
        return count
    }

    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1..n) {
            if (composite(i) >= 3) {
                answer++
            }
        }
        return answer
    }
}