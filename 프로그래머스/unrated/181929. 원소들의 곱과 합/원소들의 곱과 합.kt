class Solution {
    fun solution(num_list: IntArray) = 
    (num_list.reduce { x, y -> x * y } < num_list.sum() * num_list.sum()).compareTo(false)
}