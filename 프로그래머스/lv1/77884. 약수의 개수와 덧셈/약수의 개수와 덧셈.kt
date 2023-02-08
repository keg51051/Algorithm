import kotlin.math.*
class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        for (i in left..right) {
            if (sqrt(i.toDouble()) % 1 == 0.0) {
                answer -= i
            } else {
                answer += i
            }
        }
        
        return answer
    }
}