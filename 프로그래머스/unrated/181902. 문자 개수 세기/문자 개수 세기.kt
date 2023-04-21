class Solution {
    fun solution(my_string: String): IntArray {
        var answer = IntArray(52)
        var count = 0
        
        for (i in my_string) {
            count = 0
            for (k in 'A'..'Z') {
                if (i == k) {
                    answer[count]++
                }
                count++
            }
            count = 0
            for (k in 'a'..'z') {
                if (i == k) {
                    answer[count+26]++
                }
                count++
            }
        }
        
        return answer
    }
}