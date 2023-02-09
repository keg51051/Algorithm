class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var min: Long = 0
        var max: Long = n.toLong() * 1000000000
        
        while (min < max) {
            var mid = (min + max) / 2
            var sum: Long = 0
            times.forEach { sum += mid/it }
            
            if (sum >= n) max = mid
            else min = mid+1
        }
        
        return min
    }
}