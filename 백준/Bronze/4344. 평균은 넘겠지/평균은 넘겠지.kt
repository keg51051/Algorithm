import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    repeat(n) {
        val scores = br.readLine().split(" ").map { it.toInt() }.drop(1)
        var total = scores.count { it > scores.average() }
        bw.write(String.format("%.3f", (total / scores.size.toDouble() * 100)) + "%\n")
    }

    br.close()
    bw.close()
}
