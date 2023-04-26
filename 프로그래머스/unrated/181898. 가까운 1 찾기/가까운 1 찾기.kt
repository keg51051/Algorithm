class Solution {
    fun solution(arr: IntArray, idx: Int) = arr.withIndex().find { it.index >= idx && it.value == 1 }?.index ?: -1
}