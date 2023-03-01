class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer = arrayOf<String>()
        
        for (i in 0 until my_str.length step n) {
            if (my_str.length >= i+n) {
                answer += my_str.substring(i, i+n)
            } else {
                answer += my_str.substring(i)
            }
        }
        
        return answer
    }
}