import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val G = br.readLine().toInt()
    var s = 1
    var e = 2
    val answer = mutableListOf<Int>()

    while (s < e) {
        val temp = e * e - s * s

        if (temp == G) {
            answer.add(e)
        }

        if (temp > G) {
            s += 1
        } else {
            e += 1
        }
    }

    if (answer.isEmpty()) print(-1) else answer.forEach { println(it) }
}