class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var arr = Array(score.size/m) { IntArray(m) }
        score.sortDescending()
        var index = 0
        for (i in arr.indices) {
            for (j in arr[i].indices) {
                arr[i][j] += score[index]
                index++
            }
            answer += arr[i].minOf { it } * m
        }
        
        return answer
    }
}