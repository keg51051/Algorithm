class Solution {
    fun solution(s: String): String {
        var answer: String = ""
        var map = s.groupingBy { it }.eachCount()
        
        for (i in s) {
            if (map.get(i) == 1) {
                answer += i
            }
        }
        
        return answer.split("").sorted().joinToString("")
    }
}