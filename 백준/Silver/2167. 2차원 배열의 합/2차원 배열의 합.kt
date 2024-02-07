import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    // 자연수 입력을 위한 n+1 * m+1 배열
    val arr = Array(n + 1) { IntArray(m + 1) }
    val dp = Array(n + 1) { IntArray(m + 1) }

    for (i in 1..n) {
        val l = br.readLine().split(" ").map { it.toInt() }
        for (j in 1..m) {
            arr[i][j] = l[j - 1]
        }
    }

    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = dp[i][j - 1] + dp[i - 1][j] + arr[i][j] - dp[i - 1][j - 1]
        }
    }

    repeat(br.readLine().toInt()) {
        val (i, j, x, y) = br.readLine().split(" ").map { it.toInt() }

        println(dp[x][y] - dp[x][j - 1] - dp[i - 1][y] + dp[i - 1][j - 1])
    }
}