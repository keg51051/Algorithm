class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var most = 0
        for (i in arr) {
            most = arr.size.coerceAtLeast(i.size)
        }
        var answer = Array(most) { IntArray(most) }
        
        for (j in arr.indices) {
            for (k in arr[j].indices) {
                answer[j][k] = arr[j][k]
            }
        }
        
        return answer
    }
}