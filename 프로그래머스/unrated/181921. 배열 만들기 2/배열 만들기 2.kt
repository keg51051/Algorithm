class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val exception = arrayOf('1','2','3','4','6','7','8','9')
        for (i in l..r) {
            val n = i.toString().map { it }
            if (n.any { it in exception }) {
                continue
            } else {
                answer += i
            }
        }
        if (answer.isEmpty()) {
            answer += -1
        }
        return answer
    }
}