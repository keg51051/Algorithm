class Solution {
    fun solution(myString: String) = myString.map { if (it !in 'l'..'z') 'l' else it }.joinToString("")
}