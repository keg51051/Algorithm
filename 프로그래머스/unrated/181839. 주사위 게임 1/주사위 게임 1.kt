class Solution {
    fun solution(a: Int, b: Int): Int {
        return when {
            a % 2 != 0 && b % 2 != 0 -> a*a + b*b
            a % 2 == 0 && b % 2 == 0 -> Math.abs(a - b)
            else -> 2 * (a + b)
        }
    }
}