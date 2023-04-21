class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer = strArr
        for (i in answer.indices) {
            if (i % 2 == 0) {
                answer[i] = answer[i].toLowerCase()
            } else {
                answer[i] = answer[i].toUpperCase()
            }
        }
        return answer
    }
}