import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val cities = br.readLine().split(" ").map { it.toInt() }
    val prices = Array(n - 1) { IntArray(3) }
    val trip = mutableMapOf<Int, Int>()
    var total = 0

    repeat(n - 1) {
        prices[it] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0..<cities.size - 1) {
        if (cities[i] < cities[i+1]) {
            for (j in cities[i]..<cities[i+1]) {
                trip[j] = trip.getOrDefault(j, 0) + 1
            }
        } else {
            for (j in cities[i]-1 downTo cities[i+1]) {
                trip[j] = trip.getOrDefault(j, 0) + 1
            }
        }
    }

    for (i in trip) {
        val ticket = prices[i.key - 1][0]
        val ic = prices[i.key - 1][1]
        val card = prices[i.key - 1][2]

        total += if (ticket * i.value < card + ic * i.value) {
            ticket * i.value
        } else {
            card + ic * i.value
        }
    }

    print(total)

}