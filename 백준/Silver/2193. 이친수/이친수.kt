import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val dp = LongArray(n+1)

    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i-1] + dp[i-2]
    }

    print(dp[n])
}