class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = arr
        for (i in queries) {
            var temp = answer[i[0]]
            answer[i[0]] = answer[i[1]]
            answer[i[1]] = temp
        }
        return answer
    }
}