import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val grid = Array(n) { CharArray(n) }
    var visited = Array(n) { BooleanArray(n) }
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)

    repeat(n) {
        val l = br.readLine().toCharArray()
        grid[it] = l
    }

    var section = 0

    fun dfs(x: Int, y: Int) {
        visited[x][y] = true

        for (d in 0..<4) {
            val nx = x + dx[d]
            val ny = y + dy[d]

            if (nx in 0..<n && ny in 0..<n && grid[nx][ny] == grid[x][y] && !visited[nx][ny]) {
                dfs(nx, ny)
            }
        }
    }


    for (i in 0..<n) {
        for (j in 0..<n) {
            if (!visited[i][j]) {
                dfs(i, j)
                section += 1
            }
            // make the grid color blindness R => G or G => R
            if (grid[i][j] == 'R') grid[i][j] = 'G'
        }
    }

    print("$section ") // color blindness X

    // reset
    section = 0
    visited = Array(n) { BooleanArray(n) }

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (!visited[i][j]) {
                dfs(i, j)
                section += 1
            }
        }
    }

    print(section) // color blindness O

}