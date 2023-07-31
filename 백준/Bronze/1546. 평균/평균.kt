import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine().toInt()
    val scores = br.readLine().split(" ").map { it.toDouble() }
    val max = scores.max()

    bw.write(scores.map { it / max * 100 }.average().toString())

    br.close()
    bw.close()
}