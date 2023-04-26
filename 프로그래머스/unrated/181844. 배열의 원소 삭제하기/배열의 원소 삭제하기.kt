class Solution {
    fun solution(arr: IntArray, delete_list: IntArray) = arr.filter { !delete_list.contains(it) }
}