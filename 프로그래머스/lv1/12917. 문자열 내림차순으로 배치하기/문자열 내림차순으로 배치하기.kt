class Solution {
    fun solution(s: String): String {
        val arr = s.toCharArray()
        return arr.sortedDescending().joinToString("")
    }
}