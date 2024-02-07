import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val cities = br.readLine().split(" ").map { it.toInt() }
    val prices = Array(n - 1) { LongArray(3) }
    val trip = IntArray(n-1)
    var total: Long = 0

    repeat(n - 1) {
        prices[it] = br.readLine().split(" ").map { p -> p.toLong() }.toLongArray()
    }

    // count how many trips
    for (i in 0..<m-1) {
        val start = minOf(cities[i], cities[i + 1])
        val end = maxOf(cities[i], cities[i + 1])

        for (j in start ..< end) {
            trip[j - 1] += 1
        }
    }

    // compare (ticket * count), (card + ic * count)
    for (i in trip.indices) {
        total += minOf(prices[i][0] * trip[i].toLong(),
            prices[i][2] + prices[i][1] * trip[i].toLong())
    }

    print(total)

}