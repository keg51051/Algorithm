class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        val memory = name.zip(yearning.toList()).toMap()
        var score = 0
        for (i in photo.indices) {
            score = 0
            for (j in photo[i].indices) {
                if (memory.containsKey(photo[i][j])) {
                    score += memory[photo[i][j]]!!
                }
            }
            answer += score
        }
        return answer
    }
}