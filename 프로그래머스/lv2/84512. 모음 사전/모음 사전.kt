class Solution {
    fun solution(word: String): Int {
        var answer = 0
        var num = 781
        var char = charArrayOf('A', 'E', 'I', 'O', 'U')
        word.forEach {
            for (i in char.indices) {
                if (char[i] == it) {
                    answer += 1 + i * num
                }
            }
            num = (num - 1) / 5
        }
        return answer
    }
}