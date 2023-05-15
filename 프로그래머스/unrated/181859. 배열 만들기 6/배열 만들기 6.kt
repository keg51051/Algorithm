class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var i = 0
        while (i < arr.size) {
            if (answer.isEmpty()) {
                answer += arr[i]
                i++
            } else if (answer.last() == arr[i]) {
                answer = answer.dropLast(1).toIntArray()
                i++
            } else {
                answer += arr[i]
                i++
            }
        }
        if (answer.isEmpty()) return intArrayOf(-1) else return answer
    }
}