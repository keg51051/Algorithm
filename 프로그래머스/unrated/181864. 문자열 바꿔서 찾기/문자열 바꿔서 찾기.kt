class Solution {
    fun solution(myString: String, pat: String) = myString.map {
        if (it == 'A') 'B'
        else 'A'
    }.joinToString("")
        .contains(pat)
        .compareTo(false)
}