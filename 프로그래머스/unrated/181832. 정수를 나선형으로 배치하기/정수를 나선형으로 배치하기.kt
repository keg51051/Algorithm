class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer = Array(n) { IntArray(n) }
        var value = 1
        var row = 0
        var col = 0
        var dir = 0
        
        while (value <= n*n) {
            answer[row][col] = value++
            if (dir == 0) {
                if (col == n-1 || answer[row][col+1] != 0) {
                    dir = 1
                    row++
                } else {
                    col++
                }
            } else if (dir == 1) {
                if (row == n-1 || answer[row+1][col] != 0) {
                    dir = 2
                    col--
                } else {
                    row++
                }
            } else if (dir == 2) {
                if (col == 0 || answer[row][col-1] != 0) {
                    dir = 3
                    row--
                } else {
                    col--
                }
            } else {
                if (answer[row-1][col] != 0) {
                    dir = 0
                    col++
                } else {
                    row--
                }
                
            }
        }
        return answer
    }
}