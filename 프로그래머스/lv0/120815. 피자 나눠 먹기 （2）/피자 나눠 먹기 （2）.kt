class Solution {
    fun gcd(a: Int, b: Int): Int {
        if (b != 0) {
            return gcd(b, a%b)
        } else return a
    }
    fun solution(n: Int) = n / gcd(6, n)
}