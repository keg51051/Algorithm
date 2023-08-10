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
    val binomial = arrayOf(
        intArrayOf(1),
        intArrayOf(1, 1),
        intArrayOf(1, 2, 1),
        intArrayOf(1, 3, 3, 1),
        intArrayOf(1, 4, 6, 4, 1),
        intArrayOf(1, 5, 10, 10, 5, 1),
        intArrayOf(1, 6, 15, 20, 15, 6, 1),
        intArrayOf(1, 7, 21, 35, 35, 21, 7, 1),
        intArrayOf(1, 8, 28, 56, 70, 56, 28, 8, 1),
        intArrayOf(1, 9, 36, 84, 126, 126, 84, 36, 9, 1),
        intArrayOf(1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1)
    )
    return binomial[n][k]
}