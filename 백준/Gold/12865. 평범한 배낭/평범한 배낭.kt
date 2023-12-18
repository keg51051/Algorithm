import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val items = Array(N) { IntArray(2) }
    val dp = IntArray(K+1)

    for (i in 0..<N) {
        val item = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        items[i] = item
    }

    items.forEach {
        for (i in K downTo 0) {
            if (it[0] <= i) {
                dp[i] = maxOf(dp[i], dp[i - it[0]] + it[1])
            }
        }
    }
    
    print(dp.last())

    br.close()
}