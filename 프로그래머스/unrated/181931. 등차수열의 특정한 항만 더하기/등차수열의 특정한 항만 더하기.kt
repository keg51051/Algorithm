class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray) = included.mapIndexed { i, v -> if (v) a + d * i else 0 }.sum()
}