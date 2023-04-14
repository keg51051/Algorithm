class Solution {
    val disconnected = mutableListOf<Int>()
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        for (i in 0 until n) disconnected.add(i)
        
        while (disconnected.size > 0) {
            answer++
            dfs(n, computers, disconnected.removeAt(0))
        }
        return answer
    }
    
    fun dfs(n: Int, computers: Array<IntArray>, computer: Int) {
        for (i in 0 until n) {
            if (disconnected.contains(i) && computers[computer][i] == 1) {
                disconnected.remove(i)
                dfs(n, computers, i)
            }
        }
    }
}