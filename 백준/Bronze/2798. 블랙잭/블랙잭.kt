import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nm = br.readLine().split(" ").map { it.toInt() }
    var cards = br.readLine().split(" ").map { it.toInt() }
    var answer = 0
    var sum = 0

    for (i in cards.indices) {
        for (j in i+1 until cards.size) {
            for (k in j+1 until cards.size) {
                sum = cards[i] + cards[j] + cards[k]
                if (sum > answer && sum <= nm[1]) answer = sum
            }
        }
    }

    bw.write(answer.toString())

    br.close()
    bw.close()
}