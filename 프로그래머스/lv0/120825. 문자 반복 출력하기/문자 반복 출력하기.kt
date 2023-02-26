class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer = ""
        var arr = ArrayList<Char>()
        for (i in 0 until my_string.length) {
            for (j in 0 until n) {
                arr.add(my_string[i])
            }
        }
        answer = arr.joinToString(separator="")
        return answer
    }
}