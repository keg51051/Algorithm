class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        val map1 = X.groupingBy { it }.eachCount()
        val map2 = Y.groupingBy { it }.eachCount()

        val intersectedList = mutableListOf<Char>()
        for ((element, count) in map1) {
            val minCount = minOf(count, map2[element] ?: 0)
            repeat(minCount) {
                intersectedList.add(element)
            }
        }
        
        if (intersectedList.isNullOrEmpty()) {
            answer = "-1"
        } else if (intersectedList.any { it in '1'..'9' }){
            answer = intersectedList.sortedDescending().joinToString("")
        } else {
            answer = "0"
        }
        
        return answer
    }
}