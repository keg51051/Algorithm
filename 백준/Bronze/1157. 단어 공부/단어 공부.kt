import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    val map = mutableMapOf<Char, Int>()

    for (i in str) {
        val ch = i.lowercaseChar()
        if (map.containsKey(ch)) {
            map[ch] = map[ch]!! + 1
        } else {
            map[ch] = 1
        }
    }

    val max = map.maxBy { it.value }

    if (map.count { it.value == max.value } >= 2) {
        bw.write("?")
    } else {
        bw.write(max.key.uppercaseChar().toString())
    }

    br.close()
    bw.close()
}