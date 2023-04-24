class Solution {
    fun solution(num_list: IntArray) = num_list.sorted().takeLast(num_list.size - 5)
}