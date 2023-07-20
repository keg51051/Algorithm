import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var line = 1
    var num = 0
    var denom = 0

    while (n > line) {
        n -= line
        line++
    }

    if (line % 2 == 0) {
        denom = line + 1 - n
        num = n
    } else {
        denom = n
        num = line + 1 - n
    }

    bw.write("$num/$denom")

    br.close()
    bw.close()
}