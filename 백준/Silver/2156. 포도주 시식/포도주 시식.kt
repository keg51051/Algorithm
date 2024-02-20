import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val wine = IntArray(10001)
    val dp = IntArray(10001)

    repeat(n) {
        wine[it + 1] = br.readLine().toInt()
    }

    dp[1] = wine[1]
    dp[2] = wine[1] + wine[2]

    for (i in 3..n) {
        dp[i] = maxOf(dp[i - 3] + wine[i - 1] + wine[i], dp[i - 2] + wine[i])
        dp[i] = maxOf(dp[i - 1], dp[i])
    }

    print(dp[n])
}