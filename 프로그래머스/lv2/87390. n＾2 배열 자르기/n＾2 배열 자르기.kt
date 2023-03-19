class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer = IntArray((right-left).toInt()+1)
        var index = left
        for (i in answer.indices) {
            val r = (index / n.toLong()).toInt()
            val c = (index % n.toLong()).toInt()
            answer[i] = r.coerceAtLeast(c) + 1
            index++
        }
        return answer
    }
}