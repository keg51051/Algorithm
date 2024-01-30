import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(n) { IntArray(m) }
    val visited = Array(n) { BooleanArray(m) }
    var answer = Integer.MIN_VALUE

    for (i in 0..<n) {
        val line = br.readLine().split(" ").map { it.toInt() }
        for (j in 0..<m) {
            board[i][j] = line[j]
        }
    }

    fun canAdd(x: Int, y: Int, visited: Array<BooleanArray>): Boolean {
        val dx = arrayOf(1, -1, 0, 0)
        val dy = arrayOf(0, 0, 1, -1)

        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (nx in 0..<n && ny in 0..<m && visited[nx][ny]) return false
        }

        return true
    }

    fun dfs(depth: Int, n: Int, m: Int, k: Int, idx: Int) {
        if (depth == k) {
            var sum = 0
            for (i in 0..<n) {
                for (j in 0..<m) {
                    if (visited[i][j]) {
                        sum += board[i][j]
                    }
                }
            }

            answer = maxOf(answer, sum)
            return
        }

        for (i in idx..<n * m) {
            val x = i / m
            val y = i % m
            if (canAdd(x, y, visited)) {
                visited[x][y] = true
                dfs(depth + 1, n, m, k, i + 1)
                visited[x][y] = false
            }
        }
    }

    dfs(0, n, m, k, 0)

    print(answer)

}