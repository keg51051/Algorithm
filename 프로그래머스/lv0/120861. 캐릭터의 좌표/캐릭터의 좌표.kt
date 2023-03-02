class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer = IntArray(2)
        val maxX = board[0] / 2
        val maxY = board[1] / 2
        
        for (i in 0 until keyinput.size) {
            when (keyinput[i]) {
                "up" ->  {
                    if (answer[1] >= maxY) continue
                    answer[1] += 1
                }
                "down" -> {
                    if (answer[1] <= -maxY) continue
                    answer[1] -= 1
                }
                "left" -> {
                    if (answer[0] <= -maxX) continue
                    answer[0] -= 1
                }
                "right" -> {
                    if (answer[0] >= maxX) continue
                    answer[0] += 1
                }
            }
        }
        
        return answer
    }
}