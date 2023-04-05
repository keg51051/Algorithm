class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var hof = mutableListOf<Int>()
        for (i in score) {
            if (hof.size < k) {
                hof.add(i)
                hof.sortDescending()
            } else {
                hof.add(i)
                hof.sortDescending()
                hof.removeAt(k)
            }
            answer += hof.minOf { it }
        }
        return answer
    }
}