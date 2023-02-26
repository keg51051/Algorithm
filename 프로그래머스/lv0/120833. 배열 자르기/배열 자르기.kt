class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer = ArrayList<Int>()
        for (i in num1..num2) {
            answer.add(numbers[i])
        }
        return answer.toIntArray()
    }
}