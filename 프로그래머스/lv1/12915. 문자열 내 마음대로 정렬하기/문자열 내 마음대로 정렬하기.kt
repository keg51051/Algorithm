class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = strings
        answer.sort()
        answer.sortBy {it[n]}
        return answer
    }
}