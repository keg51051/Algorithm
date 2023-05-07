class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var s = 0
        var e = 0
        
        for (i in arr.indices) {
            if (arr[i] == 2) {
                s = i
                break
            }
        }
        
        for (j in arr.size-1 downTo 0) {
            if (arr[j] == 2) {
                e = j
                break
            }
        }
        
        if (s == 0 && e == 0) {
            answer += -1
        } else {
            for (k in s..e) {
                answer += arr[k]
            }
        }
        
        return answer
    }
}