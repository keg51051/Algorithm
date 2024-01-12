import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableListOf<MutableList<Int>>()
    val axis = mutableListOf<MutableList<Int>>()
    val temp = mutableListOf<MutableList<Int>>()

    repeat(n) {
        val line = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        map.add(line)
    }

    val chickenNum = map.flatten().count { it == 2 }

    for (i in map.indices) {
        for (j in map[i].indices) {
            if (map[i][j] == 2) {
                temp.add(mutableListOf(i, j))
            }
        }
    }

    var minDistance = Integer.MAX_VALUE

    fun dfs(start: Int, depth: Int) {
        if (depth == m) {
            var distance = 0

            for (i in map.indices) {
                for (j in map[i].indices) {
                    if (map[i][j] == 1) {
                        var min = Integer.MAX_VALUE
                        for (k in axis) {
                            val x = k[0]
                            val y = k[1]
                            min = minOf(min, abs(x - i) + abs(y - j))
                        }
                        distance += min
                    }
                }
            }

            minDistance = minOf(minDistance, distance)
            return
        }

        for (i in start..<chickenNum) {
            axis.add(temp[i])
            dfs(i + 1, depth + 1)
            axis.removeLast()
        }
    }

    dfs(0, 0)
    print(minDistance)

    br.close()
}