class Solution {
    fun solution(my_string: String) = (0 until my_string.length).map { i -> my_string.substring(i) }.sorted()
}