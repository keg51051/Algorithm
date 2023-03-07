class Solution {
    fun solution(array: IntArray) = array
    .groupBy{it}
    .map{it.value.size to it.key}
    .sortedByDescending{it.first}
    .let {
        when {
            it.size > 1 && it[0].first == it[1].first -> -1
            else -> it.first().second
        }
    }
    
}