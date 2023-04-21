class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list
        val s = num_list.size-1
        if (num_list[s] > num_list[s-1]) {
            answer += num_list[s] - num_list[s-1]
        } else {
            answer += num_list[s] * 2
        }
        return answer
    }
}