import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val seq = br.readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n) { 1 }

    for (i in 1..<n) {
        for (j in 0..<i) {
            if (seq[j] < seq[i]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    print(dp.max())

    br.close()
}