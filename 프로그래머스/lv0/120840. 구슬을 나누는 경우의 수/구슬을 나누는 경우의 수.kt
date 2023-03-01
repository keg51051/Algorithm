class Solution {
    fun comb(n: Int, m: Int): Int {
        return if (m == 0 || n == m) {
            1
        } else {
            comb(n-1, m-1) + comb(n-1, m)
        }
    }
    fun solution(balls: Int, share: Int) = comb(balls, share)
}