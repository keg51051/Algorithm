import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    var values = intArrayOf()
    val dp = IntArray(k+1) {0}

    dp[0] = 1

    repeat(n) {
        val v = br.readLine().toInt()
        values += v
    }

    for (i in values) {
        for (j in i..k) {
            dp[j] += dp[j-i]
        }
    }

    print(dp[k])

    br.close()
}