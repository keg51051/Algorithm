import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }.sorted()
        if (a == 0 || b == 0 || c == 0) break
        if (a*a + b*b == c*c) bw.write("right\n") else bw.write("wrong\n")
    }

    br.close()
    bw.close()
}