class Solution {
    fun solution(n: Int) = Array(n) { i -> IntArray(n) { j -> if (i == j) 1 else 0 }}
}