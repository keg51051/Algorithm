import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sugar = br.readLine().toInt()
    var count = 0

    while (true) {
        if (sugar % 5 == 0) {
            count += sugar / 5
            println(count)
            return
        }

        if (sugar <= 0) {
            return println(-1)
        }

        sugar -= 3
        count++
    }
}