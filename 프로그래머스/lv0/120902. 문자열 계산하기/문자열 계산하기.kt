class Solution {
    fun solution(my_string: String): Int {
        var arr = my_string.split(" ")
        var answer: Int = arr[0].toInt()
        
        for (i in 1 until arr.size step 2) {
            if (arr[i] == "+") {
                answer += arr[i+1].toInt()
            } else {
                answer -= arr[i+1].toInt()
            }
        }
        
        return answer
    }
}