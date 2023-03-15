class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var map = mutableMapOf<Int, Int>()
        var count = 0
        var total = k
        for (i in tangerine) {
            count = 1
            if (map.contains(i)) {
                count = map[i]!!
                map.put(i, ++count)
            } else {
                map.put(i, count)
            }
        }
        map = map.toList().sortedByDescending { it.second }.toMap().toMutableMap()
        count = 0
        for (i in map) {
            total -= i.value
            count++
            if (total <= 0) {
                answer = count
                break
            }
        }
        return answer
    }
}