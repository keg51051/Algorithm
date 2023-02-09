class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size){IntArray(arr2[0].size){0}}
        for (i in 0 until arr1.size) {
            for (j in 0 until arr2[0].size) {
                for (k in 0 until arr1[0].size) {
                    answer[i][j] += arr1[i][k] * arr2[k][j]
                }
            }
        }
        return answer
    }
}