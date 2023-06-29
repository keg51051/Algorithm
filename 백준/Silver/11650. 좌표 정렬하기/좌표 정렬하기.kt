import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums = List(br.readLine().toInt()) { br.readLine().split(" ")
        .let { Pair(it[0].toInt(), it[1].toInt()) }}
        .sortedWith(compareBy({ it.first }, { it.second }))

    for (i in nums) {
        println(i.first.toString() + " " + i.second.toString())
    }
}