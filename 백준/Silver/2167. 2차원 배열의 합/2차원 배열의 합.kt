import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n) { IntArray(m) }
    val dp = Array(n) { IntArray(m) }

    for (i in arr.indices) {
        arr[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0..<n) {
        dp[i][0] = arr[i][0]
        for (j in 1..<m) {
            dp[i][j] = dp[i][j - 1] + arr[i][j]
        }
    }

    repeat(br.readLine().toInt()) {
        val (i, j, x, y) = br.readLine().split(" ").map { it.toInt() }
        var sum = 0

        for (row in i - 1..<x) {
            sum += if (j - 2 >= 0) {
                dp[row][y - 1] - dp[row][j - 2]
            } else {
                dp[row][y - 1]
            }
        }

        println(sum)
    }

}