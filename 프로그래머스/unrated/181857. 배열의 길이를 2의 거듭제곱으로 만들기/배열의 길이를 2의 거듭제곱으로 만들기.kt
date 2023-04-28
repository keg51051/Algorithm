class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr
        var n = 1
        while (n < arr.size) {
            n *= 2
        }
        repeat(n - arr.size) {
            answer += 0
        }
        return answer
    }
}