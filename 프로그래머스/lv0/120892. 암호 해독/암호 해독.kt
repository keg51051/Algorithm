class Solution {
    fun solution(cipher: String, code: Int): String {
        val answer = StringBuilder()
        for (i in code-1 until cipher.length step code) {
            answer.append(cipher[i])
        }
        return answer.toString()
    }
}