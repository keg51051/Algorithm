class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcd(n, m), lcm(n, m))
    }
    
    fun lcm(n: Int, m: Int): Int {
        return n * m / gcd(n,m)
    }
    
    fun gcd(n: Int, m: Int): Int {
        if (m == 0) {
            return n
        } else {
            return gcd(m, n%m)
        }
    }
}