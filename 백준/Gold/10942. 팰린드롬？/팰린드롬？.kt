import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n) { IntArray(n) }

    repeat(n) { dp[it][it] = 1 }

    repeat(n-1) {
        if (list[it] == list[it+1]) {
            dp[it][it+1] = 1
        }
    }

    for (i in 2..<n) {
        for (j in 0..<n-i) {
            if (list[j] == list[i+j] && dp[j+1][i+j-1] == 1) {
                dp[j][i+j] = 1
            }
        }
    }

    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        bw.write(dp[a-1][b-1].toString() + "\n")
    }

    br.close()
    bw.close()
}