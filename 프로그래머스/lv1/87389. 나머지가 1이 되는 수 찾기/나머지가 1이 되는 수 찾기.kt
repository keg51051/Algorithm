class Solution {
    fun solution(n: Int): Int {
        var answer = 1
        
        while (n % answer != 1) {
            answer++
        }
        
        return answer
    }
}