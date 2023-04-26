class Solution {
    fun solution(myString: String) = myString.split("x").filterNot { it.isEmpty() }.sorted()
}