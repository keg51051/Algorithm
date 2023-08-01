import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (a,b,v) = br.readLine().split(" ").map { it.toInt() }
    var day = (v - a) / (a - b)

    if ((v-a) % (a-b) == 0) {
        day += 1
    } else {
        day += 2
    }

    print(day)

    br.close()
}