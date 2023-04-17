class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        val n = board.size
        var copy = Array(n+2) { IntArray(n+2) }
        
        for (i in copy.indices) {
            for (j in copy.indices) {
                if (i == 0 || j == 0 || i == copy.size - 1 || j == copy[0].size - 1) {
                    copy[i][j] = 1
                } else {
                    if (board[i - 1][j - 1] == 1) {
                        copy[i][j] = 1
                        copy[i - 1][j - 1] = 1
                        copy[i - 1][j] = 1
                        copy[i - 1][j + 1] = 1
                        copy[i][j - 1] = 1
                        copy[i][j + 1] = 1
                        copy[i + 1][j - 1] = 1
                        copy[i + 1][j] = 1
                        copy[i + 1][j + 1] = 1
                    }
                }
            }
        }
        
        for (i in copy.indices) {
            for (j in copy.indices) {
                if (copy[i][j] == 0) answer++
            }
        }
        
        return answer
    }
}