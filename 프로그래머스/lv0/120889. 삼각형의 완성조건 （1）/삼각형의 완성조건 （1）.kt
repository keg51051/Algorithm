class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 1
        if (sides.sorted()[2] >= sides.sorted()[0] + sides.sorted()[1]) {
            answer = 2
        }
        return answer
    }
}