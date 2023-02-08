class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) {
            return intArrayOf(-1)
        } else {
            return arr.filter { it != arr.min() }.toIntArray()
        }
    }
}