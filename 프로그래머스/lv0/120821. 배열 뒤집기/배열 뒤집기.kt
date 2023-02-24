class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = IntArray(num_list.size)
        for (i in 0 until num_list.size) {
            answer[i] = num_list[num_list.size-(i+1)]
        }
        return answer
    }
}