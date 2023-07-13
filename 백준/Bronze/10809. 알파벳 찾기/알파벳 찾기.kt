import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val map = mutableMapOf<Char, Int>()

    for (i in 'a'..'z') {
        if (s.contains(i.toString())) {
            map[i] = s.indexOf(i)
        } else {
            map[i] = -1
        }
    }

    bw.write(map.values.joinToString(" "))

    br.close()
    bw.close()
}