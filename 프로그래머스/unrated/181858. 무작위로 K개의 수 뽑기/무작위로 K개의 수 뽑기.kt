class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr) {
            if (!answer.contains(i)) {
                answer += i
            }
        }
        
        if (answer.size > k) {
            answer = answer.slice(0 until k).toIntArray()
        } else {
            repeat(k - answer.size) {
                answer += -1
            }
        }
        return answer
    }
}