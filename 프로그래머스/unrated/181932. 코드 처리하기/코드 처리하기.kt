class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = 0
        for (i in code.indices) {
            if (i % 2 == 0 && mode == 0 && code[i] != '1') {
                answer += code[i]
            } else if (i % 2 == 1 && mode == 1 && code[i] != '1') {
                answer += code[i]
            } else if (code[i] == '1') {
                if (mode == 0) {
                    mode = 1
                } else {
                    mode = 0
                }
            }
        }
        if (answer.isEmpty()) {
            answer = "EMPTY"
        }
        return answer
    }
}