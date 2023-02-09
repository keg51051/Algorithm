class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        var answer = 0
        var dist: IntArray = IntArray(N+1, {i -> 10000000})
        dist[1] = 0
        var flag = true
        
        while (flag) {
            flag = false
            for (i in 0..road.size-1) {
                if (dist[road[i][0]] + road[i][2] < dist[road[i][1]]) {
                    flag = true
                    dist[road[i][1]] = dist[road[i][0]] + road[i][2]
                } 
                if (dist[road[i][1]] + road[i][2] < dist[road[i][0]]) {
                    flag = true
                    dist[road[i][0]] = dist[road[i][1]] + road[i][2]
                }
            }
        }

        for (i in dist) {
            if (i <= k) answer++
        }

        return answer
    }
}