class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        when (ineq + eq) {
            "<=" -> answer = (n<=m).compareTo(false)
            ">=" -> answer = (n>=m).compareTo(false)
            "<!" -> answer = (n<m).compareTo(false)
            else -> answer = (n>m).compareTo(false)
        }
        return answer
    }
}