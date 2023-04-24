class Solution {
    fun solution(myString: String) = myString.map {
        when {
            it == 'a' -> 'A'
            it.isUpperCase() && it != 'A' -> it.toLowerCase()
            else -> it
        }
    }.joinToString("")
}