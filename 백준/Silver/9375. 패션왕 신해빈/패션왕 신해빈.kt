import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val tc = br.readLine().toInt()

    repeat(tc) {
        val map = mutableMapOf<String, Int>()
        val clothes = br.readLine().toInt()

        repeat(clothes) {
            val (name, cat) = br.readLine().split(" ")

            if (map.containsKey(cat)) {
                map[cat] = map[cat]!! + 1
            } else {
                map[cat] = 1
            }
        }

        var result = 1

        for (i in map) {
            result *= (i.value + 1)
        }

        println(result-1)
    }
}