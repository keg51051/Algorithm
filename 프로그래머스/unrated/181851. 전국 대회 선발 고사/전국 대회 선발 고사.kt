class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var map = mutableMapOf<Int, Int>()
        var list = listOf<Int>()
        for (i in rank.indices) {
            if (attendance[i] == true) {
                map.put(i, rank[i])
            }
        }
        map = map.toList().sortedBy { it.second }.toMap().toMutableMap()
        list = map.keys.toList()
        
        return list[0] * 10000 + list[1] * 100 + list[2]
    }
}