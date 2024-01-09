import java.io.BufferedReader
import java.io.InputStreamReader

var max = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine().toInt()
    val energies = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    getMax(energies, 0)

    print(max)

    br.close()
}

fun getMax(e: MutableList<Int>, energy: Int) {
    if (e.size == 2) {
        max = maxOf(max, energy)
        return
    }

    for (i in 1..e.size-2) {
        val num = e[i]
        val value = e[i-1] * e[i+1]

        e.removeAt(i)
        getMax(e, energy + value)
        e.add(i, num)
    }
}