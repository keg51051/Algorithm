import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, f) = br.readLine().split(" ").map { it.toInt() }
    var move = 0
    val map = mutableMapOf<Int, MutableList<Int>>()

    repeat(n) {
        val (line, fret) = br.readLine().split(" ").map { it.toInt() }

        if (!map.containsKey(line)) {
            map[line] = mutableListOf(fret)
            move += 1
        } else {
            if (fret > map[line]!!.last()) {
                map[line]?.add(fret)
                move += 1
            } else {
                while (map[line]!!.isNotEmpty() && fret < map[line]!!.last()) {
                    map[line]?.removeLast()
                    move += 1
                }

                if (map[line]!!.isEmpty() || fret > map[line]!!.last()) {
                    map[line]?.add(fret)
                    move += 1
                }
            }
        }
    }

    println(move)

}