class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = arr
        for (i in queries) {
            for (j in i[0]..i[1]) {
                if (j % i[2] == 0) {
                   answer[j]++ 
                }
            }
        }
        return answer
    }
}