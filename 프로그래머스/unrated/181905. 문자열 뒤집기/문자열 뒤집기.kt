class Solution {
    fun solution(my_string: String, s: Int, e: Int) =
    my_string.substring(0, s) + my_string.subSequence(s, e + 1).reversed() + my_string.substring(e+1)
}