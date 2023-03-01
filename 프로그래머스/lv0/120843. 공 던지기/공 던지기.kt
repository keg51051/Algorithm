class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        answer = numbers[2 * (k-1) % numbers.size]
        return answer
    }
}