class Solution {
    fun solution(s: String) = 
    s.toLowerCase().split(" ").map {
        it.capitalize()
    }.joinToString(" ")
}