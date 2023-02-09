class Solution {
    var answer: Int = 0
    var visited = BooleanArray(0)
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = BooleanArray(dungeons.size)
        dfs(k, 0, dungeons)
        return answer
    }
    
    fun dfs(k: Int, count: Int, dungeons: Array<IntArray>): Unit {
        if (count > answer) {
            answer = count
        }
        dungeons.forEachIndexed { i, arr ->
            if (arr[0] <= k && visited[i] == false) {
                visited[i] = true
                dfs(k - arr[1], count+1, dungeons)
                visited[i] = false
            }
        }
    }
}