class Solution {
    fun solution(arr: IntArray): Double {
        var sum = 0
        for (i in arr.indices) {
            sum += arr[i]
        }
        
        return sum / arr.size.toDouble()
    }
}