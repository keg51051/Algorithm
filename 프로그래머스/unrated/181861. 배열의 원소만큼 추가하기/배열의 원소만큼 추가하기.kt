class Solution {
    fun solution(arr: IntArray) = arr.flatMap { i -> List(i) { i } }
}