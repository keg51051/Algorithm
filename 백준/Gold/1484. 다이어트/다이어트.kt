import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val G = br.readLine().toInt()
    var s = 1
    var e = 1
    val answer = mutableListOf<Int>()

    while (true) {
        if (e * e - s * s == G) {
            answer.add(e)
        }

        if (e - s == 1 && e * e - s * s > G) break

        if (e * e - s * s > G) {
            s += 1
        } else {
            e += 1
        }
    }

    if (answer.isEmpty()) {
        print(-1)
    } else {
        answer.forEach {
            println(it)
        }
    }
}