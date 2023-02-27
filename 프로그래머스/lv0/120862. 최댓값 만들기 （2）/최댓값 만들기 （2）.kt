class Solution {
    fun solution(numbers: IntArray): Int {
        if (numbers.sorted()[numbers.size-1] * numbers.sorted()[numbers.size-2] >
                numbers.sorted()[0] * numbers.sorted()[1]) {
            return numbers.sorted()[numbers.size-1] * numbers.sorted()[numbers.size-2]
        } else {
            return numbers.sorted()[0] * numbers.sorted()[1]
        }
    }
}