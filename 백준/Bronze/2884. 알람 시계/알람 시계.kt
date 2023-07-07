import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var ms = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    if (ms[1] < 45) {
        if (ms[0] == 0) {
            ms[0] = 23
            ms[1] += 15
        } else {
            ms[0] -= 1
            ms[1] += 15
        }
    } else {
        ms[1] -= 45
    }

    bw.write(ms.joinToString(" "))

    br.close()
    bw.close()
}