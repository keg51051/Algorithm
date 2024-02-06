import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (m, n) = br.readLine().split(" ").map { it.toInt() }
    val figure = Array(m) { IntArray(n) }
    val visited = Array(m) { BooleanArray(n) }

    repeat(m) {
        val l = br.readLine().map { digit -> digit.toString().toInt() }.toIntArray()
        figure[it] = l
    }

    fun dfs(x: Int, y: Int) {
        val dx = intArrayOf(0, 0, 1, -1)
        val dy = intArrayOf(1, -1, 0, 0)

        visited[x][y] = true

        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (nx in 0..<m && ny in 0..<n
                && !visited[nx][ny] && figure[nx][ny] == 0) {
                dfs(nx, ny)
            }
        }
    }

    for (i in 0..<n) {
        if (figure[0][i] == 0) {
            dfs(0, i)
        }
    }

    if (visited[m - 1].contains(true)) print("YES") else print("NO")

}