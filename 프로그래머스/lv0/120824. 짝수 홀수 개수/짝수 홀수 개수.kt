class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = IntArray(2)
        for (i in 0 until num_list.size) {
            if (num_list[i] % 2 == 0) {
                answer[0]++
            } else {
                answer[1]++
            }
        }
        return answer
    }
}