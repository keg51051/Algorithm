class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer = Array(num_list.size / n) { IntArray(n) }
        var count = 0
        for (i in 0 until answer.size) {
            for (j in 0 until answer[i].size) {
                answer[i][j] = num_list[count]
                count++
            }
        }
        return answer
    }
}