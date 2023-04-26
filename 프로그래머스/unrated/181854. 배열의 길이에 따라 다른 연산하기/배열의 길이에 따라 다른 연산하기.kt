class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer = arr
        if (arr.size % 2 == 0) {
            for (i in 1 until arr.size step 2) {
                answer[i] += n
            }
        } else {
            for (i in 0 until arr.size step 2) {
                answer[i] += n
            }
        }
        return answer
    }
}