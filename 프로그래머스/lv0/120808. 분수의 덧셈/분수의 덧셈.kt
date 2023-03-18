class Solution {
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
    
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var numer3 = numer1 * denom2 + numer2 * denom1
        var denom3 = denom1 * denom2
        val gcd = gcd(numer3, denom3)
        
        answer += numer3 / gcd
        answer += denom3 / gcd
        return answer
    }
}