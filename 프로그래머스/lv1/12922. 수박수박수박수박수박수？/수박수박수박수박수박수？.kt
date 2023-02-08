class Solution {
    fun solution(n: Int): String {
        var answer = "수박"
        var char = CharArray(n, {'a'})
        for (i in 0 until n) {
           if (i % 2 == 0) {
               char[i] = answer[0]
           } else {
               char[i] = answer[1]
           }
        }
        return char.joinToString("")
    }
}