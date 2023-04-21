class Solution {
    fun solution(num_list: IntArray) = 
    if (num_list.size < 11) num_list.reduce { x, y -> x * y } else num_list.sum()
}