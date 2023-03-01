class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var arr = s.split(" ")
        for (i in 0 until arr.size) {
            if (arr[i] == "Z") {
                answer -= arr[i-1].toInt()
            } else {
                answer += arr[i].toInt()
            }
        }
        return answer
    }
}