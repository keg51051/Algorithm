class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(n)
        for (i in computers.indices) {
            if (!visited[i]) {
                dfs(computers, visited, i)
                answer++
            }
        }
        return answer
    }

    private fun dfs(computers: Array<IntArray>, visited: BooleanArray, node: Int) {
        visited[node] = true
        computers[node].forEachIndexed { index, value ->
            if (value == 1 && !visited[index]) {
                dfs(computers, visited, index)
            }
        }
    }
}
