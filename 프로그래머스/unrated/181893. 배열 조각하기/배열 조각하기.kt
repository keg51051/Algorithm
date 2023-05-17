class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr
        for (i in query.indices) {
            if (i % 2 == 0) {
                answer = answer.take(query[i]+1).toIntArray()
            } else {
                answer = answer.drop(query[i]).toIntArray()
            }
        }
        
        return answer
    }
}