class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        var arr = arrayOf(a, b, c, d)
        arr.sort()
        when {
            arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3] -> answer = arr.joinToString("").toInt()
            arr[0] == arr[1] && arr[2] == arr[3] -> answer = (arr[1] + arr[2]) * (arr[2] - arr[1])
            arr[0] == arr[1] && arr[1] == arr[2] -> answer = (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3])
            arr[1] == arr[2] && arr[2] == arr[3] -> answer = (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0])
            arr[0] == arr[1] -> answer = arr[2] * arr[3]
            arr[1] == arr[2] -> answer = arr[0] * arr[3]
            arr[2] == arr[3] -> answer = arr[0] * arr[1]
            else -> answer = arr[0]
        } 
        return answer
    }
}