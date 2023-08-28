import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val stair = IntArray(n) {br.readLine().toInt()}
    val dp = IntArray(n) {stair[0]}

    if (n == 2) dp[1] = stair[0] + stair[1]
    if (n > 2) {
        dp[0] = stair[0]
        dp[1] = stair[0] + stair[1]
        dp[2] = (stair[0] + stair[2]).coerceAtLeast(stair[1] + stair[2])
    }

    for (i in 3 until n) {
        dp[i] = maxOf(stair[i] + stair[i-1] + dp[i-3], stair[i] + dp[i-2])
    }

    print(dp[n-1])

    br.close()
    bw.close()
}