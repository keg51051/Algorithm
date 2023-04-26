class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var a = 0
        for (i in num_list) {
            a = i
            while (a != 1) {
                if (a % 2 != 0) {
                    a = (a - 1) / 2
                    answer++
                } else {
                    a /= 2
                    answer++
                }
            }
        }
        return answer
    }
}