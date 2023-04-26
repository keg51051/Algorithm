class Solution {
    fun solution(my_string: String, indices: IntArray) = my_string.filterIndexed { i, s -> !indices.contains(i) }
}