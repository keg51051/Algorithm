class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        var arr = intArrayOf()
        for(i in 0 until my_string.length) {
            var x = my_string[i]
            if (x in '0'..'9') {
                answer += Character.getNumericValue(x)
            }
        }
        
        return answer
    }
}