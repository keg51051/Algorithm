import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (S, E, Q) = br.readLine().split(" ")
    val (sh, sm) = S.split(":").map { it.toInt() }
    val (eh, em) = E.split(":").map { it.toInt() }
    val (qh, qm) = Q.split(":").map { it.toInt() }
    val startTime = InMinutes(sh, sm)
    val endTime = InMinutes(eh, em)
    val quitTime = InMinutes(qh, qm)
    val first = mutableSetOf<String>()
    val second = mutableSetOf<String>()
    var check = 0

    while (true) {
        val input = br.readLine()
        if (input == null || input.isEmpty()) break
        val (time, name) = input.split(" ")
        val (th, tm) = time.split(":").map { it.toInt() }
        val t = InMinutes(th, tm)

        if (t <= startTime) {
            first.add(name)
        }

        if (t in endTime..quitTime) {
            second.add(name)
        }
    }

    for (i in first) {
        if (second.contains(i)) check += 1
    }

    print(check)

    br.close()
}

fun InMinutes(h: Int, m: Int): Int {
    return h * 60 + m
}