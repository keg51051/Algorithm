class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
        for (i in myString.length downTo pat.length) {
            if (myString.substring(i-pat.length, i) == pat) {
                answer = myString.substring(0, i)
                break
            }
        }
        return answer
    }
}