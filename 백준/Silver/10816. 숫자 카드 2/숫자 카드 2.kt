import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, Int>()

    br.readLine()
    val cards = br.readLine().split(" ").map { it.toInt() }
    br.readLine()
    val cardsHave = br.readLine().split(" ").map { it.toInt() }

    for (i in cards) {
        if (map.containsKey(i)) {
            map[i] = map[i]!! + 1
        } else {
            map[i] = 1
        }
    }

    for (j in cardsHave) {
        if (map.containsKey(j)) {
            bw.write(map[j]!!.toString() + " ")
        } else {
            bw.write("0 ")
        }
    }

    br.close()
    bw.close()
}