import kotlin.math.*
class Solution {
    fun solution(n: Long): Long {
        val a = sqrt(n.toDouble())
        
        return if (n.toDouble() % a == 0.0) {
            (a+1).pow(2.0).toLong()
        } else {
            -1L
        }
    }
}