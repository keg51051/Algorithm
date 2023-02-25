class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var sorted = numbers.sorted()
        answer = sorted[numbers.size-1] * sorted[numbers.size-2]
        return answer
    }
}