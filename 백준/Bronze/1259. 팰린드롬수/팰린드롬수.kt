import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val s = br.readLine()
        if (s.equals("0")) break
        if (s.equals(s.reversed())) bw.write("yes\n") else bw.write("no\n")
    }

    br.close()
    bw.close()
}