class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        return ((a-1) xor (b-1)).toString(2).length
    }
}