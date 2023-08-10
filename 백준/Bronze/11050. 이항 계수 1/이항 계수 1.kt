import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    bw.write(binomial(n, k).toString())

    br.close()
    bw.close()
}

fun binomial(n: Int, k: Int): Int {
    val dp = Array(n + 1) {0}
    dp[0] = 1

    for (i in 1..n) {
        for (j in minOf(i, k) downTo 1) {
            dp[j] = dp[j] + dp[j - 1]
        }
    }
    return dp[k]
}