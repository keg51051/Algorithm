class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer = IntArray(num)
        var first = (total / num) - num / 2
        if (num % 2 == 1) {
            for (i in answer.indices) {
                answer[i] = first
                first++
            }
        } else {
            for (i in answer.indices) {
                answer[i] = first + 1
                first++
            }
        }
        
        return answer
    }
}