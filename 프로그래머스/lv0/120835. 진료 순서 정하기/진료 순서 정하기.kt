class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer = intArrayOf()
        var arr = emergency.copyOf()
        arr.sortDescending()
        for (i in 0 until emergency.size) {
            answer += arr.indexOf(emergency[i]) + 1
        }
        return answer
    }
}