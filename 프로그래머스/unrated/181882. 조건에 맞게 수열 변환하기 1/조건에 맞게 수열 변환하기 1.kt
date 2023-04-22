class Solution {
    fun solution(arr: IntArray) = arr.map {
        when {
            it >= 50 && it % 2 == 0 -> it / 2
            it < 50 && it % 2 != 0 -> it * 2
            else -> it
        }
    }
}