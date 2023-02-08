class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = x.toString().chars().map { it - '0'.toInt() }.sum()
        if (x % sum == 0) {
            answer = true
        } else {
            answer = false
        }
        
        return answer
    }
}