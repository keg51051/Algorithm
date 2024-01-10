import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val ppl = Array(n + 1) { IntArray(m + 1) }
    val dp = Array(n + 1) { IntArray(m + 1) }

    for (i in 1..n) {
        val line = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        for (j in 1..m) {
            ppl[i][j] = line[j - 1]
        }
    }

    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + ppl[i][j]
        }
    }
    
    val k = br.readLine().toInt()

    repeat(k) {
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() }

        println(dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1])
    }

    br.close()
}