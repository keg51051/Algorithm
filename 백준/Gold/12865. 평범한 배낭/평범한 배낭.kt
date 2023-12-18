import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val items = Array(N+1) { IntArray(2) }
    val dp = Array(N+1) { IntArray(K+1) }

    for (i in 1..N) {
        val item = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        items[i] = item
    }

    for (i in 1..N) {
        for (j in 1..K) {
            val itemW = items[i][0]
            val itemV = items[i][1]

            if (j >= itemW) {
                dp[i][j] = maxOf(dp[i-1][j-itemW] + itemV, dp[i-1][j])
            } else {
                dp[i][j] = dp[i-1][j]
            }
        }
    }

    print(dp[N][K])

    br.close()
}